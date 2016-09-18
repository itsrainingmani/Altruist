package unbiasedrouters.altruist;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sarang on 17/09/16.
 */
public class Users {
    public String email;
    public String credit;
    public Map<String,String> Jobs;
    public Map<String,String> JobsTaken;
    public String Name;
    public String Uid;

    public Users(){

    } //Default Constructor

    public Users(String Uid, String name, String email, String credit){
        this.Uid=Uid;
        this.email=email;
        if(credit!=null)
            this.credit=credit;
        else credit = "100";
        this.Name=name;
    }
    public String getUid() { return Uid;}
    public String getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
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
