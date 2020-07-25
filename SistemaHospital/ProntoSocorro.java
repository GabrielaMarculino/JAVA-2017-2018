package hospitalsistema;

import java.util.ArrayList;

class ProntoSocorro {
    private int codProntoSocorro;
    private String endereco;
    private Hospital hospital;

    public ArrayList<ProntoSocorro> getProntoSocorro() {
        return ProntoSocorro;
    }

    public void setProntoSocorro(ArrayList<ProntoSocorro> ProntoSocorro) {
        this.ProntoSocorro = ProntoSocorro;
    }
    private ArrayList<ProntoSocorro> ProntoSocorro=new ArrayList();

    public int getCodProntoSocorro() {
        return codProntoSocorro;
    }

    public void setCodProntoSocorro(int codProntoSocorro) {
        this.codProntoSocorro = codProntoSocorro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public void addProntoSocorro(ProntoSocorro Pr){
        this.ProntoSocorro.add(Pr);
    }
        
}
