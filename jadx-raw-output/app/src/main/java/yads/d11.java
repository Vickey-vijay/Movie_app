package yads;

import java.net.InetAddress;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;

/* JADX INFO: loaded from: classes11.dex */
public final class d11 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f76507b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f76508a = f76507b;

    public final boolean a(int i10, String str) {
        Object objM3458constructorimpl;
        ConcurrentHashMap concurrentHashMap = this.f76508a;
        Object objValueOf = concurrentHashMap.get(str);
        if (objValueOf == null) {
            try {
                Result.a aVar = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(Boolean.valueOf(InetAddress.getByName(str).isReachable(i10)));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
                objM3458constructorimpl = null;
            }
            Boolean bool = (Boolean) objM3458constructorimpl;
            objValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, objValueOf);
            if (objPutIfAbsent != null) {
                objValueOf = objPutIfAbsent;
            }
        }
        return ((Boolean) objValueOf).booleanValue();
    }
}
