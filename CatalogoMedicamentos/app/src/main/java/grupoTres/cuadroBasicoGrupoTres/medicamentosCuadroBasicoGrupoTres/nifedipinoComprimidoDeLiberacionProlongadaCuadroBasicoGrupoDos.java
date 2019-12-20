package grupoTres.cuadroBasicoGrupoTres.medicamentosCuadroBasicoGrupoTres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class nifedipinoComprimidoDeLiberacionProlongadaCuadroBasicoGrupoDos extends AppCompatActivity {

    private TextView medicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nifedipino_comprimido_de_liberacion_prolongada_cuadro_basico_grupo_dos);
        setTitle(R.string.Nifedipino_com_CB_grupoTres);

        medicina=(TextView)findViewById(R.id.mostrarInfo16_grupoTres);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
