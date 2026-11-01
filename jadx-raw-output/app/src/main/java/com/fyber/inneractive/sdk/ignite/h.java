package com.fyber.inneractive.sdk.ignite;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.a1;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements p0.b, p0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f15780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IIgniteServiceAPI f15781b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f15790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f15791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f15792m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q0.a f15793n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.r f15794o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l f15795p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f15782c = new Bundle();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15784e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15785f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15786g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f15787h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15788i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15789j = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f15783d = new i(new e(this));

    public final void a(com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f15794o = rVar;
        if (!TextUtils.isEmpty(this.f15791l)) {
            IAlog.a("%s : Ignite installed will init IgniteManager", "IgniteAdapter");
            com.fyber.inneractive.sdk.config.global.features.i iVar = (com.fyber.inneractive.sdk.config.global.features.i) rVar.a(com.fyber.inneractive.sdk.config.global.features.i.class);
            IAlog.a("%s : initializing ignite features", "IgniteAdapter");
            Boolean boolC = iVar.c("odt");
            this.f15784e = boolC != null ? boolC.booleanValue() : false;
            Boolean boolC2 = iVar.c("flow");
            this.f15785f = boolC2 != null ? boolC2.booleanValue() : false;
            Boolean boolC3 = iVar.c("updates");
            this.f15786g = boolC3 != null ? boolC3.booleanValue() : false;
            Context context = this.f15780a;
            if (context != null) {
                boolean z10 = this.f15784e;
                if (z10 || this.f15785f) {
                    if (this.f15795p == null) {
                        this.f15789j = false;
                        l lVar = new l(context, new k(), new com.fyber.inneractive.sdk.ignite.events.wrappers.a(), z10, this.f15785f, this.f15786g, this);
                        this.f15795p = lVar;
                        lVar.authenticate();
                    }
                    this.f15790k = TimeUnit.SECONDS.toMillis(IAConfigManager.O.f15028w.f15199a.f15195b.a("igniteInstallTimeOutInSeconds", 15, 1));
                }
            }
        }
    }

    @Override // p0.a
    public final void onIgniteServiceAuthenticationFailed(String str) {
        this.f15781b = null;
        a(j.FAILED_TO_AUTHENTICATE, str);
        IAlog.a("IgniteAdapter: onIgniteServiceAuthenticationFailed : error : %s", str);
        q0.a aVar = this.f15793n;
        if (aVar != null) {
            aVar.a(str);
            this.f15793n = null;
        }
    }

    @Override // p0.a
    public final void onIgniteServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str;
        Context context;
        IAlog.a("IgniteAdapter: onIgniteServiceConnected", new Object[0]);
        this.f15791l = componentName.getPackageName();
        this.f15781b = IIgniteServiceAPI.Stub.asInterface(iBinder);
        if (this.f15789j) {
            l lVar = this.f15795p;
            if (lVar != null) {
                lVar.authenticate();
                return;
            }
            return;
        }
        this.f15789j = true;
        byte[] byteArray = null;
        try {
            o oVarNewBuilder = IgniteRequestOuterClass$IgniteRequest.newBuilder();
            String str2 = IAConfigManager.O.f15008c;
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f18286b).setAppId(str2);
            String packageName = com.fyber.inneractive.sdk.util.o.f18599a.getPackageName();
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f18286b).setBundle(packageName);
            String version = InneractiveAdManager.getVersion();
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f18286b).setSdkVersion(version);
            String str3 = this.f15791l;
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f18286b).setIgnitePackageName(str3);
            if (TextUtils.isEmpty(this.f15791l) || (context = this.f15780a) == null) {
                str = null;
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f18286b).setIgniteVersionName(str);
                String strA = com.fyber.inneractive.sdk.util.o.a(this.f15780a);
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f18286b).setAppSignature(strA);
                byteArray = ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.a()).toByteArray();
            } else {
                try {
                    str = context.getPackageManager().getPackageInfo(this.f15791l, 0).versionName;
                } catch (Exception unused) {
                    IAlog.a("Failed to resolve ignite version", new Object[0]);
                    str = null;
                }
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f18286b).setIgniteVersionName(str);
                String strA2 = com.fyber.inneractive.sdk.util.o.a(this.f15780a);
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f18286b).setAppSignature(strA2);
                byteArray = ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.a()).toByteArray();
            }
        } catch (Throwable unused2) {
            IAlog.a("Failed to build ignite request", new Object[0]);
        }
        if (byteArray != null) {
            IAConfigManager.O.f15024s.a(new a1(new b(this), byteArray, this.f15794o));
        }
    }

    @Override // p0.a
    public final void onIgniteServiceConnectionFailed(String str) {
        IAlog.a("IgniteAdapter: onIgniteServiceConnectionFailed : error : %s", str);
        a(j.FAILED_TO_BIND_SERVICE, str);
    }

    @Override // p0.a
    public final void onOdtUnsupported() {
        l lVar;
        IAlog.f("%s: onOdtUnsupported : unsupported ignite version", "IgniteAdapter");
        if (this.f15785f || (lVar = this.f15795p) == null) {
            return;
        }
        lVar.destroy();
        this.f15795p = null;
    }

    public final void m() {
        d dVar = this.f15792m;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(dVar);
            this.f15792m = null;
        }
    }

    public final boolean n() {
        l lVar = this.f15795p;
        return lVar != null && lVar.isConnected() && this.f15795p.isAuthenticated();
    }

    public final boolean o() {
        l lVar = this.f15795p;
        return lVar == null || lVar.f61679a.f();
    }

    @Override // p0.b
    public final void onCredentialsRequestFailed(String str) {
        l lVar = this.f15795p;
        if (lVar != null) {
            lVar.onCredentialsRequestFailed(str);
        }
    }

    @Override // p0.b
    public final void onCredentialsRequestSuccess(String str, String str2) {
        l lVar = this.f15795p;
        if (lVar != null) {
            lVar.onCredentialsRequestSuccess(str, str2);
        }
    }

    @Override // p0.a
    public final void onIgniteServiceAuthenticated(String str) {
        this.f15782c.putString("clientToken", str);
        IAlog.a("IgniteAdapter: onIgniteServiceAuthenticated", new Object[0]);
        q0.a aVar = this.f15793n;
        if (aVar != null) {
            aVar.a();
            this.f15793n = null;
        }
    }

    public final void a(j jVar, String str) {
        if (this.f15788i) {
            return;
        }
        this.f15788i = true;
        t tVar = t.IGNITE_FLOW_FAILED_TO_START;
        w wVar = new w((com.fyber.inneractive.sdk.response.e) null);
        wVar.f16128b = tVar;
        wVar.f16127a = null;
        wVar.f16130d = null;
        JSONObject jSONObject = new JSONObject();
        String strA = jVar.a();
        try {
            jSONObject.put("error_code", strA);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "error_code", strA);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("message", str);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "message", str);
            }
        }
        wVar.f16132f.put(jSONObject);
        wVar.a((String) null);
    }

    public final void a(q0.a aVar) {
        IAlog.a("IgniteAdapter : reconnectIgnite : with callback : " + aVar, new Object[0]);
        this.f15793n = aVar;
        l lVar = this.f15795p;
        if (lVar != null) {
            lVar.authenticate();
        }
    }

    public final void a(String str, g gVar) {
        String strA;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.a("Starting install timeout with %d", Long.valueOf(this.f15790k));
        d dVar = new d(this);
        this.f15792m = dVar;
        com.fyber.inneractive.sdk.util.r.f18607b.postDelayed(dVar, this.f15790k);
        if (n() && !o() && this.f15781b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, str);
                jSONObject.put("data", jSONObject2);
                IIgniteServiceAPI iIgniteServiceAPI = this.f15781b;
                String string = jSONObject.toString();
                Bundle bundle = this.f15782c;
                Bundle bundle2 = new Bundle();
                i iVar = this.f15783d;
                c cVar = new c(this, gVar);
                iVar.getClass();
                iIgniteServiceAPI.install(string, bundle, bundle2, new s((e) iVar.f15796a, cVar));
                return;
            } catch (Exception unused) {
                IAlog.a("Failed to install app", new Object[0]);
                return;
            }
        }
        for (r rVar : this.f15787h) {
            if (rVar != null) {
                if (o()) {
                    strA = j.SESSION_EXPIRED.a();
                } else {
                    strA = j.NOT_CONNECTED.a();
                }
                rVar.a((String) null, strA, (String) null);
            }
        }
    }
}
