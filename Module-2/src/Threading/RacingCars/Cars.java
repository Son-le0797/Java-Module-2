package Threading.RacingCars;


import java.util.Random;

import static Threading.RacingCars.Main.DISTANCE;

public class Cars implements Runnable{

    private String carName;

    public Cars(String carName) {
        this.carName = carName;
    }

    @Override
    public void run() {
        int runDistance = 0;

        long startTime = System.currentTimeMillis();

        while (runDistance < DISTANCE) {
            try {
                int speed = (new Random()).nextInt(10);
                runDistance += speed;
                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i+= Main.STEP) {
                    if (percentTravel >= i + Main.STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + Main.STEP) {
                        log +="o";
                    } else {
                        log += "-";
                    }
                }log += "|";
                System.out.println("Car" + this.carName + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.carName + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.carName + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
