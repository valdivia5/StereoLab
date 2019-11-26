public class Stereo {

    private Radio radio;
    private CDPlayer cdPlayer;
    private RecordPlayer recordPlayer;
    private String name;

    public Stereo(String name){
        this.name = name;
        this.radio = new Radio();
        this.cdPlayer = new CDPlayer();
        this.recordPlayer = new RecordPlayer();
    }


    public String tuneRadio(String newStation) {
        return radio.tune(newStation);
    }

    public String getRadioStation() {
        return radio.getStation();
    }
}
