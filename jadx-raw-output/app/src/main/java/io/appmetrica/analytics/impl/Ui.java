package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class Ui implements Vi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55993b = "content://" + a() + "/clids";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55994c = "clid_key";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55995d = "clid_value";

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.Vi, bk.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4510s3 invoke() {
        Cursor cursorQuery;
        if (!PackageManagerUtils.hasContentProvider(this.f55992a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC4223gj.a("Satellite content provider with clids was not found.", new Object[0]);
            return null;
        }
        try {
            cursorQuery = this.f55992a.getContentResolver().query(Uri.parse(this.f55993b), null, null, null, null);
            try {
                if (cursorQuery == null) {
                    AbstractC4223gj.a("No Satellite content provider found", new Object[0]);
                    mo.a(cursorQuery);
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (cursorQuery.moveToNext()) {
                    try {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f55994c));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f55995d));
                        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                            AbstractC4223gj.a("Invalid clid {%s : %s}", string, string2);
                        } else {
                            linkedHashMap.put(string, string2);
                        }
                    } catch (Throwable unused) {
                    }
                }
                AbstractC4223gj.a("Clids from satellite: %s", linkedHashMap);
                C4510s3 c4510s3 = new C4510s3(linkedHashMap, T7.f55912d);
                mo.a(cursorQuery);
                return c4510s3;
            } catch (Throwable th2) {
                th = th2;
                try {
                    ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Error while getting satellite clids", new Object[0]) + "\n" + StringUtils.throwableToString(th), new Object[0]);
                } finally {
                    mo.a(cursorQuery);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }

    public Ui(Context context) {
        this.f55992a = context;
    }
}
