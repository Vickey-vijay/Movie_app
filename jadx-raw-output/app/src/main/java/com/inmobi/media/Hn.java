package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 com.inmobi.media.Hn[], still in use, count: 1, list:
  (r5v2 com.inmobi.media.Hn[]) from 0x0029: INVOKE (r5v2 com.inmobi.media.Hn[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:44)
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
public final class Hn {
    UNKNOWN,
    HIDDEN,
    VISIBLE;

    static {
        kotlin.enums.a.a(hnArr);
    }

    public static Hn valueOf(String str) {
        return (Hn) Enum.valueOf(Hn.class, str);
    }

    public static Hn[] values() {
        return (Hn[]) f22831d.clone();
    }

    public Hn() {
        super(str, i);
    }
}
