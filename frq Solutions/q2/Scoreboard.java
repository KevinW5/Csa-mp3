public class Scoreboard {
  private String t1;
  private String t2;
  private int s1;
  private int s2;
  private boolean active;

  public Scoreboard(String t1, String t2){
    this.t1=t1;
    this.t2=t2;
    s1=0;
    s2=0;
    active = true;
  }
  public void recordPlay(int score) {
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
    if (active==false){
      c1=t2;
    }
    else {
      c1=t1;
    }
    if(c1==t2){
      c2=t1;
    }
    else{
      c2=t2;
    }
    if(c1==t1){
      p1=s1;
    }
    else{
      p1=s2;
    }
    if(p1==s1){
      p2=s2;
    }
    else{
      p2=s1;
    }
      return p1 + "-" + p2 + "-" + c1;
    }
  
  }
