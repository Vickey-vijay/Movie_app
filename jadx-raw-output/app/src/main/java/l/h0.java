package l;

import android.app.Activity;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.NativeAd;
import com.vungle.ads.VungleError;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 implements InitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f63339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f63340b;

    public h0(z zVar, Activity activity) {
        this.f63340b = zVar;
        this.f63339a = activity;
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onError(VungleError vungleError) {
        this.f63340b.x("Vungle init failed, InitCallback - onError: " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onSuccess() {
        NativeAd nativeAd = new NativeAd(this.f63339a.getApplicationContext(), this.f63340b.G);
        new AdConfig();
        nativeAd.setAdListener(this.f63340b.H);
        nativeAd.load(null);
    }
}
