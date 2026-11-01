package com.bytedance.adsdk.ugeno.ouw.ouw;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class lh extends ouw {
    private PorterDuffXfermode bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private Matrix f10918cf;
    private float fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private View f10919le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private String f10920lh;
    private Paint pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private Paint f10921ra;
    private LinearGradient tlj;
    private float yu;

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw() {
        this.f10920lh = this.ouw.optString("direction", "left");
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void vt(Canvas canvas) {
        lh(canvas);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void lh(Canvas canvas) {
        try {
            if (this.vt.rrs() <= 0.0f) {
                this.f10921ra.setXfermode(this.bly);
                canvas.drawRect(0.0f, 0.0f, this.yu, this.fkw, this.f10921ra);
                return;
            }
            int iRrs = (int) (this.yu * this.vt.rrs());
            int iRrs2 = (int) (this.fkw * this.vt.rrs());
            this.f10921ra.setXfermode(this.bly);
            String str = this.f10920lh;
            byte b10 = -1;
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        b10 = 2;
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        b10 = 3;
                    }
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        b10 = 1;
                    }
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        b10 = 0;
                    }
                    break;
            }
            if (b10 == 0) {
                float f10 = iRrs;
                canvas.drawRect(f10, 0.0f, this.yu, this.fkw, this.f10921ra);
                this.f10918cf.setTranslate(f10, this.fkw);
                this.tlj.setLocalMatrix(this.f10918cf);
                this.pno.setShader(this.tlj);
                if (this.vt.rrs() <= 1.0f && this.vt.rrs() > 0.9f) {
                    this.pno.setAlpha((int) (255.0f - (this.vt.rrs() * 255.0f)));
                }
                canvas.drawRect(0.0f, 0.0f, f10, this.fkw, this.pno);
                return;
            }
            if (b10 == 1) {
                float f11 = iRrs;
                canvas.drawRect(0.0f, 0.0f, this.yu - f11, this.fkw, this.f10921ra);
                this.f10918cf.setTranslate(this.yu - f11, 0.0f);
                this.tlj.setLocalMatrix(this.f10918cf);
                this.pno.setShader(this.tlj);
                if (this.vt.rrs() <= 1.0f && this.vt.rrs() > 0.9f) {
                    this.pno.setAlpha((int) (255.0f - (this.vt.rrs() * 255.0f)));
                }
                float f12 = this.yu;
                canvas.drawRect(f12, this.fkw, f12 - f11, 0.0f, this.pno);
                return;
            }
            if (b10 == 2) {
                float f13 = iRrs2;
                canvas.drawRect(0.0f, f13, this.yu, this.fkw, this.f10921ra);
                this.f10918cf.setTranslate(0.0f, f13);
                this.tlj.setLocalMatrix(this.f10918cf);
                this.pno.setShader(this.tlj);
                if (this.vt.rrs() <= 1.0f && this.vt.rrs() > 0.9f) {
                    this.pno.setAlpha((int) (255.0f - (this.vt.rrs() * 255.0f)));
                }
                canvas.drawRect(0.0f, 0.0f, this.yu, f13, this.pno);
                return;
            }
            if (b10 != 3) {
                return;
            }
            float f14 = iRrs2;
            canvas.drawRect(0.0f, 0.0f, this.yu, this.fkw - f14, this.f10921ra);
            this.f10918cf.setTranslate(0.0f, this.fkw - f14);
            this.tlj.setLocalMatrix(this.f10918cf);
            this.pno.setShader(this.tlj);
            if (this.vt.rrs() <= 1.0f && this.vt.rrs() > 0.9f) {
                this.pno.setAlpha((int) (255.0f - (this.vt.rrs() * 255.0f)));
            }
            float f15 = this.yu;
            float f16 = this.fkw;
            canvas.drawRect(f15, f16, 0.0f, f16 - f14, this.pno);
        } catch (Throwable th2) {
            Log.e("BaseEffectWrapper", th2.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw(Canvas canvas) {
        lh(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final List<PropertyValuesHolder> vt() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", 0.0f, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(com.bytedance.adsdk.ugeno.ouw.fkw.ALPHA.f10905rn, 0.0f, 1.0f));
        return arrayList;
    }

    public lh(com.bytedance.adsdk.ugeno.vt.lh lhVar, JSONObject jSONObject) {
        super(lhVar, jSONObject);
        this.f10919le = this.vt.fkw;
        Paint paint = new Paint();
        this.f10921ra = paint;
        paint.setAntiAlias(true);
        this.f10919le.setLayerType(2, null);
        this.bly = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.pno = new Paint();
        this.f10918cf = new Matrix();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw(int i10, int i11) {
        this.yu = i10;
        this.fkw = i11;
        String str = this.f10920lh;
        str.hashCode();
        switch (str) {
            case "bottom":
                this.tlj = new LinearGradient(0.0f, -this.fkw, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "top":
                this.tlj = new LinearGradient(0.0f, this.fkw, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "left":
                this.tlj = new LinearGradient(this.yu, 0.0f, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "right":
                this.tlj = new LinearGradient(-this.yu, 0.0f, 0.0f, this.fkw, 0, -1, Shader.TileMode.CLAMP);
                break;
        }
    }
}
