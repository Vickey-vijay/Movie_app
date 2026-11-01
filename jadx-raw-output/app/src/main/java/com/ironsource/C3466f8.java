package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: renamed from: com.ironsource.f8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3466f8 extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSourceError f28892a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3466f8(IronSourceError ironSourceError) {
        super(ironSourceError.getErrorMessage());
        ck.p.j(ironSourceError, "error");
        this.f28892a = ironSourceError;
    }

    public final IronSourceError a() {
        return this.f28892a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ck.p.e(C3466f8.class, obj.getClass())) {
            return false;
        }
        C3466f8 c3466f8 = (C3466f8) obj;
        if (this.f28892a.getErrorCode() != c3466f8.f28892a.getErrorCode()) {
            return false;
        }
        return ck.p.e(this.f28892a.getErrorMessage(), c3466f8.f28892a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f28892a.getErrorCode()), this.f28892a.getErrorMessage());
    }
}
