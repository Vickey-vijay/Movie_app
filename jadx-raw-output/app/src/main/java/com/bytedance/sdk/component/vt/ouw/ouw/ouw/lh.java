package com.bytedance.sdk.component.vt.ouw.ouw.ouw;

import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.ryl;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class lh implements com.bytedance.sdk.component.vt.ouw.pno.ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f11944lh = 0;
    public List<com.bytedance.sdk.component.vt.ouw.pno> ouw;
    public ryl vt;

    @Override // com.bytedance.sdk.component.vt.ouw.pno.ouw
    public final ryl ouw() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.pno.ouw
    public final jg ouw(ryl rylVar) throws IOException {
        this.vt = rylVar;
        int i10 = this.f11944lh + 1;
        this.f11944lh = i10;
        if (i10 >= this.ouw.size()) {
            return null;
        }
        return this.ouw.get(this.f11944lh).ouw(this);
    }

    public lh(List<com.bytedance.sdk.component.vt.ouw.pno> list, ryl rylVar) {
        this.ouw = list;
        this.vt = rylVar;
    }
}
