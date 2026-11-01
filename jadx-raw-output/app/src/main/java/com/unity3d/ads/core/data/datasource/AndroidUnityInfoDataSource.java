package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import ck.p;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.preferences.AndroidPreferences;
import lk.a0;

/* JADX INFO: compiled from: AndroidUnityInfoDataSource.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidUnityInfoDataSource {
    private final String prefName;

    public AndroidUnityInfoDataSource(Context context) {
        p.j(context, "applicationContext");
        this.prefName = context.getPackageName() + BuildConfigApi.UNITY_SHARED_PREFERENCES_SUFIX;
    }

    private final String getPlayerPrefId(String str) {
        String string = AndroidPreferences.getString(this.prefName, str);
        if (string == null) {
            return null;
        }
        if (a0.n0(string)) {
            string = null;
        }
        return string;
    }

    public final String getUnityInstallationId() {
        return getPlayerPrefId(UnityAdsConstants.Preferences.PREF_KEY_UNITY_INSTALLATION_ID);
    }

    public final String getUnityMegaSessionId() {
        return getPlayerPrefId(UnityAdsConstants.Preferences.PREF_KEY_UNITY_MEGA_SESSION_ID);
    }
}
