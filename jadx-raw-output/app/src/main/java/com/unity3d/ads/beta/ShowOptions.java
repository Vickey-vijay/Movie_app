package com.unity3d.ads.beta;

import ck.i;
import ck.p;
import java.util.Map;
import kotlin.collections.a;

/* JADX INFO: compiled from: ShowOptions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ShowOptions {
    private final Map<String, String> extras;

    /* JADX WARN: Multi-variable type inference failed */
    public ShowOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ShowOptions(Map<String, String> map) {
        p.j(map, "extras");
        this.extras = map;
    }

    public /* synthetic */ ShowOptions(Map map, int i10, i iVar) {
        this((i10 & 1) != 0 ? a.j() : map);
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }
}
