package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f67864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f67865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f67866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f67867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f67868e;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ b[] f67869p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ColorInt
    public final int f67870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @ColorInt
    public final int f67871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f67872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final sg.bigo.ads.common.ab.b f67873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f67874j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f67875k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @ColorInt
    private final int f67876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @ColorInt
    private final int f67877m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f67878n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f67879o;

    static {
        b bVar = new b("WHITE", 0, null, d.f68105b, -10525849, 2, 1, 1);
        f67864a = bVar;
        sg.bigo.ads.common.ab.b bVarA = sg.bigo.ads.common.ab.b.a(1, 1, sg.bigo.ads.common.w.b.a(ViewCompat.MEASURED_STATE_MASK, 0.3f));
        int i10 = d.f68104a;
        b bVar2 = new b("DKGRAY_TRANSLUCENT", 1, bVarA, i10, i10, 0, 2, 2);
        f67865b = bVar2;
        sg.bigo.ads.common.ab.b bVarA2 = sg.bigo.ads.common.ab.b.a(1, 1, sg.bigo.ads.common.w.b.a(ViewCompat.MEASURED_STATE_MASK, 0.3f));
        int i11 = d.f68104a;
        b bVar3 = new b("MAIN_COLOR_TRANSLUCENT", 2, bVarA2, i11, i11, 0, 2, 2);
        f67866c = bVar3;
        sg.bigo.ads.common.ab.b bVarA3 = sg.bigo.ads.common.ab.b.a(4, 2, sg.bigo.ads.common.w.b.a(ViewCompat.MEASURED_STATE_MASK, 0.3f));
        int i12 = d.f68104a;
        b bVar4 = new b("LTGRAY_BLUR", 3, bVarA3, i12, i12, 0, 2, 2);
        f67867d = bVar4;
        sg.bigo.ads.common.ab.b bVarA4 = sg.bigo.ads.common.ab.b.a(4, 2, sg.bigo.ads.common.w.b.a(ViewCompat.MEASURED_STATE_MASK, 0.3f));
        int i13 = d.f68104a;
        b bVar5 = new b("MAIN_COLOR_BLUR", 4, bVarA4, i13, i13, 0, 2, 2);
        f67868e = bVar5;
        f67869p = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    /* JADX WARN: Incorrect types in method signature: (Lsg/bigo/ads/common/ab/b;IIIIIII)V */
    private b(String str, int i10, @Nullable sg.bigo.ads.common.ab.b bVar, int i11, int i12, int i13, int i14, int i15) {
        super(str, i10);
        this.f67873i = bVar;
        this.f67870f = i11;
        this.f67871g = i12;
        this.f67872h = i13;
        this.f67874j = i14;
        this.f67875k = i15;
        this.f67876l = -1;
        this.f67877m = 134217728;
        this.f67878n = 1;
        this.f67879o = 8;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f67869p.clone();
    }

    public final void a(View view) {
        if (view != null) {
            sg.bigo.ads.common.e.a.a(view, sg.bigo.ads.common.utils.e.a(view.getContext(), this.f67874j));
        }
    }

    public final void a(TextView textView, TextView textView2) {
        if (textView == null && textView2 == null) {
            return;
        }
        Context context = null;
        if (textView != null) {
            context = textView.getContext();
            textView.setTextColor(this.f67870f);
        }
        if (textView2 != null) {
            if (context == null) {
                context = textView2.getContext();
            }
            textView2.setTextColor(this.f67871g);
        }
        sg.bigo.ads.common.ab.b bVar = this.f67873i;
        if (bVar == null) {
            if (textView != null) {
                textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
            if (textView2 != null) {
                textView2.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                return;
            }
            return;
        }
        int iA = sg.bigo.ads.common.utils.e.a(context, bVar.f69481a);
        int iA2 = sg.bigo.ads.common.utils.e.a(context, bVar.f69482b);
        int iA3 = sg.bigo.ads.common.utils.e.a(context, bVar.f69483c);
        if (textView != null) {
            textView.setShadowLayer(iA, iA2, iA3, bVar.f69484d);
        }
        if (textView2 != null) {
            textView2.setShadowLayer(iA, iA2, iA3, bVar.f69484d);
        }
    }

    public final void a(RoundedImageView roundedImageView) {
        if (roundedImageView == null) {
            return;
        }
        roundedImageView.setCornerRadius(sg.bigo.ads.common.utils.e.a(roundedImageView.getContext(), this.f67879o));
    }

    public final void b(View view) {
        if (view != null) {
            sg.bigo.ads.common.e.a.a(view, sg.bigo.ads.common.utils.e.a(view.getContext(), this.f67872h));
        }
    }
}
