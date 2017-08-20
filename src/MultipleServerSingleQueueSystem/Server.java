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
public class Server {
    
    private boolean free;
    private Job job;
    private int counter;

    public Server() {
        this.free = true;
        counter = 0;
    }

    public boolean isFree() {
        return free;
    }

    public void setJob(Job job) {
        this.job = job;
    }
    
    public void decreaseTime() {
        job.decrement();
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public Job getJob() {
        return job;
    }

    public void increaseCounter() {
        ++counter;
    }

    public int getCounter() {
        return counter;
    }
    
}
