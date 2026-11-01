package com.monetization.ads.core.identifiers.ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import yads.ad1;
import yads.ce;

/* JADX INFO: loaded from: classes2.dex */
public final class GmsServiceAdvertisingInfoReader implements ce, IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f42905a;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f42905a;
    }

    public GmsServiceAdvertisingInfoReader(IBinder iBinder) {
        this.f42905a = iBinder;
    }

    @Override // yads.ce
    public Boolean readAdTrackingLimited() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z10 = true;
                parcelObtain.writeInt(1);
                this.f42905a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z10 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z10);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return boolValueOf;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (Throwable unused) {
            boolean z11 = ad1.f75480a;
            return null;
        }
    }

    @Override // yads.ce
    public String readAdvertisingId() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f42905a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String string = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return string;
            } catch (Throwable unused) {
                boolean z10 = ad1.f75480a;
                return null;
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
