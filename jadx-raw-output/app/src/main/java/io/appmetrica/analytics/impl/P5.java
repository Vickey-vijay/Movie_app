package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* JADX INFO: loaded from: classes.dex */
public final class P5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        EnumC4392n9 enumC4392n9;
        Bundle bundle = parcel.readBundle(C6.class.getClassLoader());
        if (bundle.containsKey("CounterReport.Source")) {
            int i10 = bundle.getInt("CounterReport.Source");
            EnumC4392n9[] enumC4392n9ArrValues = EnumC4392n9.values();
            int length = enumC4392n9ArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    enumC4392n9 = EnumC4392n9.NATIVE;
                    break;
                }
                enumC4392n9 = enumC4392n9ArrValues[i11];
                if (enumC4392n9.f57340a == i10) {
                    break;
                }
                i11++;
            }
        } else {
            enumC4392n9 = null;
        }
        Q5 q10 = new Q5("", "", 0);
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        q10.f55776d = bundle.getInt("CounterReport.Type", -1);
        q10.f55777e = bundle.getInt("CounterReport.CustomType");
        q10.f55774b = StringUtils.ifIsNullToDef(bundle.getString("CounterReport.Value"), "");
        q10.f55775c = bundle.getString("CounterReport.Environment");
        q10.f55773a = bundle.getString("CounterReport.Event");
        q10.f55778f = Q5.a(bundle);
        q10.f55779g = bundle.getInt("CounterReport.TRUNCATED");
        q10.f55780h = bundle.getString("CounterReport.ProfileID");
        q10.f55781i = bundle.getLong("CounterReport.CreationElapsedRealtime");
        q10.f55782j = bundle.getLong("CounterReport.CreationTimestamp");
        q10.f55783k = EnumC4162ea.a(Integer.valueOf(bundle.getInt("CounterReport.UniquenessStatus")));
        q10.f55784l = enumC4392n9;
        q10.f55785m = bundle.getBundle("CounterReport.Payload");
        q10.f55786n = bundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(bundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        q10.f55787o = bundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(bundle.getInt("CounterReport.OpenId")) : null;
        q10.f55788p = CollectionUtils.bundleToMap(bundle.getBundle("CounterReport.Extras"));
        return q10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new Q5[i10];
    }
}
