
package AccessModifierlar.paket1;


import AccessModifierlar.paket2.Hayvan;

public class At extends Hayvan {
    
    public At(String isim) {
        super(isim);
    }
    public void ismini_soyle() {
        
        System.out.println(super.isim);
        
    }
    
    
}
