/*
 Condicionales I.

 Crea una clase Condicionales con los siguientes métodos estáticos:

 - aprobado(float nota):
 . si la nota es mayor o igual que 5 muestra por pantalla "APROBADO" y devuelve 1.
 . si la nota es menor que 5 muestra por pantalla "SUSPENSO" y devuelve 0.

 - saldo(float ingresos, float gastos):
 . Calcula los ingresos menos los gastos y lo guarda como 'saldo'.
 . si el saldo es positivo (o cero) muestra un mensaje como "¡Enhorabuena!, te sobran X€".
 . si el saldo es negativo muestra un mensaje como "¡Lo siento!, estás en números rojos".
 . En cualquier caso devuelve el saldo.

 - parOimpar. 
 . Recibe un número entero y devuelva la cadena "PAR" si el número es par e "IMPAR" en caso contrario.
 (recordad que en un número par su resto de la división entre 2 es 0).

 - mayor
 . Recibe dos enteros y muestra por pantalla cuál de ellos es mayor (mediante if, sin usar el método max de la clase Math)

 - dividir.
 . Recibe dos float: dividendo y divisor.
 . Si el divisor es cero no intentará realizar la división (puesto que daría error). En tal caso mostrará un mensaje de error y devolverá 0.
 . Si el divisor no es cero, realiza la división y devuelve el resultado. 

 Crea una clase Test con un método main que pruebe los diferentes métodos de la clase Condicionales.
 */
public class Condicional1 {

    public static boolean aprobado(float nota) {
        if (nota >= 5) {
            System.out.println("Aprobado");
            return true;
        } else {
            System.out.println("Suspenso");
            return false;
        }
    }

    public static float saldo(float ingresos, float gastos) {
        float saldo = ingresos - gastos;
        if (saldo >= 0) {
            System.out.printf("¡Enhorabuena!, te sobran %.2f€ \n", saldo);
        } else {
            System.out.println("¡Lo siento!, estás en números rojos");
        }
        return saldo;
    }

    public static void parOImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.printf("%d es Par \n", numero);
        } else {
            System.out.printf("%d es Impar \n", numero);
        }
    }

    public static int mayor(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    public static float dividir(float divisor, float dividendo) {
        if (divisor == 0) {
            System.out.println("El dividendo es 0");
            return 0;
        } else {
            System.out.printf("La division es %.2f \n", dividendo / divisor);
            return dividendo / divisor;
        }
    }
}
