package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Di {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Context f55143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55145c;

    public abstract Object a(int i10);

    @Nullable
    public final Object a() {
        int identifier = this.f55143a.getResources().getIdentifier(this.f55144b, this.f55145c, this.f55143a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    public Di(Context context, String str, String str2) {
        this.f55143a = context;
        this.f55144b = str;
        this.f55145c = str2;
    }
}
