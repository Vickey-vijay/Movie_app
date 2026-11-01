package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v4 com.inmobi.media.Z5[], still in use, count: 1, list:
  (r9v4 com.inmobi.media.Z5[]) from 0x0079: INVOKE (r9v4 com.inmobi.media.Z5[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:124)
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
/* JADX INFO: loaded from: classes8.dex */
public final class Z5 {
    /* JADX INFO: Fake field, exist only in values array */
    EF9("PING_V2_DISABLED", "Ping V2 is disabled from SDK config"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("PING_ID_MISSING", "Ping ID is missing"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("PING_URL_INVALID", "Ping url is invalid"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("PING_URL_MISSING", "Ping URL is missing"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57("PING_JSON_INVALID", "Ping JSON is invalid"),
    /* JADX INFO: Fake field, exist only in values array */
    EF69("PING_ARRAY_EMPTY", "Ping array is empty"),
    /* JADX INFO: Fake field, exist only in values array */
    EF81("PING_UNKNOWN_RESPONSE", "Ping response is unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    EF93("PING_EXCEPTION", "Ping exception occurred");

    static {
        kotlin.enums.a.a(z5Arr);
    }

    public static Z5 valueOf(String str) {
        return (Z5) Enum.valueOf(Z5.class, str);
    }

    public static Z5[] values() {
        return (Z5[]) f23890a.clone();
    }

    public Z5(String str, String str2) {
        super(str, i);
    }
}
