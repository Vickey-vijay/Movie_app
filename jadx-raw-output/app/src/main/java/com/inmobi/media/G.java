package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3095p1 f22692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f22693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MetaInfo f22695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f22697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f22698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ContextData f22699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f22700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f22701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f22702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final JSONObject f22703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final F f22704m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final E f22705n;

    public G(D d10, String str, MetaInfo metaInfo, String str2, String str3, List list, List list2, ContextData contextData, String str4, long j10, long j11, JSONObject jSONObject, F f10, E e10, C3095p1 c3095p1) {
        ck.p.j(d10, "adSetContext");
        ck.p.j(str, "markupType");
        ck.p.j(str2, "creativeId");
        ck.p.j(str3, "tracking");
        ck.p.j(list, "trackers");
        ck.p.j(list2, "trackingInfo");
        ck.p.j(jSONObject, "transactionInfo");
        ck.p.j(f10, "viewability");
        ck.p.j(e10, "mrc50");
        ck.p.j(c3095p1, "adManagerContext");
        this.f22692a = c3095p1;
        this.f22693b = d10;
        this.f22694c = str;
        this.f22695d = metaInfo;
        this.f22696e = str2;
        this.f22697f = list;
        this.f22698g = list2;
        this.f22699h = contextData;
        this.f22700i = str4;
        this.f22701j = j10;
        this.f22702k = j11;
        this.f22703l = jSONObject;
        this.f22704m = f10;
        this.f22705n = e10;
    }
}
