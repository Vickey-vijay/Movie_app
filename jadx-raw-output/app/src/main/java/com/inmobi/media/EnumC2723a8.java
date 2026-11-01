package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v3 com.inmobi.media.a8[], still in use, count: 1, list:
  (r9v3 com.inmobi.media.a8[]) from 0x0041: INVOKE (r9v3 com.inmobi.media.a8[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:68)
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
/* JADX INFO: renamed from: com.inmobi.media.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC2723a8 {
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_VIDEO_PLAYER("createVideoPlayer"),
    /* JADX INFO: Fake field, exist only in values array */
    EXECUTE_VIDEO_PLAYER_ACTION("executeVideoPlayerActions"),
    /* JADX INFO: Fake field, exist only in values array */
    UPDATE_VIDEO_PLAYER_POSITION("updateVideoPlayerPosition"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_VIDEO_PLAYER_STATE("getVideoPlayerState"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown");

    static {
        kotlin.enums.a.a(enumC2723a8Arr);
    }

    public static EnumC2723a8 valueOf(String str) {
        return (EnumC2723a8) Enum.valueOf(EnumC2723a8.class, str);
    }

    public static EnumC2723a8[] values() {
        return (EnumC2723a8[]) f23967a.clone();
    }

    public EnumC2723a8(String str) {
        super(str, i);
    }
}
