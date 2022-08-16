package AbstractClasslar;

public class MainRunner {
    public static void main(String[] args) {
        
        //AbstractClasslar.Sekil sekil = new AbstractClasslar.Sekil("AbstractClasslar.Sekil");
        Sekil sekil;
        sekil = new Kare("Kare2",6);
        
        sekil.alan_hesapla();
        //sekil.cevre_hesapla();
        
        Kare kare1 = new Kare("Kare1",5);
        Daire daire1 = new Daire("Daire1", 3);
        
        kare1.alan_hesapla();
        daire1.alan_hesapla();
        kare1.cevre_hesapla();
    }
    
}
