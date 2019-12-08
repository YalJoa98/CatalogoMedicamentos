package grupoDos.cuadroBasicoGrupoDos.medicamentosCuadroBasicoGrupoDos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class lidocainaEpinefrinaSolucionDosGrupoDos extends AppCompatActivity {

    private TextView medicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lidocaina_epinefrina_solucion_dos_grupo_dos);
        setTitle(R.string.lidocainaEpinefria_sol2_CB_GrupoDos);

        medicina=(TextView)findViewById(R.id.mostrarInfo6_GrupoDos);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
