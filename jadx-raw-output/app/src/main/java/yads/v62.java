package yads;

import android.content.Context;
import android.widget.ImageView;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes11.dex */
public final class v62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h32 f83783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t62 f83784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yg3 f83785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v52 f83786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s62 f83787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g32 f83788f;

    public /* synthetic */ v62(Context context, dk3 dk3Var, ai3 ai3Var, d4 d4Var, lu2 lu2Var, v9 v9Var, vh3 vh3Var, d62 d62Var, h32 h32Var, mi2 mi2Var, my2 my2Var) {
        this(h32Var, new t62(dk3Var, ai3Var, d4Var, lu2Var, v9Var, vh3Var, d62Var, mi2Var, my2Var), new yg3(), new v52(context.getApplicationContext(), d4Var, lu2Var, v9Var));
    }

    public final void a(e72 e72Var, sd3 sd3Var, zj3 zj3Var) {
        double dDoubleValue;
        u41 u41Var;
        v52 v52Var = this.f83786d;
        je3 je3Var = (je3) nj.b0.f0(sd3Var.f82619a);
        p52 p52VarA = v52Var.f83774c.a(je3Var);
        if (p52VarA == null || p52VarA.f()) {
            p52VarA = v52Var.f83773b.a();
            v52Var.f83774c.a(je3Var, p52VarA);
        }
        p52 p52Var = p52VarA;
        Context context = e72Var.getContext();
        t62 t62Var = this.f83784b;
        ff3 ff3Var = new ff3(t62Var.f82895c, t62Var.f82897e);
        v9 v9Var = t62Var.f82897e;
        lu2 lu2Var = t62Var.f82896d;
        ai3 ai3Var = t62Var.f82894b;
        s62 s62Var = new s62(context, v9Var, lu2Var, p52Var, sd3Var, ai3Var, t62Var.f82893a, ff3Var, zj3Var, t62Var.f82898f, t62Var.f82899g, t62Var.f82900h, t62Var.f82901i);
        this.f83787e = s62Var;
        q52 q52Var = s62Var.f82536d;
        q52Var.getClass();
        Double d10 = ai3Var.f75534d;
        w52 w52Var = q52Var.f81715b;
        if (d10 != null) {
            w52Var.getClass();
            dDoubleValue = d10.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        w52Var.f84111a.setVolume((float) dDoubleValue);
        q52Var.f81714a.a(ai3Var.f75531a);
        s62Var.f82538f.a(e72Var);
        ei3 ei3Var = e72Var.f76954a;
        gj2 gj2Var = s62Var.f82537e;
        gj2Var.getClass();
        ImageView imageView = ei3Var.f77089b;
        ProgressBar progressBar = ei3Var.f77088a;
        if (imageView == null || (u41Var = gj2Var.f77828a.f82621c) == null) {
            progressBar.setVisibility(0);
        } else {
            gj2Var.f77829b.a(u41Var, new fj2(imageView, progressBar));
        }
        s62Var.a(s62Var.f82540h);
        g32 g32Var = new g32(p52Var);
        this.f83788f = g32Var;
        h32 h32Var = this.f83783a;
        h32Var.f78050a.add(g32Var);
        if (h32Var.f78051b) {
            p52Var.g();
        }
        e72Var.setOnAttachStateChangeListener(new a62(p52Var, e72Var));
    }

    public v62(h32 h32Var, t62 t62Var, yg3 yg3Var, v52 v52Var) {
        this.f83783a = h32Var;
        this.f83784b = t62Var;
        this.f83785c = yg3Var;
        this.f83786d = v52Var;
    }
}
