package test;
/**
 * string 不是基本数据类型，属于引用数据类型
 * 在声明变量的时候，使用的是一对" "
 * string 可以和8种基本数据类型做运算，且只能是连接,结果数据类型只能是String。
 * */
public class string_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1  ="hdeuhu";
        String d2 = "";
        String de = "我是大帅比";
        int number  = 1901;
         String df = de +number;		
         System.out.println(df);
       System.out.println(s1);
       //***********************
       char c= 'a';
       int num = 178;
       String str = "jjdiejijio";
       System.out.println("****  ***");
       System.out.println( '*' + '\t' + '8');
       System.out.println("****  ***");
       System.out.println("****  ***");
 // ******************
        String str2 = 89 +"" ;
        int num3 = Integer.parseInt(str2);
        System.out.println(num3);
        
	}

}
