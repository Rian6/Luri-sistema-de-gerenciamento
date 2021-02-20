
package Model;

import java.util.Objects;

public class Freezer {
    private String status;
    private String kwh;
    private String nome;
    private String tempo;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKwh() {
        return kwh;
    }

    public void setKwh(String kwh) {
        this.kwh = kwh;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
    public Freezer(String status, String kwh, String nome,String tempo) {
        this.status = status;
        this.kwh = kwh;
        this.nome = nome;
        this.tempo = tempo;
    }

}
