package grupoUno.cuadroBasicoGrupoUno.medicamentosCuadroBasicoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.catalogomedicamentos.R;

import org.w3c.dom.Text;

public class metamizolSodicoComprimido extends AppCompatActivity {

    private TextView medicina3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metamizol_sodico_comprimido);
        setTitle(R.string.metamizol_sodico_com_CB);

        medicina3=(TextView)findViewById(R.id.mostrarInfo3);
        medicina3.setMovementMethod(new ScrollingMovementMethod());
    }
}
