package com.safedk.android.analytics.brandsafety.creatives;

import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f43960b = "bundleId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f43961c = "dynamicMarkup";

    public c(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.b
    public b.a a() {
        b.a aVarA = super.a();
        if (this.f43953a.optString("bundleId", null) == null) {
            aVarA.f43955b = a(aVarA.f43957d);
        }
        return aVarA;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.b
    protected String a(JSONObject jSONObject) throws JSONException {
        return jSONObject.getString(f43961c);
    }

    private String a(String str) {
        Matcher matcher = com.safedk.android.utils.f.K().matcher(str);
        if (!matcher.find() || matcher.groupCount() <= 0) {
            return null;
        }
        return matcher.group(1);
    }
}
