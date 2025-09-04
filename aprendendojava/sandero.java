// as interfaces definem um padrão que se deve seguir
public class sandero implements carro{
    public void acelerar(){
        System.out.println("acelerando o sandero");
    }
    public void freiar(){
        System.out.println("freando o sandero");
    }
    public void parar(){
        System.out.println("parando o sandero");
    }
    // a interface carro tem parar freiar e acelerar entao o sandero tem que ter esses metodos
}