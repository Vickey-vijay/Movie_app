package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public interface V1 {

    public static final class a implements V1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f27783a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public a(JSONObject jSONObject) {
            this.f27783a = jSONObject;
        }

        @Override // com.ironsource.V1
        public com.ironsource.mediationsdk.demandOnly.p a(String str) {
            ck.p.j(str, "instanceId");
            JSONObject jSONObject = this.f27783a;
            JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(str) : null;
            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("plumbus") : null;
            return strOptString != null ? new com.ironsource.mediationsdk.demandOnly.p.a(strOptString) : new com.ironsource.mediationsdk.demandOnly.p.b();
        }

        public /* synthetic */ a(JSONObject jSONObject, int i10, ck.i iVar) {
            this((i10 & 1) != 0 ? IronSourceVideoBridge.jsonObjectInit() : jSONObject);
        }
    }

    com.ironsource.mediationsdk.demandOnly.p a(String str);
}
