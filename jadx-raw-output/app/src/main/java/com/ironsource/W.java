package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface W {

    public static final class a implements W {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f27811a;

        public a(JSONObject jSONObject) {
            ck.p.j(jSONObject, "applicationConfig");
            this.f27811a = jSONObject;
        }

        @Override // com.ironsource.W
        public JSONObject a() {
            JSONObject jSONObjectOptJSONObject = this.f27811a.optJSONObject("controllerConfig");
            return jSONObjectOptJSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject;
        }

        @Override // com.ironsource.W
        public int b() {
            int iOptInt = this.f27811a.optInt("debugMode", 0);
            if (this.f27811a.optBoolean(b.f27816e, false)) {
                return 3;
            }
            return iOptInt;
        }

        @Override // com.ironsource.W
        public String c() {
            String strOptString = this.f27811a.optString("controllerUrl");
            return strOptString == null ? "" : strOptString;
        }
    }

    JSONObject a();

    int b();

    String c();

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27812a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f27813b = "controllerUrl";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f27814c = "controllerConfig";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f27815d = "debugMode";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f27816e = "adptDebugMode";

        private b() {
        }
    }
}
