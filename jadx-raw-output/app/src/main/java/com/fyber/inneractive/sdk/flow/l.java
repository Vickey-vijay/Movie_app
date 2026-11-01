package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveAdRequest f15476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f15477b;

    public l(m mVar, InneractiveAdRequest inneractiveAdRequest) {
        this.f15477b = mVar;
        this.f15476a = inneractiveAdRequest;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z10, Exception exc) {
        InneractiveErrorCode inneractiveErrorCode;
        IAConfigManager.removeListener(this);
        if (z10) {
            this.f15477b.c(this.f15476a);
            return;
        }
        if (exc instanceof com.fyber.inneractive.sdk.network.b) {
            inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
        } else {
            inneractiveErrorCode = InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR;
        }
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode, i.NO_APP_CONFIG_AVAILABLE, exc);
        m mVar = this.f15477b;
        mVar.a(this.f15476a, mVar.c(), inneractiveInfrastructureError);
    }
}
