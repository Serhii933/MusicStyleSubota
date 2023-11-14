public class Music {
    public static void main(String[] args) {

        MusicStyles[] musicBands = {new RockMusic(), new PopMusic(), new ClassicMusic()};
        for (MusicStyles band : musicBands) {
            band.playMusic();
        }
    }
}

