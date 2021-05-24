/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoahorcado;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Paloma
 */
public class JuegoAhorcado {

    /**
     * @param args the command line arguments
     */
    
    public static void mensajeError () {
        //método que muestra por pantalla un mensaje de error
        //lo he creado porque muestro este mensaje en muchas ocasiones a lo largo del código
        System.out.println("\nERROR. INTRODUCE UN VALOR VÁLIDO");
    }
   
    public static void infoNormas () {
        //método que muestra por pantalla las normas del juego
        //lo he creado porque es información muy larga y creo que queda más limpio de esta manera
        System.out.println("\n---NORMAS---");
        System.out.println("· EL PROGRAMA PROPORCIONARÁ UNA PALABRA ALEATORIA DEPENDIENDO DEL NIVEL ESCOGIDO");
        System.out.println("· PODRÁS IR ELIGIENDO LETRAS Y EL PROGRAMA REVISARÁ SI PERTENECEN A LA PALABRA SELECCIONADA");
        System.out.println("· SI LA LETRA ESTÁ, EL PROGRAMA LA ANOTARÁ EN EL LUGAR CORRESPONDIENTE");
        System.out.println("· SI LA LETRA NO ESTÁ, PERDERÁS UNA OPORTUNIDAD (DISPONES DE 6) Y DIBUJARÁ UNA PARTE DEL MUÑECO");
        System.out.println("· EL PROGRAMA TE PROPORCIONARÁ UN RESUMEN DE TUS PARTIDAS CUANDO DECIDAS DEJAR DE JUGAR");
        System.out.println("¡¡BUENA SUERTE!!");
    }
    
    public static String palabraAleatoria (String nivel) throws FileNotFoundException {
        //método que elige una palabra aleatoria del fichero correspondiente
        //lo he creado porque resuelve un problema
        File facil = new File ("src/juegoahorcado/facil");
        File medio = new File ("src/juegoahorcado/medio");
        File dificil = new File ("src/juegoahorcado/dificil");
        Scanner entradaFacil = new Scanner (facil);
        Scanner entradaMedio = new Scanner (medio);
        Scanner entradaDificil = new Scanner (dificil);
        String [] palabras = new String [50];
        int numeroAleatorio = 0;
        String palabraAleatoria = "";
        switch (nivel) {
                case "1":
                    for (int i = 0; i < palabras.length; i++) {
                        palabras [i] = entradaFacil.next();
                    }
                    break;
                case "2":
                    for (int i = 0; i < palabras.length; i++) {
                        palabras [i] = entradaMedio.next();
                    }
                    break;
                case "3":
                    for (int i = 0; i < palabras.length; i++) {
                        palabras [i] = entradaDificil.next();
                    }
                    break;
            }
        numeroAleatorio = (int) (Math.random()*49+1);
        palabraAleatoria = palabras [numeroAleatorio];
        return palabraAleatoria;
    }
    
