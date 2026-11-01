package l0;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* JADX INFO: loaded from: classes6.dex */
public interface a extends ServiceConnection, p0.b {
    void a(String str);

    boolean a();

    void b();

    void b(String str);

    void c(String str);

    boolean c();

    String d();

    void destroy();

    String e();

    void e(a aVar);

    void f(a aVar);

    boolean f();

    Context g();

    void g(ComponentName componentName, IBinder iBinder);

    boolean h();

    String i();

    boolean j();

    IIgniteServiceAPI k();

    void l();
}
