package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.AbstractC4223gj;
import io.appmetrica.analytics.impl.B5;
import io.appmetrica.analytics.impl.C4188fa;
import io.appmetrica.analytics.impl.C4245hf;
import io.appmetrica.analytics.impl.C4461q3;
import io.appmetrica.analytics.impl.C4485r3;
import io.appmetrica.analytics.impl.C5;
import io.appmetrica.analytics.impl.Cif;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes11.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f58085a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UriMatcher f58086b = new UriMatcher(-1);

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        AbstractC4223gj.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f58085a = true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        synchronized (this) {
            if (this.f58085a) {
                return null;
            }
            if (contentValues != null) {
                int iMatch = this.f58086b.match(uri);
                if (iMatch == 1) {
                    a(new C5(new C4245hf(), new Cif(), C4188fa.f56753d, "preload info"), contentValues);
                } else if (iMatch != 2) {
                    AbstractC4223gj.a("Bad content provider uri.", new Object[0]);
                } else {
                    a(new C5(new C4461q3(), new C4485r3(), C4188fa.f56753d, "clids"), contentValues);
                }
            }
            CountDownLatch countDownLatch = B5.f55002a;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            return null;
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        AbstractC4223gj.a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        AbstractC4223gj.a("Updating is not supported", new Object[0]);
        return -1;
    }

    private void a(C5 c10, ContentValues contentValues) {
        Context applicationContext;
        Context context = getContext();
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        if (applicationContext != null) {
            try {
                Object objInvoke = c10.f55077a.invoke(contentValues);
                if (objInvoke != null) {
                    c10.f55079c.b(applicationContext);
                    if (((Boolean) c10.f55078b.invoke(objInvoke)).booleanValue()) {
                        AbstractC4223gj.a("Successfully saved " + c10.f55080d, new Object[0]);
                    } else {
                        AbstractC4223gj.a("Did not save " + c10.f55080d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th2) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Unexpected error occurred", new Object[0]) + "\n" + StringUtils.throwableToString(th2), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context applicationContext;
        String packageName;
        Context context = getContext();
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        if (applicationContext != null) {
            packageName = applicationContext.getPackageName();
        } else {
            packageName = "";
        }
        String str = packageName + ".appmetrica.preloadinfo.retail";
        this.f58086b.addURI(str, "preloadinfo", 1);
        this.f58086b.addURI(str, "clids", 2);
        B5.f55002a = new CountDownLatch(1);
        B5.f55003b = this;
        return true;
    }
}
