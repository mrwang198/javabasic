package test;
/**
 * 
 * java��������
 * 1.�����������ͣ�
 * ��ֵ�ͣ�
 * 1.�����ͣ�byte, short , int , long ��
 * 2.������(float,double)
 * �ַ���(char)
 * ������(boolean)
 * 2.������������
 * ��(class)        �ַ���		
 * �ӿ�(interface)
 * ����(array)
 * ---������λ��
 * -- ��Ա����
 * ---�ֲ�����
 * 
 * */
public class bianliangdeleixing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //���� byte 1 �ֽ�(-128,127 , ��Χ)    short 2�ֽ�     int  4���ֽ�      long 8�ֽ�
		//����long�͵ı��������Դ�д��L��l��β
		 byte xiaoai = 12;
		  
		 byte  xiaoao1 = 12;
		 short xiaoai1 = 12;
		 short xiaoaiu = 12;
		 long  dhe = 127782199890L;
		  
		 //������ float 4���ֽ�(����ʾ��С��������֣�������Ҫ����һ��F/f)��������ʾ�ķ�Χ��ʵ�Ǳ�long���                                           double 8���ֽ�
		  //ͨ�����帡���͵�ʱ��Ĭ����double����
		 float lixu  = 12.21f;
		 double lix  = 121.21;
		  
		  //����������һ�������͵ı���ͨ����double
		 
		 //�ַ���
		 
		 //�ڶ���ʱ��ͨ����һ��' '�������ţ����ڲ�ֻ�ܴ��һ���ַ� char 1���ַ�
		 char xin  = 'q';
		 char xing = '6';
		 char djie = '��';
		 //��ʾ��ʽ
		 //1.����һ���ַ� 2.ת���ַ�(����ɶ��) 3.unicodeֵ����ʾһ���ַ��͵ĳ���
		 char  ji = '\n';
		 char jiq  = '\t';
		 char cs = '\u0043'; //unicode��
		 System.out.println(cs);
		 System.out.println("��� ����˧��");
		 //boolean ����  ֻ��ȥ����ֵ֮һ
		 boolean  jj = true;
		 boolean ss = true;
		 boolean isMarried = false;
		 if(isMarried) {
			 System.out.println("���ܲμӵ���party");
		 }
		 System.out.println("������");
	}

}
