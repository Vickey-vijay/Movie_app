package yads;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v12 yads.hr1[], still in use, count: 1, list:
  (r3v12 yads.hr1[]) from 0x0156: INVOKE (r1v9 uj.a) = (r3v12 yads.hr1[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:345)
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
public final class hr1 {
    f78310e("applovin"),
    f78311f("applovin_max"),
    f78312g("appnext"),
    f78313h("bigoads"),
    f78314i("chartboost"),
    f78315j("admob"),
    f78316k("admanager"),
    f78317l("digitalturbine"),
    f78318m("inmobi"),
    f78319n("ironsource"),
    f78320o("mintegral"),
    f78321p("mytarget"),
    f78322q("pangle"),
    f78323r("petalads"),
    f78324s("startapp"),
    f78325t("tapjoy"),
    f78326u("unityads"),
    f78327v("vungle"),
    f78328w("zmaticoo"),
    f78329x("undefined");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gr1 f78308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f78309d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78331b;

    static {
        uj.a aVarA = kotlin.enums.a.a(hr1VarArr);
        f78308c = new gr1();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(nj.t.v(aVarA, 10)), 16));
        for (Object obj : aVarA) {
            linkedHashMap.put(((hr1) obj).f78331b, obj);
        }
        f78309d = linkedHashMap;
    }

    public static hr1 valueOf(String str) {
        return (hr1) Enum.valueOf(hr1.class, str);
    }

    public static hr1[] values() {
        return (hr1[]) f78330y.clone();
    }

    public hr1(String str) {
        super(str, i);
        this.f78331b = str;
    }
}
