package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import yads.nk3;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nk3 {
    public static final void a(final View view) {
        ViewParent parent = view.getParent();
        final ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        if (ck.p.e(Looper.myLooper(), Looper.getMainLooper())) {
            viewGroup.removeView(view);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: cp.y6
                @Override // java.lang.Runnable
                public final void run() {
                    nk3.a(viewGroup, view);
                }
            });
        }
    }

    public static final void a(ViewGroup viewGroup, View view) {
        viewGroup.removeView(view);
    }
}
