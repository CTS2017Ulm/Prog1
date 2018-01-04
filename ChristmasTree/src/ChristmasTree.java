import java.util.Scanner;

public class ChristmasTree
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Trunk height? ");
        int trunkHeight = sc.nextInt();
        int branchWidth = 4*trunkHeight+1;
        int spaces = branchWidth/2;
        //crown
        for (int i = 1; i <= branchWidth; i += 2)
        {
            for (int j = 1; j <= spaces; j++)
            {
                System.out.print(" ");
            }
            spaces--;
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
                if (j == i) System.out.println();
            }
        }
        //trunk
        spaces = branchWidth/2;
        for (int i = 1; i <= trunkHeight; i++)
        {
            for (int j = 1; j <= spaces; j++)
            {
                System.out.print(" ");
            }
            System.out.print("*" + "\n");
        }
    }
}
