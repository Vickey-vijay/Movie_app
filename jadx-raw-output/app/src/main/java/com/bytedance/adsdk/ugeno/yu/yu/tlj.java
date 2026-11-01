package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class tlj extends lh implements com.bytedance.adsdk.ugeno.ra.pno.ouw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f11073cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private int f11074jg;
    private Handler mwh;
    private int ryl;

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        Map<String, String> map = this.fkw;
        if (map != null) {
            int iOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(map.get("loop"), 0);
            this.f11073cf = iOuw;
            if (iOuw <= 0) {
                this.f11074jg = -1;
            } else {
                this.f11074jg = iOuw;
            }
            this.ryl = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("duration"), 0);
        }
        this.mwh.sendEmptyMessageDelayed(1001, this.ryl);
        return true;
    }

    public tlj(Context context) {
        super(context);
        this.ryl = 0;
        this.mwh = new com.bytedance.adsdk.ugeno.ra.pno(Looper.getMainLooper(), this);
        this.f11074jg = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.ra.pno.ouw
    public final void ouw(Message message) {
        int i10;
        int i11;
        if (message.what != 1001) {
            return;
        }
        Log.d("UGBaseEventMonitor", "handleMsg: execute timer event" + this.f11074jg);
        this.ouw.ouw(this.f11068le, this.f11069lh.vt);
        int i12 = this.f11074jg + (-1);
        this.f11074jg = i12;
        if (i12 < 0 && (i11 = this.ryl) != 0) {
            this.mwh.sendEmptyMessageDelayed(1001, i11);
        } else if (i12 > 0 && (i10 = this.ryl) != 0) {
            this.mwh.sendEmptyMessageDelayed(1001, i10);
        } else {
            this.mwh.removeMessages(1001);
        }
    }
}
