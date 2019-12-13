package grupoDos.catalogoGrupoDos.medicamentosCatalogoGrupoDos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class desfluranoGrupoDos extends AppCompatActivity {

    private TextView medicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desflurano_grupo_dos);
        setTitle(R.string.desflurano_grupoDos);

        medicina=(TextView)findViewById(R.id.mostrarInfo10_grupoDos);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
