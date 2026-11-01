package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.o[] f17625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17626c;

    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        int i10 = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = this.f17625b;
            if (i10 >= oVarArr.length) {
                return -1;
            }
            if (oVar == oVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f17624a == yVar.f17624a && Arrays.equals(this.f17625b, yVar.f17625b);
    }

    public final int hashCode() {
        if (this.f17626c == 0) {
            this.f17626c = Arrays.hashCode(this.f17625b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f17626c;
    }

    public y(com.fyber.inneractive.sdk.player.exoplayer2.o... oVarArr) {
        if (oVarArr.length > 0) {
            this.f17625b = oVarArr;
            this.f17624a = oVarArr.length;
            return;
        }
        throw new IllegalStateException();
    }
}
