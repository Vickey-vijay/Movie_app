package s2;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.mediation.adapters.inneractive.BuildConfig;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.google.ads.mediation.fyber.FyberMediationAdapter;

/* JADX INFO: compiled from: FyberAdapterUtils.java */
/* JADX INFO: loaded from: classes10.dex */
public class e {
    @NonNull
    public static String a() {
        return BuildConfig.VERSION_NAME;
    }

    public static void c(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        InneractiveUserConfig inneractiveUserConfig = new InneractiveUserConfig();
        if (bundle.containsKey("age")) {
            inneractiveUserConfig.setAge(bundle.getInt("age", 0));
        }
        InneractiveAdManager.setUserParams(inneractiveUserConfig);
        if (bundle.containsKey(FyberMediationAdapter.KEY_MUTE_VIDEO)) {
            InneractiveAdManager.setMuteVideo(bundle.getBoolean(FyberMediationAdapter.KEY_MUTE_VIDEO, false));
        }
    }

    @NonNull
    public static String b() {
        return InneractiveAdManager.getVersion();
    }
}
