package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3463f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3463f5 f28891a = new C3463f5();

    public final boolean a(IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            return false;
        }
        int errorCode = ironSourceError.getErrorCode();
        return errorCode == 524 || errorCode == 530;
    }

    private C3463f5() {
    }
}
