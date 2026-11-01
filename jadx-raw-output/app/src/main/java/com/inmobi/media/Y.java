package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* JADX INFO: loaded from: classes8.dex */
public class Y extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiAdRequestStatus f23811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f23812b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(InMobiAdRequestStatus inMobiAdRequestStatus, V v10) {
        super(inMobiAdRequestStatus.getMessage());
        ck.p.j(inMobiAdRequestStatus, "status");
        ck.p.j(v10, "adFetchError");
        this.f23811a = inMobiAdRequestStatus;
        this.f23812b = v10;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "AdFetchFailureException(statusCode=" + this.f23811a.getStatusCode() + ", statusMessage=" + this.f23811a.getMessage() + ", adFetchError=" + this.f23812b + ")";
    }
}
