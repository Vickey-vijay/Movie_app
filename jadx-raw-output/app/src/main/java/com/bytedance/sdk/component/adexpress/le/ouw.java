package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.utils.jae;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ouw extends TextSwitcher implements ViewSwitcher.ViewFactory, jae.ouw {
    private int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private float f11517cf;
    private List<String> fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private int f11518jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f11519le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public Handler f11520lh;
    private int mwh;
    public Context ouw;
    private TextView pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final int f11521ra;
    private int ryl;
    private int tlj;
    public int vt;
    public Animation.AnimationListener yu;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        TextView textView = new TextView(getContext());
        this.pno = textView;
        textView.setTextColor(this.tlj);
        this.pno.setTextSize(this.f11517cf);
        this.pno.setMaxLines(this.ryl);
        this.pno.setTextAlignment(this.f11518jg);
        return this.pno;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.ouw(this.fkw.get(this.mwh), this.f11517cf, false)[0], 1073741824), i10);
        } catch (Exception unused) {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        if (message.what != 1) {
            return;
        }
        List<String> list = this.fkw;
        if (list != null && list.size() > 0) {
            int i10 = this.f11519le;
            this.f11519le = i10 + 1;
            this.mwh = i10;
            setText(this.fkw.get(i10));
            if (this.f11519le > this.fkw.size() - 1) {
                this.f11519le = 0;
            }
        }
        this.f11520lh.sendEmptyMessageDelayed(1, this.bly);
    }

    public final void setAnimationDuration(int i10) {
        this.bly = i10;
    }

    public final void setAnimationText(List<String> list) {
        this.fkw = list;
    }

    public final void setAnimationType(int i10) {
        this.vt = i10;
    }

    public final void setMaxLines(int i10) {
        this.ryl = i10;
    }

    public final void setTextColor(int i10) {
        this.tlj = i10;
    }

    public final void setTextSize(float f10) {
        this.f11517cf = f10;
    }

    public ouw(Context context, int i10, float f10, int i11) {
        super(context);
        this.fkw = new ArrayList();
        this.f11519le = 0;
        this.f11521ra = 1;
        this.f11520lh = new jae(Looper.getMainLooper(), this);
        this.yu = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.le.ouw.1
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                if (ouw.this.pno != null) {
                    ouw.this.pno.setText("");
                }
            }
        };
        this.ouw = context;
        this.tlj = i10;
        this.f11517cf = f10;
        this.ryl = 1;
        this.f11518jg = i11;
        setFactory(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11520lh.sendEmptyMessageDelayed(1, this.bly);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11520lh.removeMessages(1);
    }
}
