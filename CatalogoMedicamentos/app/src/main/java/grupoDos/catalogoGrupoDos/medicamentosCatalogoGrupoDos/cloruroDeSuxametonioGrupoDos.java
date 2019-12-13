package grupoDos.catalogoGrupoDos.medicamentosCatalogoGrupoDos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class cloruroDeSuxametonioGrupoDos extends AppCompatActivity {

    private TextView medicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloruro_de_suxametonio_grupo_dos);
        setTitle(R.string.cloruroDeSuxametonio_catalogo_);

        medicina=(TextView)findViewById(R.id.mostrarInfo28_grupoDos);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
