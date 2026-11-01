package com.bytedance.sdk.component.adexpress.vt;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class le implements tlj {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private mwh f11591lh;
    public ouw ouw;
    private Context vt;

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj
    public final void ouw() {
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj
    public final boolean ouw(final tlj.ouw ouwVar) {
        this.f11591lh.vt.ra();
        this.ouw.ouw(new ra() { // from class: com.bytedance.sdk.component.adexpress.vt.le.1
            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(View view, jg jgVar) {
                if (ouwVar.yu()) {
                    return;
                }
                ko koVarVt = ouwVar.vt();
                if (koVarVt != null) {
                    koVarVt.ouw(le.this.ouw, jgVar);
                }
                ouwVar.lh();
            }

            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(int i10, String str) {
                ko koVarVt = ouwVar.vt();
                if (koVarVt != null) {
                    koVarVt.a_(i10);
                }
            }
        });
        return true;
    }

    public le(Context context, mwh mwhVar, ouw ouwVar) {
        this.vt = context;
        this.ouw = ouwVar;
        this.f11591lh = mwhVar;
    }
}
