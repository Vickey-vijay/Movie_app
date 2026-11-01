package com.safedk.android.analytics.events.base;

import android.util.Base64;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.utils.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class StatsEventWithBundle extends StatsEvent implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44667a = "CrashEvent";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44668b = "report";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected static final String f44669i = "metadata";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f44670c;

    public StatsEventWithBundle(String sdk, StatsCollector.EventType eventType, JSONObject report) {
        super(sdk, eventType);
        this.E = eventType;
        this.C = sdk;
        this.G = k.b(System.currentTimeMillis());
        this.f44670c = report;
    }

    public JSONObject d() throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        k.b(f44667a, "report : " + this.f44670c);
        jSONObject.put("report", a(this.f44670c.toString().replace("\\/", "/")));
        return jSONObject;
    }

    private String a(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return new String(Base64.encode(byteArray, 2));
    }
}
