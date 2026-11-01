package com.bytedance.sdk.openadsdk.tc.vt;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.qbp;

/* JADX INFO: loaded from: classes6.dex */
public class ra {
    private static ouw ouw;
    private static HandlerThread vt;

    public static class ouw extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            vt vtVar = (vt) message.obj;
            if (vtVar == null) {
                return;
            }
            int iVt = vtVar.vt();
            if (iVt == 1) {
                vtVar.le();
            } else {
                if (iVt != 2) {
                    fkw.vt(vtVar.fkw);
                    return;
                }
                vtVar.ra();
            }
            if (vtVar.ouw.get()) {
                fkw.vt(vtVar.fkw);
            } else if (vtVar.bly()) {
                ouw(vtVar);
            }
        }

        public final void ouw(vt vtVar) {
            if (vtVar == null) {
                return;
            }
            int iIntValue = vtVar.fkw.intValue();
            if (hasMessages(iIntValue)) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = iIntValue;
            messageObtain.obj = vtVar;
            sendMessageDelayed(messageObtain, vtVar.fkw());
        }

        public ouw(Looper looper) {
            super(looper);
        }
    }

    public static void ouw() {
    }

    public static void vt(vt vtVar) {
        if (ouw != null) {
            try {
                int iIntValue = vtVar.fkw.intValue();
                if (ouw.hasMessages(iIntValue)) {
                    ouw.removeMessages(iIntValue);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void ouw(vt vtVar) {
        vt();
        ouw ouwVar = ouw;
        if (ouwVar != null) {
            ouwVar.ouw(vtVar);
        }
    }

    public static void vt() {
        if (ouw != null) {
            return;
        }
        try {
            HandlerThread handlerThread = vt;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (ra.class) {
                HandlerThread handlerThread2 = vt;
                if (handlerThread2 == null || !handlerThread2.isAlive()) {
                    vt = com.bytedance.sdk.component.utils.pno.ouw("csj_MRC", 0);
                    ouw = new ouw(vt.getLooper());
                }
            }
        } catch (Throwable th2) {
            qbp.lh("MRC", th2.getMessage());
        }
    }
}
