package PadraoObserver;

public class Main {
    public static void main(String[] args) {

        //observador
        CarroPolicia carroPolicia = new CarroPolicia();

        //observado
        CarroRoubado carroRoubado = new CarroRoubado();

        //adicionar observador ao observado
        carroRoubado.addObserver(carroPolicia);

        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.esquerda();
        carroRoubado.esquerda();
        carroRoubado.para();
    }
}