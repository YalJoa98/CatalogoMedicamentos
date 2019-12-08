package grupoUno.catalogoGrupoUno.medicamentosCatalogoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class ketorolacoCatalogoGrupoUno extends AppCompatActivity {

    private TextView medicina15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketorolaco_catalogo_grupo_uno);
        setTitle(R.string.ketorolaco_catalogo);

        medicina15=(TextView)findViewById(R.id.mostrarInfo15);
        medicina15.setMovementMethod(new ScrollingMovementMethod());
    }
}
