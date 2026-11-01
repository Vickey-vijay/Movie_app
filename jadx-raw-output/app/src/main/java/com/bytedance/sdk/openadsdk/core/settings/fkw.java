package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.qbp;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public interface fkw {
    public static final vt<JSONObject> ouw = new vt<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.fkw.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.vt
        public final /* synthetic */ JSONObject ouw(String str) {
            return vt(str);
        }

        private static JSONObject vt(String str) {
            try {
                return PangleVideoBridge.jsonObjectInit(str);
            } catch (Exception e10) {
                qbp.ouw("ISettingsDataRepository", "", e10);
                return null;
            }
        }
    };
    public static final vt<Set<String>> vt = new vt<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.fkw.2
        private static Set<String> vt(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    hashSet.add(jSONArray.getString(i10));
                }
            } catch (Exception e10) {
                qbp.ouw("ISettingsDataRepository", "", e10);
            }
            return hashSet;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.vt
        public final /* synthetic */ Set<String> ouw(String str) {
            return vt(str);
        }
    };

    public interface ouw {
        ouw ouw(String str);

        ouw ouw(String str, float f10);

        ouw ouw(String str, int i10);

        ouw ouw(String str, long j10);

        ouw ouw(String str, String str2);

        ouw ouw(String str, boolean z10);

        void ouw();
    }

    public interface vt<T> {
        T ouw(String str);
    }

    void ouw(JSONObject jSONObject);
}
