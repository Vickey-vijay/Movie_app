package com.mbridge.msdk.config.component.common.network;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: NetworkRequest.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f33082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f33083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f33084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.b f33085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f33086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f33087f = "HTTP";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.socket.a f33088g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.okhttp.a f33089h = null;

    /* JADX INFO: compiled from: NetworkRequest.java */
    public class a implements com.mbridge.msdk.config.component.common.network.b {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.b
        public void a() {
            if (c.this.f33088g != null) {
                c.this.f33088g.a();
            }
        }
    }

    /* JADX INFO: compiled from: NetworkRequest.java */
    public class b implements com.mbridge.msdk.config.component.common.network.b {
        public b() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.b
        public void a() {
            if (c.this.f33089h != null) {
                c.this.f33089h.a();
            }
        }
    }

    private void c() {
        try {
            com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = new com.mbridge.msdk.config.component.common.network.connect.socket.a(this.f33084c, this.f33083b, this.f33082a);
            this.f33088g = aVar;
            aVar.a(this.f33086e);
            this.f33085d.a(new a());
        } catch (Exception e10) {
            q0.b("NetworkRequestTask", e10.getMessage(), e10);
        }
    }

    public void a(String str, com.mbridge.msdk.config.component.common.network.a aVar) {
        this.f33086e = str;
        this.f33082a = aVar;
        this.f33087f = this.f33084c.i();
    }

    public void b() {
        com.mbridge.msdk.config.component.common.network.a aVar = this.f33082a;
        if (aVar != null) {
            aVar.a(this.f33083b);
        }
        if (this.f33087f.equals("TCP")) {
            c();
        } else {
            a();
        }
    }

    public c(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2) {
        this.f33084c = aVar;
        this.f33083b = aVar2;
        this.f33085d = aVar2.a();
    }

    private void a() {
        try {
            com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar = new com.mbridge.msdk.config.component.common.network.connect.okhttp.a(this.f33084c, this.f33083b, this.f33082a);
            this.f33089h = aVar;
            aVar.a(this.f33086e);
            this.f33085d.a(new b());
        } catch (Exception e10) {
            q0.b("NetworkRequestTask", e10.getMessage(), e10);
        }
    }
}