    public static void muñecoErrores (int errores) {
        //método que va mostrando por pantalla el muñeco según los errores
        //lo he creado porque creo que queda más limpio de esta forma
        switch (errores) {
            case 1:
                System.out.println("\nLETRA INCORRECTA");
                System.out.println("      ______________________________        \n     ||                            |        \n"
                        + "     ||                            |        \n     ||                           _|_       \n"
                        + "     ||      \n     ||      \n     ||      \n     ||     \n     ||     \n     ||     \n     ||      \n"
                        + "     ||      \n     ||      \n     ||      \n     ||     \n"
                        + " ____||____                                 ");
                break;
            case 2:
                System.out.println("\nLETRA INCORRECTA");
                System.out.println("      ______________________________        \n     ||                            |        \n"
                        + "     ||                            |        \n     ||                           _|_       \n"
                        + "     ||                         _(___)_     \n     ||                         | - - |     \n"
                        + "     ||                         |  <  |     \n     ||                         |_==__|     \n"
                        + "     ||      \n     ||      \n     ||      \n     ||     \n     ||     \n     ||     \n     ||      \n"
                        + " ____||____                                 ");
                break;
            case 3:
                System.out.println("\nLETRA INCORRECTA");
                System.out.println("      ______________________________        \n     ||                            |        \n"
                        + "     ||                            |        \n     ||                           _|_       \n"
                        + "     ||                         _(___)_     \n     ||                         | - - |     \n"
                        + "     ||                         |  <  |     \n     ||                         |_==__|     \n"
                        + "     ||                            ||       \n     ||                            ||       \n"
                        + "     ||                            ||       \n     ||                            ||       \n"
                        + "     ||     \n     ||     \n     ||     \n     ||      \n ____||____                                 ");
                break;
            case 4:
                System.out.println("\nLETRA INCORRECTA");
                System.out.println("      ______________________________        \n     ||                            |        \n"
                        + "     ||                            |        \n     ||                           _|_       \n"
                        + "     ||                         _(___)_     \n     ||                         | - - |     \n"
                        + "     ||                         |  <  |     \n     ||                         |_==__|     \n"
                        + "     ||                            ||       \n     ||                          ||||       \n"
                        + "     ||                        ||  ||       \n     ||                       ||   ||       \n"
                        + "     ||     \n     ||     \n     ||     \n     ||      \n ____||____                                 ");
                break;
            case 5:
                System.out.println("\nLETRA INCORRECTA");
                System.out.println("     ______________________________        \n     ||                            |        \n"
                        + "     ||                            |        \n     ||                           _|_       \n"
                        + "     ||                         _(___)_     \n     ||                         | - - |     \n"
                        + "     ||                         |  <  |     \n     ||                         |_==__|     \n"
                        + "     ||                            ||       \n     ||                          ||||||     \n"
                        + "     ||                        ||  ||  ||   \n     ||                       ||   ||    || \n"
                        + "     ||     \n     ||     \n     ||     \n     ||      \n ____||____                                 ");
                break;
            case 6:
                System.out.println("\nLETRA INCORRECTA");
                System.out.println("     ______________________________        \n     ||                            |        \n"
                        + "     ||                            |        \n     ||                           _|_       \n"
                        + "     ||                         _(___)_     \n     ||                         | - - |     \n"
                        + "     ||                         |  <  |     \n     ||                         |_==__|     \n"
                        + "     ||                            ||       \n     ||                          ||||||     \n"
                        + "     ||                        ||  ||  ||   \n     ||                       ||   ||    || \n"
                        + "     ||                          ||  ||     \n     ||                         ||    ||    \n"
                        + "     ||                        ||      ||   \n ____||____                                 ");
                break;     
        }
    }
    
