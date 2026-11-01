package yads;

import android.content.Context;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v0 yads.t9[], still in use, count: 1, list:
  (r7v0 yads.t9[]) from 0x0029: INVOKE (r7v0 yads.t9[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:44)
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
public final class t9 {
    f82925d,
    f82926e,
    f82927f;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s9 f82923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f82924c;

    static {
        t9 t9Var = f82925d;
        t9 t9Var2 = f82926e;
        t9 t9Var3 = f82927f;
        kotlin.enums.a.a(t9VarArr);
        f82923b = new s9();
        f82924c = kotlin.collections.a.o(mj.h.a(s9.a("values_dimen_%s", t9Var.name()), 48), mj.h.a(s9.a("values_dimen_%s_sw600dp", t9Var.name()), 56), mj.h.a(s9.a("values_dimen_%s", t9Var2.name()), 15), mj.h.a(s9.a("values_dimen_%s_sw600dp", t9Var2.name()), 17), mj.h.a(s9.a("values_dimen_%s", t9Var3.name()), 19), mj.h.a(s9.a("values_dimen_%s_sw600dp", t9Var3.name()), 23));
    }

    public static t9 valueOf(String str) {
        return (t9) Enum.valueOf(t9.class, str);
    }

    public static t9[] values() {
        return (t9[]) f82928g.clone();
    }

    public final int a(Context context) {
        try {
            s9 s9Var = f82923b;
            StringBuilder sb2 = new StringBuilder(name());
            if (ik.k.g(kl3.d(context), kl3.b(context)) >= 600) {
                sb2.append("_sw600dp");
            }
            String string = sb2.toString();
            s9Var.getClass();
            Integer num = (Integer) f82924c.get(s9.a("values_dimen_%s", string));
            if (num != null) {
                return num.intValue();
            }
        } catch (Exception unused) {
        }
        try {
            s9 s9Var2 = f82923b;
            String strName = name();
            s9Var2.getClass();
            Integer num2 = (Integer) f82924c.get(s9.a("values_dimen_%s", strName));
            if (num2 != null) {
                return num2.intValue();
            }
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }

    public t9() {
        super(str, i);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name();
    }
}
