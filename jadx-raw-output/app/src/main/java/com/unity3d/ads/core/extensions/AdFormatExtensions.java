package com.unity3d.ads.core.extensions;

import ck.p;
import com.unity3d.ads.AdFormat;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import gatewayprotocol.v1.AdFormatOuterClass;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: AdFormatExtensions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AdFormatExtensions {

    /* JADX INFO: compiled from: AdFormatExtensions.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AdFormatOuterClass.AdFormat.values().length];
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AdFormat.values().length];
            try {
                iArr2[AdFormat.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AdFormat.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AdFormat.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AdFormat.REWARDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final UnityAdFormat toUnityAdFormat(AdFormatOuterClass.AdFormat adFormat) {
        p.j(adFormat, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[adFormat.ordinal()];
        if (i10 == 1) {
            return UnityAdFormat.REWARDED;
        }
        if (i10 == 2) {
            return UnityAdFormat.INTERSTITIAL;
        }
        if (i10 == 3) {
            return UnityAdFormat.BANNER;
        }
        if (i10 != 4) {
            return null;
        }
        return UnityAdFormat.UNSPECIFIED;
    }

    public static final AdFormatOuterClass.AdFormat toProtoAdFormat(AdFormat adFormat) {
        p.j(adFormat, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[adFormat.ordinal()];
        if (i10 == 1) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED;
        }
        if (i10 == 2) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER;
        }
        if (i10 == 3) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL;
        }
        if (i10 == 4) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final UnityAdFormat toUnityAdFormat(AdFormat adFormat) {
        p.j(adFormat, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[adFormat.ordinal()];
        if (i10 == 1) {
            return UnityAdFormat.UNSPECIFIED;
        }
        if (i10 == 2) {
            return UnityAdFormat.BANNER;
        }
        if (i10 == 3) {
            return UnityAdFormat.INTERSTITIAL;
        }
        if (i10 == 4) {
            return UnityAdFormat.REWARDED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
