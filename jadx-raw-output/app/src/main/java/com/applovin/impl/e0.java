package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class e0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f7339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f7340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f7341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f7342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f7343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7344k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a f7345l;

    public interface a {
        void a(Uri uri);
    }

    public e0(String str, com.applovin.impl.sdk.ad.b bVar, String str2, com.applovin.impl.sdk.k kVar, a aVar) {
        this(str, bVar, bVar.S(), true, str2, kVar, aVar);
    }

    public e0(String str, com.applovin.impl.sdk.ad.b bVar, List list, boolean z10, String str2, com.applovin.impl.sdk.k kVar, a aVar) {
        super("AsyncTaskCacheResource", kVar);
        this.f7339f = str;
        this.f7340g = bVar;
        this.f7341h = list;
        this.f7342i = z10;
        this.f7343j = str2;
        this.f7344k = kVar;
        this.f7345l = aVar;
    }

    private void a(Uri uri) {
        a aVar;
        if (this.f7107e.get() || (aVar = this.f7345l) == null) {
            return;
        }
        aVar.a(uri);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        if (this.f7107e.get()) {
            return Boolean.FALSE;
        }
        String strA = this.f7344k.G().a(a(), this.f7339f, this.f7340g.getCachePrefix(), this.f7341h, this.f7342i, this.f7344k.G().a(this.f7339f, this.f7340g), this.f7343j, f2.a((AppLovinAdImpl) this.f7340g));
        if (TextUtils.isEmpty(strA)) {
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f7107e.get()) {
            return Boolean.FALSE;
        }
        File fileA = this.f7344k.G().a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7105c.b(this.f7104b, "Unable to retrieve File for cached filename = " + strA);
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f7107e.get()) {
            return Boolean.FALSE;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7105c.b(this.f7104b, "Unable to extract Uri from file");
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f7107e.get()) {
            return Boolean.FALSE;
        }
        a(uriFromFile);
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f7339f.equals(((e0) obj).f7339f);
    }

    public int hashCode() {
        String str = this.f7339f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
