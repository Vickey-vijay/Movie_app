package yads;

import android.util.SparseArray;
import java.util.List;
import yads.ar;
import yads.fu;
import yads.m73;
import yads.mx0;
import yads.ye2;

/* JADX INFO: loaded from: classes2.dex */
public final class ar implements pq0, fu {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final du f75597k = new du() { // from class: cp.b
        @Override // yads.du
        public final fu a(int i10, mx0 mx0Var, boolean z10, List list, m73 m73Var, ye2 ye2Var) {
            return ar.a(i10, mx0Var, z10, list, m73Var, ye2Var);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final gg2 f75598l = new gg2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mq0 f75599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0 f75601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f75602e = new SparseArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f75603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public eu f75604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f75605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public vw2 f75606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mx0[] f75607j;

    @Override // yads.pq0
    public final void a() {
        mx0[] mx0VarArr = new mx0[this.f75602e.size()];
        for (int i10 = 0; i10 < this.f75602e.size(); i10++) {
            mx0 mx0Var = ((zq) this.f75602e.valueAt(i10)).f85565d;
            if (mx0Var == null) {
                throw new IllegalStateException();
            }
            mx0VarArr[i10] = mx0Var;
        }
        this.f75607j = mx0VarArr;
    }

    public final hu b() {
        vw2 vw2Var = this.f75606i;
        if (vw2Var instanceof hu) {
            return (hu) vw2Var;
        }
        return null;
    }

    public final void c() {
        this.f75599b.release();
    }

    public ar(mq0 mq0Var, int i10, mx0 mx0Var) {
        this.f75599b = mq0Var;
        this.f75600c = i10;
        this.f75601d = mx0Var;
    }

    public final void a(eu euVar, long j10, long j11) {
        m73 al0Var;
        this.f75604g = euVar;
        this.f75605h = j11;
        if (!this.f75603f) {
            this.f75599b.a(this);
            if (j10 != -9223372036854775807L) {
                this.f75599b.seek(0L, j10);
            }
            this.f75603f = true;
            return;
        }
        mq0 mq0Var = this.f75599b;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        mq0Var.seek(0L, j10);
        for (int i10 = 0; i10 < this.f75602e.size(); i10++) {
            zq zqVar = (zq) this.f75602e.valueAt(i10);
            if (euVar == null) {
                zqVar.f85566e = zqVar.f85564c;
            } else {
                zqVar.f85567f = j11;
                int i11 = zqVar.f85562a;
                lo loVar = (lo) euVar;
                int i12 = 0;
                while (true) {
                    int[] iArr = loVar.f79866a;
                    if (i12 < iArr.length) {
                        if (i11 == iArr[i12]) {
                            al0Var = loVar.f79867b[i12];
                            break;
                        }
                        i12++;
                    } else {
                        ih1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                        al0Var = new al0();
                        break;
                    }
                }
                zqVar.f85566e = al0Var;
                mx0 mx0Var = zqVar.f85565d;
                if (mx0Var != null) {
                    al0Var.a(mx0Var);
                }
            }
        }
    }

    public static fu a(int i10, mx0 mx0Var, boolean z10, List list, m73 m73Var, ye2 ye2Var) {
        mq0 sx0Var;
        String str = mx0Var.f80428l;
        if (ht1.e(str)) {
            return null;
        }
        if (str == null || (!str.startsWith("video/webm") && !str.startsWith("audio/webm") && !str.startsWith("application/webm") && !str.startsWith("video/x-matroska") && !str.startsWith("audio/x-matroska") && !str.startsWith("application/x-matroska"))) {
            sx0Var = new sx0(z10 ? 4 : 0, list, m73Var);
        } else {
            sx0Var = new zi1(new jd0(), 1);
        }
        return new ar(sx0Var, i10, mx0Var);
    }

    @Override // yads.pq0
    public final void a(vw2 vw2Var) {
        this.f75606i = vw2Var;
    }

    @Override // yads.pq0
    public final m73 a(int i10, int i11) {
        m73 al0Var;
        zq zqVar = (zq) this.f75602e.get(i10);
        if (zqVar == null) {
            if (this.f75607j == null) {
                zqVar = new zq(i10, i11, i11 == this.f75600c ? this.f75601d : null);
                eu euVar = this.f75604g;
                long j10 = this.f75605h;
                if (euVar == null) {
                    zqVar.f85566e = zqVar.f85564c;
                } else {
                    zqVar.f85567f = j10;
                    lo loVar = (lo) euVar;
                    int i12 = 0;
                    while (true) {
                        int[] iArr = loVar.f79866a;
                        if (i12 < iArr.length) {
                            if (i11 == iArr[i12]) {
                                al0Var = loVar.f79867b[i12];
                                break;
                            }
                            i12++;
                        } else {
                            ih1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                            al0Var = new al0();
                            break;
                        }
                    }
                    zqVar.f85566e = al0Var;
                    mx0 mx0Var = zqVar.f85565d;
                    if (mx0Var != null) {
                        al0Var.a(mx0Var);
                    }
                }
                this.f75602e.put(i10, zqVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zqVar;
    }
}
