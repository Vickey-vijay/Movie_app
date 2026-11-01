package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.adquality.models.AdQualityResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2879g9 f22766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f22767b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(AdQualityResult adQualityResult, ContinuationImpl continuationImpl) throws Throwable {
        G0 g10;
        C3343z0 c3343z0;
        if (continuationImpl instanceof G0) {
            g10 = (G0) continuationImpl;
            int i10 = g10.f22708c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g10.f22708c = i10 - Integer.MIN_VALUE;
            } else {
                g10 = new G0(this, continuationImpl);
            }
        } else {
            g10 = new G0(this, continuationImpl);
        }
        Object obj = g10.f22706a;
        Object objF = sj.a.f();
        int i11 = g10.f22708c;
        if (i11 == 0) {
            kotlin.c.b(obj);
            C2879g9 c2879g9 = this.f22766a;
            ck.p.j(adQualityResult, "<this>");
            ContentValues contentValues = new ContentValues();
            contentValues.put("image_location", adQualityResult.getImageLocation());
            String sdkModelResult = adQualityResult.getSdkModelResult();
            if (sdkModelResult == null) {
                sdkModelResult = "";
            }
            contentValues.put("sdk_model_result", sdkModelResult);
            contentValues.put("beacon_url", adQualityResult.getBeaconUrl());
            contentValues.put("extras", adQualityResult.getExtras());
            g10.f22708c = 1;
            if (c2879g9.a("ad_quality_db", contentValues, 4, g10) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        WeakReference weakReference = this.f22767b;
        if (weakReference != null && (c3343z0 = (C3343z0) weakReference.get()) != null && c3343z0.f25819a.f22330b.get()) {
            c3343z0.f25819a.f22330b.set(false);
            c3343z0.f25819a.a();
        }
        return mj.r.f64562a;
    }

    public H0(C2879g9 c2879g9) {
        ck.p.j(c2879g9, "databaseHelper");
        this.f22766a = c2879g9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) throws Throwable {
        F0 f10;
        if (continuationImpl instanceof F0) {
            f10 = (F0) continuationImpl;
            int i10 = f10.f22617c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f10.f22617c = i10 - Integer.MIN_VALUE;
            } else {
                f10 = new F0(this, continuationImpl);
            }
        } else {
            f10 = new F0(this, continuationImpl);
        }
        Object objA = f10.f22615a;
        Object objF = sj.a.f();
        int i11 = f10.f22617c;
        if (i11 == 0) {
            kotlin.c.b(objA);
            C2879g9 c2879g9 = this.f22766a;
            f10.f22617c = 1;
            c2879g9.getClass();
            objA = c2879g9.a(new C2776c9(c2879g9, "SELECT * FROM ad_quality_db", null), f10);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
        }
        Iterable<ContentValues> iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(nj.t.v(iterable, 10));
        for (ContentValues contentValues : iterable) {
            ck.p.j(contentValues, "<this>");
            String asString = contentValues.getAsString("image_location");
            ck.p.i(asString, "getAsString(...)");
            String asString2 = contentValues.getAsString("sdk_model_result");
            String asString3 = contentValues.getAsString("beacon_url");
            ck.p.i(asString3, "getAsString(...)");
            arrayList.add(new AdQualityResult(asString, asString2, asString3, contentValues.getAsString("extras")));
        }
        return arrayList;
    }
}
