package yads;

import com.ironsource.C3426d4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 yads.dv[], still in use, count: 1, list:
  (r4v2 yads.dv[]) from 0x001f: INVOKE (r4v2 yads.dv[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:34)
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
/* JADX INFO: loaded from: classes2.dex */
public final class dv {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("browser"),
    f76808d(C3426d4.i.K);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cv f76807c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76810b;

    static {
        kotlin.enums.a.a(dvVarArr);
        f76807c = new cv();
    }

    public static dv valueOf(String str) {
        return (dv) Enum.valueOf(dv.class, str);
    }

    public static dv[] values() {
        return (dv[]) f76809e.clone();
    }

    public dv(String str) {
        super(str, i);
        this.f76810b = str;
    }
}
