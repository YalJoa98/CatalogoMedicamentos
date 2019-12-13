package principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.example.catalogomedicamentos.R;

import grupoDos.principal.grupoDos;
import grupoTres.principal.grupoTres;
import grupoUno.principal.grupoUno;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GrupoUno(View view){
        Intent grupouno=new Intent(this, grupoUno.class);
        startActivity(grupouno);
    }

    public void GrupoDos(View view){
        Intent grupodos=new Intent(this, grupoDos.class);
        startActivity(grupodos);
    }

    public void GrupoTres(View view){
        Intent grupoTres=new Intent(this, grupoTres.class);
        startActivity(grupoTres);
    }

}
