package grupoTres.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.catalogomedicamentos.R;

import grupoTres.cuadroBasicoGrupoTres.principalCuadroBasicoGrupoTres.cuadroBasicoGrupoTres;
import grupoTres.catalogoGrupoTres.principalCatalogoGrupoTres.catalogoGrupoTres;

public class grupoTres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_tres);
        setTitle(R.string.cardiologia);
    }

    public void CuadroBasicoGrupoTres(View view){
        Intent cuadroBasicoGrupoTres=new Intent(this, cuadroBasicoGrupoTres.class);
        startActivity(cuadroBasicoGrupoTres);
    }

    public void CatalogoGrupoTres(View view){
        Intent catalogoGrupoTres=new Intent(this, catalogoGrupoTres.class);
        startActivity(catalogoGrupoTres);
    }
}
