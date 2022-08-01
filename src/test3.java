import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        int year;
        System.out.print("Dogum Yilinizi Giriniz : ");
        year = inp.nextInt();
        switch (year%12){
            case 0:
                System.out.print("Burcunuz: Maymun");
                break;
            case 1:
                System.out.print("Burcunuz: Horoz");
                break;
            case 2:
                System.out.print("Burcunuz: Kopek");
                break;
            case 3:
                System.out.print("Burcunuz: Domuz");
                break;
            case 4:
                System.out.print("Burcunuz: Fare");
                break;
            case 5:
                System.out.print("Burcunuz: Okuz");
                break;
            case 6:
                System.out.print("Burcunuz: Kaplan");
                break;
            case 7:
                System.out.print("Burcunuz: Tavsan");
                break;
            case 8:
                System.out.print("Burcunuz: Ejderha");
                break;
            case 9:
                System.out.print("Burcunuz: Yilan");
                break;
            case 10:
                System.out.print("Burcunuz: At");
                break;
            case 11:
                System.out.print("Burcunuz: Koyun");
                break;
            default:
                System.out.print("Gecerli deger giriniz!");

        }
            ;
    }
}




