import java.util.Scanner;

public class main 
{
    public static void main(string args[])
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
        while(t-->0)
        {
            long x= sc.nextLong();
            long n = sc.nextLong();
            long ans =(n% 2==0) ? 0 :x;
            out.append(ans).append("\n");
        }
        System.out.print(out.toString());    }
}
