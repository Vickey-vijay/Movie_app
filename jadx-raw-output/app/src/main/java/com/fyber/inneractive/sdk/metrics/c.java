package com.fyber.inneractive.sdk.metrics;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f15840g = String.valueOf(24);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f15841h = String.valueOf(3);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f15842i = String.valueOf(24);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f15843j = String.valueOf(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UnitDisplayType f15845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f15846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InneractiveAdRequest f15847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JSONArray f15848f;

    public c(com.fyber.inneractive.sdk.response.e eVar, InneractiveAdRequest inneractiveAdRequest, String str, UnitDisplayType unitDisplayType, JSONArray jSONArray) {
        super("send_metric_report");
        this.f15846d = eVar;
        this.f15847e = inneractiveAdRequest;
        this.f15844b = str;
        this.f15845c = unitDisplayType;
        this.f15848f = jSONArray;
    }

    public final void a() {
        d dVar = d.f15849d;
        g gVarA = dVar.a(this.f15844b);
        HashMap mapJ = gVarA.j();
        if (!gVarA.a()) {
            IAlog.a("MetricCreativeReporter: Metric data not valid, data: %s", dVar.a(this.f15844b).toString());
        } else {
            dVar.f15850a.remove(this.f15844b);
            r.f18606a.execute(new b(this, gVarA, mapJ));
        }
    }
}
