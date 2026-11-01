package yads;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import yads.d02;

/* JADX INFO: loaded from: classes11.dex */
public final class d02 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f76497c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile d02 f76498d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f76499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f76500b;

    public final void a(final View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (!this.f76500b) {
                view.setAlpha(view.getAlpha() / 2);
                this.f76500b = true;
            }
            this.f76499a.postDelayed(new Runnable() { // from class: cp.s0
                @Override // java.lang.Runnable
                public final void run() {
                    d02.a(this.f51570b, view);
                }
            }, 100L);
        }
    }

    public d02(Handler handler) {
        this.f76499a = handler;
    }

    public static final void a(d02 d02Var, View view) {
        if (d02Var.f76500b) {
            view.setAlpha(view.getAlpha() * 2);
            d02Var.f76500b = false;
        }
    }
}
