package grupoDos.cuadroBasicoGrupoDos.principalCuadroBasicoGrupoDos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.catalogomedicamentos.R;

import grupoDos.cuadroBasicoGrupoDos.medicamentosCuadroBasicoGrupoDos.*;

public class cuadroBasicoGrupoDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadro_basico_grupo_dos);
        setTitle(R.string.cuadroBasico_GrupoDos);
    }

    public void SeleccionCuadroBasicoGrupoDos(View view){
        switch (view.getId()){
            case R.id.btn1_grupoDos:
                Intent btn1=new Intent(this, atropinaGrupoDos.class);
                startActivity(btn1);
                break;
            case R.id.btn2_grupoDos:
                Intent btn2=new Intent(this, lidocainaSolucionUnoGrupoDos.class);
                startActivity(btn2);
                break;
            case R.id.btn3_grupoDos:
                Intent btn3=new Intent(this, lidocainaSolucionDosCuadroBAsicoGrupoDos.class);
                startActivity(btn3);
                break;
            case R.id.btn4_grupoDos:
                Intent btn4=new Intent(this, lidocainaSolucionTresGrupoDos.class);
                startActivity(btn4);
                break;
            case R.id.btn5_grupoDos:
                Intent btn5=new Intent(this, lidocainaEpinefrinaSolucionUnoGrupoDos.class);
                startActivity(btn5);
                break;
            case R.id.btn6_grupoDos:
                Intent btn6=new Intent(this, lidocainaEpinefrinaSolucionDosGrupoDos.class);
                startActivity(btn6);
                break;
        }
    }
}
