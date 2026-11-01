package sl;

import android.app.Activity;
import java.util.Stack;

/* JADX INFO: compiled from: AppManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Stack<Activity> f71996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f71997b;

    public static a b() {
        if (f71997b == null) {
            f71997b = new a();
        }
        return f71997b;
    }

    public void a(Activity activity) {
        if (f71996a == null) {
            f71996a = new Stack<>();
        }
        f71996a.add(activity);
    }

    public void c(Activity activity) {
        if (activity != null) {
            f71996a.remove(activity);
        }
    }

    public Activity getActivity(Class<?> cls) {
        Stack<Activity> stack = f71996a;
        if (stack == null) {
            return null;
        }
        for (Activity activity : stack) {
            if (activity.getClass().equals(cls)) {
                return activity;
            }
        }
        return null;
    }
}
