package sg.bigo.ads.ad.e.a;

import android.app.Activity;
import android.view.View;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.e.e;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.utils.n;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends e implements sg.bigo.ads.ad.interstitial.g.b {
    private final sg.bigo.ads.ad.interstitial.g.a K;
    private n O;

    public b(@NonNull Activity activity, sg.bigo.ads.ad.interstitial.g.a aVar) {
        super(activity);
        this.K = aVar;
    }

    public static /* synthetic */ boolean d(b bVar) {
        bVar.f67746e = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final boolean C() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void F() {
        super.F();
        n nVar = this.O;
        if (nVar != null) {
            nVar.b();
            this.O = null;
        }
        n nVar2 = this.f67764w;
        if (nVar2 != null) {
            nVar2.b();
            this.f67764w = null;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.a
    public final void J() {
        long j10 = ((long) this.f67749h.f69013k) * 1000;
        if (j10 >= 0) {
            if (j10 == 0) {
                j10 = 500;
            }
            n nVar = new n(j10) { // from class: sg.bigo.ads.ad.e.a.b.1
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    if (((x) b.this).H || b.this.f67746e || b.this.K == null || b.this.K.d_()) {
                        return;
                    }
                    b.d(b.this);
                    b.this.K.c_();
                    ((s) b.this.f68586y).H().a((i) null, 8, 22);
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j11) {
                }
            };
            this.f67764w = nVar;
            nVar.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.i
    public final int Y() {
        int iN = n();
        return (iN == 1 || iN == 2 || iN == 3) ? R.layout.bigo_ad_activity_sub_interstitial_rich_video_1_3 : super.Y();
    }

    @Override // sg.bigo.ads.ad.interstitial.g.b
    public final void a(int i10) {
        sg.bigo.ads.ad.interstitial.g.a aVar = this.K;
        if (aVar != null) {
            aVar.a(i10, 2);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.g.b
    public final boolean a() {
        return f(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.q
    public final ValueCallback<Double> an() {
        return this.K.a();
    }

    @Override // sg.bigo.ads.ad.interstitial.x
    public final boolean aq() {
        return this.f67749h.f69013k == -2;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.b
    public final void b(int i10) {
        sg.bigo.ads.ad.interstitial.g.a aVar = this.K;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void g() {
        super.g();
        n nVar = this.O;
        if (nVar == null || !nVar.e()) {
            return;
        }
        this.O.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.g.b
    public final View g_() {
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.i
    public final void h(int i10) {
        super.h(i10);
        w wVar = this.f67749h;
        if (wVar != null && this.D != null) {
            n nVar = new n(((long) wVar.f69005c) * 1000) { // from class: sg.bigo.ads.ad.e.a.b.2
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) b.this.C) || b.this.e_() != 0) {
                        return;
                    }
                    b.this.a(0);
                    b.this.ap();
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j10) {
                }
            };
            this.O = nVar;
            nVar.c();
        }
        b(0);
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void i() {
        super.i();
        n nVar = this.O;
        if (nVar == null || nVar.e()) {
            return;
        }
        this.O.d();
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void m() {
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void o() {
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final boolean v() {
        return false;
    }
}
