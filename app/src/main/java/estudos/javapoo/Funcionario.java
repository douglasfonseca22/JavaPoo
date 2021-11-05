package estudos.javapoo;

class Funcionario {

    String nome;
    double salario;

    double recuperarSalario( double bonus, double descontoAdicional){
        this.salario = this.salario - (this.salario * 0.18);
        return this.salario + bonus - descontoAdicional;
//       System.out.println( this.salario);
    }
}
