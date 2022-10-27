package edu.eci.cvds.servlet.model;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.Random;

@ManagedBean (name = "guessBean")
@SessionScoped
public class Bean {

    private int guess;
    private int tries;
    private int prize = 0;
    private String state;
    private int failed;

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

    public int getFailed() {
        return failed;
    }

    public void setFailed(int failed) {
        this.failed = failed;
    }

    public String getState() {
        return state;
    }

    public void guess(int userGuess){
        setTries(getTries()+1);
        int p = getPrize();
        int p1 = getPrize();
        String premio = String.valueOf(p1);
        if (userGuess == guess) {
            setState("Ganaste! Premio = "+premio);
            setPrize(prize+100);
            setGuess();
        } else{
            setState("Sigue intentando! Premio = "+premio);
            setFailed(getFailed()+1);
            if (prize > 0 ){
                setPrize(prize-10);
            }
        }
    }

    public void restart(){
        setGuess();
        setTries(0);
        setPrize(0);
        setFailed(0);
        setState("Bienvenido, empieza a adivinar!");
    }
}
