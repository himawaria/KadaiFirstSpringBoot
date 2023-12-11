package com.techacademy2;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{yyyymmdd}")
    public String dispDayOfWeek(@PathVariable String yyyymmdd) {
        String str = yyyymmdd;
        String year = str.substring(0, 4);
        String month = str.substring(4, 6);
        String day = str.substring(6, 8);

        int iYear = Integer.parseInt(year);
        int iMonth = Integer.parseInt(month);
        int iDay = Integer.parseInt(day);

        LocalDate today = LocalDate.of(iYear, iMonth, iDay);

        return today.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US);
    }

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        String sRes = String.valueOf(res);
        return sRes;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        String sRes = String.valueOf(res);
        return sRes;
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        String sRes = String.valueOf(res);
        return sRes;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        String sRes = String.valueOf(res);
        return sRes;
    }
}
