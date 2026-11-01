package com.yandex.div.core.actions;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionTypedDictSetValueHandler.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivActionTypedDictSetValueHandlerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject clone(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject2.put(next, jSONObject.get(next));
        }
        return jSONObject2;
    }
}
