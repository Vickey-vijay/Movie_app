package sg.bigo.ads.ad.c;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.c.a.a.AnonymousClass2;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InnerBannerAd;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.h;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.p.e;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements sg.bigo.ads.ad.b.b.InterfaceC0652b, InnerBannerAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private sg.bigo.ads.ad.b.b f67610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private sg.bigo.ads.ad.c.b f67611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f67612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f67613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private sg.bigo.ads.ad.c.a.a f67614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private c f67615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f67616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f67617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f67618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f67619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f67620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private sg.bigo.ads.api.b.d.a<InnerBannerAd> f67621l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a f67622m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private sg.bigo.ads.ad.b.b.a f67623n;

    public class a implements AdInteractionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public AdInteractionListener f67626a;

        public a() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClicked() {
            AdInteractionListener adInteractionListener = this.f67626a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClicked();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClosed() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdError(@NonNull AdError adError) {
            if (this.f67626a != null) {
                if (adError.getCode() == 2002 && d.g(d.this)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "BannerNativeAd", "don't call onAdError when video has impressed");
                } else {
                    this.f67626a.onAdError(adError);
                }
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdImpression() {
            d.this.f67620k = SystemClock.elapsedRealtime();
            if (d.this.f67614e != null && d.this.f67615f != null) {
                d.this.f67614e.a(d.this.f67615f.f67608b);
            }
            if (d.this.f67610a != null) {
                d.this.f67610a.a(d.this.f67623n);
            }
            AdInteractionListener adInteractionListener = this.f67626a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdImpression();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdOpened() {
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public sg.bigo.ads.api.b.d.a<NativeAd> f67628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public sg.bigo.ads.api.b.d.a<NativeAd> f67629b;

        public b(@NonNull final sg.bigo.ads.api.b.d.a<InnerBannerAd> aVar) {
            this.f67628a = new sg.bigo.ads.api.b.d.a<NativeAd>() { // from class: sg.bigo.ads.ad.c.d.b.1
                @Override // sg.bigo.ads.api.b.d.a
                public final /* synthetic */ void a(Ad ad2) {
                    boolean z10 = false;
                    if (d.this.f67614e == null) {
                        d.c(d.this);
                        d.this.a((sg.bigo.ads.api.b.d.a<InnerBannerAd>) aVar, 1, false);
                        return;
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "BannerNativeAd", "native-banner icon load success");
                    d.d(d.this);
                    if (d.this.f67611b != null) {
                        sg.bigo.ads.ad.c.a.a aVar2 = d.this.f67614e;
                        ImageView imageView = d.this.f67611b.f67603a;
                        if (d.this.f67610a != null && d.this.f67610a.p()) {
                            z10 = true;
                        }
                        aVar2.a(imageView, z10);
                    }
                    d.this.a(1, 3);
                    d.this.a((sg.bigo.ads.api.b.d.a<InnerBannerAd>) aVar, 1, true);
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* synthetic */ void a(Ad ad2, int i10, int i11, String str) {
                    sg.bigo.ads.common.t.a.a(0, 3, "BannerNativeAd", "native-banner icon load failed");
                    d.c(d.this);
                    if (i11 == 10103) {
                        d.this.a(1, 1);
                    } else {
                        d.this.a(1, 4);
                    }
                    d.this.a((sg.bigo.ads.api.b.d.a<InnerBannerAd>) aVar, 1, false);
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* bridge */ /* synthetic */ void a(Ad ad2, boolean z10, int i10, int i11, String str, boolean z11) {
                }
            };
            this.f67629b = new sg.bigo.ads.api.b.d.a<NativeAd>() { // from class: sg.bigo.ads.ad.c.d.b.2
                @Override // sg.bigo.ads.api.b.d.a
                public final /* synthetic */ void a(Ad ad2) {
                    NativeAd nativeAd = (NativeAd) ad2;
                    boolean z10 = false;
                    if (d.this.f67614e == null) {
                        d.c(d.this);
                        d.this.a((sg.bigo.ads.api.b.d.a<InnerBannerAd>) aVar, 1, false);
                        return;
                    }
                    d.d(d.this);
                    b.a(b.this, nativeAd, 3);
                    sg.bigo.ads.ad.c.a.a aVar2 = d.this.f67614e;
                    aVar2.a(aVar2.new AnonymousClass2(), nativeAd instanceof sg.bigo.ads.ad.b.a.a);
                    sg.bigo.ads.ad.c.a.a aVar3 = d.this.f67614e;
                    if (d.this.f67610a != null && d.this.f67610a.p()) {
                        z10 = true;
                    }
                    aVar3.a(z10);
                    d.this.a((sg.bigo.ads.api.b.d.a<InnerBannerAd>) aVar, 1, true);
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* synthetic */ void a(Ad ad2, int i10, int i11, String str) {
                    b bVar;
                    int i12;
                    NativeAd nativeAd = (NativeAd) ad2;
                    sg.bigo.ads.common.t.a.a(0, 3, "BannerNativeAd", "native-banner main media load failed");
                    d.c(d.this);
                    if (i11 == 1401 || i11 == 10074 || i11 == 10103 || i11 == 1300) {
                        bVar = b.this;
                        i12 = 1;
                    } else {
                        bVar = b.this;
                        i12 = 4;
                    }
                    b.a(bVar, nativeAd, i12);
                    d.this.a((sg.bigo.ads.api.b.d.a<InnerBannerAd>) aVar, 1, false);
                }

                @Override // sg.bigo.ads.api.b.d.a
                public final /* bridge */ /* synthetic */ void a(Ad ad2, boolean z10, int i10, int i11, String str, boolean z11) {
                }
            };
        }

        public static /* synthetic */ void a(b bVar, NativeAd nativeAd, int i10) {
            if (nativeAd instanceof sg.bigo.ads.ad.b.a.b) {
                d.this.a(3, i10);
            } else if (nativeAd instanceof sg.bigo.ads.ad.b.a.a) {
                d.this.a(2, i10);
            }
        }

        public final void a() {
            this.f67628a = null;
            this.f67629b = null;
        }
    }

    public d(@NonNull f fVar) {
        this.f67616g = 0;
        this.f67617h = 0;
        this.f67618i = false;
        a aVar = new a();
        this.f67622m = aVar;
        this.f67623n = new sg.bigo.ads.ad.b.b.a() { // from class: sg.bigo.ads.ad.c.d.1
            @Override // sg.bigo.ads.ad.b.b.a
            public final void a() {
                if (d.this.f67614e != null) {
                    d.this.f67614e.f();
                }
            }
        };
        this.f67619j = fVar;
        sg.bigo.ads.ad.b.b bVarA = sg.bigo.ads.ad.b.a.a(fVar);
        this.f67610a = bVarA;
        if (bVarA != null) {
            bVarA.setAdInteractionListener(aVar);
            this.f67615f = new c(fVar);
            this.f67611b = new sg.bigo.ads.ad.c.b(this.f67610a);
            h.b bVarAw = ((sg.bigo.ads.core.a.a) this.f67610a.f()).aw();
            sg.bigo.ads.ad.b.b bVar = this.f67610a;
            this.f67614e = bVar != null ? sg.bigo.ads.ad.c.a.a.a(bVar, bVar.f67537b.f69381f, bVarAw) : null;
            this.f67612c = Boolean.FALSE;
            this.f67613d = null;
            this.f67616g = 0;
            this.f67617h = 0;
            this.f67618i = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(sg.bigo.ads.api.b.d.a<InnerBannerAd> aVar, int i10, boolean z10) {
        int i11;
        String str;
        if (aVar == null) {
            return;
        }
        if (this.f67612c.booleanValue()) {
            return;
        }
        c cVar = this.f67615f;
        int i12 = 2;
        if (cVar != null && cVar.f67607a == 2 && i10 == 2) {
            d();
            aVar.a(this);
            this.f67612c = Boolean.TRUE;
            return;
        }
        sg.bigo.ads.ad.b.b bVar = this.f67610a;
        if (bVar != null && ((sg.bigo.ads.core.a.a) bVar.f()).aR()) {
            i12 = 3;
        }
        if (!z10) {
            if (this.f67617h == i12 || this.f67618i) {
                if (this.f67618i) {
                    i11 = 1006;
                    str = "native banner VAST parse failed";
                } else {
                    i11 = 1253;
                    str = "native banner download icon & main resources all failed";
                }
                aVar.a(this, 1005, i11, str);
            }
        }
        d();
        aVar.a(this);
        this.f67612c = Boolean.TRUE;
    }

    public static /* synthetic */ int c(d dVar) {
        int i10 = dVar.f67617h;
        dVar.f67617h = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b bVar = this.f67613d;
        if (bVar != null) {
            bVar.a();
            this.f67613d = null;
        }
        sg.bigo.ads.ad.c.a.a aVar = this.f67614e;
        if (aVar != null) {
            aVar.h();
        }
        sg.bigo.ads.ad.c.b bVar2 = this.f67611b;
        if (bVar2 != null) {
            bVar2.a();
        }
    }

    public static /* synthetic */ int d(d dVar) {
        int i10 = dVar.f67616g;
        dVar.f67616g = i10 + 1;
        return i10;
    }

    private void d() {
        sg.bigo.ads.ad.c.b bVar;
        sg.bigo.ads.ad.c.a.a aVar = this.f67614e;
        if (aVar == null || (bVar = this.f67611b) == null) {
            return;
        }
        aVar.a(bVar.f67603a, e());
    }

    private int e() {
        c cVar = this.f67615f;
        return (cVar == null || cVar.f67609c != 2) ? 3 : 1;
    }

    public static /* synthetic */ boolean g(d dVar) {
        sg.bigo.ads.ad.b.b bVar = dVar.f67610a;
        return bVar != null && bVar.p();
    }

    @Override // sg.bigo.ads.ad.b.b.InterfaceC0652b
    public final void a() {
        a(this.f67621l, 2, false);
        final sg.bigo.ads.ad.c.b bVar = this.f67611b;
        final sg.bigo.ads.api.b.d.a<NativeAd> aVar = this.f67613d.f67628a;
        sg.bigo.ads.ad.b.b bVar2 = bVar.f67604b;
        if (bVar2 != null) {
            sg.bigo.ads.core.a.a aVar2 = (sg.bigo.ads.core.a.a) bVar2.f();
            if (aVar2.av() == null) {
                aVar.a(bVar.f67604b, 3001, 10103, "banner icon is empty");
                return;
            }
            String strC = aVar2.av().c();
            if (q.a((CharSequence) strC)) {
                aVar.a(bVar.f67604b, 3001, 10103, "banner icon url is empty");
            } else if (i.f69318a.n().a(9) && URLUtil.isHttpUrl(strC)) {
                aVar.a(bVar.f67604b, 3001, 10118, "Invalid http banner icon url");
            } else {
                e.b(bVar.f67604b.f67537b.f69380e, sg.bigo.ads.common.u.a.e.j(), strC, aVar2.al(), new g() { // from class: sg.bigo.ads.ad.c.b.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ sg.bigo.ads.api.b.d.a f67605a;

                    public AnonymousClass1() {
                        aVar = aVar;
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i10, @NonNull String str, String str2) {
                        sg.bigo.ads.api.b.d.a aVar3;
                        b bVar3 = b.this;
                        sg.bigo.ads.ad.b.b bVar4 = bVar3.f67604b;
                        if (bVar4 == null || bVar3.f67603a == null || (aVar3 = aVar) == null) {
                            return;
                        }
                        aVar3.a(bVar4, i10, 3001, str);
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                        b bVar3 = b.this;
                        sg.bigo.ads.ad.b.b bVar4 = bVar3.f67604b;
                        if (bVar4 == null || bVar3.f67603a == null || aVar == null) {
                            return;
                        }
                        bVar4.a(bitmap, 1);
                        b.this.f67603a.setImageBitmap(bitmap);
                        aVar.a(b.this.f67604b);
                    }
                });
            }
        }
    }

    public final void a(int i10, int i11) {
        Integer numValueOf;
        String str;
        sg.bigo.ads.ad.b.b bVar = this.f67610a;
        if (bVar == null) {
            return;
        }
        if (i10 == 1) {
            numValueOf = Integer.valueOf(i11);
            str = "icon_sta";
        } else {
            if (i10 != 2) {
                if (i10 == 3 && (bVar instanceof sg.bigo.ads.ad.b.a.b)) {
                    bVar.a("vid_sta", Integer.valueOf(i11));
                    return;
                }
                return;
            }
            numValueOf = Integer.valueOf(i11);
            str = "img_sta";
        }
        bVar.a(str, numValueOf);
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final View adView() {
        if (!sg.bigo.ads.common.n.d.b()) {
            t.a("adView() must run on UI thread");
        }
        if (this.f67610a == null) {
            return null;
        }
        if (isExpired()) {
            this.f67610a.b(2000, 1, "The ad is expired.");
            return null;
        }
        sg.bigo.ads.ad.b.b bVar = this.f67610a;
        if (bVar.f67544i) {
            bVar.b(2000, 1, "The ad is destroyed.");
            return null;
        }
        sg.bigo.ads.ad.c.a.a aVar = this.f67614e;
        if (aVar != null) {
            return aVar.e();
        }
        bVar.a(2000, "mNativeBannerRender is null.");
        return null;
    }

    @Override // sg.bigo.ads.ad.b.b.InterfaceC0652b
    public final void b() {
        this.f67618i = true;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Ad ad2) {
        Ad ad3 = ad2;
        sg.bigo.ads.ad.b.b bVar = this.f67610a;
        if (bVar != null) {
            return bVar.compareTo(ad3);
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.Ad
    public final void destroy() {
        destroyInMainThread();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void destroyInMainThread() {
        if (sg.bigo.ads.common.n.d.b()) {
            c();
        } else {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.c.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.c();
                }
            });
        }
        sg.bigo.ads.ad.b.b bVar = this.f67610a;
        if (bVar != null) {
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) bVar.f(), SystemClock.elapsedRealtime() - this.f67620k);
        }
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final AdBid getBid() {
        sg.bigo.ads.ad.b.b bVar = this.f67610a;
        if (bVar != null) {
            return bVar.getBid();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final String getCreativeId() {
        sg.bigo.ads.ad.b.b bVar = this.f67610a;
        return bVar != null ? bVar.getCreativeId() : "";
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final String getExtraInfo(String str) {
        sg.bigo.ads.ad.b.b bVar = this.f67610a;
        if (bVar != null) {
            return bVar.getExtraInfo(str);
        }
        return null;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getHeight() {
        sg.bigo.ads.ad.c.a.a aVar = this.f67614e;
        if (aVar != null) {
            return aVar.j();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.api.core.b getInnerBannerAdData() {
        sg.bigo.ads.ad.b.b bVar = this.f67610a;
        if (bVar != null) {
            return bVar.f();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.common.view.c getWatermarkView() {
        sg.bigo.ads.ad.b.b bVar = this.f67610a;
        if (bVar != null) {
            return bVar.C();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final WebView getWebView() {
        return null;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getWidth() {
        sg.bigo.ads.ad.c.a.a aVar = this.f67614e;
        if (aVar != null) {
            return aVar.i();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void handleInnerBannerAdResponse(@NonNull sg.bigo.ads.api.b.d.a<InnerBannerAd> aVar) {
        sg.bigo.ads.ad.b.b bVar = this.f67610a;
        if (bVar == null) {
            aVar.a(this, 1005, 1253, "native banner mNativeAd is null");
            return;
        }
        bVar.b(true);
        this.f67621l = aVar;
        if (this.f67613d == null) {
            this.f67613d = new b(aVar);
        }
        a(1, 2);
        a(2, 2);
        a(3, 2);
        sg.bigo.ads.ad.b.b bVar2 = this.f67610a;
        if (bVar2 != null) {
            bVar2.a((sg.bigo.ads.ad.b.b.InterfaceC0652b) this);
            this.f67610a.a(this.f67613d.f67629b, 0);
        }
    }

    @Override // sg.bigo.ads.api.Ad
    public final boolean isExpired() {
        sg.bigo.ads.ad.b.b bVar = this.f67610a;
        if (bVar != null) {
            return bVar.isExpired();
        }
        return false;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final boolean isInnerBannerAdFromAutoRefresh() {
        sg.bigo.ads.ad.b.b bVar = this.f67610a;
        if (bVar != null) {
            return ((sg.bigo.ads.core.a.a) bVar.f()).bl();
        }
        return false;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void markFromAutoFresh(sg.bigo.ads.api.core.b bVar) {
        if (bVar instanceof n) {
            ((n) bVar).bk();
        }
        sg.bigo.ads.ad.b.b bVar2 = this.f67610a;
        if (bVar2 != null) {
            bVar2.a();
        }
    }

    @Override // sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        this.f67622m.f67626a = adInteractionListener;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final int updateFormOpenTimes() {
        sg.bigo.ads.ad.b.b bVar = this.f67610a;
        if (bVar != null) {
            return bVar.z();
        }
        return 0;
    }
}
