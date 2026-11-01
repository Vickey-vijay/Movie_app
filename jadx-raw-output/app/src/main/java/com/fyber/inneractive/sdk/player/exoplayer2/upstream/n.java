package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3426d4;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f17764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f17765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f17766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f17767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f17768e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) {
        if (this.f17768e != null) {
            throw new IllegalStateException();
        }
        String scheme = kVar.f17747a.getScheme();
        Uri uri = kVar.f17747a;
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f17873a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || scheme2.equals(C3426d4.i.f28530b)) {
            if (kVar.f17747a.getPath().startsWith("/android_asset/")) {
                this.f17768e = this.f17766c;
            } else {
                this.f17768e = this.f17765b;
            }
        } else if ("asset".equals(scheme)) {
            this.f17768e = this.f17766c;
        } else if ("content".equals(scheme)) {
            this.f17768e = this.f17767d;
        } else {
            this.f17768e = this.f17764a;
        }
        return this.f17768e.a(kVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        h hVar = this.f17768e;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f17768e = null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f17768e.read(bArr, i10, i11);
    }

    public n(Context context, m mVar, h hVar) {
        hVar.getClass();
        this.f17764a = hVar;
        this.f17765b = new s(mVar);
        this.f17766c = new d(context, mVar);
        this.f17767d = new f(context, mVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        h hVar = this.f17768e;
        if (hVar == null) {
            return null;
        }
        return hVar.a();
    }
}
