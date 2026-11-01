package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;

/* JADX INFO: compiled from: SetInitializationState.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface SetInitializationState {

    /* JADX INFO: compiled from: SetInitializationState.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void invoke$default(SetInitializationState setInitializationState, InitializationState initializationState, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            setInitializationState.invoke(initializationState, z10);
        }
    }

    void invoke(InitializationState initializationState, boolean z10);
}
