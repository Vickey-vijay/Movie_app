package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.security.InvalidParameterException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f16139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16140c;

    public y(String str, String str2, String str3, Long l10, String str4, String str5, String str6, String str7) {
        String strA;
        int i10 = com.fyber.inneractive.sdk.config.k.f15121a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            strA = "https://" + IAConfigManager.O.f15014i.f15127f;
        } else {
            strA = com.fyber.inneractive.sdk.config.a.a(property, "Event");
        }
        this.f16140c = null;
        if (TextUtils.isEmpty(strA)) {
            throw new InvalidParameterException();
        }
        this.f16139b = new HashMap();
        this.f16138a = strA;
        a(str7 == null ? "8.4.1" : str7, Q6.V);
        a(com.fyber.inneractive.sdk.util.o.f18599a.getPackageName(), "pkgn");
        if (IAConfigManager.d()) {
            return;
        }
        a(C3426d4.f28386d, "osn");
        a(Build.VERSION.RELEASE, Q6.G);
        a(com.fyber.inneractive.sdk.util.k.j(), "model");
        a(com.fyber.inneractive.sdk.util.k.l(), "pkgv");
        a(str, "appid");
        a(str2, "session");
        a(str3, "adnt");
        a(l10, "adnt_id");
        a(str4, "creative_id");
        a(str5, "adomain");
        a(str6, CreativeInfo.D);
    }

    public final void a(Object obj, String str) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.f16139b.put(str, obj);
        }
    }
}
