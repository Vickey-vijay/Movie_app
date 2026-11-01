package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class sy implements rx2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rx2[] f82826b;

    @Override // yads.rx2
    public final boolean continueLoading(long j10) {
        boolean zContinueLoading;
        boolean z10 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            zContinueLoading = false;
            for (rx2 rx2Var : this.f82826b) {
                long nextLoadPositionUs2 = rx2Var.getNextLoadPositionUs();
                boolean z11 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j10;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z11) {
                    zContinueLoading |= rx2Var.continueLoading(j10);
                }
            }
            z10 |= zContinueLoading;
        } while (zContinueLoading);
        return z10;
    }

    @Override // yads.rx2
    public final long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (rx2 rx2Var : this.f82826b) {
            long bufferedPositionUs = rx2Var.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // yads.rx2
    public final long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (rx2 rx2Var : this.f82826b) {
            long nextLoadPositionUs = rx2Var.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // yads.rx2
    public final boolean isLoading() {
        for (rx2 rx2Var : this.f82826b) {
            if (rx2Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.rx2
    public final void reevaluateBuffer(long j10) {
        for (rx2 rx2Var : this.f82826b) {
            rx2Var.reevaluateBuffer(j10);
        }
    }

    public sy(rx2[] rx2VarArr) {
        this.f82826b = rx2VarArr;
    }
}
