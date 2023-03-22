package comprobacionT;

public class PassComprobation {



    public enum NivelSecurity{
        DEBIL, MEDIA, FUERTE
    }

    public static NivelSecurity  comprobacion(String pass){
        if (pass.length()<8) {
            return NivelSecurity.DEBIL;
        }
        if (pass.matches("[a-zA-z]+")) {
            return NivelSecurity.DEBIL;
        }
        if (pass.matches("[a-zA-z0-9]+")){
            return NivelSecurity.MEDIA;
        }

            return NivelSecurity.FUERTE;


    }
}
