package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v4 yads.bw1[], still in use, count: 1, list:
  (r9v4 yads.bw1[]) from 0x0079: INVOKE (r9v4 yads.bw1[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:124)
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
public final class bw1 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("advideocomplete"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("impressionTrackingStart"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("impressionTrackingSuccess"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("close"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("open"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("rewardedAdComplete"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("usecustomclose"),
    f75994d(""),
    /* JADX INFO: Fake field, exist only in values array */
    EF90("adRendered");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final aw1 f75993c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75996b;

    static {
        kotlin.enums.a.a(bw1VarArr);
        f75993c = new aw1();
    }

    public static bw1 valueOf(String str) {
        return (bw1) Enum.valueOf(bw1.class, str);
    }

    public static bw1[] values() {
        return (bw1[]) f75995e.clone();
    }

    public final String a() {
        return this.f75996b;
    }

    public bw1(String str) {
        super(str, i);
        this.f75996b = str;
    }
}
