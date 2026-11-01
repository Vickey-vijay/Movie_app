package com.mbridge.msdk.config.component.common.network.connect.socket;

import android.text.TextUtils;

/* JADX INFO: compiled from: ConnectionJavaSocket.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f33101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f33102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f33103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.a f33104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f33105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.a f33106f;

    public com.mbridge.msdk.config.component.common.network.result.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return a(1008, 1008, "URL cannot be empty");
        }
        b bVar = new b(this.f33101a, this.f33102b, this.f33103c);
        this.f33105e = bVar;
        bVar.c(str);
        this.f33105e.a(this.f33104d);
        c.a().a(this.f33105e, this.f33106f);
        return this.f33102b;
    }

    public a(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2, com.mbridge.msdk.config.component.common.network.a aVar3) {
        this.f33101a = aVar;
        this.f33102b = aVar2;
        this.f33103c = aVar3;
        this.f33106f = aVar2.b();
    }

    public void a() {
        b bVar = this.f33105e;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.a aVar) {
        this.f33104d = aVar;
    }

    private com.mbridge.msdk.config.component.common.network.result.a a(int i10, int i11, String str) {
        this.f33102b.a(str);
        this.f33102b.c(i10);
        this.f33102b.a(i11);
        this.f33102b.b(2);
        return this.f33102b;
    }
}
