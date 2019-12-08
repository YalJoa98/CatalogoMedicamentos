package grupoUno.catalogoGrupoUno.medicamentosCatalogoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class fentaniloCatalogoGrupoUno extends AppCompatActivity {

    private TextView medicina14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fentanilo_catalogo_grupo_uno);
        setTitle(R.string.fentanilo_catalogo);

        medicina14=(TextView)findViewById(R.id.mostrarInfo14);
        medicina14.setMovementMethod(new ScrollingMovementMethod());
    }
}
