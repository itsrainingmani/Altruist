package unbiasedrouters.altruist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class CreateJob extends AppCompatActivity {
Button b;
EditText t1,t2,t3;
    GPSTracker gps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_job);
    b=(Button)findViewById(R.id.submit);
    t1=(EditText)findViewById(R.id.jobTitleText);
     t2=(EditText)findViewById(R.id.jobDescText);
    t3=(EditText)findViewById(R.id.editText);
        gps = new GPSTracker(CreateJob.this);

    }

}
