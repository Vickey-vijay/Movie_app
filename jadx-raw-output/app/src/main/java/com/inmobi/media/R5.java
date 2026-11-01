package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 com.inmobi.media.R5[], still in use, count: 1, list:
  (r3v2 com.inmobi.media.R5[]) from 0x001b: INVOKE (r3v2 com.inmobi.media.R5[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:30)
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
public final class R5 {
    URL,
    /* JADX INFO: Fake field, exist only in values array */
    HTML;

    static {
        kotlin.enums.a.a(r5Arr);
    }

    public static R5 valueOf(String str) {
        return (R5) Enum.valueOf(R5.class, str);
    }

    public static R5[] values() {
        return (R5[]) f23432b.clone();
    }

    public R5() {
        super(str, i);
    }
}
