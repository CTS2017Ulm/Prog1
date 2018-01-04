import java.util.Scanner;

public class GCD
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter x: ");
        int x = sc.nextInt();
        System.out.print("Please enter y: ");
        int y = sc.nextInt();
        System.out.println("The GCD of "+x+" and "+y+" is: "+denominatorIter(x,y));
    }

    public static int denominatorRec(int x, int y)
    {
        if(x>y) return denominatorRec(x-y,y);
        else if(x<y) return denominatorRec(x,y-x);
        else return x;
    }
    public static int denominatorIter(int x, int y)
    {
        while (x!=y)
        {
            if(x>y) x-=y;
            else y-=x;
        }
        return x;
    }

    //research and implement the "better" euklid gcd algorithm, both iterative and recursive
}
