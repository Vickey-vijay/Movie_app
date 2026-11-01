package com.bytedance.adsdk.ugeno.ouw.ouw;

import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.ra.ra;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class yu extends ouw {

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private static final float f10925jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private static final float f10926ko;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private static final float f10927rn;
    private static final float zih;
    private float bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f10928cf;
    private Path fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.ra.ouw.C0073ouw f10929le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f10930lh;
    private Path mwh;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f10931ra;
    private boolean ryl;
    private int tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private float f10932vm;
    private Paint yu;

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw() {
        this.f10930lh = (int) ra.ouw(this.vt.fkw.getContext(), this.ouw.optInt("shineWidth", 30));
        String strOptString = this.ouw.optString("backgroundColor", "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(strOptString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : strOptString;
        if (str.startsWith("linear")) {
            this.f10929le = com.bytedance.adsdk.ugeno.ra.ouw.vt(str);
        } else {
            int iOuw = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str, ViewCompat.MEASURED_STATE_MASK);
            this.f10931ra = iOuw;
            this.pno = (iOuw & ViewCompat.MEASURED_SIZE_MASK) | 536870912;
            this.ryl = false;
        }
        this.f10932vm = f10927rn * this.f10930lh;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void vt(Canvas canvas) {
        lh(canvas);
    }

    static {
        float radians = (float) Math.toRadians(30.0d);
        f10925jg = radians;
        f10926ko = (float) Math.tan(radians);
        f10927rn = (float) Math.cos(radians);
        zih = (float) Math.sin(radians);
    }

    private void lh(Canvas canvas) {
        LinearGradient linearGradient;
        try {
            if (this.vt.osn() > 0.0f) {
                int i10 = this.tlj;
                float f10 = f10926ko;
                float fOsn = (i10 + (i10 * f10)) * this.vt.osn();
                this.mwh.reset();
                this.mwh.moveTo(fOsn, 0.0f);
                int i11 = this.f10928cf;
                float f11 = fOsn - (i11 * f10);
                this.mwh.lineTo(f11, i11);
                this.mwh.lineTo(f11 + this.f10930lh, this.f10928cf);
                this.mwh.lineTo(this.f10930lh + fOsn, 0.0f);
                this.mwh.close();
                float f12 = this.f10932vm;
                float f13 = f10927rn * f12;
                float f14 = f12 * zih;
                if (!this.ryl || this.f10929le == null) {
                    int i12 = this.pno;
                    linearGradient = new LinearGradient(fOsn, 0.0f, fOsn + f13, f14, new int[]{i12, this.f10931ra, i12}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(fOsn, 0.0f, fOsn + f13, f14, this.f10929le.vt, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.yu.setShader(linearGradient);
                Path path = this.fkw;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.mwh, this.yu);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final List<PropertyValuesHolder> vt() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(lh(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }

    public yu(com.bytedance.adsdk.ugeno.vt.lh lhVar, JSONObject jSONObject) {
        super(lhVar, jSONObject);
        this.ryl = true;
        Paint paint = new Paint();
        this.yu = paint;
        paint.setAntiAlias(true);
        this.fkw = new Path();
        this.bly = this.vt.ux;
        this.mwh = new Path();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    @SuppressLint({"DrawAllocation"})
    public final void ouw(Canvas canvas) {
        lh(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw(int i10, int i11) {
        this.tlj = i10;
        this.f10928cf = i11;
        try {
            RectF rectF = new RectF(0.0f, 0.0f, i10, i11);
            Path path = this.fkw;
            float f10 = this.bly;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }
}
