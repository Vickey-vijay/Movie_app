package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v4 com.inmobi.media.Na[], still in use, count: 1, list:
  (r7v4 com.inmobi.media.Na[]) from 0x008d: INVOKE (r7v4 com.inmobi.media.Na[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:144)
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
/* JADX INFO: loaded from: classes6.dex */
public final class Na {
    LPClickStart("clickStartCalled", "sdk_click_detected", 0),
    LPStartFailed("landingsStartFailed", "valid_click_failed", 1),
    LPStartSuccess("landingsStartSuccess", "browser_open_success", 2),
    LPBrowserOpenFailed("browserOpenFailed", "browser_open_failed", 2),
    LPPageStart("landingsPageStarted", "on_page_started", 3),
    LPCompleteSuccess("landingsCompleteSuccess", "landing_success", 4),
    LPCompleteFailed("landingsCompleteFailed", "landing_failed", 4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23234c;

    static {
        kotlin.enums.a.a(naArr);
    }

    public static Na valueOf(String str) {
        return (Na) Enum.valueOf(Na.class, str);
    }

    public static Na[] values() {
        return (Na[]) f23231k.clone();
    }

    public Na(String str, String str2, int i10) {
        super(str, i);
        this.f23232a = str;
        this.f23233b = str2;
        this.f23234c = i10;
    }
}
