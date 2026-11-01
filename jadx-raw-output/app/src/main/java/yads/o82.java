package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class o82 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static o82 f80967e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f80968a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f80969b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f80970c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80971d = 0;

    public static int b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (type == 9) {
                    return 7;
                }
                if (type != 4 && type != 5) {
                    return type != 6 ? 8 : 5;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                    return 3;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                case 17:
                    return 4;
                case 13:
                    return 5;
                case 16:
                case 19:
                default:
                    return 6;
                case 18:
                    return 2;
                case 20:
                    return ib3.f78556a >= 29 ? 9 : 0;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public final int a() {
        int i10;
        synchronized (this.f80970c) {
            i10 = this.f80971d;
        }
        return i10;
    }

    public o82(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new n82(this), intentFilter);
    }

    public final /* synthetic */ void a(m82 m82Var) {
        m82Var.a(a());
    }

    public final void a(int i10) {
        synchronized (this.f80970c) {
            if (this.f80971d == i10) {
                return;
            }
            this.f80971d = i10;
            for (WeakReference weakReference : this.f80969b) {
                m82 m82Var = (m82) weakReference.get();
                if (m82Var != null) {
                    m82Var.a(i10);
                } else {
                    this.f80969b.remove(weakReference);
                }
            }
        }
    }

    public final void b(final m82 m82Var) {
        for (WeakReference weakReference : this.f80969b) {
            if (weakReference.get() == null) {
                this.f80969b.remove(weakReference);
            }
        }
        this.f80969b.add(new WeakReference(m82Var));
        this.f80968a.post(new Runnable() { // from class: cp.g7
            @Override // java.lang.Runnable
            public final void run() {
                this.f51344b.a(m82Var);
            }
        });
    }

    public static synchronized o82 a(Context context) {
        if (f80967e == null) {
            f80967e = new o82(context);
        }
        return f80967e;
    }
}
