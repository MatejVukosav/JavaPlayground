package drugi;

import prvi.PrviPackage;

/**
 * Created by Vuki on 13.9.2017..
 */
public class DrugiExtendaPackage extends PrviPackage {

    private void main2 (){
        //mogu dohvatit protected varijablu
        this.protectedInt =5;
    }
}
