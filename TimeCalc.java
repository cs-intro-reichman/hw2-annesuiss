public class TimeCalc {
    public static void main(String[] args) {
        //command line argument
        String timeString = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);


        //divide the input and convert to int
        String[] time = timeString.split(":");
        int hh = Integer.parseInt(time[0]);
        int mm = Integer.parseInt(time[1]);
//Total minutes = (10 hours * 60 minutes) + 30 minutes + 4055 minutes = 4685 minutes;
// Total hours = 4685 / 60 = 78;
//New hours = 78 % 24 = 6; 
// The remainder operator % is also known as modulo New minutes = 4685 – (78 * 60) = 5;

        if (hh >= 0 && hh < 24 && mm >= 0 && mm < 60) {
            int totalMinutes = (hh * 60) + mm + minutesToAdd ;
            int totalHours = totalMinutes/60;
            int newHours = totalHours % 24;
            int newMinutes = totalMinutes - (totalHours * 60);

            /*System.out.println(hh);
            System.out.println(mm);
            System.out.println(minutesToAdd);
            System.out.println(newHours);
            System.out.println(newMinutes);*/

            if (newHours<10){
            System.out.print("0"+newHours+":");
            }
            else System.out.print(newHours+":");
            if (newMinutes< 10) {
                System.out.println("0"+newMinutes);
            }
            else System.out.println(newMinutes);
            
        }
    }
}
