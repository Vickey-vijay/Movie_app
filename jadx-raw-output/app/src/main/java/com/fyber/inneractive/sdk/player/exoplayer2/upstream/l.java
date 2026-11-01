package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17756d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a[] f17757e = new a[100];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f17753a = new a[1];

    public final synchronized void a(int i10) {
        boolean z10 = i10 < this.f17754b;
        this.f17754b = i10;
        if (z10) {
            a();
        }
    }

    public final synchronized void a(a[] aVarArr) {
        int i10 = this.f17756d;
        int length = aVarArr.length + i10;
        a[] aVarArr2 = this.f17757e;
        if (length >= aVarArr2.length) {
            this.f17757e = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
        }
        for (a aVar : aVarArr) {
            byte[] bArr = aVar.f17652a;
            if (bArr != null && bArr.length != 65536) {
                throw new IllegalArgumentException();
            }
            a[] aVarArr3 = this.f17757e;
            int i11 = this.f17756d;
            this.f17756d = i11 + 1;
            aVarArr3[i11] = aVar;
        }
        this.f17755c -= aVarArr.length;
        notifyAll();
    }

    public final synchronized void a() {
        int i10 = this.f17754b;
        int i11 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f17873a;
        int iMax = Math.max(0, ((i10 + 65535) / 65536) - this.f17755c);
        int i12 = this.f17756d;
        if (iMax >= i12) {
            return;
        }
        Arrays.fill(this.f17757e, iMax, i12, (Object) null);
        this.f17756d = iMax;
    }
}
