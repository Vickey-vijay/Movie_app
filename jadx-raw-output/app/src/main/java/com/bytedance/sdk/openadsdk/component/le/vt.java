package com.bytedance.sdk.openadsdk.component.le;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public final class vt implements Handler.Callback {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private long f12280cf;
    private final com.bytedance.sdk.openadsdk.component.pno.ouw fkw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private boolean f12283ra;
    private boolean ryl;
    private long tlj;
    public ouw vt;
    public Handler ouw = new Handler(Looper.myLooper(), this);

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f12281le = 0;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f12282lh = 5;
    public int yu = 0;
    private final int pno = 1000;
    private int bly = 1000;

    public final void ouw() {
        if (this.ouw != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = this.f12281le;
            this.ouw.sendMessage(messageObtain);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        int i10;
        if (message.what == 100 && this.ouw != null) {
            int i11 = message.arg1;
            this.f12281le = i11;
            int i12 = this.f12282lh - i11;
            this.fkw.vt = i12;
            if (i11 <= 0) {
                ouw ouwVar = this.vt;
                if (ouwVar != null && !this.f12283ra) {
                    ouwVar.yu();
                    this.f12283ra = true;
                }
                i10 = 0;
            } else {
                i10 = i11;
            }
            ouw ouwVar2 = this.vt;
            if (ouwVar2 != null) {
                int i13 = this.yu;
                ouwVar2.ouw(i13 - i12, i10 == 0 || i12 >= i13);
            }
            if (i11 > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i11 - 1;
                this.ouw.sendMessageDelayed(messageObtain, this.bly);
            }
        }
        return true;
    }

    public final void vt() {
        Handler handler = this.ouw;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public vt(com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar) {
        this.fkw = ouwVar;
    }

    public final void ouw(int i10, float f10, boolean z10) {
        com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar;
        if ((i10 == 1 || i10 == 2) && this.ryl != z10) {
            this.ryl = z10;
            if (i10 == 1 && (ouwVar = this.fkw) != null) {
                ouwVar.f12298lh = z10;
            }
            if (z10) {
                try {
                    this.bly = (int) (1000.0f / f10);
                    this.f12280cf = System.currentTimeMillis();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                long jCurrentTimeMillis = this.tlj + (System.currentTimeMillis() - this.f12280cf);
                this.tlj = jCurrentTimeMillis;
                com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar2 = this.fkw;
                if (ouwVar2 != null) {
                    ouwVar2.yu = jCurrentTimeMillis;
                }
            }
            this.bly = 1000;
        }
    }
}
