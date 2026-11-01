package sg.bigo.ads.common.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.unity3d.services.core.fid.Constants;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f69492a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f69493b = true;

    @NonNull
    public static String a(@NonNull Context context) {
        if (!TextUtils.isEmpty(f69492a) || !f69493b) {
            return f69492a;
        }
        try {
            Class<?> cls = Class.forName("com.appsflyer.AppsFlyerLib");
            Object objInvoke = cls.getMethod("getAppsFlyerUID", Context.class).invoke(cls.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]), context);
            if (objInvoke instanceof String) {
                f69492a = (String) objInvoke;
            }
        } catch (Exception unused) {
            f69493b = false;
        }
        return f69492a;
    }
}
