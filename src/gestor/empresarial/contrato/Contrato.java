package gestor.empresarial.contrato;

public final class Contrato {
    private int id;
    private int noContrato;
    private int annio;
    private String horario;
    private Cargos tipoCargo;

    public Contrato(int id, Cargos tipoCargo) {
        this.id = id;
        this.tipoCargo = tipoCargo;
    }


    public void setNoContrato(int noContrato) {
        this.noContrato = noContrato;
    }

    public int getNoContrato() {
        return this.noContrato;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public int getAnnio() {
        return this.annio;
    }
}
