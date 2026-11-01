package com.bytedance.adsdk.ugeno.ouw.vt;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.ouw.fkw;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes11.dex */
public final class lh extends ouw {
    @Override // com.bytedance.adsdk.ugeno.ouw.vt.ouw
    public final void ouw() {
        if (this.yu == fkw.BACKGROUND_COLOR) {
            this.fkw.add(Keyframe.ofInt(0.0f, this.f10937ra.pd()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt.ouw
    public final TypeEvaluator yu() {
        return this.yu == fkw.BACKGROUND_COLOR ? new ArgbEvaluator() : new IntEvaluator();
    }

    public lh(Context context, com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, TreeMap<Float, String> treeMap) {
        super(context, lhVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt.ouw
    public final void ouw(float f10, String str) {
        Keyframe keyframeOfInt;
        if (this.yu == fkw.BACKGROUND_COLOR) {
            keyframeOfInt = Keyframe.ofInt(f10, com.bytedance.adsdk.ugeno.ra.ouw.ouw(str, ViewCompat.MEASURED_STATE_MASK));
        } else {
            keyframeOfInt = Keyframe.ofInt(f10, com.bytedance.adsdk.ugeno.ra.lh.ouw(str, 0));
        }
        this.fkw.add(keyframeOfInt);
    }
}
