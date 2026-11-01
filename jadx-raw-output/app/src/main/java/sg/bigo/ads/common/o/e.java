package sg.bigo.ads.common.o;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
class e implements ServiceConnection, IBinder.DeathRecipient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e f69800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f69801d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f69804e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f69803b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockingQueue<IBinder> f69802a = new LinkedBlockingQueue(1);

    private e(Context context) {
        this.f69804e = context;
    }

    public static e a(Context context) {
        if (f69800c == null) {
            synchronized (e.class) {
                if (f69800c == null) {
                    f69800c = new e(context);
                }
            }
        }
        return f69800c;
    }

    private void a(IBinder iBinder) {
        try {
            synchronized (f69801d) {
                this.f69802a.clear();
                this.f69802a.add(iBinder);
            }
        } catch (Exception unused) {
        }
    }

    private void b() {
        try {
            synchronized (f69801d) {
                this.f69802a.clear();
            }
        } catch (Exception unused) {
        }
    }

    public final f a(long j10, TimeUnit timeUnit) {
        try {
            IBinder iBinderPoll = this.f69802a.poll(j10, timeUnit);
            if (iBinderPoll == null) {
                return null;
            }
            a(iBinderPoll);
            return f.a.a(iBinderPoll);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final synchronized void a() {
        if (this.f69803b) {
            try {
                this.f69803b = false;
                b();
                this.f69804e.unbindService(this);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a(iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        b();
    }
}
