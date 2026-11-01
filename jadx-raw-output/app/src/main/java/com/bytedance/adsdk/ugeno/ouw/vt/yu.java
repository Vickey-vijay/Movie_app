package com.bytedance.adsdk.ugeno.ouw.vt;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ouw.fkw;
import com.bytedance.adsdk.ugeno.ra.ra;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class yu extends ouw {
    private List<Keyframe> pno;

    @Override // com.bytedance.adsdk.ugeno.ouw.vt.ouw
    public final void ouw() {
        Keyframe keyframeOfFloat;
        int i10 = AnonymousClass1.ouw[this.yu.ordinal()];
        Keyframe keyframeOfFloat2 = null;
        if (i10 == 1) {
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.f10937ra.cf());
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.f10937ra.ryl());
        } else if (i10 != 2) {
            keyframeOfFloat = null;
        } else {
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.f10937ra.mwh());
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.f10937ra.jg());
        }
        if (keyframeOfFloat2 != null) {
            this.fkw.add(keyframeOfFloat2);
        }
        if (keyframeOfFloat != null) {
            this.pno.add(keyframeOfFloat);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ouw.vt.yu$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[fkw.values().length];
            ouw = iArr;
            try {
                iArr[fkw.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[fkw.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt.ouw
    public final List<PropertyValuesHolder> lh() {
        String str = this.yu.f10905rn;
        vt();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str + "X", (Keyframe[]) this.fkw.toArray(new Keyframe[0]));
        this.f10935le.add(propertyValuesHolderOfKeyframe);
        PropertyValuesHolder propertyValuesHolderOfKeyframe2 = PropertyValuesHolder.ofKeyframe(str + "Y", (Keyframe[]) this.pno.toArray(new Keyframe[0]));
        this.f10935le.add(propertyValuesHolderOfKeyframe2);
        FloatEvaluator floatEvaluator = new FloatEvaluator();
        propertyValuesHolderOfKeyframe.setEvaluator(floatEvaluator);
        propertyValuesHolderOfKeyframe2.setEvaluator(floatEvaluator);
        return this.f10935le;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt.ouw
    public final TypeEvaluator yu() {
        return new FloatEvaluator();
    }

    public yu(Context context, com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, Map<Float, String> map) {
        super(context, lhVar, str, map);
        this.pno = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt.ouw
    public final void ouw(float f10, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 2) {
                return;
            }
            float fOptDouble = (float) jSONArray.optDouble(0);
            float fOptDouble2 = (float) jSONArray.optDouble(1);
            if (this.yu == fkw.TRANSLATE) {
                fOptDouble = ra.ouw(this.ouw, fOptDouble);
                fOptDouble2 = ra.ouw(this.ouw, fOptDouble2);
            }
            this.fkw.add(Keyframe.ofFloat(f10, fOptDouble));
            this.pno.add(Keyframe.ofFloat(f10, fOptDouble2));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
