import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            int n,r;
            Scanner scn=new Scanner(System.in);

            //n
            System.out.println("Kaçın kombinasyonu(n): ");
            n=scn.nextInt();

            //r
            System.out.println("Kaçlı kombinasyonu(r): ");
            r=scn.nextInt();

            int totalN=1,totalR=1,totalNR=1;

            for (int i=1; i<=n;i++){
                totalN=totalN*i;
            }

            for (int i=1; i<=r;i++){
                totalR=totalR*i;
            }

            for (int i=1; i<=(n-r);i++){
                totalNR=totalNR*i;
            }

            int kombinasyon=totalN/(totalR*totalNR);

            System.out.println(n+"'in "+r+"'li kombinasyonu: "+kombinasyon);

        }

}
