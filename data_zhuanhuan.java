package test;
/*
 * 基本数据类型转换
 * 
 * 1.自动类型提升，自动类型转换
 * --前提：这里讨论的是7种变量之间的运算，不包含boolean运算
 * 存储范围一次递增 byte-> int-> short-> long-> float-> double
 * btye,short , char -> int -> long-> float->double
 * 当byte,short, char来做运算，结果都为int类型
 *  2.强制类型转换
 *  
 * */

public class data_zhuanhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       byte b1 = 2;
       int b2 = 12;
       int  b3 = b1 + b2;
       float ji = 67.12f;
       double hu = ji;
       System.out.println(hu);
       /***************
        * 
        */
       char c1 = 'a';
       int i1 = 10;
       int i3 = c1 + i1;
       System.out.println(i3);
       char c4 = 'a';
       short  i5 = 10;
 
       System.out.println(c4 + i5);
       double d00 = 10;
        int e3 = 121;
        
	}

}
