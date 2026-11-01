package io.appmetrica.analytics.coreutils.internal.services.frequency;

import com.ironsource.C3426d4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\nH&J\u0019\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyStorage;", "", "", C3426d4.i.W, "", "value", "Lmj/r;", "putWindowStart", "getWindowStart", "(Ljava/lang/String;)Ljava/lang/Long;", "", "putWindowOccurrencesCount", "getWindowOccurrencesCount", "(Ljava/lang/String;)Ljava/lang/Integer;", "core-utils_release"}, k = 1, mv = {1, 6, 0})
public interface EventFrequencyStorage {
    Integer getWindowOccurrencesCount(String key);

    Long getWindowStart(String key);

    void putWindowOccurrencesCount(String str, int i10);

    void putWindowStart(String str, long j10);
}
