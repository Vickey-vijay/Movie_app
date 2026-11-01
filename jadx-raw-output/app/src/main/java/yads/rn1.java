package yads;

import com.ironsource.C3426d4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 yads.rn1[], still in use, count: 1, list:
  (r10v2 yads.rn1[]) from 0x004b: INVOKE (r10v2 yads.rn1[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:78)
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
/* JADX INFO: loaded from: classes5.dex */
public final class rn1 {
    f82341c(C3426d4.i.K),
    f82342d("video"),
    f82343e("multibanner"),
    f82344f("image"),
    f82345g("mediation");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82347b;

    static {
        kotlin.enums.a.a(rn1VarArr);
    }

    public static rn1 valueOf(String str) {
        return (rn1) Enum.valueOf(rn1.class, str);
    }

    public static rn1[] values() {
        return (rn1[]) f82346h.clone();
    }

    public rn1(String str) {
        super(str, i);
        this.f82347b = str;
    }
}
