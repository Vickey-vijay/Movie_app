package com.unity3d.ads.core.data.model;

import ck.p;
import com.unity3d.services.core.properties.SdkProperties;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: InitializationState.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class InitializationStateKt {

    /* JADX INFO: compiled from: InitializationState.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InitializationState.values().length];
            try {
                iArr[InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationState.INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InitializationState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SdkProperties.InitializationState.values().length];
            try {
                iArr2[SdkProperties.InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZED_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final InitializationState toBold(SdkProperties.InitializationState initializationState) {
        p.j(initializationState, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[initializationState.ordinal()];
        if (i10 == 1) {
            return InitializationState.NOT_INITIALIZED;
        }
        if (i10 == 2) {
            return InitializationState.INITIALIZING;
        }
        if (i10 == 3) {
            return InitializationState.INITIALIZED;
        }
        if (i10 == 4) {
            return InitializationState.FAILED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final SdkProperties.InitializationState toLegacy(InitializationState initializationState) {
        p.j(initializationState, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[initializationState.ordinal()];
        if (i10 == 1) {
            return SdkProperties.InitializationState.NOT_INITIALIZED;
        }
        if (i10 == 2) {
            return SdkProperties.InitializationState.INITIALIZING;
        }
        if (i10 == 3) {
            return SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY;
        }
        if (i10 == 4) {
            return SdkProperties.InitializationState.INITIALIZED_FAILED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
