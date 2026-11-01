package com.mbridge.msdk.splash.request;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: SplashResponseHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f37156c = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37158b;

    /* JADX INFO: compiled from: SplashResponseHandler.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f37159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f37160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f37161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f37162d;

        /* JADX INFO: renamed from: com.mbridge.msdk.splash.request.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SplashResponseHandler.java */
        public class RunnableC0384a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignUnit f37164a;

            public RunnableC0384a(CampaignUnit campaignUnit) {
                this.f37164a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f37164a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f37164a.getAds().size() > 0) {
                    a aVar = a.this;
                    d.this.a(aVar.f37161c, this.f37164a);
                    d.this.saveRequestTime(this.f37164a.getAds().size());
                } else {
                    CampaignUnit campaignUnit2 = this.f37164a;
                    String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                    if (TextUtils.isEmpty(msg)) {
                        msg = a.this.f37160b.optString(NotificationCompat.CATEGORY_MESSAGE);
                    }
                    a aVar2 = a.this;
                    d.this.a(aVar2.f37162d, msg);
                }
            }
        }

        public a(String str, JSONObject jSONObject, List list, int i10) {
            this.f37159a = str;
            this.f37160b = jSONObject;
            this.f37161c = list;
            this.f37162d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0384a("v5".equals(this.f37159a) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(this.f37160b.optJSONObject("data"), d.this.f37158b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(this.f37160b.optJSONObject("data"), d.this.f37158b)));
        }
    }

    public abstract void a(int i10, String str);

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    private void b(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject.optString("version"), jSONObject, list, iOptInt));
    }

    public void a(String str) {
        this.f37158b = str;
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f37156c, "errorCode = " + aVar.f34991a);
        a(aVar.f34991a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    private void a(List<g> list, JSONObject jSONObject) {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f37158b);
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f37158b);
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
                a(iOptInt, msg);
                return;
            }
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar != null && (aVar = eVar.f34989b) != null) {
            int i10 = this.f37157a;
            if (i10 == 0) {
                b(aVar.f35012b, eVar.f34990c);
            } else if (i10 == 1) {
                a(aVar.f35012b, eVar.f34990c);
            }
        }
    }
}
