package com.mbridge.msdk.click;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.G5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.MIMManager;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.LoadingActivity;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: CommonClickControl.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f32764n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Map<String, Long> f32765o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Set<String> f32766p = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f32768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.db.g f32769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f32770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.click.e f32771e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.same.report.h f32773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f32774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f32775i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f32778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private j f32779m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f32772f = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f32776j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f32777k = true;

    /* JADX INFO: renamed from: com.mbridge.msdk.click.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CommonClickControl.java */
    public class C0304a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f32780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f32781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f32782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f32783d;

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 2);
                eVar.a("net_ty", String.valueOf(this.f32780a));
                if (obj != null && (obj instanceof JumpLoaderResult)) {
                    JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                    String str = jumpLoaderResult.getStatusCode() + "";
                    eVar.a("status_code", str);
                    if (str.startsWith("2")) {
                        eVar.a("result", 1);
                    } else {
                        String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                        if (TextUtils.isEmpty(exceptionMsg)) {
                            exceptionMsg = "UNKNOWN EXCEPTION and Status Code is : " + str;
                        }
                        eVar.a("failingURL", c1.d(this.f32781b));
                        eVar.a("reason", exceptionMsg);
                    }
                }
                String strB = a.b(this.f32782c);
                if (this.f32783d != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(strB, this.f32783d, eVar);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }

        public C0304a(int i10, String str, int i11, CampaignEx campaignEx) {
            this.f32780a = i10;
            this.f32781b = str;
            this.f32782c = i11;
            this.f32783d = campaignEx;
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj, String str) {
            try {
                String strB = a.b(this.f32782c);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 2);
                if (obj instanceof JumpLoaderResult) {
                    JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                    String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                    if (!TextUtils.isEmpty(exceptionMsg)) {
                        str = exceptionMsg;
                    }
                    eVar.a("reason", str);
                    eVar.a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                }
                eVar.a("code", "");
                eVar.a("failingURL", c1.d(this.f32781b));
                eVar.a("net_ty", String.valueOf(this.f32780a));
                if (this.f32783d != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(strB, this.f32783d, eVar);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", e10.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: CommonClickControl.java */
    public class b implements g {
        @Override // com.mbridge.msdk.click.g
        public void a(Object obj) {
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj, String str) {
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }
    }

    /* JADX INFO: compiled from: CommonClickControl.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f32784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f32785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f32786c;

        public c(boolean z10, boolean z11, CampaignEx campaignEx) {
            this.f32784a = z10;
            this.f32785b = z11;
            this.f32786c = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f32784a && !a.f32764n && !a.this.f32778l && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER && !this.f32785b) {
                a.this.d(this.f32786c);
            }
            if (this.f32784a || a.this.f32772f == null || a.f32764n || a.this.f32778l || !MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                return;
            }
            a.this.f32772f.onShowLoading(this.f32786c);
        }
    }

    /* JADX INFO: compiled from: CommonClickControl.java */
    public class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f32788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f32789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Boolean f32790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f32791d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f32792e;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v23 */
        /* JADX WARN: Type inference failed for: r0v24 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        @Override // com.mbridge.msdk.click.g
        public void a(Object obj) {
            Throwable th2;
            JumpLoaderResult jumpLoaderResult;
            Set<String> set = a.f32766p;
            if (set != null) {
                set.remove(this.f32788a.getId());
            }
            JumpLoaderResult jumpLoaderResult2 = null;
            if (obj != null) {
                try {
                    if (obj instanceof JumpLoaderResult) {
                        jumpLoaderResult = (JumpLoaderResult) obj;
                        try {
                            this.f32788a.setJumpResult(jumpLoaderResult);
                            a aVar = a.this;
                            aVar.a(this.f32788a, jumpLoaderResult, this.f32789b, aVar.f32776j, this.f32790c, (List<String>) this.f32791d);
                            if (jumpLoaderResult.isjumpDone()) {
                                com.mbridge.msdk.click.b.a(com.mbridge.msdk.foundation.db.d.a(a.this.f32769c), this.f32788a, a.this.f32767a);
                            }
                            a.this.a(this.f32792e, this.f32788a);
                        } catch (Throwable th3) {
                            th2 = th3;
                            q0.b("CommonClickControl", th2.getMessage());
                        }
                        jumpLoaderResult2 = jumpLoaderResult;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    jumpLoaderResult = null;
                }
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", "1");
                if (jumpLoaderResult2 != null) {
                    eVar.a("status_code", Integer.valueOf(jumpLoaderResult2.getStatusCode()));
                }
                ?? StartsWith = -1;
                StartsWith = -1;
                CampaignEx campaignEx = this.f32788a;
                if (campaignEx != null) {
                    String clickURL = campaignEx.getClickURL();
                    if (!TextUtils.isEmpty(clickURL)) {
                        StartsWith = clickURL.startsWith("tcp");
                    }
                }
                eVar.a("net_ty", Integer.valueOf((int) StartsWith));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000138", this.f32788a, eVar);
            } catch (Throwable th5) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", th5.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }

        public d(CampaignEx campaignEx, boolean z10, Boolean bool, List list, boolean z11) {
            this.f32788a = campaignEx;
            this.f32789b = z10;
            this.f32790c = bool;
            this.f32791d = list;
            this.f32792e = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v20 */
        /* JADX WARN: Type inference failed for: r6v21 */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r6v9, types: [int] */
        @Override // com.mbridge.msdk.click.g
        public void a(Object obj, String str) {
            Set<String> set = a.f32766p;
            if (set != null) {
                set.remove(this.f32788a.getId());
            }
            JumpLoaderResult jumpLoaderResult = null;
            if (obj != null) {
                try {
                    if (obj instanceof JumpLoaderResult) {
                        JumpLoaderResult jumpLoaderResult2 = (JumpLoaderResult) obj;
                        try {
                            a.this.a((JumpLoaderResult) obj, this.f32788a, true);
                            jumpLoaderResult = jumpLoaderResult2;
                        } catch (Throwable th2) {
                            th = th2;
                            jumpLoaderResult = jumpLoaderResult2;
                            q0.b("CommonClickControl", th.getMessage());
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (a.this.f32772f != null) {
                a.this.f32772f.onRedirectionFailed(this.f32788a, str);
            }
            a.this.a(this.f32792e, this.f32788a);
            ?? StartsWith = -1;
            StartsWith = -1;
            try {
                CampaignEx campaignEx = this.f32788a;
                if (campaignEx != null) {
                    String clickURL = campaignEx.getClickURL();
                    if (!TextUtils.isEmpty(clickURL)) {
                        StartsWith = clickURL.startsWith("tcp");
                    }
                }
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", "2");
                eVar.a("net_ty", Integer.valueOf((int) StartsWith));
                if (jumpLoaderResult != null) {
                    eVar.a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000138", this.f32788a, eVar);
            } catch (Throwable th4) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", th4.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: CommonClickControl.java */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f32794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Campaign f32795b;

        public e(boolean z10, Campaign campaign) {
            this.f32794a = z10;
            this.f32795b = campaign;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f32794a && !a.f32764n && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                a.this.a();
            }
            if (a.this.f32772f == null || a.f32764n || !MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                return;
            }
            a.this.f32772f.onDismissLoading(this.f32795b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i10) {
        if (i10 == 1) {
            return "2000136";
        }
        if (i10 == 2) {
            return "2000137";
        }
        if (i10 != 3) {
            return i10 != 4 ? "" : "2000138";
        }
        return "2000139";
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44969o);
        p10.startActivity(p11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(CampaignEx campaignEx) {
        try {
            Intent intent = new Intent(this.f32770d, (Class<?>) LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f32770d, intent);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", "Exception", e10);
            }
        }
    }

    public boolean b(CampaignEx campaignEx) {
        Long l10;
        if (campaignEx == null) {
            return true;
        }
        try {
            if (2 != campaignEx.getLinkType() && 3 != campaignEx.getLinkType()) {
                return true;
            }
            String id2 = campaignEx.getId();
            Map<String, Long> map = f32765o;
            if (map == null) {
                return true;
            }
            if (map.containsKey(id2) && (l10 = f32765o.get(id2)) != null) {
                if (l10.longValue() > System.currentTimeMillis() || f32766p.contains(campaignEx.getId())) {
                    return false;
                }
            }
            f32765o.put(campaignEx.getId(), Long.valueOf(System.currentTimeMillis() + ((long) (campaignEx.getClickTimeOutInterval() * 1000))));
            return true;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return true;
            }
            e10.printStackTrace();
            return true;
        }
    }

    public void c() {
        try {
            this.f32772f = null;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public a(Context context, String str) {
        this.f32769c = null;
        this.f32770d = null;
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(str);
        this.f32774h = gVarD;
        if (gVarD == null) {
            this.f32774h = com.mbridge.msdk.setting.h.b().a();
        }
        this.f32775i = this.f32774h.K0();
        Context applicationContext = context.getApplicationContext();
        this.f32770d = applicationContext;
        this.f32767a = str;
        if (this.f32769c == null) {
            this.f32769c = com.mbridge.msdk.foundation.db.g.a(applicationContext);
        }
        this.f32773g = new com.mbridge.msdk.foundation.same.report.h(this.f32770d);
    }

    public void c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String currentLocalRid = campaignEx.getCurrentLocalRid();
            if (campaignEx.getLocalAllowTrackClick() == 0) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
                    if (cVarB != null) {
                        cVarB.a(cVarB.t() + "m_check_local_c");
                    }
                } catch (Exception unused) {
                    q0.b("CommonClickControl", "sendClickStateToAnl error");
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarB2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
            cVarB2.a(campaignEx);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_check_local_c", cVarB2);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", th2.getMessage(), th2);
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, boolean z10, boolean z11) {
        if (context == null) {
            return;
        }
        new com.mbridge.msdk.click.e(context.getApplicationContext()).a(str, campaignEx, null, str2, z10, z11, com.mbridge.msdk.click.retry.a.f32915l);
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, boolean z10, boolean z11, int i10) {
        int i11;
        if (context == null) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            i11 = -1;
        } else {
            i11 = str2.startsWith("tcp") ? 1 : 0;
        }
        a(i10, campaignEx, i11);
        new com.mbridge.msdk.click.e(context.getApplicationContext()).a(str, campaignEx, new C0304a(i11, str2, i10, campaignEx), str2, z10, z11, i10);
    }

    private static void a(int i10, CampaignEx campaignEx, int i11) {
        if (campaignEx != null) {
            try {
                String strB = b(i10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("net_ty", Integer.valueOf(i11));
                eVar.a("result", 3);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(strB, campaignEx, eVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private int b() {
        try {
            com.mbridge.msdk.setting.g gVar = this.f32774h;
            if (gVar != null) {
                return gVar.V();
            }
            return 1;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 1;
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String[] strArr, boolean z10, boolean z11) {
        if (context == null || campaignEx == null || TextUtils.isEmpty(str) || strArr == null) {
            return;
        }
        com.mbridge.msdk.click.e eVar = new com.mbridge.msdk.click.e(context.getApplicationContext());
        for (String str2 : strArr) {
            eVar.a(str, campaignEx, new b(), str2, z10, z11, com.mbridge.msdk.click.retry.a.f32915l);
        }
    }

    public void a(String str) {
        this.f32767a = str;
    }

    public void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f32772f = nativeTrackingListener;
    }

    public void a(j jVar) {
        this.f32779m = jVar;
    }

    public void a(boolean z10) {
        this.f32777k = z10;
    }

    public void a(CampaignEx campaignEx, NativeListener.NativeAdListener nativeAdListener) {
        if (nativeAdListener != null && campaignEx != null) {
            nativeAdListener.onAdClick(campaignEx);
        }
        a(campaignEx);
    }

    public void a(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            if (b(campaignEx)) {
                c(campaignEx);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000149", campaignEx);
                String noticeUrl = campaignEx.getNoticeUrl();
                com.mbridge.msdk.foundation.db.d dVarA = com.mbridge.msdk.foundation.db.d.a(this.f32769c);
                dVarA.d();
                JumpLoaderResult jumpLoaderResultB = dVarA.b(campaignEx.getId(), this.f32767a);
                if (jumpLoaderResultB != null) {
                    if (jumpLoaderResultB.getNoticeurl() != null) {
                        jumpLoaderResultB.setNoticeurl(null);
                    }
                    campaignEx.setJumpResult(jumpLoaderResultB);
                    com.mbridge.msdk.click.b.a(dVarA, campaignEx, this.f32767a);
                }
                ArrayList arrayList = new ArrayList();
                AppletsModel appletsModel = AppletModelManager.getInstance().get(campaignEx);
                if (v0.b(campaignEx)) {
                    MIMManager.b().a(campaignEx);
                    arrayList.add(CampaignEx.JSON_KEY_DEEP_LINK_URL);
                    if (com.mbridge.msdk.click.c.d(this.f32770d, campaignEx.getDeepLinkURL())) {
                        NativeListener.NativeTrackingListener nativeTrackingListener = this.f32772f;
                        if (nativeTrackingListener != null) {
                            nativeTrackingListener.onStartRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        com.mbridge.msdk.click.b.a(this.f32770d, this.f32767a, campaignEx, noticeUrl + "&opdptype=1", -1);
                        com.mbridge.msdk.click.b.a(campaignEx);
                        NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f32772f;
                        if (nativeTrackingListener2 != null) {
                            nativeTrackingListener2.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        a(campaignEx, 3, 1, arrayList);
                        return;
                    }
                    noticeUrl = noticeUrl + "&opdptype=0";
                    MIMManager.b().b(campaignEx);
                }
                String str = noticeUrl;
                if (campaignEx.getLinkType() == 12) {
                    NativeListener.NativeTrackingListener nativeTrackingListener3 = this.f32772f;
                    if (nativeTrackingListener3 != null) {
                        nativeTrackingListener3.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    com.mbridge.msdk.click.b.a(this.f32770d, this.f32767a, campaignEx, str, -1);
                    a(this.f32770d, campaignEx, arrayList);
                    NativeListener.NativeTrackingListener nativeTrackingListener4 = this.f32772f;
                    if (nativeTrackingListener4 != null) {
                        nativeTrackingListener4.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                if (appletsModel != null && appletsModel.isSupportWxScheme()) {
                    if (appletsModel.isRequestSuccess()) {
                        if (com.mbridge.msdk.click.c.d(this.f32770d, appletsModel.getDeepLink())) {
                            NativeListener.NativeTrackingListener nativeTrackingListener5 = this.f32772f;
                            if (nativeTrackingListener5 != null) {
                                nativeTrackingListener5.onStartRedirection(campaignEx, campaignEx.getClickURL());
                            }
                            if (this.f32770d != null) {
                                Intent intent = new Intent();
                                intent.setAction("mb_dp_close_broadcast_receiver");
                                try {
                                    this.f32770d.sendBroadcast(intent);
                                } catch (Exception e10) {
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("CommonClickControl", e10.getMessage());
                                    }
                                }
                            }
                            com.mbridge.msdk.click.b.a(this.f32770d, this.f32767a, campaignEx, str + "&opdptype=1", -1);
                            com.mbridge.msdk.click.b.a(campaignEx);
                            NativeListener.NativeTrackingListener nativeTrackingListener6 = this.f32772f;
                            if (nativeTrackingListener6 != null) {
                                nativeTrackingListener6.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                                return;
                            }
                            return;
                        }
                        str = str + "&opdptype=0";
                    } else {
                        if (appletsModel.isRequesting()) {
                            NativeListener.NativeTrackingListener nativeTrackingListener7 = this.f32772f;
                            if (nativeTrackingListener7 != null) {
                                nativeTrackingListener7.onStartRedirection(campaignEx, campaignEx.getClickURL());
                            }
                            appletsModel.setAppletSchemeCallBack(a(this.f32772f, campaignEx, appletsModel, this));
                            return;
                        }
                        if (appletsModel.can(1)) {
                            if (appletsModel.isRequestTimesMaxPerDay()) {
                                if (!TextUtils.isEmpty(appletsModel.getReBuildClickUrl())) {
                                    campaignEx.setClickURL(appletsModel.getReBuildClickUrl());
                                }
                            } else {
                                NativeListener.NativeTrackingListener nativeTrackingListener8 = this.f32772f;
                                if (nativeTrackingListener8 != null) {
                                    nativeTrackingListener8.onStartRedirection(campaignEx, campaignEx.getClickURL());
                                }
                                appletsModel.requestWxAppletsScheme(1, a(this.f32772f, campaignEx, appletsModel, this));
                                return;
                            }
                        }
                    }
                }
                if (com.mbridge.msdk.util.b.b()) {
                    com.mbridge.msdk.click.b.a(this.f32770d, this.f32767a, campaignEx, str, -1);
                }
                if (!campaignEx.getUserActivation() && com.mbridge.msdk.click.c.a(this.f32770d, campaignEx.getPackageName())) {
                    com.mbridge.msdk.click.c.b(this.f32770d, campaignEx.getPackageName());
                    if (com.mbridge.msdk.util.b.a()) {
                        com.mbridge.msdk.click.b.a(this.f32770d, this.f32767a, campaignEx, str, com.mbridge.msdk.foundation.same.a.N);
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener9 = this.f32772f;
                    if (nativeTrackingListener9 != null) {
                        nativeTrackingListener9.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    if (com.mbridge.msdk.util.b.a()) {
                        a(campaignEx, true, Boolean.TRUE, (List<String>) arrayList);
                    } else {
                        a(campaignEx, true, (Boolean) null, (List<String>) arrayList);
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener10 = this.f32772f;
                    if (nativeTrackingListener10 != null) {
                        nativeTrackingListener10.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        u0.a(this.f32772f);
                        return;
                    }
                    return;
                }
                int linkType = campaignEx.getLinkType();
                int iB = b();
                if (com.mbridge.msdk.util.b.a() && linkType != 3) {
                    com.mbridge.msdk.click.b.a(this.f32770d, this.f32767a, campaignEx, str, -1);
                }
                boolean z10 = linkType == 8 || linkType == 9 || linkType == 4;
                String clickURL = campaignEx.getClickURL();
                if (!TextUtils.isEmpty(clickURL) && (clickURL.startsWith("market://") || clickURL.startsWith("https://play.google.com/"))) {
                    arrayList.add("google_play");
                    NativeListener.NativeTrackingListener nativeTrackingListener11 = this.f32772f;
                    if (nativeTrackingListener11 != null) {
                        nativeTrackingListener11.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    if (u0.a.a(this.f32770d, campaignEx.getClickURL(), this.f32772f)) {
                        a(jumpLoaderResultB, campaignEx, false);
                        NativeListener.NativeTrackingListener nativeTrackingListener12 = this.f32772f;
                        if (nativeTrackingListener12 != null) {
                            nativeTrackingListener12.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        a(campaignEx, 1, 1, arrayList);
                        return;
                    }
                    a(iB, campaignEx.getClickURL(), campaignEx, this.f32772f, arrayList);
                    a(jumpLoaderResultB, campaignEx, false);
                    NativeListener.NativeTrackingListener nativeTrackingListener13 = this.f32772f;
                    if (nativeTrackingListener13 != null) {
                        nativeTrackingListener13.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                if (!z10) {
                    if (linkType == 2) {
                        if (com.mbridge.msdk.util.b.a()) {
                            a(campaignEx, false, Boolean.TRUE, (List<String>) arrayList);
                            return;
                        } else {
                            a(campaignEx, false, (Boolean) null, (List<String>) arrayList);
                            return;
                        }
                    }
                    if (linkType == 3) {
                        arrayList.add("apk");
                        if (com.mbridge.msdk.util.b.a()) {
                            a(campaignEx, false, Boolean.TRUE, (List<String>) arrayList);
                            a(campaignEx, 2, 1, arrayList);
                            return;
                        } else {
                            a(campaignEx, false, (Boolean) null, (List<String>) arrayList);
                            return;
                        }
                    }
                    String clickURL2 = campaignEx.getClickURL();
                    NativeListener.NativeTrackingListener nativeTrackingListener14 = this.f32772f;
                    if (nativeTrackingListener14 != null) {
                        nativeTrackingListener14.onStartRedirection(campaignEx, clickURL2);
                    }
                    if (TextUtils.isEmpty(clickURL2)) {
                        NativeListener.NativeTrackingListener nativeTrackingListener15 = this.f32772f;
                        if (nativeTrackingListener15 != null) {
                            nativeTrackingListener15.onRedirectionFailed(campaignEx, clickURL2);
                        }
                        a(jumpLoaderResultB, campaignEx, true);
                        return;
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener16 = this.f32772f;
                    if (nativeTrackingListener16 != null) {
                        nativeTrackingListener16.onFinishRedirection(campaignEx, clickURL2);
                    }
                    u0.a(this.f32770d, clickURL2, this.f32772f, campaignEx, arrayList);
                    if (com.mbridge.msdk.util.b.a()) {
                        a(jumpLoaderResultB, campaignEx, false);
                        return;
                    } else {
                        a(jumpLoaderResultB, campaignEx, true);
                        return;
                    }
                }
                String clickURL3 = campaignEx.getClickURL();
                NativeListener.NativeTrackingListener nativeTrackingListener17 = this.f32772f;
                if (nativeTrackingListener17 != null) {
                    nativeTrackingListener17.onStartRedirection(campaignEx, clickURL3);
                }
                if (TextUtils.isEmpty(clickURL3)) {
                    NativeListener.NativeTrackingListener nativeTrackingListener18 = this.f32772f;
                    if (nativeTrackingListener18 != null) {
                        nativeTrackingListener18.onRedirectionFailed(campaignEx, clickURL3);
                    }
                    a(jumpLoaderResultB, campaignEx, true);
                    return;
                }
                if (linkType == 8) {
                    if (campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                        BaseTrackingListener baseTrackingListener = this.f32772f;
                        if (baseTrackingListener == null && (baseTrackingListener = this.f32779m) != null) {
                            baseTrackingListener.onStartRedirection(campaignEx, clickURL3);
                        }
                        u0.a(this.f32770d, clickURL3, campaignEx, this, baseTrackingListener, arrayList);
                    } else {
                        u0.a(this.f32770d, clickURL3, campaignEx, this.f32772f, arrayList);
                        NativeListener.NativeTrackingListener nativeTrackingListener19 = this.f32772f;
                        if (nativeTrackingListener19 != null) {
                            nativeTrackingListener19.onFinishRedirection(campaignEx, clickURL3);
                        }
                    }
                    a(jumpLoaderResultB, campaignEx, false);
                    return;
                }
                if (linkType == 9) {
                    u0.a(this.f32770d, clickURL3, this.f32772f, campaignEx, arrayList);
                    a(jumpLoaderResultB, campaignEx, false);
                    NativeListener.NativeTrackingListener nativeTrackingListener20 = this.f32772f;
                    if (nativeTrackingListener20 != null) {
                        nativeTrackingListener20.onFinishRedirection(campaignEx, clickURL3);
                        return;
                    }
                    return;
                }
                if (linkType == 4) {
                    if (iB == 2) {
                        u0.a(this.f32770d, clickURL3, campaignEx, this.f32772f, arrayList);
                    } else {
                        u0.a(this.f32770d, clickURL3, this.f32772f, campaignEx, arrayList);
                    }
                }
                NativeListener.NativeTrackingListener nativeTrackingListener21 = this.f32772f;
                if (nativeTrackingListener21 != null) {
                    nativeTrackingListener21.onFinishRedirection(campaignEx, clickURL3);
                }
                a(jumpLoaderResultB, campaignEx, false);
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", th2.getMessage(), th2);
            }
        }
    }

    private AppletSchemeCallBack a(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        return new h(nativeTrackingListener, campaignEx, appletsModel, aVar);
    }

    private void a(Context context, CampaignEx campaignEx, List<String> list) {
        if (context == null) {
            com.mbridge.msdk.foundation.same.report.j.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, 2, "context is null", this.f32767a);
            return;
        }
        boolean z10 = m0.E() == 1;
        boolean z11 = m0.D(context) == 1;
        if (z10 && z11) {
            String ghId = campaignEx.getGhId();
            String ghPath = campaignEx.getGhPath();
            String bindId = campaignEx.getBindId();
            String strJ = com.mbridge.msdk.foundation.controller.c.n().j();
            if (!TextUtils.isEmpty(ghId)) {
                try {
                    if (!TextUtils.isEmpty(strJ)) {
                        bindId = strJ;
                    }
                    Object objD = m0.d(bindId);
                    Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
                    Object objNewInstance = cls.newInstance();
                    cls.getField("userName").set(objNewInstance, ghId);
                    cls.getField("path").set(objNewInstance, ghPath);
                    cls.getField("miniprogramType").set(objNewInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
                    Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(objD, objNewInstance);
                    com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 1, "", this.f32767a);
                    return;
                } catch (Throwable th2) {
                    com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, th2.getMessage(), this.f32767a);
                    a(campaignEx, list);
                    return;
                }
            }
            a(campaignEx, list);
            com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, "ghid is empty", this.f32767a);
            return;
        }
        com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, "integrated:" + z10 + "-hasWx:" + z11, this.f32767a);
        a(campaignEx, list);
    }

    private void a(CampaignEx campaignEx, List<String> list) {
        if (b() == 2) {
            u0.a(this.f32770d, campaignEx.getClickURL(), campaignEx, this.f32772f, list);
        } else {
            u0.a(this.f32770d, campaignEx.getClickURL(), this.f32772f, campaignEx, list);
        }
    }

    private void a(CampaignEx campaignEx, boolean z10, Boolean bool, List<String> list) {
        boolean z11;
        try {
            this.f32768b = System.currentTimeMillis();
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f32772f;
            if (nativeTrackingListener == null || z10) {
                z11 = true;
            } else {
                nativeTrackingListener.onStartRedirection(campaignEx, campaignEx.getClickURL());
                z11 = !this.f32772f.onInterceptDefaultLoadingDialog();
            }
            boolean z12 = true;
            this.f32778l = false;
            if (campaignEx.getJumpResult() != null) {
                if (!z10) {
                    a(campaignEx, campaignEx.getJumpResult(), true, this.f32776j, bool, list);
                }
                this.f32778l = true;
                this.f32776j = false;
                z12 = false;
            }
            if (!com.mbridge.msdk.foundation.db.d.a(this.f32769c).c(campaignEx.getId(), this.f32767a) || campaignEx.getJumpResult() == null) {
                com.mbridge.msdk.foundation.db.d dVarA = com.mbridge.msdk.foundation.db.d.a(this.f32769c);
                dVarA.d();
                JumpLoaderResult jumpLoaderResultB = dVarA.b(campaignEx.getId(), this.f32767a);
                if (jumpLoaderResultB != null && !z10) {
                    campaignEx.setJumpResult(jumpLoaderResultB);
                    if (z12) {
                        a(campaignEx, jumpLoaderResultB, z12, this.f32776j, bool, list);
                        this.f32778l = true;
                        this.f32776j = false;
                        z12 = false;
                    }
                } else {
                    if (campaignEx.getClick_mode().equals("6") && !campaignEx.getPackageName().isEmpty() && campaignEx.getLinkType() == 2 && !z10) {
                        boolean zA = u0.a.a(this.f32770d, "market://details?id=" + campaignEx.getPackageName(), this.f32772f);
                        if (list != null) {
                            list.add("google_play");
                        }
                        if (zA) {
                            a(campaignEx, 1, 1, list);
                        }
                        NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f32772f;
                        if (nativeTrackingListener2 != null && z12) {
                            nativeTrackingListener2.onDismissLoading(campaignEx);
                            this.f32772f.onFinishRedirection(campaignEx, null);
                        }
                        this.f32778l = true;
                        z12 = false;
                    }
                    if (z10) {
                        this.f32778l = true;
                        this.f32776j = false;
                        z12 = false;
                    }
                }
                new Handler(Looper.getMainLooper()).post(new c(z11, z10, campaignEx));
                com.mbridge.msdk.click.e eVar = this.f32771e;
                if (eVar != null) {
                    eVar.a();
                }
                Set<String> set = f32766p;
                if (set != null && set.contains(campaignEx.getId())) {
                    NativeListener.NativeTrackingListener nativeTrackingListener3 = this.f32772f;
                    if (nativeTrackingListener3 != null) {
                        nativeTrackingListener3.onDismissLoading(campaignEx);
                        this.f32772f.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                Set<String> set2 = f32766p;
                if (set2 != null) {
                    set2.add(campaignEx.getId());
                }
                com.mbridge.msdk.click.e eVar2 = new com.mbridge.msdk.click.e(this.f32770d);
                this.f32771e = eVar2;
                eVar2.a(this.f32767a, campaignEx, new d(campaignEx, z12, bool, list, z11));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, Campaign campaign) {
        new Handler(Looper.getMainLooper()).post(new e(z10, campaign));
    }

    public void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, int i10, boolean z10) {
        if (campaignEx == null || jumpLoaderResult == null) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f32768b;
            com.mbridge.msdk.foundation.entity.e eVar = new com.mbridge.msdk.foundation.entity.e();
            int iS = m0.s(this.f32770d);
            eVar.e(iS);
            eVar.h(m0.a(this.f32770d, iS));
            eVar.i(campaignEx.getRequestId());
            eVar.j(campaignEx.getRequestIdNotice());
            eVar.a(i10);
            eVar.c(jCurrentTimeMillis + "");
            eVar.a(campaignEx.getId());
            eVar.f(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.g(URLEncoder.encode(jumpLoaderResult.getUrl(), G5.N));
            }
            eVar.b((this.f32768b / 1000) + "");
            eVar.c(Integer.parseInt(campaignEx.getLandingType()));
            eVar.d(campaignEx.getLinkType());
            eVar.k(this.f32767a);
            eVar.f(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.g(URLEncoder.encode(jumpLoaderResult.getUrl(), G5.N));
            }
            if (this.f32775i) {
                eVar.b(jumpLoaderResult.getStatusCode());
                if (!TextUtils.isEmpty(jumpLoaderResult.getHeader())) {
                    eVar.f(URLEncoder.encode(jumpLoaderResult.getHeader(), G5.N));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                    eVar.d(URLEncoder.encode(jumpLoaderResult.getContent(), "UTF-8"));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getExceptionMsg())) {
                    eVar.e(URLEncoder.encode(jumpLoaderResult.getExceptionMsg(), G5.N));
                }
            }
            if (z10) {
                this.f32773g.a("click_jump_error", eVar, this.f32767a);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(eVar);
            ArrayList<JSONObject> arrayListA = com.mbridge.msdk.foundation.entity.e.a(arrayList);
            if (arrayListA == null || arrayListA.isEmpty()) {
                return;
            }
            Iterator<JSONObject> it = arrayListA.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(it.next());
            }
        } catch (Throwable th2) {
            q0.b("CommonClickControl", th2.getMessage());
        }
    }

    public void a(Campaign campaign, String str) {
        try {
            if (!TextUtils.isEmpty(str) && campaign != null) {
                CampaignEx campaignEx = campaign instanceof CampaignEx ? (CampaignEx) campaign : null;
                if (!str.startsWith("market://") && !str.startsWith("https://play.google.com/")) {
                    com.mbridge.msdk.click.b.a(str, this.f32770d, this.f32767a, campaignEx, this.f32772f);
                    return;
                }
                if (u0.a.a(this.f32770d, str, this.f32772f) || campaignEx == null) {
                    return;
                }
                if (!TextUtils.isEmpty(campaignEx.getPackageName())) {
                    u0.a.a(this.f32770d, "market://details?id=" + campaignEx.getPackageName(), this.f32772f);
                    return;
                }
                if (b() == 2) {
                    u0.a(this.f32770d, campaignEx.getClickURL(), campaignEx, this.f32772f, new ArrayList());
                } else {
                    u0.a(this.f32770d, campaignEx.getClickURL(), this.f32772f, campaignEx, new ArrayList());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, boolean z10) {
        a(jumpLoaderResult, campaignEx, 1, z10);
    }

    private void a(int i10, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (i10 == 2) {
                    u0.a(this.f32770d, str, campaignEx, nativeTrackingListener, list);
                } else {
                    u0.a(this.f32770d, str, nativeTrackingListener, campaignEx, list);
                }
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", th2.getMessage(), th2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007d A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:4:0x0004, B:6:0x000e, B:9:0x001d, B:11:0x002a, B:13:0x0030, B:21:0x005d, B:22:0x006b, B:26:0x007d, B:28:0x0084, B:29:0x008c, B:32:0x0095), top: B:38:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0084 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:4:0x0004, B:6:0x000e, B:9:0x001d, B:11:0x002a, B:13:0x0030, B:21:0x005d, B:22:0x006b, B:26:0x007d, B:28:0x0084, B:29:0x008c, B:32:0x0095), top: B:38:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x008c A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:4:0x0004, B:6:0x000e, B:9:0x001d, B:11:0x002a, B:13:0x0030, B:21:0x005d, B:22:0x006b, B:26:0x007d, B:28:0x0084, B:29:0x008c, B:32:0x0095), top: B:38:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0093 A[ADDED_TO_REGION] */
    private boolean a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z10, int i10, List<String> list) {
        NativeListener.NativeTrackingListener nativeTrackingListener;
        NativeListener.NativeTrackingListener nativeTrackingListener2;
        boolean z11 = false;
        if (z10) {
            try {
                int i11 = Integer.parseInt(campaignEx.getLandingType());
                if (i11 == 1) {
                    u0.a(this.f32770d, jumpLoaderResult.getUrl(), this.f32772f, campaignEx, list);
                } else if (i11 == 2) {
                    u0.a(this.f32770d, jumpLoaderResult.getUrl(), campaignEx, this.f32772f, list);
                } else {
                    if (campaignEx.getPackageName() != null) {
                        if (u0.a.a(this.f32770d, "market://details?id=" + campaignEx.getPackageName(), this.f32772f)) {
                            if (list != null) {
                                try {
                                    list.add("google_play");
                                } catch (Throwable th2) {
                                    th = th2;
                                    z11 = true;
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("CommonClickControl", th.getMessage(), th);
                                    }
                                }
                            }
                            a(campaignEx, 1, 1, list);
                        } else {
                            a(i10, jumpLoaderResult.getUrl(), campaignEx, this.f32772f, list);
                        }
                    } else {
                        a(i10, jumpLoaderResult.getUrl(), campaignEx, this.f32772f, list);
                    }
                    if (z11) {
                        a(jumpLoaderResult, campaignEx, true);
                        nativeTrackingListener2 = this.f32772f;
                        if (nativeTrackingListener2 != null) {
                            nativeTrackingListener2.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                        }
                    } else {
                        a(jumpLoaderResult, campaignEx, true);
                        nativeTrackingListener = this.f32772f;
                        if (nativeTrackingListener != null && z10) {
                            nativeTrackingListener.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
                        }
                    }
                }
                z11 = true;
                if (z11) {
                    a(jumpLoaderResult, campaignEx, true);
                    nativeTrackingListener2 = this.f32772f;
                    if (nativeTrackingListener2 != null) {
                        nativeTrackingListener2.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                    }
                } else {
                    a(jumpLoaderResult, campaignEx, true);
                    nativeTrackingListener = this.f32772f;
                    if (nativeTrackingListener != null) {
                        nativeTrackingListener.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else if (z11) {
            a(jumpLoaderResult, campaignEx, true);
            nativeTrackingListener2 = this.f32772f;
            if (nativeTrackingListener2 != null) {
                nativeTrackingListener2.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
            }
        } else {
            a(jumpLoaderResult, campaignEx, true);
            nativeTrackingListener = this.f32772f;
            if (nativeTrackingListener != null) {
                nativeTrackingListener.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:4:0x0004, B:6:0x000a, B:7:0x0017, B:8:0x0023, B:10:0x0028, B:12:0x002c, B:13:0x0034, B:15:0x003a, B:16:0x003d, B:18:0x0041), top: B:25:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x002c A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:4:0x0004, B:6:0x000a, B:7:0x0017, B:8:0x0023, B:10:0x0028, B:12:0x002c, B:13:0x0034, B:15:0x003a, B:16:0x003d, B:18:0x0041), top: B:25:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:4:0x0004, B:6:0x000a, B:7:0x0017, B:8:0x0023, B:10:0x0028, B:12:0x002c, B:13:0x0034, B:15:0x003a, B:16:0x003d, B:18:0x0041), top: B:25:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x003a A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:4:0x0004, B:6:0x000a, B:7:0x0017, B:8:0x0023, B:10:0x0028, B:12:0x002c, B:13:0x0034, B:15:0x003a, B:16:0x003d, B:18:0x0041), top: B:25:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #0 {all -> 0x0049, blocks: (B:4:0x0004, B:6:0x000a, B:7:0x0017, B:8:0x0023, B:10:0x0028, B:12:0x002c, B:13:0x0034, B:15:0x003a, B:16:0x003d, B:18:0x0041), top: B:25:0x0004 }] */
    private boolean a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z10, List<String> list) {
        NativeListener.NativeTrackingListener nativeTrackingListener;
        NativeListener.NativeTrackingListener nativeTrackingListener2;
        boolean z11 = false;
        if (z10) {
            try {
                if (com.mbridge.msdk.util.b.a()) {
                    com.mbridge.msdk.click.b.a(this.f32770d, this.f32767a, campaignEx, campaignEx.getNoticeUrl(), com.mbridge.msdk.foundation.same.a.M);
                }
                u0.a(this.f32770d, campaignEx.getClickURL(), this.f32772f, campaignEx, list);
                z11 = true;
                a(jumpLoaderResult, campaignEx, true);
                if (z11) {
                    nativeTrackingListener2 = this.f32772f;
                    if (nativeTrackingListener2 != null) {
                        nativeTrackingListener2.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                    }
                } else {
                    if (com.mbridge.msdk.util.b.a()) {
                        a(jumpLoaderResult, campaignEx, true);
                    }
                    nativeTrackingListener = this.f32772f;
                    if (nativeTrackingListener != null) {
                        nativeTrackingListener.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
                    }
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonClickControl", th2.getMessage(), th2);
                }
            }
        } else {
            a(jumpLoaderResult, campaignEx, true);
            if (z11) {
                nativeTrackingListener2 = this.f32772f;
                if (nativeTrackingListener2 != null) {
                    nativeTrackingListener2.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                }
            } else {
                if (com.mbridge.msdk.util.b.a()) {
                    a(jumpLoaderResult, campaignEx, true);
                }
                nativeTrackingListener = this.f32772f;
                if (nativeTrackingListener != null) {
                    nativeTrackingListener.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
                }
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x00f0 A[Catch: Exception -> 0x01a9, TryCatch #0 {Exception -> 0x01a9, blocks: (B:3:0x000a, B:6:0x000f, B:10:0x0019, B:12:0x0023, B:14:0x0029, B:16:0x003b, B:19:0x0049, B:21:0x004f, B:24:0x0063, B:26:0x0067, B:28:0x0079, B:31:0x0083, B:33:0x008d, B:35:0x0097, B:38:0x00a7, B:40:0x00b5, B:47:0x00ff, B:50:0x0105, B:73:0x0174, B:75:0x0182, B:77:0x018a, B:81:0x0192, B:76:0x0187, B:42:0x00c7, B:44:0x00d1, B:46:0x00f0, B:54:0x0113, B:56:0x012a, B:59:0x0130, B:62:0x013c, B:64:0x0142, B:66:0x0146, B:68:0x014c, B:70:0x015e, B:72:0x016d, B:84:0x019d, B:86:0x01a4), top: B:91:0x000a }] */
    public void a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z10, boolean z11, Boolean bool, List<String> list) {
        try {
            if (this.f32777k) {
                com.mbridge.msdk.click.b.a();
                boolean z12 = true;
                if (campaignEx != null && jumpLoaderResult != null) {
                    int iB = b();
                    int code = jumpLoaderResult.getCode();
                    if (bool != null && !bool.booleanValue()) {
                        com.mbridge.msdk.click.b.a(jumpLoaderResult, this.f32770d, this.f32767a, campaignEx, Boolean.FALSE, this.f32772f, list);
                        return;
                    }
                    if (TextUtils.isEmpty(jumpLoaderResult.getUrl()) && z10) {
                        int linkType = campaignEx.getLinkType();
                        if (linkType == 2) {
                            a(campaignEx, jumpLoaderResult, z10, b(), list);
                            return;
                        }
                        if (linkType == 3) {
                            a(campaignEx, jumpLoaderResult, z10, list);
                            return;
                        }
                        u0.a(this.f32770d, campaignEx.getClickURL(), this.f32772f, campaignEx, list);
                        a(jumpLoaderResult, campaignEx, true);
                        NativeListener.NativeTrackingListener nativeTrackingListener = this.f32772f;
                        if (nativeTrackingListener != null) {
                            nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                            return;
                        }
                        return;
                    }
                    if (code == 1) {
                        if (TextUtils.isEmpty(campaignEx.getPackageName()) || TextUtils.isEmpty(jumpLoaderResult.getUrl()) || !jumpLoaderResult.getUrl().contains(campaignEx.getPackageName()) || !z10) {
                            if (z10) {
                                if (TextUtils.isEmpty(campaignEx.getPackageName())) {
                                    a(iB, jumpLoaderResult.getUrl(), campaignEx, this.f32772f, list);
                                } else {
                                    if (!u0.a.a(this.f32770d, "market://details?id=" + campaignEx.getPackageName(), this.f32772f)) {
                                        a(iB, jumpLoaderResult.getUrl(), campaignEx, this.f32772f, list);
                                    }
                                }
                            }
                        } else if (!u0.a.a(this.f32770d, jumpLoaderResult.getUrl(), this.f32772f)) {
                            a(iB, jumpLoaderResult.getUrl(), campaignEx, this.f32772f, list);
                        }
                        NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f32772f;
                        if (nativeTrackingListener2 != null && z10) {
                            nativeTrackingListener2.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                        }
                        z12 = true;
                    } else if (code == 3) {
                        if (z10) {
                            com.mbridge.msdk.click.b.a(this.f32770d, campaignEx, this.f32767a, jumpLoaderResult, bool, this.f32772f, list);
                        }
                        NativeListener.NativeTrackingListener nativeTrackingListener3 = this.f32772f;
                        if (nativeTrackingListener3 != null && z10) {
                            nativeTrackingListener3.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                        }
                    } else {
                        z12 = true;
                        if (z10) {
                            if (3 == campaignEx.getLinkType()) {
                                a(campaignEx, jumpLoaderResult, z10, list);
                                return;
                            } else {
                                if (2 == campaignEx.getLinkType()) {
                                    a(campaignEx, jumpLoaderResult, z10, b(), list);
                                    return;
                                }
                                u0.a(this.f32770d, jumpLoaderResult.getUrl(), this.f32772f, campaignEx, list);
                                NativeListener.NativeTrackingListener nativeTrackingListener4 = this.f32772f;
                                if (nativeTrackingListener4 != null) {
                                    nativeTrackingListener4.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                                }
                            }
                        }
                    }
                    if (a(campaignEx.getLinkType(), jumpLoaderResult.getUrl())) {
                        a(jumpLoaderResult, campaignEx, false);
                    } else {
                        a(jumpLoaderResult, campaignEx, z12);
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener5 = this.f32772f;
                    if (nativeTrackingListener5 == null || z10 || !z11) {
                        return;
                    }
                    nativeTrackingListener5.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                    return;
                }
                if (z10) {
                    a(jumpLoaderResult, campaignEx, true);
                    NativeListener.NativeTrackingListener nativeTrackingListener6 = this.f32772f;
                    if (nativeTrackingListener6 != null) {
                        nativeTrackingListener6.onRedirectionFailed(null, null);
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0016 -> B:14:0x0017). Please report as a decompilation issue!!! */
    private boolean a(int i10, String str) {
        boolean z10;
        try {
            if (i10 == 2) {
                if (u0.a.b(str)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (TextUtils.isEmpty(str)) {
                z10 = false;
            } else {
                z10 = true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            this.f32770d.sendBroadcast(intent);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", "Exception", e10);
            }
        }
    }

    private void a(CampaignEx campaignEx, int i10, int i11, List<String> list) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", Integer.valueOf(i10));
            eVar.a("result", Integer.valueOf(i11));
            if (list != null) {
                eVar.a("click_path", list.toString());
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000150", campaignEx, eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonClickControl", e10.getMessage());
            }
        }
    }
}
