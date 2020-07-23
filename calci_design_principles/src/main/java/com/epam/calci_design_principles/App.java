package com.epam.calci_design_principles;
import java.util.Scanner;

public class App 
{
	
	public static void display(int result) {
		System.out.println(result);
	}
	public static int add(int p,int q) {
		return p+q;
	}
	public static int subtract(int p,int q) {
		return p-q;
	}
	public static int multiply(int p,int q) {
		return p*q;
	}
	public static int division(int p,int q) {
		return p/q;
	}
	public static int modulo(int p,int q) {
		return p%q;
	}
	public static void operation(char operand,int x,int y) {
		int ans=0;
		int flag=1;
		if(operand=='+') {
			ans=add(x,y);
					}
		else if(operand=='-') {
			ans=subtract(x,y);
		}
		else if(operand=='*') {
			ans=multiply(x,y);
		}
		else if(operand=='/') {
			if(y!=0) {
				ans=division(x,y);
			}
			else {
				System.out.println("Operation is not possible with divisor 0");
				flag=0;
			}
		}
		else if(operand=='%') {
			if(y!=0) {
			ans=modulo(x,y);
			}
			else {
				System.out.println("Operation is not possible with divisor 0");
				flag=0;
			}
			
		}
		else {
			flag=0;
			System.out.println("Please enter arithmetic operand");
		}
		if(flag==1) {
			display(ans);
		}
		
	}
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
		System.out.println("enter operands");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter arithmetic operand");
		char operand=(sc.next()).charAt(0);
		operation(operand,a,b);
    }
}
