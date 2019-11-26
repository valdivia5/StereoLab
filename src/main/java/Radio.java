public class Radio {

    private String station;

    public Radio(){
        this.station = "";
    }

    public String tune(String newStation){
        this.station = newStation;
        return this.station;
    }

    public String getStation() {
        return this.station;
    }
}
