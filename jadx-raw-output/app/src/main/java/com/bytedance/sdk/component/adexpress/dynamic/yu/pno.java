package com.bytedance.sdk.component.adexpress.dynamic.yu;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class pno {
    public fkw bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public pno f11471cf;
    public float fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public boolean f11472jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public float f11474le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public float f11475lh;
    public String mwh;
    public String ouw;
    public float pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public float f11476ra;
    public List<List<pno>> ryl;
    public List<pno> tlj;
    public float vt;
    public float yu;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public Map<String, String> f11473ko = new HashMap();

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public Map<Integer, String> f11477rn = new HashMap();

    public final void ouw(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    this.f11477rn.put(Integer.valueOf(jSONObjectOptJSONObject.optInt("id")), jSONObjectOptJSONObject.optString("value"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean fkw() {
        List<pno> list = this.tlj;
        return list == null || list.size() <= 0;
    }

    public final void le() {
        List<List<pno>> list = this.ryl;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<pno> list2 : this.ryl) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.ryl = arrayList;
    }

    public final float lh() {
        le leVar = this.bly.f11431lh;
        return ouw() + leVar.fkw + leVar.f11443le + (leVar.vt * 2.0f);
    }

    public final String pno() {
        return this.bly.f11431lh.mwh;
    }

    public final boolean ra() {
        return TextUtils.equals(this.bly.f11431lh.zih, "flex");
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.ouw + "', x=" + this.vt + ", y=" + this.f11475lh + ", width=" + this.f11474le + ", height=" + this.f11476ra + ", remainWidth=" + this.pno + ", rootBrick=" + this.bly + ", childrenBrickUnits=" + this.tlj + '}';
    }

    public final int vt() {
        le leVar = this.bly.f11431lh;
        return leVar.fvf + leVar.bs;
    }

    public final float yu() {
        le leVar = this.bly.f11431lh;
        return vt() + leVar.f11450ra + leVar.yu + (leVar.vt * 2.0f);
    }

    public final int ouw() {
        le leVar = this.bly.f11431lh;
        return leVar.fak + leVar.uoy;
    }

    public final void ouw(String str, String str2) {
        this.f11473ko.put(str, str2);
    }
}
