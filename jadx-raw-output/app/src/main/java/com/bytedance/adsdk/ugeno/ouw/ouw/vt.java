package com.bytedance.adsdk.ugeno.ouw.ouw;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class vt extends ouw {
    private int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private Paint f10923le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f10924lh;
    private int yu;

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw() {
        this.f10924lh = com.bytedance.adsdk.ugeno.ra.ouw.ouw(this.ouw.optString("backgroundColor"), -1);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void vt(Canvas canvas) {
        lh(canvas);
    }

    private void lh(Canvas canvas) {
        try {
            if (this.vt.uoy() > 0.0f) {
                this.f10923le.setColor(this.f10924lh);
                this.f10923le.setAlpha((int) ((1.0f - this.vt.uoy()) * 255.0f));
                ((ViewGroup) this.vt.fkw.getParent()).setClipChildren(true);
                int i10 = this.yu;
                int i11 = this.fkw;
                canvas.drawCircle(i10, i11, Math.min(i10, i11) * 2 * this.vt.uoy(), this.f10923le);
            }
        } catch (Throwable th2) {
            Log.d("BaseEffectWrapper", "ripple animation error " + th2.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw(Canvas canvas) {
        lh(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final List<PropertyValuesHolder> vt() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(lh(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }

    public vt(com.bytedance.adsdk.ugeno.vt.lh lhVar, JSONObject jSONObject) {
        super(lhVar, jSONObject);
        Paint paint = new Paint();
        this.f10923le = paint;
        paint.setAntiAlias(true);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ouw.ouw
    public final void ouw(int i10, int i11) {
        this.yu = i10 / 2;
        this.fkw = i11 / 2;
    }
}
