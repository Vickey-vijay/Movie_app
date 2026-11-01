package j;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.yk.e.callBack.MainAdCallBack;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.object.MainParams;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.StringUtil;
import com.yk.e.util.UsLocalSaveHelper;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y1 {
    public long I11L;
    public JSONArray I1I;
    public Activity IL1Iii;

    /* JADX INFO: renamed from: I丨L, reason: contains not printable characters */
    public int f3375IL;
    public String adPlcID;
    public long llliI;
    public int ILil = 0;
    public long Ilil = 0;

    /* JADX INFO: renamed from: l丨Li1LL, reason: contains not printable characters */
    public long f3386lLi1LL = 0;
    public String curAdType = "";

    /* JADX INFO: renamed from: iI丨LLL1, reason: contains not printable characters */
    public String f3381iILLL1 = "";

    /* JADX INFO: renamed from: I丨iL, reason: contains not printable characters */
    public boolean f3376IiL = false;

    /* JADX INFO: renamed from: L丨1丨1丨I, reason: contains not printable characters */
    public boolean f3379L11I = false;

    /* JADX INFO: renamed from: 丨il, reason: contains not printable characters */
    public boolean f3387il = false;
    public boolean ILL = false;

    /* JADX INFO: renamed from: Ll丨1, reason: contains not printable characters */
    public boolean f3378Ll1 = false;

    /* JADX INFO: renamed from: lIi丨I, reason: contains not printable characters */
    public boolean f3382lIiI = false;

    /* JADX INFO: renamed from: IL丨丨l, reason: contains not printable characters */
    public boolean f3374ILl = false;

    /* JADX INFO: renamed from: Lil, reason: collision with root package name */
    public boolean f61671Lil = false;
    public boolean LlLI1 = false;

    /* JADX INFO: renamed from: ll丨L1ii, reason: contains not printable characters */
    public boolean f3385llL1ii = false;

    /* JADX INFO: renamed from: lI丨lii, reason: contains not printable characters */
    public boolean f3384lIlii = false;
    public boolean iIi1 = false;
    public boolean iIlLiL = false;
    public int I11li1 = 1;

    /* JADX INFO: renamed from: 丨lL, reason: contains not printable characters */
    public int f3388lL = 0;

    /* JADX INFO: renamed from: 丨l丨, reason: contains not printable characters */
    public final MainParams f3389l = new MainParams();
    public i.e thirdParams = null;
    public String platform = "";

    /* JADX INFO: renamed from: 丨丨丨1丨, reason: contains not printable characters */
    public String f33911 = "";

    /* JADX INFO: renamed from: L丨lLLL, reason: contains not printable characters */
    public String f3380LlLLL = "";

    /* JADX INFO: renamed from: lI丨II, reason: contains not printable characters */
    public double f3383lIII = 0.0d;
    public boolean LL1IL = false;

    /* JADX INFO: renamed from: L11丨丨丨1, reason: contains not printable characters */
    public int f3377L111 = 0;

    /* JADX INFO: renamed from: 丨丨LLlI1, reason: contains not printable characters */
    public final Handler f3390LLlI1 = new Handler(Looper.getMainLooper(), new c(this));

    public final void IL1Iii(int i10, String str, MainAdCallBack mainAdCallBack) {
        try {
            String strValueOf = String.valueOf(IL1Iii(i10, str));
            String strValueOf2 = String.valueOf(this.LL1IL ? AdSdkStateCode.REFRESH_ERR_4_API : 0);
            collectErrMsg(this.IL1Iii, i10 + ", " + str, strValueOf, strValueOf2);
            int length = this.I1I.length();
            this.f3388lL = this.f3388lL + 1;
            AdLog.subAd("失败个数：" + this.f3388lL);
            int i11 = this.ILil;
            if (i11 < length - 1) {
                int i12 = i11 + 1;
                this.ILil = i12;
                JSONArray jSONArray = this.I1I;
                Message messageObtainMessage = this.f3390LLlI1.obtainMessage();
                messageObtainMessage.obj = jSONArray.opt(i12);
                messageObtainMessage.sendToTarget();
                return;
            }
            if (this.f3382lIiI || this.f3388lL != length) {
                return;
            }
            this.f3382lIiI = true;
            this.iIlLiL = false;
            if (mainAdCallBack != null) {
                mainAdCallBack.onAdFail(i10, str);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public abstract void IL1Iii(JSONObject jSONObject);

    public int getApiAdType() {
        return 0;
    }

    public String getSubPlatform() {
        return "";
    }

    public abstract boolean isExpired();

    public boolean isSupportAdCache() {
        return false;
    }

    public void onAdBidLose() {
    }

    public void onAdBidWin() {
    }

    public void setNativeViewWH(int i10, int i11) {
    }

    public void collectErrMsg(Context context, String str, String str2, String str3) {
        String str4 = this.adPlcID;
        String str5 = this.platform;
        if (UsLocalSaveHelper.getInstance().isWriteLog()) {
            gl.a1.a().f(context, str4, str5, str, str2, str3, new gl.o0(str4, str5));
            return;
        }
        AdLog.d("do not report err log, adPlcID = " + str4);
    }

    public int getLoadTimeOut() {
        return this.f3377L111;
    }

    public double getRevenue() {
        return this.f3383lIII;
    }

    public i.e getThirdParams() {
        return this.thirdParams;
    }

    public void loadAd() {
        if (this.iIlLiL) {
            return;
        }
        this.iIlLiL = true;
        AdLog.subAd(this.curAdType + " 连接sdk获取数据");
        this.Ilil = new Date().getTime();
        this.f3381iILLL1 = StringUtil.getUUID();
        this.ILL = false;
        this.f3378Ll1 = false;
        this.f3379L11I = false;
        this.f3382lIiI = false;
        this.f3387il = false;
        this.f3376IiL = false;
        this.f3374ILl = false;
        this.f61671Lil = false;
        this.LlLI1 = false;
        this.f3385llL1ii = false;
        this.f3384lIlii = false;
        this.iIi1 = false;
        this.iIlLiL = false;
    }

    public void setLoadTimeOut(int i10) {
        this.f3377L111 = i10;
    }

    public void setRefreshAdCache(boolean z10) {
        this.LL1IL = z10;
    }

    public void setRevenue(double d10) {
        this.f3383lIII = d10;
    }

    public void startLoadData(Object... objArr) {
        long time = new Date().getTime();
        this.f3386lLi1LL = time;
        this.I11L = time - this.Ilil;
        AdLog.subAd(this.curAdType + " 连接服务器耗时 = " + this.I11L + "ms");
        this.I11li1 = ((Integer) objArr[0]).intValue();
        JSONArray jSONArray = (JSONArray) objArr[1];
        this.I1I = jSONArray;
        if (jSONArray.length() > 0) {
            if (this.f3375IL == 1) {
                this.I11li1 = 1;
            }
            for (int i10 = 0; i10 < this.I11li1 && i10 < this.I1I.length(); i10++) {
                this.ILil = i10;
                JSONArray jSONArray2 = this.I1I;
                Message messageObtainMessage = this.f3390LLlI1.obtainMessage();
                messageObtainMessage.obj = jSONArray2.opt(i10);
                messageObtainMessage.sendToTarget();
            }
        }
    }

    public static int IL1Iii(int i10, String str) {
        int iIndexOf;
        int iIndexOf2;
        try {
            if (i10 == AdSdkStateCode.MAIN_RENDER_FAILED && i10 == AdSdkStateCode.THIRD_RENDER_FAILED && (iIndexOf = str.indexOf("msg:")) != -1 && (iIndexOf2 = str.indexOf(StringUtils.COMMA, iIndexOf + 4)) != -1) {
                String str2 = str.substring(iIndexOf2 + 1).trim().split(", ")[0];
                if (!TextUtils.isEmpty(str2)) {
                    return Integer.parseInt(str2);
                }
            }
        } catch (NumberFormatException unused) {
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        return 0;
    }

    public final void IL1Iii() {
        this.llliI = System.currentTimeMillis() - this.f3386lLi1LL;
        AdLog.subAd(this.curAdType + " 加载广告耗时 = " + this.llliI + "ms");
    }

    public static void IL1Iii(String str, String str2) {
        AdLog.d("addHistoryID adPlcID = " + str + ", materialId = " + str2);
        if (TextUtils.isEmpty(str2) || "0".equals(str2)) {
            return;
        }
        HashMap map = new HashMap();
        map.put(str, str2);
        Constant.historyMidList.add(map);
        AdLog.d("historyMidHashMap " + Constant.historyMidList.toString());
    }
}
