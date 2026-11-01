package a4;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import g5.k0;
import g5.m;
import g5.t;
import java.io.IOException;
import q3.h;

/* JADX INFO: compiled from: WavHeaderReader.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: compiled from: WavHeaderReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f3475b;

        public static a a(h hVar, t tVar) throws InterruptedException, IOException {
            hVar.peekFully(tVar.f53154a, 0, 8);
            tVar.L(0);
            return new a(tVar.j(), tVar.o());
        }

        public a(int i10, long j10) {
            this.f3474a = i10;
            this.f3475b = j10;
        }
    }

    @Nullable
    public static c a(h hVar) throws InterruptedException, IOException {
        boolean z10;
        byte[] bArr;
        g5.a.e(hVar);
        t tVar = new t(16);
        if (a.a(hVar, tVar).f3474a != 1380533830) {
            return null;
        }
        hVar.peekFully(tVar.f53154a, 0, 4);
        tVar.L(0);
        int iJ = tVar.j();
        if (iJ != 1463899717) {
            m.c("WavHeaderReader", "Unsupported RIFF format: " + iJ);
            return null;
        }
        a aVarA = a.a(hVar, tVar);
        while (aVarA.f3474a != 1718449184) {
            hVar.advancePeekPosition((int) aVarA.f3475b);
            aVarA = a.a(hVar, tVar);
        }
        if (aVarA.f3475b >= 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        g5.a.f(z10);
        hVar.peekFully(tVar.f53154a, 0, 16);
        tVar.L(0);
        int iQ = tVar.q();
        int iQ2 = tVar.q();
        int iP = tVar.p();
        int iP2 = tVar.p();
        int iQ3 = tVar.q();
        int iQ4 = tVar.q();
        int i10 = ((int) aVarA.f3475b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            hVar.peekFully(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = k0.f53113f;
        }
        return new c(iQ, iQ2, iP, iP2, iQ3, iQ4, bArr);
    }

    public static Pair<Long, Long> b(h hVar) throws InterruptedException, IOException {
        g5.a.e(hVar);
        hVar.resetPeekPosition();
        t tVar = new t(8);
        a aVarA = a.a(hVar, tVar);
        while (true) {
            int i10 = aVarA.f3474a;
            if (i10 != 1684108385) {
                if (i10 != 1380533830 && i10 != 1718449184) {
                    m.h("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f3474a);
                }
                long j10 = aVarA.f3475b + 8;
                if (aVarA.f3474a == 1380533830) {
                    j10 = 12;
                }
                if (j10 <= 2147483647L) {
                    hVar.skipFully((int) j10);
                    aVarA = a.a(hVar, tVar);
                } else {
                    throw new ParserException("Chunk is too large (~2GB+) to skip; id: " + aVarA.f3474a);
                }
            } else {
                hVar.skipFully(8);
                long position = hVar.getPosition();
                long j11 = aVarA.f3475b + position;
                long length = hVar.getLength();
                if (length != -1 && j11 > length) {
                    m.h("WavHeaderReader", "Data exceeds input length: " + j11 + ", " + length);
                    j11 = length;
                }
                return Pair.create(Long.valueOf(position), Long.valueOf(j11));
            }
        }
    }
}
