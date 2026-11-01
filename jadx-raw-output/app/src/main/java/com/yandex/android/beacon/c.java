package com.yandex.android.beacon;

import android.net.Uri;
import ck.i;
import ck.p;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: SendBeaconRequest.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f45796e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f45797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f45798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f45799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final md.a f45800d;

    /* JADX INFO: compiled from: SendBeaconRequest.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final c a(com.yandex.android.beacon.a aVar) {
            return new c(aVar.e(), aVar.c(), aVar.d(), aVar.b());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p.e(this.f45797a, cVar.f45797a) && p.e(this.f45798b, cVar.f45798b) && p.e(this.f45799c, cVar.f45799c) && p.e(this.f45800d, cVar.f45800d);
    }

    public int hashCode() {
        int iHashCode = ((this.f45797a.hashCode() * 31) + this.f45798b.hashCode()) * 31;
        JSONObject jSONObject = this.f45799c;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        md.a aVar = this.f45800d;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "SendBeaconRequest(url=" + this.f45797a + ", headers=" + this.f45798b + ", payload=" + this.f45799c + ", cookieStorage=" + this.f45800d + ')';
    }

    public final Uri a() {
        return this.f45797a;
    }

    public c(Uri uri, Map<String, String> map, JSONObject jSONObject, md.a aVar) {
        this.f45797a = uri;
        this.f45798b = map;
        this.f45799c = jSONObject;
        this.f45800d = aVar;
    }
}
