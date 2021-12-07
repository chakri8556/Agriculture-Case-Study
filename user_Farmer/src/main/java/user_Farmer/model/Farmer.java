package user_Farmer.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "DETAILS")
public class Farmer {
    @Id
    private int farmerid;
    private String farmername;
    private long phoneno;
    private String farmermailid;

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

    public Farmer(int farmerid, String farmername, long phoneno, String farmermailid) {
        this.farmerid = farmerid;
        this.farmername = farmername;
        this.phoneno = phoneno;
        this.farmermailid = farmermailid;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "farmerid=" + farmerid +
                ", farmername='" + farmername + '\'' +
                ", phoneno=" + phoneno +
                ", farmermailid='" + farmermailid + '\'' +
                '}';
    }
}


