package com.inmobi.media;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.inmobi.media.C2777ca;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2777ca implements Z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W9 f24128a;

    public final void a(String str) {
        ck.p.j("IncompleteLogFinalizer", "tag");
        ck.p.j(str, "message");
        try {
            JSONArray jSONArray = this.f24128a.f23733b;
            Ab ab2 = Ab.ERROR;
            SimpleDateFormat simpleDateFormat = Db.f22516a;
            ck.p.j(ab2, "logLevel");
            ck.p.j("IncompleteLogFinalizer", "tag");
            ck.p.j(str, "message");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scope", "ERROR");
            jSONObject.put("timestamp", Db.f22516a.format(new Date()));
            jSONObject.put("tag", "IncompleteLogFinalizer");
            jSONObject.put("data", str);
            jSONArray.put(jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void b(String str) {
        ck.p.j("IncompleteLogFinalizer", "tag");
        ck.p.j("exitReason", C3426d4.i.W);
        ck.p.j(str, "value");
        try {
            this.f24128a.f23732a.put("exitReason", str);
        } catch (Exception unused) {
        }
    }

    public C2777ca(W9 w10) {
        ck.p.j(w10, "incompleteLogData");
        this.f24128a = w10;
    }

    public final Object b() {
        final String str = "IncompleteLogFinalizer";
        ck.p.j("IncompleteLogFinalizer", "tag");
        try {
            Result.a aVar = Result.Companion;
            JSONObject jSONObject = this.f24128a.f23732a;
            ck.p.j(jSONObject, "<this>");
            if (!ck.p.e(jSONObject.toString(), JsonUtils.EMPTY_JSON)) {
                JSONArray jSONArray = this.f24128a.f23733b;
                ck.p.j(jSONArray, "<this>");
                if (jSONArray.length() != 0) {
                    nk.l0 l0Var = Sb.f23496a;
                    Rb.a(new bk.a() { // from class: b7.w5
                        @Override // bk.a
                        public final Object invoke() {
                            return C2777ca.a(this.f5227b, str);
                        }
                    });
                }
            }
            return Result.m3458constructorimpl(mj.r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }

    public static final mj.r a(C2777ca c2777ca, String str) throws JSONException, InterruptedException {
        W9 w10 = c2777ca.f24128a;
        JSONObject jSONObject = w10.f23732a;
        JSONArray jSONArray = w10.f23733b;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("vitals", jSONObject);
        jSONObject2.put(CreativeInfo.f44317an, jSONArray);
        String string = jSONObject2.toString();
        ck.p.i(string, "toString(...)");
        Tb.a(str, string, c2777ca.f24128a.f23734c.f25161a);
        String str2 = c2777ca.f24128a.f23734c.f25161a;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        C3130qb c3130qb = c2777ca.f24128a.f23734c;
        nk.i.b(null, new C2751ba(new C3130qb(str2, timeInMillis, 0, c3130qb.f25164d, true, c3130qb.f25166f), null), 1, null);
        return mj.r.f64562a;
    }

    public final Object a() {
        try {
            Result.a aVar = Result.Companion;
            nk.l0 l0Var = Sb.f23496a;
            return Result.m3458constructorimpl(Result.m3457boximpl(Rb.a(new bk.a() { // from class: b7.v5
                @Override // bk.a
                public final Object invoke() {
                    return C2777ca.a(this.f5212b);
                }
            })));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }

    public static final mj.r a(C2777ca c2777ca) throws InterruptedException {
        Tb.a(c2777ca.f24128a.f23734c.f25161a);
        nk.i.b(null, new C2725aa(c2777ca, null), 1, null);
        return mj.r.f64562a;
    }
}
