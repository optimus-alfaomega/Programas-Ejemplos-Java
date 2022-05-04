/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.colecciones;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author vacax
 */
public class PruebaColecciones {

    static class EstudianteNotas {

        int matricula;
        String nota;
        double indice;

        public void mostrarInformacion() {
            System.out.printf("matricula: %d, nota: %s, indice: %f \n", matricula, nota, indice);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cantidad de estudiante:");
        int cantidad = scanner.nextInt();
        System.out.println("La cantidad de estudiante:" + cantidad);

        //Arreglo. (menos elegante...)
        int[] matriculas = new int[cantidad];
        String[] notas = new String[cantidad];
        double[] indice = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Digite la matricula: ");
            matriculas[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite la Nota: ");
            notas[i] = scanner.nextLine();
        }

        System.out.println("");
        System.out.println("La matriculas digitadas:");
        //foreach
        for (int matricula : matriculas) {
            System.out.println("" + matricula);
        }

        //Usando la clase interna.
        EstudianteNotas[] estudiantes = new EstudianteNotas[cantidad];

        for (int i = 0; i < cantidad; i++) {

            EstudianteNotas est = new EstudianteNotas();

            System.out.println("Digite la matricula: ");
            est.matricula = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite la Nota: ");
            est.nota = scanner.nextLine();

            estudiantes[i] = est;

        }

        for (EstudianteNotas est : estudiantes) {
            est.mostrarInformacion();
        }

        //Por coleccion.
        List<EstudianteNotas> listaEstudiante = new ArrayList<>();
        listaEstudiante.addAll(Arrays.asList(estudiantes));
        System.out.println("La cantidad de elementos en la lista: " + listaEstudiante.size());

        //Mapa, clave = valor.
        Map<Integer, EstudianteNotas> mapaEstudiante = new HashMap<>();
        for (EstudianteNotas est : estudiantes) {
            mapaEstudiante.put(est.matricula, est);
        }
        
        System.out.println("Consultado: "+mapaEstudiante.get(20011136));

    }

}
