package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4322kf implements Vi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57110b = "content://" + a() + "/preload_info";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57111c = "tracking_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57112d = "additional_parameters";

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.Vi, bk.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4497rf invoke() {
        Cursor cursorQuery;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (!PackageManagerUtils.hasContentProvider(this.f57109a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC4223gj.a("Satellite content provider with preload info was not found.", new Object[0]);
            return null;
        }
        try {
            cursorQuery = this.f57109a.getContentResolver().query(Uri.parse(this.f57110b), null, null, null, null);
            try {
                if (cursorQuery == null) {
                    AbstractC4223gj.a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f57111c));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f57112d));
                        if (string2 != null) {
                            try {
                                if (string2.length() == 0) {
                                    jSONObject = new JSONObject();
                                    jSONObject2 = jSONObject;
                                } else {
                                    jSONObject2 = new JSONObject(string2);
                                }
                            } catch (Throwable unused) {
                                jSONObject = new JSONObject();
                            }
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject2 = jSONObject;
                        }
                        if (!TextUtils.isEmpty(string) && ParseUtils.parseLong(string) == null) {
                            AbstractC4223gj.a("Tracking id from Satellite is not a number.", new Object[0]);
                        }
                        AbstractC4223gj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                        C4497rf c4497rf = new C4497rf(string, jSONObject2, !TextUtils.isEmpty(string), false, T7.f55912d);
                        mo.a(cursorQuery);
                        return c4497rf;
                    }
                    AbstractC4223gj.a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            cursorQuery = null;
        }
        mo.a(cursorQuery);
        return null;
    }

    public C4322kf(Context context) {
        this.f57109a = context;
    }
}
