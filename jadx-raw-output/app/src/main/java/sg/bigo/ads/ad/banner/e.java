package sg.bigo.ads.ad.banner;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.ironsource.InterfaceC3382ae;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.InnerBannerAd;
import sg.bigo.ads.core.mraid.n;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends sg.bigo.ads.ad.d<InnerBannerAd, sg.bigo.ads.api.core.h> implements InnerBannerAd {
    private FrameLayout A;
    private boolean B;
    private boolean C;
    private final AtomicBoolean D;
    private boolean E;
    private AdError[] F;
    private boolean G;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    private c<BannerAd> f67511z;

    public e(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
        this.F = new AdError[1];
        this.G = false;
        this.D = new AtomicBoolean(false);
        if (fVar.f69376a.w() == 3) {
            this.f67511z = a(fVar, this.F);
        }
    }

    @Nullable
    private AdError A() {
        if (this.f67511z == null) {
            AdError[] adErrorArr = this.F;
            AdError adError = adErrorArr[0];
            if (adError == null) {
                return new AdError(InterfaceC3382ae.a.f28168b, "Failed to create html ads.");
            }
            adErrorArr[0] = null;
            return adError;
        }
        try {
            sg.bigo.ads.api.core.h hVar = (sg.bigo.ads.api.core.h) f();
            if (hVar.aw() != null && !TextUtils.isEmpty(hVar.aw().c())) {
                return null;
            }
            return new AdError(InterfaceC3382ae.a.f28169c, "Empty content.");
        } catch (Exception unused) {
            return new AdError(InterfaceC3382ae.c.f28182d, "BannerAd with invalid AdData class type.");
        }
    }

    private void B() {
        if (!this.E) {
            this.E = true;
        }
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.banner.e.2
            @Override // java.lang.Runnable
            public final void run() {
                f.a.f67520a.b(e.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.D.compareAndSet(false, true)) {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "BannerAd report impression AdEvent");
            super.n();
        }
    }

    private boolean D() {
        try {
            return ((sg.bigo.ads.api.core.h) f()).az();
        } catch (Exception unused) {
            return false;
        }
    }

    @Nullable
    private c<BannerAd> a(sg.bigo.ads.api.core.f fVar, @NonNull AdError[] adErrorArr) {
        try {
            sg.bigo.ads.api.core.h hVar = (sg.bigo.ads.api.core.h) f();
            this.B = hVar.av();
            Context context = this.f67537b.f69380e;
            int iC = fVar.f69378c.c();
            return new c<>(context, fVar, this, hVar, (iC == 3 || iC == 4) ? n.INTERSTITIAL : n.INLINE, new h() { // from class: sg.bigo.ads.ad.banner.e.1
                @Override // sg.bigo.ads.ad.banner.h
                public final void a() {
                }

                /* JADX WARN: Type inference failed for: r6v5, types: [sg.bigo.ads.api.core.b] */
                @Override // sg.bigo.ads.ad.banner.h
                public final void a(String str) {
                    sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "BannerAd onCustomJsOmImpression, adSessionId=".concat(String.valueOf(str)));
                    e.this.C();
                    sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) e.this.f(), (String) e.this.b("show_proportion", ""), e.this.j(), ((Integer) e.this.b("render_style", 0)).intValue());
                }

                @Override // sg.bigo.ads.ad.banner.h
                public final void a(sg.bigo.ads.common.i iVar, sg.bigo.ads.api.core.d dVar) {
                    e.this.a(iVar, dVar);
                }

                @Override // sg.bigo.ads.ad.banner.h
                public final void b() {
                    e.b(e.this);
                    if (e.this.p()) {
                        e.this.C();
                    }
                }
            }, this.B);
        } catch (Exception unused) {
            adErrorArr[0] = new AdError(InterfaceC3382ae.c.f28182d, "Unable to init banner ad due to invalid ad data");
            return null;
        }
    }

    private void a(boolean z10) {
        if (this.f67511z == null) {
            return;
        }
        final sg.bigo.ads.api.core.h hVar = (sg.bigo.ads.api.core.h) f();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final sg.bigo.ads.api.b.a.InterfaceC0697a interfaceC0697a = new sg.bigo.ads.api.b.a.InterfaceC0697a() { // from class: sg.bigo.ads.ad.banner.e.3
            @Override // sg.bigo.ads.api.b.a.InterfaceC0697a
            public final void a(sg.bigo.ads.api.core.c cVar) {
                sg.bigo.ads.core.d.b.a(hVar, "banner_load_cost", SystemClock.elapsedRealtime() - jElapsedRealtime, 0, (Map<String, String>) null);
                sg.bigo.ads.common.t.a.a(1, 5, "BannerAd", "Failed to load banner media.");
            }

            @Override // sg.bigo.ads.api.b.a.InterfaceC0697a
            public final void b() {
                sg.bigo.ads.core.d.b.a(hVar, "banner_load_cost", SystemClock.elapsedRealtime() - jElapsedRealtime, 1, (Map<String, String>) null);
                sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "banner load success");
            }
        };
        if (z10) {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Banner load when onAdLoaded() ");
            this.f67511z.a(interfaceC0697a);
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Banner load when adView() ");
            sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.banner.e.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (e.this.f67511z.b(interfaceC0697a)) {
                        return;
                    }
                    interfaceC0697a.a(new sg.bigo.ads.api.core.c(3001, 10102, "Adx media load error when load"));
                }
            });
        }
    }

    public static /* synthetic */ boolean b(e eVar) {
        eVar.C = true;
        return true;
    }

    public final void a(long j10) {
        a("attach_render_cost", Long.valueOf(j10));
    }

    @Override // sg.bigo.ads.api.BannerAd
    @Nullable
    @UiThread
    public final View adView() {
        c<BannerAd> cVar = this.f67511z;
        if (cVar == null) {
            return null;
        }
        if (!cVar.f67477u) {
            a(false);
        }
        View viewC = this.f67511z.c();
        if (this.A == null) {
            this.A = new FrameLayout(viewC.getContext());
        }
        this.A.removeAllViews();
        this.A.addView(viewC);
        v();
        a(this.A, this.G);
        return this.A;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        c<BannerAd> cVar = this.f67511z;
        if (cVar != null) {
            cVar.a();
        }
        B();
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) f(), SystemClock.elapsedRealtime() - this.f67546k);
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final String getCreativeId() {
        c<BannerAd> cVar = this.f67511z;
        return cVar != null ? cVar.d() : "";
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getHeight() {
        c<BannerAd> cVar = this.f67511z;
        if (cVar == null) {
            return 0;
        }
        sg.bigo.ads.api.core.h hVar = cVar.f67469m;
        return (hVar == null || hVar.aw() == null || cVar.f67469m.aw().a() <= 0 || cVar.f67469m.aw().b() <= 0) ? cVar.i().getHeight() : cVar.f67469m.aw().b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.api.core.b getInnerBannerAdData() {
        return f();
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.common.view.c getWatermarkView() {
        c<BannerAd> cVar = this.f67511z;
        if (cVar == null) {
            return null;
        }
        return cVar.f67478v;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final WebView getWebView() {
        c<BannerAd> cVar = this.f67511z;
        if (cVar == null) {
            return null;
        }
        return cVar.f67457a;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getWidth() {
        c<BannerAd> cVar = this.f67511z;
        if (cVar == null) {
            return 0;
        }
        sg.bigo.ads.api.core.h hVar = cVar.f67469m;
        return (hVar == null || hVar.aw() == null || cVar.f67469m.aw().a() <= 0 || cVar.f67469m.aw().b() <= 0) ? cVar.i().getWidth() : cVar.f67469m.aw().a();
    }

    @Override // sg.bigo.ads.ad.c
    public final void h() {
        c<BannerAd> cVar = this.f67511z;
        if (cVar != null) {
            b.g(cVar);
            T t10 = cVar.f67468l;
            if (t10 instanceof e) {
                ((e) t10).a(b.i(cVar));
            }
        }
        super.h();
        c<BannerAd> cVar2 = this.f67511z;
        if (cVar2 != null) {
            cVar2.f();
        }
        B();
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void handleInnerBannerAdResponse(@NonNull sg.bigo.ads.api.b.d.a<InnerBannerAd> aVar) {
        String str;
        this.E = false;
        AdError adErrorA = A();
        if (adErrorA != null) {
            aVar.a(this, 1005, adErrorA.getCode(), adErrorA.getMessage());
            return;
        }
        sg.bigo.ads.api.core.h.a aVarAx = this.f67511z.f67469m.ax();
        if ((aVarAx != null && aVarAx.a()) && !D()) {
            try {
                sg.bigo.ads.api.core.h hVar = (sg.bigo.ads.api.core.h) f();
                sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Banner load when onAdLoaded() ");
                if (f.a.f67520a.a(this)) {
                    this.E = true;
                    hVar.aA();
                    a(true);
                } else {
                    str = "Banner preload limit 3 BannerAds.";
                    sg.bigo.ads.common.t.a.a(0, 5, "BannerAd", str);
                }
            } catch (Exception unused) {
                str = "Banner preload, not BannerAdData type.";
            }
        }
        aVar.a(this);
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final boolean isInnerBannerAdFromAutoRefresh() {
        return D();
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void markFromAutoFresh(sg.bigo.ads.api.core.b bVar) {
        this.G = true;
        if (bVar instanceof sg.bigo.ads.api.core.h) {
            ((sg.bigo.ads.api.core.h) bVar).ay();
        }
        a();
    }

    @Override // sg.bigo.ads.ad.c
    public final void n() {
        if (!this.B || this.C) {
            C();
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "BannerAd report impression AdEvent depend on om callback.");
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void o() {
        super.o();
        C();
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final int updateFormOpenTimes() {
        return z();
    }
}
