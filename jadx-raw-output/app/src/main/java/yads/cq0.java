package yads;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class cq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nl3 f76402a;

    public /* synthetic */ cq0() {
        this(new nl3());
    }

    public final bq0 a(View view) {
        int iA;
        this.f76402a.getClass();
        RectF rectF = null;
        if (nl3.a(view)) {
            iA = kl3.a(view);
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect)) {
                rect.offset(view.getLeft(), view.getTop());
            } else {
                rect = null;
            }
            Context context = view.getContext();
            if (rect != null) {
                float fA = kl3.a(context, rect.left);
                float fC = ek.b.c(rect.top / context.getResources().getDisplayMetrics().density);
                float fC2 = ek.b.c(rect.right / context.getResources().getDisplayMetrics().density);
                float fC3 = ek.b.c(rect.bottom / context.getResources().getDisplayMetrics().density);
                float f10 = fC3 - fC;
                if (fC2 - fA > 0.0f && f10 > 0.0f) {
                    rectF = new RectF(fA, fC, fC2, fC3);
                }
            }
        } else {
            iA = 0;
        }
        return new bq0(iA, rectF);
    }

    public cq0(nl3 nl3Var) {
        this.f76402a = nl3Var;
    }
}
