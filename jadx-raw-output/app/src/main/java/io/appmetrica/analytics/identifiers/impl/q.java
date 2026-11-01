package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f54844a;

    @VisibleForTesting
    public q(f fVar) {
        this.f54844a = fVar;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.b
    public final c a(Context context) {
        c cVar;
        try {
            try {
                try {
                    try {
                        c cVarB = b(context);
                        try {
                            return cVarB;
                        } catch (Throwable unused) {
                            return cVarB;
                        }
                    } catch (Throwable unused2) {
                        return cVar;
                    }
                } catch (g e10) {
                    String message = e10.getMessage();
                    if (message == null) {
                        message = "unknown exception while binding yandex adv_id service";
                    }
                    cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message, 2);
                    this.f54844a.b(context);
                    return cVar;
                }
            } catch (l e11) {
                String message2 = e11.getMessage();
                if (message2 == null) {
                    message2 = "No yandex adv_id service";
                }
                cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message2, 2);
                this.f54844a.b(context);
                return cVar;
            }
        } catch (Throwable th2) {
            return new c(IdentifierStatus.UNKNOWN, null, "exception while fetching yandex adv_id: " + th2.getMessage(), 2);
        } finally {
            try {
                this.f54844a.b(context);
            } catch (Throwable unused3) {
            }
        }
    }

    public final c b(Context context) {
        s sVar = (s) ((u) this.f54844a.a(context));
        sVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            sVar.f54846a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            String string = parcelObtain2.readString();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            Parcel parcelObtain3 = Parcel.obtain();
            Parcel parcelObtain4 = Parcel.obtain();
            try {
                parcelObtain3.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
                sVar.f54846a.transact(2, parcelObtain3, parcelObtain4, 0);
                parcelObtain4.readException();
                return new c(IdentifierStatus.OK, new a("yandex", string, Boolean.valueOf(parcelObtain4.readInt() != 0)), null, 4);
            } finally {
                parcelObtain4.recycle();
                parcelObtain3.recycle();
            }
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    public q() {
        this(new f(r.f54845a, p.f54843a, "yandex"));
    }
}
