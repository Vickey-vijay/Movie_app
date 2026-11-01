package h5;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import g5.t;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: HevcConfig.java */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List<byte[]> f53711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53712b;

    public static c a(t tVar) throws ParserException {
        try {
            tVar.M(21);
            int iY = tVar.y() & 3;
            int iY2 = tVar.y();
            int iC = tVar.c();
            int i10 = 0;
            for (int i11 = 0; i11 < iY2; i11++) {
                tVar.M(1);
                int iE = tVar.E();
                for (int i12 = 0; i12 < iE; i12++) {
                    int iE2 = tVar.E();
                    i10 += iE2 + 4;
                    tVar.M(iE2);
                }
            }
            tVar.L(iC);
            byte[] bArr = new byte[i10];
            int i13 = 0;
            for (int i14 = 0; i14 < iY2; i14++) {
                tVar.M(1);
                int iE3 = tVar.E();
                for (int i15 = 0; i15 < iE3; i15++) {
                    int iE4 = tVar.E();
                    byte[] bArr2 = g5.q.f53130a;
                    System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                    int length = i13 + bArr2.length;
                    System.arraycopy(tVar.f53154a, tVar.c(), bArr, length, iE4);
                    i13 = length + iE4;
                    tVar.M(iE4);
                }
            }
            return new c(i10 == 0 ? null : Collections.singletonList(bArr), iY + 1);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new ParserException("Error parsing HEVC config", e10);
        }
    }

    public c(@Nullable List<byte[]> list, int i10) {
        this.f53711a = list;
        this.f53712b = i10;
    }
}
