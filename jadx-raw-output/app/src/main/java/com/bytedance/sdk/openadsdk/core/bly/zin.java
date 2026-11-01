package com.bytedance.sdk.openadsdk.core.bly;

import android.view.View;
import com.bytedance.sdk.openadsdk.utils.bs;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class zin extends com.bytedance.sdk.component.adexpress.vt.ouw<ouw> {
    public final com.bytedance.sdk.component.adexpress.vt.mwh fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public AtomicBoolean f12576le = new AtomicBoolean(false);

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.component.adexpress.vt.lh f12577lh;
    public ouw ouw;
    public final View vt;
    public com.bytedance.sdk.component.adexpress.vt.ra yu;

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.ra raVar) {
        this.yu = raVar;
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.zin.1
            @Override // java.lang.Runnable
            public final void run() {
                zin zinVar = zin.this;
                if (zinVar.f12576le.get()) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.vt.lh lhVar = zinVar.f12577lh;
                if (!(lhVar != null && lhVar.ouw((qbp) zinVar.vt))) {
                    zinVar.yu.ouw(107, "backup false");
                    return;
                }
                zinVar.fkw.vt.pno();
                ouw ouwVar = (ouw) zinVar.vt.findViewWithTag("tt_express_backup_fl_tag_26");
                zinVar.ouw = ouwVar;
                if (ouwVar == null) {
                    zinVar.yu.ouw(107, "backupview is null");
                    return;
                }
                com.bytedance.sdk.component.adexpress.vt.jg jgVar = new com.bytedance.sdk.component.adexpress.vt.jg();
                ouw ouwVar2 = zinVar.ouw;
                float realWidth = ouwVar2 == null ? 0.0f : ouwVar2.getRealWidth();
                ouw ouwVar3 = zinVar.ouw;
                float realHeight = ouwVar3 != null ? ouwVar3.getRealHeight() : 0.0f;
                jgVar.vt = true;
                jgVar.f11588lh = realWidth;
                jgVar.yu = realHeight;
                zinVar.yu.ouw(zinVar.ouw, jgVar);
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public final /* bridge */ /* synthetic */ View lh() {
        return this.ouw;
    }

    public zin(View view, com.bytedance.sdk.component.adexpress.vt.mwh mwhVar) {
        this.vt = view;
        this.fkw = mwhVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.ouw
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.lh lhVar) {
        this.f12577lh = lhVar;
    }
}
