package grupoDos.cuadroBasicoGrupoDos.medicamentosCuadroBasicoGrupoDos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class lidocainaSolucionTresGrupoDos extends AppCompatActivity {

    private TextView medicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lidocaina_solucion_tres_grupo_dos);
        setTitle(R.string.lidocaina_sol3_CB_GrupoDos);

        medicina=(TextView)findViewById(R.id.mostrarInfo4_GrupoDos);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
