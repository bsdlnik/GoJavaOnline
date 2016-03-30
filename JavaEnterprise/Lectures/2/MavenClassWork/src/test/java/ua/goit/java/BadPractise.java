package ua.goit.java;

public class BadPractise {

   /* @Test
    public void testPairTriple() throws Exception {
        Triple<String, Pair<String, String>, Triple<String, Long, Long>> result = new Triple<>();

    }
*/

    public static class Triple<F, S, T> {
        public F first;
        public S second;
        public T third;
    }

    public static class Pair<F, S> {
        public F first;
        public S second;
    }
}
