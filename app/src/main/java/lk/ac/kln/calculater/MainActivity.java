package lk.ac.kln.calculater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    int numberOne=0;
    int numberTwo=0;
    EditText firstinput;
    EditText secondinput;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           firstinput =findViewById(R.id.editText);
           secondinput =findViewById(R.id.editText2);
           resultView =findViewById(R.id.TextView);


    }

    protected void addNumber(View view){
        int numberOne=Integer.parseInt(firstinput.getText().toString());
        int numberTwo=Integer.parseInt(secondinput.getText().toString());


        int sum=numberOne+numberTwo;
        resultView. setText(Integer.toString(sum));



    }
}
