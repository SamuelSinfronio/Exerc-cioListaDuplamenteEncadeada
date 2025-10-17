package principal;

public class BinarioDecimal {
    public static int converter(String binario, int indice) {
        if (indice == binario.length()) return 0;

        int bit = binario.charAt(binario.length() - 1 - indice) - '0';
        return bit * (int)Math.pow(2, indice) + converter(binario, indice + 1);
    }

    public static void main(String[] args) {
        String binario = "11001"; // exemplo: 11001 = 25
        int decimal = converter(binario, 0);
        System.out.println("Binário: " + binario + " → Decimal: " + decimal);
    }
}

