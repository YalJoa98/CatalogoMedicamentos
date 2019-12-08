package grupoUno.catalogoGrupoUno.principalCatalogoGrupoUno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.catalogomedicamentos.R;
import grupoUno.catalogoGrupoUno.medicamentosCatalogoGrupoUno.*;

public class catalogoGrupoUno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_grupo_uno);
        setTitle(R.string.catalogo_GrupoUno);
    }

    public void SeleccionCatalogo(View view){
        switch (view.getId()){
            case R.id.btn8_Catalogo:
                Intent btn8=new Intent(this, buprenorfinaSolucionCatalogoGrupoUno.class);
                startActivity(btn8);
                break;
            case R.id.btn9_Catalogo:
                Intent btn9=new Intent(this, buprenorfinaParcheCatalogoGrupoUno.class);
                startActivity(btn9);
                break;
            case R.id.btn10_Catalogo:
                Intent btn10=new Intent(this, clonixinatoCatalogoGrupoUno.class);
                startActivity(btn10);
                break;
            case R.id.btn11_Catalogo:
                Intent btn11=new Intent(this, dexmetomidinaSolucionUnoCatalogoGrupoUno.class);
                startActivity(btn11);
                break;
            case R.id.btn12_Catalogo:
                Intent btn12=new Intent(this, dexmetomidinaSolucionDosCatalogoGrupoUno.class);
                startActivity(btn12);
                break;
            case R.id.btn13_Catalogo:
                Intent btn13=new Intent(this, dexmetomidinaSolucionTresCatalogoGrupoUno.class);
                startActivity(btn13);
                break;

            case R.id.btn14_Catalogo:
                Intent btn14=new Intent(this, fentaniloCatalogoGrupoUno.class);
                startActivity(btn14);
                break;
            case R.id.btn15_Catalogo:
                Intent btn15=new Intent(this, ketorolacoCatalogoGrupoUno.class);
                startActivity(btn15);
                break;
            case R.id.btn16_Catalogo:
                Intent btn16=new Intent(this, morfinaCatalogoGrupoUno.class);
                startActivity(btn16);
                break;
            case R.id.btn17_Catalogo:
                Intent btn17=new Intent(this, nalbufinaSolucionUnoCatalogoGrupoUno.class);
                startActivity(btn17);
                break;
            case R.id.btn18_Catalogo:
                Intent btn18=new Intent(this, nalbufinaSolucionDosCatalogoGrupoUno.class);
                startActivity(btn18);
                break;
            case R.id.btn19_Catalogo:
                Intent btn19=new Intent(this, paracetamolSolucionUnoCatalogoGrupoUno.class);
                startActivity(btn19);
                break;
            case R.id.btn20_Catalogo:
                Intent btn20=new Intent(this, paracetamolSolucionDosCatalagoGrupoUno.class);
                startActivity(btn20);
                break;
            case R.id.btn21_Catalogo:
                Intent btn21=new Intent(this, tramadolCatalogoGrupoUno.class);
                startActivity(btn21);
                break;
            case R.id.btn22_Catalogo:
                Intent btn22=new Intent(this, tramadolParacetamolCatalogoGrupoUno.class);
                startActivity(btn22);
                break;
        }

    }
}
