package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3769wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3531j2 f31538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f31539b;

    /* JADX WARN: Multi-variable type inference failed */
    public C3769wc() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: com.ironsource.wc$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31540a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f31541b = "adm";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f31542c = "isOneFlow";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f31543d = "isMultipleAdObjects";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f31544e = "adsInternalInfo";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f31545f = "success";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f31546g = "error";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f31547h = "data";

        private a() {
        }
    }

    public C3769wc(C3531j2 c3531j2, boolean z10) {
        this.f31538a = c3531j2;
        this.f31539b = z10;
    }

    public final HashMap<String, String> a() {
        C3623o2 c3623o2G;
        HashMap<String, String> map = new HashMap<>();
        map.put("isOneFlow", String.valueOf(this.f31539b));
        map.put("isMultipleAdObjects", "true");
        List<O> listA = Lb.f26968s.d().G().a();
        String string = listA != null ? IronSourceVideoBridge.jsonObjectInit().put("success", true).put("data", listA).toString() : IronSourceVideoBridge.jsonObjectInit().put("success", false).put("error", "Failed to get ad internal info").toString();
        ck.p.i(string, "if (jsonAdInternalInfo !…    .toString()\n        }");
        map.put(a.f31544e, string);
        C3531j2 c3531j2 = this.f31538a;
        if (c3531j2 != null && (c3623o2G = c3531j2.g()) != null) {
            map.put("adm", c3623o2G.a());
            map.putAll(c3623o2G.b());
        }
        return map;
    }

    public /* synthetic */ C3769wc(C3531j2 c3531j2, boolean z10, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : c3531j2, (i10 & 2) != 0 ? false : z10);
    }
}
