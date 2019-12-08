package grupoDos.cuadroBasicoGrupoDos.medicamentosCuadroBasicoGrupoDos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class lidocainaEpinefrinaSolucionUnoGrupoDos extends AppCompatActivity {

    private TextView medicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lidocaina_epinefrina_solucion_uno_grupo_dos);
        setTitle(R.string.lidocainaEpinefria_sol1_CB_GrupoDos);

        medicina=(TextView)findViewById(R.id.mostrarInfo5_GrupoDos);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
