/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg3;

/**
 *
 * @author Quennie
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NextInQueue song_1 = new NextInQueue("Maybe Someday by The Cure",7432471,true);
        NextInQueue song_2 = new NextInQueue("Bizarre Love Triangle by New Order",126468019,true);
        NextInQueue song_3 = new NextInQueue("C U Girl by Steve Lacy",302654835,false);
        
        Song song1 = new Song("Drive by Deftones","Nu Metal");
        Song song2 = new Song ("Luna by The Smashing Pumpkins","Alternative Rock");
        
        Singer singer1 = new Singer ("Drake",song2);
        Singer singer2 = new Singer ("Mac DeMarco",song1);
        singer1.performForAudience(12);
        singer1.changeFavSong(song2);
        singer2.performForAudience(12,singer1);
    }
    
    
}