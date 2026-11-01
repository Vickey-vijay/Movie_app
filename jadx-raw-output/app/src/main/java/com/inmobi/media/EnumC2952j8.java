package com.inmobi.media;

import com.ironsource.C3426d4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v3 com.inmobi.media.j8[], still in use, count: 1, list:
  (r11v3 com.inmobi.media.j8[]) from 0x004d: INVOKE (r11v3 com.inmobi.media.j8[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:80)
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
/* JADX INFO: renamed from: com.inmobi.media.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC2952j8 {
    /* JADX INFO: Fake field, exist only in values array */
    LOADING("loading"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYING("playing"),
    /* JADX INFO: Fake field, exist only in values array */
    PAUSED("paused"),
    /* JADX INFO: Fake field, exist only in values array */
    STOPPED(C3426d4.i.f28543h0),
    /* JADX INFO: Fake field, exist only in values array */
    FAILED(C3426d4.i.f28566t),
    /* JADX INFO: Fake field, exist only in values array */
    READY(C3426d4.i.f28564s);

    static {
        kotlin.enums.a.a(enumC2952j8Arr);
    }

    public static EnumC2952j8 valueOf(String str) {
        return (EnumC2952j8) Enum.valueOf(EnumC2952j8.class, str);
    }

    public static EnumC2952j8[] values() {
        return (EnumC2952j8[]) f24596a.clone();
    }

    public EnumC2952j8(String str) {
        super(str, i);
    }
}
