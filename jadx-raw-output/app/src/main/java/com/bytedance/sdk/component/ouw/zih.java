package com.bytedance.sdk.component.ouw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zih<K, V> {
    public final Map<K, V> ouw = new HashMap();
    public final Map<V, Set<K>> vt = new HashMap();

    public final void ouw() {
        this.ouw.clear();
        this.vt.clear();
    }
}
