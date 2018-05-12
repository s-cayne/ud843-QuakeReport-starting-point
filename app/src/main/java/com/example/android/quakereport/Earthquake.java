package com.example.android.quakereport;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Caine on 3/31/2018.
 */

public class Earthquake {
    private String eMag;
    private String eLoc;
    private String eDate;

    public Earthquake(String mag, String loc, String date){
        eMag = mag;
        eLoc = loc;

        long timeInMilliseconds = Long.parseLong(date);
        Date dateObject = new Date(timeInMilliseconds);

        SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM DD, yyyy");
        String dateToDisplay = dateFormatter.format(dateObject);

        eDate = dateToDisplay;
    }

    public String getMag() { return eMag;}
    public String getLoc(){ return eLoc;}
    public String getDate(){ return eDate;}
}
