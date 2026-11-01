package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f9706a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f9707b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Collection f9708c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f9709d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f9710e = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f9711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f9712b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private EnumC0049a f9713c = EnumC0049a.NOT_SET;

        /* JADX INFO: renamed from: com.applovin.impl.v$a$a, reason: collision with other inner class name */
        public enum EnumC0049a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f9718a;

            public String b() {
                return this.f9718a;
            }

            EnumC0049a(String str) {
                this.f9718a = str;
            }
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this) || c() != aVar.c()) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            EnumC0049a enumC0049aB = b();
            EnumC0049a enumC0049aB2 = aVar.b();
            return enumC0049aB != null ? enumC0049aB.equals(enumC0049aB2) : enumC0049aB2 == null;
        }

        public void a(boolean z10) {
            this.f9711a = z10;
        }

        public EnumC0049a b() {
            return this.f9713c;
        }

        public boolean c() {
            return this.f9711a;
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + c() + ", advertisingId=" + a() + ", dntCode=" + b() + ")";
        }

        public void a(String str) {
            this.f9712b = str;
        }

        public int hashCode() {
            int i10;
            int iHashCode;
            if (c()) {
                i10 = 79;
            } else {
                i10 = 97;
            }
            String strA = a();
            int i11 = (i10 + 59) * 59;
            int iHashCode2 = 43;
            if (strA == null) {
                iHashCode = 43;
            } else {
                iHashCode = strA.hashCode();
            }
            int i12 = i11 + iHashCode;
            EnumC0049a enumC0049aB = b();
            int i13 = i12 * 59;
            if (enumC0049aB != null) {
                iHashCode2 = enumC0049aB.hashCode();
            }
            return i13 + iHashCode2;
        }

        public void a(EnumC0049a enumC0049a) {
            this.f9713c = enumC0049a;
        }

        public String a() {
            return this.f9712b;
        }
    }

    private static a a(Context context) {
        a aVar;
        HashSet hashSet;
        n7.a();
        Object obj = f9707b;
        synchronized (obj) {
            if (f9709d) {
                return f9710e;
            }
            Collection collection = f9708c;
            boolean zIsEmpty = collection.isEmpty();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            collection.add(countDownLatch);
            if (zIsEmpty) {
                a aVarC = c(context);
                synchronized (obj) {
                    f9709d = true;
                    f9710e = aVarC;
                    hashSet = new HashSet(collection);
                    collection.clear();
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((CountDownLatch) it.next()).countDown();
                }
            }
            try {
                if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                    com.applovin.impl.sdk.o.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                }
            } catch (InterruptedException e10) {
                com.applovin.impl.sdk.o.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e10);
            }
            synchronized (f9707b) {
                aVar = f9710e;
            }
            return aVar;
        }
    }

    @Nullable
    private static a collectFireOSAdvertisingInfo(Context context) {
        if (f9706a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                boolean z10 = Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) != 0;
                aVar.a(z10);
                aVar.a(z10 ? a.EnumC0049a.ON : a.EnumC0049a.OFF);
                return aVar;
            } catch (Settings.SettingNotFoundException e10) {
                com.applovin.impl.sdk.o.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e10);
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("DataCollector", "Unable to collect Fire OS IDFA", th2);
            }
        }
        f9706a = false;
        return null;
    }

    public static a b(Context context) {
        return a(context);
    }

    private static a c(Context context) {
        a aVarCollectGoogleAdvertisingInfo = collectGoogleAdvertisingInfo(context);
        if (aVarCollectGoogleAdvertisingInfo == null) {
            aVarCollectGoogleAdvertisingInfo = collectFireOSAdvertisingInfo(context);
        }
        if (aVarCollectGoogleAdvertisingInfo == null) {
            return new a();
        }
        return aVarCollectGoogleAdvertisingInfo;
    }

    @Nullable
    private static a collectGoogleAdvertisingInfo(Context context) {
        a.EnumC0049a enumC0049a;
        n7.a();
        if (a()) {
            try {
                a aVar = new a();
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                aVar.a(zIsLimitAdTrackingEnabled);
                if (zIsLimitAdTrackingEnabled) {
                    enumC0049a = a.EnumC0049a.ON;
                } else {
                    enumC0049a = a.EnumC0049a.OFF;
                }
                aVar.a(enumC0049a);
                aVar.a(advertisingIdInfo.getId());
                return aVar;
            } catch (Throwable th2) {
                if (!AppLovinSdkUtils.isFireOS(context)) {
                    com.applovin.impl.sdk.o.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th2);
                    return null;
                }
                return null;
            }
        }
        if (!AppLovinSdkUtils.isFireOS(context)) {
            com.applovin.impl.sdk.o.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        return null;
    }

    public static boolean a() {
        return n7.a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
}
