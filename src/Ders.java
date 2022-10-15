
    import java.util.*;
import java.lang.*;

    class Ders{
        public static void main(String[] args) {
            int mat,fizik,kimya,turkce,muzik;

            System.out.println("Matematik notunu giriniz");
            mat=notGir();
            System.out.println("fizik notunu giriniz");
            fizik=notGir();
            System.out.println("kimya notunu giriniz");
            kimya=notGir();
            System.out.println("turkce notunu giriniz");
            turkce=notGir();
            System.out.println("Muzik notunu giriniz");
            muzik=notGir();
            int ortalama=(mat+fizik+kimya+turkce+muzik)/5;
            if(ortalama<55){
                System.out.println("BAŞARSIZ "+ortalama);
            }else{
                System.out.println("BAŞARILI "+ortalama);
            }

        }
        public static int notGir(){
            Scanner sc=new Scanner(System.in);
            int not=sc.nextInt();
            if(not>100 || not<0){
                System.out.println("Geçersiz Not tekrar giriniz");
                not=sc.nextInt();
            }
            return not;
        }
    }

