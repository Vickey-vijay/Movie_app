package io.appmetrica.analytics.coreapi.internal.data;

import java.util.Collection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0013J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H&J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0004H&¨\u0006\u0014"}, d2 = {"Lio/appmetrica/analytics/coreapi/internal/data/TempCacheStorage;", "", "", "scope", "", "timestamp", "", "data", "put", "Lio/appmetrica/analytics/coreapi/internal/data/TempCacheStorage$Entry;", "get", "", "limit", "", "id", "Lmj/r;", "remove", "interval", "removeOlderThan", "Entry", "core-api_release"}, k = 1, mv = {1, 6, 0})
public interface TempCacheStorage {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lio/appmetrica/analytics/coreapi/internal/data/TempCacheStorage$Entry;", "", "data", "", "getData", "()[B", "id", "", "getId", "()J", "scope", "", "getScope", "()Ljava/lang/String;", "timestamp", "getTimestamp", "core-api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Entry {
        byte[] getData();

        long getId();

        String getScope();

        long getTimestamp();
    }

    Entry get(String scope);

    Collection<Entry> get(String scope, int limit);

    long put(String scope, long timestamp, byte[] data);

    void remove(long j10);

    void removeOlderThan(String str, long j10);
}
