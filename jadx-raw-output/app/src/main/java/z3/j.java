package z3;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: DefaultTsPayloadReaderFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements h0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Format> f86053b;

    public j(int i10) {
        this(i10, Collections.singletonList(Format.w(null, "application/cea-608", 0, null)));
    }

    @Override // z3.h0.c
    public h0 a(int i10, h0.b bVar) {
        if (i10 == 2) {
            return new u(new n(c(bVar)));
        }
        if (i10 == 3 || i10 == 4) {
            return new u(new s(bVar.f86022b));
        }
        if (i10 == 15) {
            if (e(2)) {
                return null;
            }
            return new u(new i(false, bVar.f86022b));
        }
        if (i10 == 17) {
            if (e(2)) {
                return null;
            }
            return new u(new r(bVar.f86022b));
        }
        if (i10 == 21) {
            return new u(new q());
        }
        if (i10 == 27) {
            if (e(4)) {
                return null;
            }
            return new u(new o(b(bVar), e(1), e(8)));
        }
        if (i10 == 36) {
            return new u(new p(b(bVar)));
        }
        if (i10 == 89) {
            return new u(new l(bVar.f86023c));
        }
        if (i10 != 138) {
            if (i10 == 172) {
                return new u(new f(bVar.f86022b));
            }
            if (i10 != 129) {
                if (i10 != 130) {
                    if (i10 == 134) {
                        if (e(16)) {
                            return null;
                        }
                        return new a0(new c0());
                    }
                    if (i10 != 135) {
                        return null;
                    }
                } else if (!e(64)) {
                    return null;
                }
            }
            return new u(new c(bVar.f86022b));
        }
        return new u(new k(bVar.f86022b));
    }

    public final b0 b(h0.b bVar) {
        return new b0(d(bVar));
    }

    public final j0 c(h0.b bVar) {
        return new j0(d(bVar));
    }

    @Override // z3.h0.c
    public SparseArray<h0> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    public final List<Format> d(h0.b bVar) {
        String str;
        int i10;
        if (e(32)) {
            return this.f86053b;
        }
        g5.t tVar = new g5.t(bVar.f86024d);
        List<Format> arrayList = this.f86053b;
        while (tVar.a() > 0) {
            int iY = tVar.y();
            int iC = tVar.c() + tVar.y();
            if (iY == 134) {
                arrayList = new ArrayList<>();
                int iY2 = tVar.y() & 31;
                for (int i11 = 0; i11 < iY2; i11++) {
                    String strV = tVar.v(3);
                    int iY3 = tVar.y();
                    boolean z10 = (iY3 & 128) != 0;
                    if (z10) {
                        i10 = iY3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bY = (byte) tVar.y();
                    tVar.M(1);
                    arrayList.add(Format.y(null, str, null, -1, 0, strV, i10, null, Long.MAX_VALUE, z10 ? u4.d.a((bY & 64) != 0) : null));
                }
            }
            tVar.L(iC);
        }
        return arrayList;
    }

    public final boolean e(int i10) {
        return (i10 & this.f86052a) != 0;
    }

    public j(int i10, List<Format> list) {
        this.f86052a = i10;
        this.f86053b = list;
    }
}
