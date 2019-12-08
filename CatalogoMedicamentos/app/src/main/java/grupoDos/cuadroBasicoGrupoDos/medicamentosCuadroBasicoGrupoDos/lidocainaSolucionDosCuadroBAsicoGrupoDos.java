package grupoDos.cuadroBasicoGrupoDos.medicamentosCuadroBasicoGrupoDos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class lidocainaSolucionDosCuadroBAsicoGrupoDos extends AppCompatActivity {

    private TextView medicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lidocaina_solucion_dos_cuadro_basico_grupo_dos);
        setTitle(R.string.lidocaina_sol2_CB_GrupoDos);

        medicina=(TextView)findViewById(R.id.mostarInfo3_GrupoDos);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
