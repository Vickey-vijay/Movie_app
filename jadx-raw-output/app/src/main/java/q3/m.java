package q3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: FlacMetadataReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class m {
    @Nullable
    public static Metadata c(h hVar, boolean z10) throws InterruptedException, IOException {
        Metadata metadataA = new p().a(hVar, z10 ? null : f4.b.f52831b);
        if (metadataA == null || metadataA.d() == 0) {
            return null;
        }
        return metadataA;
    }

    public static g5.j.a g(g5.t tVar) {
        tVar.M(1);
        int iB = tVar.B();
        long jC = tVar.c() + iB;
        int i10 = iB / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jR = tVar.r();
            if (jR == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jR;
            jArrCopyOf2[i11] = tVar.r();
            tVar.M(2);
        }
        tVar.M((int) (jC - ((long) tVar.c())));
        return new g5.j.a(jArrCopyOf, jArrCopyOf2);
    }

    /* JADX INFO: compiled from: FlacMetadataReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public g5.j f66456a;

        public a(@Nullable g5.j jVar) {
            this.f66456a = jVar;
        }
    }

    public static boolean a(h hVar) throws InterruptedException, IOException {
        g5.t tVar = new g5.t(4);
        hVar.peekFully(tVar.f53154a, 0, 4);
        return tVar.A() == 1716281667;
    }

    public static PictureFrame f(h hVar, int i10) throws InterruptedException, IOException {
        g5.t tVar = new g5.t(i10);
        hVar.readFully(tVar.f53154a, 0, i10);
        tVar.M(4);
        int iJ = tVar.j();
        String strW = tVar.w(tVar.j(), Charset.forName(C.ASCII_NAME));
        String strV = tVar.v(tVar.j());
        int iJ2 = tVar.j();
        int iJ3 = tVar.j();
        int iJ4 = tVar.j();
        int iJ5 = tVar.j();
        int iJ6 = tVar.j();
        byte[] bArr = new byte[iJ6];
        tVar.h(bArr, 0, iJ6);
        return new PictureFrame(iJ, strW, strV, iJ2, iJ3, iJ4, iJ5, bArr);
    }

    public static g5.j.a h(h hVar, int i10) throws InterruptedException, IOException {
        g5.t tVar = new g5.t(i10);
        hVar.readFully(tVar.f53154a, 0, i10);
        return g(tVar);
    }

    public static g5.j i(h hVar) throws InterruptedException, IOException {
        byte[] bArr = new byte[38];
        hVar.readFully(bArr, 0, 38);
        return new g5.j(bArr, 4);
    }

    public static void j(h hVar) throws InterruptedException, IOException {
        g5.t tVar = new g5.t(4);
        hVar.readFully(tVar.f53154a, 0, 4);
        if (tVar.A() != 1716281667) {
            throw new ParserException("Failed to read FLAC stream marker.");
        }
    }

    public static List<String> k(h hVar, int i10) throws InterruptedException, IOException {
        g5.t tVar = new g5.t(i10);
        hVar.readFully(tVar.f53154a, 0, i10);
        tVar.M(4);
        return Arrays.asList(w.i(tVar, false, false).f66499b);
    }

    public static int b(h hVar) throws InterruptedException, IOException {
        hVar.resetPeekPosition();
        g5.t tVar = new g5.t(2);
        hVar.peekFully(tVar.f53154a, 0, 2);
        int iE = tVar.E();
        if ((iE >> 2) == 16382) {
            hVar.resetPeekPosition();
            return iE;
        }
        hVar.resetPeekPosition();
        throw new ParserException("First frame does not start with sync code.");
    }

    @Nullable
    public static Metadata d(h hVar, boolean z10) throws InterruptedException, IOException {
        hVar.resetPeekPosition();
        long peekPosition = hVar.getPeekPosition();
        Metadata metadataC = c(hVar, z10);
        hVar.skipFully((int) (hVar.getPeekPosition() - peekPosition));
        return metadataC;
    }

    public static boolean e(h hVar, a aVar) throws InterruptedException, IOException {
        hVar.resetPeekPosition();
        g5.s sVar = new g5.s(new byte[4]);
        hVar.peekFully(sVar.f53150a, 0, 4);
        boolean zG = sVar.g();
        int iH = sVar.h(7);
        int iH2 = sVar.h(24) + 4;
        if (iH == 0) {
            aVar.f66456a = i(hVar);
        } else {
            g5.j jVar = aVar.f66456a;
            if (jVar != null) {
                if (iH == 3) {
                    aVar.f66456a = jVar.c(h(hVar, iH2));
                } else if (iH == 4) {
                    aVar.f66456a = jVar.d(k(hVar, iH2));
                } else if (iH == 6) {
                    aVar.f66456a = jVar.b(Collections.singletonList(f(hVar, iH2)));
                } else {
                    hVar.skipFully(iH2);
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        return zG;
    }
}
