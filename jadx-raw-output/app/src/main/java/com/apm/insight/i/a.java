package com.apm.insight.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.o;
import java.util.UUID;

/* JADX INFO: compiled from: DeviceUuidFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile UUID f6468a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f6469b = "";

    public static synchronized String a(Context context) {
        if (TextUtils.isEmpty(f6469b)) {
            new a(context);
            UUID uuid = f6468a;
            if (uuid != null) {
                f6469b = uuid.toString();
            }
        }
        return f6469b;
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private a(Context context) {
        if (f6468a == null) {
            synchronized (a.class) {
                if (f6468a == null) {
                    String strC = o.a().c();
                    if (strC != null) {
                        f6468a = UUID.fromString(strC);
                    } else {
                        String string = null;
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                        }
                        try {
                            if (string != null) {
                                f6468a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                            } else {
                                f6468a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            o.a().b(f6468a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }
}
