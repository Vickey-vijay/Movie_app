package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes8.dex */
public final class fx1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw1 f77537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f77538b;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        mj.r rVar;
        vw1 vw1Var = this.f77537a;
        long j10 = this.f77538b;
        if (j10 <= 0) {
            vw1Var.getClass();
            return;
        }
        if (vw1Var.f84030f) {
            vw1Var.a();
            lm2 lm2Var = vw1Var.f84028d;
            jk.k kVar = vw1.f84024g[0];
            ViewPager2 viewPager2 = (ViewPager2) lm2Var.f79854a.get();
            if (viewPager2 != null) {
                xw1 xw1Var = new xw1(viewPager2, vw1Var.f84025a, vw1Var.f84026b);
                vw1Var.f84027c.getClass();
                Handler handler = new Handler(Looper.getMainLooper());
                ph1 ph1Var = new ph1(handler);
                vw1Var.f84029e = ph1Var;
                if (xw1Var.f76794b == ct.f76416b) {
                    handler.postDelayed(new oh1(ph1Var, j10, xw1Var), j10);
                }
                rVar = mj.r.f64562a;
            } else {
                rVar = null;
            }
            if (rVar == null) {
                vw1Var.a();
                vw1Var.f84030f = false;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f77537a.a();
    }

    public fx1(vw1 vw1Var, long j10) {
        this.f77537a = vw1Var;
        this.f77538b = j10;
    }
}
