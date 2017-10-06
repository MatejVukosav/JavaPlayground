package drugi;

import prvi.PrviPackagePrivate;

/**
 * Created by Vuki on 13.9.2017..
 */
public class DrugiExtendaPackagePrivate extends PrviPackagePrivate {

    private void main (){
       // ne mogu dohvatit package private varijablu
        this.packagePrivateInt=5;
    }
}
