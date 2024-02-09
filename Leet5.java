import java.util.Scanner;
class Leet5
{
  int a[]=new int[6];
  int t;
  void findTarget()
  {
    int i,flag=0;
    System.out.print("[");
    for(i=0;i<6;i++)
    { if(t==a[i])
      { System.out.print(+i+" ");
        flag=1;
      }
    }
    if(flag==0)
     System.out.print("-1,-1");
    System.out.print("]");
  }
  
  public static void main(String x[])
  { Leet5 l= new Leet5();
   Scanner scan= new Scanner(System.in);
   System.out.println("Enter value in array");
   for(int i=0;i<6;i++)
    l.a[i]=scan.nextInt();
   System.out.println("Enter value for target");
   l.t=scan.nextInt();
   l.findTarget();
  }
}