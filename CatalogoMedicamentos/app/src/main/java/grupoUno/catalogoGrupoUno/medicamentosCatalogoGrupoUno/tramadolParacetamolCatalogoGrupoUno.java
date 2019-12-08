package grupoUno.catalogoGrupoUno.medicamentosCatalogoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class tramadolParacetamolCatalogoGrupoUno extends AppCompatActivity {

    private TextView medicina22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tramadol_paracetamol_catalogo_grupo_uno);
        setTitle(R.string.tramadol_parac_catalogo);

        medicina22=(TextView)findViewById(R.id.mostrarInfo22);
        medicina22.setMovementMethod(new ScrollingMovementMethod());
    }
}
