package sg.bigo.ads.ad.e;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.w;

/* JADX INFO: loaded from: classes11.dex */
public class f extends sg.bigo.ads.ad.interstitial.k.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public h f67711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f67712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f67713e;

    public f(@NonNull Activity activity) {
        super(activity);
        this.f67712d = true;
        this.f67713e = false;
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void T() {
        super.T();
        T t10 = this.f68586y;
        if (t10 == 0) {
            return;
        }
        if (t10 instanceof h) {
            this.f67711c = (h) t10;
        }
        if (this.f67711c == null || !am()) {
            a("Illegal VPAID content.");
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k.a
    public final void a() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(false);
        }
        super.a();
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ag() {
        if (this.f67712d) {
            d(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.q
    public final int ai() {
        return 2;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void d(boolean z10) {
        if (this.A.getVisibility() == 0) {
            AdCountDownButton adCountDownButton = this.A;
            if (adCountDownButton.f67721c) {
                if (!this.f67713e) {
                    adCountDownButton.e();
                    h hVar = this.f67711c;
                    if (hVar != null) {
                        this.f67713e = true;
                        hVar.N();
                    }
                }
                super.d(true);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void l() {
        super.l();
        w wVar = ((sg.bigo.ads.ad.interstitial.k.a) this).f68613a;
        if (wVar != null) {
            wVar.f69005c = 15;
            wVar.f69008f = true;
            wVar.f69009g = false;
        }
    }
}
