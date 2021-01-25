import calculator.*;
import java.util.*;
class Demo
{
   public static void main(String[] args)
   {
       System.out.println("enter the operation ");
       System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide ");
       Scanner sc = new Scanner(System.in);
       int op = sc.nextInt();

       switch(op)
       {
          case 1:
          Add obj1 = new Add();
          System.out.println("your answer is "+obj1.add(100,200));
          break;

          case 2:
          Subtract obj2 = new Subtract();
          System.out.println("your answer is "+obj2.subtract(100,200));
          break;

          case 3: 
          Multiply obj3 = new Multiply();
          System.out.println("your answer is "+obj3.multiply(100,200));
          break;

          case 4:
          Divide obj4 = new Divide();
          System.out.println("your answer is "+obj4.divide(200,100));
          break;

          default:
          System.out.println("invalid option inserted");
       }
   }
}