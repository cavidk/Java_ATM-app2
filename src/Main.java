
public class Main {
  
    public static void main(String[] args){
       
        //Login Classi - Kullanici girisini kontrol edicek
         
        //Hesap Classi - Hesap islemlerini yapacak.
        
        //ATM ise ammizi calisdiracak..
        
        
        
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Cavid Kazimzada","12345",2000);
        
        
        
        
        atm.calis(hesap);
        System.out.println("Programdan cikiliyor..");
        
    }
    
}
