
public class recursionDriver
{
 
 public static int countNumbs(int n)
 {
     if (n<1)
     {
        return 0;
     }
     return 10+countNumbs(n-1);
 }
 public static int count(int n)
    {
        // Base case AKA Stop Condition
         if (n==0)
             return 0; 

 
         return 20+count(n-1); 
    } 
 public static void main(String[] args)
 {
  System.out.println("***task 3***");
     int counted=0;
  counted = countNumbs(10);
  System.out.println(counted);
  
  System.out.println("***task 2***");
  int counted=0; 
     counted = count(12);
     System.out.println(counted);
 }
 
 
 
}

 /*
 * Count 
 * 1. Number of legs 10 elephant have
 * 2. Number of students in a school if each
 * class has 20 students and there are 12 rooms
 * 3. Number of fingers if there are 8 people
 * 4. Find the sum of odd numbers from 0 to N
 * 5. Find the sum of even numbers from 0 to N
*/ 