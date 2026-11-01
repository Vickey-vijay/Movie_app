package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.network.t;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class InneractiveInfrastructureError extends InneractiveError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InneractiveErrorCode f15300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f15301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f15302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Exception f15303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f15304e;

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, i iVar) {
        this(inneractiveErrorCode, iVar, null);
    }

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, i iVar, Throwable th2) {
        this.f15304e = new ArrayList();
        this.f15300a = inneractiveErrorCode;
        this.f15301b = iVar;
        this.f15302c = th2;
    }

    public void addReportedError(t tVar) {
        this.f15304e.add(tVar);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15300a);
        if (this.f15302c != null) {
            sb2.append(" : ");
            sb2.append(this.f15302c);
        }
        return sb2.toString();
    }

    public Throwable getCause() {
        Exception exc = this.f15303d;
        return exc == null ? this.f15302c : exc;
    }

    public InneractiveErrorCode getErrorCode() {
        return this.f15300a;
    }

    public i getFyberMarketplaceAdLoadFailureReason() {
        return this.f15301b;
    }

    public boolean isErrorAlreadyReported(t tVar) {
        return this.f15304e.contains(tVar);
    }

    public void setCause(Exception exc) {
        this.f15303d = exc;
    }
}
