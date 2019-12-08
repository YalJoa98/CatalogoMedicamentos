package grupoUno.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import grupoUno.catalogoGrupoUno.principalCatalogoGrupoUno.catalogoGrupoUno;
import grupoUno.cuadroBasicoGrupoUno.principalCuadroBasicoGrupoUno.cuadroBasicoGrupoUno;

import com.example.catalogomedicamentos.R;

public class grupoUno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_uno);
        this.setTitle(R.string.analgesia);
    }

    public void CuadroBasicoGrupoUno(View view){
        Intent cuadrobasico = new Intent(this, cuadroBasicoGrupoUno.class);
        startActivity(cuadrobasico);
    }

    public void CatalogoGrupoUno(View view){
        Intent catalogo = new Intent(this, catalogoGrupoUno.class);
        startActivity(catalogo);
    }
}
