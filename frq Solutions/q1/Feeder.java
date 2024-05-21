public class Feeder{
 private int currentFood;

  public Feeder(int F){
    currentFood = F;
  }
public void simulateOneDay(int numBirds){
  boolean normal=(int)(Math.random()*100+1) <= 95;
  if(normal){
    int gramEaten = (int)(Math.random()*(50-10+1)+10)
;
  int totalEaten = gramEaten * numBirds;
  if(totalEaten > currentFood){
    currentFood = 0;
  }else{
    currentFood = 0;
  }
  }
  public int simulateManyDays(int numbirds, int numDays){
    int day = 0;
    while(currentFood > 0 && day < numDays){
      day++;
      simulateOneDay(numBirds);
      System.out.println("Food left" + getCurrentFood());
      System.out.println();
    }
  }
}
   return day;
   public int getCurrentFood(){
   }
}
