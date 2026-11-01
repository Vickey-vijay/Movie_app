package com.monetization.ads.mediation.nativeads;

import android.content.Context;
import com.monetization.ads.mediation.base.a;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class MediatedNativeAdapter extends a {
    public abstract void loadAd(Context context, MediatedNativeAdapterListener mediatedNativeAdapterListener, Map<String, ? extends Object> map, Map<String, String> map2);
}
