package androidx.media3.common.util;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public interface TimestampIterator {
    TimestampIterator copyOf();

    default long getLastTimestampUs() {
        return -9223372036854775807L;
    }

    boolean hasNext();

    long next();
}
