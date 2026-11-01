package yads;

import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;

/* JADX INFO: loaded from: classes2.dex */
public final class a53 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SurfaceView f75404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f75405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ij1 f75406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public li f75407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ji3 f75408e;

    public final void setAspectRatio(float f10) {
        if (f10 <= 0.0f || f10 == this.f75405b) {
            return;
        }
        this.f75405b = f10;
        this.f75407d = new li(f10, new hj1());
        this.f75406c = new ok2(f10);
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        hj1 hj1VarA = this.f75406c.a(i10, i11);
        super.onMeasure(hj1VarA.f78252a, hj1VarA.f78253b);
        li liVar = this.f75407d;
        if (liVar != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f10 = measuredWidth;
            float f11 = measuredHeight;
            float f12 = liVar.f79789a;
            if ((f12 / (f10 / f11)) - 1 > 0.0f) {
                measuredHeight = (int) (f10 / f12);
            } else {
                measuredWidth = (int) (f11 * f12);
            }
            liVar.f79790b.f78252a = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            liVar.f79790b.f78253b = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            hj1 hj1Var = liVar.f79790b;
            if (hj1Var == null) {
                return;
            }
            this.f75404a.measure(hj1Var.f78252a, hj1Var.f78253b);
        }
    }

    @MainThread
    public final void setPlayer(ji3 ji3Var) {
        if (ck.p.e(this.f75408e, ji3Var)) {
            return;
        }
        ji3 ji3Var2 = this.f75408e;
        if (ji3Var2 != null) {
            ji3Var2.clearVideoSurfaceView(this.f75404a);
        }
        this.f75408e = ji3Var;
        if (ji3Var == null || !ji3Var.a()) {
            return;
        }
        ji3Var.setVideoSurfaceView(this.f75404a);
    }
}
