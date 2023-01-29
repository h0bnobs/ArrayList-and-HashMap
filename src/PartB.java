import java.util.HashMap;

/**
 * @author ()
 * @version ()
 */
public class PartB
{

    public static void main(String[] args) {
        String lyrics = "Sing, sing a song/Let the world sing along/" +
                "Sing of love there could be/Sing for you and for me/" +
                "Sing, sing a song/Make it simple to last/" +
                "Your whole life long/Don't worry that it's not/" +
                "Good enough for anyone/Else to hear/" +
                "Just sing, sing a song";
        System.out.println("Original lyrics: " + lyrics);

        String newLyrics = lyrics.replace("/", " ");
        String newerLyrics = newLyrics.replace(",", "");
        String newestLyrics = newerLyrics.replace("'", "").trim().toLowerCase();

        HashMap<String, Integer> map = new HashMap<>();//create hashmap
        String[] arr = newestLyrics.split(" ");//convert String newestLyrics to an array

        for (String s : arr) {//could be made into a for each.
            if (map.containsKey(s)) {//if the hashmap DOES contain the word then find its value
                int count = map.get(s);//which is int count and add 1 to it again.
                map.put(s, count + 1);//put this word into the map with the updated value of its count.
            } else {
                map.put(s, 1);//if the word is not yet in the hashmap, meaning if it is the first
                //time it has been found, put it in and assign its value (number of occurences) to 1
            }
        }

        int max = 0;
        for (int freq: map.values()) {
            if (freq > max) {
                max = freq;
            }
        }
        System.out.println("Number of words total: " + arr.length);
        System.out.println("Count of words in those lyrics: " + map);
        System.out.println("The max frequency is " + max);
        System.out.println("Words with the max frequency are:");
        for (String word: map.keySet()) {
            if (map.get(word).equals(max)) {
                System.out.print(word + " ");
            }
        }
    }
}

//original bluej code, didnt change much ↓↓

//import java.util.HashMap;
//
///**
// * Write a description of class PartB here.
// *
// * @author (your name)
// * @version (a version number or a date)
// */
//public class PartB
//{
//    // instance variables - replace the example below with your own
//    private String lyrics;
//
//    /**
//     * Constructor for objects of class PartB
//     */
//    public PartB()
//    {
//
//    }
//
//    /**
//     * An example of a method - replace this comment with your own
//     *
//     * @param  y  a sample parameter for a method
//     * @return    the sum of x and y
//     */
//    public void epicSorting()
//    {
//        String lyrics = "Sing, sing a song/Let the world sing along/" +
//                "Sing of love there could be/Sing for you and for me/" +
//                "Sing, sing a song/Make it simple to last/" +
//                "Your whole life long/Don't worry that it's not/" +
//                "Good enough for anyone/Else to hear/" +
//                "Just sing, sing a song";
//        System.out.println("Original lyrics: " + lyrics);
//        String newLyrics = lyrics.replace("/", " ");
//        String newerLyrics = newLyrics.replace(",", "");
//        String newestLyrics = newerLyrics.replace("'", "");
//
//        HashMap<String, Integer> map = new HashMap<>();//create hashmap
//        String arr[] = newestLyrics.split(" ");//convert String newestLyrics to an array
//        for(int i=0; i<arr.length; i++) {
//            if(map.containsKey(arr[i])) {//if the hashmap DOES contain the word then find it's value
//                int count = map.get(arr[i]);//which is int count and add 1 to it again.
//                map.put(arr[i],count + 1);//put this word into the map with the updated value of it's count.
//            }
//            else {
//                map.put(arr[i],1);//if the word is not yet in the hashmap, meaning if it is the first
//                //time it has been found, put it in and assign it's value (number of occurences) to 1
//            }
//        }
//
//        System.out.println("Count of words in those lyrics: "+ map);
//
//    }
//}


