package com.bytedance.adsdk.ugeno.yu.vt;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.yu.le;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ouw {
    public static final HashSet<String> ouw = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", "close", "skip", "videoControl", "pauseVideo", "resumeVideo", FyberMediationAdapter.KEY_MUTE_VIDEO, "preventEvent"));
    public String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public Map<String, String> f11057le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.vt.lh f11058lh;
    public String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public String f11059ra;
    public le.ouw vt;
    public String yu;

    public abstract void ouw();

    private boolean yu() {
        return !TextUtils.isEmpty(this.pno);
    }

    public ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
        this.f11058lh = lhVar;
        this.vt = ouwVar;
        this.f11059ra = str;
        if (ouwVar != null) {
            this.yu = ouwVar.f11056lh;
            this.fkw = ouwVar.yu;
            Map<String, String> map = ouwVar.fkw;
            this.f11057le = map;
            if (map != null && !map.isEmpty() && this.f11057le.containsKey("emitCustomEvent")) {
                this.pno = this.f11057le.get("emitCustomEvent");
            }
        }
    }

    public final void lh() {
        if (yu()) {
            le.ouw ouwVar = new le.ouw();
            ouwVar.f11056lh = "custom";
            ouwVar.yu = "emit";
            HashMap map = new HashMap();
            map.put("name", this.pno);
            ouwVar.fkw = map;
            new vt(this.f11058lh, this.fkw, ouwVar).ouw();
        }
    }

    public void vt() {
        lh();
    }
}
