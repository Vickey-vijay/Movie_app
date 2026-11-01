package com.unity3d.ads.core.domain;

import ck.p;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* JADX INFO: compiled from: AndroidGetSafeguardedInitializationPolicy.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AndroidGetSafeguardedInitializationPolicy implements GetSafeguardedInitializationPolicy {
    @Override // com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy
    public NativeConfigurationOuterClass.RequestPolicy invoke(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        p.j(requestPolicy, "requestPolicy");
        NativeConfigurationOuterClass.RequestRetryPolicy retryPolicy = requestPolicy.getRetryPolicy();
        NativeConfigurationOuterClass.RequestTimeoutPolicy timeoutPolicy = requestPolicy.getTimeoutPolicy();
        NativeConfigurationOuterClass.RequestPolicy requestPolicyBuild = NativeConfigurationOuterClass.RequestPolicy.newBuilder(requestPolicy).setRetryPolicy(NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder(retryPolicy).setMaxDuration(Math.max(5000, retryPolicy.getMaxDuration())).setRetryWaitBase(Math.max(0, retryPolicy.getRetryWaitBase())).setRetryMaxInterval(Math.max(0, retryPolicy.getRetryMaxInterval())).setRetryScalingFactor(Math.max(0.1f, retryPolicy.getRetryScalingFactor())).setRetryJitterPct(Math.min(100.0f, Math.max(0.0f, retryPolicy.getRetryJitterPct())))).setTimeoutPolicy(NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder(timeoutPolicy).setConnectTimeoutMs(Math.max(1000, timeoutPolicy.getConnectTimeoutMs())).setReadTimeoutMs(Math.max(1000, timeoutPolicy.getReadTimeoutMs())).setWriteTimeoutMs(Math.max(1000, timeoutPolicy.getWriteTimeoutMs())).setOverallTimeoutMs(Math.max(1000, timeoutPolicy.getOverallTimeoutMs()))).build();
        p.i(requestPolicyBuild, "newBuilder(requestPolicy…  )\n            ).build()");
        return requestPolicyBuild;
    }
}
