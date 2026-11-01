package com.bytedance.sdk.component.adexpress.ouw.vt;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ko;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class le {
    private static volatile le ouw;
    private AtomicBoolean vt = new AtomicBoolean(false);

    public static Set<String> vt(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        fkw.ouw();
        return fkw.vt(str);
    }

    public static le ouw() {
        if (ouw == null) {
            synchronized (le.class) {
                if (ouw == null) {
                    ouw = new le();
                }
            }
        }
        return ouw;
    }

    private le() {
    }

    private static JSONObject lh(String str) {
        com.bytedance.sdk.component.adexpress.ouw.ouw.lh lhVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh;
        if (lhVar == null) {
            return null;
        }
        com.bytedance.sdk.component.ra.vt.vt vtVarRa = lhVar.ra();
        vtVarRa.ouw(str);
        com.bytedance.sdk.component.ra.vt vtVarOuw = vtVarRa.ouw();
        if (vtVarOuw != null) {
            try {
                if (vtVarOuw.pno && vtVarOuw.yu != null) {
                    return PangleVideoBridge.jsonObjectInit(vtVarOuw.yu);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    private void vt() {
        if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh == null) {
            return;
        }
        int iOuw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh.ouw();
        if (iOuw <= 0) {
            iOuw = 100;
        }
        List<com.bytedance.sdk.component.adexpress.ouw.lh.vt> listVt = fkw.ouw().vt();
        if (listVt != null && !listVt.isEmpty() && iOuw < listVt.size()) {
            TreeMap treeMap = new TreeMap();
            for (com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVar : listVt) {
                treeMap.put(vtVar.f11570ra, vtVar);
            }
            HashSet hashSet = new HashSet();
            int size = (int) (listVt.size() - (iOuw * 0.75f));
            int i10 = 0;
            for (Map.Entry entry : treeMap.entrySet()) {
                if (entry != null && i10 < size) {
                    i10++;
                    ((Long) entry.getKey()).longValue();
                    com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVar2 = (com.bytedance.sdk.component.adexpress.ouw.lh.vt) entry.getValue();
                    if (vtVar2 != null) {
                        hashSet.add(vtVar2.vt);
                    }
                }
            }
            try {
                fkw.ouw().ouw(hashSet);
            } catch (Throwable th2) {
                ko.vt("TmplDiffManager", th2.getMessage());
            }
            this.vt.set(false);
            return;
        }
        ko.vt("TmplDiffManager", "end doCheckAndDeleteTask maxTplCnt,local size" + iOuw + ", Number of templates currently stored" + (listVt != null ? listVt.size() : 0));
    }

    public static com.bytedance.sdk.component.adexpress.ouw.lh.vt ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return fkw.ouw().ouw(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ouw(String str, String str2, String str3, String str4, String str5, String str6) {
        if (ouw(str) != null) {
            if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                vt(str6, str, str3, str2, str4, str5);
            }
            return;
        } else if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
            ouw(str2, str6, str);
        } else {
            vt(str6, str, str3, str2, str4, str5);
        }
        boolean zOuw = lh.ouw(ra.ouw(), str5);
        if (!vt.yu() || zOuw) {
            yu.vt().ouw(true);
        }
    }

    private void ouw(String str, String str2, String str3) {
        JSONObject jSONObjectLh;
        if (TextUtils.isEmpty(str) || (jSONObjectLh = lh(str)) == null) {
            return;
        }
        String strOptString = jSONObjectLh.optString("md5");
        String strOptString2 = jSONObjectLh.optString("version");
        String strOptString3 = jSONObjectLh.optString("data");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVar = new com.bytedance.sdk.component.adexpress.ouw.lh.vt();
        vtVar.ouw = str2;
        vtVar.vt = str3;
        vtVar.f11569lh = strOptString;
        vtVar.yu = str;
        vtVar.fkw = strOptString3;
        vtVar.f11568le = strOptString2;
        vtVar.f11570ra = Long.valueOf(System.currentTimeMillis());
        fkw.ouw().ouw(vtVar, false);
        vt();
        if (lh.ouw(ra.ouw(), strOptString2)) {
            vtVar.f11568le = strOptString2;
            yu.vt().ouw(true);
        }
    }

    private void vt(String str, String str2, String str3, String str4, String str5, String str6) {
        com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVar = new com.bytedance.sdk.component.adexpress.ouw.lh.vt();
        vtVar.ouw = str;
        vtVar.vt = str2;
        vtVar.f11569lh = str3;
        vtVar.yu = str4;
        vtVar.fkw = str5;
        vtVar.f11568le = str6;
        vtVar.f11570ra = Long.valueOf(System.currentTimeMillis());
        fkw.ouw().ouw(vtVar, false);
        vt();
    }
}
