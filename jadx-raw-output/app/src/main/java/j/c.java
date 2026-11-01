package j;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.yk.e.object.MainParams;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.LogUtil;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f61453b;

    public c(y1 y1Var) {
        this.f61453b = y1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        JSONObject jSONObject = (JSONObject) message.obj;
        y1 y1Var = this.f61453b;
        y1Var.ILL = false;
        y1Var.f3378Ll1 = false;
        y1Var.f3379L11I = false;
        y1Var.f3382lIiI = false;
        y1Var.f3387il = false;
        y1Var.f3376IiL = false;
        y1Var.f3374ILl = false;
        y1Var.f61671Lil = false;
        y1Var.LlLI1 = false;
        y1Var.f3385llL1ii = false;
        y1Var.f3384lIlii = false;
        y1Var.iIi1 = false;
        y1Var.iIlLiL = false;
        try {
            y1Var.platform = jSONObject.optString("platform");
            y1Var.f33911 = jSONObject.optString(VastAttributes.AD_ID);
            y1Var.f3380LlLLL = jSONObject.optString("sourceID");
            String strOptString = jSONObject.optString("offline_adv");
            if (Constant.platform.equals(y1Var.platform) || !TextUtils.isEmpty(strOptString)) {
                MainParams mainParams = y1Var.f3389l;
                mainParams.platform = y1Var.platform;
                mainParams.adID = y1Var.f33911;
                mainParams.sourceID = y1Var.f3380LlLLL;
                mainParams.logoUrl = jSONObject.optString("logoUrl");
                y1Var.f3389l.title = jSONObject.optString("title");
                y1Var.f3389l.name = jSONObject.optString("name");
                y1Var.f3389l.summary = jSONObject.optString("summary");
                y1Var.f3389l.type = jSONObject.optInt("type");
                y1Var.f3389l.clickUrl = jSONObject.optString("clickUrl");
                y1Var.f3389l.webUrl = jSONObject.optString("webUrl");
                y1Var.f3389l.packageName = jSONObject.optString("package");
                y1Var.f3389l.imgUrl = jSONObject.optString("imgUrl");
                y1Var.f3389l.videoUrl = jSONObject.optString(UnifiedMediationParams.KEY_VIDEO_URL);
                y1Var.f3389l.countDownTime = jSONObject.optInt("countDownTime");
                y1Var.f3389l.skipTime = jSONObject.optInt("skipTime");
                y1Var.f3389l.adAreaType = jSONObject.optInt("adAreaType");
                y1Var.f3389l.materialId = jSONObject.optString("materialId");
                y1Var.f3389l.videoWidth = jSONObject.optInt("videoWidth");
                y1Var.f3389l.videoHeight = jSONObject.optInt("videoHeight");
                y1Var.f3389l.adTitle = jSONObject.optString("adTitle");
                y1Var.f3389l.adDes = jSONObject.optString("adDes");
                y1Var.f3389l.adContent = jSONObject.optString("adContent");
                MainParams mainParams2 = y1Var.f3389l;
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("adTags");
                ArrayList arrayList = new ArrayList();
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        String strOptString2 = jSONArrayOptJSONArray.optString(i10);
                        if (!TextUtils.isEmpty(strOptString2)) {
                            arrayList.add(strOptString2);
                        }
                    }
                }
                mainParams2.adTags = arrayList;
                y1Var.f3389l.forceClick = jSONObject.optInt("forceClick");
                y1Var.f3389l.fcDelayTime = jSONObject.optInt("fcDelayTime");
                y1Var.f3389l.m3u8Url = jSONObject.optString("m3u8Url");
                y1Var.f3389l.playable = jSONObject.optString("playable");
                y1Var.f3389l.playableUrl = jSONObject.optString("playable_url");
                y1Var.f3389l.webPrice = jSONObject.optString("webPrice", "0");
                y1.IL1Iii(y1Var.adPlcID, y1Var.f3389l.materialId);
                Activity activity = y1Var.IL1Iii;
                String str = y1Var.curAdType;
                String str2 = y1Var.f33911;
                AdLog.i("addAdShowCountData");
                String str3 = Constant.fileAdShowCount;
                HashMap<String, List<String>> map = Constant.adShowCountMap;
                gl.g.b(activity, str.toLowerCase(Locale.getDefault()), str2, str3, map);
                AdLog.d("Constant.adShowCountMap " + map.toString());
            } else {
                i.e eVar = new i.e();
                y1Var.thirdParams = eVar;
                eVar.f54036a = jSONObject.optString("thirdAppID");
                y1Var.thirdParams.f54037b = jSONObject.optString("thirdAppKey");
                y1Var.thirdParams.f54038c = jSONObject.optString("thirdPosID");
                y1Var.thirdParams.f54039d = jSONObject.optInt("gWidth", 0);
                y1Var.thirdParams.f54040e = jSONObject.optInt("gHeight", 0);
                y1Var.thirdParams.f54041f = jSONObject.optString("thirdUnitID", "");
                y1Var.thirdParams.f54042g = jSONObject.optString("webPrice", "0");
                y1Var.thirdParams.f54043h = jSONObject.optString("autoFlush", "0");
            }
        } catch (Exception e10) {
            LogUtil.printException(e10);
        }
        this.f61453b.IL1Iii(jSONObject);
        return false;
    }
}
