package com.monetization.ads.mediation.rewarded;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.base.a;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class MediatedRewardedAdapter extends a {
    public abstract void loadRewardedAd(Context context, MediatedRewardedAdapterListener mediatedRewardedAdapterListener, Map<String, ? extends Object> map, Map<String, String> map2);

    public abstract void onInvalidate();

    public abstract void showRewardedAd(Activity activity);
}
