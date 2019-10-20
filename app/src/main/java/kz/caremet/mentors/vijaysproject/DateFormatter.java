package kz.caremet.mentors.vijaysproject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    public static String getFormattedStringFromDate(Date date){
        SimpleDateFormat dateFormater = new SimpleDateFormat("dd.mm.yyyy hh:mm");
        return dateFormater.format(date);
    }

}
