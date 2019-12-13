package grupoDos.catalogoGrupoDos.medicamentosCatalogoGrupoDos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class diazepamSolucionDosGrupoDos extends AppCompatActivity {

    private TextView medicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diazepam_solucion_dos_grupo_dos);
        setTitle(R.string.diazepam_sol2_catalogo_grupoDos);

        medicina=(TextView)findViewById(R.id.mostrarInfo12_grupoDos);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
