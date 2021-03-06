package com.ijal.ijalkamus;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
public class GenericUtility {
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MMM-yyyy");
    public static String formatUang(double nilai) {
        DecimalFormat formatUang;
        formatUang = new DecimalFormat("#,###.00");
        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setGroupingSeparator('.');
        s.setDecimalSeparator(',');
        formatUang.setDecimalFormatSymbols(s);
        return formatUang.format(nilai);
    }
}
