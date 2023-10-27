package lab_06;

public class TimeConverter {
    public static void main(String[] args) {
        String inputString = "2 hrs and 5 minutes";
        int totalMinutes = convertToMinutes(inputString);
        System.out.println("Total minutes: " + totalMinutes);
    }

    public static int convertToMinutes(String input) {
        String[] parts = input.split(" ");

        int totalMinutes = 0;
        for (int i = 0; i < parts.length; i++) {
            if (isNumeric(parts[i])) {
                int timeValue = Integer.parseInt(parts[i]);
                if (i < parts.length - 1 && parts[i + 1].equals("hrs")) {
                    totalMinutes += timeValue * 60;
                } else if (i < parts.length - 1 && parts[i + 1].equals("minutes")) {
                    totalMinutes += timeValue;
                }
            }
        }

        return totalMinutes;
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
