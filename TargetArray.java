import java.util.Scanner;
class TargetArray
{
  int a[]=new int[6];
  int t;
  void findTarget()
  {
    int i,flag=0;
    System.out.print("[");
    
    for(i=0;i<6;i++)
    { 
      if(t==a[i])
      { 
        System.out.print(+i+" ");
        flag=1;
      }
    }
    
    if(flag==0)
     System.out.print("-1,-1");
    
    System.out.print("]");
    
  }
  
  public static void main(String x[])
  { 
     TargetArray ta= new TargetArray();
     Scanner scan= new Scanner(System.in);
     
    System.out.println("Enter value in array");
     for(int i=0;i<6;i++)
     ta.a[i]=scan.nextInt();
    
     System.out.println("Enter value for target");
     ta.t=scan.nextInt();
     ta.findTarget();
  }
}
