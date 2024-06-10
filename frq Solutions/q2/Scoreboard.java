public class Scoreboard {
  // instant variables
  private String t1;
  private String t2;
  private int s1;
  private int s2;
  private boolean active;
// constructor
  public Scoreboard(String t1, String t2){
    this.t1=t1;
    this.t2=t2;
    s1=0;
    s2=0;
    active = true;
  }
  public void recordPlay(int score) {
    // active team switch if no score
        if (score > 0) {
            if (active) {
                s1 += score;
            } else {
                s2 += score;
            }
        } else {
            active = !active;
        }
    }
  public String getScore() {
    // if active return t1 active
    if (active) {
      return s1 + "-" + s2 + "-" + t1;

    }
    // otherwise the opposite
    else {
      return s1 + "-" + s2 + "-" + t2;
    }

  
  }

}
