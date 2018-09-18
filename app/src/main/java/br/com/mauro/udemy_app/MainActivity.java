package br.com.mauro.udemy_app;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements

        FragmentVermelho.OnFragmentInteractionListener,
        FragmentAzul.OnFragmentInteractionListener,
        FragmentVerde.OnFragmentInteractionListener {

    FragmentAzul fragmentazul;
    FragmentVerde fragmentverde;
    FragmentVermelho fragmentvermelho;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fragmentazul = new FragmentAzul();
        fragmentverde = new FragmentVerde();
        fragmentvermelho = new FragmentVermelho();

        getSupportFragmentManager().beginTransaction().add(R.id.conteudoFragmento, fragmentazul).commit();


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void onClick(View view) {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (view.getId()){

            case R.id.btn1:
                Toast.makeText(getBaseContext(), "Azul", Toast.LENGTH_LONG).show();
                transaction.replace(R.id.conteudoFragmento, fragmentazul);
                break;

            case R.id.btn3:
                Toast.makeText(getBaseContext(), "Verde", Toast.LENGTH_LONG).show();
                transaction.replace(R.id.conteudoFragmento, fragmentverde);
                break;

            case R.id.btn2:
                Toast.makeText(getBaseContext(), "Vermelho", Toast.LENGTH_LONG).show();
                transaction.replace(R.id.conteudoFragmento, fragmentvermelho);
                break;
        }
        transaction.commit();
    }
}
