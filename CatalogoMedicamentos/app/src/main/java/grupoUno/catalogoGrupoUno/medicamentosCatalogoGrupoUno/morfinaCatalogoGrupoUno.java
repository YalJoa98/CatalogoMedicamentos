package grupoUno.catalogoGrupoUno.medicamentosCatalogoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class morfinaCatalogoGrupoUno extends AppCompatActivity {

    private TextView medicina16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morfina_catalogo_grupo_uno);
        setTitle(R.string.morfina_catalogo);

        medicina16=(TextView)findViewById(R.id.mostrarInfo16);
        medicina16.setMovementMethod(new ScrollingMovementMethod());
    }
}
