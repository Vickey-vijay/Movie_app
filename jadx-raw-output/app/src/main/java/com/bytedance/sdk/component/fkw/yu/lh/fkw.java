package com.bytedance.sdk.component.fkw.yu.lh;

import com.bytedance.sdk.component.fkw.mwh;
import com.bytedance.sdk.component.fkw.qbp;
import com.bytedance.sdk.component.fkw.ryl;
import com.bytedance.sdk.component.fkw.vm;
import com.bytedance.sdk.component.fkw.zih;
import com.bytedance.sdk.component.fkw.zin;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes9.dex */
public final class fkw implements mwh {
    private zin bly;
    private vm fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.component.fkw.lh f11727le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.component.fkw.yu f11728lh;
    private ryl ouw;
    private qbp pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private com.bytedance.sdk.component.fkw.vt f11729ra;
    private boolean tlj;
    private ExecutorService vt;
    private zih yu;

    public static class ouw {
        public zin bly;
        public vm fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public com.bytedance.sdk.component.fkw.lh f11730le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public com.bytedance.sdk.component.fkw.yu f11731lh;
        public ryl ouw;
        public qbp pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public com.bytedance.sdk.component.fkw.vt f11732ra;
        public boolean tlj;
        public ExecutorService vt;
        public zih yu;
    }

    public /* synthetic */ fkw(ouw ouwVar, byte b10) {
        this(ouwVar);
    }

    private fkw(ouw ouwVar) {
        this.ouw = ouwVar.ouw;
        this.vt = ouwVar.vt;
        this.f11728lh = ouwVar.f11731lh;
        this.yu = ouwVar.yu;
        this.fkw = ouwVar.fkw;
        this.f11727le = ouwVar.f11730le;
        this.f11729ra = ouwVar.f11732ra;
        this.pno = ouwVar.pno;
        this.bly = ouwVar.bly;
        this.tlj = ouwVar.tlj;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final zin bly() {
        return this.bly;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final zih fkw() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final vm le() {
        return this.fkw;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final qbp lh() {
        return this.pno;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final ryl ouw() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final com.bytedance.sdk.component.fkw.vt pno() {
        return this.f11729ra;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final com.bytedance.sdk.component.fkw.lh ra() {
        return this.f11727le;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final boolean tlj() {
        return this.tlj;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final ExecutorService vt() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.fkw.mwh
    public final com.bytedance.sdk.component.fkw.yu yu() {
        return this.f11728lh;
    }
}
