package grupoUno.catalogoGrupoUno.medicamentosCatalogoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class tramadolCatalogoGrupoUno extends AppCompatActivity {

    private TextView medicina21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tramadol_catalogo_grupo_uno);
        setTitle(R.string.tramadol_catalogo);

        medicina21=(TextView)findViewById(R.id.mostrarInfo21);
        medicina21.setMovementMethod(new ScrollingMovementMethod());
    }
}
