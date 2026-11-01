package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: renamed from: com.inmobi.media.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3073o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24951a = C3073o4.class.getSimpleName();

    public final C2965jl a(C2872g2 c2872g2, C3023m4 c3023m4) {
        Integer num;
        ck.p.j(c2872g2, "configResponseObj");
        ck.p.j(c3023m4, "configRequestContext");
        int iB = c2872g2.b();
        Config config = c3023m4.f24802b;
        if (iB == 200) {
            try {
                Config configA = c2872g2.a();
                if (configA == null) {
                    ck.p.i(this.f24951a, "tag");
                    num = 3;
                } else if (configA.isValid()) {
                    num = null;
                } else {
                    ck.p.i(this.f24951a, "tag");
                    num = 4;
                }
                if (num != null) {
                    iB = num.intValue();
                } else {
                    if (configA == null) {
                        throw new IllegalArgumentException("Config object is null");
                    }
                    config = configA;
                }
            } catch (IllegalArgumentException unused) {
                iB = 2;
            }
        } else if (iB != 304) {
            ck.p.i(this.f24951a, "tag");
            iB += 1000;
        } else {
            ck.p.i(this.f24951a, "tag");
            c3023m4.f24802b.getType();
        }
        return new C2965jl(iB, config);
    }
}
