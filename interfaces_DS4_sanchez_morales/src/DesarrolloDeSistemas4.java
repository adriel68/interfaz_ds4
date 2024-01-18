interface interfazDS4 {
    int suma(int a, int b);
    int resta(int a, int b);
    int multiplicacion(int a, int b);
    int division(int a, int b);
}

public class DesarrolloDeSistemas4 implements interfazDS4 {

    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    @Override
    public int resta(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("no puedes dividir entre cero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        DesarrolloDeSistemas4 sistema = new DesarrolloDeSistemas4();

        System.out.println("suma: " + sistema.suma(6, 6));
        System.out.println("resta: " + sistema.resta(6, 6));
        System.out.println("multiplicacion: " + sistema.multiplicacion(6, 6));
        System.out.println("division: " + sistema.division(6, 6));
    }
}
