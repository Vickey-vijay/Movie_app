package com.monetization.ads.mediation.interstitial;

import android.app.Activity;
import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MediatedInterstitialAdapter extends com.monetization.ads.mediation.base.a {

    public interface MediatedInterstitialAdapterListener {
    }

    public abstract void loadInterstitial(Context context, MediatedInterstitialAdapterListener mediatedInterstitialAdapterListener, Map<String, ? extends Object> map, Map<String, String> map2);

    public abstract void onInvalidate();

    public abstract void showInterstitial(Activity activity);
}
