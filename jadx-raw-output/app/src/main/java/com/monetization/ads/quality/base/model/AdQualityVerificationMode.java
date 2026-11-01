package com.monetization.ads.quality.base.model;

import uj.a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 com.monetization.ads.quality.base.model.AdQualityVerificationMode[], still in use, count: 1, list:
  (r4v2 com.monetization.ads.quality.base.model.AdQualityVerificationMode[]) from 0x001d: INVOKE (r4v2 com.monetization.ads.quality.base.model.AdQualityVerificationMode[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:32)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
public final class AdQualityVerificationMode {
    FAST_VERIFICATION,
    LONG_VERIFICATION;

    private static final /* synthetic */ a $ENTRIES;

    public static AdQualityVerificationMode valueOf(String str) {
        return (AdQualityVerificationMode) Enum.valueOf(AdQualityVerificationMode.class, str);
    }

    public static AdQualityVerificationMode[] values() {
        return (AdQualityVerificationMode[]) $VALUES.clone();
    }

    static {
        $ENTRIES = kotlin.enums.a.a(adQualityVerificationModeArr);
    }

    private AdQualityVerificationMode() {
        super(str, i);
    }
}
