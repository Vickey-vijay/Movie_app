package io.bidmachine.analytics.internal;

import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/bidmachine/analytics/internal/Q;", "Lio/bidmachine/analytics/internal/T;", "a", "(Lio/bidmachine/analytics/internal/Q;)Lio/bidmachine/analytics/internal/T;", "(Lio/bidmachine/analytics/internal/T;)Lio/bidmachine/analytics/internal/Q;", "bidmachine-android-sdk_bh_3_3_0"}, k = 2, mv = {1, 7, 1})
public final class U {
    public static final T a(MonitorRecord monitorRecord) {
        byte[] bytes;
        JSONObject jSONObjectA;
        String string;
        byte[] bytes2 = monitorRecord.a().isEmpty() ? new byte[0] : s0.a((Map<?, ?>) monitorRecord.a()).toString().getBytes(lk.c.f63591b);
        String id2 = monitorRecord.getId();
        String name = monitorRecord.getName();
        String sessionId = monitorRecord.getSessionId();
        long timestamp = monitorRecord.getTimestamp();
        TrackerError error = monitorRecord.getError();
        if (error == null || (jSONObjectA = r0.a(error)) == null || (string = jSONObjectA.toString()) == null || (bytes = string.getBytes(lk.c.f63591b)) == null) {
            bytes = new byte[0];
        }
        return new T(id2, name, sessionId, timestamp, bytes2, bytes);
    }

    public static final MonitorRecord a(T t10) {
        return new MonitorRecord(t10.getId(), t10.getName(), t10.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), t10.getTimestamp(), t10.getData().length == 0 ? kotlin.collections.a.j() : s0.a(new JSONObject(new String(t10.getData(), lk.c.f63591b))), t10.getError().length == 0 ? null : r0.a(new JSONObject(new String(t10.getError(), lk.c.f63591b))));
    }
}