    public static void resumenPartidas(int ganadasFacil, int ganadasMedio, int ganadasDificil, int perdidasFacil, int perdidasMedio, int perdidasDificil) {
        //método que muestra por pantalla el resumen de las partidas
        //lo he creado porque creo que queda más limpio de esta forma
        System.out.println("");
        System.out.println("=================================================\n|	     RESUMEN DE LA PARTIDA		|");
        System.out.println("|	-NIVEL FÁCIL: ganadas " + ganadasFacil + ", perdidas " + perdidasFacil + "     |");
        System.out.println("|	-NIVEL MEDIO: ganadas " + ganadasMedio + ", perdidas " + perdidasMedio + "     |");
        System.out.println("|	-NIVEL DIFÍCIL: ganadas " + ganadasDificil + ", perdidas " + perdidasDificil + "   |");
        System.out.println("=================================================");
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        //VARIABLES
        String nivel = "";
        String normas = "";
        String palabra = "";
        int letrasAcertadas = 0; 
        char [] palabraCorrecta;
        String letraEnString = "";
        char letra = ' ';
        int errores = 0;
        boolean acierta = false;
        int numIntentos = 1;
        boolean termina = false;
        String seguir = "";
        int ganadasFacil = 0, ganadasMedio = 0, ganadasDificil = 0;
        int perdidasFacil = 0, perdidasMedio = 0, perdidasDificil = 0;
        boolean terminar = false;
        boolean instrucciones = false;
        String letrasErroneas = "";
        //OPERACIONES
        while (terminar == false) { 
            //PIDE EL NIVEL
            System.out.println("\nESCOGE UN NIVEL E INTRODUCE EL NÚMERO CORRESPONDIENTE:");
            System.out.println("    1) FÁCIL :) (4-5 LETRAS)");
            System.out.println("    2) MEDIO :| (6-9 LETRAS)");
            System.out.println("    3) DIFÍCIL :( (+10 LETRAS)");
            System.out.print("--> ");
            nivel = teclado.next(); 
            //CONTROLA QUE INTRODUZCA UN NIVEL VÁLIDO
            while (!nivel.equals("1") && !nivel.equals("2") && !nivel.equals("3")) { 
                mensajeError(); 
                System.out.print("--> ");
                nivel = teclado.next();
            }
            //MUESTRA POR PANTALLA EL NIVEL ELEGIDO Y LAS LETRAS QUE TENDRÁ LA PALABRA
            if (nivel.equals("1")) { 
                System.out.println("\nHAS SELECCIONADO EL NIVEL FÁCIL \nLAS PALABRAS TENDRÁN 4 O 5 LETRAS");
            } else if (nivel.equals("2")) {
                System.out.println("\nHAS SELECCIONADO EL NIVEL MEDIO \nLAS PALABRAS TENDRÁN ENTRE 6 Y 9 LETRAS");
            } else if (nivel.equals("3")) {
                System.out.println("\nHAS SELECCIONADO EL NIVEL DIFÍCIL \nLAS PALABRAS TENDRÁN 10 LETRAS O MÁS");
            }
            if (instrucciones == false) { // esto lo he hecho para que de la opción de mostrar las instrucciones sólo en la primera partida
                //PREGUNTA SI QUIERE VER LAS NORMAS O EMPEZAR A JUGAR
                System.out.println("\nPARA VER LAS NORMAS INTRODUCE \"1\""); 
                System.out.println("PARA COMENZAR DIRECTAMENTE INTRODUCE \"2\"");
                System.out.print("--> ");
                normas = teclado.next(); 
                //CONTROLA QUE INTRODUZCA UN VALOR VÁLIDO
                while (!normas.equals("1") && !normas.equals("2")) {
                    mensajeError(); 
                    System.out.print("--> ");
                    normas = teclado.next();
                }
                if (normas.equals("1")) {
                    //MUESTRA POR PANTALLA LAS NORMAS
                    infoNormas(); 
                    //PIDE QUE INTRODUZCAS EL DOS PARA EMPEZAR A JUGAR
                    System.out.println("\nINTRODUCE \"2\" PARA COMENZAR A JUGAR");
                    System.out.print("--> ");
                    normas = teclado.next(); 
                    //CONTROLA QUE INTRODUZCAS UN VALOR VÁLIDO
                    while (!normas.equals("2")) { 
                        mensajeError(); 
                        System.out.print("--> ");
                        normas = teclado.next();
                    }
                }
            }
            if (instrucciones == true) { // esto lo he hecho para que a partir de la segunda partida siga pidiendo el dos para empezar la partida y no empiece de golpe
                System.out.println("\nINTRODUCE \"2\" PARA COMENZAR A JUGAR");
                System.out.print("--> ");
                normas = teclado.next();
                while (!normas.equals("2")) {
                    mensajeError();
                    System.out.print("--> ");
                    normas = teclado.next();
                } 
            }
            instrucciones = true; // vuelvo a inicializar la variable para que funcione bien
            //ESCOGE UNA PALABRA ALEATORIA
            palabra = palabraAleatoria (nivel); 
            //RELLENA EL ARRAY CON LA PALABRA SELECCIONADA
            palabraCorrecta = palabra.toCharArray(); 
            //CREA Y RELLENA UN SEGUNDO ARRAY QUE SE IRÁ RELLENANDO SEGÚN VAYA ACERTANDO LETRAS
            char [] palabraRellenar = new char [palabra.length()];
            for (int i = 0; i < palabraRellenar.length; i++) { 
                palabraRellenar [i] = '-';
            }
            //COMIENZA LA PARTIDA
            while (termina == false){ 
                //MUESTRA EL INTENTO EN EL QUE ESTÁ Y LAS LETRAS QUE LLEVA ACERTADAS
                System.out.print("\nINTENTO " + numIntentos + ": "); 
                for (int i = 0; i < palabraRellenar.length; i++) { 
                    System.out.print(palabraRellenar[i]);
                }
                System.out.println(" (" + letrasAcertadas + " de " + palabra.length() + ")"); 
                //PIDE UNA LETRA
                System.out.println("INTRODUCE UNA LETRA");
                System.out.print("--> ");
                letraEnString = teclado.next();
                //COMPRUEBA QUE METAS SÓLO UNA LETRA
                while (letraEnString.length() > 1) {
                    mensajeError();
                    System.out.print("--> ");
                    letraEnString = teclado.next();
                }
                //CONVIERTE A CHAR Y COMPRUEBA QUE NO HAYAS METIDO UN NÚMERO
                letra = letraEnString.charAt(0);
                while (Character.isDigit(letra)) {
                    mensajeError();
                    System.out.print("--> ");
                    letraEnString = teclado.next();
                    while (letraEnString.length() > 1) {
                        mensajeError();
                        System.out.print("--> ");
                        letraEnString = teclado.next();
                    }
                    letra = letraEnString.charAt(0);
                }
                //COMPRUEBA QUE NO HAYA METIDO LA LETRA ANTES
                while (letrasErroneas.contains(letraEnString)) {
                    mensajeError();
                    System.out.print("--> ");
                    letraEnString = teclado.next();
                    while (letraEnString.length() > 1) {
                        mensajeError();
                        System.out.print("--> ");
                        letraEnString = teclado.next();
                    }
                    letra = letraEnString.charAt(0);
                    while (Character.isDigit(letra)) {
                        mensajeError();
                        System.out.print("--> ");
                        letraEnString = teclado.next();
                        while (letraEnString.length() > 1) {
                            mensajeError();
                            System.out.print("--> ");
                            letraEnString = teclado.next();
                        }
                        letra = letraEnString.charAt(0);
                    }
                }
                //RECORRE EL ARRAY DE LA PALABRA SELECCIONADA COMPROBANDO SI LA LETRA ESTÁ EN LA PALABRA
                for (int i = 0; i < palabraCorrecta.length; i++) { 
                    //SI LA LETRA ESTÁ EN LA PALABRA LA METE EN EL SEGUNDO ARRAY
                    if (palabraCorrecta[i] == Character.toLowerCase(letra)) { 
                        letrasAcertadas++; 
                        palabraRellenar [i] = Character.toUpperCase(letra); 
                        acierta = true; //se pone en true para que no cuente la ronda como un error
                    } 
                }
                numIntentos++; //va subiendo para que en la frase en la que pone en qué intento está vaya subiendo el número
                //ENTRA SI LA LETRA NO ESTABA EN LA PALABRA Y MUESTRA EL MUÑECO
                if (acierta == false) { 
                    letrasErroneas = letrasErroneas + " " + letra;
                    errores++; 
                    muñecoErrores (errores);
                    System.out.println("\nLETRAS ERRONEAS: " + letrasErroneas);
                }
                acierta = false; // vuelve a false para la siguiente ronda
                //ENTRA CUANDO HA LLEGADO AL LÍMITE DE ERRORES Y TERMINA LA PARTIDA
                if (errores == 6) {
                    termina = true;//se pone en true para que no vuelva a pedir una nueva letra
                    //VA SUMANDO LAS PARTIDAS PERDIDAS PARA EL RESUMEN FINAL
                    if (nivel.equals("1")) {
                        perdidasFacil ++;
                    } else if (nivel.equals("2")) {
                        perdidasMedio ++;
                    } else if (nivel.equals("3")) {
                        perdidasDificil ++;
                    }
                    //MUESTRA EL MENSAJE DE QUE HA PERDIDO POR PANTALLA
                    System.out.println("\nHAS LLEGADO AL LÍMITE DE ERRORES");
                    System.out.println("LA PALABRA CORRECTA ERA " + palabra.toUpperCase());
                    System.out.println("--- GAME OVER ---");
                }
                //ENTRA CUANDO ACIERTA LA PALABRA Y TERMINA LA PARTIDA
                if (letrasAcertadas == palabraCorrecta.length) {
                    termina = true;//se pone en true para que no vuelva a pedir una nueva letra
                    //VA SUMANDO LAS PARTIDAS GANADAS PARA EL RESUMEN FINAL
                    if (nivel.equals("1")) {
                        ganadasFacil ++;
                    } else if (nivel.equals("2")) {
                        ganadasMedio ++;
                    } else if (nivel.equals("3")) {
                        ganadasDificil ++;
                    }
                    //MUESTRA POR PANTALLA EL MENSAJE DE QUE HA GANADO
                    System.out.println("\n --> " + palabra.toUpperCase() + " <--");
                    System.out.println("¡¡HAS ACERTADO LA PALABRA!!");
                    System.out.println("--- WIN ---");
                }
            }
            //VUELVE A INICIALIZAR LAS VARIABLES PARA QUE FUNCIONE EN UNA SEGUNDA PARTIDA
            termina = false;
            errores = 0;
            letrasAcertadas = 0;
            numIntentos = 1;
            letrasErroneas = "";
            //PREGUNTA SI QUIERE JUGAR OTRA PARTIDA O SI QUIERE VER DIRECTAMENTE EL RESUMEN
            System.out.println("\nSI QUIERES VOLVER A JUGAR INTRODUCE \"1\"");
            System.out.println("SI QUIERES TERMINAR Y VER UN RESUMEN DE TUS PARTIDAS PULSA \"2\"");
            System.out.print("--> ");
            seguir = teclado.next();
            //COMPRUEBA QUE INTRODUCE UN VALOR VÁLIDO
            while (!seguir.equals("1") && !seguir.equals("2")) {
                mensajeError();
                System.out.print("--> ");
                seguir = teclado.next();
            }
            //SI INTRODUCE DOS MUESTRA EL RESUMEN DE LAS PARTIDAS
            if (seguir.equals("2")) {
                resumenPartidas (ganadasFacil, ganadasMedio, ganadasDificil, perdidasFacil, perdidasMedio, perdidasDificil);
                terminar = true;//se pone en true para que si no quiere seguir jugando no entre de nuevo en el while grande
            }
            //SI INTRODUCE UNO VUELVE AL PRINCIPIO DEL BUCLE
        }    
    } 
}
