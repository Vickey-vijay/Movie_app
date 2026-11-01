package yads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import yads.dk0;
import yads.im3;

/* JADX INFO: loaded from: classes2.dex */
public final class dk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp2 f76701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f76702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vj0 f76703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f76704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f76705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f76706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f76707g;

    public /* synthetic */ dk0(cp2 cp2Var, Context context) {
        this(cp2Var, context, new vj0());
    }

    public final void a(String str, ak0 ak0Var, Drawable drawable, im3 im3Var) {
        this.f76705e.put(str, new bk0(ak0Var, drawable, im3Var));
        if (this.f76707g == null) {
            Runnable runnable = new Runnable() { // from class: cp.y0
                @Override // java.lang.Runnable
                public final void run() {
                    dk0.a(this.f51702b);
                }
            };
            this.f76706f.postDelayed(runnable, 100L);
            this.f76707g = runnable;
        }
    }

    public dk0(cp2 cp2Var, Context context, vj0 vj0Var) {
        this.f76701a = cp2Var;
        this.f76702b = context;
        this.f76703c = vj0Var;
        this.f76704d = new HashMap();
        this.f76705e = new HashMap();
        this.f76706f = new Handler(Looper.getMainLooper());
    }

    public static final void a(dk0 dk0Var) {
        Iterator it = dk0Var.f76705e.entrySet().iterator();
        while (it.hasNext()) {
            bk0 bk0Var = (bk0) ((Map.Entry) it.next()).getValue();
            for (v31 v31Var : bk0Var.f75853a.f75541b) {
                if (bk0Var.f75855c == null) {
                    Drawable drawable = bk0Var.f75854b;
                    if (drawable != null) {
                        v31Var.f83731a.a(drawable);
                    } else {
                        v31Var.getClass();
                    }
                } else {
                    v31Var.getClass();
                    boolean z10 = ad1.f75480a;
                }
            }
        }
        dk0Var.f76705e.clear();
        dk0Var.f76707g = null;
    }

    public final void a(final String str, v31 v31Var) {
        uj0 uj0VarA = this.f76703c.a(str);
        if (uj0VarA != null) {
            Drawable drawable = uj0VarA.f83504a;
            if (drawable != null) {
                v31Var.f83731a.a(drawable);
                return;
            }
            return;
        }
        ak0 ak0Var = (ak0) this.f76704d.get(str);
        if (ak0Var != null) {
            ak0Var.f75540a.add(v31Var);
            return;
        }
        Context context = this.f76702b;
        fk0 fk0Var = new fk0(str, new ek0(context.getApplicationContext()), new ck0(this, str), new tp2() { // from class: cp.x0
            @Override // yads.tp2
            public final void a(im3 im3Var) {
                dk0.a(this.f51680b, str, im3Var);
            }
        });
        this.f76704d.put(str, new ak0(v31Var));
        this.f76701a.a(fk0Var);
    }

    public static final void a(dk0 dk0Var, String str, im3 im3Var) {
        ak0 ak0Var = (ak0) dk0Var.f76704d.remove(str);
        if (ak0Var == null) {
            return;
        }
        dk0Var.a(str, ak0Var, null, im3Var);
    }
}
