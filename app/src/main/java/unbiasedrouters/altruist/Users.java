package unbiasedrouters.altruist;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sarang on 17/09/16.
 */
public class Users {
    public String Address;
    public int credit;
    public Map<String,String> Jobs = new HashMap<>();
    public Map<String,String> JobsTaken = new HashMap<>();
    public String Name;

    public Users(){

    } //Default Constructor

    public Users(String Address, int credit, String Name){
        this.Address=Address;
        this.credit=credit;
        this.Name=Name;
    }

    public int getCredit() {
        return credit;
    }

    public String getAddress() {
        return Address;
    }

    public String getName(){
        return Name;
    }

    public Map<String,String> getJobs(){
        return Jobs;
    }

    public Map<String,String> getJobsTaken(){
        return JobsTaken;
    }
}
