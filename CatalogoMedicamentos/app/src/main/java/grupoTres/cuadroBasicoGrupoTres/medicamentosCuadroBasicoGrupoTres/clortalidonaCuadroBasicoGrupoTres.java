package grupoTres.cuadroBasicoGrupoTres.medicamentosCuadroBasicoGrupoTres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class clortalidonaCuadroBasicoGrupoTres extends AppCompatActivity {

    private TextView medicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clortalidona_cuadro_basico_grupo_tres);
        setTitle(R.string.Clortalidona_CB_grupoTres);


        medicina=(TextView)findViewById(R.id.mostrarInfo4_grupoTres);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
