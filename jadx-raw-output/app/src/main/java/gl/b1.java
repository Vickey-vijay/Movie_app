package gl;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.G5;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.LocalSaveUtil;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class b1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static b1 f53453g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f53454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f53457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f53458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f53459f;

    public static b1 a(Context context) {
        synchronized (b1.class) {
            if (f53453g == null) {
                f53453g = new b1(context);
            }
        }
        return f53453g;
    }

    public final void b(Context context, JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        AdLog.d(this.f53457d, "添加新的域名：" + jSONArray);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                String strOptString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(strOptString)) {
                    this.f53454a.add(strOptString);
                }
            } catch (Exception e10) {
                b.d.a(e10, new StringBuilder("addHost4Api error, msg = "), e10);
                return;
            }
        }
        HashSet hashSet = new HashSet(this.f53454a);
        this.f53454a.clear();
        this.f53454a.addAll(hashSet);
        LocalSaveUtil.put(context, this.f53458e, hashSet);
        AdLog.d("new list_host " + this.f53454a.toString());
    }

    public final void c(i1 i1Var) {
        try {
            if (this.f53455b >= this.f53454a.size()) {
                AdLog.e("game over!!!");
                i1Var.a();
                return;
            }
            Constant.commonApi = (String) this.f53454a.get(this.f53455b);
            Constant.setAddress();
            AdLog.d(this.f53457d, "findAndSetNextHost " + Constant.commonApi);
            this.f53455b = this.f53455b + 1;
            new Handler().postDelayed(new v1(this, i1Var), (long) this.f53456c);
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("findAndSetNextHost error, msg = "), e10);
        }
    }

    public b1(Context context) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f53454a = copyOnWriteArrayList;
        this.f53455b = 0;
        this.f53456c = 200;
        String simpleName = b1.class.getSimpleName();
        this.f53457d = simpleName;
        String str = "host_list_" + Constant.sdkVersion;
        this.f53458e = str;
        this.f53459f = "host_" + Constant.sdkVersion;
        Set<String> setStr = LocalSaveUtil.getSetStr(context, str);
        if (setStr.size() == 0) {
            AdLog.i(simpleName, "初始化备用域名");
            byte[] bytesFromAssets = CoreUtils.getBytesFromAssets(context, "okt_sdk_config");
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            if (bytesFromAssets != null) {
                try {
                    JSONArray jSONArrayOptJSONArray = new JSONObject(new String(bytesFromAssets, G5.N)).optJSONArray("host_list");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            copyOnWriteArrayList2.add(jSONArrayOptJSONArray.optString(i10));
                        }
                    }
                } catch (Exception e10) {
                    AdLog.e(e10.getMessage(), e10);
                }
            }
            copyOnWriteArrayList.addAll(copyOnWriteArrayList2);
            AdLog.w("list_host " + this.f53454a.toString());
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList(setStr);
        this.f53454a = copyOnWriteArrayList3;
        AdLog.d("local list_host" + copyOnWriteArrayList3);
    }
}
