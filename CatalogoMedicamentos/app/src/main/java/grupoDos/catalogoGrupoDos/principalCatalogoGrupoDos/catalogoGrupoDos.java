package grupoDos.catalogoGrupoDos.principalCatalogoGrupoDos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.catalogomedicamentos.R;

import grupoDos.catalogoGrupoDos.medicamentosCatalogoGrupoDos.*;

public class catalogoGrupoDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_grupo_dos);
        setTitle(R.string.catalogo_GrupoDos);
    }

    public void SeleccionCatalogoGrupoDos(View view){
        switch (view.getId()){
            case R.id.btn7_grupoDos:
                Intent btn7=new Intent(this, bupivacainaSolucionUnoGrupoDos.class);
                startActivity(btn7);
                break;
            case R.id.btn8_grupoDos:
                Intent btn8=new Intent(this, bupivacainaSolucionDosGrupoDos.class);
                startActivity(btn8);
                break;
            case R.id.btn9_grupoDos:
                Intent btn9=new Intent(this, besilatoDeCisatracurioGrupoDos.class);
                startActivity(btn9);
                break;
            case R.id.btn10_grupoDos:
                Intent btn10=new Intent(this, desfluranoGrupoDos.class);
                startActivity(btn10);
                break;
            case R.id.btn11_grupoDos:
                Intent btn11=new Intent(this, diazepamSolucionUnoGrupoDos.class);
                startActivity(btn11);
                break;
            case R.id.btn12_grupoDos:
                Intent btn12=new Intent(this, diazepamSolucionDosGrupoDos.class);
                startActivity(btn12);
                break;
            case R.id.btn13_grupoDos:
                Intent btn13=new Intent(this, efedrinaGrupoDos.class);
                startActivity(btn13);
                break;
            case R.id.btn14_grupoDos:
                Intent btn14=new Intent(this, etomidatoGrupoDos.class);
                startActivity(btn14);
                break;
            case R.id.btn15_grupoDos:
                Intent btn15=new Intent(this, fentaniloGrupoDos.class);
                startActivity(btn15);
                break;
            case  R.id.btn16_grupoDos:
                Intent btn16=new Intent(this, flumazenilGrupoDos.class);
                startActivity(btn16);
                break;
            case R.id.btn17_grupoDos:
                Intent btn17=new Intent(this, isofluranoGrupoDos.class);
                startActivity(btn17);
                break;
            case R.id.btn18_grupoDos:
                Intent btn18=new Intent(this, ketaminaGrupoDos.class);
                startActivity(btn18);
                break;
            case R.id.btn19_grupoDos:
                Intent btn19=new Intent(this, midazolamSolucionUnoGrupoDos.class);
                startActivity(btn19);
                break;
            case R.id.btn20_grupoDos:
                Intent btn20=new Intent(this, midazolamSolucionDosGrupoDos.class);
                startActivity(btn20);
                break;
            case R.id.btn21_grupoDos:
                Intent btn21=new Intent(this, naloxonaCatalogoGrupoDos.class);
                startActivity(btn21);
                break;
            case R.id.btn22_grupoDos:
                Intent btn22= new Intent(this, neostigminaGrupoDos.class);
                startActivity(btn22);
                break;
            case R.id.btn23_grupoDos:
                Intent btn23=new Intent(this, propofolEmulsionUnoGrupoDos.class);
                startActivity(btn23);
                break;
            case R.id.btn24_grupoDos:
                Intent btn24=new Intent(this, propofolEmulsionDosGrupoDos.class);
                startActivity(btn24);
                break;
            case R.id.btn25_grupoDos:
                Intent btn25=new Intent(this, bromuroDeRocuronioGrupoDos.class);
                startActivity(btn25);
                break;
            case R.id.btn26_grupoDos:
                Intent btn26=new Intent(this, ropivacainaGrupoDos.class);
                startActivity(btn26);
                break;
            case R.id.btn27_grupoDos:
                Intent btn27=new Intent(this, sevofluranoGrupoDos.class);
                startActivity(btn27);
                break;
            case R.id.btn28_grupoDos:
                Intent btn28=new Intent(this, cloruroDeSuxametonioGrupoDos.class);
                startActivity(btn28);
                break;
            case R.id.btn29_grupoDos:
                Intent btn29=new Intent(this, tiopentalSodicoGrupoDos.class);
                startActivity(btn29);
                break;
            case R.id.btn30_grupoDos:
                Intent btn30=new Intent(this, vecuronioGrupoDos.class);
                startActivity(btn30);
                break;
        }
    }
}
