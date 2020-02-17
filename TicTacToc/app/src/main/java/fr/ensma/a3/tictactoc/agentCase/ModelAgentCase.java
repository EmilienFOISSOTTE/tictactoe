package fr.ensma.a3.tictactoc.agentCase;

public class ModelAgentCase {
    private Symbole contenu;
    private Boolean actif;


    public ModelAgentCase() {
        contenu = Symbole.vide;
        actif = true;
    }

    public Symbole getContenu() {
        return contenu;
    }

    public void setContenu(Symbole contenu) {
        this.contenu = contenu;
    }

    public Boolean getActif() {
        return actif;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }
}
