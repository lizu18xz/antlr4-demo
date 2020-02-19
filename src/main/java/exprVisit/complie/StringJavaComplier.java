package exprVisit.complie;


import javax.tools.*;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

/**
 * @author dalizu on 2020/2/19.
 * @version v1.0
 * @desc
 */
public class StringJavaComplier {


    private static WeakReference<StringJavaComplier> mWeakReference = new WeakReference<>(new StringJavaComplier());

    public static Object engine(String methodStr) {
        StringJavaComplier eval = mWeakReference.get();

        String method = "functionMethod";

        StringBuilder sb=new StringBuilder();

        sb.append("public static Object "+method+"(){");

        sb.append("  return "+ methodStr);
        sb.append(";}\n");

        System.out.println(sb.toString());

        Object result=eval.run(method,sb.toString());
        System.out.println(result);
        return result;
    }



    private Object run(String method,String codes){

        String className = "exprVisit.compile.RuleEngine";
        StringBuilder sb = new StringBuilder();
        sb.append("package exprVisit.compile;");
        sb.append("import exprVisit.api.MyApi;\n");
        sb.append("\n public class RuleEngine{\n ");
        sb.append(codes);
        sb.append("\n}");

        Class<?> clazz = compile(className, sb.toString());
        try {
            // 生成对象
            Object obj = clazz.newInstance();
            /*Class<? extends Object> cls = obj.getClass();
            Method m = clazz.getMethod(method,String[].class);
            Object invoke = m.invoke(obj, new Object[] { new String[] {} });*/

            Method m = clazz.getMethod(method);
            Object invoke = m.invoke(obj);

            return invoke;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


    /**
     * 装载字符串成为java可执行文件
     * @param className className
     * @param javaCodes javaCodes
     * @return Class
     */
    private  Class<?> compile(String className, String javaCodes) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        StrSrcJavaObject srcObject = new StrSrcJavaObject(className, javaCodes);
        Iterable<? extends JavaFileObject> fileObjects = Arrays.asList(srcObject);
        String flag = "-d";
        String outDir = "";
        try {
            File classPath = new File(Thread.currentThread().getContextClassLoader().getResource("").toURI());
            outDir = classPath.getAbsolutePath() + File.separator;
        } catch (URISyntaxException e1) {
            e1.printStackTrace();
        }
        Iterable<String> options = Arrays.asList(flag, outDir);
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, options, null, fileObjects);
        boolean result = task.call();
        if (result == true) {
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    private static class StrSrcJavaObject extends SimpleJavaFileObject {
        private String content;
        StrSrcJavaObject(String name, String content) {
            super(URI.create("string:///" + name.replace('.', '/') + Kind.SOURCE.extension), Kind.SOURCE);
            this.content = content;
        }
        public CharSequence getCharContent(boolean ignoreEncodingErrors) {
            return content;
        }
    }



    public static void main(String[] args) {
        engine("");
    }

}
