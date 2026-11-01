package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vt extends com.bytedance.sdk.component.pno.pno {
    private final List<? extends com.bytedance.sdk.component.pno.pno> ouw;

    public vt(String str, List<? extends com.bytedance.sdk.component.pno.pno> list) {
        super(str);
        this.ouw = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<? extends com.bytedance.sdk.component.pno.pno> list;
        if (ksc.ouw(zih.ouw(), 60000L) != 0 && (list = this.ouw) != null) {
            Iterator<? extends com.bytedance.sdk.component.pno.pno> it = list.iterator();
            while (it.hasNext()) {
                bs.ouw(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.bly.ouw().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
