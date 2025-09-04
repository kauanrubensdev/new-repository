public class aprendendo{

    public static void main(String[] args) {
        Carro meuCarro = new Carro("sandero"); //instanciando a classe carro
        Carro meuCarro2 = new Carro("celta"); 
        Carro meuCarro3= new Carro("gol");
        //chamando metodo construtor
        meuCarro2.acelerar();//chamando metodo

        Carro meuCarro4 = new Mobi(); //polimorfismo é quando uma classe herda outra classe
        meuCarro4.acelerar();
        Carro meuCarro5 = new sandero();
        meuCarro5.acelerar();
    }
}
class Mobi extends Carro {
    public Mobi() {
        super("Mobi");
    }
}

class sandero extends Carro {
    public sandero() {
        super("Sandero");
    }
}

//classes abstratas são classes que não podem ser instanciadas
//elas servem como base para outras classes
//elas podem ter metodos abstratos (sem corpo) e metodos concretos (com corpo)
//uma classe que herda uma classe abstrata deve implementar todos os metodos abstratos



//metodo construtor
class Carro{
    //criando atributo
    String modelo;
    //os atributos são as variaves de uma classe
    public Carro(String modelo){
        this.modelo = modelo; 
        // o modelo vai receber por parametro o que eu colocar dentro dos () acima
        //por que this?
        //this faz referencia a instancia atual
    }
    //os metodos sao as funcoes de uma classe
    //o metodo pode ou nao retornar algo
    //void significa que o metodo nao retorna nada
    public void acelerar(){
        System.out.println("acelerando o carro " + this.modelo);
    }
    //os modificadores de acesso sao:
    //public - pode ser acessado por qualquer classe, não posso ter dois public na mesma classe
    //private - so pode ser acessado pela propria classe
    //protected - pode ser acessado por classes do mesmo pacote ou subclasses
    //default (sem declarar) - pode ser acessado por classes do mesmo pacote
}

