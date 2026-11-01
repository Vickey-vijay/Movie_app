package com.mbridge.msdk.tracker.network.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: ByteArrayPool.java */
/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Comparator<byte[]> f38255e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<byte[]> f38256a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<byte[]> f38257b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38258c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38259d;

    /* JADX INFO: compiled from: ByteArrayPool.java */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f38257b.size(); i11++) {
            byte[] bArr = this.f38257b.get(i11);
            if (bArr.length >= i10) {
                this.f38258c -= bArr.length;
                this.f38257b.remove(i11);
                this.f38256a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public c(int i10) {
        this.f38259d = i10;
    }

    public synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f38259d) {
                this.f38256a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f38257b, bArr, f38255e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f38257b.add(iBinarySearch, bArr);
                this.f38258c += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.f38258c > this.f38259d) {
            byte[] bArrRemove = this.f38256a.remove(0);
            this.f38257b.remove(bArrRemove);
            this.f38258c -= bArrRemove.length;
        }
    }
}
