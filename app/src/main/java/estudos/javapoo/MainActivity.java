package estudos.javapoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Casa minhaCasa = new Casa();
//        minhaCasa.cor = "Douglas vai ser um otimo dev mobile android nativo + RN e C#";

//        Funcionario funcionario = new Funcionario();
//        funcionario.nome = "Douglas";
//        funcionario.salario = 1200;

//       double salarioRecuperado =  funcionario.recuperarSalario( 150, 150 );
//        System.out.println( "O salário é " + salarioRecuperado );

        Animal animal = new Animal();
        animal.correr();
    }
}