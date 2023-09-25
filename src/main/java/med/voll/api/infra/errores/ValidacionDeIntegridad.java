package med.voll.api.infra.errores;

public class ValidacionDeIntegridad extends RuntimeException { //Throwable responde ante errores y excpciones, con este se debe agregar un throw new excption al metodo
    public ValidacionDeIntegridad(String s) {
        super(s);
    }
}
