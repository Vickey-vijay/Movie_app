package io.appmetrica.analytics.logger.appmetrica.internal;

import io.appmetrica.analytics.logger.common.BaseDebugLogger;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lio/appmetrica/analytics/logger/appmetrica/internal/DebugLogger;", "Lio/appmetrica/analytics/logger/common/BaseDebugLogger;", "", "tag", "Lorg/json/JSONObject;", "jsonObject", "Lmj/r;", "dumpJson", "logger_release"}, k = 1, mv = {1, 6, 0})
public final class DebugLogger extends BaseDebugLogger {
    public static final DebugLogger INSTANCE = new DebugLogger();

    public final void dumpJson(String str, JSONObject jSONObject) {
        String string;
        try {
            string = jSONObject.toString(2);
        } catch (Throwable unused) {
            string = "Exception during dumping JSONObject";
        }
        info(str, string, new Object[0]);
    }

    private DebugLogger() {
        super("AppMetricaDebug");
    }
}
