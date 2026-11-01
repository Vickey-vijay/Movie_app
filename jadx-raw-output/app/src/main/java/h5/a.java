package h5;

import com.google.android.exoplayer2.ParserException;
import g5.t;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AvcConfig.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f53703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f53706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f53707e;

    public static a b(t tVar) throws ParserException {
        float f10;
        int i10;
        int i11;
        try {
            tVar.M(4);
            int iY = (tVar.y() & 3) + 1;
            if (iY == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iY2 = tVar.y() & 31;
            for (int i12 = 0; i12 < iY2; i12++) {
                arrayList.add(a(tVar));
            }
            int iY3 = tVar.y();
            for (int i13 = 0; i13 < iY3; i13++) {
                arrayList.add(a(tVar));
            }
            if (iY2 > 0) {
                g5.q.b bVarI = g5.q.i((byte[]) arrayList.get(0), iY, ((byte[]) arrayList.get(0)).length);
                int i14 = bVarI.f53141e;
                int i15 = bVarI.f53142f;
                f10 = bVarI.f53143g;
                i10 = i14;
                i11 = i15;
            } else {
                f10 = 1.0f;
                i10 = -1;
                i11 = -1;
            }
            return new a(arrayList, iY, i10, i11, f10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new ParserException("Error parsing AVC config", e10);
        }
    }

    public a(List<byte[]> list, int i10, int i11, int i12, float f10) {
        this.f53703a = list;
        this.f53704b = i10;
        this.f53705c = i11;
        this.f53706d = i12;
        this.f53707e = f10;
    }

    public static byte[] a(t tVar) {
        int iE = tVar.E();
        int iC = tVar.c();
        tVar.M(iE);
        return g5.d.d(tVar.f53154a, iC, iE);
    }
}
