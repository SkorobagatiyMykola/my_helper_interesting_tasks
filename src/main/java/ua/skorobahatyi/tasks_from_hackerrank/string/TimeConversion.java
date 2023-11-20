package ua.skorobahatyi.tasks_from_hackerrank.string;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:00:00AM"));
        System.out.println(timeConversion("07:05:45PM"));

        String str = "12345";
        int width = 8;

        String formatted = String.format("%0" + width + "d", Integer.valueOf(str));
        System.out.println(formatted);
    }

    private static String timeConversion(String s) {
        // Write your code here
        String format = s.substring(8);

        String[] arr = s.substring(0, 8).split(":");
        int ss = Integer.valueOf(arr[2]);
        int mm = Integer.valueOf(arr[1]);
        int hh = Integer.valueOf(arr[0]);

        if (ss >= 60) {
            ss = ss % 60;
            mm++;
        }

        if (mm >= 60) {
            mm = mm % 60;
            hh++;
        }

        if (hh >= 12) {
            hh = hh % 12;
        }
        hh = format.equals("PM") ? (hh + 12) : hh;
        String formatted = String.format("%02d:%02d:%02d", hh, mm, ss);
        return formatted;
    }
}
