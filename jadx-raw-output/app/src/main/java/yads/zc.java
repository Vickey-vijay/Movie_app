package yads;

import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes11.dex */
public final class zc implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f85311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dialog f85312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ke1 f85313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f85314d;

    public zc(ViewGroup viewGroup, Dialog dialog, ke1 ke1Var) {
        this.f85311a = viewGroup;
        this.f85312b = dialog;
        this.f85313c = ke1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                float f10 = this.f85314d;
                if (rawY > f10) {
                    this.f85311a.setTranslationY(rawY - f10);
                    return true;
                }
                this.f85311a.setTranslationY(0.0f);
                return true;
            }
            if (rawY <= this.f85314d) {
                return true;
            }
            this.f85313c.getClass();
            ke1.a(view);
            ng0.a(this.f85312b);
            return true;
        }
        this.f85314d = rawY;
        return true;
    }
}
