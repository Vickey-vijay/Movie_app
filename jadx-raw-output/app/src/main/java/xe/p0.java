package xe;

import android.app.Activity;
import android.os.Handler;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.VungleError;
import gl.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements InitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f74462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f74463b;

    public p0(l lVar, Activity activity) {
        this.f74463b = lVar;
        this.f74462a = activity;
    }

    public final /* synthetic */ void a() {
        l lVar = this.f74463b;
        if (lVar.E) {
            return;
        }
        lVar.v("load ad time out");
        this.f74463b.F = true;
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onError(VungleError vungleError) {
        this.f74463b.x("Vungle init failed, InitCallback - onError: " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onSuccess() {
        AdConfig adConfig = new AdConfig();
        adConfig.setAdOrientation(r0.h(this.f74462a) ? 1 : 0);
        l lVar = this.f74463b;
        lVar.G = new InterstitialAd(this.f74462a, lVar.I, adConfig);
        this.f74463b.G.setAdListener(new y(this));
        this.f74463b.G.load(null);
        new Handler().postDelayed(new Runnable() { // from class: xe.o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f74459b.a();
            }
        }, this.f74463b.f61603x);
    }
}
