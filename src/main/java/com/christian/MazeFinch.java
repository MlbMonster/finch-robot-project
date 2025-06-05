package com.christian;
import com.birdbrain.Finch;

public class MazeFinch {
    
    public static void main(String[] args) {

        Finch myFinch = new Finch();

        //1st move
        myFinch.setMove("F", 100, 80);
        //1st turn
        myFinch.setTurn("L", 90, 100);
        //2nd move
        myFinch.setMove("F", 30, 80);
        //2nd turn
        myFinch.setTurn("L", 90, 100);
        //3rd move
        myFinch.setMove("F", 31, 80);
        //3rd turn
        myFinch.setTurn("R", 90, 100);
        //4th move
        myFinch.setMove("F", 60, 80);
        //4th turn
        myFinch.setTurn("R", 90, 100);
        //5th move
        myFinch.setMove("F", 125, 60);
        //5th turn
        myFinch.setTurn("R", 90, 100);
        //6th move
        myFinch.setMove("F", 20, 80);
        //6th turn
        myFinch.setTurn("L", 90, 100);
        //7th move
        myFinch.setMove("F", 20, 80);
        //7th turn
        myFinch.setTurn("L", 90, 100);
        //8th move
        myFinch.setMove("F", 20, 80);
        


        //Stops the code
        myFinch.stopAll();
        myFinch.disconnect();
        
    }
}