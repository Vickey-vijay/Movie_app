package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v3 com.inmobi.media.Y7[], still in use, count: 1, list:
  (r11v3 com.inmobi.media.Y7[]) from 0x0059: INVOKE (r11v3 com.inmobi.media.Y7[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:92)
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
/* JADX INFO: loaded from: classes7.dex */
public final class Y7 {
    UNDEFINED_ERROR((short) 10001),
    INVALID_STATE((short) 10002),
    MALFORMED_URL((short) 10003),
    TIMEOUT((short) 10004),
    NETWORK((short) 10005),
    NO_URL_FOUND((short) 10006);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f23827a;

    static {
        kotlin.enums.a.a(y7Arr);
    }

    public static Y7 valueOf(String str) {
        return (Y7) Enum.valueOf(Y7.class, str);
    }

    public static Y7[] values() {
        return (Y7[]) f23826h.clone();
    }

    public Y7(short s10) {
        super(str, i);
        this.f23827a = s10;
    }
}
