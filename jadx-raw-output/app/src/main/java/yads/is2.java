package yads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class is2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qe f78787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f78789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hs2 f78790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hs2 f78791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hs2 f78792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f78793g;

    public final void a(hs2 hs2Var) {
        if (hs2Var.f78348c == null) {
            return;
        }
        ib0 ib0Var = (ib0) this.f78787a;
        synchronized (ib0Var) {
            hs2 hs2Var2 = hs2Var;
            while (hs2Var2 != null) {
                pe[] peVarArr = ib0Var.f78551g;
                int i10 = ib0Var.f78550f;
                ib0Var.f78550f = i10 + 1;
                pe peVar = hs2Var2.f78348c;
                peVar.getClass();
                peVarArr[i10] = peVar;
                ib0Var.f78549e--;
                hs2Var2 = hs2Var2.f78349d;
                if (hs2Var2 == null || hs2Var2.f78348c == null) {
                    hs2Var2 = null;
                }
            }
            ib0Var.notifyAll();
        }
        hs2Var.f78348c = null;
        hs2Var.f78349d = null;
    }

    public is2(qe qeVar) {
        this.f78787a = qeVar;
        int iB = ((ib0) qeVar).b();
        this.f78788b = iB;
        this.f78789c = new jb2(32);
        hs2 hs2Var = new hs2(iB, 0L);
        this.f78790d = hs2Var;
        this.f78791e = hs2Var;
        this.f78792f = hs2Var;
    }

    public final void a(long j10) {
        hs2 hs2Var;
        if (j10 == -1) {
            return;
        }
        while (true) {
            hs2Var = this.f78790d;
            if (j10 < hs2Var.f78347b) {
                break;
            }
            qe qeVar = this.f78787a;
            pe peVar = hs2Var.f78348c;
            ib0 ib0Var = (ib0) qeVar;
            synchronized (ib0Var) {
                pe[] peVarArr = ib0Var.f78551g;
                int i10 = ib0Var.f78550f;
                ib0Var.f78550f = i10 + 1;
                peVarArr[i10] = peVar;
                ib0Var.f78549e--;
                ib0Var.notifyAll();
            }
            hs2 hs2Var2 = this.f78790d;
            hs2Var2.f78348c = null;
            hs2 hs2Var3 = hs2Var2.f78349d;
            hs2Var2.f78349d = null;
            this.f78790d = hs2Var3;
        }
        if (this.f78791e.f78346a < hs2Var.f78346a) {
            this.f78791e = hs2Var;
        }
    }

    public static hs2 a(hs2 hs2Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= hs2Var.f78347b) {
            hs2Var = hs2Var.f78349d;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (hs2Var.f78347b - j10));
            pe peVar = hs2Var.f78348c;
            byteBuffer.put(peVar.f81379a, ((int) (j10 - hs2Var.f78346a)) + peVar.f81380b, iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == hs2Var.f78347b) {
                hs2Var = hs2Var.f78349d;
            }
        }
        return hs2Var;
    }

    public static hs2 a(hs2 hs2Var, long j10, byte[] bArr, int i10) {
        while (j10 >= hs2Var.f78347b) {
            hs2Var = hs2Var.f78349d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (hs2Var.f78347b - j10));
            pe peVar = hs2Var.f78348c;
            System.arraycopy(peVar.f81379a, ((int) (j10 - hs2Var.f78346a)) + peVar.f81380b, bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == hs2Var.f78347b) {
                hs2Var = hs2Var.f78349d;
            }
        }
        return hs2Var;
    }

    public static hs2 a(hs2 hs2Var, sa0 sa0Var, js2 js2Var, jb2 jb2Var) {
        hs2 hs2VarA;
        if (sa0Var.b(1073741824)) {
            long j10 = js2Var.f79165b;
            int iR = 1;
            jb2Var.c(1);
            hs2 hs2VarA2 = a(hs2Var, j10, jb2Var.f78966a, 1);
            long j11 = j10 + 1;
            byte b10 = jb2Var.f78966a[0];
            boolean z10 = (b10 & 128) != 0;
            int i10 = b10 & 127;
            m20 m20Var = sa0Var.f82567c;
            byte[] bArr = m20Var.f80033a;
            if (bArr == null) {
                m20Var.f80033a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            hs2VarA = a(hs2VarA2, j11, m20Var.f80033a, i10);
            long j12 = j11 + ((long) i10);
            if (z10) {
                jb2Var.c(2);
                hs2VarA = a(hs2VarA, j12, jb2Var.f78966a, 2);
                j12 += 2;
                iR = jb2Var.r();
            }
            int i11 = iR;
            int[] iArr = m20Var.f80036d;
            if (iArr == null || iArr.length < i11) {
                iArr = new int[i11];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = m20Var.f80037e;
            if (iArr3 == null || iArr3.length < i11) {
                iArr3 = new int[i11];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i12 = i11 * 6;
                jb2Var.c(i12);
                hs2VarA = a(hs2VarA, j12, jb2Var.f78966a, i12);
                j12 += (long) i12;
                jb2Var.e(0);
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr2[i13] = jb2Var.r();
                    iArr4[i13] = jb2Var.p();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = js2Var.f79164a - ((int) (j12 - js2Var.f79165b));
            }
            l73 l73Var = js2Var.f79166c;
            int i14 = ib3.f78556a;
            m20Var.a(i11, iArr2, iArr4, l73Var.f79726b, m20Var.f80033a, l73Var.f79725a, l73Var.f79727c, l73Var.f79728d);
            long j13 = js2Var.f79165b;
            int i15 = (int) (j12 - j13);
            js2Var.f79165b = j13 + ((long) i15);
            js2Var.f79164a -= i15;
        } else {
            hs2VarA = hs2Var;
        }
        if (sa0Var.b(268435456)) {
            jb2Var.c(4);
            hs2 hs2VarA3 = a(hs2VarA, js2Var.f79165b, jb2Var.f78966a, 4);
            int iP = jb2Var.p();
            js2Var.f79165b += 4;
            js2Var.f79164a -= 4;
            sa0Var.c(iP);
            hs2 hs2VarA4 = a(hs2VarA3, js2Var.f79165b, sa0Var.f82568d, iP);
            js2Var.f79165b += (long) iP;
            int i16 = js2Var.f79164a - iP;
            js2Var.f79164a = i16;
            ByteBuffer byteBuffer = sa0Var.f82571g;
            if (byteBuffer != null && byteBuffer.capacity() >= i16) {
                sa0Var.f82571g.clear();
            } else {
                sa0Var.f82571g = ByteBuffer.allocate(i16);
            }
            return a(hs2VarA4, js2Var.f79165b, sa0Var.f82571g, js2Var.f79164a);
        }
        sa0Var.c(js2Var.f79164a);
        return a(hs2VarA, js2Var.f79165b, sa0Var.f82568d, js2Var.f79164a);
    }
}
