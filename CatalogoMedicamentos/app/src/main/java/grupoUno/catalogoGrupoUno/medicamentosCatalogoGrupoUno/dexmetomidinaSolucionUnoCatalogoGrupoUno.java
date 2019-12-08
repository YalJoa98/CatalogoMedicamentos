package grupoUno.catalogoGrupoUno.medicamentosCatalogoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class dexmetomidinaSolucionUnoCatalogoGrupoUno extends AppCompatActivity {

    private TextView medicina11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dexmetomidina_solucion_uno_catalogo_grupo_uno);
        setTitle(R.string.dexmetomidina_sol1_catalogo);

        medicina11=(TextView)findViewById(R.id.mostrarInfo11);
        medicina11.setMovementMethod(new ScrollingMovementMethod());
    }
}
