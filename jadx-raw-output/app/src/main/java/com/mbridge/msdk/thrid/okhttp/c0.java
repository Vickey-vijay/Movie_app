package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: Route.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f37406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f37407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f37408c;

    public a a() {
        return this.f37406a;
    }

    public Proxy b() {
        return this.f37407b;
    }

    public boolean c() {
        return this.f37406a.f37351i != null && this.f37407b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f37408c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (c0Var.f37406a.equals(this.f37406a) && c0Var.f37407b.equals(this.f37407b) && c0Var.f37408c.equals(this.f37408c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f37406a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f37407b.hashCode()) * 31) + this.f37408c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f37408c + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
    }

    public c0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar != null) {
            if (proxy != null) {
                if (inetSocketAddress != null) {
                    this.f37406a = aVar;
                    this.f37407b = proxy;
                    this.f37408c = inetSocketAddress;
                    return;
                }
                throw new NullPointerException("inetSocketAddress == null");
            }
            throw new NullPointerException("proxy == null");
        }
        throw new NullPointerException("address == null");
    }
}
