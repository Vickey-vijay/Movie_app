package com.yk.e.util;

import android.app.Activity;
import android.app.FragmentManager;
import com.ironsource.C3426d4;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.yk.e.object.LifeListener;
import com.yk.e.object.LifeListenerFragment;
import com.yk.e.object.SendLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class Constant {
    public static String ActionDownLoad = "downLoad";
    public static final int HORIZONTAL = 0;
    public static String ReqBannerAdPath = "";
    public static String ReqCollectCacheLog = "";
    public static String ReqCollectLog = "";
    public static String ReqFloatViewAdPath = "";
    public static String ReqInFeedAdPath = "";
    public static String ReqInitPath = "";
    public static String ReqInternalAdPath = "";
    public static String ReqInterstitialAdPath = "";
    public static String ReqMRECPath = "";
    public static String ReqNaturalAdPath = "";
    public static String ReqPauseIntersAdPath = "";
    public static String ReqRewardAdPath = "";
    public static String ReqSplashAdPath = "";
    public static String ReqThirdBannerPath = "";
    public static String ReqTimer = "";
    public static String RetSigmobRewardUrl = "";
    public static String StatAdPath = "";
    public static String UploadAdCostTimePath = "";
    public static final int VERTICAL = 1;
    public static boolean debugFlag = false;
    public static final String platform = "wx";
    public static String sdkVersion = "";
    public static String userAgent = "";
    public static HashMap<String, FileLoader> downLoadMap = new HashMap<>();
    public static HashMap<String, SendLoader> appDetailAdMap = new HashMap<>();
    public static HashMap<String, SendLoader> rewardVideoAdMap = new HashMap<>();
    public static HashMap<String, SendLoader> interstitialVideoAdMap = new HashMap<>();
    public static HashMap<String, Boolean> clickUrlHashMap = new HashMap<>();
    public static List<Map<String, String>> historyMidList = new ArrayList();
    public static HashMap<String, List<String>> adShowCountMap = new HashMap<>();
    public static HashMap<String, List<String>> adAreaNumMap = new HashMap<>();
    public static String fileLoaderPath = NativeAdPresenter.DOWNLOAD;
    public static String providerName = "MainProvider";
    public static String fileAdShowCount = "main_ad_show_count";
    public static String fileAdAreaTypeCount = "main_ad_area_count";
    public static String fileApiCache = "main_ad_ac_%s_shared_pref";
    public static String filePresetCache = "main_ad_ps_shared_pref";
    public static String fileAdCacheID = "main_ad_cache_id";
    public static String fileBdConfig = "bd_config.txt";
    public static String SP_TAG_CACHE_LIST = "KEY_CACHE_IMG_ID";
    public static String SP_TAG_CACHE_IDS = "cache_ids";
    public static String PATH_LOG = "okt_logs";
    public static String PATH_BD_CONFIG = "okt_config";
    public static String PATH_CACHE_MEDIA = C3426d4.i.I0;
    public static long MAX_MEDIA_CACHE_BYTE = ServiceProvider.HTTP_CACHE_DISK_SIZE;
    public static String AesKey = "QwEr12TyUi!@Op34AsDf#$GhJk56L%^Z";
    public static String AesIv = "xCvB78Nm&*9(0)Mn";
    public static String privacyPolicyUri = "https://www.oktdata.com/oktdata_privacy.html";
    public static String TAG = "OKT_SDK";
    public static String commonApi = "";
    public static String apiVersion = "";

    static {
        setAddress();
    }

    public static void addFragmentListener(Activity activity, LifeListener lifeListener) {
        try {
            FragmentManager fragmentManager = activity.getFragmentManager();
            LifeListenerFragment lifeListenerFragment = (LifeListenerFragment) fragmentManager.findFragmentByTag("LifeListenerFragment");
            if (lifeListenerFragment == null) {
                lifeListenerFragment = new LifeListenerFragment();
                if (activity.isFinishing()) {
                    AdLog.e("addFragmentListener, Activity has been destroyed");
                    return;
                }
                fragmentManager.beginTransaction().add(lifeListenerFragment, "LifeListenerFragment").commitAllowingStateLoss();
            }
            lifeListenerFragment.addLifeListener(lifeListener);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public static boolean fileLoadRunning(String str) {
        return downLoadMap.containsKey(str);
    }

    public static FileLoader getFileLoader(String str) {
        return downLoadMap.containsKey(str) ? downLoadMap.get(str) : new FileLoader(str);
    }

    public static void removeFileLoader(String str) {
        downLoadMap.remove(str);
    }

    public static void setAddress() {
        ReqInitPath = commonApi + "/" + apiVersion + "/ReqInit";
        ReqSplashAdPath = commonApi + "/" + apiVersion + "/ReqSplashAd";
        ReqRewardAdPath = commonApi + "/" + apiVersion + "/ReqRewardAd";
        ReqNaturalAdPath = commonApi + "/" + apiVersion + "/ReqNaturalAd";
        StatAdPath = commonApi + "/" + apiVersion + "/StatAd";
        ReqInterstitialAdPath = commonApi + "/" + apiVersion + "/ReqInterstitialAd";
        ReqBannerAdPath = commonApi + "/" + apiVersion + "/ReqBannerAd";
        UploadAdCostTimePath = commonApi + "/" + apiVersion + "/UploadAdCostTime";
        ReqInternalAdPath = commonApi + "/" + apiVersion + "/ReqInternalAd";
        RetSigmobRewardUrl = commonApi + "/" + apiVersion + "/RetSigmobReward";
        ReqFloatViewAdPath = commonApi + "/" + apiVersion + "/ReqSmallFloatAd";
        ReqPauseIntersAdPath = commonApi + "/" + apiVersion + "/ReqPauseInterstitialAd";
        ReqInFeedAdPath = commonApi + "/" + apiVersion + "/ReqInFeedAd";
        ReqTimer = commonApi + "/" + apiVersion + "/ReqTimer";
        ReqCollectLog = commonApi + "/" + apiVersion + "/CollectLog";
        ReqCollectCacheLog = commonApi + "/" + apiVersion + "/CollectCacheLog";
        ReqThirdBannerPath = commonApi + "/" + apiVersion + "/ReqThirdBanner";
        ReqMRECPath = commonApi + "/" + apiVersion + "/ReqMrec";
    }
}
