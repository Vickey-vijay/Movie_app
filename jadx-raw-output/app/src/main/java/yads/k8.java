package yads;

import com.monetization.ads.quality.base.model.AdQualityVerificationMode;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f79326a;

    static {
        int[] iArr = new int[AdQualityVerificationMode.values().length];
        try {
            iArr[AdQualityVerificationMode.FAST_VERIFICATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdQualityVerificationMode.LONG_VERIFICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f79326a = iArr;
    }
}
