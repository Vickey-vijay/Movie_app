package io.appmetrica.analytics.idsync.internal.model;

import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00180\u0017\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\u0006\u0010&\u001a\u00020\u001e\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0004\b,\u0010-J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R)\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010&\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lio/appmetrica/analytics/idsync/internal/model/RequestConfig;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "type", "b", "getUrl", "url", "Lio/appmetrica/analytics/idsync/internal/model/Preconditions;", "c", "Lio/appmetrica/analytics/idsync/internal/model/Preconditions;", "getPreconditions", "()Lio/appmetrica/analytics/idsync/internal/model/Preconditions;", "preconditions", "", "", "d", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "headers", "", "e", "J", "getResendIntervalForValidResponse", "()J", "resendIntervalForValidResponse", InneractiveMediationDefs.GENDER_FEMALE, "getResendIntervalForInvalidResponse", "resendIntervalForInvalidResponse", "g", "Ljava/util/List;", "getValidResponseCodes", "()Ljava/util/List;", "validResponseCodes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/appmetrica/analytics/idsync/internal/model/Preconditions;Ljava/util/Map;JJLjava/util/List;)V", "id-sync_release"}, k = 1, mv = {1, 6, 0})
public final class RequestConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Preconditions preconditions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map headers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long resendIntervalForValidResponse;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long resendIntervalForInvalidResponse;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List validResponseCodes;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!p.e(RequestConfig.class, other != null ? other.getClass() : null)) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.RequestConfig");
        }
        RequestConfig requestConfig = (RequestConfig) other;
        return this.resendIntervalForValidResponse == requestConfig.resendIntervalForValidResponse && this.resendIntervalForInvalidResponse == requestConfig.resendIntervalForInvalidResponse && p.e(this.type, requestConfig.type) && p.e(this.url, requestConfig.url) && p.e(this.preconditions, requestConfig.preconditions) && p.e(this.headers, requestConfig.headers) && p.e(this.validResponseCodes, requestConfig.validResponseCodes);
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final Preconditions getPreconditions() {
        return this.preconditions;
    }

    public final long getResendIntervalForInvalidResponse() {
        return this.resendIntervalForInvalidResponse;
    }

    public final long getResendIntervalForValidResponse() {
        return this.resendIntervalForValidResponse;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final List<Integer> getValidResponseCodes() {
        return this.validResponseCodes;
    }

    public int hashCode() {
        return this.validResponseCodes.hashCode() + ((this.headers.hashCode() + ((this.preconditions.hashCode() + ((this.url.hashCode() + ((this.type.hashCode() + ((Long.hashCode(this.resendIntervalForInvalidResponse) + (Long.hashCode(this.resendIntervalForValidResponse) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "RequestConfig(type='" + this.type + "', url='" + this.url + "', preconditions=" + this.preconditions + ", headers=" + this.headers + ", resendIntervalForValidResponse=" + this.resendIntervalForValidResponse + ", resendIntervalForInvalidResponse=" + this.resendIntervalForInvalidResponse + ", validResponseCodes=" + this.validResponseCodes + ')';
    }

    public RequestConfig(String str, String str2, Preconditions preconditions, Map<String, ? extends List<String>> map, long j10, long j11, List<Integer> list) {
        this.type = str;
        this.url = str2;
        this.preconditions = preconditions;
        this.headers = map;
        this.resendIntervalForValidResponse = j10;
        this.resendIntervalForInvalidResponse = j11;
        this.validResponseCodes = list;
    }
}
