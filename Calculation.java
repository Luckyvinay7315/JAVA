import java.util.Scanner;
class Calculation
{
 public 
 int sum(int a,int b,int c)
 {
   int d=a+b+c;
   return(d);
 }
 
 public int average(int a,int b,int c)
 {
	 int d=(a+b+c)/3;
	 return(d);
 }
 
 
 public static void main(String args[])
 {
   Calculation obj=new Calculation();
   int a,b,c;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter value of a");
   a=sc.nextInt();
   
   System.out.println("Enter value of b");
   b=sc.nextInt();
   
   System.out.println("Enter value of c");
   c=sc.nextInt();
   
  int ans= obj.sum(a,b,c);
  System.out.println("Total="+ans);
  
  int ans1=obj.average(a,b,c);
  System.out.println("Average="+ans1);
 }
 }