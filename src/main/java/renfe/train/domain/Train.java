package renfe.train.domain; //cambiar por la ruta correcta

public class Train {
    private String id;
    private String modelo;
    private String compañia;
    private String vagones;

    public Train(String id, String modelo, String compañia, String vagones) {
        this.id = id;
        this.modelo = modelo;
        this.compañia = compañia;
        this.vagones = vagones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getVagones() {
        return vagones;
    }

    public void setVagones(String vagones) {
        this.vagones = vagones;
    }
}

