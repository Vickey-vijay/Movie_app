package gl;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.yk.e.util.AdLog;
import com.yk.e.util.LocalSaveUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class g {
    public static void c(Context context, String str, HashMap map) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
            editorEdit.clear();
            editorEdit.apply();
            map.clear();
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public static JSONArray a(Context context, String str, String str2, HashMap map) {
        JSONArray jSONArray = new JSONArray();
        try {
            if (d(context)) {
                c(context, str2, map);
                return jSONArray;
            }
            List<String> list = (List) map.get(str);
            if (list != null) {
                HashMap map2 = new HashMap();
                for (String str3 : list) {
                    if (map2.containsKey(str3)) {
                        map2.put(str3, Integer.valueOf(((Integer) map2.get(str3)).intValue() + 1));
                    } else {
                        map2.put(str3, 1);
                    }
                }
                for (Map.Entry entry : map2.entrySet()) {
                    String str4 = (String) entry.getKey();
                    int iIntValue = ((Integer) entry.getValue()).intValue();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("adid", str4);
                    jSONObject.put("count", iIntValue);
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray;
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("getHistoryMid error, msg = "), e10);
        }
    }

    public static void e(Context context, String str, HashMap map) {
        Map<String, ?> all;
        try {
            if (d(context)) {
                c(context, str, map);
                return;
            }
            map.clear();
            try {
                all = context.getSharedPreferences(str, 0).getAll();
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
                all = null;
            }
            HashMap map2 = (HashMap) all;
            if (map2 == null) {
                return;
            }
            for (Map.Entry entry : map2.entrySet()) {
                String str2 = ((String) entry.getKey()).split("_")[0];
                String str3 = ((String) entry.getKey()).split("_")[1];
                int iIntValue = ((Integer) entry.getValue()).intValue();
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < iIntValue; i10++) {
                    arrayList.add(str3);
                }
                if (!map.containsKey(str2) || map.get(str2) == null) {
                    map.put(str2, arrayList);
                } else {
                    ((List) map.get(str2)).addAll(arrayList);
                }
            }
        } catch (Exception e11) {
            b.d.a(e11, new StringBuilder("initAdShowCountData error, "), e11);
        }
    }

    public static void b(Activity activity, String str, String str2, String str3, HashMap map) {
        int i10;
        try {
            if (d(activity)) {
                c(activity, str3, map);
            }
            List list = (List) map.get(str);
            if (list != null) {
                list.add(str2);
                Iterator it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((String) it.next()).equals(str2)) {
                        i10++;
                    }
                }
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str2);
                map.put(str, arrayList);
                i10 = 1;
            }
            String str4 = str + "_" + str2;
            try {
                SharedPreferences.Editor editorEdit = activity.getSharedPreferences(str3, 0).edit();
                editorEdit.putInt(str4, i10);
                editorEdit.apply();
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
            }
        } catch (Exception e11) {
            b.d.a(e11, new StringBuilder("addAdShowCountData error, msg = "), e11);
        }
    }

    public static boolean d(Context context) {
        int i10 = Calendar.getInstance().get(6);
        int i11 = LocalSaveUtil.getInt(context, "LastSavedDay", -1);
        AdLog.d("savedDay " + i11);
        if (i11 != -1 && i10 <= i11) {
            return false;
        }
        LocalSaveUtil.put(context, "LastSavedDay", Integer.valueOf(i10));
        AdLog.d("currentDay " + i10);
        return true;
    }
}
