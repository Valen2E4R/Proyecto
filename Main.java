public class Main {

    public static void main(String[] args) {
        int param1 = 30;
        int param2 = 20;
        int param3 = 40;

        var valor = suma(param1, param2, param3);

        System.out.println(valor);
        coche micoche = new coche();
        micoche.AgregarPuertas();
        System.out.println(micoche.puertas);
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class coche {
    public int puertas = 4;

    public void AgregarPuertas() {
        this.puertas++;
    }
}


