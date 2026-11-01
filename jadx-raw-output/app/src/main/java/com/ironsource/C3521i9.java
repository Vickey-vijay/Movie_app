package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3521i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29151a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.i9$a */
    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        public final boolean b(Context context) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            E3 e3D = d(context);
            return e3D.d().length() > 0 && e3D.e().length() > 0;
        }

        public final Ne c(Context context) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            E3 e3D = d(context);
            if (e3D.d().length() <= 0 || e3D.e().length() <= 0) {
                e3D = null;
            }
            if (e3D == null) {
                return null;
            }
            Ne ne2 = new Ne(context, e3D.d(), e3D.f(), e3D.e());
            ne2.a(Ne.a.CACHE);
            return ne2;
        }

        public final E3 d(Context context) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            JSONObject jSONObjectA = a(context);
            String strOptString = jSONObjectA.optString("appKey");
            String strOptString2 = jSONObjectA.optString("userId");
            String strOptString3 = jSONObjectA.optString("response");
            ck.p.i(strOptString, "cachedAppKey");
            ck.p.i(strOptString2, "cachedUserId");
            ck.p.i(strOptString3, "cachedSettings");
            return new E3(strOptString, strOptString2, strOptString3);
        }

        private final JSONObject a(Context context) {
            try {
                return IronSourceVideoBridge.jsonObjectInit(IronSourceUtils.e(context));
            } catch (JSONException unused) {
                return IronSourceVideoBridge.jsonObjectInit();
            }
        }
    }

    public static final boolean a(Context context) {
        return f29151a.b(context);
    }

    public static final Ne b(Context context) {
        return f29151a.c(context);
    }

    public static final E3 c(Context context) {
        return f29151a.d(context);
    }
}
