package y2;

import android.view.ViewGroup;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import org.json.JSONObject;

/* JADX INFO: compiled from: MintegralFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface j {
    void a();

    void b(String str, String str2);

    void c(MBSplashLoadWithCodeListener mBSplashLoadWithCodeListener);

    void d(ViewGroup viewGroup, String str);

    void e(String str);

    void f(MBSplashShowListener mBSplashShowListener);

    void g(ViewGroup viewGroup);

    void onDestroy();

    void setExtraInfo(JSONObject jSONObject);
}
