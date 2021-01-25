package pio;

public class Cipher {

    final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String encrypt(String text, int key) {
        return _processText(text, key);
    }

    public String decrypt(String text, int key) {
        return _processText(text, -key);
    }

    private String _processText(String text, int key) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); ++i) {
            int ch = text.charAt(i);
            int j = alpha.indexOf(ch);
            j = (j + key + alpha.length()) % alpha.length();
            sb.append(alpha.charAt(j));
        }
        return sb.toString();
    }
}
