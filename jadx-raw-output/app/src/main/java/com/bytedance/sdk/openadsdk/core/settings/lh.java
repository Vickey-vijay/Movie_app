package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.mwh;
import com.bytedance.sdk.openadsdk.utils.pd;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class lh {
    private static final ConcurrentHashMap<String, vt> ouw = new ConcurrentHashMap<>();

    @WorkerThread
    public static void ouw() {
        String strOuw;
        File fileLh = lh();
        if (fileLh.exists()) {
            try {
                HashMap<String, vt> mapVt = vt(new JSONArray(new String(com.bytedance.sdk.component.utils.ra.yu(fileLh))));
                if (mapVt.isEmpty()) {
                    return;
                }
                for (Map.Entry<String, vt> entry : mapVt.entrySet()) {
                    ouw.put(entry.getKey(), entry.getValue());
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            strOuw = com.bytedance.sdk.openadsdk.multipro.yu.ouw.vt("tt_sdk_settings", "ad_slot_conf", null);
        } else {
            zih.ouw();
            strOuw = pd.ouw("tt_sdk_settings").ouw("ad_slot_conf", null);
        }
        if (TextUtils.isEmpty(strOuw)) {
            return;
        }
        try {
            HashMap<String, vt> mapVt2 = vt(new JSONArray(strOuw));
            if (mapVt2.isEmpty()) {
                return;
            }
            ConcurrentHashMap<String, vt> concurrentHashMap = ouw;
            concurrentHashMap.clear();
            concurrentHashMap.putAll(mapVt2);
        } catch (Exception unused2) {
        }
    }

    @NonNull
    private static HashMap<String, vt> vt(JSONArray jSONArray) {
        HashMap<String, vt> map = new HashMap<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                vt vtVar = jSONObject == null ? null : new vt(jSONObject);
                if (vtVar != null) {
                    map.put(vtVar.ouw, vtVar);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    @NonNull
    private static File lh() {
        return new File(zih.ouw().getFilesDir(), "tt_ads_conf_sr");
    }

    public static void vt() {
        File fileLh = lh();
        if (fileLh.exists()) {
            fileLh.delete();
        }
    }

    @NonNull
    public static vt ouw(String str) {
        vt vtVar = ouw.get(str);
        return vtVar == null ? new vt(str) : vtVar;
    }

    @WorkerThread
    public static void ouw(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        File fileLh = lh();
        File file = new File(fileLh.getParent(), fileLh.getName() + ".tmp");
        FileWriter fileWriter = null;
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                FileWriter fileWriter2 = new FileWriter(file);
                try {
                    fileWriter2.write(jSONArray.toString());
                    file.renameTo(fileLh);
                    zih.ouw();
                    try {
                        pd.ouw("tt_sdk_settings").ouw.edit().remove("ad_slot_conf").apply();
                    } catch (Throwable unused) {
                    }
                    if (file.exists()) {
                        file.delete();
                    }
                    mwh.ouw(fileWriter2);
                } catch (Exception e10) {
                    e = e10;
                    fileWriter = fileWriter2;
                    Log.e("SdkSettings.AdSlot", "saveAdSlotToLocal: ", e);
                    if (file.exists()) {
                        file.delete();
                    }
                    mwh.ouw(fileWriter);
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    if (file.exists()) {
                        file.delete();
                    }
                    mwh.ouw(fileWriter);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
            HashMap<String, vt> mapVt = vt(jSONArray);
            if (mapVt.isEmpty()) {
                return;
            }
            for (Map.Entry<String, vt> entry : mapVt.entrySet()) {
                ouw.put(entry.getKey(), entry.getValue());
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
