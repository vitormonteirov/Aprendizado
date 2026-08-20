package Aprendizado.TreinoNu;

public class CLIENTE {
    private String NOME_CLIENTE;
    private String SERVICO;
    private int VALOR;

    public CLIENTE(String NOME_CLIENTE, String SERVICO, int VALOR) {
        this.NOME_CLIENTE = NOME_CLIENTE;
        this.SERVICO = SERVICO;
        this.VALOR = VALOR;
    }

    public String getNOME_CLIENTE() {
        return NOME_CLIENTE;
    }

    public void setNOME_CLIENTE(String NOME_CLIENTE) {
        this.NOME_CLIENTE = NOME_CLIENTE;
    }

    public String getSERVICO() {
        return SERVICO;
    }

    public void setSERVICO(String SERVICO) {
        this.SERVICO = SERVICO;
    }

    public int getVALOR() {
        return this.VALOR;
    }

    public void setVALOR(int VALOR) {
        this.VALOR = VALOR;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
