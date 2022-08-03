import java.util.Scanner;

public class Wraps extends Main
{
    public int getter()

        {
            while (true)
            {
                if (type == 1 || type == 2 || type == 3 || type == 4)
                {
                    break;
                }

                else
                {
                    System.out.println("invalid input enter again");
                    System.out.println("1. computer \n2. phones\n3. laptop\n4. tablet\nyour input:");
                    input.reset();
                    type = input.nextInt();
                }
            }
        return type;
    }
}
