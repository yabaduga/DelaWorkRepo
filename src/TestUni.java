public class TestUni {
    public static void main(String[] args) {
        final char carDeb = 200, carFin = 300; // initialisation de 2 variables de type caractère
        char c; // déclaration de la variable de type caractère 'c'
        for (c = carDeb; c < carFin; c++) {// pour c de carDeb (200) à  carFin (300) faire c=c+1
            System.out.print((int) c + "-"); // affiche le code Unicode
            System.out.print(c + " "); // affiche le caractère correspondant au code int(c) du caractère c
        }
        int i =12;
            i++;
            ++i;
            int p = (int) Math.pow(i,3);
        System.out.println();
        System.out.println("résultat " + i/3);
            System.out.println("reste " + i%3);
            System.out.print(i);
        System.out.print("p "+ p);
        float x =1e30f;
    float y;
    y =x*x;
    System.out.println(x +" a pour carré "+ y);
    float zero =0.f;
    float z =y/zero;
    System.out.println(y + " divise par 0 = " +z);
    y=15;
    System.out.println(y + " divise par 0 = "+ z);
    }
    }

