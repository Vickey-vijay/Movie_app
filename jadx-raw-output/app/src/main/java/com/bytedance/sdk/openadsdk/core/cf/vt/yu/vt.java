package com.bytedance.sdk.openadsdk.core.cf.vt.yu;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.ryl;
import com.bytedance.adsdk.ugeno.vt.lh;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class vt extends com.bytedance.adsdk.ugeno.vt.ouw<ouw> {

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    private int f12671ln;
    private JSONArray qni;
    private int smu;

    /* JADX WARN: Type inference failed for: r0v0, types: [T extends android.view.View, android.view.View] */
    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final View ouw() {
        try {
            ouw ouwVar = new ouw(this.vt);
            this.fkw = ouwVar;
            ouwVar.vt = this;
        } catch (Throwable unused) {
            this.fkw = new View(this.vt);
        }
        return this.fkw;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw, com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() {
        super.vt();
        T t10 = this.fkw;
        if (t10 instanceof ouw) {
            ((ouw) t10).setOrientation(this.f12671ln);
            ouw ouwVar = (ouw) this.fkw;
            ViewGroup.LayoutParams layoutParams = ouwVar.ouw.getLayoutParams();
            layoutParams.width = od();
            layoutParams.height = cd();
            ouwVar.ouw.setLayoutParams(layoutParams);
            int i10 = 0;
            if (this.smu == 1) {
                while (i10 < ((com.bytedance.adsdk.ugeno.vt.ouw) this).ouw.size()) {
                    lh<View> lhVar = ((com.bytedance.adsdk.ugeno.vt.ouw) this).ouw.get(i10);
                    if (lhVar != null) {
                        ryl rylVar = new ryl(this.vt);
                        rylVar.ouw(this.kfa);
                        ((ouw) this.fkw).ouw(rylVar.ouw(lhVar.jqy(), this.yu));
                    }
                    i10++;
                }
                return;
            }
            List<lh<View>> list = ((com.bytedance.adsdk.ugeno.vt.ouw) this).ouw;
            if (list == null || list.isEmpty()) {
                return;
            }
            lh<View> lhVar2 = ((com.bytedance.adsdk.ugeno.vt.ouw) this).ouw.get(0);
            if (this.qni != null) {
                while (i10 < this.qni.length()) {
                    ryl rylVar2 = new ryl(this.vt);
                    rylVar2.ouw(this.kfa);
                    try {
                        JSONObject jSONObjectOptJSONObject = this.qni.optJSONObject(i10);
                        if (jSONObjectOptJSONObject != null) {
                            if (jSONObjectOptJSONObject.has("$chunk")) {
                                this.yu.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                            } else {
                                this.yu.put("$item", jSONObjectOptJSONObject);
                            }
                            ((ouw) this.fkw).ouw(rylVar2.ouw(lhVar2.jqy(), this.yu));
                        }
                    } catch (Throwable unused) {
                    }
                    i10++;
                }
            }
        }
    }

    public vt(Context context) {
        super(context);
        this.f12671ln = 0;
        this.smu = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        super.ouw(str, str2);
        if (TextUtils.isEmpty(str)) {
        }
        str.hashCode();
        switch (str) {
            case "driveMode":
                this.smu = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0);
                break;
            case "direction":
                if (TextUtils.equals(str2, "vertical")) {
                    this.f12671ln = 1;
                    break;
                } else {
                    this.f12671ln = 0;
                    break;
                }
                break;
            case "dataList":
                this.qni = com.bytedance.adsdk.ugeno.ra.vt.ouw(str2, (JSONArray) null);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw
    public final void ouw(lh lhVar) {
        if (lhVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.vt.ouw) this).ouw.add(lhVar);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw
    public final void ouw(lh lhVar, ViewGroup.LayoutParams layoutParams) {
        if (lhVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.vt.ouw) this).ouw.add(lhVar);
    }
}
