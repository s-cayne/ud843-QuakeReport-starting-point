package com.example.android.quakereport;

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
        eDate = date;
    }

    public String getMag() { return eMag;}
    public String getLoc(){ return eLoc;}
    public String getDate(){ return eDate;}
}
