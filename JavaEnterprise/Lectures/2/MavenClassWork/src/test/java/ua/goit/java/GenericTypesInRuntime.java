package ua.goit.java;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class GenericTypesInRuntime {

    @Test
    public void testName() throws Exception {
        List<Integer> ints = Arrays.asList(10, 20, 30);
        List objects = Arrays.asList(10, 20, 30);

        ints.add(10);
        int i = ints.get(0);

       //if (ints instanceof List<Integer>)  не сможем проверить в старой


    }

}
