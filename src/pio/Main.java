package pio;

public class Main {

    public static void main(String[] args) {
        int key = 1;
        String t = "ABCXYZ";
        System.out.println("Text: " + t);

        Cipher c = new Cipher();

        t = c.encrypt(t, key);
        System.out.println("Encrypted: " + t);
        t = c.decrypt(t, key);
        System.out.println("Decrypted: " + t);
    }
}
