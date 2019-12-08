package grupoUno.catalogoGrupoUno.medicamentosCatalogoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class dexmetomidinaSolucionDosCatalogoGrupoUno extends AppCompatActivity {

    private TextView medicina12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dexmetomidina_solucion_dos_catalogo_grupo_uno);
        setTitle(R.string.dexmetomidina_sol2_catalogo);

        medicina12=(TextView)findViewById(R.id.mostrarInfo12);
        medicina12.setMovementMethod(new ScrollingMovementMethod());
    }
}
