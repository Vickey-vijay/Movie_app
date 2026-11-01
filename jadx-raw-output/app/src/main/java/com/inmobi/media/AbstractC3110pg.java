package com.inmobi.media;

import android.content.ContentValues;
import androidx.appcompat.widget.ActivityChooserModel;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.pg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3110pg {
    public static final ContentValues a(Rf rf2) throws JSONException {
        ck.p.j(rf2, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", rf2.f23453b);
        contentValues.put("url", rf2.f23452a);
        Map map = rf2.f23454c;
        ck.p.j(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        contentValues.put("headers", jSONObject.toString());
        contentValues.put("allow_redirects", String.valueOf(rf2.f23455d));
        contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, rf2.f23456e);
        contentValues.put("ack_required", String.valueOf(rf2.f23457f));
        contentValues.put("time_created", Long.valueOf(rf2.f23460i));
        contentValues.put("retry_count", Integer.valueOf(rf2.f23458g));
        contentValues.put("owner", rf2.f23459h);
        Long l10 = rf2.f23461j;
        contentValues.put("retryAfter", Long.valueOf(l10 != null ? l10.longValue() : 0L));
        C2888gi c2888gi = rf2.f23462k;
        if (c2888gi != null) {
            String string = new JSONObject().put("plType", c2888gi.f24434a.f25510f).put("plId", c2888gi.f24434a.f25505a).put("adType", c2888gi.f24434a.f25509e).put("markupType", c2888gi.f24435b).put("networkType", C3298x5.m()).put("creativeType", c2888gi.f24439f).put("creativeId", c2888gi.f24440g).put("isRewarded", c2888gi.f24441h).put("adPosition", c2888gi.f24442i).put("metadataBlob", c2888gi.f24437d).put("impressionId", c2888gi.f24436c).toString();
            ck.p.i(string, "toString(...)");
            contentValues.put("telemetry_metadata", string);
        }
        return contentValues;
    }

    public static final Rf a(ContentValues contentValues) throws JSONException {
        String str;
        long j10;
        C2888gi c2888gi;
        ck.p.j(contentValues, "<this>");
        String asString = contentValues.getAsString("id");
        String asString2 = contentValues.getAsString("url");
        JSONObject jSONObject = new JSONObject(contentValues.getAsString("headers"));
        ck.p.j(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        ck.p.i(itKeys, "keys(...)");
        while (true) {
            String str2 = "";
            if (!itKeys.hasNext()) {
                break;
            }
            String next = itKeys.next();
            String string = jSONObject.getString(next);
            if (string != null) {
                str2 = string;
            }
            linkedHashMap.put(next, str2);
        }
        boolean z10 = Boolean.parseBoolean(contentValues.getAsString("allow_redirects"));
        String asString3 = contentValues.getAsString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        boolean z11 = Boolean.parseBoolean(contentValues.getAsString("ack_required"));
        Integer asInteger = contentValues.getAsInteger("retry_count");
        int iIntValue = asInteger != null ? asInteger.intValue() : 0;
        String asString4 = contentValues.getAsString("owner");
        if (asString4 == null) {
            asString4 = "unknown";
        }
        String str3 = asString4;
        Long asLong = contentValues.getAsLong("retryAfter");
        Long asLong2 = contentValues.getAsLong("time_created");
        ck.p.g(asString2);
        ck.p.g(asString);
        ck.p.g(asString3);
        ck.p.g(asLong2);
        long jLongValue = asLong2.longValue();
        String asString5 = contentValues.getAsString("telemetry_metadata");
        if (asString5 != null) {
            ck.p.j(asString5, "json");
            try {
                JSONObject jSONObject2 = new JSONObject(asString5);
                String string2 = jSONObject2.getString("adType");
                ck.p.i(string2, "getString(...)");
                j10 = jLongValue;
                try {
                    ck.p.j(string2, "mAdType");
                    String string3 = UUID.randomUUID().toString();
                    ck.p.i(string3, "toString(...)");
                    str = str3;
                    try {
                        long j11 = jSONObject2.getLong("plId");
                        if (j11 != Long.MIN_VALUE) {
                            C3243v0 c3243v0 = new C3243v0(j11, "", string2, null);
                            c3243v0.f25508d = null;
                            c3243v0.f25507c = null;
                            ck.p.j("", "<set-?>");
                            c3243v0.f25512h = "";
                            ck.p.j(ActivityChooserModel.ATTRIBUTE_ACTIVITY, "<set-?>");
                            c3243v0.f25513i = ActivityChooserModel.ATTRIBUTE_ACTIVITY;
                            c3243v0.f25511g = string3;
                            c3243v0.f25514j = false;
                            c3243v0.f25515k = null;
                            String string4 = jSONObject2.getString("markupType");
                            ck.p.i(string4, "getString(...)");
                            String string5 = jSONObject2.getString("impressionId");
                            ck.p.i(string5, "getString(...)");
                            String strOptString = jSONObject2.optString("metadataBlob", "");
                            ck.p.i(strOptString, "optString(...)");
                            String string6 = jSONObject2.getString("creativeType");
                            ck.p.i(string6, "getString(...)");
                            String string7 = jSONObject2.getString("creativeId");
                            ck.p.i(string7, "getString(...)");
                            c2888gi = new C2888gi(c3243v0, string4, string5, strOptString, 0, string6, string7, jSONObject2.getBoolean("isRewarded"), jSONObject2.getInt("adPosition"), null, null, null, null);
                        } else {
                            throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
                        }
                    } catch (JSONException unused) {
                        c2888gi = null;
                    }
                } catch (JSONException unused2) {
                    str = str3;
                }
            } catch (JSONException unused3) {
                str = str3;
                j10 = jLongValue;
            }
        } else {
            str = str3;
            j10 = jLongValue;
            c2888gi = null;
        }
        return new Rf(asString2, asString, linkedHashMap, z10, asString3, z11, iIntValue, str, j10, asLong, c2888gi);
    }
}
