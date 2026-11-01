package com.google.android.exoplayer2;

import k3.v0;

/* JADX INFO: loaded from: classes10.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final v0 timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(v0 v0Var, int i10, long j10) {
        this.timeline = v0Var;
        this.windowIndex = i10;
        this.positionMs = j10;
    }
}
