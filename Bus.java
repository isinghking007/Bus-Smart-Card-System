package codeforces;
import java.io.*;
import java.util.*;

 
public class Bus {
	
	
	public static int checkArray1(int a[], int n)
	{
		if(n==0||n==1)
			return 1;
		if(a[n-1]<a[n-2])
		{
			return 0;
		}
		return checkArray1(a,n-1);
	}
	public static int reverse(int a[] , int n)
	{
		if(n==0||n==1)
			return 1;
		if(a[n-1]>a[n-2])
		{
			return 1;
		}
		return reverse(a,n-1);
	}
	public static boolean checkDay(String day)
	{
		if(day.equals("SUNDAY")||day.equals("MONDAY")|| day.equals("TUESDAY")
				||day.equals("WEDNESDAY")||day.equals("THRUSDAY")||day.equals("FRIDAY")
				||day.equals("SATURDAY"))
		{
			return true;
		}else
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no. of stops");
		int n=in.nextInt();
		System.out.println("Enter the stops number ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		double res=0;
		System.out.println("Enter your swipe card balance");
			int bal=in.nextInt();
		if(bal>=10)
		{
			System.out.println("Enter the Day ");
			String day=in.next().toUpperCase();
			if(checkDay(day))
			{
				
			
			System.out.println("Enter the time (HH:MM)PM/AM ");
			String str=in.next();
			String[] time=str.split(":");
			int hours=Integer.parseInt(time[0]);
			String[] mins=time[1].split(" ");
			for(int i=0;i<mins.length;i++)
			{
		if(mins[i].equals("AM"))
		{
			res=hours-0.80*n;
		}
		else {
			res=hours-0.60*n;
		}
			}
			if(n>5)
			{
				int stopsafter5=n-5;
				double discount=((stopsafter5)*(res))/100;
				if(day=="SUNDAY" || day=="SATURDAY")
				{
					 discount=((discount)*(res))/100;
				}else {
					discount=discount;
				}
			}
			System.out.println("Your travelling cost is "+res);
			double finalres=Math.min(res, 10);
		System.out.println("Final travelling cost = "+finalres);
		}else {
			System.out.println("Day is not valid");
		}
		}
		else {
			System.out.println("You don't have enough balance . Please recharge");
			
		}
		
		

	}

}
