package edu.eci.cvds.servlet.model;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.Random;

@ManagedBean (name = "guessBean")
@ApplicationScoped
public class Bean {

    private int guess;
    private int tries;
    private int prize;
    private String state;

    public Bean(){

    }

    public int getGuess() {
        return guess;
    }

    public void setGuess() {
        Random r = new Random();
        this.guess = r.nextInt(30);
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getPrize() {
        return prize;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void guess(int userGuess){
        setTries(getTries()+1);
        int p = getPrize();
        if (userGuess == guess) {
            int p1 = getPrize() + 1;
            String premio = String.valueOf(p1);
            setState("Ganaste! Premio = "+premio);
        } else{
            int p1 = getPrize() + 1;
            String premio = String.valueOf(p1);
            setState("Sigue intentando! Premio ="+premio);
        }
    }

    public void restart(){
        setGuess();
        setTries(0);
        setPrize(0);
        setState("Bienvenido, empieza a adivinar!");
    }
}
