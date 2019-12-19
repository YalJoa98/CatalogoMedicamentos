package grupoTres.cuadroBasicoGrupoTres.medicamentosCuadroBasicoGrupoTres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class digoxinaElixirCuadroBasicoGrupoTres extends AppCompatActivity {

    private TextView medicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digoxina_elixir_cuadro_basico_grupo_tres);
        setTitle(R.string.Digoxina_eli_CB_grupoTres);

        medicina=(TextView)findViewById(R.id.mostrarInfo6_grupoTres);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
