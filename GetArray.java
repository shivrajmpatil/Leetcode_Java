
import java.util.*;
abstract class ArrAbs
{
  int[] arr1,arr2,rarr;

 void setArray(int a[],int b[])
 {
   this.arr1=a;
   this.arr2=b;
 }
 
 abstract int[] getResultantArray();
}

class InterSection extends ArrAbs
{
  public int[] getResultantArray()
  {
	 int count=0;
	 for(int i=0; i<arr1.length;i++)
	 {
		 for(int j=i+1; j<arr1.length;j++)
		 {
			 if(arr1[i]==arr1[j] && arr1[i]!=-1)
				 arr1[j]=-1;
			 
			 if(arr2[i]==arr2[j] && arr2[i]!=-1)
				 arr2[j]=-1;
		 }
	 }
	 
	 for(int i=0; i<arr1.length;i++)
	 {
		 for(int j=0; j<arr2.length;j++)
		 {
			 if(arr1[i]==arr2[j] && arr1[i]!=-1)
				 count++;
		 }
	 }
	 
	 
    int[] irarr= new int[count];
    int k=0;
    for(int i=0; i<arr1.length;i++)
	 {
		 for(int j=0; j<arr2.length;j++)
		 {
			 if(arr1[i]==arr2[j] && arr1[i]!=-1)
				 {
				  irarr[k]=arr1[i];
				  k++;
				 }
		 }
	 }
    
     return irarr;
  }
}


class Union extends ArrAbs
{
  public int[] getResultantArray()
  { 
	  int count=0;
	  int s = arr1.length+arr2.length;
      int[] temp= new int[s];
     
       for(int i=0; i<arr1.length; i++)
         temp[i]=arr1[i];
       for(int i=0; i<arr2.length; i++)
         temp[i+arr1.length]=arr2[i];
    
       
       for(int i=0; i<temp.length;i++)
       {
    	   for(int j=i+1;j<temp.length;j++)
    	   {
    		   if(temp[i]==temp[j] && temp[i]!=-1)
    			   temp[j]=-1;
    	   }
       }
       
       for(int i=0; i<temp.length;i++)
       {
    	  if(temp[i]!=-1)
    		  count++;
       }
       

       int[] urarr = new int[count];
       int k=0;
       for(int i=0; i<temp.length;i++)
       {
    	   if(temp[i]!=-1)
    	   {
    		   urarr[k]=temp[i];
    		   k++;
    	   }
       }
       
       return urarr;
  }
}

public class GetArray
{
 public static void main(String x[])
 {
	 
  int[] a,b,rarr1,rarr2;
  Scanner scan = new Scanner(System.in);
  a= new int[5];
  b= new int[5];

  System.out.println("Enter values in Array 1");
  for(int i=0; i<a.length; i++)
    a[i]=scan.nextInt();
  
  System.out.println("Enter values in Array 2");
  for(int i=0; i<b.length; i++)
    b[i]=scan.nextInt();

  InterSection is = new InterSection();
  is.setArray(a,b);
  rarr1=is.getResultantArray();
  
  Union u = new Union();
  u.setArray(a,b);
  rarr2=u.getResultantArray();
  
  System.out.println("Intersection Array is =");
  for(int i=0; i<rarr1.length; i++)
    System.out.print(" "+rarr1[i]);
  
  System.out.println();
  System.out.println("Union Array is =");
  for(int i=0; i<rarr2.length; i++)
    System.out.print(" "+rarr2[i]);
 }
}
  
 