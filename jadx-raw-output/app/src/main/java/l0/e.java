package l0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f63365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f63366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f63367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f63368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m0.a f63369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IIgniteServiceAPI f63370k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f63374o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f63375p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f63361b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f63362c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f63363d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f63364e = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Bundle f63371l = new Bundle();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f63372m = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f63376q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f63377r = new b(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k0.a f63373n = new k0.a(this);

    @Override // l0.a
    public final boolean a() {
        IIgniteServiceAPI iIgniteServiceAPI;
        return this.f63364e && (iIgniteServiceAPI = this.f63370k) != null && iIgniteServiceAPI.asBinder().isBinderAlive();
    }

    @Override // l0.a
    public final void b() {
        if (!(!TextUtils.isEmpty(this.f63368i))) {
            r0.b.b("%s : unable to authenticate - there is no ignite on the device", "IgniteAuthenticationComponent");
            return;
        }
        if (!a()) {
            t0.c.f72105a.execute(this.f63377r);
            return;
        }
        if (!this.f63361b || f()) {
            m();
            return;
        }
        Object[] objArr = {"IgniteAuthenticationComponent"};
        r0.a aVar = r0.b.f66637b.f66638a;
        if (aVar != null) {
            aVar.i("%s : already authenticated", objArr);
        }
    }

    @Override // l0.a
    public final void c(String str) {
        String str2;
        r0.b.a("%s: onAuthenticationSuccess", "IgniteAuthenticationComponent");
        this.f63362c = false;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f63376q = str;
        this.f63371l.putString("clientToken", str);
        this.f63361b = true;
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            try {
                str2 = new String(Base64.decode(str.split("\\.")[1], 8), "UTF-8");
            } catch (Exception e10) {
                r0.b.b("%s : decodeJwtBody : %s", "JwtUtil", e10.toString());
                str2 = "";
            }
        }
        if (!str2.isEmpty()) {
            try {
                long jOptLong = new JSONObject(str2).optLong(ImpressionLog.f43649y);
                this.f63363d = jOptLong;
                long millis = TimeUnit.SECONDS.toMillis(jOptLong);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(millis);
                    str3 = simpleDateFormat.format(calendar.getTime());
                } catch (Exception unused) {
                }
                r0.b.a("%s : Ignite session will exp in: %s", "IgniteAuthenticationComponent", str3);
            } catch (Exception e11) {
                n0.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_GENERAL_ERROR, e11);
                r0.b.b("%s: resolveSessionExpiryTime : unable resolve session expiration : %s", "IgniteAuthenticationComponent", e11.toString());
            }
        }
        a aVar = this.f63374o;
        if (aVar != null) {
            aVar.c(str);
        }
    }

    @Override // l0.a
    public final String e() {
        return this.f63376q;
    }

    @Override // l0.a
    public final boolean f() {
        return this.f63363d > 0 && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) > this.f63363d;
    }

    @Override // l0.a
    public final Context g() {
        return this.f63365f;
    }

    @Override // p0.b
    public final void onCredentialsRequestFailed(String str) {
        r0.b.b("%s: onCredentialsRequestFailed: %s", "IgniteAuthenticationComponent", str);
        b(str);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        r0.b.a("%s : onIgniteConnected", "IgniteAuthenticationComponent");
        this.f63370k = IIgniteServiceAPI.Stub.asInterface(iBinder);
        this.f63364e = true;
        t0.c.f72105a.execute(new c(this, new d(this, componentName, iBinder)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f63364e = false;
        this.f63363d = 0L;
        b("Service : " + (componentName != null ? componentName.getClassName() : "Ignite") + " disconnected");
    }

    @Override // l0.a
    public final void a(String str) {
        r0.b.b("%s : onAuthenticationFailed : %s", "IgniteAuthenticationComponent", str);
        this.f63362c = false;
        a aVar = this.f63374o;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // l0.a
    public final String d() {
        return this.f63368i;
    }

    @Override // l0.a
    public final void destroy() {
        if (this.f63365f != null && a()) {
            this.f63365f.unbindService(this);
            this.f63365f = null;
        }
        this.f63375p = null;
        this.f63374o = null;
        this.f63370k = null;
    }

    @Override // l0.a
    public final void e(a aVar) {
        this.f63375p = aVar;
    }

    @Override // l0.a
    public final void f(a aVar) {
        this.f63374o = aVar;
    }

    @Override // l0.a
    public final void g(ComponentName componentName, IBinder iBinder) {
        a aVar = this.f63375p;
        if (aVar != null) {
            aVar.g(componentName, iBinder);
        }
    }

    @Override // l0.a
    public final boolean h() {
        return this.f63361b;
    }

    @Override // l0.a
    public final String i() {
        return this.f63369j.f63913a;
    }

    @Override // l0.a
    public final boolean j() {
        return this.f63369j.f63914b;
    }

    @Override // l0.a
    public final IIgniteServiceAPI k() {
        return this.f63370k;
    }

    @Override // p0.b
    public final void onCredentialsRequestSuccess(String str, String str2) {
        this.f63366g = str;
        this.f63367h = str2;
        m();
    }

    public e(Context context) {
        String str = null;
        this.f63365f = context.getApplicationContext();
        Intent intent = new Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
        Context context2 = this.f63365f;
        if (context2 != null) {
            List<ResolveInfo> listQueryIntentServices = context2.getPackageManager().queryIntentServices(intent, 0);
            if (listQueryIntentServices.size() > 0) {
                str = listQueryIntentServices.get(0).serviceInfo.packageName;
            }
        }
        this.f63368i = str;
        this.f63369j = new m0.a(false, "");
    }

    @Override // l0.a
    public final void l() {
        b();
    }

    public final void m() {
        if (a()) {
            String str = this.f63366g;
            String str2 = this.f63367h;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !this.f63362c) {
                if ((f() || !this.f63361b) && this.f63370k != null) {
                    try {
                        this.f63362c = true;
                        this.f63371l.putInt("sdkFlowTypeKey", 1);
                        this.f63370k.authenticate(this.f63366g, this.f63367h, this.f63371l, this.f63373n);
                    } catch (RemoteException e10) {
                        this.f63362c = false;
                        n0.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_AUTHENTICATION_ERROR, e10);
                        r0.b.b("%s: startAuthenticationProcess: unable to start authentication : %s", "IgniteAuthenticationComponent", e10.toString());
                    }
                }
            }
        }
    }

    @Override // l0.a
    public final void b(String str) {
        r0.b.b("%s : onIgniteFailedToConnect : %s", "IgniteAuthenticationComponent", str);
        a aVar = this.f63375p;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    @Override // l0.a
    public final boolean c() {
        return f() || !a();
    }
}
