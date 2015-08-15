package droidkit.util;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Daniel Serdyukov
 */
public final class Sequence {

    private final AtomicLong mInitialValue;

    public Sequence(long initialValue) {
        mInitialValue = new AtomicLong(initialValue);
    }

    public static Sequence get() {
        return Holder.INSTANCE;
    }

    public long nextLong() {
        return mInitialValue.incrementAndGet();
    }

    public int nextInt() {
        return (int) nextLong();
    }

    private static abstract class Holder {

        public static final Sequence INSTANCE = new Sequence(9000);

        private Holder() {
        }

    }

}
