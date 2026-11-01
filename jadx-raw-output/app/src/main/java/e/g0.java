package e;

import android.app.Activity;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.NativeAd;
import com.vungle.ads.VungleError;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 implements InitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f52295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f52296b;

    public g0(u uVar, Activity activity) {
        this.f52296b = uVar;
        this.f52295a = activity;
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onError(VungleError vungleError) {
        this.f52296b.v("Vungle init failed, InitCallback - onError: " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onSuccess() {
        NativeAd nativeAd = new NativeAd(this.f52295a.getApplicationContext(), this.f52296b.O);
        new AdConfig();
        nativeAd.setAdListener(this.f52296b.P);
        nativeAd.load(null);
    }
}
