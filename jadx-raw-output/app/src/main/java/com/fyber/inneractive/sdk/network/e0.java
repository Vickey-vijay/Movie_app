package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f16012e = IAlog.a(e0.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.cache.g f16013d;

    @Override // com.fyber.inneractive.sdk.network.d0
    public final com.fyber.inneractive.sdk.cache.m a() {
        try {
            if (this.f16013d != null && this.f16005b.d()) {
                com.fyber.inneractive.sdk.player.cache.g gVar = this.f16013d;
                String strC = this.f16005b.c();
                gVar.getClass();
                try {
                    if (gVar.f16169i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    if (!com.fyber.inneractive.sdk.player.cache.g.f16159p.matcher(strC).matches()) {
                        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + strC + "\"");
                    }
                    com.fyber.inneractive.sdk.player.cache.e eVar = (com.fyber.inneractive.sdk.player.cache.e) gVar.f16170j.get(strC);
                    File fileA = eVar == null ? null : eVar.a(0);
                    String absolutePath = (fileA == null || !fileA.exists()) ? null : fileA.getAbsolutePath();
                    Uri uri = (Uri) this.f16005b.a(absolutePath);
                    if (uri == null) {
                        new c0();
                        return new com.fyber.inneractive.sdk.cache.m();
                    }
                    IAlog.a("Get cached file: %s", absolutePath);
                    if (this.f16006c == null) {
                        this.f16006c = this.f16004a.getSharedPreferences("IAConfigurationPreferences", 0);
                    }
                    return new com.fyber.inneractive.sdk.cache.m(uri, this.f16006c.getString(this.f16005b.b(), null));
                } catch (Exception e10) {
                    IAlog.f("%s: failure on filePath: %s", IAlog.a(com.fyber.inneractive.sdk.player.cache.g.class), e10);
                }
            }
            new c0();
            return new com.fyber.inneractive.sdk.cache.m();
        } catch (Exception unused) {
            b();
            return new com.fyber.inneractive.sdk.cache.m();
        }
    }

    public e0(Context context, com.fyber.inneractive.sdk.cache.a aVar, com.fyber.inneractive.sdk.player.cache.g gVar) {
        super(context, aVar);
        this.f16013d = gVar;
    }

    @Override // com.fyber.inneractive.sdk.network.d0
    public final boolean a(String str, String str2) {
        com.fyber.inneractive.sdk.player.cache.g gVar;
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            if (bArrDecode != null && (gVar = this.f16013d) != null) {
                com.fyber.inneractive.sdk.player.cache.d dVarA = gVar.a(str);
                if (dVarA == null) {
                    IAlog.f("%s: Error getting editor", f16012e);
                    return false;
                }
                dVarA.a(bArrDecode);
                dVarA.a();
                return true;
            }
            IAlog.f("%s: Invalid content", f16012e);
            return false;
        } catch (IOException | IllegalArgumentException e10) {
            IAlog.f("%s: Error writing cache: ", f16012e, e10);
            return false;
        }
    }
}
