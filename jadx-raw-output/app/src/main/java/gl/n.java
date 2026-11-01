package gl;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.Q6;
import com.yk.e.util.Constant;
import com.yk.e.util.LocalSaveUtil;
import com.yk.e.util.ScreenUtil;
import com.yk.e.util.UsLocalSaveHelper;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f53540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.f f53541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f53542c = new Handler(Looper.getMainLooper(), new f0(this));

    public static void a(n nVar, Context context) {
        nVar.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("phoneSDKVersion", Build.VERSION.SDK_INT);
            jSONObject.put("isSimulator", u1.a(context));
            jSONObject.put("sdkVersion", Constant.sdkVersion);
            String string = LocalSaveUtil.getString(context, "DeviceUUID", "");
            if (TextUtils.isEmpty(string)) {
                string = u1.b();
                LocalSaveUtil.put(context, "DeviceUUID", string);
            }
            jSONObject.put("androidId", string);
            jSONObject.put("system", 1);
            jSONObject.put("phoneModel", Build.MODEL);
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("sw", ScreenUtil.getScreenWidth(context));
            jSONObject.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, ScreenUtil.getScreenHeight(context));
            jSONObject.put("systemVersion", Build.VERSION.RELEASE);
            jSONObject.put("deviceType", ScreenUtil.getDeviceType(context));
            String strE = u1.e();
            Constant.userAgent = strE;
            jSONObject.put(Q6.f27422d0, strE);
            jSONObject.put(CommonUrlParts.MANUFACTURER, Build.MANUFACTURER);
            String strC = u1.c(context);
            jSONObject.put("netType", strC);
            jSONObject.put(Q6.Q0, u1.f(context));
            jSONObject.put("orientation", ScreenUtil.getOrientation(context));
            UsLocalSaveHelper.getInstance().setNetType(strC);
            JSONObject jSONObjectJ = a1.a().j();
            jSONObjectJ.put("phoneInfo", jSONObject);
            Message messageObtainMessage = nVar.f53542c.obtainMessage();
            messageObtainMessage.obj = jSONObjectJ;
            messageObtainMessage.sendToTarget();
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("getPhoneInfo err, msg = "), e10);
        }
    }

    public n(Context context, i.f fVar) {
        this.f53540a = context;
        this.f53541b = fVar;
    }
}
