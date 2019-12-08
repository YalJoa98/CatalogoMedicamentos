package grupoUno.cuadroBasicoGrupoUno.medicamentosCuadroBasicoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

import org.w3c.dom.Text;

public class paracetamolSolucionOral extends AppCompatActivity {

    private TextView medicina7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paracetamol_solucion_oral);
        setTitle(R.string.paracetamol_solucion_CB);

        medicina7=(TextView)findViewById(R.id.mostrarInfo7);
        medicina7.setMovementMethod(new ScrollingMovementMethod());
    }
}
