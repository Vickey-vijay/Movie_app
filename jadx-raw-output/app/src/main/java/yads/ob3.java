package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import yads.ob3;

/* JADX INFO: loaded from: classes10.dex */
public final class ob3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f80988c = "The Yandex Mobile Ads SDK needs to be updated to the latest version. Details in the logs";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f80989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f80990b;

    public /* synthetic */ ob3(Context context) {
        this(context, new Handler(Looper.getMainLooper()));
    }

    public final void a() {
        this.f80989a.post(new Runnable() { // from class: cp.l7
            @Override // java.lang.Runnable
            public final void run() {
                ob3.a(this.f51429b);
            }
        });
    }

    public static final void a(ob3 ob3Var) {
        Toast.makeText(ob3Var.f80990b, f80988c, 1).show();
    }

    public ob3(Context context, Handler handler) {
        this.f80989a = handler;
        this.f80990b = context.getApplicationContext();
    }
}
