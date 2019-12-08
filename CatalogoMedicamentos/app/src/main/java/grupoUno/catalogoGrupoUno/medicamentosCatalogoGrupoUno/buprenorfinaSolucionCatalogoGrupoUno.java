package grupoUno.catalogoGrupoUno.medicamentosCatalogoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class buprenorfinaSolucionCatalogoGrupoUno extends AppCompatActivity {

    private TextView medicina8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buprenorfina_solucion_catalogo_grupo_uno);
        setTitle(R.string.buprenorfina_sol_catalogo);

        medicina8=(TextView)findViewById(R.id.mostrarInfo8);
        medicina8.setMovementMethod(new ScrollingMovementMethod());
    }
}
