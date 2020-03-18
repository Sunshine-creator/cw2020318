import java.lang.reflect.Field;
import java.util.Scanner;

public class My {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//    String str1 = new String("hello");
//    String str2 = new String("hello");
//    System.out.println((str1 ==str2);
//      String str1 = "hello";
//      String str2 = "hello";
////      System.out.println(str1.equals(str2));
//        String str1 = new String("hello");
//        String str2 = "hello";
//        System.out.println(str1 == str2);
//        String str3 = new String("hello").intern();
//        System.out.println(str2==str3);
//        String str ="Hello";
//        Field vaulefield = String.class.getDeclaredField("vaule");
//        vaulefield.setAccessible(true);
//        char[] vaule =(char[]) vaulefield.get(str);
//        vaule[0] ='h';
//        System.out.println(str)；
//          char[] data = str.toCharArray();
//        for (int i = 0; i <str.length() ; i++) {
//            System.out.println(data[i]+ "");     //字符串转数组
//        }
//        System.out.println(new String(data));
//        byte[] data1 =str.getBytes();
//        for (int i = 0; i <str.length() ; i++) {
//            System.out.println(data1[i]+"");
//        }//字符串转字节数组
//        System.out.println(new String(data1));
//        String str = "hello world";
//        String str1 = "Hello world";
//        System.out.println(str1.equals(str));
//        System.out.println(str1.equalsIgnoreCase(str));
//        String str3 ="hello china";
//        System.out.println(str3.contains("china"));//字符串常用操作
//        String str ="@@@wuhan come on ***";
//        System.out.println(str.startsWith("@@@"));
//        System.out.println(str.startsWith("wuhan",3));
//        System.out.println(str.endsWith("***"));
//          String str ="hello world china come on";
//        System.out.println(str.replace("o","e"));
//        System.out.println(str.replaceAll("l","*"));
//        System.out.println(str.replaceFirst("l","*"));
//          System.out.println(str.indexOf("l"));
//          System.out.println(str.indexOf("l",5));
//          System.out.println(str.lastIndexOf("l"));
//           String result[] = str.split("");
//           for(String s: result){
//               System.out.println(s);
//           }
//        String str ="192.168.1.1";
//        String [] result=str.split("\\.");
//        for(String s :result){     //字符串分割
//            System.out.println(s);
//        }
//          String str =  "name=zhangyang&age=18";
//          String [] result = str.split("&");
//        for (int i = 0; i < result.length; i++) {
//            String [] temp = result[i].split("=");
//            System.out.println(temp[0]+"="+temp[1]);
//        }
//        String str ="chinacomeon";
//        System.out.println(str.substring(5));
//        System.out.println(str.substring(0,5));   字符串截取
//           String str = " hello world ";
//           System.out.println("["+str+"]");
////           System.out.println("["+str.trim()+"]");
//        System.out.println("请输入奴婢要转换的字符串：");
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        System.out.println(firstUpper(str));
        StringBuffer stringBuffer = new StringBuffer("helloworld");
        System.out.println(stringBuffer.delete(5,10).insert(0,"你好"));
//        stringBuffer.append("Hello").append("World");
//        fun(stringBuffer);
//        System.out.println(stringBuffer);
    }
//    public static void fun(StringBuffer temp){
//        temp.append("\n").append("www.google.com");
//    }
//    public static  String firstUpper(String str){
//        if("".equals(str) ||str == null){
//            return  str;                                   //首字母大写
//        }
//        if(str.length()>1){
//            return str.substring(0,1).toUpperCase()+ str.substring(1);
//        }
//        return  str.toUpperCase();
//    }
}
