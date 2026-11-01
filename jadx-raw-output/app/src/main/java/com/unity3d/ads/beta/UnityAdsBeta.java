package com.unity3d.ads.beta;

import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.utils.i;

/* JADX INFO: compiled from: UnityAdsBeta.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class UnityAdsBeta {
    public static final void getToken(TokenConfiguration tokenConfiguration, TokenListener tokenListener) {
        p.j(tokenConfiguration, i.f44984c);
        p.j(tokenListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public static final String getVersion() {
        return "";
    }

    public static final void initialize(InitializationConfiguration initializationConfiguration, InitializationListener initializationListener) {
        p.j(initializationConfiguration, i.f44984c);
        p.j(initializationListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public static final boolean isInitialize() {
        return true;
    }
}
