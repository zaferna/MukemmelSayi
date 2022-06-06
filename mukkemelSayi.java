import java.util.Scanner;

public class mukkemelSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n,i,sum;
        sum=0;
        System.out.print("Bir Sayi Giriniz :");
        n= inp.nextInt();

        for(i=1;i<n;i++) {

            if (n % i == 0) {

                sum += i;

            }
        }
        if(sum==n){
            System.out.print(n+"  mukemmel Sayidir.....");
        }else{
            System.out.print(n+"  mukemmel Sayi Degildir...");
        }

    }
}
