package q2;

import android.content.Context;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.RewardedVideoAd;

/* JADX INFO: compiled from: MetaFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public class e {
    public InterstitialAd a(Context context, String str) {
        return new InterstitialAd(context, str);
    }

    public MediaView b(Context context) {
        return new MediaView(context);
    }

    public AdView c(Context context, String str, String str2) throws Exception {
        return new AdView(context, str, str2);
    }

    public RewardedVideoAd d(Context context, String str) {
        return new RewardedVideoAd(context, str);
    }
}
