package com.yandex.div.json;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public interface JSONSerializable {
    @NonNull
    JSONObject writeToJSON() throws JSONException;
}
