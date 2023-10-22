package ch_midterm;

public class TestStrSplit {
    void printWords(String[] words, char[] chars){
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                for(int k = 0; k < chars.length; k++){
                    if( words[i].charAt(j) == chars[k] ) {
                        System.out.println(words[i]);
                        break;
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        String str = "In blandit lacus ac sapien dictum, elementum\n" +
                "fringilla sem varius. Vestibulum consectetur\n" +
                "metus at felis porttitor, a rhoncus neque\n" +
                "consectetur. Integer vehicula felis non metus\n" +
                "eleifend, in blandit risus ullamcorper. Phasellus\n" +
                "mauris nisi, facilisis et quam placerat, congue\n" +
                "venenatis diam. Praesent in erat odio. Phasellus\n" +
                "sit amet efficitur sem. Ut quis mi venenatis, \n" +
                "feugiat justo eu, rhoncus velit. Suspendisse\n" +
                "iaculis tempus sapien. Integer mauris neque, \n" +
                "posuere sed mi at, aliquet facilisis nibh. Cras\n" +
                "vel blandit lorem. Aliquam suscipit, nisl id \n" +
                "condimentum condimentum, purus magna maximus sem, \n" +
                "vitae vehicula diam nisi ac enim.\n";

        String[] s2 = str.split(" ");
        char[] chars = {'b'};
        TestStrSplit tss = new TestStrSplit();
        tss.printWords(s2, chars);
    }
}
