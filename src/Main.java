import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("n1 Sayısını girin:");
            int n1 = input.nextInt();
            System.out.print("n2 Sayısını girin:");
            int n2 = input.nextInt();
            int ebob=1, ekok , k=2;

            while ((n1%k==0)&&(n2%k==0)) {

                n1 = n1 / k;
                n2 = n2 / k;
                ebob *= k;

                if ((n1 % k != 0) || (n2 % k != 0)) {
                }
                k++;
            }
            ekok=(n1*n2)/ebob;
            System.out.println("Ebob :" +ebob);
            System.out.println("Ekok :"+ekok);


        }
    }
