package com.inmobi.media;

import com.ironsource.C3605n2;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v3 com.inmobi.media.Pm[], still in use, count: 1, list:
  (r13v3 com.inmobi.media.Pm[]) from 0x0059: INVOKE (r13v3 com.inmobi.media.Pm[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:92)
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
public final class Pm {
    /* JADX INFO: Fake field, exist only in values array */
    SHOW_VIDEO(C3605n2.f30216v),
    /* JADX INFO: Fake field, exist only in values array */
    HIDE_VIDEO("hide"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAY_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_RESUME),
    /* JADX INFO: Fake field, exist only in values array */
    PAUSE_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_PAUSE),
    /* JADX INFO: Fake field, exist only in values array */
    MUTE_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_MUTE),
    /* JADX INFO: Fake field, exist only in values array */
    UNMUTE_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE),
    /* JADX INFO: Fake field, exist only in values array */
    SKIP_VIDEO("skip");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ uj.a f23349c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23350a;

    static {
        f23349c = kotlin.enums.a.a(pmArr);
    }

    public static Pm valueOf(String str) {
        return (Pm) Enum.valueOf(Pm.class, str);
    }

    public static Pm[] values() {
        return (Pm[]) f23348b.clone();
    }

    public Pm(String str) {
        super(str, i);
        this.f23350a = str;
    }
}
