import java.util.LinkedList;
import java.util.Queue;

public class ElevatorSimulation {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        elevator.addFloorToQueue(3);
        elevator.addFloorToQueue(7);
        elevator.addFloorToQueue(1);

        elevator.startSimulation();
    }
}

class Elevator {
    private int currentFloor;
    private Queue<Integer> floorQueue;

    public Elevator() {
        currentFloor = 1;
        floorQueue = new LinkedList<>();
    }

    public void addFloorToQueue(int floor) {
        floorQueue.add(floor);
    }

    public void startSimulation() {
        System.out.println("Elevator is starting at floor " + currentFloor);

        while (!floorQueue.isEmpty()) {
            int nextFloor = floorQueue.poll();

            if (nextFloor > currentFloor) {
                moveUp(nextFloor);
            } else if (nextFloor < currentFloor) {
                moveDown(nextFloor);
            }

            System.out.println("Elevator has arrived at floor " + currentFloor);
        }

        System.out.println("Elevator simulation finished. Elevator is at floor " + currentFloor);
    }

    private void moveUp(int targetFloor) {
        System.out.println("Elevator is moving up...");

        while (currentFloor < targetFloor) {
            currentFloor++;
            System.out.println("Elevator is at floor " + currentFloor);
        }
    }

    private void moveDown(int targetFloor) {
        System.out.println("Elevator is moving down...");

        while (currentFloor > targetFloor) {
            currentFloor--;
            System.out.println("Elevator is at floor " + currentFloor);
        }
    }
}
