package com.fyber.inneractive.sdk.external;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f15313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnFyberMarketplaceInitializedListener f15314b;

    public a(Context context, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        this.f15313a = context;
        this.f15314b = onFyberMarketplaceInitializedListener;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z10, Exception exc) {
        if (this.f15313a.getApplicationContext() != null) {
            IAConfigManager.removeListener(this);
            InneractiveAdManager.f15284e = null;
            if (z10) {
                InneractiveAdManager.a(this.f15314b, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
            } else {
                InneractiveAdManager.a(this.f15314b, exc instanceof InvalidAppIdException ? OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, exc.getLocalizedMessage());
            }
            if (d.f15317a.f15285a == null || !IAConfigManager.d() || d.f15317a.f15288d) {
                return;
            }
            d.f15317a.f15288d = true;
            new w(u.IA_IAB_GDPR_TCF_PURPOSE_1_DISABLED).a((String) null);
        }
    }
}
