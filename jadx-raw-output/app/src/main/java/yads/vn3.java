package yads;

import com.ironsource.Y1;
import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v2 yads.vn3[], still in use, count: 1, list:
  (r8v2 yads.vn3[]) from 0x0037: INVOKE (r0v1 uj.a) = (r8v2 yads.vn3[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:58)
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
public final class vn3 {
    f83963e("default"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("cache_else_network"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("cache_only"),
    /* JADX INFO: Fake field, exist only in values array */
    EF39(Y1.f27893e);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final un3 f83961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f83962d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83965b;

    static {
        uj.a aVarA = kotlin.enums.a.a(vn3VarArr);
        f83961c = new un3();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(nj.t.v(aVarA, 10)), 16));
        for (Object obj : aVarA) {
            linkedHashMap.put(((vn3) obj).f83965b, obj);
        }
        f83962d = linkedHashMap;
    }

    public static vn3 valueOf(String str) {
        return (vn3) Enum.valueOf(vn3.class, str);
    }

    public static vn3[] values() {
        return (vn3[]) f83964f.clone();
    }

    public vn3(String str) {
        super(str, i);
        this.f83965b = str;
    }
}
