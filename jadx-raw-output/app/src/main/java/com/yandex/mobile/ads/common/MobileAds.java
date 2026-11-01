package com.yandex.mobile.ads.common;

import android.content.Context;
import androidx.annotation.MainThread;
import mj.r;
import yads.cw2;
import yads.dw2;
import yads.iu3;
import yads.lr0;
import yads.nh1;
import yads.nr3;
import yads.qu1;
import yads.ru1;
import yads.tu1;

/* JADX INFO: loaded from: classes9.dex */
@MainThread
public final class MobileAds {
    public static final MobileAds INSTANCE = new MobileAds();

    public static final String getLibraryVersion() {
        return "7.18.1";
    }

    public static final void initialize(Context context, InitializationListener initializationListener) {
        nr3 nr3Var = new nr3(initializationListener);
        iu3 iu3Var = new iu3(context);
        new lr0(new nh1()).a(new qu1(context, iu3Var, nr3Var), new ru1(context, iu3Var, nr3Var));
    }

    public static final void setUserConsent(boolean z10) {
        Object obj = dw2.f76819j;
        dw2 dw2VarA = cw2.a();
        synchronized (dw2.f76819j) {
            dw2VarA.f76822b = Boolean.valueOf(z10);
            r rVar = r.f64562a;
        }
    }

    private MobileAds() {
    }

    public static final void enableLogging(boolean z10) {
        tu1.a(z10);
    }
}
