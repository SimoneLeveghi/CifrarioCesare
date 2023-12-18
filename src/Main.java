public class Main {
    public static void main(String[] args) {
        String cifrato = cifra("Il furly", 3);
        String decifrato = cifra(cifrato, -3);

        System.out.println("Cifrato: " + cifrato);
        System.out.println("Decifrato: " + decifrato);
    }

    public static String cifra(String s, int k) {
        String ret = "";

        for(int i = 0; i < s.length(); ++i) {
            int ascii = s.charAt(i);
            char carCifrato = ' ';

            if(ascii >= 65 && ascii <= 90) {
                carCifrato = (char) (65 + ((ascii - 65 + k) % 26));
            }
            else if(ascii >= 97 && ascii <= 122){
                carCifrato = (char) (97 + ((ascii - 97 + k) % 26));
            }
            ret += carCifrato;
        }

        return ret;
    }
}