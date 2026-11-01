package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import e5.h;
import e5.q;
import g5.k0;
import g5.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DefaultDataSource.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<q> f20096b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f20097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public a f20098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public a f20099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public a f20100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public a f20101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public a f20102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public a f20103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public a f20104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public a f20105k;

    public final void c(a aVar) {
        for (int i10 = 0; i10 < this.f20096b.size(); i10++) {
            aVar.b(this.f20096b.get(i10));
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long a(h hVar) throws IOException {
        g5.a.f(this.f20105k == null);
        String scheme = hVar.f52374a.getScheme();
        if (k0.h0(hVar.f52374a)) {
            String path = hVar.f52374a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f20105k = g();
            } else {
                this.f20105k = d();
            }
        } else if ("asset".equals(scheme)) {
            this.f20105k = d();
        } else if ("content".equals(scheme)) {
            this.f20105k = e();
        } else if ("rtmp".equals(scheme)) {
            this.f20105k = i();
        } else if ("udp".equals(scheme)) {
            this.f20105k = j();
        } else if ("data".equals(scheme)) {
            this.f20105k = f();
        } else if ("rawresource".equals(scheme)) {
            this.f20105k = h();
        } else {
            this.f20105k = this.f20097c;
        }
        return this.f20105k.a(hVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void b(q qVar) {
        this.f20097c.b(qVar);
        this.f20096b.add(qVar);
        k(this.f20098d, qVar);
        k(this.f20099e, qVar);
        k(this.f20100f, qVar);
        k(this.f20101g, qVar);
        k(this.f20102h, qVar);
        k(this.f20103i, qVar);
        k(this.f20104j, qVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws IOException {
        a aVar = this.f20105k;
        if (aVar != null) {
            try {
                aVar.close();
            } finally {
                this.f20105k = null;
            }
        }
    }

    public final a d() {
        if (this.f20099e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f20095a);
            this.f20099e = assetDataSource;
            c(assetDataSource);
        }
        return this.f20099e;
    }

    public final a e() {
        if (this.f20100f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f20095a);
            this.f20100f = contentDataSource;
            c(contentDataSource);
        }
        return this.f20100f;
    }

    public final a f() {
        if (this.f20103i == null) {
            e5.e eVar = new e5.e();
            this.f20103i = eVar;
            c(eVar);
        }
        return this.f20103i;
    }

    public final a g() {
        if (this.f20098d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f20098d = fileDataSource;
            c(fileDataSource);
        }
        return this.f20098d;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> getResponseHeaders() {
        a aVar = this.f20105k;
        return aVar == null ? Collections.emptyMap() : aVar.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    @Nullable
    public Uri getUri() {
        a aVar = this.f20105k;
        if (aVar == null) {
            return null;
        }
        return aVar.getUri();
    }

    public final a h() {
        if (this.f20104j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f20095a);
            this.f20104j = rawResourceDataSource;
            c(rawResourceDataSource);
        }
        return this.f20104j;
    }

    public final a i() {
        if (this.f20101g == null) {
            try {
                a aVar = (a) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f20101g = aVar;
                c(aVar);
            } catch (ClassNotFoundException unused) {
                m.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f20101g == null) {
                this.f20101g = this.f20097c;
            }
        }
        return this.f20101g;
    }

    public final a j() {
        if (this.f20102h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f20102h = udpDataSource;
            c(udpDataSource);
        }
        return this.f20102h;
    }

    public final void k(@Nullable a aVar, q qVar) {
        if (aVar != null) {
            aVar.b(qVar);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((a) g5.a.e(this.f20105k)).read(bArr, i10, i11);
    }

    public b(Context context, a aVar) {
        this.f20095a = context.getApplicationContext();
        this.f20097c = (a) g5.a.e(aVar);
    }
}
