package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f43948b = "MraidParser";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f43949c = "markup";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f43950d = "advDomain";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f43951e = "creativeId";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f43952f = "content";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected JSONObject f43953a;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f43954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f43955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f43956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f43957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f43958e;

        public a() {
        }
    }

    public b(JSONObject jSONObject) {
        this.f43953a = jSONObject;
    }

    public a a() {
        a aVar = new a();
        if (this.f43953a != null) {
            try {
                String string = this.f43953a.getString("content");
                aVar.f43954a = this.f43953a.getString("creativeId");
                aVar.f43956c = this.f43953a.optString(f43950d, null);
                aVar.f43957d = a(new JSONObject(string));
                Logger.d(f43948b, "mraid Markup (url encoded)=" + aVar.f43957d);
                aVar.f43955b = a(aVar.f43957d);
                Logger.d(f43948b, "mraid clickURL = " + aVar.f43955b);
                aVar.f43958e = b(aVar.f43957d);
                Logger.d(f43948b, "mraid videoUrl = " + aVar.f43958e);
            } catch (JSONException e10) {
                Logger.d(f43948b, "mraid error " + e10.getMessage() + " parsing" + this.f43953a.toString());
            }
        }
        return aVar;
    }

    protected String a(JSONObject jSONObject) throws JSONException {
        return jSONObject.getString("markup");
    }

    private String a(String str) {
        Matcher matcher = com.safedk.android.utils.f.ay().matcher(str);
        if (matcher.find()) {
            return c(matcher.group(0));
        }
        return null;
    }

    private String b(String str) {
        Matcher matcher = com.safedk.android.utils.f.az().matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private String c(String str) {
        String strE = k.e(com.safedk.android.utils.f.aA(), str);
        Logger.d(f43948b, "found click url: " + strE);
        return strE;
    }
}
