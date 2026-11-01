package com.bytedance.sdk.component.adexpress.vt;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class ryl implements tlj.ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private bly f11621lh;
    public ko ouw;

    @NonNull
    private List<tlj> vt;
    private AtomicBoolean yu = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj.ouw
    public final void ouw() {
        this.f11621lh.yu();
        Iterator<tlj> it = this.vt.iterator();
        if (it.hasNext()) {
            it.next().ouw(this);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj.ouw
    public final boolean vt(tlj tljVar) {
        int iIndexOf = this.vt.indexOf(tljVar);
        return iIndexOf < this.vt.size() - 1 && iIndexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj.ouw
    public final void lh() {
        this.yu.getAndSet(true);
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj.ouw
    public final boolean yu() {
        return this.yu.get();
    }

    public ryl(List<tlj> list, bly blyVar) {
        this.vt = list;
        this.f11621lh = blyVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj.ouw
    public final ko vt() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj.ouw
    public final void ouw(tlj tljVar) {
        int i10;
        int iIndexOf = this.vt.indexOf(tljVar);
        if (iIndexOf >= 0 && (i10 = iIndexOf + 1) < this.vt.size()) {
            this.vt.get(i10).ouw(this);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj.ouw
    public final void ouw(ko koVar) {
        this.ouw = koVar;
    }
}
