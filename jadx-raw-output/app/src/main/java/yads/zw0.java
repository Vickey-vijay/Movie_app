package yads;

import com.yandex.mobile.ads.R$font;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v2 yads.zw0[], still in use, count: 1, list:
  (r1v2 yads.zw0[]) from 0x0015: INVOKE (r1v2 yads.zw0[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)] (LINE:24)
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
/* JADX INFO: loaded from: classes7.dex */
public final class zw0 {
    /* JADX INFO: Fake field, exist only in values array */
    EF10(R$font.monetization_ads_internal_font_medium, R$font.monetization_ads_internal_font_bold);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f85634e;

    static {
        kotlin.enums.a.a(zw0VarArr);
    }

    public zw0(int i10, int i11) {
        super("YSText", 0);
        this.f85631b = i;
        this.f85632c = i;
        this.f85633d = i10;
        this.f85634e = i11;
    }

    public static zw0 valueOf(String str) {
        return (zw0) Enum.valueOf(zw0.class, str);
    }

    public static zw0[] values() {
        return (zw0[]) f85630f.clone();
    }
}
