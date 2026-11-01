package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.m0;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes6.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GradientDrawable f8242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Button f8243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.a f8244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f8245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxAdFormat f8246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f8247f;

    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    private int a(b bVar) {
        if (b.LOAD == bVar) {
            return m0.a(R.color.applovin_sdk_brand_color, getContext());
        }
        return b.LOADING == bVar ? m0.a(R.color.applovin_sdk_brand_color, getContext()) : m0.a(R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44955a, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private String b(b bVar) {
        if (b.LOAD == bVar) {
            return "Load";
        }
        return b.LOADING == bVar ? "" : "Show";
    }

    private void c(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.f8244c.a();
        } else {
            setEnabled(true);
            this.f8244c.b();
        }
        this.f8243b.setText(b(bVar));
        this.f8242a.setColor(a(bVar));
    }

    public b getControlState() {
        return this.f8245d;
    }

    public MaxAdFormat getFormat() {
        return this.f8246e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.f8247f;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.f8245d != bVar) {
            c(bVar);
        }
        this.f8245d = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f8246e = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.f8247f = aVar;
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f8242a = gradientDrawable;
        Button button = new Button(getContext());
        this.f8243b = button;
        com.applovin.impl.a aVar = new com.applovin.impl.a(getContext(), 20, android.R.attr.progressBarStyleSmall);
        this.f8244c = aVar;
        b bVar = b.LOAD;
        this.f8245d = bVar;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        a();
        aVar.setColor(-1);
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
        c(bVar);
    }

    private void a() {
        this.f8243b.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{m0.a(R.color.applovin_sdk_highlightTextColor, getContext()), -1}));
    }
}
