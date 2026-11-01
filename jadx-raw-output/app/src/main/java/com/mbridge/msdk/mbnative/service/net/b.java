package com.mbridge.msdk.mbnative.service.net;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: NativeResponseHandler.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b extends c<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35983b;

    /* JADX INFO: compiled from: NativeResponseHandler.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f35985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f35986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f35987d;

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.service.net.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NativeResponseHandler.java */
        public class RunnableC0352a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignUnit f35989a;

            public RunnableC0352a(CampaignUnit campaignUnit) {
                this.f35989a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f35989a;
                if (campaignUnit == null || campaignUnit.getAds() == null || this.f35989a.getAds().size() <= 0) {
                    a aVar = a.this;
                    b.this.a(aVar.f35987d, aVar.f35985b.optString(NotificationCompat.CATEGORY_MESSAGE));
                } else {
                    a aVar2 = a.this;
                    b.this.a(aVar2.f35986c, this.f35989a);
                    b.this.saveRequestTime(this.f35989a.getAds().size());
                }
            }
        }

        public a(String str, JSONObject jSONObject, List list, int i10) {
            this.f35984a = str;
            this.f35985b = jSONObject;
            this.f35986c = list;
            this.f35987d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0352a("v5".equals(this.f35984a) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(this.f35985b.optJSONObject("data")) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(this.f35985b.optJSONObject("data"))));
        }
    }

    public abstract void a(int i10, String str);

    public void a(String str) {
        this.f35983b = str;
    }

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    public String b() {
        return this.f35983b;
    }

    private void b(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject.optString("version"), jSONObject, list, iOptInt));
    }

    public void a(int i10) {
        this.f35982a = i10;
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        a(aVar.f34991a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    public int a() {
        return this.f35982a;
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
            int i10 = this.f35982a;
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
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"));
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"));
            }
            if (campaignUnit != null && campaignUnit.getListFrames() != null && campaignUnit.getListFrames().size() > 0) {
                a(campaignUnit.getListFrames());
                saveRequestTime(campaignUnit.getListFrames().size());
                return;
            } else {
                a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
                return;
            }
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }
}
