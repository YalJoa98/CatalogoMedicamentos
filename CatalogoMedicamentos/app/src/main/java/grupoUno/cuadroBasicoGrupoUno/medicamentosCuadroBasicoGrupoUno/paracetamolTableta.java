package grupoUno.cuadroBasicoGrupoUno.medicamentosCuadroBasicoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class paracetamolTableta extends AppCompatActivity {

    private TextView medicina5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paracetamol_tableta);
        setTitle(R.string.paracetamol_tableta_CB);

        medicina5=(TextView)findViewById(R.id.mostrarInfo5);
        medicina5.setMovementMethod(new ScrollingMovementMethod());
    }
}
