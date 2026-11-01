package dp;

import android.app.Activity;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.NativeAd;
import com.vungle.ads.VungleError;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements InitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f52274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f52275b;

    public r0(e eVar, Activity activity) {
        this.f52275b = eVar;
        this.f52274a = activity;
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onError(VungleError vungleError) {
        this.f52275b.x("Vungle init failed, InitCallback - onError: " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onSuccess() {
        NativeAd nativeAd = new NativeAd(this.f52274a.getApplicationContext(), this.f52275b.J);
        new AdConfig();
        nativeAd.setAdListener(this.f52275b.K);
        nativeAd.load(null);
    }
}
