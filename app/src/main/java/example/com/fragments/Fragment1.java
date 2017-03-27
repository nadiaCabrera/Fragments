package example.com.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import example.com.fragments.R;

public class Fragment1 extends Fragment {


    private TextView text;

    public Fragment1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View v = inflater.inflate(R.layout.fragment1, container, false);
        text = (TextView) v.findViewById(R.id.textView);
        String texto = getArguments().getString("texto");
        text.setText(texto);
        return v;
    }


    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();

        }
    }