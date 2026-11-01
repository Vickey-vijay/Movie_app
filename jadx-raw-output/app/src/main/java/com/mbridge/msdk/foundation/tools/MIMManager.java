package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.ironsource.G5;
import com.ironsource.Z7;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.net.URLEncoder;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class MIMManager {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile String f35216i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f35217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f35219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f35220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Boolean f35221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CampaignEx f35222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile g f35223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile MiOverseaMiniCardBroadcasterReceiver f35224h;

    public static class MiOverseaMiniCardBroadcasterReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN=").equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                int intExtra = intent.getIntExtra(IronSourceConstants.EVENTS_ERROR_CODE, 0);
                int intExtra2 = intExtra < 0 ? intent.getIntExtra("reason", 0) : -1;
                q0.b("MIMManager", stringExtra + Z7.f27998r + intExtra + Z7.f27998r + intExtra2);
                if (intExtra == 1 || intExtra == 2 || intExtra == 3 || intExtra == 4 || intExtra == 7) {
                    try {
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar.a(C3426d4.i.W, URLEncoder.encode("m_mini_card", G5.N));
                        CampaignEx campaignExA = MIMManager.b().a(stringExtra);
                        if (campaignExA != null) {
                            eVar.a(ImpressionLog.f43648x, campaignExA.getRequestId());
                            eVar.a("rid_n", campaignExA.getRequestIdNotice());
                            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignExA.getCampaignUnitId());
                            eVar.a("u_stid", com.mbridge.msdk.foundation.controller.a.f34556r.get(campaignExA.getCampaignUnitId()));
                            cVar.a(campaignExA);
                        }
                        eVar.a("event", String.valueOf(intExtra));
                        eVar.a("pkg_name", stringExtra);
                        if (intExtra2 != -1) {
                            eVar.a("reasonCode", String.valueOf(intExtra2));
                        }
                        cVar.a("m_mini_card", eVar);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mini_card", cVar);
                    } catch (Exception e10) {
                        q0.b("MIMManager", e10.getMessage());
                    }
                }
            }
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f35225a;

        public a(Context context) {
            this.f35225a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MIMManager.this.f35217a.compareAndSet(false, true)) {
                try {
                    MIMManager mIMManager = MIMManager.this;
                    mIMManager.f35221e = mIMManager.a();
                } catch (Exception e10) {
                    q0.a("MIMManager", e10.getMessage());
                }
                if (MIMManager.this.f35221e == null || !MIMManager.this.f35221e.booleanValue() || this.f35225a == null) {
                    return;
                }
                try {
                    MIMManager.this.f35223g = new g(null);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                    this.f35225a.registerReceiver(MIMManager.this.f35223g, intentFilter);
                } catch (Exception e11) {
                    q0.a("MIMManager", e11.getMessage());
                }
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f35227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35228b;

        public b(Context context, CampaignEx campaignEx) {
            this.f35227a = context;
            this.f35228b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.e(this.f35227a, this.f35228b);
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f35230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35231b;

        public c(Context context, CampaignEx campaignEx) {
            this.f35230a = context;
            this.f35231b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.d(this.f35230a, this.f35231b);
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f35233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35234b;

        public d(Context context, CampaignEx campaignEx) {
            this.f35233a = context;
            this.f35234b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.f(this.f35233a, this.f35234b);
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            } finally {
                if (MIMManager.this.f35219c != null && MIMManager.this.f35219c.contains(this.f35234b)) {
                    MIMManager.this.f35219c.remove(this.f35234b);
                }
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f35236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f35237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f35239d;

        public e(Context context, String str, CampaignEx campaignEx, int i10) {
            this.f35236a = context;
            this.f35237b = str;
            this.f35238c = campaignEx;
            this.f35239d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f35236a == null || TextUtils.isEmpty(this.f35237b) || this.f35238c == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3426d4.i.W, "2000100");
                jSONObject.put("network_type", m0.s(this.f35236a));
                jSONObject.put(ImpressionLog.f43648x, this.f35238c.getRequestId());
                jSONObject.put("rid_n", this.f35238c.getRequestIdNotice());
                if (!TextUtils.isEmpty(this.f35238c.getCampaignUnitId())) {
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35238c.getCampaignUnitId());
                    String str = com.mbridge.msdk.foundation.controller.a.f34556r.get(this.f35238c.getCampaignUnitId());
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                jSONObject.put("cid", this.f35238c.getId());
                jSONObject.put("status", this.f35237b);
                jSONObject.put("code", this.f35239d);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                q0.b("MIMManager", th2.getMessage());
            }
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final MIMManager f35241a = new MIMManager(null);
    }

    public static class g extends BroadcastReceiver {
        private g() {
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CampaignEx campaignExA;
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action) && !action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN=")) && !action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN=")) && action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"))) {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        return;
                    }
                    int i10 = extras.getInt("statusCode", -1);
                    String string = extras.getString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "");
                    if (i10 == -1 || TextUtils.isEmpty(string) || (campaignExA = MIMManager.b().a(string)) == null) {
                        return;
                    }
                    MIMManager.b().a(context, campaignExA, i10);
                    MIMManager.b().a(context, "dm_page_status", i10, MIMManager.b().c());
                } catch (Exception e10) {
                    q0.b("MIMManager", e10.getMessage());
                }
            }
        }
    }

    public /* synthetic */ MIMManager(a aVar) {
        this();
    }

    public void f() {
        this.f35218b++;
    }

    private MIMManager() {
        this.f35218b = 0;
        this.f35219c = new CopyOnWriteArrayList<>();
        this.f35217a = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context, CampaignEx campaignEx) {
        String[] strArrB;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrB = nativeVideoTracking.B()) == null) {
                    return;
                }
                for (String str : strArrB) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    public String d() {
        try {
            return f35216i == null ? "" : String.format("[%s]", f35216i);
        } catch (Exception unused) {
            return "";
        }
    }

    public Boolean e() {
        return this.f35221e;
    }

    public void g() {
        int i10 = this.f35218b - 1;
        this.f35218b = i10;
        if (i10 <= 0) {
            a(this.f35220d);
        }
    }

    public void h() {
        try {
            if (this.f35224h == null) {
                this.f35224h = new MiOverseaMiniCardBroadcasterReceiver();
            }
            IntentFilter intentFilter = new IntentFilter(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN="));
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                contextD.registerReceiver(this.f35224h, intentFilter);
            }
        } catch (Exception e10) {
            q0.a("MIMManager", e10.getMessage());
        }
    }

    public void i() {
        try {
            if (this.f35224h != null) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    contextD.unregisterReceiver(this.f35224h);
                }
                this.f35222f = null;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f35219c;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                this.f35219c = null;
                this.f35224h = null;
            }
        } catch (Exception e10) {
            q0.a("MIMManager", e10.getMessage());
        }
    }

    public static MIMManager b() {
        return f.f35241a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, CampaignEx campaignEx) {
        String[] strArrZ;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrZ = nativeVideoTracking.z()) == null) {
                    return;
                }
                for (String str : strArrZ) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, CampaignEx campaignEx) {
        String[] strArrA;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrA = nativeVideoTracking.A()) == null) {
                    return;
                }
                for (String str : strArrA) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    public CampaignEx c() {
        return this.f35222f;
    }

    private Runnable c(Context context, CampaignEx campaignEx) {
        return new d(context, campaignEx);
    }

    public void b(Context context) {
        this.f35220d = context;
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(context));
    }

    public void a(CampaignEx campaignEx) {
        try {
            if (this.f35221e != null && campaignEx != null && this.f35221e.booleanValue()) {
                this.f35222f = campaignEx;
                this.f35219c.add(campaignEx);
            }
            if (com.mbridge.msdk.util.b.b() && campaignEx != null && campaignEx.getDeepLinkURL().startsWith("mimarket")) {
                if (this.f35224h == null) {
                    h();
                }
                this.f35222f = campaignEx;
                this.f35219c.add(campaignEx);
            }
        } catch (Exception e10) {
            q0.b("MIMManager", e10.getMessage());
        }
    }

    public void b(CampaignEx campaignEx) {
        try {
            if (this.f35221e == null || campaignEx == null || !this.f35221e.booleanValue()) {
                return;
            }
            this.f35222f = null;
            try {
                this.f35219c.remove(campaignEx);
            } catch (Exception e10) {
                q0.a("MIMManager", e10.getMessage());
            }
        } catch (Exception e11) {
            q0.b("MIMManager", e11.getMessage());
        }
    }

    private Runnable b(Context context, CampaignEx campaignEx) {
        return new b(context, campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CampaignEx a(String str) {
        try {
            CampaignEx campaignEx = this.f35222f;
            if (campaignEx != null && TextUtils.equals(campaignEx.getPackageName(), str)) {
                return this.f35222f;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f35219c;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return null;
            }
            for (CampaignEx campaignEx2 : this.f35219c) {
                if (campaignEx2 != null && TextUtils.equals(campaignEx2.getPackageName(), str)) {
                    return campaignEx2;
                }
            }
            return null;
        } catch (Exception e10) {
            q0.b("MIMManager", e10.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean a() {
        Cursor cursorQuery;
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        Boolean boolValueOf = null;
        if (contextD != null) {
            try {
                if (contextD.getContentResolver() != null) {
                    try {
                        cursorQuery = contextD.getContentResolver().query(Uri.parse(k0.a("DFK/J75/JaEXWFfXYZP9LkcXYk3/YkcBLF5TWgSBYbHuH75BW3xuhr5UJj2tLkeNhrKFLkxQhl==")), null, null, null, null);
                    } catch (Exception unused) {
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("support"));
                                if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase("null") && (string.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.f29886h) || string.equalsIgnoreCase("true"))) {
                                    boolValueOf = Boolean.valueOf(Boolean.parseBoolean(string));
                                }
                            } catch (Exception e10) {
                                q0.a("MIMManager", e10.getMessage());
                            }
                            try {
                                f35216i = cursorQuery.getString(cursorQuery.getColumnIndex("detailStyle"));
                            } catch (Exception e11) {
                                q0.a("MIMManager", e11.getMessage());
                            }
                        }
                        try {
                            cursorQuery.close();
                        } catch (Exception e12) {
                            q0.a("MIMManager", e12.getMessage());
                        }
                    }
                }
            } catch (Exception e13) {
                q0.b("MIMManager", e13.getMessage());
            }
        }
        return boolValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002e A[PHI: r4
  0x002e: PHI (r4v7 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>) = 
  (r4v6 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>)
  (r4v8 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>)
 binds: [B:19:0x002c, B:12:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public void a(Context context) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (context != null) {
            try {
                try {
                    if (this.f35223g != null) {
                        context.unregisterReceiver(this.f35223g);
                    }
                    if (this.f35224h != null) {
                        context.unregisterReceiver(this.f35224h);
                    }
                    this.f35222f = null;
                    copyOnWriteArrayList = this.f35219c;
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.clear();
                    }
                } catch (Exception e10) {
                    q0.a("MIMManager", e10.getMessage());
                    this.f35222f = null;
                    copyOnWriteArrayList = this.f35219c;
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.clear();
                    }
                }
                this.f35219c = null;
                this.f35223g = null;
                this.f35220d = null;
            } catch (Throwable th2) {
                this.f35222f = null;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f35219c;
                if (copyOnWriteArrayList2 != null) {
                    copyOnWriteArrayList2.clear();
                }
                this.f35219c = null;
                this.f35223g = null;
                this.f35220d = null;
                throw th2;
            }
        }
        try {
            i();
        } catch (Throwable th3) {
            q0.b("MIMManager", th3.getMessage());
        }
    }

    public void a(Context context, CampaignEx campaignEx, int i10) {
        Runnable runnableB;
        if (i10 == 3001) {
            runnableB = b(context, campaignEx);
        } else if (i10 != 3002) {
            runnableB = i10 != 3008 ? null : c(context, campaignEx);
        } else {
            runnableB = a(context, campaignEx);
        }
        if (runnableB != null) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(runnableB);
        }
    }

    private Runnable a(Context context, CampaignEx campaignEx) {
        return new c(context, campaignEx);
    }

    public void a(Context context, String str, int i10, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(context, str, campaignEx, i10));
    }
}
