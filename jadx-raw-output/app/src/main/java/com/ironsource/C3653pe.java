package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3653pe extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSourceError f30458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30459b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3653pe(IronSourceError ironSourceError) {
        super(ironSourceError.getErrorMessage());
        ck.p.j(ironSourceError, "error");
        this.f30458a = ironSourceError;
        this.f30459b = ironSourceError.getErrorCode();
    }

    public final IronSourceError a() {
        return this.f30458a;
    }

    public final int b() {
        return this.f30459b;
    }
}
