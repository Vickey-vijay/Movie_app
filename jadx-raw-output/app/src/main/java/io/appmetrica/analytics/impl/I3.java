package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* JADX INFO: loaded from: classes5.dex */
public class I3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cf f55334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CounterConfiguration f55335b;

    @Nullable
    public static I3 a(@NonNull Context context, @NonNull Bundle bundle) {
        Cf cf2;
        String str = Cf.f55102c;
        if (bundle != null) {
            try {
                cf2 = (Cf) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
                cf2 = null;
            }
        } else {
            cf2 = null;
        }
        CounterConfiguration counterConfigurationFromBundle = CounterConfiguration.fromBundle(bundle);
        if (counterConfigurationFromBundle == null || cf2 == null || !context.getPackageName().equals(cf2.f55103a.getAsString("PROCESS_CFG_PACKAGE_NAME")) || cf2.f55103a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() != AppMetrica.getLibraryApiLevel()) {
            return null;
        }
        return new I3(cf2, counterConfigurationFromBundle);
    }

    @NonNull
    public final CounterConfiguration b() {
        return this.f55335b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f55334a + ", mCounterConfiguration=" + this.f55335b + '}';
    }

    public I3(Cf cf2, CounterConfiguration counterConfiguration) {
        this.f55334a = cf2;
        this.f55335b = counterConfiguration;
    }

    @NonNull
    public final Cf a() {
        return this.f55334a;
    }
}
