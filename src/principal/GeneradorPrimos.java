package principal;

/**
 *
 * @author VANESSA
 */
class GeneradorPrimos {
    
    public int generarPrimoAleatorio() {
        int numeroAleatorio;
        do {
            numeroAleatorio = (int) (Math.random() * 100) + 1;
        } while (esPrimo(numeroAleatorio));
        return numeroAleatorio;
    }

    private boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
