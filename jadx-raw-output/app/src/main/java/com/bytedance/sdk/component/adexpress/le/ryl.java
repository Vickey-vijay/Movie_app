package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ryl extends View {
    private int[] bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private Paint f11527cf;
    private int fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private LinearGradient f11528jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final List<ouw> f11529ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f11530le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f11531lh;
    private PorterDuff.Mode mwh;
    public Rect ouw;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f11532ra;
    private Xfermode ryl;
    private Bitmap tlj;
    public Rect vt;
    private int yu;

    public static class ouw {
        public final int ouw = 4;
        public int vt = 0;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
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

    public final void ouw() {
        this.f11529ko.add(new ouw());
        postInvalidate();
    }

    public ryl(Context context) {
        super(context);
        this.mwh = PorterDuff.Mode.DST_IN;
        this.f11529ko = new ArrayList();
        this.f11531lh = com.bytedance.sdk.component.utils.vpp.yu(getContext(), "tt_splash_unlock_image_arrow");
        this.yu = Color.parseColor("#00ffffff");
        this.fkw = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.f11530le = color;
        this.f11532ra = 10;
        this.pno = 40;
        this.bly = new int[]{this.yu, this.fkw, color};
        setLayerType(1, null);
        this.f11527cf = new Paint(1);
        this.tlj = BitmapFactory.decodeResource(getResources(), this.f11531lh);
        this.ryl = new PorterDuffXfermode(this.mwh);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.tlj, this.ouw, this.vt, this.f11527cf);
        canvas.save();
        Iterator<ouw> it = this.f11529ko.iterator();
        while (it.hasNext()) {
            ouw next = it.next();
            int i10 = next.vt;
            this.f11528jg = new LinearGradient(i10, 0.0f, i10 + this.pno, this.f11532ra, this.bly, (float[]) null, Shader.TileMode.CLAMP);
            this.f11527cf.setColor(-1);
            this.f11527cf.setShader(this.f11528jg);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f11527cf);
            this.f11527cf.setShader(null);
            int i11 = next.vt + next.ouw;
            next.vt = i11;
            if (i11 > getWidth()) {
                it.remove();
            }
        }
        this.f11527cf.setXfermode(this.ryl);
        canvas.drawBitmap(this.tlj, this.ouw, this.vt, this.f11527cf);
        this.f11527cf.setXfermode(null);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.tlj == null) {
            return;
        }
        this.ouw = new Rect(0, 0, this.tlj.getWidth(), this.tlj.getHeight());
        this.vt = new Rect(0, 0, getWidth(), getHeight());
    }
}
