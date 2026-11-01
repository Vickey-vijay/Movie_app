package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends v0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f16114s = IAlog.a(u0.class);

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final void a(o0 o0Var, String str, String str2) {
        d0 d0Var = this.f16125r;
        if (d0Var == null) {
            IAlog.f("%s: failed to cache file: no cache helper", f16114s);
            return;
        }
        d0Var.b(str2);
        if (o0Var == null || TextUtils.isEmpty(o0Var.f16064b) || TextUtils.isEmpty(str)) {
            IAlog.f("%s: failed to cache file: empty result", f16114s);
            return;
        }
        boolean zA = this.f16125r.a(str, o0Var.f16064b);
        Uri uri = (Uri) this.f16125r.a().f14939a;
        o0Var.f16063a = uri;
        if (zA) {
            this.f16124q.a(uri);
        } else {
            IAlog.b("%s: Failed to cache file", f16114s);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c() {
        this.f16085a = true;
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final a i() {
        e0 e0Var = new e0(this.f16123p, this.f16124q, com.fyber.inneractive.sdk.nativead.b.f15986f.f15988b);
        this.f16125r = e0Var;
        com.fyber.inneractive.sdk.cache.m mVarA = e0Var.a();
        String str = mVarA.f14940b;
        Uri uri = (Uri) mVarA.f14939a;
        this.f16124q.c();
        return new a(uri, str);
    }

    public u0(com.fyber.inneractive.sdk.flow.nativead.t tVar, Context context, com.fyber.inneractive.sdk.cache.d dVar) {
        super(tVar, context, dVar);
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i10) throws n0 {
        o0 o0Var = new o0();
        try {
            o0Var.f16064b = new String(Base64.encode(com.fyber.inneractive.sdk.util.v.a(lVar.f16041c), 0));
            return o0Var;
        } catch (Exception e10) {
            IAlog.b("%s : failed parse cacheable network request", f16114s, e10);
            throw new n0(e10);
        }
    }
}
