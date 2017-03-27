package example.com.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText texto;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (EditText) findViewById(R.id.editText);
        boton = (Button) findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzar(v, texto.getText().toString());
            }
        });
    }

    public void lanzar(View view, String texto){
        Fragment frag = new Fragment1();
        FragmentTransaction t = getFragmentManager().beginTransaction();
        t.replace(R.id.activity_main,frag);
        Bundle data = new Bundle();
        data.putString("texto",texto);
        t.addToBackStack(null);
        frag.setArguments(data);
        t.commit();
    }

}
