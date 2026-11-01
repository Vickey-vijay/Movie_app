package com.yandex.div.internal.util;

import org.json.JSONArray;

/* JADX INFO: compiled from: JsonNode.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JsonArray extends JsonNode {
    private final JSONArray value;

    public JsonArray(JSONArray jSONArray) {
        super(null);
        this.value = jSONArray;
    }

    @Override // com.yandex.div.internal.util.JsonNode
    public String dump() {
        return this.value.toString();
    }
}
