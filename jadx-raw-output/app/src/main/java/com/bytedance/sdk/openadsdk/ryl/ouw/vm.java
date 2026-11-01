package com.bytedance.sdk.openadsdk.ryl.ouw;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.osn;
import com.ironsource.C3426d4;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class vm extends com.bytedance.sdk.component.ouw.vm<JSONObject, JSONObject> {
    public static final HashSet<String> yu = new HashSet<>(Arrays.asList("setStorageItem", "getStorageItem", "removeAllStorage", "removeStorageItem"));
    private vpp fkw;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:73:0x011a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ Object ouw(String str, Object obj) throws Exception {
        String str2;
        Map<String, String> map;
        Map<String, String> map2;
        Map<String, String> map3;
        JSONObject jSONObject = (JSONObject) obj;
        vpp vppVar = this.fkw;
        String str3 = null;
        if (vppVar == null || (str2 = vppVar.f12873rn) == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        str.hashCode();
        byte b10 = -1;
        boolean z10 = true;
        boolean zContainsKey = false;
        switch (str.hashCode()) {
            case -1166163208:
                if (str.equals("getStorageItem")) {
                    b10 = 0;
                }
                break;
            case 541948222:
                if (str.equals("removeAllStorage")) {
                    b10 = 1;
                }
                break;
            case 1357067884:
                if (str.equals("setStorageItem")) {
                    b10 = 2;
                }
                break;
            case 1498706186:
                if (str.equals("removeStorageItem")) {
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
                String strOptString = jSONObject.optString(C3426d4.i.W);
                if (TextUtils.isEmpty(strOptString)) {
                    jSONObject2.put("code", "1");
                } else {
                    osn osnVarOuw = osn.ouw();
                    Map<String, Map<String, String>> map4 = osnVarOuw.ouw;
                    if (map4 != null && map4.containsKey(str2) && (map2 = osnVarOuw.ouw.get(str2)) != null) {
                        zContainsKey = map2.containsKey(strOptString);
                    }
                    if (zContainsKey) {
                        osn osnVarOuw2 = osn.ouw();
                        Map<String, Map<String, String>> map5 = osnVarOuw2.ouw;
                        if (map5 != null && map5.containsKey(str2) && (map = osnVarOuw2.ouw.get(str2)) != null) {
                            str3 = map.get(strOptString);
                        }
                        jSONObject2.put("value", str3);
                        jSONObject2.put("code", "0");
                    } else {
                        jSONObject2.put("code", "1");
                    }
                }
                return jSONObject2;
            case 1:
                osn.ouw().ouw(str2);
                jSONObject2.put("code", "0");
                return jSONObject2;
            case 2:
                String strOptString2 = jSONObject.optString(C3426d4.i.W);
                String strOptString3 = jSONObject.optString("value");
                if (strOptString2 != null) {
                    osn osnVarOuw3 = osn.ouw();
                    Map<String, Map<String, String>> map6 = osnVarOuw3.ouw;
                    if (map6 != null) {
                        Map<String, String> map7 = map6.get(str2);
                        if (map7 != null) {
                            map7.put(strOptString2, strOptString3);
                        } else {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            concurrentHashMap.put(strOptString2, strOptString3);
                            osnVarOuw3.ouw.put(str2, concurrentHashMap);
                        }
                    }
                    jSONObject2.put("code", "0");
                } else {
                    jSONObject2.put("code", "1");
                }
                return jSONObject2;
            case 3:
                String strOptString4 = jSONObject.optString(C3426d4.i.W);
                if (TextUtils.isEmpty(strOptString4)) {
                    jSONObject2.put("code", "1");
                } else {
                    osn osnVarOuw4 = osn.ouw();
                    Map<String, Map<String, String>> map8 = osnVarOuw4.ouw;
                    if (map8 == null || !map8.containsKey(str2) || (map3 = osnVarOuw4.ouw.get(str2)) == null) {
                        z10 = false;
                    } else {
                        map3.remove(strOptString4);
                    }
                    jSONObject2.put("code", z10 ? "0" : "1");
                }
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }

    private vm(vpp vppVar) {
        this.fkw = vppVar;
    }

    public static void ouw(com.bytedance.sdk.component.ouw.ko koVar, vpp vppVar) {
        koVar.ouw(yu, new vm(vppVar));
    }
}
