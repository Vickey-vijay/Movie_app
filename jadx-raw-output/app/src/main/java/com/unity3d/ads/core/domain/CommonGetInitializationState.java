package com.unity3d.ads.core.domain;

import ck.p;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.InitializationStateKt;
import com.unity3d.ads.core.data.repository.SessionRepository;

/* JADX INFO: compiled from: CommonGetInitializationState.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class CommonGetInitializationState implements GetInitializationState {
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SessionRepository sessionRepository;

    public CommonGetInitializationState(SessionRepository sessionRepository, SDKPropertiesManager sDKPropertiesManager) {
        p.j(sessionRepository, "sessionRepository");
        p.j(sDKPropertiesManager, "sdkPropertiesManager");
        this.sessionRepository = sessionRepository;
        this.sdkPropertiesManager = sDKPropertiesManager;
    }

    @Override // com.unity3d.ads.core.domain.GetInitializationState
    public InitializationState invoke(boolean z10) {
        return z10 ? InitializationStateKt.toBold(this.sdkPropertiesManager.getCurrentInitializationState()) : this.sessionRepository.getInitializationState();
    }
}
