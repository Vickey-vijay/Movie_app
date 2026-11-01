package com.inmobi.media;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v27 com.inmobi.media.a6[], still in use, count: 1, list:
  (r3v27 com.inmobi.media.a6[]) from 0x025a: INVOKE (r0v36 uj.a) = (r3v27 com.inmobi.media.a6[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:605)
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
/* JADX INFO: renamed from: com.inmobi.media.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC2721a6 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("NETWORK_UNAVAILABLE_ERROR"),
    f23948d("UNKNOWN_ERROR"),
    f23949e("NETWORK_IO_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("OUT_OF_MEMORY_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("INVALID_ENCRYPTED_RESPONSE_RECEIVED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("RESPONSE_EXCEEDS_SPECIFIED_SIZE_LIMIT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("GZIP_DECOMPRESSION_FAILED"),
    f23950f("BAD_REQUEST"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("GDPR_COMPLIANCE_ENFORCED"),
    f23951g("GENERIC_HTTP_2XX"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("RESPONSE_PARSING_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("RETRY_ATTEMPTED"),
    f23952h("NETWORK_UNAVAILABLE_CONTEXT_LOSS"),
    f23953i("NETWORK_UNAVAILABLE_IDLE_MODE"),
    f23954j("NETWORK_UNAVAILABLE_NO_CONNECTION_M_OR_ABOVE"),
    f23955k("NETWORK_UNAVAILABLE_NO_CONNECTION_BELOW_M"),
    f23956l("NETWORK_UNAVAILABLE_EXCEPTION"),
    f23957m("NETWORK_PREPARE_FAIL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("NETWORK_REQUEST_GENERIC_DROPPED_BY_INTERCEPTOR"),
    f23958n("NETWORK_REQUEST_CANCELLED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("NETWORK_REQUEST_EXCEPTION"),
    f23959o("NETWORK_UNAVAILABLE_CUSTOM_VALIDATOR"),
    f23960p("NETWORK_REDIRECT_MALFORMED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_NO_CONTENT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("HTTP_NOT_MODIFIED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_SEE_OTHER"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("HTTP_SERVER_NOT_FOUND"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_MOVED_TEMP"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("HTTP_INTERNAL_SERVER_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_NOT_IMPLEMENTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("HTTP_BAD_GATEWAY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_SERVER_NOT_AVAILABLE"),
    f23961q("HTTP_GATEWAY_TIMEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF431("HTTP_VERSION_NOT_SUPPORTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF444("HTTP_UNAUTHORISED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF457("SERVER_ERROR_END_CODE");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y5 f23946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f23947c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23963a;

    static {
        uj.a<EnumC2721a6> aVarA = kotlin.enums.a.a(enumC2721a6Arr);
        f23946b = new Y5();
        f23947c = new SparseArray();
        for (EnumC2721a6 enumC2721a6 : aVarA) {
            f23947c.put(enumC2721a6.f23963a, enumC2721a6);
        }
    }

    public static EnumC2721a6 valueOf(String str) {
        return (EnumC2721a6) Enum.valueOf(EnumC2721a6.class, str);
    }

    public static EnumC2721a6[] values() {
        return (EnumC2721a6[]) f23962r.clone();
    }

    public EnumC2721a6(String str) {
        super(str, i);
        this.f23963a = i;
    }
}
