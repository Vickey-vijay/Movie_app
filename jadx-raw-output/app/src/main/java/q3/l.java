package q3;

import com.google.android.exoplayer2.ParserException;
import g5.k0;
import java.io.IOException;

/* JADX INFO: compiled from: FlacFrameReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: compiled from: FlacFrameReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f66455a;
    }

    public static boolean f(int i10, g5.j jVar) {
        return i10 == 0 || i10 == jVar.f53101i;
    }

    public static boolean g(int i10, g5.j jVar) {
        if (i10 <= 7) {
            return i10 == jVar.f53099g - 1;
        }
        return i10 <= 10 && jVar.f53099g == 2;
    }

    public static boolean d(g5.t tVar, g5.j jVar, int i10, a aVar) {
        int iC = tVar.c();
        long jA = tVar.A();
        long j10 = jA >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) ((jA >> 4) & 15), jVar) && f((int) ((jA >> 1) & 7), jVar) && !(((jA & 1) > 1L ? 1 : ((jA & 1) == 1L ? 0 : -1)) == 0) && c(tVar, jVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(tVar, jVar, (int) ((jA >> 12) & 15)) && e(tVar, jVar, (int) ((jA >> 8) & 15)) && b(tVar, iC);
    }

    public static boolean e(g5.t tVar, g5.j jVar, int i10) {
        int i11 = jVar.f53097e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == jVar.f53098f;
        }
        if (i10 == 12) {
            return tVar.y() * 1000 == i11;
        }
        if (i10 > 14) {
            return false;
        }
        int iE = tVar.E();
        if (i10 == 14) {
            iE *= 10;
        }
        return iE == i11;
    }

    public static boolean a(g5.t tVar, g5.j jVar, int i10) {
        int iJ = j(tVar, i10);
        if (iJ != -1 && iJ <= jVar.f53094b) {
            return true;
        }
        return false;
    }

    public static boolean b(g5.t tVar, int i10) {
        if (tVar.y() == k0.u(tVar.f53154a, i10, tVar.c() - 1, 0)) {
            return true;
        }
        return false;
    }

    public static boolean c(g5.t tVar, g5.j jVar, boolean z10, a aVar) {
        try {
            long jF = tVar.F();
            if (!z10) {
                jF *= (long) jVar.f53094b;
            }
            aVar.f66455a = jF;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean h(h hVar, g5.j jVar, int i10, a aVar) throws InterruptedException, IOException {
        long peekPosition = hVar.getPeekPosition();
        byte[] bArr = new byte[2];
        hVar.peekFully(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            hVar.resetPeekPosition();
            hVar.advancePeekPosition((int) (peekPosition - hVar.getPosition()));
            return false;
        }
        g5.t tVar = new g5.t(16);
        System.arraycopy(bArr, 0, tVar.f53154a, 0, 2);
        tVar.K(j.a(hVar, tVar.f53154a, 2, 14));
        hVar.resetPeekPosition();
        hVar.advancePeekPosition((int) (peekPosition - hVar.getPosition()));
        return d(tVar, jVar, i10, aVar);
    }

    public static long i(h hVar, g5.j jVar) throws InterruptedException, IOException {
        int i10;
        hVar.resetPeekPosition();
        boolean z10 = true;
        hVar.advancePeekPosition(1);
        byte[] bArr = new byte[1];
        hVar.peekFully(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z10 = false;
        }
        hVar.advancePeekPosition(2);
        if (z10) {
            i10 = 7;
        } else {
            i10 = 6;
        }
        g5.t tVar = new g5.t(i10);
        tVar.K(j.a(hVar, tVar.f53154a, 0, i10));
        hVar.resetPeekPosition();
        a aVar = new a();
        if (c(tVar, jVar, z10, aVar)) {
            return aVar.f66455a;
        }
        throw new ParserException();
    }

    public static int j(g5.t tVar, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return tVar.y() + 1;
            case 7:
                return tVar.E() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
