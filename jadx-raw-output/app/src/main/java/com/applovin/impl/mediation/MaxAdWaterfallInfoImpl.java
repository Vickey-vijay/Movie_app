package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.a3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y2 f8004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f8007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f8008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a3 f8009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f8010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f8011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f8012i;

    public MaxAdWaterfallInfoImpl(y2 y2Var, long j10, List<MaxNetworkResponseInfo> list, String str) {
        this(y2Var, y2Var.U(), y2Var.V(), j10, list, y2Var.N(), y2Var.T(), str, y2Var.Q());
    }

    public String getEventId() {
        return this.f8012i;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f8008e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f8004a;
    }

    public String getMCode() {
        return this.f8011h;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f8005b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f8007d;
    }

    public List<String> getPostbackUrls() {
        return this.f8010g;
    }

    public a3 getRequestParameters() {
        return this.f8009f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f8006c;
    }

    @NonNull
    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f8005b + ", testName=" + this.f8006c + ", networkResponses=" + this.f8007d + ", latencyMillis=" + this.f8008e + '}';
    }

    public MaxAdWaterfallInfoImpl(@Nullable y2 y2Var, String str, String str2, long j10, List<MaxNetworkResponseInfo> list, a3 a3Var, List<String> list2, String str3, String str4) {
        this.f8004a = y2Var;
        this.f8005b = str;
        this.f8006c = str2;
        this.f8008e = j10;
        this.f8007d = list;
        this.f8009f = a3Var;
        this.f8010g = list2;
        this.f8011h = str3;
        this.f8012i = str4;
    }
}
