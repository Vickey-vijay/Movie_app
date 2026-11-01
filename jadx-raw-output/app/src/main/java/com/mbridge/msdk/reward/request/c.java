package com.mbridge.msdk.reward.request;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: RewardResponseHandler.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f36776d = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.metrics.c f36779c;

    /* JADX INFO: compiled from: RewardResponseHandler.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f36780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f36781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f36782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f36783d;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.request.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardResponseHandler.java */
        public class RunnableC0375a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignUnit f36785a;

            public RunnableC0375a(CampaignUnit campaignUnit) {
                this.f36785a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f36785a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f36785a.getAds().size() > 0) {
                    this.f36785a.setMetricsData(c.this.f36779c);
                    a aVar = a.this;
                    c.this.a(aVar.f36782c, this.f36785a);
                    c.this.saveRequestTime(this.f36785a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f36785a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = a.this.f36781b.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                a aVar2 = a.this;
                c cVar = c.this;
                cVar.a(aVar2.f36783d, msg, cVar.f36779c);
            }
        }

        public a(String str, JSONObject jSONObject, List list, int i10) {
            this.f36780a = str;
            this.f36781b = jSONObject;
            this.f36782c = list;
            this.f36783d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0375a("v5".equals(this.f36780a) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(this.f36781b.optJSONObject("data"), c.this.f36778b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(this.f36781b.optJSONObject("data"), c.this.f36778b)));
        }
    }

    public abstract void a(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar);

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    private void b(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(list, jSONObject, iOptInt, this.f36779c);
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject.optString("version"), jSONObject, list, iOptInt));
    }

    public void a(String str) {
        this.f36778b = str;
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f36776d, "errorCode = " + aVar.f34991a);
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(aVar.f34991a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
        bVar.a("campaign_request_error", aVar);
        bVar.a(aVar.f34992b);
        this.f36779c.a(bVar);
        a(aVar.f34991a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar), this.f36779c);
    }

    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        this.f36779c = cVar;
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar != null && (aVar = eVar.f34989b) != null) {
            int i10 = this.f36777a;
            if (i10 == 0) {
                b(aVar.f35012b, eVar.f34990c);
            } else if (i10 == 1) {
                a(aVar.f35012b, eVar.f34990c);
            }
        }
    }

    private void a(List<g> list, JSONObject jSONObject) {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f36778b);
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f36778b);
            }
            if (campaignUnit != null && campaignUnit.getListFrames() != null && campaignUnit.getListFrames().size() > 0) {
                List<Frame> listFrames = campaignUnit.getListFrames();
                a(listFrames);
                saveRequestTime(listFrames.size());
                return;
            } else {
                String msg = campaignUnit != null ? campaignUnit.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                a(iOptInt, msg, this.f36779c);
                return;
            }
        }
        a(list, jSONObject, iOptInt, this.f36779c);
    }

    private void a(List<g> list, JSONObject jSONObject, int i10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.error.b bVarA;
        String strB = "";
        if (list != null && list.size() > 0) {
            for (g gVar : list) {
                if (gVar != null) {
                    String strA = gVar.a();
                    if (!TextUtils.isEmpty(strA) && strA.equals("data_res_type")) {
                        strB = gVar.b();
                    }
                }
            }
        }
        String strL = "errorCode: 3507 errorMessage: data load failed, errorMsg is " + jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
        if (!TextUtils.isEmpty(strB) && strB.equals("1")) {
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880018, strL);
            if (cVar != null) {
                cVar.a(bVarA2);
                cVar.c(true);
                if (TextUtils.isEmpty(strL)) {
                    strL = bVarA2.l();
                }
            }
            a(i10, strL, cVar);
            return;
        }
        if (i10 == -1) {
            bVarA = com.mbridge.msdk.foundation.error.a.a(880017, strL);
        } else {
            bVarA = com.mbridge.msdk.foundation.error.a.a(880003, strL);
        }
        if (cVar != null) {
            cVar.a(bVarA);
            cVar.c(false);
            if (TextUtils.isEmpty(strL)) {
                strL = bVarA.l();
            }
        }
        a(i10, strL, cVar);
    }
}
