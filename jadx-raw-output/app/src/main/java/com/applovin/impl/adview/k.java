package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.c2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes6.dex */
public class k extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2 f6975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6976b;

    public interface a {
        void a();

        void b();
    }

    public boolean a() {
        return this.f6976b;
    }

    public void b() {
        a(null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44955a, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void a(a aVar) {
        if (this.f6976b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable drawableA = this.f6975a.a();
        if (drawableA == null) {
            if (aVar != null) {
                aVar.b();
            }
        } else {
            setBackground(drawableA);
            this.f6976b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public String getIdentifier() {
        return this.f6975a.b();
    }

    public k(c2 c2Var, Context context) {
        super(context);
        this.f6975a = c2Var;
        setClickable(false);
        setFocusable(false);
    }
}
