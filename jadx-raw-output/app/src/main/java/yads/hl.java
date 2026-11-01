package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class hl extends Exception {
    public hl(long j10, long j11) {
        super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
    }
}
