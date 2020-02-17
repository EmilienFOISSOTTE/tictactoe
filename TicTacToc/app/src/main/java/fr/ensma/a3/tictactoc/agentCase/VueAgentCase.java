package fr.ensma.a3.tictactoc.agentCase;

import android.view.KeyEvent;
import android.widget.ImageButton;

import fr.ensma.a3.tictactoc.R;

public class VueAgentCase implements IPresentationAgentCase {
    private PresentationAgentCase pres;

    private ImageButton button;

    public VueAgentCase(PresentationAgentCase pres, ImageButton button) {
        this.pres = pres;
        this.button = button;

    }

    @Override
    public void notifContenu(Symbole symb) {

    }

    @Override
    public void notifEnable(Boolean enab) {

    }

    @Override
    public void notifEditable(Boolean edit) {

    }
}
