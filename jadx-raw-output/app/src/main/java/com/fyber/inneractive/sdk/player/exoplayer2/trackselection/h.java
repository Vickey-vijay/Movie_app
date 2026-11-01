package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b[] f17646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17647c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f17646b, ((h) obj).f17646b);
    }

    public final int hashCode() {
        if (this.f17647c == 0) {
            this.f17647c = Arrays.hashCode(this.f17646b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f17647c;
    }

    public h(b... bVarArr) {
        this.f17646b = bVarArr;
        this.f17645a = bVarArr.length;
    }
}
