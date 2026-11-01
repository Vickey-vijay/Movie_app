package yads;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class j12 implements View.OnTouchListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ou f78890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d02 f78891b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f78890a.f81147a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        d02 d02Var = this.f78891b;
        d02Var.getClass();
        if ((view instanceof TextView) || (view instanceof tl2)) {
            d02Var.a(view, motionEvent);
        }
        return this.f78890a.onTouch(view, motionEvent);
    }

    public j12(ou ouVar, d02 d02Var) {
        this.f78890a = ouVar;
        this.f78891b = d02Var;
    }
}
