package oddevenbag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class OddEvenBag {

    private List<Integer> oddEvenBag = new ArrayList<>();
    public OddEvenBag() {
    }
    public OddEvenBag(int[] seedArray) {
        for (int i: seedArray) {
            oddEvenBag.add(i);
        }
    }
    public void add (int x) {
        oddEvenBag.add(x);
    }

    public void remove (int x) {
        oddEvenBag.removeAll(Arrays.asList(x));
    }

    public void increment() {
        List<Integer> oddEvenBagIncrement = new ArrayList<>();
        for (int i: oddEvenBag) {
            oddEvenBagIncrement.add(i + 1);
        }
        oddEvenBag = oddEvenBagIncrement;
    }

    public void decrement() {
        List<Integer> oddEvenBagIncrement = new ArrayList<>();
        for (int i: oddEvenBag) {
            oddEvenBagIncrement.add(i - 1);
        }
        oddEvenBag = oddEvenBagIncrement;
    }

    public boolean contains(int x) {
        if (oddEvenBag.contains(x)) {
            return true;
        }
        return  false;
    }

    public int getCount(int x) {
        int count = 0;
        if (oddEvenBag.contains(x)) {
            for (int i: oddEvenBag) {
                if (i == x) count++;
            }
        }
        return count;
    }

    public long sum() {
        AtomicLong sum = new AtomicLong(0L);
        oddEvenBag.forEach((n) -> sum.addAndGet(n));

        return sum.longValue();
    }

}