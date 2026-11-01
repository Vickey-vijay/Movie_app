package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15700a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15701b;

    public boolean getAllowFullscreen() {
        return this.f15700a;
    }

    public String getMediationName() {
        return IAConfigManager.O.f15017l;
    }

    public String getMediationVersion() {
        return IAConfigManager.O.f15019n;
    }
}
