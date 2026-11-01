package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f17800a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f17801b;

    public final synchronized Map a() {
        if (this.f17801b == null) {
            this.f17801b = Collections.unmodifiableMap(new HashMap(this.f17800a));
        }
        return this.f17801b;
    }
}
