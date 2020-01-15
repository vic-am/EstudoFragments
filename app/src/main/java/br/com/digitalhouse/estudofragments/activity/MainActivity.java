package br.com.digitalhouse.estudofragments.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import br.com.digitalhouse.estudofragments.R;
import br.com.digitalhouse.estudofragments.fragment.ContatosFragment;
import br.com.digitalhouse.estudofragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversas;
    private Button buttonContatos;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Remove a sobra da action bar
        getSupportActionBar().setElevation(0);

        //Inicia botões e fragments
        initViews();

        buttonConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, conversasFragment);
                transaction.commit();


            }
        });

        buttonContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, contatosFragment);
                transaction.commit();

            }
        });

    }

    public void initViews() {
        buttonConversas = findViewById(R.id.buttonConversas);
        buttonContatos = findViewById(R.id.buttonContatos);
        conversasFragment = new ConversasFragment();
        contatosFragment = new ContatosFragment();
    }
}
