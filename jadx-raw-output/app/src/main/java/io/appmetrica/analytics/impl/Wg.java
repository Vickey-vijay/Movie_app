package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Wg extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafePackageManager f56118b;

    public Wg(Y4 y10) {
        this(y10, new SafePackageManager());
    }

    @VisibleForTesting
    public Wg(Y4 y10, @NonNull SafePackageManager safePackageManager) {
        super(y10);
        this.f56118b = safePackageManager;
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q10) {
        HashSet hashSet;
        Y4 y10 = this.f55865a;
        if (y10.f56218t.c() && y10.y()) {
            Xe xe2 = y10.f56201c;
            String strE = this.f55865a.f56201c.e();
            if (TextUtils.isEmpty(strE)) {
                hashSet = null;
            } else {
                try {
                    hashSet = new HashSet();
                    JSONArray jSONArray = new JSONArray(strE);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        hashSet.add(new S9(jSONArray.getJSONObject(i10)));
                    }
                } catch (Throwable unused) {
                    hashSet = null;
                }
            }
            try {
                ArrayList<S9> arrayListB = b();
                if (CollectionUtils.areCollectionsEqual(hashSet, arrayListB)) {
                    C4342l9 c4342l9 = y10.f56212n;
                    int i11 = c4342l9.f57189j;
                    c4342l9.f57191l = i11;
                    c4342l9.f57180a.a(i11).b();
                } else {
                    JSONArray jSONArray2 = new JSONArray();
                    for (S9 s10 : arrayListB) {
                        s10.getClass();
                        JSONObject jSONObjectPut = new JSONObject().put("name", s10.f55858a).put(VastAttributes.REQUIRED, s10.f55860c);
                        int i12 = s10.f55859b;
                        if (i12 != -1) {
                            jSONObjectPut.put("version", i12);
                        }
                        jSONArray2.put(jSONObjectPut);
                    }
                    Q5 q5A = Q5.a(q10, new JSONObject().put("features", jSONArray2).toString());
                    C4342l9 c4342l10 = y10.f56212n;
                    c4342l10.a(q5A, Sk.a(c4342l10.f57182c.b(q5A), q5A.f55781i));
                    int i13 = c4342l10.f57189j;
                    c4342l10.f57191l = i13;
                    c4342l10.f57180a.a(i13).b();
                    xe2.i(jSONArray2.toString());
                }
            } catch (Throwable unused2) {
            }
        }
        return false;
    }

    public final ArrayList b() {
        FeatureInfo[] featureInfoArr;
        try {
            Y4 y10 = this.f55865a;
            SafePackageManager safePackageManager = this.f56118b;
            Context context = y10.f56199a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            R9 p10 = AndroidUtils.isApiAchieved(24) ? new P9() : new Q9();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(p10.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }
}
