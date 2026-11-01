package com.google.android.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import g5.k0;

/* JADX INFO: loaded from: classes.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19430b;

    public class a implements Parcelable.Creator<Requirements> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Requirements[] newArray(int i10) {
            return new Requirements[i10];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Requirements.class == obj.getClass() && this.f19430b == ((Requirements) obj).f19430b;
    }

    public static boolean h(ConnectivityManager connectivityManager) {
        if (k0.f53108a < 24) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return networkCapabilities != null && networkCapabilities.hasCapability(16);
    }

    public boolean d() {
        return (this.f19430b & 8) != 0;
    }

    public final boolean e(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public final boolean f(Context context) {
        PowerManager powerManager = (PowerManager) g5.a.e(context.getSystemService("power"));
        int i10 = k0.f53108a;
        if (i10 >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        if (i10 >= 20) {
            if (!powerManager.isInteractive()) {
                return true;
            }
        } else if (!powerManager.isScreenOn()) {
            return true;
        }
        return false;
    }

    public boolean g() {
        return (this.f19430b & 4) != 0;
    }

    public int hashCode() {
        return this.f19430b;
    }

    public boolean i() {
        return (this.f19430b & 1) != 0;
    }

    public boolean j() {
        return (this.f19430b & 2) != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19430b);
    }

    public Requirements(int i10) {
        this.f19430b = (i10 & 2) != 0 ? i10 | 1 : i10;
    }

    public boolean a(Context context) {
        if (c(context) == 0) {
            return true;
        }
        return false;
    }

    public final int b(Context context) {
        if (!i()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) g5.a.e(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && h(connectivityManager)) {
            if (!j() || !connectivityManager.isActiveNetworkMetered()) {
                return 0;
            }
            return 2;
        }
        return this.f19430b & 3;
    }

    public int c(Context context) {
        int iB = b(context);
        if (d() && !e(context)) {
            iB |= 8;
        }
        if (g() && !f(context)) {
            return iB | 4;
        }
        return iB;
    }
}
