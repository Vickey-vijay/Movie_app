package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 yads.h50[], still in use, count: 1, list:
  (r4v2 yads.h50[]) from 0x001f: INVOKE (r4v2 yads.h50[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:34)
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
/* JADX INFO: loaded from: classes8.dex */
public final class h50 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("error"),
    f78067c("message");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78069b;

    static {
        kotlin.enums.a.a(h50VarArr);
    }

    public static h50 valueOf(String str) {
        return (h50) Enum.valueOf(h50.class, str);
    }

    public static h50[] values() {
        return (h50[]) f78068d.clone();
    }

    public h50(String str) {
        super(str, i);
        this.f78069b = str;
    }
}
