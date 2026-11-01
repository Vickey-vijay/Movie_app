package com.yandex.mobile.ads.common;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 com.yandex.mobile.ads.common.AdTheme[], still in use, count: 1, list:
  (r4v2 com.yandex.mobile.ads.common.AdTheme[]) from 0x0021: INVOKE (r4v2 com.yandex.mobile.ads.common.AdTheme[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:36)
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
/* JADX INFO: loaded from: classes11.dex */
public final class AdTheme {
    LIGHT("light"),
    DARK("dark");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ uj.a f51010d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51011b;

    public static uj.a<AdTheme> getEntries() {
        return f51010d;
    }

    public static AdTheme valueOf(String str) {
        return (AdTheme) Enum.valueOf(AdTheme.class, str);
    }

    public static AdTheme[] values() {
        return (AdTheme[]) f51009c.clone();
    }

    static {
        f51010d = kotlin.enums.a.a(adThemeArr);
    }

    public final String getValue() {
        return this.f51011b;
    }

    private AdTheme(String str) {
        super(str, i);
        this.f51011b = str;
    }
}
