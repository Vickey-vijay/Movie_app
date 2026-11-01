package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 yads.y30[], still in use, count: 1, list:
  (r10v2 yads.y30[]) from 0x0049: INVOKE (r10v2 yads.y30[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:76)
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
/* JADX INFO: loaded from: classes10.dex */
public final class y30 {
    f84799c("cross_clicked"),
    f84800d("cross_timer_start"),
    f84801e("cross_timer_end"),
    f84802f("failed_to_create_download_manager"),
    /* JADX INFO: Fake field, exist only in values array */
    EF55("listener_is_null_on_loading_finished");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84804b;

    static {
        kotlin.enums.a.a(y30VarArr);
    }

    public static y30 valueOf(String str) {
        return (y30) Enum.valueOf(y30.class, str);
    }

    public static y30[] values() {
        return (y30[]) f84803g.clone();
    }

    public y30(String str) {
        super(str, i);
        this.f84804b = str;
    }
}
