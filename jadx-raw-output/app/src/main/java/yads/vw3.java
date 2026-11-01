package yads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class vw3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f84031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f84032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AudioManager f84033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ov3 f84034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jx3 f84035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f84036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f84037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f84038h;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        if (this.f84037g.getAndSet(true)) {
            return;
        }
        this.f84038h.submit(new qw3(this));
    }

    public vw3(Handler handler, Context context, ov3 ov3Var, jx3 jx3Var) {
        super(handler);
        this.f84036f = new AtomicReference(Float.valueOf(-1.0f));
        this.f84037g = new AtomicBoolean(false);
        this.f84038h = Executors.newSingleThreadExecutor();
        this.f84031a = handler;
        this.f84032b = context;
        this.f84033c = (AudioManager) context.getSystemService("audio");
        this.f84034d = ov3Var;
        this.f84035e = jx3Var;
    }
}
