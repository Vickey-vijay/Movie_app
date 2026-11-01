package yads;

import android.content.pm.ActivityInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f83723a = com.safedk.android.utils.g.f44979y + ".common.AdActivity has missed configuration attribute %s.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f83724b = kotlin.collections.a.m(mj.h.a(16, "ActivityInfo.CONFIG_KEYBOARD"), mj.h.a(32, "ActivityInfo.CONFIG_KEYBOARD_HIDDEN"), mj.h.a(128, "ActivityInfo.CONFIG_ORIENTATION"), mj.h.a(256, "ActivityInfo.CONFIG_SCREEN_LAYOUT"), mj.h.a(512, "ActivityInfo.CONFIG_UI_MODE"), mj.h.a(1024, "ActivityInfo.CONFIG_SCREEN_SIZE"), mj.h.a(2048, "CONFIG_SMALLEST_SCREEN_SIZE"));

    public static void a(ActivityInfo activityInfo) {
        Object obj;
        Map map = f83724b;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            String str = (String) entry.getValue();
            if ((iIntValue & activityInfo.configChanges) == 0) {
                obj = str;
            }
            arrayList.add(obj);
        }
        for (Object obj2 : arrayList) {
            if (((String) obj2) != null) {
                obj = obj2;
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return;
        }
        String str3 = String.format(f83723a, Arrays.copyOf(new Object[]{str2}, 1));
        ck.p.i(str3, "format(...)");
        throw new ub1(str3, str3);
    }
}
