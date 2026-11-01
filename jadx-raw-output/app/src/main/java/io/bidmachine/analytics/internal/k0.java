package io.bidmachine.analytics.internal;

import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0002\u0010\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\b¨\u0006\t"}, d2 = {"Lio/bidmachine/analytics/internal/h0;", "Lio/bidmachine/analytics/internal/j0;", "a", "(Lio/bidmachine/analytics/internal/h0;)Lio/bidmachine/analytics/internal/j0;", "(Lio/bidmachine/analytics/internal/j0;)Lio/bidmachine/analytics/internal/h0;", "Lio/bidmachine/analytics/internal/h0$a;", "Lorg/json/JSONObject;", "(Lio/bidmachine/analytics/internal/h0$a;)Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)Lio/bidmachine/analytics/internal/h0$a;", "bidmachine-android-sdk_bh_3_3_0"}, k = 2, mv = {1, 7, 1})
public final class k0 {
    public static final j0 a(ReaderRecord readerRecord) {
        byte[] bytes;
        JSONObject jSONObjectA;
        String string;
        String id2 = readerRecord.getId();
        String name = readerRecord.getName();
        long timestamp = readerRecord.getTimestamp();
        String dataHash = readerRecord.getDataHash();
        String string2 = a(readerRecord.getRule()).toString();
        TrackerError error = readerRecord.getError();
        if (error == null || (jSONObjectA = r0.a(error)) == null || (string = jSONObjectA.toString()) == null || (bytes = string.getBytes(lk.c.f63591b)) == null) {
            bytes = new byte[0];
        }
        return new j0(id2, name, timestamp, dataHash, string2, bytes, readerRecord.getIsDirty());
    }

    public static final JSONObject a(ReaderRecord.Rule rule) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tag", rule.getTag());
        jSONObject.put("path", rule.getPath());
        return jSONObject;
    }

    public static final ReaderRecord a(j0 j0Var) {
        return new ReaderRecord(j0Var.getId(), j0Var.getName(), j0Var.getTimestamp(), j0Var.getDataHash(), a(new JSONObject(j0Var.getRule())), j0Var.getError().length == 0 ? null : r0.a(new JSONObject(new String(j0Var.getError(), lk.c.f63591b))), j0Var.getIsDirty());
    }

    public static final ReaderRecord.Rule a(JSONObject jSONObject) {
        return new ReaderRecord.Rule(jSONObject.optString("tag"), jSONObject.optString("path"));
    }
}
