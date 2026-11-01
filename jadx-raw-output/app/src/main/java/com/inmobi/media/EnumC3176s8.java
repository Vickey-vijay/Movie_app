package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v4 com.inmobi.media.s8[], still in use, count: 1, list:
  (r14v4 com.inmobi.media.s8[]) from 0x0076: INVOKE (r14v4 com.inmobi.media.s8[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:121)
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
/* JADX INFO: renamed from: com.inmobi.media.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC3176s8 {
    INIT,
    LOADING,
    LOADED,
    LOAD_FAILED,
    PLAYING,
    PAUSED,
    COMPLETED,
    ERROR,
    DESTROYED;

    static {
        kotlin.enums.a.a(enumC3176s8Arr);
    }

    public static EnumC3176s8 valueOf(String str) {
        return (EnumC3176s8) Enum.valueOf(EnumC3176s8.class, str);
    }

    public static EnumC3176s8[] values() {
        return (EnumC3176s8[]) f25310j.clone();
    }

    public EnumC3176s8() {
        super(str, i);
    }
}
