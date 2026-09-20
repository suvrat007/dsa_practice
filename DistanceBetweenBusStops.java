package Grind75;

public class DistanceBetweenBusStops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int total = 0;
        int currentSumm = 0;

        for(int i :distance){
            total+=i;
        }

        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }

        for (int i = start; i < destination; i++) {
            currentSumm+=distance[i];
        }

        return Math.min(currentSumm, (total-currentSumm));
    }
}
