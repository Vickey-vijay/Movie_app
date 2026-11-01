package com.inmobi.media;

/* JADX INFO: loaded from: classes6.dex */
public final class Ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22375b;

    public Ai(int i10, long j10, int i11) {
        this.f22374a = i10;
        this.f22375b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ai)) {
            return false;
        }
        Ai ai2 = (Ai) obj;
        return this.f22374a == ai2.f22374a && this.f22375b == ai2.f22375b && Double.compare(1.0d, 1.0d) == 0;
    }

    public Ai(long j10, int i10) {
        this.f22374a = i10;
        this.f22375b = j10;
    }

    public final int hashCode() {
        return Double.hashCode(1.0d) + ((Long.hashCode(this.f22375b) + (Integer.hashCode(this.f22374a) * 31)) * 31);
    }

    public final String toString() {
        return "RetryPolicy(maxRetries=" + this.f22374a + ", retryInterval=" + this.f22375b + ", delayFactor=1.0)";
    }
}
