package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class Il {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4468qa f55361a = new C4468qa();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f55362b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4226gm f55363c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gl f55364d = new Gl(this);

    public static final Il a() {
        return Hl.f55323a;
    }

    public final Bm a(Context context, R4 r10, C4071am c4071am) {
        Bm bm2 = (Bm) this.f55362b.get(r10.f55816a);
        boolean z10 = true;
        if (bm2 == null) {
            synchronized (this.f55362b) {
                bm2 = (Bm) this.f55362b.get(r10.f55816a);
                if (bm2 == null) {
                    Bm bm3 = new Bm(new Cm(context, r10.f55816a, c4071am, this.f55364d));
                    bm3.f();
                    this.f55362b.put(r10.f55816a, bm3);
                    z10 = false;
                    bm2 = bm3;
                }
            }
        }
        if (z10) {
            bm2.a(c4071am);
        }
        return bm2;
    }

    public final void a(R4 r10, Rl rl2) {
        synchronized (this.f55362b) {
            this.f55361a.a(r10.f55816a, rl2);
            C4226gm c4226gm = this.f55363c;
            if (c4226gm != null) {
                rl2.a(c4226gm);
            }
        }
    }
}
