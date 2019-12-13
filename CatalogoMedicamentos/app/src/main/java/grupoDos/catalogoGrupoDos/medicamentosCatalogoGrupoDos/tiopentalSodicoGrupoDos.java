package grupoDos.catalogoGrupoDos.medicamentosCatalogoGrupoDos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

import org.w3c.dom.Text;

public class tiopentalSodicoGrupoDos extends AppCompatActivity {

    private TextView medicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiopental_sodico_grupo_dos);
        setTitle(R.string.tiopentalSodico_catalogo_grupoDos);

        medicina=(TextView)findViewById(R.id.mostrarInfo29_grupoDos);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
