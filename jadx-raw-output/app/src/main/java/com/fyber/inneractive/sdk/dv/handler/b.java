package com.fyber.inneractive.sdk.dv.handler;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f15240a;

    public b(c cVar) {
        this.f15240a = cVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        c cVar = this.f15240a;
        e eVar = cVar.f15242b;
        if (eVar.f15246b) {
            return;
        }
        AdFormat adFormat = cVar.f15241a;
        IAlog.a("Firing Event 1000 - Fetch error DV - msg  " + str, new Object[0]);
        w wVar = new w(t.FETCH_TOKEN_DV_ERROR, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null);
        wVar.f16132f.put(new x().a(str, "message").a(e.b(), "version").a(adFormat.name(), "adFormat").a(Integer.valueOf(eVar.f15248d), "success_count").f16134a);
        wVar.a((String) null);
        this.f15240a.f15242b.f15246b = true;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        IAlog.a("DVHanlder - %s - put query: %s", this.f15240a.f15241a.toString(), queryInfo.getQuery());
        synchronized (this.f15240a.f15242b.f15247c) {
            c cVar = this.f15240a;
            e eVar = cVar.f15242b;
            eVar.f15248d++;
            eVar.f15245a.put(cVar.f15241a, queryInfo);
        }
    }
}
