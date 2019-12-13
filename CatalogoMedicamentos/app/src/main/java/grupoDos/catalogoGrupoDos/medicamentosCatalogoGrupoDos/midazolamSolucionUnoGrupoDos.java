package grupoDos.catalogoGrupoDos.medicamentosCatalogoGrupoDos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class midazolamSolucionUnoGrupoDos extends AppCompatActivity {

    private TextView medicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midazolam_solucion_uno_grupo_dos);
        setTitle(R.string.midazolam_sol1_catalogo_grupoDos);

        medicina=(TextView)findViewById(R.id.mostrarInfo19_grupoDos);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
