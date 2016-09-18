package unbiasedrouters.altruist;

/**
 * Created by Sarang on 17/09/16.
 */
public class JobsAvailable {
    public String Address;
    public String Description;
    public String Host;
    public String Name;

    public JobsAvailable(){

    }
    public JobsAvailable(String Address, String Description, String Host, String Name){
        this.Address=Address;
        this.Description=Description;
        this.Host=Host;
        this.Name=Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getDescription() {
        return Description;
    }

    public String getHost() {
        return Host;
    }

    public String getName() {
        return Name;
    }
}

