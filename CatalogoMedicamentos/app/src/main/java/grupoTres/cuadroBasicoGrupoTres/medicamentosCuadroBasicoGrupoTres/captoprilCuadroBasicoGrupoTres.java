package grupoTres.cuadroBasicoGrupoTres.medicamentosCuadroBasicoGrupoTres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class captoprilCuadroBasicoGrupoTres extends AppCompatActivity {

    private TextView medicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captopril_cuadro_basico_grupo_tres);
        setTitle(R.string.captopril_CB_grupoTres);

        medicina=(TextView)findViewById(R.id.mostrarInfo3_grupoTres);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
