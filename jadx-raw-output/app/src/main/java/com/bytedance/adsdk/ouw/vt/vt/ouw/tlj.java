package com.bytedance.adsdk.ouw.vt.vt.ouw;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class tlj implements com.bytedance.adsdk.ouw.vt.vt.ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private String f10741lh;
    public com.bytedance.adsdk.ouw.vt.vt.ouw[] ouw;
    public boolean vt;
    private com.bytedance.adsdk.ouw.vt.ouw.ouw yu;

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        com.bytedance.adsdk.ouw.vt.ouw.ouw ouwVar = new com.bytedance.adsdk.ouw.vt.ouw.ouw();
        this.yu = ouwVar;
        ouwVar.ouw = this.f10741lh;
        Object[] objArr = new Object[this.ouw.length];
        int i10 = 0;
        while (true) {
            com.bytedance.adsdk.ouw.vt.vt.ouw[] ouwVarArr = this.ouw;
            if (i10 >= ouwVarArr.length) {
                this.yu.vt = objArr;
                return com.bytedance.adsdk.ouw.rn.ouw(this.f10741lh).ouw(map.get("default_key"), objArr);
            }
            com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar2 = ouwVarArr[i10];
            if (ouwVar2 != null) {
                objArr[i10] = ouwVar2.ouw(map);
            }
            i10++;
        }
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final String vt() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10741lh);
        sb2.append("(");
        com.bytedance.adsdk.ouw.vt.vt.ouw[] ouwVarArr = this.ouw;
        if (ouwVarArr != null && ouwVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                com.bytedance.adsdk.ouw.vt.vt.ouw[] ouwVarArr2 = this.ouw;
                if (i10 >= ouwVarArr2.length) {
                    break;
                }
                sb2.append(ouwVarArr2[i10].vt());
                sb2.append(StringUtils.COMMA);
                i10++;
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    public tlj(String str) {
        this.f10741lh = str;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final com.bytedance.adsdk.ouw.vt.yu.fkw ouw() {
        return com.bytedance.adsdk.ouw.vt.yu.vt.METHOD;
    }
}
