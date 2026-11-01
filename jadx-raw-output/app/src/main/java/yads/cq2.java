package yads;

import com.mbridge.msdk.MBridgeConstans;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v2 yads.cq2[], still in use, count: 1, list:
  (r8v2 yads.cq2[]) from 0x003b: INVOKE (r8v2 yads.cq2[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:62)
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
/* JADX INFO: loaded from: classes3.dex */
public final class cq2 {
    f76403c("content"),
    f76404d(MBridgeConstans.DYNAMIC_VIEW_WX_APP),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("image"),
    f76405e("productPromo");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76407b;

    static {
        kotlin.enums.a.a(cq2VarArr);
    }

    public static cq2 valueOf(String str) {
        return (cq2) Enum.valueOf(cq2.class, str);
    }

    public static cq2[] values() {
        return (cq2[]) f76406f.clone();
    }

    public cq2(String str) {
        super(str, i);
        this.f76407b = str;
    }
}
