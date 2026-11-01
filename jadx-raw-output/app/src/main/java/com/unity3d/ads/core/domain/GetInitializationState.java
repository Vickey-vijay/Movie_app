package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;

/* JADX INFO: compiled from: GetInitializationState.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface GetInitializationState {

    /* JADX INFO: compiled from: GetInitializationState.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ InitializationState invoke$default(GetInitializationState getInitializationState, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return getInitializationState.invoke(z10);
        }
    }

    InitializationState invoke(boolean z10);
}
