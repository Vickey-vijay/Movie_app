package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.broadcast.NetWorkChangeReceiver;
import org.json.JSONObject;

/* JADX INFO: compiled from: NetAddressManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f35303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.setting.j f35304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f35305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BroadcastReceiver f35306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IntentFilter f35307e;

    /* JADX INFO: compiled from: NetAddressManager.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g0 f35308a = new g0();
    }

    public static g0 a() {
        return b.f35308a;
    }

    private g0() {
        this.f35303a = new JSONObject();
        this.f35306d = new NetWorkChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        this.f35307e = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }

    public void a(String str) {
        if (this.f35303a == null) {
            this.f35303a = new JSONObject();
        }
        try {
            if (!this.f35303a.optString("KEY_INFO", "").equals(str)) {
                this.f35303a.put("KEY_INFO", str);
                d.b(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_INFO", str);
            }
        } catch (Exception e10) {
            q0.b("NetAddressManager", e10.getMessage());
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f35303a.put("KEY_TIME", jCurrentTimeMillis);
            d.b(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_TIME", Long.valueOf(jCurrentTimeMillis));
        } catch (Exception e11) {
            q0.b("NetAddressManager", e11.getMessage());
        }
    }

    public String b() {
        try {
            if (this.f35303a == null) {
                this.f35303a = new JSONObject();
            }
            if (this.f35303a.length() < 2) {
                try {
                    this.f35303a.put("KEY_INFO", (String) d.a(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_INFO", ""));
                } catch (Exception e10) {
                    q0.b("NetAddressManager", e10.getMessage());
                }
                try {
                    this.f35303a.put("KEY_TIME", ((Long) d.a(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_TIME", 0L)).longValue());
                } catch (Exception e11) {
                    q0.b("NetAddressManager", e11.getMessage());
                }
            }
            String strOptString = this.f35303a.optString("KEY_INFO");
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
            return System.currentTimeMillis() - this.f35303a.optLong("KEY_TIME") > (gVarB != null ? gVarB.R() : 3600L) * 1000 ? "" : strOptString;
        } catch (Exception e12) {
            q0.b("NetAddressManager", e12.getMessage());
            return "";
        }
    }

    public void c() {
        Context contextD;
        try {
            if (com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b()).S() == 1 && (contextD = com.mbridge.msdk.foundation.controller.c.n().d()) != null) {
                IntentFilter intentFilter = new IntentFilter();
                this.f35307e = intentFilter;
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                contextD.registerReceiver(this.f35306d, this.f35307e);
            }
        } catch (Exception e10) {
            q0.b("NetAddressManager", e10.getMessage());
        }
    }

    public void d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f35305c > 3000) {
            if (this.f35304b == null) {
                this.f35304b = new com.mbridge.msdk.setting.j();
            }
            this.f35304b.c(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
            this.f35305c = jCurrentTimeMillis;
        }
    }

    public void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            try {
                contextD.unregisterReceiver(this.f35306d);
            } catch (Exception e10) {
                q0.b("NetAddressManager", e10.getMessage());
            }
        }
    }
}
