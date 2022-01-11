package user_Dealer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "DealerDetails") //storing into that particular collection of database
public class Dealer {

@Id //primary key
        private int dealerid;
        private String dealername;   // attributes of dealer class
        private long phoneno;
        private String dealermailid;
    public Dealer() { } //empty constructor

    //for updating and reading values we use getters and setters
    public int getDealerid() {
        return dealerid;
    }

    public void setDealerid(int dealerid) {
        this.dealerid = dealerid;
    }

    public String getDealername() {
        return dealername;
    }

    public void setDealername(String dealername) {
        this.dealername = dealername;
    }

    public long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    public String getDealermailid() {
        return dealermailid;
    }

    public void setDealermailid(String dealermailid) {
        this.dealermailid = dealermailid;
    }
        public Dealer(int dealerid, String dealername, long phoneno, String dealermailid) {
            this.dealerid = dealerid;
            this.dealername = dealername;
            this.phoneno = phoneno;
            this.dealermailid = dealermailid;
        }

    @Override
    public String toString() { //to get string representation of an object
        return "Dealer{" +
                "dealerid=" + dealerid +
                ", dealername='" + dealername + '\'' +
                ", phoneno=" + phoneno +
                ", dealermailid='" + dealermailid + '\'' +
                '}';
    }
}



