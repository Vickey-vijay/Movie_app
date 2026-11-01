package com.bytedance.adsdk.vt.lh.ouw;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
abstract class jg<V, O> implements mwh<V, O> {
    public final List<com.bytedance.adsdk.vt.ra.ouw<V>> ouw;

    @Override // com.bytedance.adsdk.vt.lh.ouw.mwh
    public List<com.bytedance.adsdk.vt.ra.ouw<V>> lh() {
        return this.ouw;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.ouw.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.ouw.toArray()));
        }
        return sb2.toString();
    }

    @Override // com.bytedance.adsdk.vt.lh.ouw.mwh
    public boolean vt() {
        return this.ouw.isEmpty() || (this.ouw.size() == 1 && this.ouw.get(0).yu());
    }

    public jg(List<com.bytedance.adsdk.vt.ra.ouw<V>> list) {
        this.ouw = list;
    }
}
