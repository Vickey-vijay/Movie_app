package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.media.core.config.models.Config;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2719a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2879g9 f23940a;

    public C2719a4(C2879g9 c2879g9) {
        ck.p.j(c2879g9, "databaseHelper");
        this.f23940a = c2879g9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) throws Throwable {
        Z3 z10;
        Config config;
        if (continuationImpl instanceof Z3) {
            z10 = (Z3) continuationImpl;
            int i10 = z10.f23888c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                z10.f23888c = i10 - Integer.MIN_VALUE;
            } else {
                z10 = new Z3(this, continuationImpl);
            }
        } else {
            z10 = new Z3(this, continuationImpl);
        }
        Object objA = z10.f23886a;
        Object objF = sj.a.f();
        int i11 = z10.f23888c;
        if (i11 == 0) {
            kotlin.c.b(objA);
            C2879g9 c2879g9 = this.f23940a;
            z10.f23888c = 1;
            c2879g9.getClass();
            objA = c2879g9.a(new C2776c9(c2879g9, "SELECT * FROM config_db", null), z10);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
        }
        ((List) objA).toString();
        ArrayList arrayList = new ArrayList();
        for (ContentValues contentValues : (Iterable) objA) {
            ck.p.j(contentValues, "<this>");
            String asString = contentValues.getAsString("config_value");
            Long asLong = contentValues.getAsLong("update_ts");
            try {
                JSONObject jSONObject = new JSONObject(asString);
                String asString2 = contentValues.getAsString("config_type");
                ck.p.i(asString2, "getAsString(...)");
                ck.p.g(asLong);
                long jLongValue = asLong.longValue();
                ck.p.j(asString2, "configType");
                Class clsA = AbstractC3197t4.a(asString2);
                ck.p.j(jSONObject, "jsonObject");
                ck.p.j(clsA, "type");
                config = (Config) clsA.cast(AbstractC3029ma.a(jSONObject, clsA, null, null));
                if (config != null) {
                    config.setLastUpdateTimeStamp(jLongValue);
                } else {
                    config = null;
                }
            } catch (Exception unused) {
            }
            String.valueOf(config);
            if (config != null) {
                arrayList.add(config);
            }
        }
        return arrayList;
    }
}
