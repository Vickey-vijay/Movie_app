package com.bytedance.sdk.component.fkw.vt;

import com.bytedance.sdk.component.fkw.le;
import com.bytedance.sdk.component.fkw.ra;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class lh<T> implements le {
    private String fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f11724lh;
    public Map<String, String> ouw;
    public ra vt;
    private T yu;

    public lh(int i10, T t10, String str) {
        this.f11724lh = i10;
        this.yu = t10;
        this.fkw = str;
    }

    @Override // com.bytedance.sdk.component.fkw.le
    public final Map<String, String> fkw() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.fkw.le
    public final T lh() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.component.fkw.le
    public final ra ouw() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.fkw.le
    public final int vt() {
        return this.f11724lh;
    }

    @Override // com.bytedance.sdk.component.fkw.le
    public final String yu() {
        return this.fkw;
    }

    public lh(int i10, T t10, String str, Map<String, String> map) {
        this(i10, t10, str);
        this.ouw = map;
    }
}
