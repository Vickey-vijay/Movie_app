package yads;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ug1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f83462a = new ConcurrentHashMap();

    public static final rg1 a(Context context) {
        return a(context, "YadPreferenceFile");
    }

    public static final rg1 a(Context context, String str) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = f83462a;
        Object tg1Var = concurrentHashMap.get(str);
        if (tg1Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (tg1Var = new tg1(context, str, new oy2())))) != null) {
            tg1Var = objPutIfAbsent;
        }
        return (rg1) tg1Var;
    }
}
