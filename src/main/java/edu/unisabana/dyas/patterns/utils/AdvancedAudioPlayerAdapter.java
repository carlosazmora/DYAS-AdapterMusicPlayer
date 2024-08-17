package edu.unisabana.dyas.patterns.utils;

public class AdvancedAudioPlayerAdapter implements AudioPlayer {

    AdvancedAudioPlayer advanced;

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        advanced = new AdvancedAudioPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp4")){
            advanced.playMp4(fileName);
        }else{
            advanced.playVlc(fileName);
        }

    }

    @Override
    public void stop() {
        advanced.stop();
    }
}
