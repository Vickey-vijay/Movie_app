package yads;

import java.util.Arrays;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v2 yads.gl3[], still in use, count: 1, list:
  (r6v2 yads.gl3[]) from 0x002f: INVOKE (r6v2 yads.gl3[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:50)
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
public final class gl3 implements de1 {
    f77848c("default"),
    f77849d("loading"),
    f77850e("hidden");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77852b;

    static {
        kotlin.enums.a.a(gl3VarArr);
    }

    public static gl3 valueOf(String str) {
        return (gl3) Enum.valueOf(gl3.class, str);
    }

    public static gl3[] values() {
        return (gl3[]) f77851f.clone();
    }

    @Override // yads.de1
    public final String a() {
        String strQuote = JSONObject.quote(this.f77852b);
        ck.w wVar = ck.w.f6066a;
        String str = String.format("state: %s", Arrays.copyOf(new Object[]{strQuote}, 1));
        ck.p.i(str, "format(...)");
        return str;
    }

    public gl3(String str) {
        super(str, i);
        this.f77852b = str;
    }
}
