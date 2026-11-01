package com.bytedance.adsdk.ugeno.ouw.ouw;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class fkw extends ouw {
    private boolean bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private Path f10914cf;
    private Paint fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private float f10915le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private float f10916lh;
    private PorterDuffXfermode mwh;
    private boolean pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private String f10917ra;
    private Path ryl;
    private Path tlj;
    private float yu;

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw() {
        this.f10915le = (float) this.ouw.optDouble("start", 0.0d);
        this.f10917ra = this.ouw.optString("direction", "center");
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void vt(Canvas canvas) {
        lh(canvas);
    }

    private void lh(Canvas canvas) {
        if (this.vt.ey() <= 0.0f) {
            this.fkw.setXfermode(this.mwh);
            canvas.drawRect(0.0f, 0.0f, this.f10916lh, this.yu, this.fkw);
            return;
        }
        int iEy = (int) (this.f10916lh * this.vt.ey());
        int iEy2 = (int) (this.yu * this.vt.ey());
        this.fkw.setXfermode(this.mwh);
        String str = this.f10917ra;
        str.hashCode();
        switch (str) {
            case "bottom":
                canvas.drawRect(0.0f, iEy2, this.f10916lh, this.yu, this.fkw);
                break;
            case "center":
                this.tlj.reset();
                this.f10914cf.reset();
                this.ryl.reset();
                this.tlj.addCircle(this.f10916lh / 2.0f, this.yu / 2.0f, iEy, Path.Direction.CW);
                Path path = this.f10914cf;
                float f10 = this.f10916lh;
                path.addRect(f10 / 2.0f, 0.0f, f10, this.yu, Path.Direction.CW);
                this.f10914cf.op(this.tlj, Path.Op.DIFFERENCE);
                this.ryl.addRect(0.0f, 0.0f, this.f10916lh / 2.0f, this.yu, Path.Direction.CW);
                this.ryl.op(this.tlj, Path.Op.DIFFERENCE);
                canvas.drawPath(this.f10914cf, this.fkw);
                canvas.drawPath(this.ryl, this.fkw);
                break;
            case "top":
                canvas.drawRect(0.0f, 0.0f, this.f10916lh, this.yu - iEy2, this.fkw);
                break;
            case "left":
                canvas.drawRect(0.0f, 0.0f, this.f10916lh - iEy, this.yu, this.fkw);
                break;
            case "right":
                canvas.drawRect(iEy, 0.0f, this.f10916lh, this.yu, this.fkw);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final List<PropertyValuesHolder> vt() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(lh(), this.f10915le, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }

    public fkw(com.bytedance.adsdk.ugeno.vt.lh lhVar, JSONObject jSONObject) {
        super(lhVar, jSONObject);
        this.pno = true;
        this.bly = true;
        Paint paint = new Paint();
        this.fkw = paint;
        paint.setAntiAlias(true);
        this.vt.fkw.setLayerType(2, null);
        this.mwh = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.tlj = new Path();
        this.f10914cf = new Path();
        this.ryl = new Path();
        this.fkw.setXfermode(this.mwh);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw(Canvas canvas) {
        lh(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw(int i10, int i11) {
        if (i10 > 0 && this.pno) {
            this.f10916lh = i10;
            this.pno = false;
        }
        if (i11 <= 0 || !this.bly) {
            return;
        }
        this.yu = i11;
        this.bly = false;
    }
}
