package com.bytedance.sdk.component.adexpress.vt;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* JADX INFO: loaded from: classes6.dex */
public final class vt implements tlj {
    private ThemeStatusBroadcastReceiver fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private pno f11622le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f11623lh;
    public com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw ouw;
    public mwh vt;
    private Context yu;

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj
    public final boolean ouw(final tlj.ouw ouwVar) {
        this.vt.vt.ouw(this.f11623lh);
        this.ouw.ouw(new ra() { // from class: com.bytedance.sdk.component.adexpress.vt.vt.1
            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(View view, jg jgVar) {
                if (ouwVar.yu()) {
                    return;
                }
                vt vtVar = vt.this;
                vtVar.vt.vt.fkw(vtVar.f11623lh);
                vt vtVar2 = vt.this;
                vtVar2.vt.vt.le(vtVar2.f11623lh);
                vt.this.vt.vt.cf();
                ko koVarVt = ouwVar.vt();
                if (koVarVt == null) {
                    return;
                }
                koVarVt.ouw(vt.this.ouw, jgVar);
                ouwVar.lh();
            }

            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(int i10, String str) {
                vt vtVar = vt.this;
                vtVar.vt.vt.ouw(vtVar.f11623lh, i10, str, ouwVar.vt(vtVar));
                if (ouwVar.vt(vt.this)) {
                    ouwVar.ouw(vt.this);
                    return;
                }
                ko koVarVt = ouwVar.vt();
                if (koVarVt == null) {
                    return;
                }
                koVarVt.a_(i10);
            }
        });
        return true;
    }

    public final com.bytedance.sdk.component.adexpress.dynamic.yu vt() {
        com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            return ouwVar.ouw;
        }
        return null;
    }

    public vt(Context context, mwh mwhVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, pno pnoVar, com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw ouwVar) {
        this.yu = context;
        this.vt = mwhVar;
        this.fkw = themeStatusBroadcastReceiver;
        this.f11622le = pnoVar;
        this.ouw = ouwVar;
        ouwVar.vt = pnoVar;
        this.f11623lh = 3;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj
    public final void ouw() {
        com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.ouw();
        }
    }
}
