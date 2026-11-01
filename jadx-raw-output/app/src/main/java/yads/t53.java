package yads;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public final class t53 implements gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArgbEvaluator f82890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ValueAnimator f82891c;

    public /* synthetic */ t53(int i10) {
        this(i10, new ArgbEvaluator());
    }

    @Override // yads.gf
    public final void a(View view) {
        TextView textView = (TextView) view;
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.f82890b, Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(this.f82889a));
        this.f82891c = valueAnimatorOfObject;
        s53 s53Var = new s53(textView);
        if (valueAnimatorOfObject != null) {
            valueAnimatorOfObject.addUpdateListener(s53Var);
        }
        ValueAnimator valueAnimator = this.f82891c;
        if (valueAnimator != null) {
            valueAnimator.setDuration(500);
        }
        ValueAnimator valueAnimator2 = this.f82891c;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    @Override // yads.gf
    public final void cancel() {
        ValueAnimator valueAnimator = this.f82891c;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.f82891c;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public t53(int i10, ArgbEvaluator argbEvaluator) {
        this.f82889a = i10;
        this.f82890b = argbEvaluator;
    }
}
