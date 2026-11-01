package yads;

import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 yads.r03[], still in use, count: 1, list:
  (r4v2 yads.r03[]) from 0x001d: INVOKE (r4v2 yads.r03[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:32)
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
public final class r03 {
    /* JADX INFO: Fake field, exist only in values array */
    EF7(VastAttributes.VISIBLE),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("delayed");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82066b;

    static {
        kotlin.enums.a.a(r03VarArr);
    }

    public static r03 valueOf(String str) {
        return (r03) Enum.valueOf(r03.class, str);
    }

    public static r03[] values() {
        return (r03[]) f82065c.clone();
    }

    public r03(String str) {
        super(str, i);
        this.f82066b = str;
    }
}
