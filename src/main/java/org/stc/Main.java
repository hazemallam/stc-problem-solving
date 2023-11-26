package org.stc;

import org.stc.utilties.Strings;

public class Main {
    public static void main(String[] args) {
        String result = Strings.reverseSubstring("dd(df)a(ghhh)");
        System.out.println(result);
        System.out.println(Strings.reverseSubstring("(ed(et(oc))el)"));
    }
}