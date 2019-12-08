package grupoUno.cuadroBasicoGrupoUno.medicamentosCuadroBasicoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class ibuprofeno extends AppCompatActivity {

    private TextView medicina2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibuprofeno);
        setTitle(R.string.ibuprofeno_CB);

        medicina2=(TextView)findViewById(R.id.mostrarInfo2);
        medicina2.setMovementMethod(new ScrollingMovementMethod());
    }
}
