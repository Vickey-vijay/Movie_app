package com.bytedance.adsdk.ugeno.ouw.vt;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.ouw.fkw;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public Map<Float, String> f10936lh;
    public Context ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.vt.lh f10937ra;
    public String vt;
    public fkw yu;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public List<PropertyValuesHolder> f10935le = new ArrayList();
    public List<Keyframe> fkw = new ArrayList();

    public abstract void ouw();

    public abstract void ouw(float f10, String str);

    public abstract TypeEvaluator yu();

    public List<PropertyValuesHolder> lh() {
        String str = this.yu.f10905rn;
        vt();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str, (Keyframe[]) this.fkw.toArray(new Keyframe[0]));
        propertyValuesHolderOfKeyframe.setEvaluator(yu());
        this.f10935le.add(propertyValuesHolderOfKeyframe);
        return this.f10935le;
    }

    public final void vt() {
        Map<Float, String> map = this.f10936lh;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.f10936lh;
        if (!((map2 == null || map2.size() <= 0) ? false : this.f10936lh.containsKey(Float.valueOf(0.0f)))) {
            ouw();
        }
        for (Map.Entry<Float, String> entry : this.f10936lh.entrySet()) {
            if (entry != null) {
                ouw(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        Map<Float, String> map3 = this.f10936lh;
        if (map3 == null || map3.size() <= 0) {
            return;
        }
        Map<Float, String> map4 = this.f10936lh;
        if (map4 instanceof TreeMap) {
            float fFloatValue = ((Float) ((TreeMap) map4).lastKey()).floatValue();
            if (fFloatValue != 100.0f) {
                ouw(100.0f, this.f10936lh.get(Float.valueOf(fFloatValue)));
            }
        }
    }

    public ouw(Context context, com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, Map<Float, String> map) {
        this.ouw = context;
        this.vt = str;
        this.f10936lh = map;
        this.yu = fkw.ouw(this.vt);
        this.f10937ra = lhVar;
    }
}
