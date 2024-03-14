// declaração do pacote onde esta classe está localizada

package br.com.marialbano.appapresentese

// importação de bibliotecas necessárias
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

// definição da classe MainAcivity que herda da classe AppCompatActivity
class MainActivity : AppCompatActivity() {

    // declaração de propriedades para as views que serão usadas na atividade

    private lateinit var nomeEmpresa: TextView
    private lateinit var atuacaoEmpresa: TextView
    private lateinit var resultado: TextView

    //Metodo chamado quando a atividade é criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Define o layout da atividade a partir do arquivo XML (activity_main.xml)
        setContentView(R.layout.activity_main)

        nomeEmpresa=findViewById(R.id.nomeEmpresa)
        atuacaoEmpresa=findViewById(R.id.atuacaoEmpresa)
        resultado=findViewById(R.id.resultado)


        // inicializa as propriedades com as views correspondentes
        nomeEmpresa.text = "FIAP"
        atuacaoEmpresa.text = "Analista de dados"
        resultado.text = ""

        // funcao chamada quando o botao é clicado ou quando o usuario da um TAP
        fun combinarTextos(view:View){
            //criar uma string combinando o texto das views nomeEmpresa e atuacaoEmpresa
            val textoFinal = "${nomeEmpresa.text} - ${atuacaoEmpresa.text}"

            //define o texto da view resultado com o texto combinado
            resultado.text= textoFinal
        }

    }
}