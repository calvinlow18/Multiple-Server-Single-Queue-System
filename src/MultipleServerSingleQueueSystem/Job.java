/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipleServerSingleQueueSystem;

/**
 *
 * @author Calvin Low
 */
public class Job implements Comparable<Job> {
    
    private final String id;
    private int duration;
    private int changingDuration;

    public Job(String id, int duration) {
        this.id = id;
        this.duration = duration;
        this.changingDuration = duration;
    }

    public void decrement() {
        --changingDuration;
    }

    public int getChangingDuration() {
        return changingDuration;
    }

    public boolean check() {
        if(duration-changingDuration == 7) {
            duration = --changingDuration;
            return true;
        }
        
        return false;
    }

    public String getId() {
        return id;
    }

    public int getDuration() {
        return duration;
    }

    /*@Override
    public int compareTo(Job t) {
        if(this.equals(t))
            return 0;
        else if (this.duration < t.duration)
            return 1;
        else
            return -1;
    }*/

    @Override
    public int compareTo(Job j) {
        if(j.getDuration() == this.duration) {
            return 0;
        } else if (j.getDuration() > this.duration) {
            return 1;
        } else {
            return -1;
        }
    }    
    
}

