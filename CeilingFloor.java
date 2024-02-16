import java.util.*;
class CeilingFloor
{
  public static void main(String x[])
  {
    Scanner scan = new Scanner (System.in);
    int i,j;
    System.out.println("Ente values in Array");
    int a[] = new int [5];
    for(i=0; i<a.length; i++)
      a[i] = scan.nextInt();
    
    for(i=0; i<10; i++)
     {
      for(j=i+1;j<a.length; j++)
      {
        if(a[i]>a[j])
        {
         int temp = a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
     }
     int floor=-1,ceiling=a[0];
     for(i=0;i<10;i++)
     {
      for(j=0;j<a.length;j++)
      {
        if(i<a[0])
          { System.out.println("Number "+i+" : Ceiling = "+ceiling+", Floor = "+floor);
	    break;
          }

	else if(i==a[j])
          { ceiling =a[j];
            floor =a[j];
            System.out.println("Number "+i+" : Ceiling = "+ceiling+", Floor = "+floor);
            break;
          }

        else if(i>a[j] && i<a[j+1] && i!=a[4])
          { ceiling = a[j+1];
            System.out.println("Number "+i+" : Ceiling = "+ceiling+", Floor = "+floor);
            break;
          }

        else if(i==a[4] && a[4]>9)
          { ceiling =a[4];
            System.out.println("Number "+i+" : Ceiling = "+ceiling+", Floor = "+floor);
          }
      }
     }
   }
}
          