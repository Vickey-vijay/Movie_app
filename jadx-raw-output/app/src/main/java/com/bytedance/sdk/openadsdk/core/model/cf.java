package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class cf {
    private final int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final int f12728cf;
    private final float fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final int f12729jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final JSONObject f12730ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final float f12731le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final float f12732lh;
    private final SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> mwh;
    private final int[] ouw;
    private final long pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final long f12733ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final String f12734rn;
    private final int ryl;
    private final int tlj;
    private final int[] vt;
    private final float yu;
    private final JSONObject zih;

    public static class ouw {
        public int bly;

        /* JADX INFO: renamed from: cf, reason: collision with root package name */
        public int f12735cf;
        public float fkw;

        /* JADX INFO: renamed from: jg, reason: collision with root package name */
        public float f12736jg;

        /* JADX INFO: renamed from: ko, reason: collision with root package name */
        public int f12737ko;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public float f12738le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float f12739lh;
        public int mwh;
        public long ouw;
        public int[] pno;
        public JSONObject qbp;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public int[] f12740ra;

        /* JADX INFO: renamed from: rn, reason: collision with root package name */
        public float f12741rn;
        public SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> ryl;

        /* JADX INFO: renamed from: th, reason: collision with root package name */
        public JSONObject f12742th;
        public int tlj;

        /* JADX INFO: renamed from: vm, reason: collision with root package name */
        public int f12743vm;
        public long vt;
        public float yu;
        public String zih;

        public final cf ouw() {
            return new cf(this, (byte) 0);
        }
    }

    public /* synthetic */ cf(ouw ouwVar, byte b10) {
        this(ouwVar);
    }

    public final JSONObject ouw() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.zih;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.putOpt(next, this.zih.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.ouw;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.ouw[1]));
            }
            int[] iArr2 = this.vt;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.vt[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.f12732lh)).putOpt("down_y", Float.toString(this.yu)).putOpt("up_x", Float.toString(this.fkw)).putOpt("up_y", Float.toString(this.f12731le)).putOpt("down_time", Long.valueOf(this.f12733ra)).putOpt("up_time", Long.valueOf(this.pno)).putOpt("toolType", Integer.valueOf(this.bly)).putOpt("deviceId", Integer.valueOf(this.tlj)).putOpt("source", Integer.valueOf(this.f12728cf)).putOpt("ft", ouw(this.mwh, this.ryl)).putOpt("click_area_type", this.f12734rn);
            int i10 = this.f12729jg;
            if (i10 > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i10));
            }
            JSONObject jSONObject3 = this.f12730ko;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    private cf(@NonNull ouw ouwVar) {
        this.ouw = ouwVar.f12740ra;
        this.vt = ouwVar.pno;
        this.f12732lh = ouwVar.f12738le;
        this.yu = ouwVar.fkw;
        this.fkw = ouwVar.yu;
        this.f12731le = ouwVar.f12739lh;
        this.f12733ra = ouwVar.vt;
        this.pno = ouwVar.ouw;
        this.bly = ouwVar.bly;
        this.tlj = ouwVar.tlj;
        this.f12728cf = ouwVar.f12735cf;
        this.ryl = ouwVar.mwh;
        this.mwh = ouwVar.ryl;
        this.f12734rn = ouwVar.zih;
        this.f12729jg = ouwVar.f12743vm;
        this.f12730ko = ouwVar.f12742th;
        this.zih = ouwVar.qbp;
    }

    public static JSONObject ouw(SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> sparseArray, int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    com.bytedance.sdk.openadsdk.core.lh.lh.ouw ouwVarValueAt = sparseArray.valueAt(i11);
                    if (ouwVarValueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(ouwVarValueAt.f12717lh)).putOpt("mr", Double.valueOf(ouwVarValueAt.vt)).putOpt(TypedValues.CycleType.S_WAVE_PHASE, Integer.valueOf(ouwVarValueAt.ouw)).putOpt("ts", Long.valueOf(ouwVarValueAt.yu));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i10)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
