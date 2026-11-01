package k4;

/* JADX INFO: compiled from: CompositeSequenceableLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class f implements j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0[] f62461b;

    @Override // k4.j0
    public boolean continueLoading(long j10) {
        boolean zContinueLoading;
        boolean z10 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            zContinueLoading = false;
            for (j0 j0Var : this.f62461b) {
                long nextLoadPositionUs2 = j0Var.getNextLoadPositionUs();
                boolean z11 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j10;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z11) {
                    zContinueLoading |= j0Var.continueLoading(j10);
                }
            }
            z10 |= zContinueLoading;
        } while (zContinueLoading);
        return z10;
    }

    @Override // k4.j0
    public final long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (j0 j0Var : this.f62461b) {
            long bufferedPositionUs = j0Var.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // k4.j0
    public final long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (j0 j0Var : this.f62461b) {
            long nextLoadPositionUs = j0Var.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // k4.j0
    public boolean isLoading() {
        for (j0 j0Var : this.f62461b) {
            if (j0Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // k4.j0
    public final void reevaluateBuffer(long j10) {
        for (j0 j0Var : this.f62461b) {
            j0Var.reevaluateBuffer(j10);
        }
    }

    public f(j0[] j0VarArr) {
        this.f62461b = j0VarArr;
    }
}
