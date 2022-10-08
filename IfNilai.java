import java.util.Scanner;
public class IfNilai
{
    public static void main(String args[])
    {
        int n = 1;
        while (n < 10);
        {
            Scanner masuk = new Scanner(System.in);
            int nil;
            char nil_huruf = 'E';
            System.out.println("Masukkan bilangan: ");
            nil=masuk.nextInt();
            if ((nil>=0) && (nil<=20))
                nil_huruf='E';
            else if ((nil>=20) && (nil<=40))
                nil_huruf='D';
            else if ((nil>=40) && (nil<=60))
                nil_huruf='C';
            else if ((nil>=60) && (nil<=80))
                nil_huruf='B';
            else if ((nil>=80) && (nil<=100))
                nil_huruf='A';
            else
                System.out.println("Salah masukkan nilai");
            }
            System.out.println("Nilai huruf: " + nil_huruf);
    }
}