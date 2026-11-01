package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import com.facebook.FacebookException;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3784xa;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: AttributionIdentifiers.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0003\u0003\u0007\u000bB\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR(\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\rR(\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\rR$\u0010\u0017\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/facebook/internal/b;", "", "", "a", "Ljava/lang/String;", "androidAdvertiserIdValue", "", "b", "J", "fetchTime", "<set-?>", "c", "j", "()Ljava/lang/String;", "attributionId", "d", "i", "androidInstallerPackage", "", "e", "Z", CampaignEx.JSON_KEY_AD_K, "()Z", "isTrackingLimited", "h", "androidAdvertiserId", "<init>", "()V", InneractiveMediationDefs.GENDER_FEMALE, "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f14346g = b.class.getCanonicalName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static b f14347h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String androidAdvertiserIdValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public long fetchTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public String attributionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String androidInstallerPackage;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isTrackingLimited;

    /* JADX INFO: renamed from: com.facebook.internal.b$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AttributionIdentifiers.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u001c\u0010\u001f\u001a\n \u001e*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u001e\u0010 \u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010\u0015¨\u0006$"}, d2 = {"Lcom/facebook/internal/b$a;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "h", "Lcom/facebook/internal/b;", "e", "b", "c", "g", "d", "identifiers", "a", "", InneractiveMediationDefs.GENDER_FEMALE, "ANDROID_ID_COLUMN_NAME", "Ljava/lang/String;", "ATTRIBUTION_ID_COLUMN_NAME", "ATTRIBUTION_ID_CONTENT_PROVIDER", "getATTRIBUTION_ID_CONTENT_PROVIDER$facebook_core_release$annotations", "()V", "ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI", "", "CONNECTION_RESULT_SUCCESS", "I", "", "IDENTIFIER_REFRESH_INTERVAL_MILLIS", "J", "LIMIT_TRACKING_COLUMN_NAME", "kotlin.jvm.PlatformType", "TAG", "cachedIdentifiers", "Lcom/facebook/internal/b;", "getCachedIdentifiers$facebook_core_release$annotations", "<init>", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final b c(Context context) {
            Object objO;
            try {
                if (!g(context)) {
                    return null;
                }
                j0 j0Var = j0.f14425a;
                boolean zBooleanValue = false;
                Method methodH = j0.H("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                if (methodH == null || (objO = j0.O(null, methodH, context)) == null) {
                    return null;
                }
                Method methodG = j0.G(objO.getClass(), "getId", new Class[0]);
                Method methodG2 = j0.G(objO.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (methodG != null && methodG2 != null) {
                    b bVar = new b();
                    bVar.androidAdvertiserIdValue = (String) j0.O(objO, methodG, new Object[0]);
                    Boolean bool = (Boolean) j0.O(objO, methodG2, new Object[0]);
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                    bVar.isTrackingLimited = zBooleanValue;
                    return bVar;
                }
                return null;
            } catch (Exception e10) {
                j0.d0("android_id", e10);
                return null;
            }
        }

        public final b d(Context context) {
            c cVar = new c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, cVar, 1)) {
                    try {
                        C0168b c0168b = new C0168b(cVar.m());
                        b bVar = new b();
                        bVar.androidAdvertiserIdValue = c0168b.h();
                        bVar.isTrackingLimited = c0168b.i();
                        return bVar;
                    } catch (Exception e10) {
                        j0.d0("android_id", e10);
                        return null;
                    } finally {
                        context.unbindService(cVar);
                    }
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0065 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:17:0x0067 A[Catch: all -> 0x00f5, Exception -> 0x00f7, TryCatch #4 {Exception -> 0x00f7, all -> 0x00f5, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x004e, B:14:0x005d, B:21:0x007e, B:23:0x0084, B:25:0x0089, B:27:0x008e, B:17:0x0067, B:19:0x0076, B:49:0x00ed, B:50:0x00f4), top: B:69:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:19:0x0076 A[Catch: all -> 0x00f5, Exception -> 0x00f7, TryCatch #4 {Exception -> 0x00f7, all -> 0x00f5, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x004e, B:14:0x005d, B:21:0x007e, B:23:0x0084, B:25:0x0089, B:27:0x008e, B:17:0x0067, B:19:0x0076, B:49:0x00ed, B:50:0x00f4), top: B:69:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x0114  */
        public final b e(Context context) throws Throwable {
            Cursor cursor;
            Uri uri;
            String str;
            Uri uri2;
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            b bVarB = b(context);
            Cursor cursor2 = null;
            try {
                if (ck.p.e(Looper.myLooper(), Looper.getMainLooper())) {
                    throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                }
                b bVar = b.f14347h;
                if (bVar != null && System.currentTimeMillis() - bVar.fetchTime < 3600000) {
                    return bVar;
                }
                String[] strArr = {C3784xa.f31580b, "androidid", "limit_tracking"};
                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                ProviderInfo providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                if (providerInfoResolveContentProvider != null) {
                    k kVar = k.f14433a;
                    String str2 = providerInfoResolveContentProvider.packageName;
                    ck.p.i(str2, "contentProviderInfo.packageName");
                    if (k.a(context, str2)) {
                        uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                    } else {
                        if (providerInfoResolveContentProvider2 != null) {
                            k kVar2 = k.f14433a;
                            str = providerInfoResolveContentProvider2.packageName;
                            ck.p.i(str, "wakizashiProviderInfo.packageName");
                            if (k.a(context, str)) {
                                uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                            }
                        }
                        uri = null;
                    }
                    uri = uri2;
                } else {
                    if (providerInfoResolveContentProvider2 != null) {
                        k kVar3 = k.f14433a;
                        str = providerInfoResolveContentProvider2.packageName;
                        ck.p.i(str, "wakizashiProviderInfo.packageName");
                        if (k.a(context, str)) {
                            uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                            uri = uri2;
                        }
                    }
                    uri = null;
                }
                String strF = f(context);
                if (strF != null) {
                    bVarB.androidInstallerPackage = strF;
                }
                if (uri == null) {
                    return a(bVarB);
                }
                Cursor cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int columnIndex = cursorQuery.getColumnIndex(C3784xa.f31580b);
                            int columnIndex2 = cursorQuery.getColumnIndex("androidid");
                            int columnIndex3 = cursorQuery.getColumnIndex("limit_tracking");
                            bVarB.attributionId = cursorQuery.getString(columnIndex);
                            if (columnIndex2 > 0 && columnIndex3 > 0 && bVarB.h() == null) {
                                bVarB.androidAdvertiserIdValue = cursorQuery.getString(columnIndex2);
                                bVarB.isTrackingLimited = Boolean.parseBoolean(cursorQuery.getString(columnIndex3));
                            }
                            cursorQuery.close();
                            return a(bVarB);
                        }
                    } catch (Exception e10) {
                        cursor = cursorQuery;
                        e = e10;
                        try {
                            j0 j0Var = j0.f14425a;
                            j0.e0(b.f14346g, ck.p.s("Caught unexpected exception in getAttributionId(): ", e));
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        cursor2 = cursorQuery;
                        th = th3;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                }
                b bVarA = a(bVarB);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return bVarA;
            } catch (Exception e11) {
                e = e11;
                cursor = null;
            } catch (Throwable th4) {
                th = th4;
            }
        }

        public final boolean g(Context context) {
            j0 j0Var = j0.f14425a;
            Method methodH = j0.H("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (methodH == null) {
                return false;
            }
            Object objO = j0.O(null, methodH, context);
            return (objO instanceof Integer) && ck.p.e(objO, 0);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean h(Context context) throws Throwable {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            b bVarE = e(context);
            return bVarE != null && bVarE.getIsTrackingLimited();
        }

        public final b a(b identifiers) {
            identifiers.fetchTime = System.currentTimeMillis();
            b.f14347h = identifiers;
            return identifiers;
        }

        public final b b(Context context) {
            b bVarC = c(context);
            if (bVarC == null) {
                b bVarD = d(context);
                if (bVarD == null) {
                    return new b();
                }
                return bVarD;
            }
            return bVarC;
        }

        public final String f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getInstallerPackageName(context.getPackageName());
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AttributionIdentifiers.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0013\u0010\n\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/b$b;", "Landroid/os/IInterface;", "Landroid/os/IBinder;", "asBinder", "b", "Landroid/os/IBinder;", "binder", "", "h", "()Ljava/lang/String;", "advertiserId", "", "i", "()Z", "isTrackingLimited", "<init>", "(Landroid/os/IBinder;)V", "c", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class C0168b implements IInterface {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final IBinder binder;

        public C0168b(IBinder iBinder) {
            ck.p.j(iBinder, "binder");
            this.binder = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.binder;
        }

        public final String h() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            ck.p.i(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            ck.p.i(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.binder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final boolean i() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            ck.p.i(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            ck.p.i(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z10 = true;
                parcelObtain.writeInt(1);
                this.binder.transact(2, parcelObtain, parcelObtain2, 0);
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
    }

    /* JADX INFO: compiled from: AttributionIdentifiers.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/facebook/internal/b$c;", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "Lmj/r;", "onServiceConnected", "onServiceDisconnected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "consumed", "Ljava/util/concurrent/BlockingQueue;", "c", "Ljava/util/concurrent/BlockingQueue;", "queue", InneractiveMediationDefs.GENDER_MALE, "()Landroid/os/IBinder;", "binder", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class c implements ServiceConnection {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final AtomicBoolean consumed = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final BlockingQueue<IBinder> queue = new LinkedBlockingDeque();

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public final IBinder m() throws InterruptedException {
            if (!(!this.consumed.compareAndSet(true, true))) {
                throw new IllegalStateException("Binder already consumed".toString());
            }
            IBinder iBinderTake = this.queue.take();
            ck.p.i(iBinderTake, "queue.take()");
            return iBinderTake;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.queue.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getAndroidInstallerPackage() {
        return this.androidInstallerPackage;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getAttributionId() {
        return this.attributionId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsTrackingLimited() {
        return this.isTrackingLimited;
    }

    public final String h() {
        if (q1.t.F() && q1.t.k()) {
            return this.androidAdvertiserIdValue;
        }
        return null;
    }
}
