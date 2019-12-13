package grupoDos.catalogoGrupoDos.medicamentosCatalogoGrupoDos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class propofolEmulsionUnoGrupoDos extends AppCompatActivity {

    private TextView medicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propofol_emulsion_uno_grupo_dos);
        setTitle(R.string.propofol_emu1_catalogoDos);

        medicina=(TextView)findViewById(R.id.mostrarInfo23_grupoDos);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
