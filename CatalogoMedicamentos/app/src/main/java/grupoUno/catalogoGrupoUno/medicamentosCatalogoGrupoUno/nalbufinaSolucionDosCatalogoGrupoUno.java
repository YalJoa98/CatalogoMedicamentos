package grupoUno.catalogoGrupoUno.medicamentosCatalogoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class nalbufinaSolucionDosCatalogoGrupoUno extends AppCompatActivity {

    private TextView medicina18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nalbufina_solucion_dos_catalogo_grupo_uno);
        setTitle(R.string.nalbufina_in2_catalogo);

        medicina18=(TextView)findViewById(R.id.mostrarInfo18);
        medicina18.setMovementMethod(new ScrollingMovementMethod());

    }
}
