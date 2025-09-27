package org.com.unisabana.caso1;

public class Cliente {
    public static void main(String[] args) {
        Diseñador director = new Diseñador();
        ConstruirAuto builder = new ConstruirAuto();

        director.autoDeportivo(builder);
        Automovil deportivo = builder.getResultado();

        director.autoSedan(builder);
        Automovil sedan = builder.getResultado();

        director.autoSUV(builder);
        Automovil suv = builder.getResultado();

        System.out.println(deportivo);
        System.out.println(sedan);
        System.out.println(suv);
    }
}