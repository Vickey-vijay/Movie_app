package com.mbridge.msdk.foundation.same;

import android.text.TextUtils;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: SameTools.java */
/* JADX INFO: loaded from: classes9.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f34936a = new LinkedList();

    public static int a(CampaignEx campaignEx, String str) {
        if (campaignEx == null) {
            return -1;
        }
        try {
            return !TextUtils.isEmpty(campaignEx.getMof_template_url()) ? v0.b(campaignEx.getMof_template_url()) : v0.b(str);
        } catch (Exception e10) {
            q0.b("SameTools", e10.getMessage());
            return -1;
        }
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.equals(str2, com.mbridge.msdk.foundation.same.net.utils.d.h().f35030d) || TextUtils.equals(str2, com.mbridge.msdk.foundation.same.net.utils.d.h().O)) {
            return false;
        }
        return (TextUtils.equals(str, "download_video") || TextUtils.equals(str, "download_image") || TextUtils.equals(str, "download_template") || TextUtils.equals(str, "") || TextUtils.equals(str, "download_other") || TextUtils.equals(str, "download_html") || TextUtils.equals(str, "applets_model") || TextUtils.equals(str, MBInterstitialActivity.INTENT_CAMAPIGN) || TextUtils.equals(str, "bid_request") || TextUtils.equals(str, "more_offer") || TextUtils.equals(str, "mraid_js") || TextUtils.equals(str, "om_sdk") || TextUtils.equals(str, "roas") || TextUtils.equals(str, "web_env_check_js") || TextUtils.equals(str, "setting")) && s0.a().a("request_track", true);
    }

    public static String a(DownloadRequest<?> downloadRequest) {
        if (downloadRequest == null) {
            return "un_known";
        }
        String str = downloadRequest.get("download_scene", "");
        return TextUtils.isEmpty(str) ? "un_known" : str;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String[] strArrSplit = str.split(";");
            if (strArrSplit.length > 0) {
                return strArrSplit[0].trim();
            }
            return str.trim();
        } catch (Exception unused) {
            return "";
        }
    }

    public static void a(String str, File file) {
        Runtime runtime;
        if (file != null) {
            try {
                if (file.exists()) {
                    try {
                        List<String> list = f34936a;
                        if (list.contains(str)) {
                            try {
                                list.add(str);
                                System.gc();
                                Runtime.getRuntime().gc();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        o0.a(com.mbridge.msdk.omsdk.b.a(ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, o0.e(file))).getBytes(), file);
                        list.add(str);
                        System.gc();
                        runtime = Runtime.getRuntime();
                    } catch (Throwable th2) {
                        try {
                            q0.b("SameTools", th2.getMessage());
                            f34936a.add(str);
                            System.gc();
                            runtime = Runtime.getRuntime();
                        } catch (Throwable th3) {
                            try {
                                f34936a.add(str);
                                System.gc();
                                Runtime.getRuntime().gc();
                            } catch (Throwable unused2) {
                            }
                            throw th3;
                        }
                    }
                    runtime.gc();
                }
            } catch (Throwable unused3) {
            }
        }
    }

    public static void a(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    boolean zDelete = false;
                    try {
                        zDelete = file.delete();
                    } catch (Throwable unused) {
                    }
                    if (zDelete) {
                        return;
                    }
                    file.deleteOnExit();
                }
            } catch (Throwable unused2) {
            }
        }
    }
}
