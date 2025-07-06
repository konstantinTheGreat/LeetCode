package easy;

public class _495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {

        int poisonedWindow = timeSeries[0] + duration - 1;
        int prevSecond = timeSeries[0];
        int totalPoisonedDuration = 0;

        for (int i = 1; i < timeSeries.length; i++) {

            if (poisonedWindow >= timeSeries[i]) {
                totalPoisonedDuration += timeSeries[i] - prevSecond;
            } else {
                totalPoisonedDuration += duration;
            }
            prevSecond = timeSeries[i];
            poisonedWindow = timeSeries[i] + duration - 1;
        }
        totalPoisonedDuration += duration;

        return totalPoisonedDuration;
    }
}
