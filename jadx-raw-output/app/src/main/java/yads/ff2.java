package yads;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 yads.ff2[], still in use, count: 1, list:
  (r8v1 yads.ff2[]) from 0x002f: INVOKE (r0v1 uj.a) = (r8v1 yads.ff2[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:50)
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
/* JADX INFO: loaded from: classes9.dex */
public final class ff2 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("IDLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("BUFFERING"),
    f77381e("READY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF32("ENDED");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ef2 f77379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f77380d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77383b;

    static {
        uj.a aVarA = kotlin.enums.a.a(ff2VarArr);
        f77379c = new ef2();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(nj.t.v(aVarA, 10)), 16));
        for (Object obj : aVarA) {
            linkedHashMap.put(Integer.valueOf(((ff2) obj).f77383b), obj);
        }
        f77380d = linkedHashMap;
    }

    public static ff2 valueOf(String str) {
        return (ff2) Enum.valueOf(ff2.class, str);
    }

    public static ff2[] values() {
        return (ff2[]) f77382f.clone();
    }

    public ff2(String str) {
        super(str, i);
        this.f77383b = i;
    }
}
