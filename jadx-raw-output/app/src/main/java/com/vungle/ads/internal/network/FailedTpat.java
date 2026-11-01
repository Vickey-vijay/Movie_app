package com.vungle.ads.internal.network;

import al.d;
import bl.d2;
import bl.o1;
import bl.u0;
import bl.y1;
import ck.i;
import ck.p;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Map;
import kotlin.Metadata;
import xk.f;

/* JADX INFO: compiled from: TpatSender.kt */
/* JADX INFO: loaded from: classes7.dex */
@f
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298BS\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b2\u00103B_\b\u0017\u0012\u0006\u00104\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b2\u00107J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0003JW\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\t2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\u001a\u001a\u00020\fHÖ\u0001J\t\u0010\u001b\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b \u0010!R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b&\u0010'R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u0017\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010(\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R$\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010%\u001a\u0004\b/\u0010'\"\u0004\b0\u00101¨\u0006:"}, d2 = {"Lcom/vungle/ads/internal/network/FailedTpat;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "Lcom/vungle/ads/internal/network/HttpMethod;", "component1", "", "", "component2", "component3", "", "component4", "component5", "component6", "method", "headers", "body", "retryAttempt", "retryCount", "tpatKey", "copy", "toString", "hashCode", "other", "", "equals", "Lcom/vungle/ads/internal/network/HttpMethod;", "getMethod", "()Lcom/vungle/ads/internal/network/HttpMethod;", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "Ljava/lang/String;", "getBody", "()Ljava/lang/String;", "I", "getRetryAttempt", "()I", "setRetryAttempt", "(I)V", "getRetryCount", "setRetryCount", "getTpatKey", "setTpatKey", "(Ljava/lang/String;)V", "<init>", "(Lcom/vungle/ads/internal/network/HttpMethod;Ljava/util/Map;Ljava/lang/String;IILjava/lang/String;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/network/HttpMethod;Ljava/util/Map;Ljava/lang/String;IILjava/lang/String;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class FailedTpat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String body;
    private final Map<String, String> headers;
    private final HttpMethod method;
    private int retryAttempt;
    private int retryCount;
    private String tpatKey;

    /* JADX INFO: compiled from: TpatSender.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/network/FailedTpat$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/network/FailedTpat;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final xk.b<FailedTpat> serializer() {
            return FailedTpat$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FailedTpat(int i10, HttpMethod httpMethod, Map map, String str, int i11, int i12, String str2, y1 y1Var) {
        if (16 != (i10 & 16)) {
            o1.a(i10, 16, FailedTpat$$serializer.INSTANCE.getDescriptor());
        }
        this.method = (i10 & 1) == 0 ? HttpMethod.GET : httpMethod;
        if ((i10 & 2) == 0) {
            this.headers = null;
        } else {
            this.headers = map;
        }
        if ((i10 & 4) == 0) {
            this.body = null;
        } else {
            this.body = str;
        }
        if ((i10 & 8) == 0) {
            this.retryAttempt = 0;
        } else {
            this.retryAttempt = i11;
        }
        this.retryCount = i12;
        if ((i10 & 32) == 0) {
            this.tpatKey = null;
        } else {
            this.tpatKey = str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FailedTpat copy$default(FailedTpat failedTpat, HttpMethod httpMethod, Map map, String str, int i10, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            httpMethod = failedTpat.method;
        }
        if ((i12 & 2) != 0) {
            map = failedTpat.headers;
        }
        Map map2 = map;
        if ((i12 & 4) != 0) {
            str = failedTpat.body;
        }
        String str3 = str;
        if ((i12 & 8) != 0) {
            i10 = failedTpat.retryAttempt;
        }
        int i13 = i10;
        if ((i12 & 16) != 0) {
            i11 = failedTpat.retryCount;
        }
        int i14 = i11;
        if ((i12 & 32) != 0) {
            str2 = failedTpat.tpatKey;
        }
        return failedTpat.copy(httpMethod, map2, str3, i13, i14, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HttpMethod getMethod() {
        return this.method;
    }

    public final Map<String, String> component2() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRetryAttempt() {
        return this.retryAttempt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTpatKey() {
        return this.tpatKey;
    }

    public final FailedTpat copy(HttpMethod method, Map<String, String> headers, String body, int retryAttempt, int retryCount, String tpatKey) {
        p.j(method, "method");
        return new FailedTpat(method, headers, body, retryAttempt, retryCount, tpatKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FailedTpat)) {
            return false;
        }
        FailedTpat failedTpat = (FailedTpat) other;
        return this.method == failedTpat.method && p.e(this.headers, failedTpat.headers) && p.e(this.body, failedTpat.body) && this.retryAttempt == failedTpat.retryAttempt && this.retryCount == failedTpat.retryCount && p.e(this.tpatKey, failedTpat.tpatKey);
    }

    public int hashCode() {
        int iHashCode = this.method.hashCode() * 31;
        Map<String, String> map = this.headers;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.body;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.retryAttempt)) * 31) + Integer.hashCode(this.retryCount)) * 31;
        String str2 = this.tpatKey;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "FailedTpat(method=" + this.method + ", headers=" + this.headers + ", body=" + this.body + ", retryAttempt=" + this.retryAttempt + ", retryCount=" + this.retryCount + ", tpatKey=" + this.tpatKey + ')';
    }

    public static final void write$Self(FailedTpat failedTpat, d dVar, kotlinx.serialization.descriptors.a aVar) {
        p.j(failedTpat, "self");
        p.j(dVar, "output");
        p.j(aVar, "serialDesc");
        if (dVar.q(aVar, 0) || failedTpat.method != HttpMethod.GET) {
            dVar.m(aVar, 0, HttpMethod$$serializer.INSTANCE, failedTpat.method);
        }
        if (dVar.q(aVar, 1) || failedTpat.headers != null) {
            d2 d2Var = d2.f5397a;
            dVar.C(aVar, 1, new u0(d2Var, d2Var), failedTpat.headers);
        }
        if (dVar.q(aVar, 2) || failedTpat.body != null) {
            dVar.C(aVar, 2, d2.f5397a, failedTpat.body);
        }
        if (dVar.q(aVar, 3) || failedTpat.retryAttempt != 0) {
            dVar.n(aVar, 3, failedTpat.retryAttempt);
        }
        dVar.n(aVar, 4, failedTpat.retryCount);
        if (dVar.q(aVar, 5) || failedTpat.tpatKey != null) {
            dVar.C(aVar, 5, d2.f5397a, failedTpat.tpatKey);
        }
    }

    public final String getBody() {
        return this.body;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final HttpMethod getMethod() {
        return this.method;
    }

    public final int getRetryAttempt() {
        return this.retryAttempt;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final String getTpatKey() {
        return this.tpatKey;
    }

    public final void setRetryAttempt(int i10) {
        this.retryAttempt = i10;
    }

    public final void setRetryCount(int i10) {
        this.retryCount = i10;
    }

    public final void setTpatKey(String str) {
        this.tpatKey = str;
    }

    public FailedTpat(HttpMethod httpMethod, Map<String, String> map, String str, int i10, int i11, String str2) {
        p.j(httpMethod, "method");
        this.method = httpMethod;
        this.headers = map;
        this.body = str;
        this.retryAttempt = i10;
        this.retryCount = i11;
        this.tpatKey = str2;
    }

    public /* synthetic */ FailedTpat(HttpMethod httpMethod, Map map, String str, int i10, int i11, String str2, int i12, i iVar) {
        this((i12 & 1) != 0 ? HttpMethod.GET : httpMethod, (i12 & 2) != 0 ? null : map, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? 0 : i10, i11, (i12 & 32) != 0 ? null : str2);
    }
}
