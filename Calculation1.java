import java.util.Scanner;
class Calculation1
{
 public static int sum(int a,int b,int c)
 {
   int d=a+b+c;
   return(d);
 }
   public static int average(int a,int b,int c)
  {
   int d=(a+b+c)/3;
   return(d);
  }
  
  public static void main(String args[])
  {
   int a,b,c;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter value of a");
   a=sc.nextInt();
   
   System.out.println("Enter value of b");
   b=sc.nextInt();
   
   System.out.println("Enter value of c");
   c=sc.nextInt();
   
   System.out.println("Total="+Calculation.sum(a,b,c));
   
    System.out.println("Average="+Calculation.average(a,b,c));
 }
 }

   
   
   