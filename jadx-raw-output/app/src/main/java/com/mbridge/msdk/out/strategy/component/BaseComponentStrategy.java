package com.mbridge.msdk.out.strategy.component;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseComponentStrategy {
    public static final long DEFAULT_TIMEOUT_MS = 3000;
    public static final Handler MAIN_HANDLER = new Handler(Looper.getMainLooper());
    public static final String TAG = "BaseComponentStrategy";
    public int adType;
    public String bidToken;
    public String extraData;
    public com.mbridge.msdk.config.manager.callback.b mComponentCallbackListener;
    public NewInterstitialListener newInterstitialListener;
    public String placementId;
    public com.mbridge.msdk.video.bt.module.orglistener.g rewardVideoListener;
    public String unitId;
    public String userId;
    public boolean isReady = true;
    public boolean isRewardPlusOpen = false;
    public int isSilent = 0;
    public Map<String, Object> developerSettingMap = new HashMap();
    public volatile boolean isQuerying = false;
    public volatile Looper triggerThreadLooper = null;

    /* JADX INFO: renamed from: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1, reason: invalid class name */
    public class AnonymousClass1 implements com.mbridge.msdk.config.manager.callback.b {
        public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        }

        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdClose$1(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onAdClose(mBridgeIds, rewardInfo);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdShow$0(MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onAdShow(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onEndCardShow$5(MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onEndcardShow(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadSuccess$8(MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onLoadSuccess(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onShowFail$2(MBridgeIds mBridgeIds, String str) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onShowFail(mBridgeIds, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoAdClicked$3(MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoAdClicked(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoComplete$4(MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoComplete(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoLoadFail$6(MBridgeIds mBridgeIds, String str) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoLoadFail(mBridgeIds, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoLoadSuccess$7(MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoLoadSuccess(mBridgeIds);
            }
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdClose(final MBridgeIds mBridgeIds, final RewardInfo rewardInfo) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36316b.lambda$onAdClose$1(mBridgeIds, rewardInfo);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36319b.lambda$onAdShow$0(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onEndCardShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36330b.lambda$onEndCardShow$5(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36332b.lambda$onLoadSuccess$8(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onShowFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36321b.lambda$onShowFail$2(mBridgeIds, str);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoAdClicked(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36324b.lambda$onVideoAdClicked$3(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoComplete(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36326b.lambda$onVideoComplete$4(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36334b.lambda$onVideoLoadFail$6(mBridgeIds, str);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36328b.lambda$onVideoLoadSuccess$7(mBridgeIds);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2, reason: invalid class name */
    public class AnonymousClass2 implements com.mbridge.msdk.config.manager.callback.b {
        public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        }

        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdClose$1(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdClose(mBridgeIds, rewardInfo);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdShow$0(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdShow(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onEndCardShow$5(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onEndcardShow(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadSuccess$8(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onLoadCampaignSuccess(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onShowFail$2(MBridgeIds mBridgeIds, String str) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onShowFail(mBridgeIds, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoAdClicked$3(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdClicked(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoComplete$4(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onVideoComplete(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoLoadFail$6(MBridgeIds mBridgeIds, String str) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onResourceLoadFail(mBridgeIds, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoLoadSuccess$7(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onResourceLoadSuccess(mBridgeIds);
            }
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdClose(final MBridgeIds mBridgeIds, final RewardInfo rewardInfo) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36351b.lambda$onAdClose$1(mBridgeIds, rewardInfo);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36354b.lambda$onAdShow$0(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onEndCardShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36345b.lambda$onEndCardShow$5(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36340b.lambda$onLoadSuccess$8(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onShowFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36337b.lambda$onShowFail$2(mBridgeIds, str);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoAdClicked(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36347b.lambda$onVideoAdClicked$3(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoComplete(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36356b.lambda$onVideoComplete$4(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36342b.lambda$onVideoLoadFail$6(mBridgeIds, str);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36349b.lambda$onVideoLoadSuccess$7(mBridgeIds);
                }
            });
        }
    }

    public synchronized boolean isReadyWithSyncWait(boolean z10) {
        if (this.isQuerying) {
            return false;
        }
        try {
            this.isQuerying = true;
            com.mbridge.msdk.config.component.common.util.a aVar = new com.mbridge.msdk.config.component.common.util.a();
            a9.a aVar2 = new a9.a(aVar);
            HashMap map = new HashMap();
            map.put("callback", aVar2);
            HashMap map2 = new HashMap();
            map2.put("sdk_context", map);
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "is_ready", map2);
            Map map3 = (Map) aVar.a(3000L);
            this.isQuerying = false;
            if (map3 != null) {
                Object obj = map3.get("ready_state");
                if (obj instanceof Boolean) {
                    return ((Boolean) obj).booleanValue();
                }
            }
            return false;
        } catch (InterruptedException e10) {
            q0.b(TAG, "isReadyWithSyncWait interrupted: " + e10.getMessage(), e10);
            return false;
        } catch (Exception e11) {
            q0.b(TAG, "isReadyWithSyncWait error: " + e11.getMessage(), e11);
            return false;
        }
    }

    public void setIVRewardEnable(int i10, int i11) {
        int i12 = i10 == com.mbridge.msdk.foundation.same.a.H ? 2 : i10;
        if (i10 == com.mbridge.msdk.foundation.same.a.I) {
            i12 = 4;
        }
        HashMap map = new HashMap();
        map.put("ivReward_type", Integer.valueOf(i12));
        map.put("ivReward_value", Integer.valueOf(i11));
        this.developerSettingMap.put("iv_reward", map);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "iv_reward", map);
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.newInterstitialListener = newInterstitialListener;
        this.mComponentCallbackListener = createInterstitialVideoListener();
    }

    private com.mbridge.msdk.config.manager.callback.b createInterstitialVideoListener() {
        return new AnonymousClass2();
    }

    private com.mbridge.msdk.config.manager.callback.b createRewardVideoListener() {
        return new AnonymousClass1();
    }

    public void playVideoMute(int i10) {
        this.isSilent = i10;
        this.developerSettingMap.put("mute_state", Integer.valueOf(i10));
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "video_mute", null);
    }

    public void sendApiCallEvent(String str, String str2, Map<String, Object> map) {
        try {
            HashMap map2 = new HashMap();
            map2.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, this.placementId);
            map2.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unitId);
            map2.put("ad_type", Integer.valueOf(this.adType));
            map2.putAll(this.developerSettingMap);
            if (map != null && !map.isEmpty()) {
                map2.putAll(map);
            }
            if (!map2.containsKey("sdk_context")) {
                HashMap map3 = new HashMap();
                map3.put("callback", this.mComponentCallbackListener);
                map2.put("sdk_context", map3);
            }
            com.mbridge.msdk.config.manager.a.b().a(str, str2, map2);
        } catch (Exception e10) {
            q0.b(TAG, "sendComponentEvent error: " + e10.getMessage(), e10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        try {
            HashMap map = new HashMap();
            map.put("title", str);
            map.put("content", str2);
            map.put("confirm", str3);
            map.put("cancel", str4);
            this.developerSettingMap.put("dialog_config", map);
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "set_alert_text", map);
        } catch (Exception e10) {
            q0.b(TAG, "BaseComponentStrategy setAlertDialogText error: " + e10.getMessage(), e10);
        }
    }

    public void setExtraInfo(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        HashMap map = new HashMap();
        map.put("extra_info", jSONObject);
        this.developerSettingMap.put("extra_info", jSONObject);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "set_extra_info", map);
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.newInterstitialListener = newInterstitialListener;
        this.mComponentCallbackListener = createInterstitialVideoListener();
    }

    public void setRewardPlus(boolean z10) {
        this.isRewardPlusOpen = z10;
        this.developerSettingMap.put("reward_plus_open", Boolean.valueOf(z10));
        HashMap map = new HashMap();
        map.put("reward_plus_open", Boolean.valueOf(z10));
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "set_reward_plus", map);
    }

    public void threadConsistentCallback(Runnable runnable) {
        if (this.triggerThreadLooper == Looper.getMainLooper()) {
            MAIN_HANDLER.post(runnable);
        } else {
            runnable.run();
        }
    }

    public BaseComponentStrategy(String str, String str2, int i10) {
        String str3;
        this.placementId = str;
        this.unitId = str2;
        this.adType = i10;
        if (i10 == 94) {
            str3 = "rv_init";
        } else if (i10 == 287) {
            str3 = "iv_init";
        } else {
            str3 = "";
        }
        if (!TextUtils.isEmpty(str3)) {
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), str3, null);
        }
        recordTriggerThread();
    }

    public void clearBitmapCache() {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a();
    }

    public void clearVideoCache() {
        o0.b();
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "clear_video_cache", null);
    }

    public String getCreativeIdWithUnitId() {
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "get_creative_id", null);
        if (com.mbridge.msdk.config.manager.a.b().a().b("creativeId") != null) {
            Object objB = com.mbridge.msdk.config.manager.a.b().a().b("creativeId");
            if (objB instanceof Map) {
                Object obj = ((Map) objB).get(this.unitId);
                if (obj instanceof String) {
                    return (String) obj;
                }
                return "";
            }
            return "";
        }
        return "";
    }

    public String getRequestId() {
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "get_request_id", null);
        if (com.mbridge.msdk.config.manager.a.b().a().b("requestId") != null) {
            Object objB = com.mbridge.msdk.config.manager.a.b().a().b("requestId");
            if (objB instanceof String) {
                return (String) objB;
            }
            return "";
        }
        return "";
    }

    public void recordTriggerThread() {
        this.triggerThreadLooper = Looper.myLooper();
    }

    public void setRewardVideoListener(com.mbridge.msdk.video.bt.module.orglistener.g gVar) {
        this.rewardVideoListener = gVar;
        this.mComponentCallbackListener = createRewardVideoListener();
    }

    public void setIVRewardEnable(int i10, double d10) {
        int i11 = i10 == com.mbridge.msdk.foundation.same.a.H ? 1 : i10;
        if (i10 == com.mbridge.msdk.foundation.same.a.I) {
            i11 = 3;
        }
        HashMap map = new HashMap();
        map.put("ivReward_type", Integer.valueOf(i11));
        map.put("ivReward_value", Double.valueOf(d10));
        this.developerSettingMap.put("iv_reward", map);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "iv_reward", map);
    }
}
