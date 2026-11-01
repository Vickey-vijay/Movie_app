package sg.bigo.ads.ad.e.a;

import android.app.Activity;
import android.util.Pair;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.b.a.e;
import sg.bigo.ads.ad.e.h;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.g.d;

/* JADX INFO: loaded from: classes6.dex */
public class a extends d {
    private boolean O;
    private boolean P;

    public a(@NonNull Activity activity) {
        super(activity);
        this.O = false;
        this.P = false;
    }

    public static /* synthetic */ boolean a(a aVar) {
        aVar.P = true;
        return true;
    }

    private void ar() {
        if (this.O) {
            return;
        }
        T t10 = this.f68586y;
        if (t10 instanceof h) {
            this.O = true;
            ((h) t10).N();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.g.d
    public final boolean a(boolean z10, boolean z11) {
        boolean zA = super.a(z10, z11);
        if (!zA || ((d) this).K) {
            return zA;
        }
        new sg.bigo.ads.ad.e.c(this.L).a(new sg.bigo.ads.ad.e.c.a() { // from class: sg.bigo.ads.ad.e.a.a.1
            @Override // sg.bigo.ads.ad.e.c.a
            public final void a() {
                a.this.i();
            }

            @Override // sg.bigo.ads.ad.e.c.a
            public final void b() {
            }

            @Override // sg.bigo.ads.ad.e.c.a
            public final void c() {
                a.a(a.this);
                a.this.ab();
            }

            @Override // sg.bigo.ads.ad.e.c.a
            public final void d() {
                a.this.g();
            }
        });
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.d
    public final Pair<sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.interstitial.a> ao() {
        Object cVar;
        sg.bigo.ads.ad.b.b bVarG = ((d) this).H.G();
        if (bVarG == null) {
            return null;
        }
        if (bVarG instanceof sg.bigo.ads.ad.b.a.d) {
            cVar = new b(this.L, this);
        } else {
            cVar = bVarG instanceof e ? new c(this.L, this) : null;
        }
        if (cVar == null) {
            return null;
        }
        return new Pair<>(bVarG, cVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.g.d
    public final void ap() {
        ar();
    }

    @Override // sg.bigo.ads.ad.interstitial.g.d
    public final void aq() {
        ar();
    }

    @Override // sg.bigo.ads.ad.interstitial.g.d, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void g() {
        if (this.P) {
            return;
        }
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null && !adCountDownButton.f67721c) {
            adCountDownButton.c();
        }
        sg.bigo.ads.ad.interstitial.a aVar = ((d) this).G;
        if (aVar instanceof c) {
            ((c) aVar).g();
        } else if (aVar instanceof b) {
            ((b) aVar).g();
        } else {
            super.g();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.g.d, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void i() {
        if (this.P) {
            return;
        }
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null && !adCountDownButton.f67721c) {
            adCountDownButton.b();
        }
        sg.bigo.ads.ad.interstitial.a aVar = ((d) this).G;
        if (aVar instanceof c) {
            ((c) aVar).i();
        } else if (aVar instanceof b) {
            ((b) aVar).i();
        } else {
            super.i();
        }
    }
}
