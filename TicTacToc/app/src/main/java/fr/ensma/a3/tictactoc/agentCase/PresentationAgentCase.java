package fr.ensma.a3.tictactoc.agentCase;

import android.widget.ImageButton;

import static fr.ensma.a3.tictactoc.agentCase.Symbole.vide;

public class PresentationAgentCase {
    private Integer posX, posY;

    private IPresentationAgentCase pres;
    private ModelAgentCase mod;

    public PresentationAgentCase() {
        mod = new ModelAgentCase();
    }

    public void actionButton(Symbole symb){
        if (!mod.getActif() &&
                mod.getContenu()==vide ) {
            mod.setContenu(symb);
            mod.setActif(false);
        }
    }
}
