package grupoUno.catalogoGrupoUno.medicamentosCatalogoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class nalbufinaSolucionUnoCatalogoGrupoUno extends AppCompatActivity {

    private TextView medicina17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nalbufina_solucion_uno_catalogo_grupo_uno);

        medicina17=(TextView)findViewById(R.id.mostrarInfo17);
        medicina17.setMovementMethod(new ScrollingMovementMethod());
    }
}
