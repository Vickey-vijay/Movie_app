package yads;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes10.dex */
public abstract class gw3 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xv3 f77962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fw3 f77963b;

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        xv3 xv3Var = this.f77962a;
        if (xv3Var != null) {
            mw3 mw3Var = (mw3) xv3Var;
            mw3Var.f80411c = null;
            mw3Var.a();
        }
    }

    public gw3(fw3 fw3Var) {
        this.f77963b = fw3Var;
    }

    public final void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
