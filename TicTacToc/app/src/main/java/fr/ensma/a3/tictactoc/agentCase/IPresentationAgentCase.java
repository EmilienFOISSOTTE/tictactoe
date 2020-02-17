package fr.ensma.a3.tictactoc.agentCase;

import fr.ensma.a3.tictactoc.agentCase.Symbole;

public interface IPresentationAgentCase {
    public void notifContenu(Symbole symb);
    public void notifEnable(Boolean enab);
    public void notifEditable(Boolean edit);
}

