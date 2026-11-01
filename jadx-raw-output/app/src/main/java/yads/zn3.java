package yads;

import java.util.Map;
import yads.zn3;

/* JADX INFO: loaded from: classes2.dex */
public final class zn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hb2 f85548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wz2 f85549b = new wz2();

    public final void a(final Map map) {
        wz2 wz2Var = this.f85549b;
        Runnable runnable = new Runnable() { // from class: cp.zd
            @Override // java.lang.Runnable
            public final void run() {
                zn3.a(this.f51744b, map);
            }
        };
        synchronized (wz2Var.f84387a) {
            if (wz2Var.f84388b) {
                return;
            }
            wz2Var.f84388b = true;
            mj.r rVar = mj.r.f64562a;
            runnable.run();
        }
    }

    public zn3(hb2 hb2Var) {
        this.f85548a = hb2Var;
    }

    public static final void a(zn3 zn3Var, Map map) {
        zn3Var.f85548a.setVisibility(0);
        boolean z10 = ad1.f75480a;
        hb2 hb2Var = zn3Var.f85548a;
        o11 o11Var = hb2Var.f78167g;
        if (o11Var != null) {
            o11Var.a(hb2Var, map);
        }
    }
}
