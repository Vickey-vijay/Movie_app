package j0;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import l0.h;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements q0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.digitalturbine.ignite.authenticator.receiver.a f61684a = new com.digitalturbine.ignite.authenticator.receiver.a(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f61685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l0.a f61686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f61687d;

    public final void a() {
        com.digitalturbine.ignite.authenticator.receiver.a aVar;
        r0.b.a("%s : start", "OneDTPropertyWatchdog");
        Context context = this.f61685b;
        if (context == null || (aVar = this.f61684a) == null || aVar.f14004b) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("com.dt.ignite.service.action.PROPERTY_CHANGED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(aVar, intentFilter, 4);
        } else {
            context.registerReceiver(aVar, intentFilter);
        }
        this.f61684a.f14004b = true;
    }

    public d(Context context, l0.a aVar, h hVar) {
        this.f61685b = context.getApplicationContext();
        this.f61686c = aVar;
        this.f61687d = hVar;
    }
}
