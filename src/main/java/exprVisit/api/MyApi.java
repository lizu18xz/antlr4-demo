package exprVisit.api;

/**
 * @author dalizu on 2020/2/18.
 * @version v1.0
 * @desc
 */
public class MyApi {

    public static  int sub(int a,int b){

        return a-b;
    }


    public static String ltrim(String str){

        return str.trim();
    }


    public static String substring(String dst, int from, int to){
        return substr(dst,from,to);
    }

    public static String substr(String dst, int from , int...to){
        if(to.length == 0){
            if(from<=0)
                return dst;
            else
                return dst.substring(from-1,dst.length());
        }else{
            to[0] = to[0]+from;
            if(to[0]<=0)
                return "";
            if(from<1)
                from=1;
            return dst.substring(from-1,to[0]-1);
        }

    }


    /**
     * 把字串转化为大写。
     * @param v
     * @return
     */
    public static String upper(String v){
        return v.toUpperCase();
    }


    public static boolean equals(Object a,Object b){

        System.out.println(a+"--"+b);

        return a.equals(b);
    }

    public static String replace(String str,String oldCahr,String newChar){

        return str.replace(oldCahr,newChar);
    }


    public static int length(String str){

        return str.length();
    }




    public static void main(String[] args) {

        System.out.println(MyApi.equals("1","1"));

        System.out.println(MyApi.equals(33,33));

        System.out.println(MyApi.replace("Lizu18XZ","18","28"));
        System.out.println(MyApi.substr("AAAABBBB",4,4));

        System.out.println(4%4);

    }


}
