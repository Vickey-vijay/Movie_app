package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 com.inmobi.media.ak[], still in use, count: 1, list:
  (r3v2 com.inmobi.media.ak[]) from 0x001d: INVOKE (r3v2 com.inmobi.media.ak[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:32)
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
/* JADX INFO: renamed from: com.inmobi.media.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC2735ak {
    SDK,
    TEMPLATE;

    static {
        kotlin.enums.a.a(enumC2735akArr);
    }

    public static EnumC2735ak valueOf(String str) {
        return (EnumC2735ak) Enum.valueOf(EnumC2735ak.class, str);
    }

    public static EnumC2735ak[] values() {
        return (EnumC2735ak[]) f24011c.clone();
    }

    public EnumC2735ak() {
        super(str, i);
    }
}
