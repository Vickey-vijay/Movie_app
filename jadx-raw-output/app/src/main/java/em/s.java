package em;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: VCUtilsImp.java */
/* JADX INFO: loaded from: classes11.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f52686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map<Class<?>, Object> f52687b = new HashMap();

    public static void a(Context context) {
        if (context == null) {
            throw new NullPointerException("Cannot are null of  context");
        }
        f52686a = context.getApplicationContext();
    }
}
