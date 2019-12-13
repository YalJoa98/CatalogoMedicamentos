package grupoDos.catalogoGrupoDos.medicamentosCatalogoGrupoDos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class propofolEmulsionDosGrupoDos extends AppCompatActivity {

    private TextView medicina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propofol_emulsion_dos_grupo_dos);
        setTitle(R.string.propofol_emu2_catalogoDos);

        medicina=(TextView)findViewById(R.id.mostrarInfo24_grupoDos);
        medicina.setMovementMethod(new ScrollingMovementMethod());
    }
}
