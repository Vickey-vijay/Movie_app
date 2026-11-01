# noads.spec -- every edit applied to the original Flickverse V4.0.0 APK's DEX files.
# Format:  CLASS | METHOD | PROTO | ACTION | ARG
# See tools/DexPatch.java for what each action does. Each edit is in-place: no instruction
# is added or removed, so no DEX offset or size changes.

# ---------------------------------------------------------------------------------------
# 1. Server-driven ad lists. AdInfoEntry.getAd_position_N() always returns null, which is
#    exactly what the app sees when the server sends no ads. Every one of the ~50 call
#    sites in the app was checked: all test "!= null && size() > 0" (or the inverse) first.
# ---------------------------------------------------------------------------------------
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_1 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_2 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_3 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_4 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_5 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_6 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_7 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_8 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_9 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_10 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_11 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_12 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_13 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_15 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_16 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_17 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_18 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_19 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_20 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_21 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_22 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_23 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_24 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_25 | ()Ljava/util/List; | GETTER_NULL
Lcom/mgs/carparking/netbean/AdInfoEntry; | getAd_position_26 | ()Ljava/util/List; | GETTER_NULL

# ---------------------------------------------------------------------------------------
# 2. OKT / WxSDK ad aggregator (the layer that starts every ad network at runtime).
#    loadAdConf() is the only place WxSDK.initSdk() is called. P() only preloads
#    reward/interstitial ads and is triggered by the "ad SDK initialised" event.
# ---------------------------------------------------------------------------------------
Lcom/mgs/carparking/app/AppApplication; | loadAdConf | (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V | RET_VOID
Lcom/mgs/carparking/ui/MainActivity; | P | ()V | RET_VOID
Lcom/mgs/carparking/ui/MainActivity; | onCreate | (Landroid/os/Bundle;)V | NOP_INVOKE | MainSDK;->initAdCache(
Lcom/mgs/carparking/ui/MainActivity; | onCreate | (Landroid/os/Bundle;)V | NOP_INVOKE | MainSDK;->getInstance()

# ---------------------------------------------------------------------------------------
# 3. AppMetrica analytics activation (the only AppMetrica call in the app's own code).
# ---------------------------------------------------------------------------------------
Lcom/mgs/carparking/app/AppApplication; | safedk_AppApplication_onCreate_bbdf4c402a780e2be10909c2ace6b7a9 | (Lcom/mgs/carparking/app/AppApplication;)V | NOP_INVOKE | AppMetrica;->activate(

# ---------------------------------------------------------------------------------------
# 4. Ad-SDK ContentProviders / startup initialisers that run at process start, before any
#    app code, to boot their SDK. Each becomes a provider that does nothing.
#    (Not touched: com.yk.e.provider.MainProvider is only a FileProvider.)
# ---------------------------------------------------------------------------------------
Lcom/google/android/gms/ads/MobileAdsInitProvider; | attachInfo | (Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V | RET_VOID
Lcom/applovin/sdk/AppLovinInitProvider; | onCreate | ()Z | RET_TRUE
Lio/bidmachine/BidMachineInitProvider; | onCreate | ()Z | RET_TRUE
Lcom/vungle/ads/VungleProvider; | onCreate | ()Z | RET_TRUE
Lsg/bigo/ads/controller/provider/BigoAdsProvider; | onCreate | ()Z | RET_TRUE
Lcom/mbridge/msdk/config/component/status/MBComponentLifecycleProvider; | onCreate | ()Z | RET_TRUE
Lcom/yandex/mobile/ads/core/initializer/MobileAdsInitializeProvider; | onCreate | ()Z | RET_TRUE
Lcom/facebook/ads/AudienceNetworkContentProvider; | onCreate | ()Z | RET_TRUE
Lcom/ironsource/lifecycle/IronsourceLifecycleProvider; | onCreate | ()Z | RET_TRUE
Lcom/ironsource/lifecycle/LevelPlayActivityLifecycleProvider; | onCreate | ()Z | RET_TRUE
Lcom/unity3d/services/core/configuration/AdsSdkInitializer; | create | (Landroid/content/Context;)V | RET_VOID
