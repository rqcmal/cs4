/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg1;

/**
 *
 * @author Rita Malleon
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String song_1 = "Mayonaise by The Smashing Pumpkins";
        String song_2 = "Is There Someone Else? by The Weeknd";
        String song_3 = "Golden Slumbers by The Beatles";
        
        boolean age_1 = true;
        boolean age_2 = false;
        boolean age_3 = true;
        
        int streams_1 = 61097916;
        int streams_2 = 426843677;
        int streams_3 = 95708572;
      
     System.out.println(
       "Song 1\n" + "Title: " + song_1 + "\n" + "Number of streams: " + streams_1 + "\n" + "Is the song older than me?: " + age_1 + "\n"   
     );
     
     System.out.println(
       "Song 2\n" + "Title: " + song_2 + "\n" + "Number of streams: " + streams_2 + "\n" + "Is the song older than me?: " + age_2 + "\n" 
     );
     
     System.out.println(
       "Song 3\n" + "Title: " + song_3 + "\n" + "Number of streams: " + streams_3 + "\n" + "Is the song older than me?: " + age_3 + "\n" 
     );
     
     int streams_123 = streams_1 + streams_2 + streams_3;
        boolean age_123 = age_1 && age_2 && age_3;
        var streams_12 = streams_2 - streams_1;
                
        System.out.println("Total number of streams: " + streams_123);
        System.out.println("Are all the songs older than me?: " + age_123);
        System.out.println("How much more streams does the second song have compared to the first song?: " + streams_12);
    }
    
}
