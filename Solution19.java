public class Solution19{
    static int numDays(int month, int year){
	    switch(month){
	        case 4: 
	            return 30;
	        case 6:
	            return 30;
	        case 9:
	            return 30;
	        case 11:
	            return 30;
	        case 2:
	            //This case checks for leap year.
	            
	            //Year divisible by 4.
	            if(year % 4 == 0){
	                // if year falls on a new century.
	                if(year % 100 == 0){
	                    //if century is divisible by 400.
	                    if(year % 400 == 0){
	                        return 29;
	                    }
	                }
	                else{
	                    return 29;
	                }
	            }
	            else{
	               return 28; 
	            }
	        default:
	            return 31;
	    }
	}
    public static void main(String[] args) {
        /*Days of week:
		    0, Sun
		    1, Mon
		    2, Tues
		    3, Wed
		    4, Thurs
		    5, Fri
		    6, Sat.
		*/
		//Jan 1, 1901 was a Tuesday.
		int firstDay = 2;
		int numSundays = 0;
		for(int year = 1901; year <= 2000; year++){
		    int days = numDays(1, year);
		    int offset = days % 7;
		    if(year != 1901){
		        firstDay = (offset + firstDay) % 7;
		    }
		    if(firstDay == 0){
		        numSundays++;
		    }
		    for(int rest = 2; rest <= 12; rest++){
		        firstDay = (offset+firstDay)%7;
                if(firstDay == 0){
                    numSundays++;
                }
                days = numDays(rest,year);
                offset = days % 7;
		    }
		}
		System.out.println(numSundays);
    }
}