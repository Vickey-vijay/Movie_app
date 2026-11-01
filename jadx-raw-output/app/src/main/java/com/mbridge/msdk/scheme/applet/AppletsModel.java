package com.mbridge.msdk.scheme.applet;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.same.net.exception.a;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.scheme.report.AppletsReport;
import com.mbridge.msdk.scheme.request.AppletSchemeRequest;
import com.mbridge.msdk.scheme.response.AppletSchemeResponse;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class AppletsModel implements Serializable {
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_0 = "0";
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_1 = "1";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_EVENT_CALLBACK = "event_callback";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_INSTALL_CALLBACK = "install_callback";
    public static final int REQUEST_TYPE_CLICK = 1;
    public static final int REQUEST_TYPE_SHOW = 0;
    private static String TAG = "AppletsModel";
    private static final String URL_ENCODE_UTF_8 = "UTF-8";
    private static final String WX_MINIPROGRAM = "wx_miniprogram";
    private static final int WX_SCHEME_REQUEST_ERROR_CODE_44993 = 44993;
    private volatile IAppletSchemeCallBack appletSchemeCallBack;
    private final CampaignEx campaignEx;
    private String deepLink = "";
    private volatile boolean isRequestSuccess = false;
    private boolean isRequestTimesMaxPerDay = false;
    private volatile boolean isRequesting = false;
    private boolean isSupportWxScheme = false;
    private boolean isUserClick = false;
    private int lastRequestType = -1;
    private Map<String, String> params;
    private String reBuildClickUrl;
    private final String requestId;
    private final String unitID;

    private boolean isCanRequestByClickUrl(String str) {
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx == null) {
                return false;
            }
            String clickURL = campaignEx.getClickURL();
            if (TextUtils.isEmpty(clickURL)) {
                return false;
            }
            return TextUtils.equals(c1.a(clickURL, "wx_miniprogram"), str);
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            q0.b(TAG, "query wx_miniprogram from click url exception ", e10);
            return false;
        }
    }

    private boolean isCanRequestByTemplateUrl(String str) {
        CampaignEx.c rewardTemplateMode;
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx != null && (rewardTemplateMode = campaignEx.getRewardTemplateMode()) != null && !TextUtils.isEmpty(rewardTemplateMode.j())) {
                return TextUtils.equals(c1.a(rewardTemplateMode.j(), MBridgeConstans.DYNAMIC_VIEW_REQ_WX_URL), str);
            }
            return false;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            q0.b(TAG, "query reqwxurl from template url exception ", e10);
            return false;
        }
    }

    public void clearRequestState() {
        this.isRequestSuccess = false;
        this.isRequesting = false;
        this.appletSchemeCallBack = null;
    }

    public void setRequestingFinish() {
        this.isRequesting = false;
    }

    public static final class DefaultAppletSchemeResponse extends AppletSchemeResponse {
        private AppletsModel appletsModel;

        public DefaultAppletSchemeResponse(AppletsModel appletsModel) {
            this.appletsModel = appletsModel;
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
        public void onError(a aVar) {
            super.onError(aVar);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel != null) {
                appletsModel.changeRequestingState(false);
                this.appletsModel.handlerSchemeRequestNetworkError(aVar);
            }
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
        public void onSuccess(e<JSONObject> eVar) {
            super.onSuccess(eVar);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel != null) {
                appletsModel.changeRequestingState(false);
                if (eVar == null || eVar.f34990c == null) {
                    this.appletsModel.handlerRequestNetworkError();
                    return;
                }
                try {
                    this.appletsModel.handlerSchemeRequestResult(eVar);
                } catch (SchemeRequestException e10) {
                    this.appletsModel.handlerSchemeRequestFailed(-2, e10.getMessage());
                }
            }
        }
    }

    public static final class SchemeRequestException extends Exception {
        public SchemeRequestException(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeRequestingState(boolean z10) {
        this.isRequesting = z10;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[Catch: Exception -> 0x00c9, TRY_LEAVE, TryCatch #4 {Exception -> 0x00c9, blocks: (B:14:0x0045, B:16:0x0054, B:21:0x0064, B:23:0x006c, B:32:0x00a2, B:34:0x00b5, B:29:0x007f, B:31:0x0083, B:51:0x00e8, B:62:0x0101, B:73:0x011a, B:74:0x011d, B:82:0x0134, B:84:0x0144, B:85:0x015a, B:78:0x0129, B:80:0x012d, B:69:0x010f, B:71:0x0113, B:58:0x00f6, B:60:0x00fa, B:47:0x00dd, B:49:0x00e1, B:63:0x0104, B:25:0x0074, B:41:0x00d2, B:52:0x00eb), top: B:104:0x0045, inners: #0, #1, #2, #3, #6 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ad  */
    private Map<String, String> getAppletsParamsAndBuildRequest(CampaignEx campaignEx) {
        String str;
        String str2;
        String str3;
        String strEncode;
        String str4 = "is_redirect";
        String str5 = "query";
        HashMap map = new HashMap();
        if (campaignEx == null) {
            return map;
        }
        try {
            Uri uri = Uri.parse(campaignEx.getClickURL());
            if (uri != null && uri.getQueryParameterNames() != null) {
                StringBuilder sb2 = new StringBuilder();
                Iterator<String> it = uri.getQueryParameterNames().iterator();
                int i10 = 0;
                try {
                    try {
                        try {
                            while (true) {
                                String queryParameter = "";
                                if (!it.hasNext()) {
                                    break;
                                }
                                try {
                                    Iterator<String> it2 = it;
                                    String next = it.next();
                                    if (TextUtils.isEmpty(next) || TextUtils.equals(next, "wx_miniprogram")) {
                                        str4 = str4;
                                        str5 = str5;
                                    } else {
                                        try {
                                            queryParameter = uri.getQueryParameter(next);
                                        } catch (Exception unused) {
                                        }
                                        String strEncode2 = queryParameter;
                                        if (TextUtils.equals(next, DYNAMIC_VIEW_WX_QUERY_PARAM_EVENT_CALLBACK) || TextUtils.equals(next, DYNAMIC_VIEW_WX_QUERY_PARAM_INSTALL_CALLBACK)) {
                                            try {
                                                strEncode2 = URLEncoder.encode(strEncode2, "UTF-8");
                                            } catch (Exception e10) {
                                                if (MBridgeConstans.DEBUG) {
                                                    q0.b(TAG, "encode url for " + strEncode2 + " failed", e10);
                                                }
                                                sb2.append(next);
                                                sb2.append("=");
                                                sb2.append(strEncode2);
                                                if (i10 < uri.getQueryParameterNames().size()) {
                                                    sb2.append(C3426d4.j.f28584c);
                                                }
                                                i10++;
                                                it = it2;
                                                str4 = str4;
                                                str5 = str5;
                                            }
                                        }
                                        sb2.append(next);
                                        sb2.append("=");
                                        sb2.append(strEncode2);
                                        if (i10 < uri.getQueryParameterNames().size()) {
                                            sb2.append(C3426d4.j.f28584c);
                                        }
                                        i10++;
                                    }
                                    it = it2;
                                    str4 = str4;
                                    str5 = str5;
                                } catch (Exception e11) {
                                    e = e11;
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b(TAG, "create wechat app request param failed ", e);
                                    }
                                }
                                e = e11;
                                if (MBridgeConstans.DEBUG) {
                                    q0.b(TAG, "create wechat app request param failed ", e);
                                }
                                return map;
                            }
                            String queryParameter2 = uri.getQueryParameter("path");
                            str2 = queryParameter2 == null ? "" : queryParameter2;
                        } catch (Exception e12) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b(TAG, "create wechat app request param failed ", e12);
                            }
                        }
                        strEncode = URLEncoder.encode(sb2.toString(), "UTF-8");
                        if (strEncode == null) {
                            strEncode = "";
                        }
                    } catch (UnsupportedEncodingException e13) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b(TAG, "create wechat app request param failed ", e13);
                        }
                    }
                    String queryParameter3 = uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID);
                    str3 = queryParameter3 == null ? "" : queryParameter3;
                } catch (Exception e14) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b(TAG, "create wechat app request param failed ", e14);
                    }
                }
                String str6 = str4;
                String str7 = str5;
                try {
                    String queryParameter4 = uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                    str = queryParameter4 == null ? "" : queryParameter4;
                } catch (Exception e15) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b(TAG, "create wechat app request param failed ", e15);
                    }
                }
                map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, str);
                map.put("path", str2);
                map.put(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID, str3);
                map.put(str7, strEncode);
                map.put(str6, "0");
                if (MBridgeConstans.DEBUG) {
                    q0.a(TAG, "query: " + strEncode);
                }
                this.reBuildClickUrl = reCreateClickUrl(MBridgeConstans.DYNAMIC_VIEW_WX_APP + "=" + str + C3426d4.j.f28584c + "path=" + str2 + C3426d4.j.f28584c + str7 + "=" + strEncode + C3426d4.j.f28584c + MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID + "=" + str3 + C3426d4.j.f28584c + str6 + "=1");
                return map;
            }
            return map;
        } catch (Exception e16) {
            e = e16;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerRequestNetworkError() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, "handlerRequestNetworkError response or result is null");
        }
        try {
            this.appletSchemeCallBack.onNetworkError(1, "response or result is null", this.reBuildClickUrl);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler request network error exception ", e10);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "response or result is null", this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestFailed(int i10, String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, String.format("handlerSchemeRequestFailed network error by code %s and %s", String.valueOf(i10), str));
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestFailed(i10, str, this.reBuildClickUrl);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme failed exception  ", e10);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), String.format("network error by code %s and %s", String.valueOf(i10), str), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestNetworkError(a aVar) {
        String message;
        if (this.appletSchemeCallBack == null) {
            return;
        }
        int i10 = -1;
        if (aVar != null) {
            i10 = aVar.f34991a;
            message = aVar.getMessage();
            if (i10 == 10) {
                message = "request timeout";
            }
        } else {
            message = "unKnown";
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, String.format("handlerSchemeRequestNetworkError network error by code %s and %s", String.valueOf(i10), message));
        }
        try {
            this.appletSchemeCallBack.onNetworkError(i10, "network error: " + message, this.reBuildClickUrl);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme network error exception ", e10);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), String.format("network error by code %s and %s", String.valueOf(i10), message), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestResult(e<JSONObject> eVar) throws SchemeRequestException {
        JSONObject jSONObject = eVar.f34990c;
        if (MBridgeConstans.DEBUG) {
            q0.a("AppletsModel", "result: " + jSONObject.toString());
        }
        if (jSONObject.has("wx_scheme")) {
            String strOptString = jSONObject.optString("wx_scheme", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new SchemeRequestException("wx_scheme value is null");
            }
            this.isRequestSuccess = true;
            handlerSchemeRequestSuccess(strOptString);
            return;
        }
        int iOptInt = jSONObject.optInt("error_code", -1);
        String strOptString2 = jSONObject.optString("error_msg", "");
        if (iOptInt == WX_SCHEME_REQUEST_ERROR_CODE_44993) {
            this.isRequestTimesMaxPerDay = true;
        }
        handlerSchemeRequestFailed(iOptInt, strOptString2);
    }

    private void handlerSchemeRequestStart() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestStart();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme start exception ", e10);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "start load wx scheme", this.unitID, this.requestId);
    }

    private void handlerSchemeRequestSuccess(String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, "handlerSchemeRequestSuccess: " + str);
        }
        try {
            this.deepLink = str;
            this.appletSchemeCallBack.onAppletSchemeRequestSuccess(str);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme success exception ", e10);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "request wx scheme success", this.unitID, this.requestId);
    }

    private boolean isCanRequestByLinkType() {
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx == null) {
            return false;
        }
        int linkType = campaignEx.getLinkType();
        return linkType == 8 || linkType == 9;
    }

    private String reCreateClickUrl(String str) {
        return d.h().f35026b + "?" + str;
    }

    public String getDeepLink() {
        return this.deepLink;
    }

    public String getReBuildClickUrl() {
        return this.reBuildClickUrl;
    }

    public boolean isRequestSuccess() {
        return this.isRequestSuccess;
    }

    public boolean isRequestTimesMaxPerDay() {
        return this.isRequestTimesMaxPerDay;
    }

    public boolean isRequesting() {
        return this.isRequesting;
    }

    public boolean isSupportWxScheme() {
        if (!this.isSupportWxScheme) {
            this.isSupportWxScheme = isCanRequestByClickUrl("1") && isCanRequestByLinkType();
        }
        return this.isSupportWxScheme;
    }

    public void requestWxAppletsScheme(int i10, IAppletSchemeCallBack iAppletSchemeCallBack) {
        if (this.campaignEx == null || TextUtils.isEmpty(this.unitID)) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.b(TAG, "start request wx scheme");
        }
        this.isRequesting = true;
        if (iAppletSchemeCallBack != null) {
            this.appletSchemeCallBack = iAppletSchemeCallBack;
        }
        handlerSchemeRequestStart();
        AppletSchemeRequest appletSchemeRequest = new AppletSchemeRequest(c.n().d());
        if (this.params == null) {
            this.params = getAppletsParamsAndBuildRequest(this.campaignEx);
        }
        if (this.params == null) {
            return;
        }
        if (isRequestTimesMaxPerDay()) {
            handlerSchemeRequestFailed(WX_SCHEME_REQUEST_ERROR_CODE_44993, "get wxscheme failed : request times is max");
        } else {
            this.lastRequestType = i10;
            appletSchemeRequest.get(1, d.h().f35026b, this.params, new DefaultAppletSchemeResponse(this), "applets_model", 60000L);
        }
    }

    public void setAppletSchemeCallBack(IAppletSchemeCallBack iAppletSchemeCallBack) {
        this.appletSchemeCallBack = iAppletSchemeCallBack;
    }

    public void setUserClick(boolean z10) {
        this.isUserClick = z10;
    }

    public AppletsModel(CampaignEx campaignEx, String str, String str2) {
        this.campaignEx = campaignEx;
        this.unitID = str;
        this.requestId = str2;
    }

    public boolean can(int i10) {
        if (isRequesting() || !canRequestWxScheme(i10)) {
            return false;
        }
        if (this.lastRequestType == -1) {
            return true;
        }
        if (isRequestSuccess()) {
            return false;
        }
        int i11 = this.lastRequestType;
        if ((i11 != 0 || i10 != 1) && (i11 != 1 || i10 != 1 || !this.isUserClick)) {
            return false;
        }
        return true;
    }

    public boolean canRequestWxScheme(int i10) {
        if (!isSupportWxScheme()) {
            return false;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        return isCanRequestByTemplateUrl("2");
    }
}
