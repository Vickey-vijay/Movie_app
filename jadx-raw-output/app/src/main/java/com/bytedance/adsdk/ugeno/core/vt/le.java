package com.bytedance.adsdk.ugeno.core.vt;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.ko;
import com.bytedance.adsdk.ugeno.core.mwh;
import com.bytedance.adsdk.ugeno.ra.pno;

/* JADX INFO: loaded from: classes2.dex */
public final class le implements pno.ouw {
    public com.bytedance.adsdk.ugeno.vt.lh fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public Handler f10838le = new pno(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public ko f10839lh;
    public boolean ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private Context f10840ra;
    public int vt;
    public mwh yu;

    @Override // com.bytedance.adsdk.ugeno.ra.pno.ouw
    public final void ouw(Message message) {
        if (message.what != 1001) {
            return;
        }
        ko koVar = this.f10839lh;
        if (koVar != null) {
            koVar.ouw(this.yu, this.fkw);
        }
        if (this.ouw) {
            this.f10838le.sendEmptyMessageDelayed(1001, this.vt);
        } else {
            this.f10838le.removeMessages(1001);
        }
    }

    public le(Context context, mwh mwhVar, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        this.f10840ra = context;
        this.yu = mwhVar;
        this.fkw = lhVar;
    }
}
