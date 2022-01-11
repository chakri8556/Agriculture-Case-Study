package user_Farmer.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FarmerDetails") //storing data into that particular collection of database.
public class Farmer {
    @Id //primary key
    private int farmerid;
    private String farmername; //attributes
    private long phoneno;
    private String farmermailid;
    private String farmerlocation;
    public Farmer(){ } //Empty Constructor


    public Farmer(int farmerid, String farmername, long phoneno, String farmermailid, String farmerlocation) {
        this.farmerid = farmerid;
        this.farmername = farmername; //constructors
        this.phoneno = phoneno;
        this.farmermailid = farmermailid;
        this.farmerlocation = farmerlocation;
    }
     // getters&setters for updating and reading values
    public int getFarmerid() {
        return farmerid;
    }

    public void setFarmerid(int farmerid) {
        this.farmerid = farmerid;
    }

    public String getFarmername() {
        return farmername;
    }

    public void setFarmername(String farmername) {
        this.farmername = farmername;
    }

    public long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    public String getFarmermailid() {
        return farmermailid;
    }

    public void setFarmermailid(String farmermailid) {
        this.farmermailid = farmermailid;
    }

    public String getFarmerlocation() {
        return farmerlocation;
    }

    public void setFarmerlocation(String farmerlocation) {
        this.farmerlocation = farmerlocation;
    }

    @Override
    public String toString() { //For getting string representation of an object
        return "Farmer{" +
                "farmerid=" + farmerid +
                ", farmername='" + farmername + '\'' +
                ", phoneno=" + phoneno +
                ", farmermailid='" + farmermailid + '\'' +
                ", farmerlocation='" + farmerlocation + '\'' +
                '}';
    }
}



