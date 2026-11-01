package yads;

import io.bidmachine.iab.vast.tags.VastTagName;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v2 yads.h21[], still in use, count: 1, list:
  (r6v2 yads.h21[]) from 0x0029: INVOKE (r6v2 yads.h21[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:44)
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
public final class h21 {
    /* JADX INFO: Fake field, exist only in values array */
    EF7(VastTagName.STATIC_RESOURCE),
    /* JADX INFO: Fake field, exist only in values array */
    EF17(VastTagName.I_FRAME_RESOURCE),
    /* JADX INFO: Fake field, exist only in values array */
    EF27(VastTagName.HTML_RESOURCE);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g21 f78020c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78022b;

    static {
        kotlin.enums.a.a(h21VarArr);
        f78020c = new g21();
    }

    public static h21 valueOf(String str) {
        return (h21) Enum.valueOf(h21.class, str);
    }

    public static h21[] values() {
        return (h21[]) f78021d.clone();
    }

    public h21(String str) {
        super(str, i);
        this.f78022b = str;
    }
}
