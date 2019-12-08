package grupoUno.cuadroBasicoGrupoUno.medicamentosCuadroBasicoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

public class paracetamolSupositorio extends AppCompatActivity {

    private TextView medicina6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paracetamol_supositorio);
        setTitle(R.string.paracetamol_supositorio_CB);

        medicina6=(TextView)findViewById(R.id.mostrarInfo6);
        medicina6.setMovementMethod(new ScrollingMovementMethod());
    }
}
