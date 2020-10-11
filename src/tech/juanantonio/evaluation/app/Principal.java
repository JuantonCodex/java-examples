package tech.juanantonio.evaluation.app;

import tech.juanantonio.evaluation.entidades.Auto;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Auto auto = new Auto();
        auto.setCodigo(1001);
        auto.setMarca("MVW");
        auto.setModelo("A3");
        auto.setPrecio(50000);
        auto.setStock(20);
        System.out.println("Precio neto:" + auto.calcularNeto());
    }
}
