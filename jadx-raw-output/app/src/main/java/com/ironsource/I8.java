package com.ironsource;

import android.app.Activity;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public interface I8 {

    public interface a {
        void onNativeAdClicked();

        void onNativeAdLoadFailed(String str);

        void onNativeAdLoadSuccess(G8 g10);

        void onNativeAdShown();
    }

    void a();

    void a(Activity activity, JSONObject jSONObject);

    void a(a aVar);

    void a(J8 j10);

    a b();

    G8 c();
}
