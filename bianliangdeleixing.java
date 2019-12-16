package test;
/**
 * 
 * java数据类型
 * 1.基本数据类型：
 * 数值型：
 * 1.整数型（byte, short , int , long ）
 * 2.浮点型(float,double)
 * 字符型(char)
 * 布尔型(boolean)
 * 2.引用数据类型
 * 类(class)        字符串		
 * 接口(interface)
 * 数组(array)
 * ---变量的位置
 * -- 成员变量
 * ---局部变量
 * 
 * */
public class bianliangdeleixing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //整形 byte 1 字节(-128,127 , 范围)    short 2字节     int  4个字节      long 8字节
		//声明long型的变量必须以大写的L或l结尾
		 byte xiaoai = 12;
		  
		 byte  xiaoao1 = 12;
		 short xiaoai1 = 12;
		 short xiaoaiu = 12;
		 long  dhe = 127782199890L;
		  
		 //浮点型 float 4个字节(，表示带小数点的数字，后面需要加上一个F/f)但是他表示的范围其实是比long大的                                           double 8个字节
		  //通常定义浮点型的时候默认是double类型
		 float lixu  = 12.21f;
		 double lix  = 121.21;
		  
		  //在声明定义一个浮点型的变量通常是double
		 
		 //字符型
		 
		 //在定义时，通常是一堆' '（单引号），内部只能存放一个字符 char 1个字符
		 char xin  = 'q';
		 char xing = '6';
		 char djie = '王';
		 //表示方式
		 //1.声明一个字符 2.转义字符(换行啥的) 3.unicode值来表示一个字符型的常量
		 char  ji = '\n';
		 char jiq  = '\t';
		 char cs = '\u0043'; //unicode码
		 System.out.println(cs);
		 System.out.println("你好 王大帅比");
		 //boolean 类型  只能去两个值之一
		 boolean  jj = true;
		 boolean ss = true;
		 boolean isMarried = false;
		 if(isMarried) {
			 System.out.println("不能参加诞生party");
		 }
		 System.out.println("黑起来");
	}

}
