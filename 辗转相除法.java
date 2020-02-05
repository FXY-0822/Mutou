package jAVA.Math;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Main main=new Main();
		int num1=in.nextInt();
		int num2=in.nextInt();
		int result=	main.gcd(num1,num2);
		System.out.print(result);
	}
public int gcd(int num1,int num2) {
	if(num1%num2==0)
		return num2;
	else
		return	gcd(num2,num1%num2);
	}
}
