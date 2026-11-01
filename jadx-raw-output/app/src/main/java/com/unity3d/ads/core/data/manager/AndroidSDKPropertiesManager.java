package com.unity3d.ads.core.data.manager;

import ck.p;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.SdkProperties;

/* JADX INFO: compiled from: AndroidSDKPropertiesManager.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AndroidSDKPropertiesManager implements SDKPropertiesManager {
    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializeState(SdkProperties.InitializationState initializationState) {
        p.j(initializationState, "initializeState");
        SdkProperties.setInitializeState(initializationState);
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public SdkProperties.InitializationState getCurrentInitializationState() {
        SdkProperties.InitializationState currentInitializationState = SdkProperties.getCurrentInitializationState();
        p.i(currentInitializationState, "getCurrentInitializationState()");
        return currentInitializationState;
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializationTime() {
        SdkProperties.setInitializationTime(Device.getElapsedRealtime());
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializationTimeSinceEpoch() {
        SdkProperties.setInitializationTimeSinceEpoch(System.currentTimeMillis());
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitialized(boolean z10) {
        SdkProperties.setInitialized(z10);
    }
}
