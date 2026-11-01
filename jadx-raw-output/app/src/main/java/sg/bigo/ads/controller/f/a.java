package sg.bigo.ads.controller.f;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.d.c;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f70883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<InterfaceC0726a> f70884b = new ArrayList();

    /* JADX INFO: renamed from: sg.bigo.ads.controller.f.a$a, reason: collision with other inner class name */
    public interface InterfaceC0726a {
        void a(boolean z10);
    }

    public static synchronized void a(Context context, @Nullable InterfaceC0726a interfaceC0726a) {
        if (f70883a == null) {
            f70883a = new a();
            sg.bigo.ads.common.d.a.a().a(context, f70883a);
        }
        synchronized (f70883a.f70884b) {
            if (interfaceC0726a != null) {
                f70883a.f70884b.add(interfaceC0726a);
            }
        }
    }

    @Override // sg.bigo.ads.common.d.b
    public final void a(Context context, Intent intent) {
        boolean zB = sg.bigo.ads.common.aa.c.b(context);
        sg.bigo.ads.common.t.a.a(0, 3, "NetworkStateReceiver", "Network state changed, available: ".concat(String.valueOf(zB)));
        synchronized (this.f70884b) {
            for (InterfaceC0726a interfaceC0726a : this.f70884b) {
                if (interfaceC0726a != null) {
                    interfaceC0726a.a(zB);
                } else {
                    sg.bigo.ads.common.t.a.a(0, 3, "NetworkStateReceiver", "OnNetworkStateChangeListener is null object reference");
                }
            }
        }
    }
}
