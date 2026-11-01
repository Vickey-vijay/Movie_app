package com.monetization.ads.quality.base;

import com.monetization.ads.quality.base.model.AdQualityVerificationMode;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;
import qk.u;

/* JADX INFO: loaded from: classes2.dex */
public interface AdQualityVerificationStateFlow {
    AdQualityVerificationMode getVerificationMode();

    u<AdQualityVerificationState> getVerificationResultStateFlow();
}
