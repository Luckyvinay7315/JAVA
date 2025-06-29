class Addtwomatics
{
 public static void main(String agrs[])
  {
    int A[][]={{2,4},{3,5}};
	int B[][]={{7,6},{8,9}};
	int C[][]=new int[2][2];
	int i,j,k;
     //add two matrix
	
	for(i=0;i<2;i++)
	 {
	   for(j=0;j<2;j++)
	     {
		   for(k=0;k<2;k++)
		   {
			  C[i][j]=C[i][j]+A[i][k]*B[k][j];   
		   }
		 }
     }
	 //end add two matrix
	 System.out.println("\n Matrix A *Matrix B\n");
	 for(i=0;i<2;i++)
	  {
	   for(j=0;j<2;j++)
	    {
		 System.out.print(C[i][j]+" ");
		 }
		 System.out.println("");
	  }	 
	}
}