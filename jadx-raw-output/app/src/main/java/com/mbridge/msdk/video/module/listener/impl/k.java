package com.mbridge.msdk.video.module.listener.impl;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: StatisticsOnNotifyListener.java */
/* JADX INFO: loaded from: classes10.dex */
public class k extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f39066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CampaignEx f39067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<CampaignEx> f39068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.mbridge.msdk.videocommon.download.a f39070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.mbridge.msdk.videocommon.entity.c f39071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f39072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f39073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.mbridge.msdk.video.module.listener.a f39074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f39075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f39076k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f39077l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f39078m = false;

    /* JADX INFO: compiled from: StatisticsOnNotifyListener.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k kVar = k.this;
                if (!kVar.f39066a || kVar.f39067b == null || !a1.b(kVar.f39072g) || com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                    return;
                }
                com.mbridge.msdk.foundation.db.i iVarA = com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
                fVar.a(System.currentTimeMillis());
                fVar.b(k.this.f39072g);
                fVar.a(k.this.f39067b.getId());
                iVarA.a(fVar);
            } catch (Throwable th2) {
                q0.b("NotifyListener", th2.getMessage(), th2);
            }
        }
    }

    /* JADX INFO: compiled from: StatisticsOnNotifyListener.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k kVar = k.this;
                if (kVar.f39066a && kVar.f39067b != null && a1.b(kVar.f39072g)) {
                    com.mbridge.msdk.videocommon.cache.a aVarA = com.mbridge.msdk.videocommon.cache.a.a();
                    k kVar2 = k.this;
                    aVarA.a(kVar2.f39067b, kVar2.f39072g);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
            try {
                com.mbridge.msdk.videocommon.cache.a aVarA2 = com.mbridge.msdk.videocommon.cache.a.a();
                k kVar3 = k.this;
                aVarA2.b(kVar3.f39073h, kVar3.f39067b.getAdType());
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    e11.printStackTrace();
                }
            } catch (Throwable th2) {
                q0.a("NotifyListener", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: StatisticsOnNotifyListener.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).b(k.this.f39067b.getId());
            } catch (Throwable th2) {
                q0.b("NotifyListener", th2.getMessage(), th2);
            }
        }
    }

    /* JADX INFO: compiled from: StatisticsOnNotifyListener.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.videocommon.download.a aVar;
            try {
                if (s0.a().a("c_r_v_f_w_s_e", false)) {
                    return;
                }
                k kVar = k.this;
                if (kVar.f39066a && (aVar = kVar.f39070e) != null) {
                    if (aVar.h() != null && !TextUtils.isEmpty(k.this.f39070e.h().getVideoUrlEncode())) {
                        com.mbridge.msdk.foundation.db.m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(k.this.f39070e.h().getVideoUrlEncode());
                    }
                    if (!TextUtils.isEmpty(k.this.f39070e.p())) {
                        File file = new File(k.this.f39070e.p());
                        if (file.exists() && file.isFile() && file.delete()) {
                            q0.a("NotifyListener", "DEL File :" + file.getAbsolutePath());
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void a(CampaignEx campaignEx) {
        this.f39067b = campaignEx;
    }

    public void b(int i10) {
        if (this.f39067b != null) {
            if (i10 == 1 || i10 == 2) {
                com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39067b, i10, this.f39075j);
            }
        }
    }

    private void d() {
        if (!this.f39066a || com.mbridge.msdk.foundation.same.buffer.b.f34932k == null || TextUtils.isEmpty(this.f39067b.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f39072g, this.f39067b, "reward");
    }

    private void f() {
        if (this.f39067b != null) {
            try {
                HashMap map = new HashMap();
                List<com.mbridge.msdk.foundation.entity.d> listA = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f39067b.getCampaignUnitId(), this.f39067b.getRequestId());
                if (listA == null || listA.size() <= 0 || listA.get(0) == null) {
                    return;
                }
                if (listA.get(0).c() == 1) {
                    map.put("encrypt_p=", "encrypt_p=" + listA.get(0).b());
                    map.put("irlfa=", "irlfa=1");
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        CampaignEx campaignEx = this.f39067b;
                        campaignEx.setImpressionURL(campaignEx.getImpressionURL().replaceAll(str, str2));
                        CampaignEx campaignEx2 = this.f39067b;
                        campaignEx2.setOnlyImpressionURL(campaignEx2.getOnlyImpressionURL().replaceAll(str, str2));
                    }
                }
                q0.a("BidReplaceCampignDao", "removeReplace count " + com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f39067b.getRequestId()));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void m() {
        new Thread(new c()).start();
    }

    public void a(List<CampaignEx> list) {
        this.f39068c = list;
    }

    public void c() {
        a aVar = new a();
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    public void e() {
        d dVar = new d();
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(dVar);
        } else {
            dVar.run();
        }
    }

    public void g() {
        if (!this.f39066a || this.f39067b == null) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000061", this.f39067b.getId(), this.f39067b.getRequestId(), this.f39067b.getRequestIdNotice(), this.f39072g, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
        nVar.b(this.f39067b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
        com.mbridge.msdk.foundation.same.report.g.b(nVar, com.mbridge.msdk.foundation.controller.c.n().d(), this.f39072g);
    }

    public void h() {
        String str;
        try {
            if (!this.f39066a || this.f39076k || TextUtils.isEmpty(this.f39067b.getImpressionURL())) {
                return;
            }
            this.f39076k = true;
            if (this.f39067b.isBidCampaign()) {
                f();
            }
            String impressionURL = this.f39067b.getImpressionURL();
            if (this.f39067b.getSpareOfferFlag() == 1) {
                str = impressionURL + "&to=1&cbt=" + this.f39067b.getCbt() + "&tmorl=" + this.f39075j;
            } else {
                str = impressionURL + "&to=0&cbt=" + this.f39067b.getCbt() + "&tmorl=" + this.f39075j;
            }
            com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39067b, this.f39072g, str, false, true, com.mbridge.msdk.click.retry.a.f32916m);
            com.mbridge.msdk.video.module.report.b.d(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39067b);
            m();
            d();
        } catch (Throwable th2) {
            q0.b("NotifyListener", th2.getMessage(), th2);
        }
    }

    public void i() {
        CampaignEx campaignEx;
        Map<String, Long> map;
        String str;
        try {
            CampaignEx campaignEx2 = this.f39067b;
            if (campaignEx2 != null && campaignEx2.isDynamicView() && this.f39069d && !this.f39067b.isCampaignIsFiltered()) {
                this.f39077l = true;
                return;
            }
            if (!this.f39066a || (campaignEx = this.f39067b) == null || TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) || (map = com.mbridge.msdk.foundation.same.buffer.b.f34933l) == null || map.containsKey(this.f39067b.getOnlyImpressionURL()) || this.f39077l) {
                return;
            }
            com.mbridge.msdk.foundation.same.buffer.b.f34933l.put(this.f39067b.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
            String onlyImpressionURL = this.f39067b.getOnlyImpressionURL();
            if (this.f39067b.getSpareOfferFlag() == 1) {
                str = onlyImpressionURL + "&to=1&cbt=" + this.f39067b.getCbt() + "&tmorl=" + this.f39075j;
            } else {
                str = onlyImpressionURL + "&to=0&cbt=" + this.f39067b.getCbt() + "&tmorl=" + this.f39075j;
            }
            String str2 = str;
            if (!this.f39069d || this.f39067b.isCampaignIsFiltered()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39067b, this.f39072g, str2, false, true, com.mbridge.msdk.click.retry.a.f32917n);
                b();
            }
            this.f39077l = true;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void j() {
        CampaignEx campaignEx;
        List<String> pv_urls;
        try {
            if (!this.f39066a || this.f39078m || (campaignEx = this.f39067b) == null) {
                return;
            }
            this.f39078m = true;
            if ((campaignEx.isDynamicView() && this.f39069d && !this.f39067b.isCampaignIsFiltered()) || (pv_urls = this.f39067b.getPv_urls()) == null || pv_urls.size() <= 0) {
                return;
            }
            Iterator<String> it = pv_urls.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39067b, this.f39072g, it.next(), false, true);
            }
        } catch (Throwable th2) {
            q0.b("NotifyListener", th2.getMessage());
        }
    }

    public void k() {
        CampaignEx campaignEx = this.f39067b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getCampaignUnitId()) || this.f39067b.getNativeVideoTracking() == null || this.f39067b.getNativeVideoTracking().n() == null) {
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        CampaignEx campaignEx2 = this.f39067b;
        com.mbridge.msdk.click.a.a(contextD, campaignEx2, campaignEx2.getCampaignUnitId(), this.f39067b.getNativeVideoTracking().n(), false, false);
    }

    public void l() {
        com.mbridge.msdk.videocommon.download.a aVar = this.f39070e;
        if (aVar != null) {
            aVar.d(true);
        }
    }

    public k(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.entity.c cVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        this.f39069d = false;
        this.f39074i = new f();
        this.f39075j = 1;
        if (!z10 && campaignEx != null && a1.b(str2) && aVar != null && aVar2 != null) {
            this.f39067b = campaignEx;
            this.f39073h = str;
            this.f39072g = str2;
            this.f39070e = aVar;
            this.f39071f = cVar;
            this.f39074i = aVar2;
            this.f39066a = true;
            this.f39075j = i10;
            this.f39069d = false;
            return;
        }
        if (z10 && campaignEx != null && a1.b(str2) && aVar2 != null) {
            this.f39067b = campaignEx;
            this.f39073h = str;
            this.f39072g = str2;
            this.f39070e = aVar;
            this.f39071f = cVar;
            this.f39074i = aVar2;
            this.f39066a = true;
            this.f39075j = i10;
            this.f39069d = true;
        }
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        this.f39074i.a(i10, obj);
    }

    public void b() {
        try {
            b bVar = new b();
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(bVar);
            } else {
                bVar.run();
            }
        } catch (Throwable th2) {
            q0.b("NotifyListener", th2.getMessage(), th2);
        }
    }

    public void a(int i10, String str) {
        if (this.f39067b != null) {
            com.mbridge.msdk.foundation.same.report.g.c(new com.mbridge.msdk.foundation.entity.n("2000062", this.f39067b.getId(), this.f39067b.getRequestId(), this.f39067b.getRequestIdNotice(), this.f39072g, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()), i10, str), com.mbridge.msdk.foundation.controller.c.n().d(), this.f39072g);
        }
    }

    public void b(String str) {
        try {
            if (this.f39067b != null) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("url", this.f39067b.getVideoUrlEncode());
                eVar.a("reason", str);
                String noticeUrl = this.f39067b.getNoticeUrl();
                String clickURL = this.f39067b.getClickURL();
                if (TextUtils.isEmpty(noticeUrl)) {
                    if (!TextUtils.isEmpty(clickURL)) {
                        eVar.a("offer_url", clickURL);
                    }
                } else {
                    eVar.a("offer_url", noticeUrl);
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000021", this.f39067b, eVar);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        CampaignEx campaignEx = this.f39067b;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (i10 == 1 || i10 == 2) {
                if (!noticeUrl.contains("endscreen_type")) {
                    StringBuilder sb2 = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb2.append("&endscreen_type=");
                        sb2.append(i10);
                    } else {
                        sb2.append("?endscreen_type=");
                        sb2.append(i10);
                    }
                    noticeUrl = sb2.toString();
                } else if (i10 == 2) {
                    if (noticeUrl.contains("endscreen_type=1")) {
                        noticeUrl = noticeUrl.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (noticeUrl.contains("endscreen_type=2")) {
                    noticeUrl = noticeUrl.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.f39067b.setNoticeUrl(noticeUrl);
            }
        }
    }

    public void a() {
        com.mbridge.msdk.videocommon.download.b.getInstance().a(false);
    }

    public void a(String str) {
        List<CampaignEx> list;
        if (this.f39067b == null || (list = this.f39068c) == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("camp_position")) {
                this.f39067b = this.f39068c.get(jSONObject.getInt("camp_position"));
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("NotifyListener", e10.getMessage());
            }
        }
    }
}
