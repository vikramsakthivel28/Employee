package prperation;

public class WeekDay {
	 public static void main(String[] args) {
	        // Using a for loop to create the string
	        String[] days = {"SUN", "MON", "TUE", "WED", "THURS", "FRI", "SAT"};
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < days.length; i++) {
	            sb.append(days[i]);
	            if (i < days.length - 1) {
	                sb.append(", ");
	            }
	        }
	        
	        // Creating object and setting the string
	        DaysChecker checker = new DaysChecker();
	        checker.setDaysString(sb.toString());
	        
	        // Splitting and processing
	        checker.splitDays();
	        checker.checkDays();
	    }
	
}
	class DaysChecker {
	    private String daysString;
	    private String[] daysArray;
	    private int weekdayCount;
	    private int weekendCount;

	    // Constructor
	    public DaysChecker() {
	        this.daysString = "";
	        this.weekdayCount = 0;
	        this.weekendCount = 0;
	    }

	    // Getter and Setter for daysString
	    public String getDaysString() {
	        return daysString;
	    }

	    public void setDaysString(String daysString) {
	        this.daysString = daysString;
	    }

	    // Getter for daysArray
	    public String[] getDaysArray() {
	        return daysArray;
	    }

	    // Method to split the string into an array
	    public void splitDays() {
	        this.daysArray = this.daysString.split(", ");
	    }

	    // Method to check and print weekdays and weekends
	    public void checkDays() {
	        int index = 0;
	        while (index < daysArray.length) {
	            String day = daysArray[index];
	            if (day.startsWith("S")) {
	                System.out.println(day + " is a WEEKEND");
	                weekendCount++;
	            } else {
	                System.out.println(day + " is a WEEKDAY");
	                weekdayCount++;
	            }
	            index++;
	        }
	        System.out.println("Total Weekdays: " + weekdayCount);
	        System.out.println("Total Weekends: " + weekendCount);
	    }

	  
}
