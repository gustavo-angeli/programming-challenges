public class TimeFormatter {
    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }
        long sec = seconds % 60;
        long minutes = seconds % 3600 / 60;
        long hours = seconds % 86400 / 3600;
        long days = seconds % 31536000 / 86400;
        long years = seconds / 31536000;

        StringBuilder message = new StringBuilder();

        if (years > 0) {
            message.append(years).append(" year");
            if (years > 1) {
                message.append("s");
            }
        }

        if (days > 0) {
            if (!message.isEmpty() && hours == 0 && minutes == 0 && sec == 0) {
                message.append(" and ");
            } else if (!message.isEmpty()) {
                message.append(", ");
            }
            message.append(days).append(" day");
            if (days > 1) {
                message.append("s");
            }
        }

        if (hours > 0) {
            if (!message.isEmpty() && minutes == 0 && sec == 0) {
                message.append(" and ");
            } else if (!message.isEmpty()) {
                message.append(", ");
            }
            message.append(hours).append(" hour");
            if (hours > 1) {
                message.append("s");
            }
        }

        if (minutes > 0) {
            if (!message.isEmpty() && sec == 0) {
                message.append(" and ");
            } else if (!message.isEmpty()) {
                message.append(", ");
            }
            message.append(minutes).append(" minute");
            if (minutes > 1) {
                message.append("s");
            }
        }

        if (sec > 0) {
            if (!message.isEmpty()) {
                message.append(" and ");
            }
            message.append(sec).append(" second");
            if (sec > 1) {
                message.append("s");
            }
        }

        return message.toString();
    }

    public static void main(String[] args) {
        System.out.println(formatDuration(3661));
    }
}
