public class ParkingLot {
  private int numCars;
  public final int MAX_CARS = 2500;
  public ParkingLot() {
    numCars = 0;
  }
  public ParkingLot(int theNumCars) {
    numCars = theNumCars;
  }
  public int getNumCars() {
    return numCars;
  }
  public void setNumCars(int theNum) {
    if (theNum <= MAX_CARS && theNum >= 0) {
      numCars = theNum;
    }
  }
  public String toString() {
    return "Number of cars is " + numCars;
  }
  public boolean equals(Object other) {
    ParkingLot p = (ParkingLot)other;
    if (numCars == p.getNumCars()) {
      return true;
    } else {
      return false;
    }
  }
}
