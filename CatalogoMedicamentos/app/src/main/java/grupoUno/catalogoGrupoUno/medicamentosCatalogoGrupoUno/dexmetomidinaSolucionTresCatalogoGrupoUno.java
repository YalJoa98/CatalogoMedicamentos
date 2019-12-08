package grupoUno.catalogoGrupoUno.medicamentosCatalogoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class dexmetomidinaSolucionTresCatalogoGrupoUno extends AppCompatActivity {

    private TextView medicina13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dexmetomidina_solucion_tres_catalogo_grupo_uno);
        setTitle(R.string.dexmetomidina_sol3_catalogo);

        medicina13=(TextView)findViewById(R.id.mostrarInfo13);
        medicina13.setMovementMethod(new ScrollingMovementMethod());
    }
}
