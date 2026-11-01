package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class Gh extends I3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public E8 f55268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4597vf f55269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f55270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f55271f;

    public Gh(@NonNull Cf cf2, @NonNull CounterConfiguration counterConfiguration, @NonNull E8 e10) {
        this(cf2, counterConfiguration, e10, null);
    }

    @Nullable
    public final synchronized String d() {
        E8 e10;
        e10 = this.f55268c;
        return e10.f55173a.isEmpty() ? null : new JSONObject(e10.f55173a).toString();
    }

    @Nullable
    public final synchronized String e() {
        return this.f55271f;
    }

    public Gh(@NonNull Cf cf2, @NonNull CounterConfiguration counterConfiguration, @NonNull E8 e10, @Nullable String str) {
        super(cf2, counterConfiguration);
        this.f55270e = true;
        this.f55271f = str;
        this.f55268c = e10;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.f55335b.toBundle(bundle);
        Cf cf2 = this.f55334a;
        synchronized (cf2) {
            bundle.putParcelable("PROCESS_CFG_OBJ", cf2);
        }
        return bundle;
    }

    public boolean f() {
        return this.f55270e;
    }
}
