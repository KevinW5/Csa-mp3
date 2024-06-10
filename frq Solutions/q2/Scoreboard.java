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
  public String getScore(){
   String c1=t1;
   String c2=t2;
   int p1=s1;
   int p2=s2;
    //if team 1 is not active, variable c1 become team 2
    if (active==false){
      c1=t2;
    }
    // otherwise c1 stays to team 1
    else {
      c1=t1;
    }
    // if c1 is team 2, c2 becomes team 1
    if(c1==t2){
      c2=t1;
    }
    // otherwise c2 stays team 2
    else{
      c2=t2;
    }
    // if c1 is team 1, p1 become score 1
    if(c1==t1){
      p1=s1;
    }
    // otherwise p1 stays score 2
    else{
      p1=s2;
    }
    // if p1 is score 1, p2 become score 2
    if(p1==s1){
      p2=s2;
    }
    // otherwise p2 stays score 1
    else{
      p2=s1;
    }
      return p1 + "-" + p2 + "-" + c1;
    }
  
  }
