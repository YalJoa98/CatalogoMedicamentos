package grupoUno.cuadroBasicoGrupoUno.principalCuadroBasicoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import  grupoUno.cuadroBasicoGrupoUno.medicamentosCuadroBasicoGrupoUno.*;

import com.example.catalogomedicamentos.R;

public class cuadroBasicoGrupoUno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadro_basico_grupo_uno);
        this.setTitle(R.string.cuadroBasico_GrupoUno);
    }

    public void Seleccion(View view){
        switch (view.getId()){
            case R.id.btn1_GrupoUno:
                Intent btn1 =new Intent(this, acidoAcetilsalcilico.class);
                startActivity(btn1);
                break;
            case R.id.btn2_GrupoUno:
                Intent btn2=new Intent(this, ibuprofeno.class);
                startActivity(btn2);
                break;
            case R.id.btn3_GrupoUno:
                Intent btn3=new Intent(this, metamizolSodicoComprimido.class);
                startActivity(btn3);
                break;
            case R.id.btn4_GrupoUno:
                Intent btn4=new Intent(this, metamizolSodicoSolucion.class);
                startActivity(btn4);
                break;
            case R.id.btn5_GrupoUno:
                Intent btn5=new Intent(this, paracetamolTableta.class);
                startActivity(btn5);
                break;
            case R.id.btn6_GrupoUno:
                Intent btn6=new Intent(this, paracetamolSupositorio.class);
                startActivity(btn6);
                break;
            case R.id.btn7_GrupoUno:
                Intent btn7=new Intent(this, paracetamolSolucionOral.class);
                startActivity(btn7);
                break;
        }
    }
}
