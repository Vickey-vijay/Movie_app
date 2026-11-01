package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import io.bidmachine.protobuf.EventTypeExtended;

/* JADX INFO: loaded from: classes2.dex */
public final class ryl extends lh implements com.bytedance.adsdk.ugeno.ra.pno.ouw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f11072cf;
    private Handler ryl;

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            MotionEvent motionEvent = (MotionEvent) objArr[0];
            this.f11072cf = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("delay"), 500);
            int action = motionEvent.getAction();
            if (action == 0) {
                this.ryl.sendEmptyMessageDelayed(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE, this.f11072cf);
            } else if (action == 1 || action == 3) {
                this.ryl.removeMessages(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE);
            }
        }
        return false;
    }

    public ryl(Context context) {
        super(context);
        this.f11072cf = 500;
        this.ryl = new com.bytedance.adsdk.ugeno.ra.pno(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.adsdk.ugeno.ra.pno.ouw
    public final void ouw(Message message) {
        if (message.what != 1101) {
            return;
        }
        com.bytedance.adsdk.ugeno.yu.cf cfVar = this.ouw;
        if (cfVar != null) {
            cfVar.ouw(this.f11068le, this.f11069lh.vt);
        }
        Handler handler = this.ryl;
        if (handler != null) {
            handler.removeMessages(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE);
        }
    }
}
