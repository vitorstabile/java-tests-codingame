package application;

import java.util.Scanner;

class Program
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        //Game loop.
        while (true)
        {
            int max = 0;
            int maxIndex = -1;
            
            for (int i = 0; i < 8; i++)
            {
                //Read inputs.
                int mountainH = scanner.nextInt();
                
                //Set highest mountain.
                if (mountainH > max)
                {
                    max = mountainH;
                    maxIndex = i;
                }
            }

            //Output highest mountain.
            System.out.println(maxIndex);
            
        }
    }
}
