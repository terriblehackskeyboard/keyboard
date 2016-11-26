package website.terriblehack.keyboard;


import java.util.Arrays;

/**
 * Created by feilan on 26/11/16.
 */

public class KeyProperties {
    private CharSequence label;
    private int[] code;

    public KeyProperties(CharSequence l, int... c) {
        label = l;
        code = Arrays.copyOf(c, c.length);
    }

    public int getCode(int i) {
        return code[i];
    }

    public char getLabel(int i) {
        return label.charAt(i);
    }
}
