package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import gatewayprotocol.v1.AdFormatOuterClass;
import java.util.List;
import mj.r;
import rj.c;

/* JADX INFO: compiled from: ScarManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ScarManager {
    Object getSignals(List<? extends AdFormatOuterClass.AdFormat> list, c<? super BiddingSignals> cVar);

    Object getVersion(c<? super String> cVar);

    Object loadAd(String str, String str2, String str3, String str4, String str5, int i10, c<? super r> cVar);

    qk.c<GmaEventData> loadBannerAd(Context context, BannerView bannerView, qc.c cVar, UnityBannerSize unityBannerSize, String str);

    qk.c<GmaEventData> show(String str, String str2);
}
