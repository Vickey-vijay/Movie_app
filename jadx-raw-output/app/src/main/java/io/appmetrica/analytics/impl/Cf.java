package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class Cf implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentValues f55103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResultReceiver f55104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f55102c = UUID.randomUUID().toString();
    public static final Parcelable.Creator<Cf> CREATOR = new Bf();

    public Cf(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.f55103a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", f55102c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(AppMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f55104b = resultReceiver;
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            HashMap mapB = Gm.b(map);
            synchronized (this) {
                this.f55103a.put("PROCESS_CFG_CLIDS", AbstractC4241hb.b(mapB));
            }
        }
    }

    public final void b(AppMetricaConfig appMetricaConfig) {
        List<String> list = appMetricaConfig.customHosts;
        if (list != null) {
            synchronized (this) {
                this.f55103a.put("PROCESS_CFG_CUSTOM_HOSTS", mo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
            }
        }
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        if (str != null) {
            synchronized (this) {
                this.f55103a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            i();
        }
    }

    public final void d(AppMetricaConfig appMetricaConfig) {
        if (appMetricaConfig != null) {
            synchronized (this) {
                b(appMetricaConfig);
                a(appMetricaConfig);
                c(appMetricaConfig);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final synchronized void i() {
        this.f55103a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
    }

    public final String e() {
        return this.f55103a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    public final Integer f() {
        return this.f55103a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    public final String g() {
        return this.f55103a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    public final boolean h() {
        return this.f55103a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public final String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.f55103a + ", mDataResultReceiver=" + this.f55104b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f55103a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f55104b);
        parcel.writeBundle(bundle);
    }

    public final HashMap a() {
        return AbstractC4241hb.c(this.f55103a.getAsString("PROCESS_CFG_CLIDS"));
    }

    public final String c() {
        return this.f55103a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    public final String d() {
        return this.f55103a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    public Cf(Cf cf2) {
        synchronized (cf2) {
            this.f55103a = new ContentValues(cf2.f55103a);
            this.f55104b = cf2.f55104b;
        }
    }

    public final ArrayList b() {
        String asString = this.f55103a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return AbstractC4241hb.b(asString);
    }

    public Cf(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.f55103a = contentValues == null ? new ContentValues() : contentValues;
        this.f55104b = resultReceiver;
    }
}
