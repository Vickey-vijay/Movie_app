package com.bytedance.sdk.component.ouw;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ra {
    private tlj ouw;

    public final <T> T ouw(String str, Type type) throws JSONException {
        ouw(str);
        return (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) ? (T) PangleVideoBridge.jsonObjectInit(str) : (T) this.ouw.ouw();
    }

    public ra(tlj tljVar) {
        this.ouw = tljVar;
    }

    public final <T> String ouw(T t10) {
        String string;
        if (t10 == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if (!(t10 instanceof JSONObject) && !(t10 instanceof JSONArray)) {
            string = this.ouw.vt();
        } else {
            string = t10.toString();
        }
        ouw(string);
        return string;
    }

    private static void ouw(String str) {
        if (str.startsWith(h.f44171d) && str.endsWith(h.f44172e)) {
            return;
        }
        pno.ouw(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
