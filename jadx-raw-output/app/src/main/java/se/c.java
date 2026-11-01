package se;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.util.Log;

/* JADX INFO: compiled from: InactivityTimer.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f67236e = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f67237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f67238b = new C0645c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f67239c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AsyncTask<Object, Object, Object> f67240d;

    public final synchronized void d() {
        AsyncTask<Object, Object, Object> asyncTask = this.f67240d;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.f67240d = null;
        }
    }

    @SuppressLint({"NewApi"})
    public synchronized void e() {
        d();
        b bVar = new b();
        this.f67240d = bVar;
        bVar.execute(new Object[0]);
    }

    public synchronized void f() {
        d();
        if (this.f67239c) {
            this.f67237a.unregisterReceiver(this.f67238b);
            this.f67239c = false;
        } else {
            Log.w(f67236e, "PowerStatusReceiver was never registered?");
        }
    }

    public synchronized void g() {
        if (this.f67239c) {
            Log.w(f67236e, "PowerStatusReceiver was already registered?");
        } else {
            this.f67237a.registerReceiver(this.f67238b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f67239c = true;
        }
        e();
    }

    /* JADX INFO: compiled from: InactivityTimer.java */
    public final class b extends AsyncTask<Object, Object, Object> {
        public b() {
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(300000L);
                Log.i(c.f67236e, "Finishing activity due to inactivity");
                c.this.f67237a.finish();
                return null;
            } catch (InterruptedException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: se.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: InactivityTimer.java */
    public final class C0645c extends BroadcastReceiver {
        public C0645c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z10;
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                if (intent.getIntExtra("plugged", -1) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    c.this.d();
                } else {
                    c.this.e();
                }
            }
        }
    }

    public c(Activity activity) {
        this.f67237a = activity;
        e();
    }

    public void h() {
        d();
    }
}
