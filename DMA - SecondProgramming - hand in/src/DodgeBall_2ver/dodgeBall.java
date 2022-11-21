package DodgeBall_2ver;

import java.util.TreeSet;
public class dodgeBall
{
    private TreeSet<Integer> players= new TreeSet<>();
    public void addPlayer(int x) {players.add(x);  } //easiest and fastest way to add a player using the treeset method
    public int throwBall(int x) {
        if (players != null){ // check either there are players on the "field"
            if (players.remove(x) == true){ //check if there is any player on the spot
                players.remove(x); // if true, remove him
                return 0; // return the distance 0 because the "nearest" player was removed
            } else {
                int a; //temporary variable for saving the distance output before deleting player from tree
                if (players.ceiling(x)!=null&&players.floor(x)!=null){ // check either there are both ceiling and floor players
                    if (Math.abs(players.floor(x)-x) <= Math.abs(players.ceiling(x)-x)){ //check either the modulus distance between floor and ball is smaller or equals to the d of ceiling and ball
                        a = Math.abs(players.floor(x)-x); // if it is smaller of equals, save the distance
                        players.remove(players.floor(x));// remove the floor player
                        players.add(x);// and add him to the balls spot
                        return a; // return the distance
                    } else {
                        a = Math.abs(players.ceiling( x)-x); // if the ceiling player is smaller, save the distance
                        players.remove(players.ceiling(x));// remove the player
                        players.add(x); // and add him to the balls position
                        return a; //return the distance
                    }
                } else if (players.ceiling(x) != null&&players.floor(x) == null){ // check either there is only the ceiling player
                    a = Math.abs(players.ceiling(x)-x); // save the distance
                    players.remove(players.ceiling(x)); // remove the player from his position
                    players.add(x); // add him to the balls spot
                    return a;
                }else if (players.ceiling(x) == null && players.floor(x) != null){// check either there is only the floor player
                    a = Math.abs(players.floor(x)-x); // save the distance
                    players.remove(players.floor(x)); // remove floor player from his initial position;
                    players.add(x); // add him to the balls spot
                    return a; // return the distance
                }}}
        return 0; // if the treeset is empty, return 0
    }
}
