package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1566Rx {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"jP5DLqFPT2uLfDhjwGtyJ", "b2Kf1V0V33xxSFNxYAUwKzTnuvA5CTmH", "utws2CXgYjyIi4p9N5JN7AtJgUuBwVKL", "iHkd", "J1QCfiNfulUMnwHMV72QByuh5OrpyBC4", "Ilbx2HAT56j3G7gTz5Evg9nZeC6mk12l", "SrkakodA8D", "LiqB"};
    public static final String A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1559Rp A02(SQ sq) {
        Object objA00;
        Method methodA02;
        Object objA01;
        Method methodA03 = AbstractC1567Ry.A02(A00, A04(257, 29, 2), Context.class);
        if (methodA03 == null || (objA00 = AbstractC1567Ry.A00(null, methodA03, sq)) == null || ((Integer) objA00).intValue() != 0 || (methodA02 = AbstractC1567Ry.A02(A04(65, 57, 83), A04(232, 20, 98), Context.class)) == null || (objA01 = AbstractC1567Ry.A00(null, methodA02, sq)) == null) {
            return null;
        }
        Method methodA01 = AbstractC1567Ry.A01(objA01.getClass(), A04(252, 5, 124), new Class[0]);
        Method methodA04 = AbstractC1567Ry.A01(objA01.getClass(), A04(286, 24, 126), new Class[0]);
        if (methodA01 == null || methodA04 == null) {
            return null;
        }
        String str = (String) AbstractC1567Ry.A00(objA01, methodA01, new Object[0]);
        Boolean bool = (Boolean) AbstractC1567Ry.A00(objA01, methodA04, new Object[0]);
        if (str != null) {
            return new C1559Rp(str, bool != null && bool.booleanValue(), EnumC1558Ro.A06);
        }
        return null;
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 90);
            if (A02[7].length() != 4) {
                throw new RuntimeException();
            }
            A02[0] = "KHgMerLXVce8bYpnKoYEO";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{102, 68, 75, 75, 74, 81, 5, 66, 64, 81, 5, 68, 65, 83, 64, 87, 81, 76, 86, 76, 75, 66, 5, 76, 75, 67, 74, 5, 74, 75, 5, 72, 68, 76, 75, 5, 81, 77, 87, 64, 68, 65, 11, 88, 84, 86, 21, 92, 84, 84, 92, 87, 94, 21, 90, 85, 95, 73, 84, 82, 95, 21, 92, 86, 72, 106, 102, 100, 39, 110, 102, 102, 110, 101, 108, 39, 104, 103, 109, 123, 102, 96, 109, 39, 110, 100, 122, 39, 104, 109, 122, 39, 96, 109, 108, 103, 125, 96, 111, 96, 108, 123, 39, 72, 109, 127, 108, 123, 125, 96, 122, 96, 103, 110, 64, 109, 74, 101, 96, 108, 103, 125, 38, ExifInterface.START_CODE, 40, 107, 34, ExifInterface.START_CODE, ExifInterface.START_CODE, 34, 41, 32, 107, 36, 43, 33, 55, ExifInterface.START_CODE, 44, 33, 107, 34, 40, 54, 107, 36, 33, 54, 107, 44, 33, 32, 43, 49, 44, 35, 44, 32, 55, 107, 54, 32, 55, 51, 44, 38, 32, 107, 22, 17, 4, 23, 17, 53, 57, 59, 120, 49, 57, 57, 49, 58, 51, 120, 55, 56, 50, 36, 57, 63, 50, 120, 49, 59, 37, 120, 53, 57, 59, 59, 57, 56, 120, 17, 57, 57, 49, 58, 51, 6, 58, 55, 47, 5, 51, 36, 32, 63, 53, 51, 37, 3, 34, 63, 58, 116, 118, 125, 118, 97, 122, 112, 95, 93, 76, 121, 92, 78, 93, 74, 76, 81, 75, 81, 86, 95, 113, 92, 113, 86, 94, 87, 65, 67, 82, 111, 66, 49, 43, 31, 55, 55, 63, 52, 61, 8, 52, 57, 33, 11, 61, ExifInterface.START_CODE, 46, 49, 59, 61, 43, 25, 46, 57, 49, 52, 57, 58, 52, 61, 77, 87, 104, 77, 73, 77, 80, 101, 64, 112, 86, 69, 71, 79, 77, 74, 67, 97, 74, 69, 70, 72, 65, 64};
    }

    static {
        A05();
        A03 = C1559Rp.class.getSimpleName();
        A00 = A04(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 52, 12);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    public static C1559Rp A00(SQ sq) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C1559Rp c1559RpA01 = A01(sq);
            if (c1559RpA01 != null) {
                boolean zIsEmpty = TextUtils.isEmpty(c1559RpA01.A03());
                if (A02[5].charAt(3) != 'x') {
                    throw new RuntimeException();
                }
                A02[0] = "hh0RZKDdPPlAkARzc3g59";
                if (zIsEmpty) {
                    c1559RpA01 = A02(sq);
                }
            } else {
                c1559RpA01 = A02(sq);
            }
            if (c1559RpA01 == null || TextUtils.isEmpty(c1559RpA01.A03())) {
                return A03(sq);
            }
            return c1559RpA01;
        }
        throw new IllegalStateException(A04(0, 43, 127));
    }

    public static C1559Rp A01(SQ sq) {
        SU adId = sq.A05().A8p();
        if (adId != null) {
            return new C1559Rp(adId.getId(), adId.AAO(), EnumC1558Ro.A02);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo] */
    public static C1559Rp A03(SQ sq) {
        ServiceConnectionC1565Rw serviceConnectionC1565Rw = new ServiceConnectionC1565Rw();
        Intent intent = new Intent(A04(122, 51, 31));
        intent.setPackage(A04(43, 22, 97));
        if (sq.bindService(intent, serviceConnectionC1565Rw, 1)) {
            try {
                final IBinder iBinderA02 = serviceConnectionC1565Rw.A02();
                ?? r10 = new IInterface(iBinderA02) { // from class: com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo
                    public static byte[] A01;
                    public static String[] A02 = {"CGAQp5QWLLSg2Up0KS3Xu0sm6KBD8ljy", "Yp64XCOUL3mdw2EQzsnOwJCP4iXogchF", "0bXbaFV76JbdIHYzvJ", "7kYBXtp0pJ6J2QiQOtBXkhx4Mjb4MhNb", "Pqj6DcWbIXVdg5nys55lljt7m2mFJmbz", "gqs8Z9zjV1B", "yb2LGnYLr1jAVzG6", "kQWFHy19WQfgSFrPEiRm4PYEBX"};
                    public IBinder A00;

                    public static String A00(int i10, int i11, int i12) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 103);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A01() {
                        A01 = new byte[]{100, 104, 106, 41, 96, 104, 104, 96, 107, 98, 41, 102, 105, 99, 117, 104, 110, 99, 41, 96, 106, 116, 41, 102, 99, 116, 41, 110, 99, 98, 105, 115, 110, 97, 110, 98, 117, 41, 110, 105, 115, 98, 117, 105, 102, 107, 41, 78, 70, 99, 113, 98, 117, 115, 110, 116, 110, 105, 96, 78, 99, 84, 98, 117, 113, 110, 100, 98};
                    }

                    static {
                        A01();
                    }

                    {
                        this.A00 = iBinderA02;
                    }

                    public final String A02() throws RemoteException {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken(A00(0, 68, 96));
                            this.A00.transact(1, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            String string = parcelObtain2.readString();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            if (string != null) {
                                return string;
                            }
                            if (A02[2].length() == 16) {
                                throw new RuntimeException();
                            }
                            A02[3] = "0APG8T86KeB7s6esCzOnlOcV6mb8f0OX";
                            return A00(0, 0, 82);
                        } catch (Throwable th2) {
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th2;
                        }
                    }

                    public final boolean A03() throws RemoteException {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken(A00(0, 68, 96));
                            boolean z10 = true;
                            parcelObtain.writeInt(1);
                            this.A00.transact(2, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            if (parcelObtain2.readInt() == 0) {
                                z10 = false;
                            }
                            return z10;
                        } finally {
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        }
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.A00;
                    }
                };
                C1559Rp c1559Rp = new C1559Rp(r10.A02(), r10.A03(), EnumC1558Ro.A07);
                sq.unbindService(serviceConnectionC1565Rw);
                return c1559Rp;
            } catch (Throwable th2) {
                try {
                    sq.A08().AAy(A04(225, 7, 73), AbstractC1590Sv.A1Q, new C1591Sw(th2));
                } finally {
                    sq.unbindService(serviceConnectionC1565Rw);
                }
            }
        }
        return null;
    }
}
