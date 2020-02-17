package fr.ensma.a3.tictactoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

import java.util.List;

import fr.ensma.a3.tictactoc.agentCase.PresentationAgentCase;
import fr.ensma.a3.tictactoc.agentCase.VueAgentCase;

public class MainActivity extends AppCompatActivity {
    private List<ImageButton> lbutton;
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;
    private ImageButton button6;
    private ImageButton button7;
    private ImageButton button8;
    private ImageButton button9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.case1);
        button2 = findViewById(R.id.case2);
        button3 = findViewById(R.id.case3);
        button4 = findViewById(R.id.case4);
        button5 = findViewById(R.id.case5);
        button6 = findViewById(R.id.case6);
        button7 = findViewById(R.id.case7);
        button8 = findViewById(R.id.case8);
        button9 = findViewById(R.id.case9);

        lbutton.add(button1);
        lbutton.add(button2);
        lbutton.add(button3);
        lbutton.add(button4);
        lbutton.add(button5);
        lbutton.add(button6);
        lbutton.add(button7);
        lbutton.add(button8);
        lbutton.add(button9);

    }
}
