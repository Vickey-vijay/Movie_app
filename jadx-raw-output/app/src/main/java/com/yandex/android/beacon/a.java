package com.yandex.android.beacon;

import android.net.Uri;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: BeaconItem.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f45786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f45787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f45788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45789d;

    /* JADX INFO: renamed from: com.yandex.android.beacon.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BeaconItem.kt */
    public static final class C0451a extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f45790e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final md.a f45791f;

        @Override // com.yandex.android.beacon.a
        public C0451a a() {
            return this;
        }

        @Override // com.yandex.android.beacon.a
        public md.a b() {
            return this.f45791f;
        }

        public final long f() {
            return this.f45790e;
        }

        public C0451a(Uri uri, Map<String, String> map, JSONObject jSONObject, long j10, long j11) {
            super(uri, map, jSONObject, j10);
            this.f45790e = j11;
        }
    }

    public abstract C0451a a();

    public abstract md.a b();

    public final Map<String, String> c() {
        return this.f45787b;
    }

    public final JSONObject d() {
        return this.f45788c;
    }

    public final Uri e() {
        return this.f45786a;
    }

    public String toString() {
        return "BeaconItem{url=" + this.f45786a + ", headers=" + this.f45787b + ", addTimestamp=" + this.f45789d;
    }

    public a(Uri uri, Map<String, String> map, JSONObject jSONObject, long j10) {
        this.f45786a = uri;
        this.f45787b = map;
        this.f45788c = jSONObject;
        this.f45789d = j10;
    }
}
