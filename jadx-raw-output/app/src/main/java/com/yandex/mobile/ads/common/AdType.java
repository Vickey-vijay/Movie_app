package com.yandex.mobile.ads.common;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v2 com.yandex.mobile.ads.common.AdType[], still in use, count: 1, list:
  (r12v2 com.yandex.mobile.ads.common.AdType[]) from 0x004d: INVOKE (r12v2 com.yandex.mobile.ads.common.AdType[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:80)
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
/* JADX INFO: loaded from: classes9.dex */
public final class AdType {
    UNKNOWN,
    BANNER,
    INTERSTITIAL,
    REWARDED,
    NATIVE,
    APP_OPEN_AD;


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ uj.a f51013c;

    public static uj.a<AdType> getEntries() {
        return f51013c;
    }

    public static AdType valueOf(String str) {
        return (AdType) Enum.valueOf(AdType.class, str);
    }

    public static AdType[] values() {
        return (AdType[]) f51012b.clone();
    }

    static {
        f51013c = kotlin.enums.a.a(adTypeArr);
    }

    private AdType() {
        super(str, i);
    }
}
