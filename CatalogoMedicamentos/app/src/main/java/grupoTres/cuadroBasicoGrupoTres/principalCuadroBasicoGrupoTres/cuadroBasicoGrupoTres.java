package grupoTres.cuadroBasicoGrupoTres.principalCuadroBasicoGrupoTres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.catalogomedicamentos.R;
import grupoTres.cuadroBasicoGrupoTres.medicamentosCuadroBasicoGrupoTres.*;

public class cuadroBasicoGrupoTres extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadro_basico_grupo_tres);
        setTitle(R.string.cuadroBasico_GrupoTres);
    }

    public void SeleccionCuadroBasicoGrupoTres(View view){
        switch (view.getId()){
            case R.id.btn1_grupoTres:
                Intent btn1=new Intent(this, amlodipinoTabletaUnoCuadroBasicoGrupoTres.class);
                startActivity(btn1);
                break;
            case R.id.btn2_grupoTres:
                Intent btn2=new Intent(this, amlodipinoTabletaDosCuadroBasicoGrupoTres.class);
                startActivity(btn2);
                break;
            case R.id.btn3_grupoTres:
                Intent btn3=new Intent(this, captoprilCuadroBasicoGrupoTres.class);
                startActivity(btn3);
                break;
            case R.id.btn4_grupoTres:
                Intent btn4=new Intent(this, clortalidonaCuadroBasicoGrupoTres.class);
                startActivity(btn4);
                break;
            case R.id.btn5_grupoTres:
                Intent btn5=new Intent(this, digoxinaTabletaCuadroBasicoGrupoTres.class);
                startActivity(btn5);
                break;
            case R.id.btn6_grupoTres:
                Intent btn6=new Intent(this, digoxinaElixirCuadroBasicoGrupoTres.class);
                startActivity(btn6);
                break;
            case R.id.btn7_grupoTres:
                Intent btn7=new Intent(this, digoxinaSolucionInyectableCuadroBasicoGrupoTres.class);
                startActivity(btn7);
                break;
            case R.id.btn8_grupoTres:
                Intent btn8=new Intent(this, enalaprilOLisinoprilORamiprilCuadroBasicoGrupoTres.class);
                startActivity(btn8);
                break;
            case R.id.btn9_grupoTres:
                Intent btn9=new Intent(this, epinefrinaCuadroBasicoGrupoTres.class);
                startActivity(btn9);
                break;
            case R.id.btn10_grupoTres:
                Intent btn10=new Intent(this, hidralazinaTabletaCuadroBasicoGrupoTres.class);
                startActivity(btn10);
                break;
            case R.id.btn11_grupoTres:
                Intent btn11=new Intent(this, hidralazinaSolucionInyectableCuadroBasicoGrupoTres.class);
                startActivity(btn11);
                break;
            case R.id.btn12_grupoTres:
                Intent btn12=new Intent(this, isosorbidaTabletaSublingualCuadroBasicoGrupoTres.class);
                startActivity(btn12);
                break;
            case R.id.btn13_grupoTres:
                Intent btn13=new Intent(this, isosorbidaTabletaCuadroBasicoGrupoTres.class);
                startActivity(btn13);
                break;
            case R.id.btn14_grupoTres:
                Intent btn14=new Intent(this, metoprololCuadroBasicoGrupoTres.class);
                startActivity(btn14);
                break;
            case R.id.btn15_grupoTres:
                Intent btn15=new Intent(this, nifedipinoCapsulaDeGelatinaBlandaCuadroBasicoGrupoTres.class);
                startActivity(btn15);
                break;
            case R.id.btn16_grupoTres:
                Intent btn16=new Intent(this, nifedipinoComprimidoDeLiberacionProlongadaCuadroBasicoGrupoDos.class);
                startActivity(btn16);
                break;
            case R.id.btn17_grupoTres:
                Intent btn17=new Intent(this, pentoxifilinaCuadroBasicoGrupoTres.class);
                startActivity(btn17);
                break;
            case R.id.btn18_grupoTres:
                Intent btn18=new Intent(this, propranololTabletaUnoCuadroBasicoGrupoTres.class);
                startActivity(btn18);
                break;
            case R.id.btn19_grupoTres:
                Intent btn19=new Intent(this, propranololTabletaDosCuadroBasicoGrupoTres.class);
                startActivity(btn19);
                break;
        }
    }
}
