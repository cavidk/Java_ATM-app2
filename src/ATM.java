
import java.util.Scanner;

public class ATM {

public void calis(Hesap hesap){
    Login login = new Login();
    
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Bankamiza hos geldiniz..");
    System.out.println("*********************");
    System.out.println("Kullanici Girisi");
    System.out.println("*********************");
    int giris_hakki = 3;
    
    while(true){
        
        if (login.login(hesap)){
            System.out.println("Giris Basarili..");
            break;
        }
        else{
            System.out.println("Giris Basarisiz..");
            giris_hakki -=1;
            System.out.println("Kalan giris hakki: " + giris_hakki);
        }
        if (giris_hakki == 0){
            System.out.println("Giris hakkiniz bitti");
            return;
        }
    }
    System.out.println("**************************");
    String islemler = "1.Bakiye goruntule\n"
                       +"2.Para Yatirma\n"
                       +"3.Para cekme"
                       +"4.Sistemden click edin cikis icin: Q";
    System.out.println("**************************");
    
    while(true){
        System.out.println("Islemi seciniz: ");
        String islem = scanner.nextLine();
        
        if (islem.equals("Q")){
            System.out.println("Sistemden cikiliyor...Lutfen bekleyin..");
            break;
        }
        else if (islem.equals("1")){
            System.out.println("Bakiyeniz: " + hesap.getBakiye());
        }
        else if (islem.equals("2")){
            System.out.println("Yatiracaginiz para miktari: ");
            int tutar = scanner.nextInt();
            scanner.nextLine();
            hesap.paraYatir(tutar);
        }
        else if(islem.equals("3")){
            System.out.println("Cekeceyiniz para miktarini giriniz: ");
            int miktar = scanner.nextInt();
            scanner.nextLine();
            hesap.paraCek(miktar);
        }else{
            System.out.println("Gecersiz islem: ");
        }
    }
    
    
    
}    
}
