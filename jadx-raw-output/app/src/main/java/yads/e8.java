package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 yads.e8[], still in use, count: 1, list:
  (r3v8 yads.e8[]) from 0x00ea: INVOKE (r3v8 yads.e8[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:237)
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
public final class e8 {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("applovin"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("applovin_max"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("bigoads"),
    /* JADX INFO: Fake field, exist only in values array */
    EF37("chartboost"),
    /* JADX INFO: Fake field, exist only in values array */
    EF47("digitalturbine"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57("admanager"),
    /* JADX INFO: Fake field, exist only in values array */
    EF67("admob"),
    /* JADX INFO: Fake field, exist only in values array */
    EF77("inmobi"),
    /* JADX INFO: Fake field, exist only in values array */
    EF88("ironsource"),
    /* JADX INFO: Fake field, exist only in values array */
    EF99("mintegral"),
    /* JADX INFO: Fake field, exist only in values array */
    EF110("mytarget"),
    /* JADX INFO: Fake field, exist only in values array */
    EF121("pangle"),
    /* JADX INFO: Fake field, exist only in values array */
    EF132("tapjoy"),
    /* JADX INFO: Fake field, exist only in values array */
    EF145("unityads"),
    /* JADX INFO: Fake field, exist only in values array */
    EF158("vungle"),
    /* JADX INFO: Fake field, exist only in values array */
    EF171("yandex");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d8 f76970c = new d8();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ uj.a f76972e = kotlin.enums.a.a(new e8[]{new e8("applovin"), new e8("applovin_max"), new e8("bigoads"), new e8("chartboost"), new e8("digitalturbine"), new e8("admanager"), new e8("admob"), new e8("inmobi"), new e8("ironsource"), new e8("mintegral"), new e8("mytarget"), new e8("pangle"), new e8("tapjoy"), new e8("unityads"), new e8("vungle"), new e8("yandex")});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76973b;

    static {
    }

    public static e8 valueOf(String str) {
        return (e8) Enum.valueOf(e8.class, str);
    }

    public static e8[] values() {
        return (e8[]) f76971d.clone();
    }

    public e8(String str) {
        super(str, i);
        this.f76973b = str;
    }
}
