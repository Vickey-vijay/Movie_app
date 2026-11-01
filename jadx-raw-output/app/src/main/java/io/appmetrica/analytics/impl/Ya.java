package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Ya implements Parcelable {
    public static final Parcelable.Creator<Ya> CREATOR = new Xa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResultReceiver f56240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f56241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f56242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f56243d;

    public Ya(C6 c10, List list, Map map, boolean z10) {
        this.f56241b = list;
        this.f56240a = c10;
        this.f56242c = map == null ? new HashMap() : new HashMap(map);
        this.f56243d = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f56240a);
        if (this.f56241b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f56241b));
        }
        HashMap map = this.f56242c;
        if (map != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", Gm.a((Map) map));
        }
        bundle.putBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration", this.f56243d);
        parcel.writeBundle(bundle);
    }

    public Ya(Parcel parcel) {
        Bundle bundle = parcel.readBundle(C6.class.getClassLoader());
        if (bundle != null) {
            this.f56240a = (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f56241b = bundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f56242c = Gm.a(bundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            this.f56243d = bundle.getBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration");
            return;
        }
        this.f56242c = new HashMap();
    }
}
