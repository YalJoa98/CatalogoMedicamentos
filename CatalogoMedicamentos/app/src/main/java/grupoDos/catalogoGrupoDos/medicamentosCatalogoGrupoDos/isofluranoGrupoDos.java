package grupoDos.catalogoGrupoDos.medicamentosCatalogoGrupoDos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class isofluranoGrupoDos extends AppCompatActivity {

    private TextView medicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isoflurano_grupo_dos);
        setTitle(R.string.isoflurano_catalogo_grupoDos);

        medicina=(TextView)findViewById(R.id.mostrarInfo17_grupoDos);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
