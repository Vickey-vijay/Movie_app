package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3702sd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30727b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f30728c = "type";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f30729d = "single";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f30730e = "onShowSuccess";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f30731f = "onLoadSuccess";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3797y6.c f30732a;

    /* JADX INFO: renamed from: com.ironsource.sd$a */
    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public C3702sd(JSONObject jSONObject) {
        InterfaceC3797y6.c cVar;
        ck.p.j(jSONObject, "features");
        String strOptString = jSONObject.optString("type");
        if (strOptString == null) {
            cVar = null;
        } else {
            int iHashCode = strOptString.hashCode();
            if (iHashCode != -1900843810) {
                if (iHashCode != -999907609) {
                    if (iHashCode == -902265784 && strOptString.equals(f30729d)) {
                        cVar = InterfaceC3797y6.c.SINGLE;
                    } else {
                        cVar = null;
                    }
                } else if (strOptString.equals(f30730e)) {
                    cVar = InterfaceC3797y6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
                } else {
                    cVar = null;
                }
            } else if (strOptString.equals(f30731f)) {
                cVar = InterfaceC3797y6.c.PROGRESSIVE_ON_LOAD_SUCCESS;
            } else {
                cVar = null;
            }
        }
        this.f30732a = cVar;
    }

    public final InterfaceC3797y6.c a() {
        return this.f30732a;
    }
}
