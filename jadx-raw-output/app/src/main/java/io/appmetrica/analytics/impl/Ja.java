package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface Ja extends Ea, Ic {
    void a(@Nullable Activity activity);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(@Nullable Location location);

    void a(@NonNull AnrListener anrListener);

    void a(@NonNull ExternalAttribution externalAttribution);

    void a(@NonNull Io io2);

    void a(@NonNull EnumC4382n enumC4382n);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(String str, String str2);

    void a(@NonNull String str, boolean z10);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(boolean z10);

    @Override // io.appmetrica.analytics.impl.Ic
    /* synthetic */ void a(boolean z10, boolean z11);

    void b(@Nullable Activity activity);

    @Override // io.appmetrica.analytics.impl.Ea
    /* synthetic */ void b(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.Ea
    /* synthetic */ void b(@NonNull String str, @Nullable String str2);

    @Override // io.appmetrica.analytics.impl.Ea
    /* synthetic */ boolean b();

    void c();

    void c(@NonNull String str);

    List<String> f();
}
