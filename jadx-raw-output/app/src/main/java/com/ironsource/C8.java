package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class C8 extends File {
    public C8(String str, String str2) {
        super(str, str2);
    }

    public C8(String str) {
        super(str);
    }

    @Override // java.io.File
    public String toString() {
        return "ISNFile(name: " + getName() + ", path: " + getPath() + ", isFile: " + isFile() + ", isDirectory: " + isDirectory() + ", lastModified: " + lastModified() + ", length: " + length() + ")";
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put("name", getName());
        jSONObjectJsonObjectInit.put("path", getPath());
        jSONObjectJsonObjectInit.put(D8.f26326c, lastModified());
        if (isFile()) {
            jSONObjectJsonObjectInit.put("size", length());
        }
        return jSONObjectJsonObjectInit;
    }
}
