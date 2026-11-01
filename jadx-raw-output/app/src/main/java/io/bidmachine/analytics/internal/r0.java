package io.bidmachine.analytics.internal;

import io.bidmachine.protobuf.sdk.ErrorReasonAnalytics;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0002\u0010\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0006H\u0002¢\u0006\u0004\b\u0002\u0010\b¨\u0006\t"}, d2 = {"Lio/bidmachine/analytics/internal/q0;", "Lorg/json/JSONObject;", "a", "(Lio/bidmachine/analytics/internal/q0;)Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)Lio/bidmachine/analytics/internal/q0;", "Lio/bidmachine/analytics/internal/q0$a;", "", "(Lio/bidmachine/analytics/internal/q0$a;)I", "(I)Lio/bidmachine/analytics/internal/q0$a;", "bidmachine-android-sdk_bh_3_3_0"}, k = 2, mv = {1, 7, 1})
public final class r0 {
    private static final int a(TrackerError.a aVar) {
        switch (a.f59048a[aVar.ordinal()]) {
            case 1:
                return 2000;
            case 2:
                return 2100;
            case 3:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT_VALUE;
            case 4:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT_VALUE;
            case 5:
                return 2200;
            case 6:
                return 2201;
            case 7:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_BAD_CONTENT_VALUE;
            case 8:
                return 2203;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59048a;

        static {
            int[] iArr = new int[TrackerError.a.values().length];
            try {
                iArr[TrackerError.a.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackerError.a.MONITOR_INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrackerError.a.MONITOR_NO_CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TrackerError.a.MONITOR_BAD_CONTENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TrackerError.a.READER_INVALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TrackerError.a.READER_NO_CONTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TrackerError.a.READER_BAD_CONTENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TrackerError.a.READER_NO_ACCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f59048a = iArr;
        }
    }

    private static final TrackerError.a a(int i10) {
        switch (i10) {
            case 2100:
                return TrackerError.a.MONITOR_INVALID;
            case ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT_VALUE:
                return TrackerError.a.MONITOR_NO_CONTENT;
            case ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT_VALUE:
                return TrackerError.a.MONITOR_BAD_CONTENT;
            default:
                switch (i10) {
                    case 2200:
                        return TrackerError.a.READER_INVALID;
                    case 2201:
                        return TrackerError.a.READER_NO_CONTENT;
                    case ERROR_REASON_ANALYTICS_READER_BAD_CONTENT_VALUE:
                        return TrackerError.a.READER_BAD_CONTENT;
                    case 2203:
                        return TrackerError.a.READER_NO_ACCESS;
                    default:
                        return TrackerError.a.UNKNOWN;
                }
        }
    }

    public static final JSONObject a(TrackerError trackerError) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", trackerError.getName());
        jSONObject.put("type", a(trackerError.getType()));
        jSONObject.put("reason", trackerError.getReason());
        return jSONObject;
    }

    public static final TrackerError a(JSONObject jSONObject) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(new TrackerError(jSONObject.getString("name"), a(jSONObject.getInt("type")), jSONObject.optString("reason")));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        return (TrackerError) objM3458constructorimpl;
    }
}
