package com.bytedance.sdk.component.fkw.lh;

import com.bytedance.sdk.component.fkw.cf;
import com.bytedance.sdk.component.fkw.ra;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class yu<T> implements cf {
    private boolean bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f11720cf;
    private int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f11721le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private T f11722lh;
    private String ouw;
    private boolean pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private Map<String, String> f11723ra;
    private ra tlj;
    private String vt;
    private T yu;

    public final yu ouw(lh lhVar, T t10, Map<String, String> map, boolean z10) {
        this.f11723ra = map;
        this.pno = z10;
        this.f11722lh = t10;
        this.ouw = lhVar.vt;
        this.vt = lhVar.ouw;
        this.fkw = lhVar.f11681ra;
        this.f11721le = lhVar.pno;
        this.bly = lhVar.qbp;
        this.tlj = lhVar.zin;
        this.f11720cf = lhVar.vpp;
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
        return this.f11720cf;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final T vt() {
        return this.f11722lh;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final Map<String, String> yu() {
        return this.f11723ra;
    }

    @Override // com.bytedance.sdk.component.fkw.cf
    public final String ouw() {
        return this.vt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.fkw.cf
    public final void ouw(Object obj) {
        this.yu = this.f11722lh;
        this.f11722lh = obj;
    }
}
