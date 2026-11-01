package com.unity3d.ads.core.domain;

import ck.p;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.InitializationStateKt;
import com.unity3d.ads.core.data.repository.SessionRepository;

/* JADX INFO: compiled from: CommonSetInitializationState.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CommonSetInitializationState implements SetInitializationState {
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SessionRepository sessionRepository;

    public CommonSetInitializationState(SessionRepository sessionRepository, SDKPropertiesManager sDKPropertiesManager) {
        p.j(sessionRepository, "sessionRepository");
        p.j(sDKPropertiesManager, "sdkPropertiesManager");
        this.sessionRepository = sessionRepository;
        this.sdkPropertiesManager = sDKPropertiesManager;
    }

    @Override // com.unity3d.ads.core.domain.SetInitializationState
    public void invoke(InitializationState initializationState, boolean z10) {
        p.j(initializationState, "state");
        if (z10) {
            this.sdkPropertiesManager.setInitializeState(InitializationStateKt.toLegacy(initializationState));
        } else {
            this.sessionRepository.setInitializationState(initializationState);
        }
    }
}
