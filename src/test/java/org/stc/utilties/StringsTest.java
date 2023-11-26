package org.stc.utilties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringsTest {

    @Test
    void success_result_returns_1(){
        String actual = Strings.reverseSubstring("abd(jnb)asdf");
        String expected = "abd(bnj)asdf";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void success_result_returns_2(){
        String actual = Strings.reverseSubstring("abdjnbasdf");
        String expected = "abdjnbasdf";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void success_result_returns_3(){
        String actual = Strings.reverseSubstring("dd(df)a(ghhh)");
        String expected = "dd(fd)a(hhhg)";
        Assertions.assertEquals(expected, actual);
    }
}