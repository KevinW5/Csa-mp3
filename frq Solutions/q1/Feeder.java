public class Feeder{
 private int currentFood;

  public Feeder(int F){
    currentFood = F;
  }
 // Part A
public void simulateOneDay(int numBirds){
 // 5% bear chance
  boolean normal=(int)(Math.random()*100+1) <= 95;
  if(normal){
  // random food eaten by each bird (10-50)
    int gramEaten = (int)(Math.random()*(50-10+1)+10)
;
  int totalEaten = gramEaten * numBirds;
  if(totalEaten > currentFood){
    currentFood = 0;
  }else{
    currentFood = 0;
  }
  }
// Part B
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
