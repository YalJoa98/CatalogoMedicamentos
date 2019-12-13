package grupoTres.catalogoGrupoTres.principalCatalogoGrupoTres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.catalogomedicamentos.R;

import grupoTres.principal.grupoTres;

public class catalogoGrupoTres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_grupo_tres);
        setTitle(R.string.catalogo_GrupoTres);
    }
}
