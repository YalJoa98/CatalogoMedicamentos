package grupoUno.catalogoGrupoUno.medicamentosCatalogoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class paracetamolSolucionUnoCatalogoGrupoUno extends AppCompatActivity {

    private TextView medicina19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paracetamol_solucion_uno_catalogo_grupo_uno);
        setTitle(R.string.paracetamol_in1_catalogo);

        medicina19=(TextView)findViewById(R.id.mostrarInfo19);
        medicina19.setMovementMethod(new ScrollingMovementMethod());
    }
}
