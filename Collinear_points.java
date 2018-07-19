//Author : Rohit Goswmai lynus.mascot@gmail.com

import java.util.*;

class Main {
  public static void main(String[] args) {
   int x1,x2,x3,y1,y2,y3;
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter x1 and y1");
   x1=sc.nextInt();
   
   y1=sc.nextInt();
   System.out.println();

   System.out.println("Enter x2 and y2");
   x2=sc.nextInt();
   
   y2=sc.nextInt();
   System.out.println();

   System.out.println("Enter x3 and y3");
   x3=sc.nextInt();
   
   y3=sc.nextInt();
   System.out.println();
  
  int check= (x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
  if(check==0) System.out.println("Collinear points");
  else System.out.println("Non Collinear");

  }
}
