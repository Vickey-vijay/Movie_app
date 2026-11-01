package com.vungle.ads;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;

/* JADX INFO: compiled from: BaseAd.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/FullscreenAd;", "Lcom/vungle/ads/Ad;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lmj/r;", "play", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public interface FullscreenAd extends Ad {

    /* JADX INFO: compiled from: BaseAd.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void play$default(FullscreenAd fullscreenAd, Context context, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
            }
            if ((i10 & 1) != 0) {
                context = null;
            }
            fullscreenAd.play(context);
        }
    }

    void play(Context context);
}
