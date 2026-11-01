package e3;

import android.app.Activity;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

/* JADX INFO: compiled from: UnityBannerViewFactory.java */
/* JADX INFO: loaded from: classes10.dex */
public class c {
    public d a(Activity activity, String str, UnityBannerSize unityBannerSize) {
        return new d(new BannerView(activity, str, unityBannerSize));
    }
}
