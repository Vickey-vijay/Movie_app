package k;

import android.app.Activity;
import android.os.Handler;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.VungleError;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements InitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f62004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f62005b;

    public e0(a0 a0Var, Activity activity) {
        this.f62005b = a0Var;
        this.f62004a = activity;
    }

    public final /* synthetic */ void a() {
        a0 a0Var = this.f62005b;
        if (a0Var.E) {
            return;
        }
        a0Var.v("load ad time out");
        this.f62005b.F = true;
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onError(VungleError vungleError) {
        this.f62005b.x("Vungle init failed, InitCallback - onError: " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onSuccess() {
        AdConfig adConfig = new AdConfig();
        adConfig.setAdOrientation(gl.r0.h(this.f62004a) ? 1 : 0);
        a0 a0Var = this.f62005b;
        a0Var.I = new InterstitialAd(this.f62004a, a0Var.H, adConfig);
        this.f62005b.I.setAdListener(new r0(this));
        this.f62005b.I.load(null);
        new Handler().postDelayed(new Runnable() { // from class: k.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f62002b.a();
            }
        }, this.f62005b.f61603x);
    }
}
