package grupoUno.cuadroBasicoGrupoUno.medicamentosCuadroBasicoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class metamizolSodicoSolucion extends AppCompatActivity {

    private TextView medicina4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metamizol_sodico_solucion);
        setTitle(R.string.metamizol_sodico_sol_CB);

        medicina4=(TextView)findViewById(R.id.mostrarInfo4);
        medicina4.setMovementMethod(new ScrollingMovementMethod());
    }
}
