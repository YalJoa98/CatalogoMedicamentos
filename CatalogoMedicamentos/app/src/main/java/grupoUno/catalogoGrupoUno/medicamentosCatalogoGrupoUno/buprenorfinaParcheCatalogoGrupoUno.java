package grupoUno.catalogoGrupoUno.medicamentosCatalogoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class buprenorfinaParcheCatalogoGrupoUno extends AppCompatActivity {

    private TextView medicina9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buprenorfina_parche_catalogo_grupo_uno);
        setTitle(R.string.buprenorfina_par_catalogo);

        medicina9=(TextView)findViewById(R.id.mostrarInfo9);
        medicina9.setMovementMethod(new ScrollingMovementMethod());
    }
}
