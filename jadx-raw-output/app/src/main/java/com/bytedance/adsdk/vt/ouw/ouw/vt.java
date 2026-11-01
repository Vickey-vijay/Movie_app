package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vt {
    private final List<zin> ouw = new ArrayList();

    public final void ouw(zin zinVar) {
        this.ouw.add(zinVar);
    }

    public final void ouw(Path path) {
        for (int size = this.ouw.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.vt.le.pno.ouw(path, this.ouw.get(size));
        }
    }
}
