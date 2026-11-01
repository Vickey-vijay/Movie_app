package com.mbridge.msdk.mbbanner.common.response;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: BannerResponseHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a extends c<JSONObject> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35711b = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35712a = "";

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.response.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BannerResponseHandler.java */
    public class RunnableC0342a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f35714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f35715c;

        /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.response.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BannerResponseHandler.java */
        public class RunnableC0343a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignUnit f35717a;

            public RunnableC0343a(CampaignUnit campaignUnit) {
                this.f35717a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f35717a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f35717a.getAds().size() > 0) {
                    a.this.a(this.f35717a);
                    if (!TextUtils.isEmpty(a.this.f35712a)) {
                        a.this.saveHbState(1);
                    }
                    a.this.saveRequestTime(this.f35717a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f35717a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = RunnableC0342a.this.f35714b.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                RunnableC0342a runnableC0342a = RunnableC0342a.this;
                a.this.a(runnableC0342a.f35715c, msg);
            }
        }

        public RunnableC0342a(String str, JSONObject jSONObject, int i10) {
            this.f35713a = str;
            this.f35714b = jSONObject;
            this.f35715c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0343a("v5".equals(this.f35713a) ? b.parseV5CampaignUnit(this.f35714b.optJSONObject("data"), a.this.f35712a) : b.parseCampaignUnit(this.f35714b.optJSONObject("data"), a.this.f35712a)));
        }
    }

    public abstract void a(int i10, String str);

    public abstract void a(CampaignUnit campaignUnit);

    public void a(String str) {
        this.f35712a = str;
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.c(f35711b, "onFailed errorCode = " + aVar.f34991a);
        a(aVar.f34991a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    private void a(List<g> list, JSONObject jSONObject) {
        q0.c(f35711b, "parseLoad content = " + jSONObject);
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0342a(jSONObject.optString("version"), jSONObject, iOptInt));
            return;
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        super.onSuccess(eVar);
        a(eVar.f34989b.f35012b, eVar.f34990c);
    }
}
