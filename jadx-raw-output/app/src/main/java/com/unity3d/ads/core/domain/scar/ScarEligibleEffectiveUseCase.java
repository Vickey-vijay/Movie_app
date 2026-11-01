package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.TokenConfiguration;
import gatewayprotocol.v1.AdFormatOuterClass;
import java.util.List;

/* JADX INFO: compiled from: ScarEligibleEffectiveUseCase.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface ScarEligibleEffectiveUseCase {
    List<AdFormatOuterClass.AdFormat> invoke(TokenConfiguration tokenConfiguration);
}
