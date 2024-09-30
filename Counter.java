class Counter {
    public int tally;

    public Counter(){
        this.tally = tally;
        this.tally = 0;
    }

    public int click(){
        return ++this.tally;
    }

    public int getClicks(){
        return this.tally;
    }

    public void reset(){
        this.tally = 0;
    }
}


class CounterTester{
    public static void main(String args[]){
        Counter counter1 = new Counter();
        counter1.click();

        counter1.click();

        counter1.click();

        System.out.println("                    " + counter1.getClicks());

        counter1.click();

        System.out.println("                    " + counter1.getClicks());

        counter1.reset();
        
        System.out.println("                    " + counter1.getClicks());
    }
}
