/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg2;

/**
 *
 * @author Quennie
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NextInQueue song_1 = new NextInQueue("Mayonaise by The Smashing Pumpkins",true,61097916);
        NextInQueue song_2 = new NextInQueue("Is There Someone Else? by The Weeknd",false,426843677);
        NextInQueue song_3 = new NextInQueue("Golden Slumbers by The Beatles",true,95708572);
        
        Song song1 = new Song("Just Wanna Rock by Lil Uzi Vert","Rap");
        Song song2 = new Song("Cool With You by NewJeans","K-Pop");
        
        Singer singer1 = new Singer ("Taylor Swift",song1);
        singer1.performForAudience(12);
        singer1.changeFavSong(song2);
        
        
        
    }
    
}
