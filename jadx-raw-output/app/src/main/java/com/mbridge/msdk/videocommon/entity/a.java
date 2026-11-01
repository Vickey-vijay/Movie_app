package com.mbridge.msdk.videocommon.entity;

import org.json.JSONObject;

/* JADX INFO: compiled from: AdParams.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39562b;

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new a(jSONObject.optString("appId"), jSONObject.optString("placementId"));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public a(String str, String str2) {
        this.f39561a = str;
        this.f39562b = str2;
    }
}
