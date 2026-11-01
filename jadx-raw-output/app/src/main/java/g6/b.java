package g6;

/* JADX INFO: compiled from: DataBlock.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f53169b;

    public byte[] a() {
        return this.f53169b;
    }

    public int c() {
        return this.f53168a;
    }

    public b(int i10, byte[] bArr) {
        this.f53168a = i10;
        this.f53169b = bArr;
    }

    public static b[] b(byte[] bArr, d dVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        d.c cVarD = dVar.d();
        d.b[] bVarArrA = cVarD.a();
        int iA = 0;
        for (d.b bVar : bVarArrA) {
            iA += bVar.a();
        }
        b[] bVarArr = new b[iA];
        int i13 = 0;
        for (d.b bVar2 : bVarArrA) {
            int i14 = 0;
            while (i14 < bVar2.a()) {
                int iB = bVar2.b();
                bVarArr[i13] = new b(iB, new byte[cVarD.b() + iB]);
                i14++;
                i13++;
            }
        }
        int length = bVarArr[0].f53169b.length - cVarD.b();
        int i15 = length - 1;
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            int i18 = 0;
            while (i18 < i13) {
                bVarArr[i18].f53169b[i17] = bArr[i16];
                i18++;
                i16++;
            }
        }
        if (dVar.i() == 24) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 8;
        } else {
            i10 = i13;
        }
        int i19 = 0;
        while (i19 < i10) {
            bVarArr[i19].f53169b[i15] = bArr[i16];
            i19++;
            i16++;
        }
        int length2 = bVarArr[0].f53169b.length;
        while (length < length2) {
            int i20 = 0;
            while (i20 < i13) {
                if (z10) {
                    i11 = (i20 + 8) % i13;
                } else {
                    i11 = i20;
                }
                if (z10 && i11 > 7) {
                    i12 = length - 1;
                } else {
                    i12 = length;
                }
                bVarArr[i11].f53169b[i12] = bArr[i16];
                i20++;
                i16++;
            }
            length++;
        }
        if (i16 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }
}
