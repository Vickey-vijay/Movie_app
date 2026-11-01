package sg.bigo.ads.ad.e;

import android.app.Activity;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes5.dex */
public class d extends sg.bigo.ads.ad.interstitial.i.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f67702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f67703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f67704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n f67705h;

    public d(@NonNull Activity activity) {
        super(activity);
        this.f67703f = false;
        this.f67704g = false;
    }

    public static /* synthetic */ boolean e(d dVar) {
        dVar.f67703f = true;
        return true;
    }

    public static /* synthetic */ void h(d dVar) {
        n nVar = dVar.f67705h;
        if (nVar != null) {
            nVar.d();
        }
        AdCountDownButton adCountDownButton = dVar.A;
        if (adCountDownButton != null) {
            adCountDownButton.b();
        }
    }

    public static /* synthetic */ boolean i(d dVar) {
        dVar.f67704g = true;
        return true;
    }

    public static /* synthetic */ void k(d dVar) {
        n nVar = dVar.f67705h;
        if (nVar != null) {
            nVar.c();
        }
        AdCountDownButton adCountDownButton = dVar.A;
        if (adCountDownButton != null) {
            adCountDownButton.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i.a, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void T() {
        super.T();
        T t10 = this.f68586y;
        if (t10 == 0) {
            return;
        }
        if (t10 instanceof h) {
            this.f67702e = (h) t10;
        } else {
            a("Illegal SAB content.");
        }
        if (this.A != null) {
            this.f67705h = new n(r.f70030a.a(1)) { // from class: sg.bigo.ads.ad.e.d.1
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.e.d.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (d.this.f67702e == null || d.this.f67703f) {
                                sg.bigo.ads.common.t.a.a(2, "", "Failed to claim reward because of null RewardVideoAd.");
                            } else {
                                d.e(d.this);
                                d.this.f67702e.N();
                            }
                            if (d.this.A != null) {
                                d.this.A.e();
                            }
                        }
                    });
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j10) {
                    if (d.this.A != null) {
                        d.this.A.a(j10);
                    }
                }
            };
            this.A.setVisibility(0);
            this.A.setTakeoverTickEvent(true);
            this.A.setShowCloseButtonInCountdown(true);
            this.A.a(1, (AdCountDownButton.b) null);
            this.f67705h.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void d(boolean z10) {
        if (this.A.getVisibility() != 0) {
            return;
        }
        if (!this.f67703f) {
            new c(this.L).a(new c.a() { // from class: sg.bigo.ads.ad.e.d.2
                @Override // sg.bigo.ads.ad.e.c.a
                public final void a() {
                    d.h(d.this);
                }

                @Override // sg.bigo.ads.ad.e.c.a
                public final void b() {
                }

                @Override // sg.bigo.ads.ad.e.c.a
                public final void c() {
                    d.i(d.this);
                    d.this.ab();
                }

                @Override // sg.bigo.ads.ad.e.c.a
                public final void d() {
                    d.k(d.this);
                }
            });
            return;
        }
        n nVar = this.f67705h;
        if (nVar != null) {
            nVar.b();
            this.f67705h = null;
        }
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.e();
        }
        super.d(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.i.a
    public final boolean e() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.i.a
    public final boolean j() {
        return this.f67703f;
    }
}
