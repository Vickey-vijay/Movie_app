package com.bytedance.sdk.openadsdk.core.mwh.lh;

import com.bytedance.sdk.component.utils.ra;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lh extends com.bytedance.sdk.openadsdk.vt.vt {
    public lh(byte b10) {
        super(10, 8);
    }

    public lh() {
        super(5, 5);
        this.ouw = true;
    }

    @Override // com.bytedance.sdk.openadsdk.vt.vt, com.bytedance.sdk.openadsdk.vt.ouw
    public final void ouw(List<File> list) {
        int size = list.size();
        if (!ouw(size)) {
            Iterator<File> it = list.iterator();
            while (it.hasNext()) {
                ra.lh(it.next());
                size--;
                if (vt(size)) {
                    return;
                }
            }
        }
    }
}
