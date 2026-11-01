package yads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class k23 extends dz2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f79286a = new jb2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ib2 f79287b = new ib2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y63 f79288c;

    /* JADX WARN: Code duplicated, block: B:15:0x0017  */
    @Override // yads.dz2
    public final ts1 a(ws1 ws1Var, ByteBuffer byteBuffer) {
        char c10;
        long j10;
        ArrayList arrayList;
        long j11;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        int iR;
        int iM;
        int iM2;
        long jN;
        boolean z13;
        List list;
        long j13;
        long j14;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i10;
        int i11;
        int iM3;
        boolean z18;
        long j15;
        y63 y63Var = this.f79288c;
        if (y63Var != null) {
            long j16 = ws1Var.f84303j;
            synchronized (y63Var) {
                j15 = y63Var.f84834b;
            }
            if (j16 != j15) {
                y63 y63Var2 = new y63(ws1Var.f82570f);
                this.f79288c = y63Var2;
                y63Var2.a(ws1Var.f82570f - ws1Var.f84303j);
            }
        } else {
            y63 y63Var3 = new y63(ws1Var.f82570f);
            this.f79288c = y63Var3;
            y63Var3.a(ws1Var.f82570f - ws1Var.f84303j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        jb2 jb2Var = this.f79286a;
        jb2Var.f78966a = bArrArray;
        jb2Var.f78968c = iLimit;
        jb2Var.f78967b = 0;
        this.f79287b.a(iLimit, bArrArray);
        this.f79287b.c(39);
        char c11 = ' ';
        long jA = (((long) this.f79287b.a(1)) << 32) | ((long) this.f79287b.a(32));
        this.f79287b.c(20);
        int iA = this.f79287b.a(12);
        int iA2 = this.f79287b.a(8);
        ss1 p23Var = null;
        jb2 jb2Var2 = this.f79286a;
        jb2Var2.e(jb2Var2.f78967b + 14);
        if (iA2 == 0) {
            p23Var = new p23();
        } else if (iA2 != 255) {
            long j17 = 1;
            long jN2 = -9223372036854775807L;
            if (iA2 == 4) {
                jb2 jb2Var3 = this.f79286a;
                int iM4 = jb2Var3.m();
                ArrayList arrayList2 = new ArrayList(iM4);
                int i12 = 0;
                while (i12 < iM4) {
                    long jN3 = jb2Var3.n();
                    boolean z19 = (jb2Var3.m() & 128) != 0;
                    ArrayList arrayList3 = new ArrayList();
                    if (z19) {
                        c10 = c11;
                        j10 = j17;
                        arrayList = arrayList3;
                        j11 = -9223372036854775807L;
                        j12 = -9223372036854775807L;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                        iR = 0;
                        iM = 0;
                        iM2 = 0;
                    } else {
                        int iM5 = jb2Var3.m();
                        boolean z20 = (iM5 & 128) != 0;
                        boolean z21 = (iM5 & 64) != 0;
                        boolean z22 = (iM5 & 32) != 0;
                        long jN4 = z21 ? jb2Var3.n() : -9223372036854775807L;
                        if (!z21) {
                            int iM6 = jb2Var3.m();
                            ArrayList arrayList4 = new ArrayList(iM6);
                            for (int i13 = 0; i13 < iM6; i13++) {
                                arrayList4.add(new r23(jb2Var3.m(), jb2Var3.n()));
                            }
                            arrayList3 = arrayList4;
                        }
                        if (z22) {
                            long jM = jb2Var3.m();
                            z13 = (jM & 128) != 0;
                            j10 = 1;
                            c10 = ' ';
                            jN = ((((jM & 1) << 32) | jb2Var3.n()) * 1000) / 90;
                        } else {
                            j10 = 1;
                            c10 = ' ';
                            jN = -9223372036854775807L;
                            z13 = false;
                        }
                        j12 = jN;
                        arrayList = arrayList3;
                        z12 = z13;
                        z10 = z20;
                        z11 = z21;
                        j11 = jN4;
                        iR = jb2Var3.r();
                        iM = jb2Var3.m();
                        iM2 = jb2Var3.m();
                    }
                    arrayList2.add(new s23(jN3, z19, z10, z11, arrayList, j11, z12, j12, iR, iM, iM2));
                    i12++;
                    j17 = j10;
                    c11 = c10;
                }
                p23Var = new t23(arrayList2);
            } else if (iA2 == 5) {
                jb2 jb2Var4 = this.f79286a;
                y63 y63Var4 = this.f79288c;
                long jN5 = jb2Var4.n();
                boolean z23 = (jb2Var4.m() & 128) != 0;
                List listEmptyList = Collections.emptyList();
                if (z23) {
                    list = listEmptyList;
                    j13 = -9223372036854775807L;
                    j14 = -9223372036854775807L;
                    z14 = false;
                    z15 = false;
                    z16 = false;
                    z17 = false;
                    i10 = 0;
                    i11 = 0;
                    iM3 = 0;
                } else {
                    int iM7 = jb2Var4.m();
                    boolean z24 = (iM7 & 128) != 0;
                    boolean z25 = (iM7 & 64) != 0;
                    boolean z26 = (iM7 & 32) != 0;
                    boolean z27 = (iM7 & 16) != 0;
                    long jA2 = (!z25 || z27) ? -9223372036854775807L : m63.a(jA, jb2Var4);
                    if (!z25) {
                        int iM8 = jb2Var4.m();
                        ArrayList arrayList5 = new ArrayList(iM8);
                        for (int i14 = 0; i14 < iM8; i14++) {
                            int iM9 = jb2Var4.m();
                            long jA3 = !z27 ? m63.a(jA, jb2Var4) : -9223372036854775807L;
                            arrayList5.add(new m23(iM9, jA3, y63Var4.b(jA3)));
                        }
                        listEmptyList = arrayList5;
                    }
                    if (z26) {
                        long jM2 = jb2Var4.m();
                        z18 = (jM2 & 128) != 0;
                        jN2 = ((((jM2 & 1) << 32) | jb2Var4.n()) * 1000) / 90;
                    } else {
                        z18 = false;
                    }
                    int iR2 = jb2Var4.r();
                    int iM10 = jb2Var4.m();
                    i10 = iR2;
                    z17 = z18;
                    iM3 = jb2Var4.m();
                    i11 = iM10;
                    list = listEmptyList;
                    z14 = z24;
                    j14 = jN2;
                    j13 = jA2;
                    z16 = z27;
                    z15 = z25;
                }
                p23Var = new n23(jN5, z23, z14, z15, z16, j13, y63Var4.b(j13), list, z17, j14, i10, i11, iM3);
            } else if (iA2 == 6) {
                jb2 jb2Var5 = this.f79286a;
                y63 y63Var5 = this.f79288c;
                long jA4 = m63.a(jA, jb2Var5);
                p23Var = new m63(jA4, y63Var5.b(jA4));
            }
        } else {
            jb2 jb2Var6 = this.f79286a;
            long jN6 = jb2Var6.n();
            int i15 = iA - 4;
            byte[] bArr = new byte[i15];
            jb2Var6.a(bArr, 0, i15);
            p23Var = new yi2(jN6, bArr, jA);
        }
        return p23Var == null ? new ts1(new ss1[0]) : new ts1(p23Var);
    }
}
