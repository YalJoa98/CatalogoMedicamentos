package grupoUno.cuadroBasicoGrupoUno.medicamentosCuadroBasicoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class acidoAcetilsalcilico extends AppCompatActivity {

    private TextView medicina1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acido_acetilsalcilico);
        this.setTitle(R.string.acido_acetilsalcilico_CB);

        medicina1=(TextView)findViewById(R.id.mostrarInfo1);
        medicina1.setMovementMethod(new ScrollingMovementMethod());
    }
}
