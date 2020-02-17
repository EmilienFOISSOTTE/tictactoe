package fr.ensma.a3.tictactoc.agentPlateau;

import android.widget.ImageButton;

import java.util.List;

import fr.ensma.a3.tictactoc.agentCase.PresentationAgentCase;
import fr.ensma.a3.tictactoc.agentCase.VueAgentCase;

public class ModelAgentPlateau {

    private List<VueAgentCase> lvcase;
    private List<PresentationAgentCase> lpcase;
    private List<ImageButton> lbutton;

    public ModelAgentPlateau(List<ImageButton> lbutton){
        this.lbutton = lbutton;
        for (int i = 0 ; i < 9 ; i++){
            lpcase.add(new PresentationAgentCase());
            lvcase.add(new VueAgentCase(lpcase.get(i), lbutton.get(i)));
        }


    }
}
