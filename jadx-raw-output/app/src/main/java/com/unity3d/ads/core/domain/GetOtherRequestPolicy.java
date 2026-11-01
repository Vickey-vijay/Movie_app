package com.unity3d.ads.core.domain;

import ck.p;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.RequestPolicy;

/* JADX INFO: compiled from: GetOtherRequestPolicy.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class GetOtherRequestPolicy implements GetRequestPolicy {
    private final SessionRepository sessionRepository;

    public GetOtherRequestPolicy(SessionRepository sessionRepository) {
        p.j(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetRequestPolicy
    public RequestPolicy invoke() {
        return new RequestPolicy(this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getMaxDuration(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getRetryMaxInterval(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getRetryWaitBase(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getRetryJitterPct(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getRetryScalingFactor(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getTimeoutPolicy().getConnectTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getTimeoutPolicy().getReadTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getTimeoutPolicy().getWriteTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getTimeoutPolicy().getOverallTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOtherPolicy().getRetryPolicy().getShouldStoreLocally());
    }
}
