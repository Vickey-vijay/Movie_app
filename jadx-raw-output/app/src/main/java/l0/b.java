package l0;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f63355b;

    public b(e eVar) {
        this.f63355b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f63355b.f63372m) {
            Intent intent = new Intent();
            intent.setClassName(this.f63355b.f63368i, "com.digitalturbine.ignite.cl.IgniteRemoteService");
            e eVar = this.f63355b;
            Context context = eVar.f63365f;
            if (context != null) {
                try {
                    context.bindService(intent, eVar, 1);
                } catch (Throwable th2) {
                    Object[] objArr = {th2};
                    r0.a aVar = r0.b.f66637b.f66638a;
                    if (aVar != null) {
                        aVar.e("Failed to bind IgniteRemoteService", objArr);
                    }
                    if (th2.getMessage() != null && th2.getMessage().contains("Too many bind requests")) {
                    } else {
                        n0.b.b(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_GENERAL_ERROR, u0.a.a(th2, com.digitalturbine.ignite.authenticator.events.c.IGNITE_SERVICE_UNAVAILABLE));
                    }
                }
            }
        }
    }
}
