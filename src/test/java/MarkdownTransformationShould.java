/*
* "" -> []
* "a" -> []
* "any text [a link](url)" -> ["[a link](url)"]
* "any text [a link](url) more text [another link](url)" -> ["[a link](url)", "[another link](url)"]
*/

import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarkdownTransformationShould {
    @Test
    void return_empty_list_string_is_empty(){
        String empty = "";

        String[] result = LinkSearcher.find(empty);

        Assertions.assertArrayEquals(new String[0], result);

    }

    private static class LinkSearcher {
        public static String[] find(String empty) {
            
            return new String[0];
        }
    }
}
