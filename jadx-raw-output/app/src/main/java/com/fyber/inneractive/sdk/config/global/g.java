package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public abstract class g {
    public static JSONArray a(Map map, boolean z10) {
        d dVar;
        JSONArray jSONArray = new JSONArray();
        try {
            for (com.fyber.inneractive.sdk.config.global.features.h hVar : map.values()) {
                hVar.getClass();
                ArrayList<b> arrayList = new ArrayList(hVar.f15091c.values());
                HashMap map2 = hVar.f15092d;
                for (b bVar : arrayList) {
                    JSONObject jSONObject = new JSONObject();
                    String str = bVar != null ? bVar.f15077a : null;
                    if (!TextUtils.isEmpty(str)) {
                        k kVar = (k) map2.get(str);
                        jSONObject.put("id", str);
                        if (kVar != null) {
                            jSONObject.put("v", kVar.f15101b);
                        } else {
                            jSONObject.put("v", "control");
                        }
                        if (z10) {
                            Iterator it = bVar.f15080d.iterator();
                            do {
                                if (!it.hasNext()) {
                                    dVar = null;
                                    break;
                                }
                                dVar = (d) it.next();
                            } while (!c.class.equals(dVar.getClass()));
                            if (dVar != null && ((c) dVar).f15082b) {
                                HashSet hashSet = ((c) dVar).f15081a;
                                JSONArray jSONArray2 = new JSONArray();
                                Iterator it2 = hashSet.iterator();
                                while (it2.hasNext()) {
                                    jSONArray2.put((Long) it2.next());
                                }
                                if (jSONArray2.length() > 0) {
                                    jSONObject.put("d", jSONArray2);
                                }
                            }
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
            return jSONArray;
        } catch (JSONException e10) {
            IAlog.a("ExperimentParamBuilder: Json exception during experiments Json build!", new Object[0]);
            if (IAlog.f18551a <= 3) {
                e10.printStackTrace();
            }
            return null;
        }
    }
}
