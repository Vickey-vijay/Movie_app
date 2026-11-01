package com.bytedance.sdk.component.adexpress.le;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public final class zin extends FrameLayout {
    private TextView bly;
    public AnimatorSet fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public AnimatorSet f11559le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public ImageView f11560lh;
    public ImageView ouw;
    private Context pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public AnimatorSet f11561ra;
    public ImageView vt;
    public AnimatorSet yu;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setGuideText(String str) {
        this.bly.setText(str);
    }

    public zin(@NonNull Context context) {
        super(context);
        this.yu = new AnimatorSet();
        this.fkw = new AnimatorSet();
        this.f11559le = new AnimatorSet();
        this.f11561ra = new AnimatorSet();
        this.pno = context;
        ImageView imageView = new ImageView(this.pno);
        this.f11560lh = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.vpp.yu(this.pno, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.pno, 30.0f);
        addView(this.f11560lh, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.pno);
        this.vt = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.vpp.yu(this.pno, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.pno, 50.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.pno, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.pno, 30.0f);
        addView(this.vt, layoutParams2);
        ImageView imageView3 = new ImageView(this.pno);
        this.ouw = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.vpp.yu(this.pno, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.pno, 80.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.pno, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.pno, 30.0f);
        addView(this.ouw, layoutParams3);
        TextView textView = new TextView(this.pno);
        this.bly = textView;
        textView.setTextColor(-1);
        this.bly.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.bly, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.le.zin.1
            @Override // java.lang.Runnable
            public final void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) zin.this.ouw.getLayoutParams();
                layoutParams5.topMargin = (int) ((zin.this.vt.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.yu.ra.ouw(zin.this.getContext(), 7.0f));
                int iOuw = (-zin.this.vt.getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(zin.this.pno, 30.0f));
                layoutParams5.leftMargin = iOuw;
                layoutParams5.setMarginStart(iOuw);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                zin.this.ouw.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) zin.this.f11560lh.getLayoutParams();
                layoutParams6.topMargin = (int) ((zin.this.vt.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.yu.ra.ouw(zin.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((zin.this.vt.getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(zin.this.pno, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                zin.this.f11560lh.setLayoutParams(layoutParams6);
            }
        });
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }
}
