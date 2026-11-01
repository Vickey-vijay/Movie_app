package com.mbridge.msdk.click.retry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: RetryReportControl.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f32908e = "mtg_retry_report=1";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f32909f = 10000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f32910g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f32911h = 50;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f32912i = 600000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f32913j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f32914k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f32915l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f32916m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f32917n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f32918o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f32919p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f32920q = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.click.retry.b> f32921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.click.retry.c f32922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f32923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f32924d;

    /* JADX INFO: renamed from: com.mbridge.msdk.click.retry.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RetryReportControl.java */
    public class C0305a extends BroadcastReceiver {
        public C0305a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                a.this.f32924d.sendEmptyMessage(2);
            }
        }
    }

    /* JADX INFO: compiled from: RetryReportControl.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f32926a = new a(null);
    }

    /* JADX INFO: compiled from: RetryReportControl.java */
    public static class c extends Handler {
        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                a.b().c();
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    a.b().a((String) obj, com.mbridge.msdk.click.retry.b.f32927k);
                }
            }
        }

        public c(Looper looper) {
            super(looper);
        }
    }

    public /* synthetic */ a(C0305a c0305a) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.mbridge.msdk.click.retry.c cVar = this.f32922b;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                a(it.next(), com.mbridge.msdk.click.retry.b.f32928l);
            }
        }
    }

    private a() {
        this.f32921a = new ConcurrentHashMap<>();
        this.f32922b = new com.mbridge.msdk.click.retry.c(f32911h);
        this.f32924d = new c(Looper.getMainLooper());
        g gVarB = h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
        f32910g = gVarB.e0();
        f32909f = gVarB.g0() * 1000;
        f32912i = gVarB.h0() * 1000;
        f32913j = gVarB.d0();
        f32914k = gVarB.f0();
        a();
    }

    public static a b() {
        return b.f32926a;
    }

    private boolean b(int i10) {
        return i10 == f32916m || i10 == f32917n;
    }

    public void a(String str, String str2, CampaignEx campaignEx, String str3, boolean z10, boolean z11, int i10) {
        if (!c(i10) || TextUtils.isEmpty(str)) {
            return;
        }
        String strReplace = str.replace("?" + f32908e, "").replace(C3426d4.j.f28584c + f32908e, "");
        if (this.f32921a == null) {
            this.f32921a = new ConcurrentHashMap<>();
        }
        com.mbridge.msdk.click.retry.b bVarRemove = this.f32921a.remove(strReplace);
        if (bVarRemove == null) {
            bVarRemove = new com.mbridge.msdk.click.retry.b(str, str2);
            bVarRemove.b(i10);
            bVarRemove.a(z10);
            bVarRemove.b(z11);
            bVarRemove.a(campaignEx);
            bVarRemove.b(str3);
        } else if (bVarRemove.d() != com.mbridge.msdk.click.retry.b.f32928l) {
            bVarRemove.a(str2);
        }
        if (!((a(i10) && f32913j != 0) || (b(i10) && f32914k != 0) || i10 == f32920q)) {
            a(bVarRemove);
            return;
        }
        if (System.currentTimeMillis() < bVarRemove.c() + ((long) f32912i)) {
            a(strReplace, bVarRemove);
            if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.f32927k) {
                if (bVarRemove.e() <= f32910g) {
                    a(strReplace);
                    return;
                } else {
                    a(bVarRemove);
                    return;
                }
            }
            return;
        }
        if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.f32927k) {
            a(bVarRemove);
        }
    }

    private boolean c(int i10) {
        return a(i10) || b(i10) || i10 == f32920q;
    }

    private void a(com.mbridge.msdk.click.retry.b bVar) {
        String str;
        String requestIdNotice;
        try {
            CampaignEx campaignExA = bVar.a();
            if (campaignExA != null) {
                String requestId = campaignExA.getRequestId();
                requestIdNotice = campaignExA.getRequestIdNotice();
                str = requestId;
            } else {
                str = "";
                requestIdNotice = str;
            }
            a(com.mbridge.msdk.foundation.controller.c.n().d(), bVar.b().toString(), bVar.g(), str, requestIdNotice, bVar.h());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void a(Context context, String str, String str2, String str3, String str4, int i10) {
        f.a().a(context, str, str2, str3, str4, i10);
    }

    private void a(String str, com.mbridge.msdk.click.retry.b bVar) {
        if (this.f32922b == null) {
            this.f32922b = new com.mbridge.msdk.click.retry.c(f32911h);
        }
        this.f32922b.a(str, bVar);
    }

    private void a(String str) {
        Message messageObtainMessage = this.f32924d.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = str;
        this.f32924d.sendMessageDelayed(messageObtainMessage, f32909f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10) {
        String str2;
        com.mbridge.msdk.click.retry.c cVar = this.f32922b;
        if (cVar != null) {
            com.mbridge.msdk.click.retry.b bVarA = cVar.a(str);
            this.f32922b.b(str);
            if (bVarA == null) {
                com.mbridge.msdk.click.retry.b bVar = this.f32921a.get(str);
                if (bVar == null || System.currentTimeMillis() > bVar.c() + ((long) f32912i) || bVar.e() >= f32910g || i10 == com.mbridge.msdk.click.retry.b.f32928l) {
                    return;
                }
                a(str);
                return;
            }
            if (System.currentTimeMillis() <= bVarA.c() + ((long) f32912i)) {
                bVarA.a(i10);
                this.f32921a.put(str, bVarA);
                if (c1.c(str) == 0) {
                    str2 = str + "?" + f32908e;
                } else {
                    str2 = str + C3426d4.j.f28584c + f32908e;
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), bVarA.a(), bVarA.f(), str2, bVarA.i(), bVarA.j(), bVarA.h());
                return;
            }
            if (i10 != com.mbridge.msdk.click.retry.b.f32928l) {
                a(bVarA);
            }
        }
    }

    private void a() {
        try {
            if (this.f32923c == null) {
                this.f32923c = new C0305a();
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    contextD.registerReceiver(this.f32923c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private boolean a(int i10) {
        return i10 == f32919p || i10 == f32918o;
    }
}
