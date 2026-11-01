package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.C3405c1;
import com.ironsource.C3676r4;
import com.ironsource.C3772wf;
import com.ironsource.O8;
import com.ironsource.Z7;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A implements O8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractAdapter f29512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3405c1 f29513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONObject f29515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f29518g = null;

    public void a(boolean z10) {
        this.f29514c = z10;
    }

    @Override // com.ironsource.O8.b
    public int b() {
        return this.f29513b.e();
    }

    @Override // com.ironsource.O8.b
    public String c() {
        return this.f29513b.f();
    }

    public abstract IronSource.a d();

    public abstract String k();

    public int l() {
        return 1;
    }

    public void q() {
        this.f29512a = null;
    }

    public void a(String str) {
        a(str, 0);
    }

    public void b(String str) {
        a(str, 3);
    }

    public void c(String str) {
        this.f29516e = d.b().c(str);
    }

    public Long e() {
        return this.f29518g;
    }

    public int g() {
        return this.f29513b.d();
    }

    public boolean h() {
        return this.f29514c;
    }

    public String i() {
        return this.f29513b.h().isMultipleInstances() ? this.f29513b.h().getProviderTypeForReflection() : this.f29513b.h().getProviderName();
    }

    public String j() {
        return this.f29513b.g();
    }

    public Map<String, Object> m() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f29512a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f29512a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f29513b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f29513b.a());
            map.put("instanceType", Integer.valueOf(p() ? 2 : 1));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(l()));
            if (!TextUtils.isEmpty(this.f29516e)) {
                map.put("dynamicDemandSource", this.f29516e);
            }
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + c() + ")", th2);
        }
        return map;
    }

    public int n() {
        return this.f29517f;
    }

    public boolean o() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        try {
            if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !this.f29512a.isUsingActivityBeforeImpression(C3772wf.a(d()))) {
                return false;
            }
            ironLog.verbose(c() + " - is using activity before impression and activity is null");
            return true;
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            b("Exception while calling adapter.isUsingActivityBeforeImpression() - " + th2.getLocalizedMessage());
            return true;
        }
    }

    public boolean p() {
        return this.f29513b.j();
    }

    public boolean s() {
        return this.f29513b.k();
    }

    public A(C3405c1 c3405c1, AbstractAdapter abstractAdapter) {
        this.f29513b = c3405c1;
        this.f29512a = abstractAdapter;
        this.f29515d = c3405c1.c();
    }

    private void a(String str, int i10) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, k() + Z7.f27998r + c() + " : " + str, i10);
    }

    public String f() {
        return String.format("%s %s", i(), Integer.valueOf(hashCode()));
    }

    public boolean r() {
        if (o()) {
            return false;
        }
        if (!p() && !s()) {
            return false;
        }
        return true;
    }
}
