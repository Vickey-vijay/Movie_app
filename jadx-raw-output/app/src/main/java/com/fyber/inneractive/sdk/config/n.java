package com.fyber.inneractive.sdk.config;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {
    public static void a(Context context, w wVar) {
        boolean z10 = false;
        String string = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            z10 = Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) != 0;
            if (!z10) {
                string = Settings.Secure.getString(contentResolver, "advertising_id");
            }
        } catch (Settings.SettingNotFoundException unused) {
        }
        if (string != null) {
            synchronized (wVar) {
                v vVar = wVar.f15219b;
                vVar.f15215a = string;
                vVar.f15216b = z10;
                vVar.f15217c = true;
            }
        }
    }
}
