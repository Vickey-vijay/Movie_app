package com.inmobi.media;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Ke extends Me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3114pk f23016b;

    @Override // com.inmobi.media.Me
    public final Map a() {
        return null;
    }

    @Override // com.inmobi.media.Me
    public final Ai b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ke)) {
            return false;
        }
        Ke ke2 = (Ke) obj;
        return ck.p.e(this.f23015a, ke2.f23015a) && ck.p.e(null, null) && ck.p.e(this.f23016b, ke2.f23016b) && ck.p.e(null, null);
    }

    public Ke(String str, C3114pk c3114pk) {
        ck.p.j(str, "url");
        this.f23015a = str;
        this.f23016b = c3114pk;
    }

    @Override // com.inmobi.media.Me
    public final String c() {
        return this.f23015a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f23016b.hashCode() + (this.f23015a.hashCode() * 961)) * 961);
    }

    public final String toString() {
        return "HeadRequest(url=" + this.f23015a + ", headers=" + ((Object) null) + ", timeouts=" + this.f23016b + ", retryPolicy=" + ((Object) null) + ", followRedirects=true)";
    }
}
