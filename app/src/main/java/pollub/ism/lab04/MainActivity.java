package pollub.ism.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public int gracz=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button p1_button = (Button)findViewById(R.id.button_1_1);
        //p1_button.setText("O");
        //((Button)findViewById(R.id.button_1_1)).setText("p");



        Button b11 = (Button)findViewById(R.id.button_1_1);
        Button b12 = (Button)findViewById(R.id.button_1_2);
        Button b13 = (Button)findViewById(R.id.button_1_3);
        Button b21 = (Button)findViewById(R.id.button_2_1);
        Button b22 = (Button)findViewById(R.id.button_2_2);
        Button b23 = (Button)findViewById(R.id.button_2_3);
        Button b31 = (Button)findViewById(R.id.button_3_1);
        Button b32 = (Button)findViewById(R.id.button_3_2);
        Button b33 = (Button)findViewById(R.id.button_3_3);

        //String tes2t=data.getStringExtra(KLUCZ_WIADOMOSCI);

            Toast.makeText(this,"Wygrały X", Toast.LENGTH_LONG).show();

        EditText poleTekstowe = (EditText) findViewById(R.id.wynik);
        poleTekstowe.setText("Test");


    }

    public void klik11(View view) {
        if(gracz==0){
            ((Button)findViewById(R.id.button_1_1)).setText("X");
            gracz=1;
        }else{
            if(gracz==1){
                ((Button)findViewById(R.id.button_1_1)).setText("O");
                gracz=0;
            }
        }
    }
    public void klik12(View view) {
        if(gracz==0){
            ((Button)findViewById(R.id.button_1_2)).setText("X");
            gracz=1;
        }else{
            if(gracz==1){
                ((Button)findViewById(R.id.button_1_2)).setText("O");
                gracz=0;
            }
        }
    }
    public void klik13(View view) {
        if(gracz==0){
            ((Button)findViewById(R.id.button_1_3)).setText("X");
            gracz=1;
        }else{
            if(gracz==1){
                ((Button)findViewById(R.id.button_1_3)).setText("O");
                gracz=0;
            }
        }
    }
    public void klik21(View view) {
        if(gracz==0){
            ((Button)findViewById(R.id.button_2_1)).setText("X");
            gracz=1;
        }else{
            if(gracz==1){
                ((Button)findViewById(R.id.button_2_1)).setText("O");
                gracz=0;
            }
        }
    }
    public void klik22(View view) {
        if(gracz==0){
            ((Button)findViewById(R.id.button_2_2)).setText("X");
            gracz=1;
        }else{
            if(gracz==1){
                ((Button)findViewById(R.id.button_2_2)).setText("O");
                gracz=0;
            }
        }
    }
    public void klik23(View view) {
        if(gracz==0){
            ((Button)findViewById(R.id.button_2_3)).setText("X");
            gracz=1;
        }else{
            if(gracz==1){
                ((Button)findViewById(R.id.button_2_3)).setText("O");
                gracz=0;
            }
        }
    }
    public void klik31(View view) {
        if(gracz==0){
            ((Button)findViewById(R.id.button_3_1)).setText("X");
            gracz=1;
        }else{
            if(gracz==1){
                ((Button)findViewById(R.id.button_3_1)).setText("O");
                gracz=0;
            }
        }
    }
    public void klik32(View view) {
        if(gracz==0){
            ((Button)findViewById(R.id.button_3_2)).setText("X");
            gracz=1;
        }else{
            if(gracz==1){
                ((Button)findViewById(R.id.button_3_2)).setText("O");
                gracz=0;
            }
        }
    }
    public void klik33(View view) {
        if(gracz==0){
            ((Button)findViewById(R.id.button_3_3)).setText("X");
            gracz=1;
        }else{
            if(gracz==1){
                ((Button)findViewById(R.id.button_3_3)).setText("O");
                gracz=0;
            }
        }
    }
}