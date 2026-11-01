package com.mgs.carparking.widgets;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import com.applovin.sdk.AppLovinEventTypes;
import me.goldze.mvvmhabit.base.BaseApplication;
import sa.m0;

/* JADX INFO: loaded from: classes2.dex */
public class BatteryView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RectF f42263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RectF f42264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f42265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f42266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f42267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public BroadcastReceiver f42268m;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("status", -1);
            BatteryView.this.f42267l = intExtra == 2 || intExtra == 5;
            BatteryView.this.setPower(intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) / intent.getIntExtra("scale", -1));
        }
    }

    public BatteryView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42257b = 4;
        this.f42258c = 3;
        this.f42259d = m0.c(BaseApplication.getInstance()).f(65);
        this.f42260e = m0.c(BaseApplication.getInstance()).b(30);
        this.f42261f = 8;
        this.f42262g = 10;
        this.f42265j = 3.0f;
        this.f42268m = new a();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPower(float f10) {
        this.f42266k = f10;
        invalidate();
    }

    public final void c() {
        int i10 = this.f42258c;
        this.f42263h = new RectF(i10, i10, this.f42259d, this.f42260e - i10);
        Log.i("lum", "mMainRect: " + this.f42263h);
        this.f42264i = new RectF(this.f42263h.width() + ((float) (this.f42258c * 2)), (float) ((this.f42260e - this.f42262g) / 2), this.f42263h.width() + ((float) this.f42258c) + ((float) this.f42261f), (float) ((this.f42260e + this.f42262g) / 2));
        Log.i("lum", "mHeadRect: " + this.f42264i);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        getContext().registerReceiver(this.f42268m, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        getContext().unregisterReceiver(this.f42268m);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setTextSize(28.0f);
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(this.f42258c);
        paint2.setColor(-1);
        RectF rectF = this.f42263h;
        float f10 = this.f42265j;
        canvas.drawRoundRect(rectF, f10, f10, paint2);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-1);
        canvas.drawRect(this.f42264i, paint2);
        Paint paint3 = new Paint();
        if (this.f42267l) {
            paint3.setColor(-16711936);
        } else if (this.f42266k < 0.2d) {
            paint3.setColor(SupportMenu.CATEGORY_MASK);
        } else {
            paint3.setColor(-1);
        }
        float f11 = this.f42266k;
        float fWidth = this.f42263h.width();
        int i10 = this.f42257b;
        int i11 = (int) (f11 * (fWidth - (i10 * 2)));
        RectF rectF2 = this.f42263h;
        float f12 = rectF2.left;
        canvas.drawRect(new Rect((int) (i10 + f12), (int) (rectF2.top + i10), (int) (f12 + i10 + i11), (int) (rectF2.bottom - i10)), paint3);
    }

    public BatteryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42257b = 4;
        this.f42258c = 3;
        this.f42259d = m0.c(BaseApplication.getInstance()).f(65);
        this.f42260e = m0.c(BaseApplication.getInstance()).b(30);
        this.f42261f = 8;
        this.f42262g = 10;
        this.f42265j = 3.0f;
        this.f42268m = new a();
        c();
    }
}
