package yads;

import com.unity3d.ads.core.data.model.exception.GatewayException;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v2 yads.q61[], still in use, count: 1, list:
  (r8v2 yads.q61[]) from 0x003d: INVOKE (r8v2 yads.q61[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:64)
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
/* JADX INFO: loaded from: classes11.dex */
public final class q61 {
    f81721c(GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION),
    f81722d("ad"),
    f81723e("instream"),
    f81724f("bidder_token");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81726b;

    static {
        kotlin.enums.a.a(q61VarArr);
    }

    public static q61 valueOf(String str) {
        return (q61) Enum.valueOf(q61.class, str);
    }

    public static q61[] values() {
        return (q61[]) f81725g.clone();
    }

    public q61(String str) {
        super(str, i);
        this.f81726b = str;
    }
}
