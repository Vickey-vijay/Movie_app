package com.yandex.div.internal.util;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: JsonUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JsonUtilsKt {
    public static final String summary(JSONObject jSONObject, int i10) {
        return new JsonPrinter(i10, 1).print(jSONObject);
    }

    public static /* synthetic */ String summary$default(JSONObject jSONObject, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return summary(jSONObject, i10);
    }

    public static final String summary(JSONArray jSONArray, int i10) {
        return new JsonPrinter(i10, 1).print(jSONArray);
    }

    public static /* synthetic */ String summary$default(JSONArray jSONArray, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return summary(jSONArray, i10);
    }

    public static final <R> List<R> asList(JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            if (!(obj instanceof Object)) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean isEmpty(JSONObject jSONObject) {
        if (jSONObject.length() == 0) {
            return true;
        }
        return false;
    }
}
