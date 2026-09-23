package br.com.estudos.singleton;

///Contador das senhas da recepcao do hospital
public class SenhaAtendimento {

    private static final SenhaAtendimento INSTANCIA = new SenhaAtendimento();

    private int ultima = 0;

    private SenhaAtendimento() {
    }

    public static SenhaAtendimento getInstance() {
        return INSTANCIA;
    }

    public synchronized int proxima() {
        ultima++;
        return ultima;
    }

    public synchronized int ultima() {
        return ultima;
    }
}
