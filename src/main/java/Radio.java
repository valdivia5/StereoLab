public class Radio extends Component{

    private String station;

    public Radio(){
        super();
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
