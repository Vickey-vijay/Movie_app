package com.bytedance.sdk.openadsdk.api.model;

/* JADX INFO: loaded from: classes10.dex */
public class PAGErrorModel {
    private final int ouw;
    private final String vt;

    public int getErrorCode() {
        return this.ouw;
    }

    public String getErrorMessage() {
        return this.vt;
    }

    public PAGErrorModel(int i10, String str) {
        this.ouw = i10;
        this.vt = str;
    }
}
