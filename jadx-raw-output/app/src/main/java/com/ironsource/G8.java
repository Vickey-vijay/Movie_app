package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import kotlin.Result;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class G8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Drawable f26627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final WebView f26628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View f26629g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X8 f26630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC3387b1 f26631b;

        public final b a(Context context, JSONObject jSONObject) {
            ck.p.j(context, "activityContext");
            ck.p.j(jSONObject, "json");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("title");
            String strB = jSONObjectOptJSONObject != null ? H8.b(jSONObjectOptJSONObject, "text") : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(C3426d4.i.F0);
            String strB2 = jSONObjectOptJSONObject2 != null ? H8.b(jSONObjectOptJSONObject2, "text") : null;
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("body");
            String strB3 = jSONObjectOptJSONObject3 != null ? H8.b(jSONObjectOptJSONObject3, "text") : null;
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("cta");
            String strB4 = jSONObjectOptJSONObject4 != null ? H8.b(jSONObjectOptJSONObject4, "text") : null;
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("icon");
            String strB5 = jSONObjectOptJSONObject5 != null ? H8.b(jSONObjectOptJSONObject5, "url") : null;
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject(C3426d4.i.I0);
            String strB6 = jSONObjectOptJSONObject6 != null ? H8.b(jSONObjectOptJSONObject6, "adViewId") : null;
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject(C3426d4.i.J0);
            return new b(new b.a(strB, strB2, strB3, strB4, b(strB5), a(strB6), C3669qd.f30553a.a(context, jSONObjectOptJSONObject7 != null ? H8.b(jSONObjectOptJSONObject7, "url") : null, this.f26630a)));
        }

        public a(X8 x10, InterfaceC3387b1 interfaceC3387b1) {
            ck.p.j(x10, "imageLoader");
            ck.p.j(interfaceC3387b1, "adViewManagement");
            this.f26630a = x10;
            this.f26631b = interfaceC3387b1;
        }

        private final Result<Drawable> b(String str) {
            if (str == null) {
                return null;
            }
            return Result.m3457boximpl(this.f26630a.a(str));
        }

        private final Result<WebView> a(String str) {
            if (str == null) {
                return null;
            }
            K8 k8A = this.f26631b.a(str);
            WebView presentingView = k8A != null ? k8A.getPresentingView() : null;
            if (presentingView == null) {
                Result.a aVar = Result.Companion;
                return Result.m3457boximpl(Result.m3458constructorimpl(kotlin.c.a(new Exception("missing adview for id: '" + str + "'"))));
            }
            return Result.m3457boximpl(Result.m3458constructorimpl(presentingView));
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f26632a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f26633a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f26634b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f26635c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f26636d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Result<Drawable> f26637e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Result<WebView> f26638f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final View f26639g;

            public final String a() {
                return this.f26633a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return ck.p.e(this.f26633a, aVar.f26633a) && ck.p.e(this.f26634b, aVar.f26634b) && ck.p.e(this.f26635c, aVar.f26635c) && ck.p.e(this.f26636d, aVar.f26636d) && ck.p.e(this.f26637e, aVar.f26637e) && ck.p.e(this.f26638f, aVar.f26638f) && ck.p.e(this.f26639g, aVar.f26639g);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(String str, String str2, String str3, String str4, Result<? extends Drawable> result, Result<? extends WebView> result2, View view) {
                ck.p.j(view, C3426d4.i.J0);
                this.f26633a = str;
                this.f26634b = str2;
                this.f26635c = str3;
                this.f26636d = str4;
                this.f26637e = result;
                this.f26638f = result2;
                this.f26639g = view;
            }

            public final a a(String str, String str2, String str3, String str4, Result<? extends Drawable> result, Result<? extends WebView> result2, View view) {
                ck.p.j(view, C3426d4.i.J0);
                return new a(str, str2, str3, str4, result, result2, view);
            }

            public final String b() {
                return this.f26634b;
            }

            public final String c() {
                return this.f26635c;
            }

            public final String d() {
                return this.f26636d;
            }

            public final Result<Drawable> e() {
                return this.f26637e;
            }

            public final Result<WebView> f() {
                return this.f26638f;
            }

            public final View g() {
                return this.f26639g;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v0, types: [android.webkit.WebView] */
            public final G8 h() {
                Drawable drawable;
                String str = this.f26633a;
                String str2 = this.f26634b;
                String str3 = this.f26635c;
                String str4 = this.f26636d;
                Result<Drawable> result = this.f26637e;
                Object obj = null;
                if (result != null) {
                    Object objM3466unboximpl = result.m3466unboximpl();
                    if (Result.m3463isFailureimpl(objM3466unboximpl)) {
                        objM3466unboximpl = null;
                    }
                    drawable = (Drawable) objM3466unboximpl;
                } else {
                    drawable = null;
                }
                Result<WebView> result2 = this.f26638f;
                if (result2 != null) {
                    Object objM3466unboximpl2 = result2.m3466unboximpl();
                    obj = (WebView) (Result.m3463isFailureimpl(objM3466unboximpl2) ? null : objM3466unboximpl2);
                }
                return new G8(str, str2, str3, str4, drawable, obj, this.f26639g);
            }

            public int hashCode() {
                String str = this.f26633a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f26634b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f26635c;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f26636d;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Result<Drawable> result = this.f26637e;
                int iM3462hashCodeimpl = (iHashCode4 + (result == null ? 0 : Result.m3462hashCodeimpl(result.m3466unboximpl()))) * 31;
                Result<WebView> result2 = this.f26638f;
                return ((iM3462hashCodeimpl + (result2 != null ? Result.m3462hashCodeimpl(result2.m3466unboximpl()) : 0)) * 31) + this.f26639g.hashCode();
            }

            public final String i() {
                return this.f26634b;
            }

            public final String j() {
                return this.f26635c;
            }

            public final String k() {
                return this.f26636d;
            }

            public final Result<Drawable> l() {
                return this.f26637e;
            }

            public final Result<WebView> m() {
                return this.f26638f;
            }

            public final View n() {
                return this.f26639g;
            }

            public final String o() {
                return this.f26633a;
            }

            public String toString() {
                return "Data(title=" + this.f26633a + ", advertiser=" + this.f26634b + ", body=" + this.f26635c + ", cta=" + this.f26636d + ", icon=" + this.f26637e + ", media=" + this.f26638f + ", privacyIcon=" + this.f26639g + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ a a(a aVar, String str, String str2, String str3, String str4, Result result, Result result2, View view, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f26633a;
                }
                if ((i10 & 2) != 0) {
                    str2 = aVar.f26634b;
                }
                String str5 = str2;
                if ((i10 & 4) != 0) {
                    str3 = aVar.f26635c;
                }
                String str6 = str3;
                if ((i10 & 8) != 0) {
                    str4 = aVar.f26636d;
                }
                String str7 = str4;
                if ((i10 & 16) != 0) {
                    result = aVar.f26637e;
                }
                Result result3 = result;
                if ((i10 & 32) != 0) {
                    result2 = aVar.f26638f;
                }
                Result result4 = result2;
                if ((i10 & 64) != 0) {
                    view = aVar.f26639g;
                }
                return aVar.a(str, str5, str6, str7, result3, result4, view);
            }
        }

        public final a a() {
            return this.f26632a;
        }

        public b(a aVar) {
            ck.p.j(aVar, "data");
            this.f26632a = aVar;
        }

        private static final void a(JSONObject jSONObject, String str) throws JSONException {
            jSONObject.put(str, IronSourceVideoBridge.jsonObjectInit().put("success", true));
        }

        private static final <T> void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit.put("success", Result.m3464isSuccessimpl(obj));
            Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(obj);
            if (thM3461exceptionOrNullimpl != null) {
                String message = thM3461exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObjectJsonObjectInit.put("reason", message);
            }
            mj.r rVar = mj.r.f64562a;
            jSONObject.put(str, jSONObjectJsonObjectInit);
        }

        public final JSONObject b() throws JSONException {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            if (this.f26632a.o() != null) {
                a(jSONObjectJsonObjectInit, "title");
            }
            if (this.f26632a.i() != null) {
                a(jSONObjectJsonObjectInit, C3426d4.i.F0);
            }
            if (this.f26632a.j() != null) {
                a(jSONObjectJsonObjectInit, "body");
            }
            if (this.f26632a.k() != null) {
                a(jSONObjectJsonObjectInit, "cta");
            }
            Result<Drawable> resultL = this.f26632a.l();
            if (resultL != null) {
                a(jSONObjectJsonObjectInit, "icon", resultL.m3466unboximpl());
            }
            Result<WebView> resultM = this.f26632a.m();
            if (resultM != null) {
                a(jSONObjectJsonObjectInit, C3426d4.i.I0, resultM.m3466unboximpl());
            }
            return jSONObjectJsonObjectInit;
        }
    }

    public final String a() {
        return this.f26623a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G8)) {
            return false;
        }
        G8 g10 = (G8) obj;
        return ck.p.e(this.f26623a, g10.f26623a) && ck.p.e(this.f26624b, g10.f26624b) && ck.p.e(this.f26625c, g10.f26625c) && ck.p.e(this.f26626d, g10.f26626d) && ck.p.e(this.f26627e, g10.f26627e) && ck.p.e(this.f26628f, g10.f26628f) && ck.p.e(this.f26629g, g10.f26629g);
    }

    public G8(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view) {
        ck.p.j(view, C3426d4.i.J0);
        this.f26623a = str;
        this.f26624b = str2;
        this.f26625c = str3;
        this.f26626d = str4;
        this.f26627e = drawable;
        this.f26628f = webView;
        this.f26629g = view;
    }

    public final G8 a(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view) {
        ck.p.j(view, C3426d4.i.J0);
        return new G8(str, str2, str3, str4, drawable, webView, view);
    }

    public final String b() {
        return this.f26624b;
    }

    public final String c() {
        return this.f26625c;
    }

    public final String d() {
        return this.f26626d;
    }

    public final Drawable e() {
        return this.f26627e;
    }

    public final WebView f() {
        return this.f26628f;
    }

    public final View g() {
        return this.f26629g;
    }

    public final String h() {
        return this.f26624b;
    }

    public int hashCode() {
        String str = this.f26623a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26624b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26625c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26626d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Drawable drawable = this.f26627e;
        int iHashCode5 = (iHashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        WebView webView = this.f26628f;
        return ((iHashCode5 + (webView != null ? webView.hashCode() : 0)) * 31) + this.f26629g.hashCode();
    }

    public final String i() {
        return this.f26625c;
    }

    public final String j() {
        return this.f26626d;
    }

    public final Drawable k() {
        return this.f26627e;
    }

    public final WebView l() {
        return this.f26628f;
    }

    public final View m() {
        return this.f26629g;
    }

    public final String n() {
        return this.f26623a;
    }

    public String toString() {
        return "ISNNativeAdData(title=" + this.f26623a + ", advertiser=" + this.f26624b + ", body=" + this.f26625c + ", cta=" + this.f26626d + ", icon=" + this.f26627e + ", mediaView=" + this.f26628f + ", privacyIcon=" + this.f26629g + ")";
    }

    public static /* synthetic */ G8 a(G8 g10, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = g10.f26623a;
        }
        if ((i10 & 2) != 0) {
            str2 = g10.f26624b;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = g10.f26625c;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = g10.f26626d;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            drawable = g10.f26627e;
        }
        Drawable drawable2 = drawable;
        if ((i10 & 32) != 0) {
            webView = g10.f26628f;
        }
        WebView webView2 = webView;
        if ((i10 & 64) != 0) {
            view = g10.f26629g;
        }
        return g10.a(str, str5, str6, str7, drawable2, webView2, view);
    }
}
