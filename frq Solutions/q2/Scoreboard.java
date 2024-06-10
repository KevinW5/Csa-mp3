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
   String team1N;
   String team2N;
   int team1S;
   int team2S;
// if active variable team1name = t1, team2 =t2, teamscore1=s1, teamscore2=s2
   if (active) {
     team1N = t1;
     team2N = t2;
     team1S = s1;
     team2S = s2;
    
   }
  // otherwise the opposite 
   else {
     team1N = t2;
     team2N = t1;
     team1S = s2;
     team2S = s1;
  }

  return team1Score + "-" + team2Score + "-" + team1Name;
}
  
  }
