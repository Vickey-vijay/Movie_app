package com.unity3d.services.ads.token;

import mj.r;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: TokenStorage.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface TokenStorage {
    void appendTokens(JSONArray jSONArray) throws JSONException;

    void createTokens(JSONArray jSONArray) throws JSONException;

    void deleteTokens();

    r getNativeGeneratedToken();

    String getToken();

    void setInitToken(String str);
}
