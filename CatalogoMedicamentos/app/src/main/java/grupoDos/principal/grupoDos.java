package grupoDos.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.catalogomedicamentos.R;
import grupoDos.cuadroBasicoGrupoDos.principalCuadroBasicoGrupoDos.cuadroBasicoGrupoDos;
import grupoDos.catalogoGrupoDos.principalCatalogoGrupoDos.catalogoGrupoDos;

public class grupoDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_dos);
        setTitle(R.string.anestesia);
    }

    public void CuadroBasicoGrupoDos(View view){
        Intent cuadroBasicoGrupoDos=new Intent(this, cuadroBasicoGrupoDos.class);
        startActivity(cuadroBasicoGrupoDos);
    }

    public void CatalogoGrupoDos(View view){
        Intent catalogoGrupoDos=new Intent(this, catalogoGrupoDos.class);
        startActivity(catalogoGrupoDos);
    }
}
