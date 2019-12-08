package grupoUno.catalogoGrupoUno.medicamentosCatalogoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class paracetamolSolucionDosCatalagoGrupoUno extends AppCompatActivity {

    private TextView medicina20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paracetamol_solucion_dos_catalago_grupo_uno);
        setTitle(R.string.paracetamol_in2_catalogo);

        medicina20=(TextView)findViewById(R.id.mostrarInfo20);
        medicina20.setMovementMethod(new ScrollingMovementMethod());
    }
}
