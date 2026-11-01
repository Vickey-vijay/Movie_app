package l0;

import android.content.ComponentName;
import android.os.IBinder;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f63358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f63359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f63360d;

    public d(e eVar, ComponentName componentName, IBinder iBinder) {
        this.f63360d = eVar;
        this.f63358b = componentName;
        this.f63359c = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f63360d.g(this.f63358b, this.f63359c);
    }
}
