package bj;

import java.util.ArrayList;

/* JADX INFO: compiled from: LinkedArrayList.java */
/* JADX INFO: loaded from: classes9.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f5364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f5365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile int f5366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5367f;

    public void a(Object obj) {
        if (this.f5366e == 0) {
            Object[] objArr = new Object[this.f5363b + 1];
            this.f5364c = objArr;
            this.f5365d = objArr;
            objArr[0] = obj;
            this.f5367f = 1;
            this.f5366e = 1;
            return;
        }
        int i10 = this.f5367f;
        int i11 = this.f5363b;
        if (i10 != i11) {
            this.f5365d[i10] = obj;
            this.f5367f = i10 + 1;
            this.f5366e++;
        } else {
            Object[] objArr2 = new Object[i11 + 1];
            objArr2[0] = obj;
            this.f5365d[i11] = objArr2;
            this.f5365d = objArr2;
            this.f5367f = 1;
            this.f5366e++;
        }
    }

    public Object[] b() {
        return this.f5364c;
    }

    public int c() {
        return this.f5366e;
    }

    public String toString() {
        int i10 = this.f5363b;
        int i11 = this.f5366e;
        ArrayList arrayList = new ArrayList(i11 + 1);
        Object[] objArrB = b();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            arrayList.add(objArrB[i13]);
            i12++;
            i13++;
            if (i13 == i10) {
                objArrB = (Object[]) objArrB[i10];
                i13 = 0;
            }
        }
        return arrayList.toString();
    }

    public g(int i10) {
        this.f5363b = i10;
    }
}
