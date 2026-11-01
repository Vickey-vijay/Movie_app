package com.unity3d.ads;

import ck.i;
import ck.p;
import java.util.Map;
import kotlin.collections.a;

/* JADX INFO: compiled from: TokenConfiguration.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class TokenConfiguration {
    private final AdFormat adFormat;
    private final Map<String, String> extras;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TokenConfiguration(AdFormat adFormat) {
        this(adFormat, null, 2, 0 == true ? 1 : 0);
        p.j(adFormat, "adFormat");
    }

    public TokenConfiguration(AdFormat adFormat, Map<String, String> map) {
        p.j(adFormat, "adFormat");
        p.j(map, "extras");
        this.adFormat = adFormat;
        this.extras = map;
    }

    public final AdFormat getAdFormat() {
        return this.adFormat;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public /* synthetic */ TokenConfiguration(AdFormat adFormat, Map map, int i10, i iVar) {
        this(adFormat, (i10 & 2) != 0 ? a.j() : map);
    }
}
