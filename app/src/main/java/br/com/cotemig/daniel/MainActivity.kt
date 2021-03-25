package br.com.cotemig.daniel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonDolar = findViewById<LinearLayout>(R.id.dolar)
        var buttonEuro = findViewById<LinearLayout>(R.id.euro)
        var buttonRublo = findViewById<LinearLayout>(R.id.rublo)
        var buttonDirra = findViewById<LinearLayout>(R.id.dirra)
        var buttonIene = findViewById<LinearLayout>(R.id.iene)
        var buttonRupia = findViewById<LinearLayout>(R.id.rupia)
        var valor = findViewById<EditText>(R.id.valor)

        buttonDolar.setOnClickListener{
            calculoDolar(valor.text.toString().toDouble())
        }
        buttonEuro.setOnClickListener{
            calculoEuro(valor.text.toString().toDouble())
        }
        buttonRublo.setOnClickListener{
            calculoRublo(valor.text.toString().toDouble())
        }
        buttonDirra.setOnClickListener{
            calculoDirra(valor.text.toString().toDouble())
        }
        buttonIene.setOnClickListener{
            calculoIene(valor.text.toString().toDouble())
        }
        buttonRupia.setOnClickListener{
            calculoRupia(valor.text.toString().toDouble())
        }

    }

    fun calculoDolar(valor:Double){
        var convertText = findViewById<TextView>(R.id.textConversao)
        var resultado = findViewById<TextView>(R.id.resultado)
        var dolar = valor * 0.18
        convertText.text = resources.getString(R.string.convert_dolar)
        resultado.text = String.format("U$ %.2f", dolar)
    }

    fun calculoEuro(valor:Double){
        var convertText = findViewById<TextView>(R.id.textConversao)
        var resultado = findViewById<TextView>(R.id.resultado)
        var euro = valor * 0.15
        convertText.text = resources.getString(R.string.convert_euro)
        resultado.text = String.format("%.2f €", euro)
    }

    fun calculoRublo(valor:Double){
        var convertText = findViewById<TextView>(R.id.textConversao)
        var resultado = findViewById<TextView>(R.id.resultado)
        var rublo = valor * 13.53
        convertText.text = resources.getString(R.string.convert_rublo)
        resultado.text = String.format("%.2f ₱", rublo)
    }

    fun calculoDirra(valor:Double){
        var convertText = findViewById<TextView>(R.id.textConversao)
        var resultado = findViewById<TextView>(R.id.resultado)
        var dirra = valor * 1.49
        convertText.text = resources.getString(R.string.convert_dirra)
        resultado.text = String.format("%.2f Dhs", dirra)
    }

    fun calculoIene(valor:Double){
        var convertText = findViewById<TextView>(R.id.textConversao)
        var resultado = findViewById<TextView>(R.id.resultado)
        var iene = valor * 20.30
        convertText.text = resources.getString(R.string.convert_iene)
        resultado.text = String.format("¥ %.2f", iene)
    }

    fun calculoRupia(valor:Double){
        var convertText = findViewById<TextView>(R.id.textConversao)
        var resultado = findViewById<TextView>(R.id.resultado)
        var rupia = valor * 13.18540
        convertText.text = resources.getString(R.string.convert_rupia)
        resultado.text = String.format("%.2f INR", rupia)
    }

}