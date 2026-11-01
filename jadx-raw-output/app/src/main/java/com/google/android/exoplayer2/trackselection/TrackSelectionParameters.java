package com.google.android.exoplayer2.trackselection;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import g5.k0;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class TrackSelectionParameters implements Parcelable {
    public static final Parcelable.Creator<TrackSelectionParameters> CREATOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TrackSelectionParameters f19874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final TrackSelectionParameters f19875h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f19876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f19877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19880f;

    public class a implements Parcelable.Creator<TrackSelectionParameters> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackSelectionParameters createFromParcel(Parcel parcel) {
            return new TrackSelectionParameters(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackSelectionParameters[] newArray(int i10) {
            return new TrackSelectionParameters[i10];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f19881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f19882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f19884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19885e;

        public b(Context context) {
            this();
            d(context);
        }

        public TrackSelectionParameters a() {
            return new TrackSelectionParameters(this.f19881a, this.f19882b, this.f19883c, this.f19884d, this.f19885e);
        }

        public b b(@Nullable String str) {
            this.f19881a = str;
            return this;
        }

        public b c(@Nullable String str) {
            this.f19882b = str;
            return this;
        }

        public b d(Context context) {
            if (k0.f53108a >= 19) {
                e(context);
            }
            return this;
        }

        @TargetApi(19)
        public final void e(Context context) {
            CaptioningManager captioningManager;
            if ((k0.f53108a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f19883c = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f19882b = k0.L(locale);
                }
            }
        }

        @Deprecated
        public b() {
            this.f19881a = null;
            this.f19882b = null;
            this.f19883c = 0;
            this.f19884d = false;
            this.f19885e = 0;
        }

        public b(TrackSelectionParameters trackSelectionParameters) {
            this.f19881a = trackSelectionParameters.f19876b;
            this.f19882b = trackSelectionParameters.f19877c;
            this.f19883c = trackSelectionParameters.f19878d;
            this.f19884d = trackSelectionParameters.f19879e;
            this.f19885e = trackSelectionParameters.f19880f;
        }
    }

    public TrackSelectionParameters(@Nullable String str, @Nullable String str2, int i10, boolean z10, int i11) {
        this.f19876b = k0.n0(str);
        this.f19877c = k0.n0(str2);
        this.f19878d = i10;
        this.f19879e = z10;
        this.f19880f = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
        return TextUtils.equals(this.f19876b, trackSelectionParameters.f19876b) && TextUtils.equals(this.f19877c, trackSelectionParameters.f19877c) && this.f19878d == trackSelectionParameters.f19878d && this.f19879e == trackSelectionParameters.f19879e && this.f19880f == trackSelectionParameters.f19880f;
    }

    static {
        TrackSelectionParameters trackSelectionParametersA = new b().a();
        f19874g = trackSelectionParametersA;
        f19875h = trackSelectionParametersA;
        CREATOR = new a();
    }

    public int hashCode() {
        String str = this.f19876b;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f19877c;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f19878d) * 31) + (this.f19879e ? 1 : 0)) * 31) + this.f19880f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19876b);
        parcel.writeString(this.f19877c);
        parcel.writeInt(this.f19878d);
        k0.O0(parcel, this.f19879e);
        parcel.writeInt(this.f19880f);
    }

    public TrackSelectionParameters(Parcel parcel) {
        this.f19876b = parcel.readString();
        this.f19877c = parcel.readString();
        this.f19878d = parcel.readInt();
        this.f19879e = k0.u0(parcel);
        this.f19880f = parcel.readInt();
    }
}
