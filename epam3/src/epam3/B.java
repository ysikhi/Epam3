package epam3;

import java.util.Scanner;

class A
{
float add(float a,float b)
{
return(a+b);
}
float mul(float a,float b)
{
return(a*b);

}
float div(float a,float b)
{
return(a/b);

}
float sub(float a,float b)
{
return(a-b);

}
int add(int a,int b)
{
return(a+b);
}
int sub(int a,int b)
{
return(a-b);

}
int mul(int a,int b)
{
return(a*b);
}
}

public class B 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		A c=new A();
		System.out.println(c.mul(a,b));
		System.out.println(c.add(a,b));
		System.out.println(c.sub(a,b));
		System.out.println(c.div(a,b));
	}
}
