import java.util.Scanner;

public class simpleReverse {
    public static char[] Reverse(String Letter)
    {
        int i=0,j=Letter.length()-1;
        char[] Result=new char[Letter.length()];
        while (i<=j)
        {
            char temp=Letter.charAt(i);
            Result[i]=Letter.charAt(j);
            Result[j]=temp;
            i++;
            j--;
        }
        return Result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String Letter= scanner.next();
        char[] Output=Reverse(Letter);
        for(int i=0;i<Letter.length();i++)
        {
            System.out.print(Output[i]);
        }
    }
}
