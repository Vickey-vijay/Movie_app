package io.bidmachine.analytics.internal;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\n\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\fJ<\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u000fJ,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0011J,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0011J,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0011J4\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lio/bidmachine/analytics/internal/V;", "", "Lio/bidmachine/analytics/internal/Q;", "monitorRecord", "Lkotlin/Result;", "Lmj/r;", "a", "(Lio/bidmachine/analytics/internal/Q;)Ljava/lang/Object;", "", "monitorName", JsonStorageKeyNames.SESSION_ID_KEY, "", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "", "limit", "(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Object;", "monitorRecordList", "(Ljava/util/List;)Ljava/lang/Object;", "c", "b", "excludeSessionId", "excludeMonitorNameList", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public interface V {
    Object a(MonitorRecord monitorRecord);

    Object a(String monitorName, String sessionId);

    Object a(String monitorName, String sessionId, int limit);

    Object a(String excludeSessionId, List<String> excludeMonitorNameList);

    Object a(List<MonitorRecord> monitorRecordList);

    Object b(List<MonitorRecord> monitorRecordList);

    Object c(List<MonitorRecord> monitorRecordList);
}
