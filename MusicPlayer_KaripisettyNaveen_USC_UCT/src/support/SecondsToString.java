package support;

import java.time.Duration;

@SuppressWarnings("DuplicatedCode")
public class SecondsToString {

    public static String lengthToString(int length) {
        if (length < 0) {
            return "--:--";
        }
        if (length < 60) {
            return length + "s";
        }
        if (length < 3600) {
            Duration duration = Duration.ofSeconds(length);
            long MM = duration.toMinutes();
            long SS = duration.toSecondsPart();
            return String.format("%d:%02d", MM, SS);
        }
        Duration duration = Duration.ofSeconds(length);
        long HH = duration.toHours();
        long MM = duration.toMinutesPart();
        long SS = duration.toSecondsPart();
        return String.format("%d:%02d:%02d", HH, MM, SS);
    }

    public static String currentTimeToString(int currentTime, int totalTime) {
        if (currentTime > totalTime | currentTime < 0) {
            return "--:--";
        }
        if (totalTime < 60) {
            return currentTime + "s";
        }
        if (totalTime < 3600) {
            Duration duration = Duration.ofSeconds(currentTime);
            long MM = duration.toMinutes();
            long SS = duration.toSecondsPart();
            return String.format("%d:%02d", MM, SS);
        }
        Duration duration = Duration.ofSeconds(currentTime);
        long HH = duration.toHours();
        long MM = duration.toMinutesPart();
        long SS = duration.toSecondsPart();
        return String.format("%d:%02d:%02d", HH, MM, SS);
    }
}
