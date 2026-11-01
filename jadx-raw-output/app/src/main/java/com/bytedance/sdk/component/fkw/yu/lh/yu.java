package com.bytedance.sdk.component.fkw.yu.lh;

import com.bytedance.sdk.component.fkw.cf;
import com.bytedance.sdk.component.fkw.ra;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class yu<T> implements cf {
    private boolean bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f11769cf;
    private int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f11770le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private T f11771lh;
    private String ouw;
    private boolean pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private Map<String, String> f11772ra;
    private ra tlj;
    private String vt;
    private T yu;

    private yu ouw(lh lhVar, T t10) {
        this.f11771lh = t10;
        this.ouw = lhVar.vt;
        this.vt = lhVar.ouw;
        this.fkw = lhVar.f11743ra;
        this.f11770le = lhVar.pno;
        this.bly = lhVar.zih;
        this.tlj = lhVar.f11747vm;
        this.f11769cf = lhVar.f11746th;
        return this;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final boolean fkw() {
        return this.pno;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final boolean le() {
        return this.bly;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final T lh() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final int ra() {
        return this.f11769cf;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final T vt() {
        return this.f11771lh;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final Map<String, String> yu() {
        return this.f11772ra;
    }

    public final yu ouw(lh lhVar, T t10, Map<String, String> map, boolean z10) {
        this.f11772ra = map;
        this.pno = z10;
        return ouw(lhVar, t10);
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final String ouw() {
        return this.vt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.fkw.cf
    public final void ouw(Object obj) {
        this.yu = this.f11771lh;
        this.f11771lh = obj;
    }
}
