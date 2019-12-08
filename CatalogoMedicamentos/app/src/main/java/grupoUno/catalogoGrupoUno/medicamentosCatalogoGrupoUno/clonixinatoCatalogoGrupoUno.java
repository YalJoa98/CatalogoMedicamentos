package grupoUno.catalogoGrupoUno.medicamentosCatalogoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class clonixinatoCatalogoGrupoUno extends AppCompatActivity {

    private TextView medicina10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clonixinato_catalogo_grupo_uno);
        setTitle(R.string.clonixinato_de_lisina_catalogo);

        medicina10=(TextView)findViewById(R.id.mostrarInfo10);
        medicina10.setMovementMethod(new ScrollingMovementMethod());
    }
}
