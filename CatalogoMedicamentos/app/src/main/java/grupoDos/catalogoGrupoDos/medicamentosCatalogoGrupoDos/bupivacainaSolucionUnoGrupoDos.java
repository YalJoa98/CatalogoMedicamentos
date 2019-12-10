package grupoDos.catalogoGrupoDos.medicamentosCatalogoGrupoDos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class bupivacainaSolucionUnoGrupoDos extends AppCompatActivity {

    private TextView medicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bupivacaina_solucion_uno_grupo_dos);
        setTitle(R.string.bupivacaina_sol1_catalogo_grupoDos);

        medicina=(TextView)findViewById(R.id.mostrarInfo7_grupoDos);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
