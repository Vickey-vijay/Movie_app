package com.unity3d.services.core.domain;

import nk.h0;
import nk.w0;

/* JADX INFO: compiled from: SDKDispatchers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SDKDispatchers implements ISDKDispatchers {

    /* JADX INFO: renamed from: io, reason: collision with root package name */
    private final h0 f45397io = w0.b();

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private final h0 f3259default = w0.a();
    private final h0 main = w0.c();

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public h0 getDefault() {
        return this.f3259default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public h0 getIo() {
        return this.f45397io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public h0 getMain() {
        return this.main;
    }
}
