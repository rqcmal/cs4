/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise.pkg3;

/**
 *
 * @author Quennie
 */
public class NextInQueue {
    private String song;
    private int streams;
    private boolean age; 
    
    public NextInQueue(String _song, int _streams, boolean _age){
        song = _song;
        streams = _streams;
        age = _age;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public int getStreams() {
        return streams;
    }

    public void setStreams(int streams) {
        this.streams = streams;
    }

    public boolean isAge() {
        return age;
    }

    public void setAge(boolean age) {
        this.age = age;
    }
}
