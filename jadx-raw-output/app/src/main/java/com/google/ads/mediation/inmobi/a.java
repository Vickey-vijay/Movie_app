package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdError;
import com.inmobi.sdk.SdkInitializationListener;
import java.util.ArrayList;
import java.util.Iterator;
import t2.f;
import t2.g;
import t2.n;

/* JADX INFO: compiled from: InMobiInitializer.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements SdkInitializationListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f18891d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public final ArrayList<InterfaceC0173a> f18893b = new ArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public int f18892a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f18894c = new n();

    /* JADX INFO: renamed from: com.google.ads.mediation.inmobi.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: InMobiInitializer.java */
    public interface InterfaceC0173a {
        void onInitializeError(@NonNull AdError adError);

        void onInitializeSuccess();
    }

    public static a a() {
        if (f18891d == null) {
            f18891d = new a();
        }
        return f18891d;
    }

    public void b(@NonNull Context context, @NonNull @Size(max = 36, min = 32) String str, @NonNull InterfaceC0173a interfaceC0173a) {
        if (this.f18892a == 2) {
            interfaceC0173a.onInitializeSuccess();
            return;
        }
        this.f18893b.add(interfaceC0173a);
        if (this.f18892a == 1) {
            return;
        }
        this.f18892a = 1;
        this.f18894c.c(context, str, f.a(), this);
    }

    @Override // com.inmobi.sdk.SdkInitializationListener
    public void onInitializationComplete(@Nullable Error error) {
        if (error == null) {
            Log.d(InMobiMediationAdapter.TAG, "InMobi SDK initialized.");
            this.f18892a = 2;
            Iterator<InterfaceC0173a> it = this.f18893b.iterator();
            while (it.hasNext()) {
                it.next().onInitializeSuccess();
            }
        } else {
            this.f18892a = 0;
            AdError adErrorA = g.a(101, error.getLocalizedMessage());
            Iterator<InterfaceC0173a> it2 = this.f18893b.iterator();
            while (it2.hasNext()) {
                it2.next().onInitializeError(adErrorA);
            }
        }
        this.f18893b.clear();
    }
}
