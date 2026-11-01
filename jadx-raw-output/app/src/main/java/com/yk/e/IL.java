package com.yk.e;

import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleError;
import com.yk.e.util.AdLog;

/* JADX INFO: renamed from: com.yk.e.I丨L, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class IL implements InitializationListener {
    public final /* synthetic */ InitializationListener IL1Iii;

    public IL(InitializationListener initializationListener) {
        this.IL1Iii = initializationListener;
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onError(VungleError vungleError) {
        AdLog.e("Vungle init failed, InitCallback - onError: " + vungleError.getLocalizedMessage());
        InitializationListener initializationListener = this.IL1Iii;
        if (initializationListener != null) {
            initializationListener.onError(vungleError);
        }
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onSuccess() {
        AdLog.i("Vungle init success");
        InitializationListener initializationListener = this.IL1Iii;
        if (initializationListener != null) {
            initializationListener.onSuccess();
        }
    }
}
