package grupoDos.catalogoGrupoDos.medicamentosCatalogoGrupoDos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class bromuroDeRocuronioGrupoDos extends AppCompatActivity {

    private TextView medicina; //5533650235

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bromuro_de_rocuronio_grupo_dos);
        setTitle(R.string.bromuroDeRocuronio_catalogo_grupoDos);

        medicina=(TextView)findViewById(R.id.mostrarInfo25_grupoDos);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
