package com.bytedance.adsdk.ugeno.ouw;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class le {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private Context f10906lh;
    public List<ouw> ouw;
    private List<lh> vt;
    private com.bytedance.adsdk.ugeno.vt.lh yu;

    public final void ouw() {
        List<ouw> list = this.ouw;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ouw ouwVar : this.ouw) {
            if (ouwVar != null) {
                ouwVar.lh();
            }
        }
    }

    private void vt() {
        this.ouw = new ArrayList();
        List<lh> list = this.vt;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.vt.size(); i10++) {
            lh lhVar = this.vt.get(i10);
            if (lhVar != null) {
                this.ouw.add(new ouw(this.f10906lh, this.yu, lhVar));
            }
        }
    }

    public le(Context context, com.bytedance.adsdk.ugeno.vt.lh lhVar, List<lh> list) {
        this.yu = lhVar;
        this.f10906lh = context;
        this.vt = list;
        vt();
    }

    public final ouw ouw(String str) {
        List<ouw> list = this.ouw;
        if (list != null && !list.isEmpty()) {
            for (ouw ouwVar : this.ouw) {
                if (ouwVar != null && TextUtils.equals(ouwVar.vt, str)) {
                    return ouwVar;
                }
            }
        }
        return null;
    }
}
