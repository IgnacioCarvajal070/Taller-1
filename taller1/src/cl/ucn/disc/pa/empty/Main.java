package cl.ucn.disc.pa.empty;
import edu.princeton.cs.stdlib.StdDraw;
import java.awt.*;

public class Main {
 // Este metodo comprueba que las coordenadas no se salgan del borde de la pantalla y al hacerlo retorna la variable direccion con su signo contrario
    public static double Comprobacion (double a,double b){
        if (a>=50 || a<=-50){
            b=-b;
        }
    return b;
    }
    /*Este metodo genera el movimiento de las coordenadas al multiplicar la variable velocidad (e) por la variable direccion (a1,b1,c1,d1) y sumando el resultado a las coordenadas,
    retornando una lista con las nuevas 4 coordenadas*/

    public static double [] lineas (double a,double b,double c,double d,double e, double a1,double b1,double c1,double d1){
        a+= e*a1;
        b+= e*b1;
        c+= e*c1;
        d+= e*d1;
        double [] lista = {a,b,c,d};
        return lista;

    }
    //Este metodo guarda las coordenadas de las lineas para poder volverse a usar en la siguiente iteracion del ciclo
    public static double [] Glinea (double a,double b,double c,double d){
        double[]guardado = {a,b,c,d};
        return guardado;
    }
    public static void main(String[] args) {

        // Creamos el minimo y maximo de la pantalla donde se encontraran las lineas
        double min = -50.0;
        double max = 50.0;

        // Creamos el minimo y maximo del area de aparicion de las lineas
        double rmax = 40.0;
        double rmin = -40.0;
        //Indicamos los limites de la pantalla donde estaran las lineas y activamos el double buffering para evitar parpadeos
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        StdDraw.enableDoubleBuffering();

        //Creamos los puntos de las lineas ((x1,y1) y (x2,y2) con un rango definido por la varibale rmax y rmin)
        double x1 = rmin + (rmax - rmin) * Math.random();
        double y1 = rmin + (rmax - rmin) * Math.random();
        double x2 = rmin + (rmax - rmin) * Math.random();
        double y2 = rmin + (rmax - rmin) * Math.random();
        //Guardamos estas coordenadas en listas y ademas a las lineas subsiguientes a la primera le restamos unidades para que esten detras de la primera
        double [] linea1= {x1,y1,x2,y2};
        double [] linea2= {x1-1,y1-1,x2-1,y2-1};
        double [] linea3= {x1-2,y1-2,x2-2,y2-2};
        double [] linea4= {x1-3,y1-3,x2-3,y2-3};
        double [] linea5= {x1-4,y1-4,x2-4,y2-4};
        double [] linea6= {x1-5,y1-5,x2-5,y2-5};
        //Creamos una variable velocidad con Math.random, para evitar que la velocidad sea 0 creamos un if que lo evite.
        double vel= Math.random();
        if (vel== 0){
            vel += 0.1;
        }
        // Creamos las variables direccion para cada punto de las coordenadas y lineas
        double direx11 = 1;
        double direx21 = 1;
        double direy11 = 1;
        double direy21 = 1;

        double direx12 = 1;
        double direx22 = 1;
        double direy12 = 1;
        double direy22 = 1;

        double direx13 = 1;
        double direx23 = 1;
        double direy13 = 1;
        double direy23 = 1;

        double direx14 = 1;
        double direx24 = 1;
        double direy14 = 1;
        double direy24 = 1;

        double direx15 = 1;
        double direx25 = 1;
        double direy15 = 1;
        double direy25 = 1;

        double direx16 = 1;
        double direx26 = 1;
        double direy16 = 1;
        double direy26 = 1;




        /*Hacemos un ciclo while cuya funcion sea sobrescribir constantemente la posicion de las lineas, sumandole la variable
        velocidad, creando movimimiento*/
        while (true){
            StdDraw.clear();
            //Llamamos al metodo llamado lineas (Explicacion arriba)
            double []linea1m = lineas(linea1[0],linea1[1],linea1[2],linea1[3],vel,direx11,direy11,direx21,direy21);
            //Realizamos una comprobacion constante de cada coordenada mediante el metodo Comprobacion (explicacion arriba)
            direx11 = Comprobacion (linea1m[0],direx11);
            direy11 = Comprobacion (linea1m[1],direy11);
            direx21 = Comprobacion (linea1m[2],direx21);
            direy21 = Comprobacion (linea1m[3],direy21);
            linea1 = Glinea(linea1m[0],linea1m[1],linea1m[2],linea1m[3]);

            //Repitiendo esto con cada linea
            double []linea2m = lineas(linea2[0],linea2[1],linea2[2],linea2[3],vel,direx12,direy12,direx22,direy22);
            direx12 = Comprobacion (linea2m[0],direx12);
            direy12 = Comprobacion (linea2m[1],direy12);
            direx22 = Comprobacion (linea2m[2],direx22);
            direy22 = Comprobacion (linea2m[3],direy22);
            linea2 = Glinea(linea2m[0],linea2m[1],linea2m[2],linea2m[3]);

            double []linea3m = lineas(linea3[0],linea3[1],linea3[2],linea3[3],vel,direx13,direy13,direx23,direy23);
            direx13 = Comprobacion (linea3m[0],direx13);
            direy13 = Comprobacion (linea3m[1],direy13);
            direx23 = Comprobacion (linea3m[2],direx23);
            direy23 = Comprobacion (linea3m[3],direy23);
            linea3 = Glinea(linea3m[0],linea3m[1],linea3m[2],linea3m[3]);

            double []linea4m = lineas(linea4[0],linea4[1],linea4[2],linea4[3],vel,direx14,direy14,direx24,direy24);
            direx14 = Comprobacion (linea4m[0],direx14);
            direy14 = Comprobacion (linea4m[1],direy14);
            direx24 = Comprobacion (linea4m[2],direx24);
            direy24 = Comprobacion (linea4m[3],direy24);
            linea4 = Glinea(linea4m[0],linea4m[1],linea4m[2],linea4m[3]);

            double []linea5m = lineas(linea5[0],linea5[1],linea5[2],linea5[3],vel,direx15,direy15,direx25,direy25);
            direx15 = Comprobacion (linea5m[0],direx15);
            direy15 = Comprobacion (linea5m[1],direy15);
            direx25 = Comprobacion (linea5m[2],direx25);
            direy25 = Comprobacion (linea5m[3],direy25);
            linea5 = Glinea(linea5m[0],linea5m[1],linea5m[2],linea5m[3]);

            double []linea6m = lineas(linea6[0],linea6[1],linea6[2],linea6[3],vel,direx16,direy16,direx26,direy26);
            direx16 = Comprobacion (linea6m[0],direx16);
            direy16 = Comprobacion (linea6m[1],direy16);
            direx26 = Comprobacion (linea6m[2],direx26);
            direy26 = Comprobacion (linea6m[3],direy26);
            linea6 = Glinea(linea6m[0],linea6m[1],linea6m[2],linea6m[3]);

            //Cambiamos de color cada linea con un color diferente para cada una
            StdDraw.setPenColor(Color.RED);
            //Dibujamos la linea usando la lista de la linea correspondiente
            StdDraw.line(linea1m[0],linea1m[1],linea1m[2],linea1m[3]);

            StdDraw.setPenColor(Color.BLUE);
            StdDraw.line(linea2m[0],linea2m[1],linea2m[2],linea2m[3]);

            StdDraw.setPenColor(Color.GREEN);
            StdDraw.line(linea3m[0],linea3m[1],linea3m[2],linea3m[3]);

            StdDraw.setPenColor(Color.ORANGE);
            StdDraw.line(linea4m[0],linea4m[1],linea4m[2],linea4m[3]);

            StdDraw.setPenColor(Color.MAGENTA);
            StdDraw.line(linea5m[0],linea5m[1],linea5m[2],linea5m[3]);

            StdDraw.setPenColor(Color.YELLOW);
            StdDraw.line(linea6m[0],linea6m[1],linea6m[2],linea6m[3]);

            //Para que se vea mas fluido usamos el codigo StdDraw.show
            StdDraw.show(20);


        }

    }
}