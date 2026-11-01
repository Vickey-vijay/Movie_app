package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.impl.e;
import com.mbridge.msdk.video.signal.impl.h;
import com.mbridge.msdk.video.signal.j;

/* JADX INFO: compiled from: DefaultJSFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class a implements IJSFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.video.signal.b f39402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f39403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f39404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f39405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f39406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f39407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f39408g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        if (this.f39402a == null) {
            this.f39402a = new com.mbridge.msdk.video.signal.impl.b();
        }
        return this.f39402a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f39407f == null) {
            this.f39407f = new com.mbridge.msdk.video.signal.impl.g();
        }
        return this.f39407f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f39408g == null) {
            this.f39408g = new com.mbridge.msdk.video.signal.impl.c();
        }
        return this.f39408g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        if (this.f39403b == null) {
            this.f39403b = new com.mbridge.msdk.video.signal.impl.d();
        }
        return this.f39403b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        if (this.f39406e == null) {
            this.f39406e = new e();
        }
        return this.f39406e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f39405d == null) {
            this.f39405d = new com.mbridge.msdk.video.signal.impl.f();
        }
        return this.f39405d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f39404c == null) {
            this.f39404c = new h();
        }
        return this.f39404c;
    }
}
