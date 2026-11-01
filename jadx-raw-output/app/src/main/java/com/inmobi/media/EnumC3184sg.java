package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v2 com.inmobi.media.sg[], still in use, count: 1, list:
  (r15v2 com.inmobi.media.sg[]) from 0x0067: INVOKE (r15v2 com.inmobi.media.sg[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:106)
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
/* JADX INFO: renamed from: com.inmobi.media.sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC3184sg {
    STATE_INITIALIZED,
    STATE_PREPARING,
    STATE_PREPARED,
    STATE_PLAYING,
    STATE_PAUSED,
    STATE_PLAYBACK_COMPLETED,
    STATE_ERROR,
    STATE_DESTROYED;

    static {
        kotlin.enums.a.a(enumC3184sgArr);
    }

    public static EnumC3184sg valueOf(String str) {
        return (EnumC3184sg) Enum.valueOf(EnumC3184sg.class, str);
    }

    public static EnumC3184sg[] values() {
        return (EnumC3184sg[]) f25334i.clone();
    }

    public EnumC3184sg() {
        super(str, i);
    }
}
