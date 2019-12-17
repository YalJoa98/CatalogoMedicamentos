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

        }
    }
}
