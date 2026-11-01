package com.ironsource.sdk.controller;

import com.ironsource.C3714t8;

/* JADX INFO: loaded from: classes8.dex */
public interface m {

    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f30966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f30967d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            this(str, null, null, null, 14, null);
            ck.p.j(str, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            this(str, str2, null, null, 12, null);
            ck.p.j(str, "funToCall");
        }

        @Override // com.ironsource.sdk.controller.m
        public String a() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SSA_CORE.SDKController.runFunction('" + this.f30964a);
            String str = this.f30965b;
            if (str != null && str.length() != 0) {
                sb2.append("?parameters=" + this.f30965b);
            }
            String str2 = this.f30966c;
            if (str2 != null && str2.length() != 0) {
                sb2.append("','" + this.f30966c);
            }
            String str3 = this.f30967d;
            if (str3 != null && str3.length() != 0) {
                sb2.append("','" + this.f30967d);
            }
            sb2.append("');");
            String string = sb2.toString();
            ck.p.i(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3) {
            this(str, str2, str3, null, 8, null);
            ck.p.j(str, "funToCall");
        }

        public a(String str, String str2, String str3, String str4) {
            ck.p.j(str, "funToCall");
            this.f30964a = str;
            this.f30965b = str2;
            this.f30966c = str3;
            this.f30967d = str4;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, int i10, ck.i iVar) {
            this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
        }
    }

    public static final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f30968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f30969b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(m mVar, int i10) {
            this(mVar.a(), i10);
            ck.p.j(mVar, "jsMethod");
        }

        public b(String str, int i10) {
            ck.p.j(str, "script");
            this.f30969b = str;
            this.f30968a = i10;
        }

        @Override // com.ironsource.sdk.controller.m
        public String a() {
            String str = "console.log(\"JS exception: \" + JSON.stringify(e));";
            if (this.f30968a != C3714t8.d.MODE_0.b() && (this.f30968a < C3714t8.d.MODE_1.b() || this.f30968a > C3714t8.d.MODE_3.b())) {
                str = "empty";
            }
            String str2 = "try{" + this.f30969b + "}catch(e){" + str + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
            ck.p.i(str2, "StringBuilder()\n        …}\")\n          .toString()");
            return str2;
        }
    }

    String a();
}
