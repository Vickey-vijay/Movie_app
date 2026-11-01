package io.bidmachine.iab.utils;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class SystemFeatureAvailability {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f59406a;

    public SystemFeatureAvailability(@NonNull Context context) {
        this.f59406a = context.getApplicationContext();
    }

    public boolean hasTelephony() {
        return this.f59406a.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }
}
