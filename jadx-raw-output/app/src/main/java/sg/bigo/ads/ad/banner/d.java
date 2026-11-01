package sg.bigo.ads.ad.banner;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.InnerBannerAd;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    @Nullable
    public static BannerAd a(@NonNull sg.bigo.ads.api.core.f fVar) {
        try {
            return new i(fVar);
        } catch (Exception e10) {
            sg.bigo.ads.core.d.b.a(3000, 10100, Log.getStackTraceString(e10));
            return null;
        }
    }

    @Nullable
    public static InnerBannerAd b(@NonNull sg.bigo.ads.api.core.f fVar) {
        if (fVar.f69376a.w() == 3) {
            return new e(fVar);
        }
        if (fVar.f69376a.w() == 2 || fVar.f69376a.w() == 1) {
            return new sg.bigo.ads.ad.c.d(fVar);
        }
        return null;
    }
}
