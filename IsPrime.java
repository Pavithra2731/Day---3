package week1day3;

public class IsPrime {
    public static void main(String[] args) {
        int input =10;
        boolean IsPrime = true;

        for  (int i=2; i<input ; i++)
        {
            if (input % i == 0) 
            {
                IsPrime = false;
            }
        }
         if (IsPrime)
            {
                System.out.println("The Given Number is a Prime number");
            }
        else
            {  
                System.out.println("The Given number is NOT a Prime number"); 
            }
    }
            

    }


