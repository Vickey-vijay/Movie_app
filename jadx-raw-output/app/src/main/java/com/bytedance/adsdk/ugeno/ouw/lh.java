package com.bytedance.adsdk.ugeno.ouw;

import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class lh {
    public int bly = 1;
    public long fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public ouw f10907le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f10908lh;
    public Map<String, TreeMap<Float, String>> ouw;
    public String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public String f10909ra;
    public JSONObject tlj;
    public long vt;
    public String yu;

    public static class ouw {
        public String ouw;
        public String vt;
    }

    public final String toString() {
        return "AnimationModel{mKeyFramesMap=" + this.ouw + ", mDuration=" + this.vt + ", mPlayCount=" + this.f10908lh + ", mPlayDirection=" + this.yu + ", mDelay=" + this.fkw + ", mName=" + this.pno + ", mPlayState=" + this.bly + ", mTransformOrigin='" + this.f10907le + "', mTimingFunction='" + this.f10909ra + "'}";
    }
}
