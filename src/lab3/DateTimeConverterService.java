/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Mitch
 */
public class DateTimeConverterService {
    private LocalDate startDate;
    private LocalDate endDate;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
    
    public final int getDifferenceBetweenDates(){
        return startDate.compareTo(endDate);
    }

    public void setStartDate(String startDate) {
        this.startDate = LocalDate.parse(startDate);
    }

    public void setEndDate(String endDate) {
        this.endDate = LocalDate.parse(endDate);
    }
    
}
