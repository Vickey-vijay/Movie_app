package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v2 yads.cg[], still in use, count: 1, list:
  (r12v2 yads.cg[]) from 0x0059: INVOKE (r12v2 yads.cg[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:92)
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
public final class cg {
    f76268c("ad_request"),
    f76269d("ad_attempt"),
    f76270e("ad_filled_request"),
    f76271f("ad_impression"),
    f76272g("ad_click"),
    f76273h("ad_reward");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76275b;

    static {
        kotlin.enums.a.a(cgVarArr);
    }

    public static cg valueOf(String str) {
        return (cg) Enum.valueOf(cg.class, str);
    }

    public static cg[] values() {
        return (cg[]) f76274i.clone();
    }

    public final String a() {
        return this.f76275b;
    }

    public cg(String str) {
        super(str, i);
        this.f76275b = str;
    }
}
