package t2;

import android.content.Context;
import android.widget.FrameLayout;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.ads.listeners.NativeAdEventListener;

/* JADX INFO: compiled from: InMobiAdFactory.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {
    public c a(Context context) {
        return new c(new FrameLayout(context));
    }

    public e b(Context context, Long l10) {
        return new e(new InMobiBanner(context, l10.longValue()));
    }

    public j c(Context context, Long l10, InterstitialAdEventListener interstitialAdEventListener) {
        return new j(new InMobiInterstitial(context, l10.longValue(), interstitialAdEventListener));
    }

    public m d(Context context, Long l10, NativeAdEventListener nativeAdEventListener) {
        return new m(new InMobiNative(context, l10.longValue(), nativeAdEventListener));
    }

    public m e(InMobiNative inMobiNative) {
        return new m(inMobiNative);
    }
}
