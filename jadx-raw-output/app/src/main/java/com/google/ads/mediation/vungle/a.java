package com.google.ads.mediation.vungle;

import android.content.Context;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.InitializationListener;

/* JADX INFO: compiled from: VungleSdkWrapper.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface a {
    void a(Context context, String str, InitializationListener initializationListener);

    void b(Context context, BidTokenCallback bidTokenCallback);

    String getSdkVersion();

    boolean isInitialized();
}
