package yads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zj2 implements bg1, l21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f85443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r33 f85444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cr f85445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pq0 f85446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vy f85447e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f85449g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f85451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u30 f85452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ms2 f85453k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f85454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ek2 f85455m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gg2 f85448f = new gg2();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f85450h = true;

    public final u30 a(long j10) {
        Collections.emptyMap();
        Uri uri = this.f85443a;
        String str = this.f85455m.f77112j;
        Map map = ek2.N;
        ni.a(uri, "The uri must be set.");
        return new u30(uri, 0L, 1, null, map, j10, -1L, str, 6, null);
    }

    @Override // yads.bg1
    public final void b() {
        this.f85449g = true;
    }

    public zj2(ek2 ek2Var, Uri uri, p30 p30Var, cr crVar, pq0 pq0Var, vy vyVar) {
        this.f85455m = ek2Var;
        this.f85443a = uri;
        this.f85444b = new r33(p30Var);
        this.f85445c = crVar;
        this.f85446d = pq0Var;
        this.f85447e = vyVar;
        vf1.a();
        this.f85452j = a(0L);
    }

    @Override // yads.bg1
    public final void a() {
        p30 m21Var;
        long j10;
        long j11;
        int i10;
        int iA = 0;
        while (iA == 0 && !this.f85449g) {
            try {
                long j12 = this.f85448f.f77799a;
                u30 u30VarA = a(j12);
                this.f85452j = u30VarA;
                long jA = this.f85444b.a(u30VarA);
                if (jA != -1) {
                    jA += j12;
                    this.f85455m.h();
                }
                long j13 = jA;
                this.f85455m.f77121s = p21.a(this.f85444b.f82096a.getResponseHeaders());
                r33 r33Var = this.f85444b;
                p21 p21Var = this.f85455m.f77121s;
                if (p21Var == null || (i10 = p21Var.f81211g) == -1) {
                    m21Var = r33Var;
                } else {
                    m21Var = new m21(r33Var, i10, this);
                    ek2 ek2Var = this.f85455m;
                    ek2Var.getClass();
                    ms2 ms2VarA = ek2Var.a(new ck2(true, 0));
                    this.f85453k = ms2VarA;
                    ms2VarA.a(ek2.O);
                }
                long j14 = j12;
                this.f85445c.a(m21Var, this.f85443a, this.f85444b.f82096a.getResponseHeaders(), j12, j13, this.f85446d);
                if (this.f85455m.f77121s != null) {
                    mq0 mq0Var = this.f85445c.f76410b;
                    if (mq0Var instanceof iv1) {
                        ((iv1) mq0Var).f78836q = true;
                    }
                }
                if (this.f85450h) {
                    cr crVar = this.f85445c;
                    long j15 = this.f85451i;
                    mq0 mq0Var2 = crVar.f76410b;
                    mq0Var2.getClass();
                    mq0Var2.seek(j14, j15);
                    this.f85450h = false;
                }
                while (true) {
                    long j16 = j14;
                    while (true) {
                        if (iA != 0 || this.f85449g) {
                            break;
                        }
                        try {
                            this.f85447e.a();
                            cr crVar2 = this.f85445c;
                            gg2 gg2Var = this.f85448f;
                            mq0 mq0Var3 = crVar2.f76410b;
                            mq0Var3.getClass();
                            ld0 ld0Var = crVar2.f76411c;
                            ld0Var.getClass();
                            iA = mq0Var3.a(ld0Var, gg2Var);
                            ld0 ld0Var2 = this.f85445c.f76411c;
                            j14 = ld0Var2 != null ? ld0Var2.f79757d : -1L;
                            if (j14 > this.f85455m.f77113k + j16) {
                                vy vyVar = this.f85447e;
                                synchronized (vyVar) {
                                    vyVar.f84041a = false;
                                }
                                ek2 ek2Var2 = this.f85455m;
                                ek2Var2.f77119q.post(ek2Var2.f77118p);
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                }
                if (iA == 1) {
                    iA = 0;
                } else {
                    ld0 ld0Var3 = this.f85445c.f76411c;
                    if (ld0Var3 != null) {
                        j11 = ld0Var3.f79757d;
                        j10 = -1;
                    } else {
                        j10 = -1;
                        j11 = -1;
                    }
                    if (j11 != j10) {
                        this.f85448f.f77799a = ld0Var3 != null ? ld0Var3.f79757d : -1L;
                    }
                }
                s30.a(this.f85444b);
            } catch (Throwable th2) {
                if (iA != 1) {
                    ld0 ld0Var4 = this.f85445c.f76411c;
                    if ((ld0Var4 != null ? ld0Var4.f79757d : -1L) != -1) {
                        this.f85448f.f77799a = ld0Var4 != null ? ld0Var4.f79757d : -1L;
                    }
                }
                s30.a(this.f85444b);
                throw th2;
            }
        }
    }
}
