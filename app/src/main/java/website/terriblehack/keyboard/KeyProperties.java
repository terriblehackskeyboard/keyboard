package website.terriblehack.keyboard;


import java.util.Arrays;

/**
 * Created by feilan on 26/11/16.
 */

public class KeyProperties {
    private CharSequence label;
    private int[] codes;

    public KeyProperties(CharSequence l, int... c) {
        label = l;
        codes = Arrays.copyOf(c, c.length);
    }

    public int getCode(int i) {
        return codes[i];
    }

    public char getLabel(int i) {
        return label.charAt(i);
    }

    public int[] getCodes() {
        return Arrays.copyOf(codes, codes.length);
    }

    public CharSequence getLabels() {
        return label;
    }
}
