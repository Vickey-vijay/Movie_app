package com.monetization.ads.mediation.banner;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediatedBannerAdapter extends com.monetization.ads.mediation.base.a {

    public interface MediatedBannerAdapterListener {
    }

    public abstract void loadBanner(Context context, MediatedBannerAdapterListener mediatedBannerAdapterListener, Map<String, ? extends Object> map, Map<String, String> map2);

    public abstract void onInvalidate();
}
