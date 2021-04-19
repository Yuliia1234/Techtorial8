package Method;

import java.time.LocalDate;
import java.time.Year;

public class AgeCalculator {
    public int  Age (int your_year){

        int current_year=2021;
       int result = LocalDate.now().getYear()-your_year;

       return result;
    }
}
