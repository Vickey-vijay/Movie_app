package f;

import android.app.Activity;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.NativeAd;
import com.vungle.ads.VungleError;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements InitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f52752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f52753b;

    public p(i iVar, Activity activity) {
        this.f52753b = iVar;
        this.f52752a = activity;
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onError(VungleError vungleError) {
        this.f52753b.x("Vungle init failed, InitCallback - onError: " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onSuccess() {
        NativeAd nativeAd = new NativeAd(this.f52752a.getApplicationContext(), this.f52753b.G);
        new AdConfig();
        nativeAd.setAdListener(this.f52753b.H);
        nativeAd.load(null);
    }
}
