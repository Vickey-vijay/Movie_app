package u1;

import android.util.Log;
import ck.p;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: compiled from: UnityReflection.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0007J\f\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002R\u001c\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001a\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lu1/c;", "", "", "unityObject", "unityMethod", "message", "Lmj/r;", "d", "a", "eventMapping", "c", "Ljava/lang/Class;", "b", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Ljava/lang/Class;", "unityPlayer", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f72515a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = c.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static Class<?> unityPlayer;

    public static final void a() {
        d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    public static final void c(String str) {
        d("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    public static final void d(String str, String str2, String str3) {
        try {
            if (unityPlayer == null) {
                unityPlayer = f72515a.b();
            }
            Class<?> cls = unityPlayer;
            if (cls == null) {
                p.B("unityPlayer");
                throw null;
            }
            Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
            Class<?> cls2 = unityPlayer;
            if (cls2 != null) {
                method.invoke(cls2, str, str2, str3);
            } else {
                p.B("unityPlayer");
                throw null;
            }
        } catch (Exception e10) {
            Log.e(TAG, "Failed to send message to Unity", e10);
        }
    }

    public final Class<?> b() throws ClassNotFoundException {
        Class<?> cls = Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
        p.i(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }
}
