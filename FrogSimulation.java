public class FrogSimulation
{
private int goalDistance;
private int maxHops;


public FrogSimulation(int dist, int numHops)
{
goalDistance = dist;
maxHops = numHops;
}
private int hopDistance(){
int ret=(int) (Math.random()*50);
if (Math.random()*2.0>=1.5) ret=ret*-1;
return ret;
}

/** Simulates a frog attempting to reach the goal as described in part (a).
* Returns true if the frog successfully reached or passed the goal during the simulation;
* false otherwise.
*/
public boolean simulate(){
int pos=0;
for (int i=0;i<maxHops;i++){
    pos+=hopDistance();
    if (pos>goalDistance) return true;
}
return false;
}

/** Runs num simulations and returns the proportion of simulations in which the frog
* successfully reached or passed the goal.
* Precondition: num > 0
*/
public double runSimulations(int num)
{
int passed=0;
for (int i=0;i<num;i++) {
    if(simulate()) passed++;
}
return passed;
}
}