package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int  totalRejected;

    public HanoiRhymer() {
        super();
        this.totalRejected = 0;
    }
    public HanoiRhymer(IntStack stack) {
        super();
        this.totalRejected = 0;
    }

    int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
