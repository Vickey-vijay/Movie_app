package com.applovin.impl;

/* JADX INFO: loaded from: classes6.dex */
public class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private y2 f8851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f8852d;

    public void a(Object obj) {
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            this.f8852d = (com.applovin.impl.sdk.ad.b) obj;
        } else if (obj instanceof y2) {
            this.f8851c = (y2) obj;
        }
    }

    public long b() {
        return this.f8849a;
    }

    public com.applovin.impl.sdk.ad.b c() {
        return this.f8852d;
    }

    public String d() {
        String str = this.f8850b;
        return str != null ? str : "Unknown";
    }

    public y2 e() {
        return this.f8851c;
    }

    public String f() {
        if (this.f8852d != null) {
            return "AppLovin";
        }
        y2 y2Var = this.f8851c;
        return y2Var != null ? y2Var.getNetworkName() : "Unknown";
    }

    public q1(Object obj, long j10) {
        String label;
        this.f8849a = j10;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.f8852d = bVar;
            if (bVar.getAdZone().d() != null) {
                label = this.f8852d.getAdZone().d().getLabel();
            } else {
                label = null;
            }
            this.f8850b = label;
            return;
        }
        if (obj instanceof y2) {
            y2 y2Var = (y2) obj;
            this.f8851c = y2Var;
            this.f8850b = y2Var.getFormat().getLabel();
        }
    }

    public Object a() {
        com.applovin.impl.sdk.ad.b bVar = this.f8852d;
        return bVar != null ? bVar : this.f8851c;
    }
}
