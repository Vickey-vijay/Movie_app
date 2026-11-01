package com.bytedance.adsdk.ugeno.ouw.ouw;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private String f10922lh;
    public JSONObject ouw;
    public com.bytedance.adsdk.ugeno.vt.lh vt;

    public abstract void ouw();

    public abstract void ouw(int i10, int i11);

    public abstract void ouw(Canvas canvas);

    public abstract List<PropertyValuesHolder> vt();

    public abstract void vt(Canvas canvas);

    public final String lh() {
        return this.f10922lh;
    }

    public ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, JSONObject jSONObject) {
        this.ouw = jSONObject;
        this.vt = lhVar;
        this.f10922lh = jSONObject.optString("type");
        ouw();
    }
}
