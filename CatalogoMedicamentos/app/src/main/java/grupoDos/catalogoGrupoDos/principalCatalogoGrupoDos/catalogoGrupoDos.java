package grupoDos.catalogoGrupoDos.principalCatalogoGrupoDos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.catalogomedicamentos.R;

import grupoDos.catalogoGrupoDos.medicamentosCatalogoGrupoDos.*;

public class catalogoGrupoDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_grupo_dos);
        setTitle(R.string.catalogo_GrupoDos);
    }

    public void SeleccionCatalogoGrupoDos(View view){
        switch (view.getId()){
            case R.id.btn7_grupoDos:
                Intent btn7=new Intent(this, bupivacainaSolucionUnoGrupoDos.class);
                startActivity(btn7);
                break;
            case R.id.btn8_grupoDos:
                Intent btn8=new Intent(this, bupivacainaSolucionDosGrupoDos.class);
                startActivity(btn8);
                break;
        }

    }
}
