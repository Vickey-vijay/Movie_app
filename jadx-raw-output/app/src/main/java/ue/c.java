package ue;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ReaderException;
import com.yzq.zxinglibrary.android.CaptureActivity;
import java.util.Map;
import y5.i;

/* JADX INFO: compiled from: DecodeHandler.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c extends Handler {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f72839d = c.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureActivity f72840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y5.e f72841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f72842c = true;

    public final void a(byte[] bArr, int i10, int i11) {
        i iVarC;
        byte[] bArr2 = new byte[bArr.length];
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                bArr2[(((i13 * i11) + i11) - i12) - 1] = bArr[(i12 * i10) + i13];
            }
        }
        y5.g gVarA = this.f72840a.getCameraManager().a(bArr2, i11, i10);
        if (gVarA != null) {
            try {
                iVarC = this.f72841b.c(new y5.b(new c6.i(gVarA)));
                this.f72841b.reset();
            } catch (ReaderException unused) {
                this.f72841b.reset();
                iVarC = null;
            } catch (Throwable th2) {
                this.f72841b.reset();
                throw th2;
            }
        } else {
            iVarC = null;
        }
        Handler handler = this.f72840a.getHandler();
        if (iVarC != null) {
            if (handler != null) {
                Message.obtain(handler, 3, iVarC).sendToTarget();
            }
        } else if (handler != null) {
            Message.obtain(handler, 2).sendToTarget();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (this.f72842c) {
            int i10 = message.what;
            if (i10 == 1) {
                a((byte[]) message.obj, message.arg1, message.arg2);
            } else {
                if (i10 != 5) {
                    return;
                }
                this.f72842c = false;
                Looper.myLooper().quit();
            }
        }
    }

    public c(CaptureActivity captureActivity, Map<DecodeHintType, Object> map) {
        y5.e eVar = new y5.e();
        this.f72841b = eVar;
        eVar.d(map);
        this.f72840a = captureActivity;
    }
}
