package yads;

import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 yads.di2[], still in use, count: 1, list:
  (r4v2 yads.di2[]) from 0x001d: INVOKE (r4v2 yads.di2[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:32)
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
@xk.f
public final class di2 {
    f76679c,
    f76680d;

    public static final ci2 Companion;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mj.g f76678b;

    static {
        kotlin.enums.a.a(di2VarArr);
        Companion = new ci2();
        f76678b = kotlin.b.b(LazyThreadSafetyMode.PUBLICATION, new bk.a() { // from class: yads.bi2
            @Override // bk.a
            public final Object invoke() {
                return bl.c0.a("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResultStatus", di2.values(), new String[]{"success", "error"}, new Annotation[][]{null, null}, null);
            }
        });
    }

    public static di2 valueOf(String str) {
        return (di2) Enum.valueOf(di2.class, str);
    }

    public static di2[] values() {
        return (di2[]) f76681e.clone();
    }

    public di2() {
        super(str, i);
    }
}
