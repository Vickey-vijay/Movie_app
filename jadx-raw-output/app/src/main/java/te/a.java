package te;

import android.annotation.SuppressLint;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: AutoFocusManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements Camera.AutoFocusCallback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f72344f = a.class.getSimpleName();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Collection<String> f72345g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f72346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f72347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f72348c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Camera f72349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AsyncTask<?, ?, ?> f72350e;

    /* JADX INFO: compiled from: AutoFocusManager.java */
    public final class b extends AsyncTask<Object, Object, Object> {
        public b() {
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
            a.this.c();
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    public final synchronized void a() {
        if (!this.f72346a && this.f72350e == null) {
            b bVar = new b();
            try {
                bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                this.f72350e = bVar;
            } catch (RejectedExecutionException e10) {
                Log.w(f72344f, "Could not request auto focus", e10);
            }
        }
    }

    public final synchronized void b() {
        AsyncTask<?, ?, ?> asyncTask = this.f72350e;
        if (asyncTask != null) {
            if (asyncTask.getStatus() != AsyncTask.Status.FINISHED) {
                this.f72350e.cancel(true);
            }
            this.f72350e = null;
        }
    }

    public synchronized void c() {
        if (this.f72348c) {
            this.f72350e = null;
            if (!this.f72346a && !this.f72347b) {
                try {
                    this.f72349d.autoFocus(this);
                    this.f72347b = true;
                } catch (RuntimeException e10) {
                    Log.w(f72344f, "Unexpected exception while focusing", e10);
                    a();
                }
            }
        }
    }

    public synchronized void d() {
        this.f72346a = true;
        if (this.f72348c) {
            b();
            try {
                this.f72349d.cancelAutoFocus();
            } catch (RuntimeException e10) {
                Log.w(f72344f, "Unexpected exception while cancelling focusing", e10);
            }
        }
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public synchronized void onAutoFocus(boolean z10, Camera camera) {
        this.f72347b = false;
        a();
    }

    static {
        ArrayList arrayList = new ArrayList();
        f72345g = arrayList;
        arrayList.add("continuous-picture");
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public a(Camera camera) {
        this.f72349d = camera;
        c();
    }
}
