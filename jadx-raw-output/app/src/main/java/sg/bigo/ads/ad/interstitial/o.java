package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.api.InterstitialAd;

/* JADX INFO: loaded from: classes8.dex */
public class o extends k<sg.bigo.ads.api.core.h> {

    @NonNull
    public final sg.bigo.ads.ad.banner.c<o> B;
    public sg.bigo.ads.ad.banner.h C;
    public sg.bigo.ads.ad.interstitial.j.a D;
    private final boolean E;
    private boolean F;
    private final AtomicBoolean G;

    public o(@NonNull sg.bigo.ads.api.core.f fVar) {
        sg.bigo.ads.api.a.m mVarE;
        super(fVar);
        try {
            sg.bigo.ads.api.core.h hVar = (sg.bigo.ads.api.core.h) f();
            sg.bigo.ads.ad.interstitial.j.a aVar = null;
            if (hVar != null && (mVarE = hVar.e()) != null) {
                n nVar = new n();
                nVar.f68760a = mVarE.a("video_play_page.ad_component_layout");
                nVar.f68761b = mVarE.a("video_play_page.force_staying_time");
                nVar.f68762c = mVarE.a("video_play_page.close_button_style");
                nVar.f68763d = mVarE.a("video_play_page.x_area");
                nVar.f68764e = mVarE.a("video_play_page.duration");
                int i10 = nVar.f68760a;
                aVar = i10 != 1 ? i10 != 2 ? new sg.bigo.ads.ad.interstitial.j.a(this, this.f67537b.f69380e, nVar) : new sg.bigo.ads.ad.interstitial.j.c(this, this.f67537b.f69380e, nVar) : new sg.bigo.ads.ad.interstitial.j.b(this, this.f67537b.f69380e, nVar);
            }
            this.D = aVar;
            this.G = new AtomicBoolean(false);
            boolean zAv = hVar.av();
            this.E = zAv;
            sg.bigo.ads.ad.banner.c<o> cVar = new sg.bigo.ads.ad.banner.c<>(this.f67537b.f69380e, fVar, this, hVar, E(), new sg.bigo.ads.ad.banner.h() { // from class: sg.bigo.ads.ad.interstitial.o.1
                @Override // sg.bigo.ads.ad.banner.h
                public final void a() {
                    if (o.this.C != null) {
                        o.this.C.a();
                    }
                }

                @Override // sg.bigo.ads.ad.banner.h
                public final void a(String str) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialBannerAd", "InterstitialBannerAd onCustomJsOmImpression, adSessionId=".concat(String.valueOf(str)));
                    o.this.G();
                    sg.bigo.ads.core.d.b.a(o.this.f67537b.f69376a, (String) o.this.b("show_proportion", ""), o.this.j(), ((Integer) o.this.b("render_style", 0)).intValue());
                }

                /* JADX WARN: Code duplicated, block: B:15:0x002b  */
                @Override // sg.bigo.ads.ad.banner.h
                public final void a(sg.bigo.ads.common.i iVar, sg.bigo.ads.api.core.d dVar) {
                    boolean z10;
                    int i11 = 0;
                    if (iVar != null) {
                        Rect rect = ((k) o.this).A;
                        Point point = iVar.f69739a;
                        if (point == null || iVar.f69740b == null || rect == null || !rect.contains(point.x, point.y)) {
                            z10 = false;
                        } else {
                            Point point2 = iVar.f69740b;
                            if (rect.contains(point2.x, point2.y)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        if (z10) {
                            i11 = 33;
                        }
                    }
                    o.this.a(iVar, i11, 1, dVar);
                }

                @Override // sg.bigo.ads.ad.banner.h
                public final void b() {
                    o.d(o.this);
                    if (o.this.p()) {
                        o.this.G();
                    }
                }
            }, zAv);
            this.B = cVar;
            cVar.f67459c = 0;
            cVar.f67474r = this.D;
        } catch (Exception unused) {
            throw new IllegalArgumentException("Error data type for ad!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (this.G.compareAndSet(false, true)) {
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialBannerAd", "InterstitialBannerAd report impression AdEvent");
            super.n();
        }
    }

    public static /* synthetic */ boolean d(o oVar) {
        oVar.F = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final boolean B() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public Class<? extends sg.bigo.ads.controller.e.b<?>> D() {
        return m.class;
    }

    public sg.bigo.ads.core.mraid.n E() {
        return sg.bigo.ads.core.mraid.n.INTERSTITIAL;
    }

    public final n F() {
        sg.bigo.ads.ad.interstitial.j.a aVar = this.D;
        if (aVar != null) {
            return aVar.f68605c;
        }
        return null;
    }

    public final void a(AdCountDownButton adCountDownButton, View view) {
        int i10;
        sg.bigo.ads.ad.interstitial.j.a aVar = this.D;
        if (aVar == null || adCountDownButton == null) {
            return;
        }
        int i11 = aVar.f68605c.f68762c;
        if (i11 == 2) {
            i10 = R.drawable.bigo_ad_ic_close2;
        } else if (i11 == 3) {
            i10 = R.drawable.bigo_ad_ic_close3;
        } else if (i11 != 4) {
            i10 = i11 != 5 ? R.drawable.bigo_ad_ic_close : R.drawable.bigo_ad_ic_close5;
        } else {
            i10 = R.drawable.bigo_ad_ic_close4;
        }
        adCountDownButton.setCloseImageResource(i10);
        adCountDownButton.setShowCloseButtonInCountdown(true);
        adCountDownButton.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.j.a.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AdCountDownButton f68606a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f68607b;

            public AnonymousClass1() {
                adCountDownButton = adCountDownButton;
                view = view;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar2 = a.this;
                int i12 = aVar2.f68605c.f68763d;
                int i13 = 1;
                if (i12 != 1) {
                    i13 = 2;
                    if (i12 != 2) {
                        if (i12 != 3) {
                            return;
                        }
                        AdCountDownButton adCountDownButton2 = adCountDownButton;
                        View view2 = view;
                        Rect rect = new Rect();
                        adCountDownButton2.getHitRect(rect);
                        rect.inset((-rect.width()) / 2, (-rect.height()) / 2);
                        View closeView = adCountDownButton2.getCloseView();
                        if (view2 == null || closeView == null) {
                            return;
                        }
                        view2.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.interstitial.j.a.2

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ Rect f68609a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ View f68610b;

                            public AnonymousClass2() {
                                rect = rect;
                                view = closeView;
                            }

                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                    return false;
                                }
                                if (motionEvent.getActionMasked() != 0) {
                                    return true;
                                }
                                view.onTouchEvent(motionEvent);
                                return true;
                            }
                        });
                        return;
                    }
                }
                adCountDownButton.setBtnClickArea(i13);
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final void b(@NonNull Activity activity) {
        super.b(activity);
        sg.bigo.ads.ad.banner.c<o> cVar = this.B;
        if (cVar != null) {
            cVar.f67472p = new WeakReference<>(activity);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public void b(@NonNull sg.bigo.ads.api.b.d.a<InterstitialAd> aVar) {
        sg.bigo.ads.api.core.b bVar = this.f67537b.f69376a;
        if (!(bVar instanceof sg.bigo.ads.api.core.h)) {
            aVar.a(this, 1021, 1250, "InterstitialBannerAd with invalid AdData class type.");
            return;
        }
        sg.bigo.ads.api.core.h hVar = (sg.bigo.ads.api.core.h) bVar;
        if (hVar.aw() == null || TextUtils.isEmpty(hVar.aw().c())) {
            aVar.a(this, 1022, 1252, "Empty content.");
        } else {
            this.B.a(new sg.bigo.ads.api.b.a.InterfaceC0697a() { // from class: sg.bigo.ads.ad.interstitial.o.2
                @Override // sg.bigo.ads.api.b.a.InterfaceC0697a
                public final void a(sg.bigo.ads.api.core.c cVar) {
                }

                @Override // sg.bigo.ads.api.b.a.InterfaceC0697a
                public final void b() {
                }
            });
            aVar.a(this);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        this.C = null;
        super.destroyInMainThread();
        this.B.a();
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public String getCreativeId() {
        sg.bigo.ads.ad.banner.c<o> cVar = this.B;
        return cVar != null ? cVar.d() : "";
    }

    @Override // sg.bigo.ads.ad.c
    public final void h() {
        super.h();
        sg.bigo.ads.ad.banner.c<o> cVar = this.B;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void n() {
        if (!this.E || this.F) {
            G();
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialBannerAd", "BannerAd report impression AdEvent depend on om callback.");
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void o() {
        super.o();
        G();
    }
}
