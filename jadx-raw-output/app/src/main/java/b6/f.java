package b6;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: State.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f4828e = new f(g.f4833b, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f4830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4832d;

    public String toString() {
        return String.format("%s bits=%d bytes=%d", d.f4820b[this.f4829a], Integer.valueOf(this.f4832d), Integer.valueOf(this.f4831c));
    }

    public static int b(f fVar) {
        int i10 = fVar.f4831c;
        if (i10 > 62) {
            return 21;
        }
        if (i10 > 31) {
            return 20;
        }
        return i10 > 0 ? 10 : 0;
    }

    public f a(int i10) {
        int i11;
        g gVarA = this.f4830b;
        int i12 = this.f4829a;
        int i13 = this.f4832d;
        if (i12 == 4 || i12 == 2) {
            int i14 = d.f4821c[i12][0];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVarA = gVarA.a(i15, i16);
            i13 += i16;
            i12 = 0;
        }
        int i17 = this.f4831c;
        if (i17 == 0 || i17 == 31) {
            i11 = 18;
        } else {
            i11 = i17 == 62 ? 9 : 8;
        }
        f fVar = new f(gVarA, i12, i17 + 1, i13 + i11);
        return fVar.f4831c == 2078 ? fVar.c(i10 + 1) : fVar;
    }

    public f c(int i10) {
        int i11 = this.f4831c;
        return i11 == 0 ? this : new f(this.f4830b.b(i10 - i11, i11), this.f4829a, 0, this.f4832d);
    }

    public int d() {
        return this.f4831c;
    }

    public int e() {
        return this.f4832d;
    }

    public int f() {
        return this.f4829a;
    }

    public boolean g(f fVar) {
        int iB = this.f4832d + (d.f4821c[this.f4829a][fVar.f4829a] >> 16);
        int i10 = this.f4831c;
        int i11 = fVar.f4831c;
        if (i10 < i11) {
            iB += b(fVar) - b(this);
        } else if (i10 > i11 && i11 > 0) {
            iB += 10;
        }
        return iB <= fVar.f4832d;
    }

    public f h(int i10, int i11) {
        int i12 = this.f4832d;
        g gVarA = this.f4830b;
        int i13 = this.f4829a;
        if (i10 != i13) {
            int i14 = d.f4821c[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVarA = gVarA.a(i15, i16);
            i12 += i16;
        }
        int i17 = i10 == 2 ? 4 : 5;
        return new f(gVarA.a(i11, i17), i10, 0, i12 + i17);
    }

    public f i(int i10, int i11) {
        g gVar = this.f4830b;
        int i12 = this.f4829a;
        int i13 = i12 == 2 ? 4 : 5;
        return new f(gVar.a(d.f4823e[i12][i10], i13).a(i11, 5), this.f4829a, 0, this.f4832d + i13 + 5);
    }

    public c6.a j(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (g gVarD = c(bArr.length).f4830b; gVarD != null; gVarD = gVarD.d()) {
            linkedList.addFirst(gVarD);
        }
        c6.a aVar = new c6.a();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c(aVar, bArr);
        }
        return aVar;
    }

    public f(g gVar, int i10, int i11, int i12) {
        this.f4830b = gVar;
        this.f4829a = i10;
        this.f4831c = i11;
        this.f4832d = i12;
    }
}
