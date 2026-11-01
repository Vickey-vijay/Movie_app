package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f17627d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y[] f17629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17630c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return this.f17628a == zVar.f17628a && Arrays.equals(this.f17629b, zVar.f17629b);
    }

    static {
        new z(new y[0]);
    }

    public final int hashCode() {
        if (this.f17630c == 0) {
            this.f17630c = Arrays.hashCode(this.f17629b);
        }
        return this.f17630c;
    }

    public z(y... yVarArr) {
        this.f17629b = yVarArr;
        this.f17628a = yVarArr.length;
    }
}
