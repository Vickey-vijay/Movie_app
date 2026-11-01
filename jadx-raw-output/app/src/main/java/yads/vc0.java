package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class vc0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f83876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc0 f83877b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc0(zc0 zc0Var, Looper looper) {
        super(looper);
        this.f83877b = zc0Var;
    }

    public final boolean a(Message message, hl1 hl1Var) {
        long jMin;
        wc0 wc0Var = (wc0) message.obj;
        if (!wc0Var.f84156b) {
            return false;
        }
        int i10 = wc0Var.f84158d + 1;
        wc0Var.f84158d = i10;
        if (i10 > this.f83877b.f85324j.a(3)) {
            return false;
        }
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        Throwable yc0Var = hl1Var.getCause() instanceof IOException ? (IOException) hl1Var.getCause() : new yc0(hl1Var.getCause());
        ae0 ae0Var = this.f83877b.f85324j;
        int i11 = wc0Var.f84158d;
        ae0Var.getClass();
        if (!(yc0Var instanceof ob2) && !(yc0Var instanceof FileNotFoundException) && !(yc0Var instanceof p11) && !(yc0Var instanceof eg1)) {
            int i12 = q30.f81691c;
            while (true) {
                if (yc0Var == null) {
                    jMin = Math.min((i11 - 1) * 1000, 5000);
                    break;
                }
                if ((yc0Var instanceof q30) && ((q30) yc0Var).f81692b == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                yc0Var = yc0Var.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        if (jMin == -9223372036854775807L) {
            return false;
        }
        synchronized (this) {
            if (this.f83876a) {
                return false;
            }
            sendMessageDelayed(Message.obtain(message), jMin);
            return true;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object objA;
        wc0 wc0Var = (wc0) message.obj;
        try {
            int i10 = message.what;
            if (i10 == 0) {
                objA = this.f83877b.f85326l.a((nn0) wc0Var.f84157c);
            } else {
                if (i10 != 1) {
                    throw new RuntimeException();
                }
                zc0 zc0Var = this.f83877b;
                objA = zc0Var.f85326l.a(zc0Var.f85327m, (kn0) wc0Var.f84157c);
            }
        } catch (hl1 e10) {
            boolean zA = a(message, e10);
            objA = e10;
            if (zA) {
                return;
            }
        } catch (Exception e11) {
            ih1.d("DefaultDrmSession", ih1.a("Key/provisioning request produced an unexpected exception. Not retrying.", e11));
            objA = e11;
        }
        ae0 ae0Var = this.f83877b.f85324j;
        long j10 = wc0Var.f84155a;
        ae0Var.getClass();
        synchronized (this) {
            if (!this.f83876a) {
                this.f83877b.f85328n.obtainMessage(message.what, Pair.create(wc0Var.f84157c, objA)).sendToTarget();
            }
        }
    }
}
