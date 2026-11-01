package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class PAGRequest {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private Bundle f12183lh = null;
    private String ouw;
    private Map<String, Object> vt;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.f12183lh == null) {
            this.f12183lh = new Bundle();
        }
        this.f12183lh.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.ouw;
    }

    public Map<String, Object> getExtraInfo() {
        return this.vt;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.f12183lh;
    }

    public void setAdString(String str) {
        this.ouw = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.vt = map;
    }
}
