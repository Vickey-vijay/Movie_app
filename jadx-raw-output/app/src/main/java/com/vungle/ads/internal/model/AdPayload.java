package com.vungle.ads.internal.model;

import al.d;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import bl.a1;
import bl.d2;
import bl.o1;
import bl.p0;
import bl.u0;
import bl.y1;
import ck.i;
import ck.p;
import ck.s;
import cl.w;
import com.ironsource.Y5;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.b;
import com.vungle.ads.AdConfig;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.ads.networks.adaptiverendering.measurer.AdMeasurerFactory;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import jk.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.text.Regex;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.json.JsonObject;
import lk.a0;
import mj.h;
import nj.b0;
import nj.t;
import xk.f;

/* JADX INFO: compiled from: AdPayload.kt */
/* JADX INFO: loaded from: classes5.dex */
@f
@Metadata(bv = {}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u008b\u00012\u00020\u0001:\u0016\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u008b\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001B'\u0012\u0010\b\u0002\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010+\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001B\u008a\u0001\b\u0017\u0012\u0007\u0010\u0087\u0001\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010+\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010T\u001a\u0004\u0018\u00010S\u0012\u0016\b\u0001\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010V\u0012\u0016\b\u0001\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010;\u0012\u0006\u0010a\u001a\u00020\t\u0012\b\u0010x\u001a\u0004\u0018\u00010\u0005\u0012\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u008a\u0001J\u001e\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J'\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002J\u001e\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u001b\u001a\u00020\u0007J\u0006\u0010\u001c\u001a\u00020\u0007J\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ\b\u0010 \u001a\u0004\u0018\u00010\u001fJ\u0006\u0010!\u001a\u00020\tJ\u0006\u0010\"\u001a\u00020\tJ\u0006\u0010#\u001a\u00020\tJ\u0006\u0010$\u001a\u00020\tJ\u000e\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0005J\u0006\u0010'\u001a\u00020\tJ\u0010\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00020\u0005J\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020)0+2\u0006\u0010\u0003\u001a\u00020\u0002J.\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010+2\u0006\u0010-\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005J\u0006\u00100\u001a\u00020\u0016J\u0006\u00101\u001a\u00020\tJ\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010+J\u0006\u00103\u001a\u00020\tJ\b\u00104\u001a\u0004\u0018\u00010\u0005J&\u00109\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u0005J\u0006\u0010:\u001a\u00020\u0016J\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050;J\u0006\u0010>\u001a\u00020=J\u0017\u0010@\u001a\u00020\u00072\b\u0010?\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b@\u0010AJ\u0006\u0010B\u001a\u00020\u0005J\b\u0010C\u001a\u0004\u0018\u00010\u0005J\b\u0010D\u001a\u0004\u0018\u00010\u0005J\b\u0010E\u001a\u0004\u0018\u00010\u0005J\b\u0010G\u001a\u0004\u0018\u00010FJ\u0006\u0010H\u001a\u00020\tJ\u0016\u0010K\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u0002R\"\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010+8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bM\u0010N\u0012\u0004\bO\u0010PR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b \u0010Q\u0012\u0004\bR\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR(\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050V8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\bW\u0010X\u0012\u0004\bY\u0010PR4\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050;8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bZ\u0010[\u0012\u0004\b`\u0010P\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010a\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR*\u0010h\u001a\u0004\u0018\u00010g8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bh\u0010i\u0012\u0004\bn\u0010P\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR*\u0010p\u001a\u0004\u0018\u00010o8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bp\u0010q\u0012\u0004\bv\u0010P\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR(\u0010x\u001a\u0004\u0018\u00010\u00052\b\u0010w\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R,\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020)0;8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b|\u0010[\u0012\u0004\b~\u0010P\u001a\u0004\b}\u0010]R\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u00010L8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0096\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload;", "", "Ljava/io/File;", "dir", "Lkotlin/Pair;", "", "getIndexHtmlFile", "", "percentage", "", "computeAssetRequirement", "(Ljava/lang/Integer;)Lkotlin/Pair;", "value", "valueOrEmpty", "oldValue", "newValue", "complexReplace", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "placementId", "eventId", "advAppId", "adWidth", "adHeight", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "adUnit", "Lcom/vungle/ads/internal/model/ConfigPayload;", "config", "adLoadOptimizationEnabled", "isPartialDownloadEnabled", "omEnabled", "isClickCoordinatesTrackingEnabled", "failingUrl", "isCriticalAsset", "heartbeatEnabled", "remoteUrl", "Lcom/vungle/ads/internal/model/AdAsset;", "getLocalPartialDownloadAssets", "", "getDownloadableAssets", "event", "secondValue", "getTpatUrls", "recordExpiryWindowStart", "hasExpired", "getWinNotifications", "isNativeTemplateType", "templateType", "title", "body", "keepWatching", "close", "setIncentivizedText", "setAssetFullyDownloaded", "", "getMRAIDArgsInMap", "Lkotlinx/serialization/json/JsonObject;", "createMRAIDArgs", "incentivized", "getShowCloseDelay", "(Ljava/lang/Boolean;)I", "getCreativeId", "getAdSource", "getMediationName", "getViewMasterVersion", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "getWebViewSettings", "usePreloading", "adIdentifier", "localFile", "updateAdAssetPath", "Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", b.JSON_KEY_ADS, "Ljava/util/List;", "getAds$annotations", "()V", "Lcom/vungle/ads/internal/model/ConfigPayload;", "getConfig$annotations", "", "expiryWindowStart", "Ljava/lang/Long;", "Ljava/util/concurrent/ConcurrentHashMap;", "mraidFiles", "Ljava/util/concurrent/ConcurrentHashMap;", "getMraidFiles$annotations", "incentivizedTextSettings", "Ljava/util/Map;", "getIncentivizedTextSettings", "()Ljava/util/Map;", "setIncentivizedTextSettings", "(Ljava/util/Map;)V", "getIncentivizedTextSettings$annotations", "assetsFullyDownloaded", "Z", "getAssetsFullyDownloaded", "()Z", "setAssetsFullyDownloaded", "(Z)V", "Lcom/vungle/ads/AdConfig;", "adConfig", "Lcom/vungle/ads/AdConfig;", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "setAdConfig", "(Lcom/vungle/ads/AdConfig;)V", "getAdConfig$annotations", "Lcom/vungle/ads/internal/util/LogEntry;", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/LogEntry;", "setLogEntry$vungle_ads_release", "(Lcom/vungle/ads/internal/util/LogEntry;)V", "getLogEntry$vungle_ads_release$annotations", "<set-?>", "indexFilePath", "Ljava/lang/String;", "getIndexFilePath", "()Ljava/lang/String;", "partialDownloadAssets", "getPartialDownloadAssets$vungle_ads_release", "getPartialDownloadAssets$vungle_ads_release$annotations", "getAd", "()Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "ad", "getAdMarkup", "()Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "adMarkup", "<init>", "(Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload;Ljava/lang/Long;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/Map;ZLjava/lang/String;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "AdSizeInfo", "AdUnit", "CacheableReplacement", "PlacementAdUnit", "TemplateSettings", "TpatSerializer", "ViewAbility", "ViewAbilityInfo", "WebViewSettings", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class AdPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String FILE_SCHEME = "file://";
    public static final String INCENTIVIZED_BODY_TEXT = "INCENTIVIZED_BODY_TEXT";
    public static final String INCENTIVIZED_CLOSE_TEXT = "INCENTIVIZED_CLOSE_TEXT";
    public static final String INCENTIVIZED_CONTINUE_TEXT = "INCENTIVIZED_CONTINUE_TEXT";
    public static final String INCENTIVIZED_TITLE_TEXT = "INCENTIVIZED_TITLE_TEXT";
    public static final String KEY_VM = "vmURL";
    private static final String TAG = "AdPayload";
    public static final String TPAT_CLICK_COORDINATES_URLS = "video.clickCoordinates";
    private static final String UNKNOWN = "unknown";
    private AdConfig adConfig;
    private final List<PlacementAdUnit> ads;
    private boolean assetsFullyDownloaded;
    private final ConfigPayload config;
    private Long expiryWindowStart;
    private Map<String, String> incentivizedTextSettings;
    private String indexFilePath;
    private LogEntry logEntry;
    private ConcurrentHashMap<String, String> mraidFiles;
    private final Map<String, AdAsset> partialDownloadAssets;

    /* JADX INFO: compiled from: AdPayload.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001d\u0010\u001eB3\b\u0017\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u000bR\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006%"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "component2", "width", "height", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getWidth", "getWidth$annotations", "()V", "getHeight", "getHeight$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class AdSizeInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer height;
        private final Integer width;

        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final xk.b<AdSizeInfo> serializer() {
                return AdPayload$AdSizeInfo$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdSizeInfo() {
            this((Integer) null, (Integer) (0 == true ? 1 : 0), 3, (i) (0 == true ? 1 : 0));
        }

        public AdSizeInfo(Integer num, Integer num2) {
            this.width = num;
            this.height = num2;
        }

        public static /* synthetic */ AdSizeInfo copy$default(AdSizeInfo adSizeInfo, Integer num, Integer num2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = adSizeInfo.width;
            }
            if ((i10 & 2) != 0) {
                num2 = adSizeInfo.height;
            }
            return adSizeInfo.copy(num, num2);
        }

        public static /* synthetic */ void getHeight$annotations() {
        }

        public static /* synthetic */ void getWidth$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getHeight() {
            return this.height;
        }

        public final AdSizeInfo copy(Integer width, Integer height) {
            return new AdSizeInfo(width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdSizeInfo)) {
                return false;
            }
            AdSizeInfo adSizeInfo = (AdSizeInfo) other;
            return p.e(this.width, adSizeInfo.width) && p.e(this.height, adSizeInfo.height);
        }

        public int hashCode() {
            Integer num = this.width;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.height;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "AdSizeInfo(width=" + this.width + ", height=" + this.height + ')';
        }

        public static final void write$Self(AdSizeInfo adSizeInfo, d dVar, a aVar) {
            Integer num;
            Integer num2;
            p.j(adSizeInfo, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            if (dVar.q(aVar, 0) || (num = adSizeInfo.width) == null || num.intValue() != 0) {
                dVar.C(aVar, 0, p0.f5452a, adSizeInfo.width);
            }
            if (dVar.q(aVar, 1) || (num2 = adSizeInfo.height) == null || num2.intValue() != 0) {
                dVar.C(aVar, 1, p0.f5452a, adSizeInfo.height);
            }
        }

        public final Integer getHeight() {
            return this.height;
        }

        public final Integer getWidth() {
            return this.width;
        }

        public /* synthetic */ AdSizeInfo(int i10, Integer num, Integer num2, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, AdPayload$AdSizeInfo$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.width = 0;
            } else {
                this.width = num;
            }
            if ((i10 & 2) == 0) {
                this.height = 0;
            } else {
                this.height = num2;
            }
        }

        public /* synthetic */ AdSizeInfo(Integer num, Integer num2, int i10, i iVar) {
            this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? 0 : num2);
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bw\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ©\u00012\u00020\u0001:\u0004ª\u0001©\u0001B\u008f\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\r\u0012\u001c\b\u0002\u0010?\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001c\u0018\u00010\u001b\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0012¢\u0006\u0006\b£\u0001\u0010¤\u0001B¦\u0003\b\u0017\u0012\u0007\u0010¥\u0001\u001a\u00020\r\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u00106\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010=\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010>\u001a\u0004\u0018\u00010\r\u0012\u001c\b\u0001\u0010?\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001c\u0018\u00010\u001b\u0012\n\b\u0001\u0010@\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010C\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c\u0012\u0010\b\u0001\u0010D\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c\u0012\n\b\u0001\u0010E\u001a\u0004\u0018\u00010#\u0012\n\b\u0001\u0010F\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010G\u001a\u0004\u0018\u00010&\u0012\n\b\u0001\u0010H\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010I\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010J\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010K\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010L\u001a\u0004\u0018\u00010,\u0012\n\b\u0001\u0010M\u001a\u0004\u0018\u00010.\u0012\n\b\u0001\u0010N\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010O\u001a\u0004\u0018\u00010\u0012\u0012\n\u0010§\u0001\u001a\u0005\u0018\u00010¦\u0001¢\u0006\u0006\b£\u0001\u0010¨\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u000fJ\u0012\u0010\u001a\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000fJ\u001d\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001c\u0018\u00010\u001bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010#HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010&HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010\u000fJ\u0012\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010\u000fJ\u000b\u0010-\u001a\u0004\u0018\u00010,HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010.HÆ\u0003J\u0012\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b0\u0010\u0014J\u0012\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b1\u0010\u0014J\u0096\u0003\u0010P\u001a\u00020\u00002\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\r2\u001c\b\u0002\u0010?\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001c\u0018\u00010\u001b2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c2\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\bP\u0010QJ\t\u0010R\u001a\u00020\tHÖ\u0001J\t\u0010S\u001a\u00020\rHÖ\u0001J\u0013\u0010U\u001a\u00020\u00122\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u00102\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010V\u0012\u0004\bY\u0010Z\u001a\u0004\bW\u0010XR\"\u00103\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010V\u0012\u0004\b\\\u0010Z\u001a\u0004\b[\u0010XR\"\u00104\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010V\u0012\u0004\b^\u0010Z\u001a\u0004\b]\u0010XR\"\u00105\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010_\u0012\u0004\ba\u0010Z\u001a\u0004\b`\u0010\u000fR\"\u00106\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010_\u0012\u0004\bc\u0010Z\u001a\u0004\bb\u0010\u000fR\"\u00107\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010V\u0012\u0004\be\u0010Z\u001a\u0004\bd\u0010XR\"\u00108\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010f\u0012\u0004\bh\u0010Z\u001a\u0004\bg\u0010\u0014R\"\u00109\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010f\u0012\u0004\bj\u0010Z\u001a\u0004\bi\u0010\u0014R\"\u0010:\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010f\u0012\u0004\bl\u0010Z\u001a\u0004\bk\u0010\u0014R\"\u0010;\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010V\u0012\u0004\bn\u0010Z\u001a\u0004\bm\u0010XR\"\u0010<\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010V\u0012\u0004\bp\u0010Z\u001a\u0004\bo\u0010XR\"\u0010=\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010_\u0012\u0004\br\u0010Z\u001a\u0004\bq\u0010\u000fR\"\u0010>\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010_\u0012\u0004\bt\u0010Z\u001a\u0004\bs\u0010\u000fR4\u0010?\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001c\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010u\u0012\u0004\bx\u0010Z\u001a\u0004\bv\u0010wR\"\u0010@\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010V\u0012\u0004\bz\u0010Z\u001a\u0004\by\u0010XR\"\u0010A\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010V\u0012\u0004\b|\u0010Z\u001a\u0004\b{\u0010XR\"\u0010B\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010V\u0012\u0004\b~\u0010Z\u001a\u0004\b}\u0010XR+\u0010C\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0015\n\u0004\bC\u0010\u007f\u0012\u0005\b\u0082\u0001\u0010Z\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R+\u0010D\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0015\n\u0004\bD\u0010\u007f\u0012\u0005\b\u0084\u0001\u0010Z\u001a\u0006\b\u0083\u0001\u0010\u0081\u0001R&\u0010E\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bE\u0010\u0085\u0001\u0012\u0005\b\u0088\u0001\u0010Z\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R$\u0010F\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bF\u0010V\u0012\u0005\b\u008a\u0001\u0010Z\u001a\u0005\b\u0089\u0001\u0010XR&\u0010G\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bG\u0010\u008b\u0001\u0012\u0005\b\u008e\u0001\u0010Z\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R$\u0010H\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bH\u0010V\u0012\u0005\b\u0090\u0001\u0010Z\u001a\u0005\b\u008f\u0001\u0010XR$\u0010I\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bI\u0010V\u0012\u0005\b\u0092\u0001\u0010Z\u001a\u0005\b\u0091\u0001\u0010XR$\u0010J\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bJ\u0010_\u0012\u0005\b\u0094\u0001\u0010Z\u001a\u0005\b\u0093\u0001\u0010\u000fR$\u0010K\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bK\u0010_\u0012\u0005\b\u0096\u0001\u0010Z\u001a\u0005\b\u0095\u0001\u0010\u000fR&\u0010L\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bL\u0010\u0097\u0001\u0012\u0005\b\u009a\u0001\u0010Z\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R&\u0010M\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bM\u0010\u009b\u0001\u0012\u0005\b\u009e\u0001\u0010Z\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R$\u0010N\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bN\u0010f\u0012\u0005\b \u0001\u0010Z\u001a\u0005\b\u009f\u0001\u0010\u0014R$\u0010O\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bO\u0010f\u0012\u0005\b¢\u0001\u0010Z\u001a\u0005\b¡\u0001\u0010\u0014¨\u0006«\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "component2", "component3", "", "component4", "()Ljava/lang/Integer;", "component5", "component6", "", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "component11", "component12", "component13", "", "", "component14", "component15", "component16", "component17", "component18", "component19", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "component20", "component21", "Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "component22", "component23", "component24", "component25", "component26", "Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "component27", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "component28", "component29", "component30", "id", "adType", "adSource", "expiry", "expiryDuration", "deeplinkUrl", "clickCoordinatesEnabled", "adLoadOptimizationEnabled", "templateHeartbeatCheck", "mediationName", "info", "sleep", IronSourceConstants.EVENTS_ERROR_CODE, "tpat", AdPayload.KEY_VM, "vmVersion", "adMarketId", "notification", "loadAdUrls", "viewAbility", "templateType", "templateSettings", "creativeId", "advAppId", "showClose", "showCloseIncentivized", "adSizeInfo", "webViewSettings", "usePreloading", "partialDownloadEnabled", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "getAdType", "getAdType$annotations", "getAdSource", "getAdSource$annotations", "Ljava/lang/Integer;", "getExpiry", "getExpiry$annotations", "getExpiryDuration", "getExpiryDuration$annotations", "getDeeplinkUrl", "getDeeplinkUrl$annotations", "Ljava/lang/Boolean;", "getClickCoordinatesEnabled", "getClickCoordinatesEnabled$annotations", "getAdLoadOptimizationEnabled", "getAdLoadOptimizationEnabled$annotations", "getTemplateHeartbeatCheck", "getTemplateHeartbeatCheck$annotations", "getMediationName", "getMediationName$annotations", "getInfo", "getInfo$annotations", "getSleep", "getSleep$annotations", "getErrorCode", "getErrorCode$annotations", "Ljava/util/Map;", "getTpat", "()Ljava/util/Map;", "getTpat$annotations", "getVmURL", "getVmURL$annotations", "getVmVersion", "getVmVersion$annotations", "getAdMarketId", "getAdMarketId$annotations", "Ljava/util/List;", "getNotification", "()Ljava/util/List;", "getNotification$annotations", "getLoadAdUrls", "getLoadAdUrls$annotations", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "getViewAbility", "()Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "getViewAbility$annotations", "getTemplateType", "getTemplateType$annotations", "Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "getTemplateSettings", "()Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "getTemplateSettings$annotations", "getCreativeId", "getCreativeId$annotations", "getAdvAppId", "getAdvAppId$annotations", "getShowClose", "getShowClose$annotations", "getShowCloseIncentivized", "getShowCloseIncentivized$annotations", "Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "getAdSizeInfo", "()Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "getAdSizeInfo$annotations", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "getWebViewSettings", "()Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "getWebViewSettings$annotations", "getUsePreloading", "getUsePreloading$annotations", "getPartialDownloadEnabled", "getPartialDownloadEnabled$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class AdUnit {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean adLoadOptimizationEnabled;
        private final String adMarketId;
        private final AdSizeInfo adSizeInfo;
        private final String adSource;
        private final String adType;
        private final String advAppId;
        private final Boolean clickCoordinatesEnabled;
        private final String creativeId;
        private final String deeplinkUrl;
        private final Integer errorCode;
        private final Integer expiry;
        private final Integer expiryDuration;
        private final String id;
        private final String info;
        private final List<String> loadAdUrls;
        private final String mediationName;
        private final List<String> notification;
        private final Boolean partialDownloadEnabled;
        private final Integer showClose;
        private final Integer showCloseIncentivized;
        private final Integer sleep;
        private final Boolean templateHeartbeatCheck;
        private final TemplateSettings templateSettings;
        private final String templateType;
        private final Map<String, List<String>> tpat;
        private final Boolean usePreloading;
        private final ViewAbility viewAbility;
        private final String vmURL;
        private final String vmVersion;
        private final WebViewSettings webViewSettings;

        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdUnit$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final xk.b<AdUnit> serializer() {
                return AdPayload$AdUnit$$serializer.INSTANCE;
            }
        }

        public AdUnit() {
            this((String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Integer) null, (Map) null, (String) null, (String) null, (String) null, (List) null, (List) null, (ViewAbility) null, (String) null, (TemplateSettings) null, (String) null, (String) null, (Integer) null, (Integer) null, (AdSizeInfo) null, (WebViewSettings) null, (Boolean) null, (Boolean) null, 1073741823, (i) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdUnit(String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, Integer num3, Integer num4, Map<String, ? extends List<String>> map, String str7, String str8, String str9, List<String> list, List<String> list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool4, Boolean bool5) {
            this.id = str;
            this.adType = str2;
            this.adSource = str3;
            this.expiry = num;
            this.expiryDuration = num2;
            this.deeplinkUrl = str4;
            this.clickCoordinatesEnabled = bool;
            this.adLoadOptimizationEnabled = bool2;
            this.templateHeartbeatCheck = bool3;
            this.mediationName = str5;
            this.info = str6;
            this.sleep = num3;
            this.errorCode = num4;
            this.tpat = map;
            this.vmURL = str7;
            this.vmVersion = str8;
            this.adMarketId = str9;
            this.notification = list;
            this.loadAdUrls = list2;
            this.viewAbility = viewAbility;
            this.templateType = str10;
            this.templateSettings = templateSettings;
            this.creativeId = str11;
            this.advAppId = str12;
            this.showClose = num5;
            this.showCloseIncentivized = num6;
            this.adSizeInfo = adSizeInfo;
            this.webViewSettings = webViewSettings;
            this.usePreloading = bool4;
            this.partialDownloadEnabled = bool5;
        }

        public static /* synthetic */ void getAdLoadOptimizationEnabled$annotations() {
        }

        public static /* synthetic */ void getAdMarketId$annotations() {
        }

        public static /* synthetic */ void getAdSizeInfo$annotations() {
        }

        public static /* synthetic */ void getAdSource$annotations() {
        }

        public static /* synthetic */ void getAdType$annotations() {
        }

        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        public static /* synthetic */ void getClickCoordinatesEnabled$annotations() {
        }

        public static /* synthetic */ void getCreativeId$annotations() {
        }

        public static /* synthetic */ void getDeeplinkUrl$annotations() {
        }

        public static /* synthetic */ void getErrorCode$annotations() {
        }

        public static /* synthetic */ void getExpiry$annotations() {
        }

        public static /* synthetic */ void getExpiryDuration$annotations() {
        }

        public static /* synthetic */ void getId$annotations() {
        }

        public static /* synthetic */ void getInfo$annotations() {
        }

        public static /* synthetic */ void getLoadAdUrls$annotations() {
        }

        public static /* synthetic */ void getMediationName$annotations() {
        }

        public static /* synthetic */ void getNotification$annotations() {
        }

        public static /* synthetic */ void getPartialDownloadEnabled$annotations() {
        }

        public static /* synthetic */ void getShowClose$annotations() {
        }

        public static /* synthetic */ void getShowCloseIncentivized$annotations() {
        }

        public static /* synthetic */ void getSleep$annotations() {
        }

        public static /* synthetic */ void getTemplateHeartbeatCheck$annotations() {
        }

        public static /* synthetic */ void getTemplateSettings$annotations() {
        }

        public static /* synthetic */ void getTemplateType$annotations() {
        }

        @f(with = TpatSerializer.class)
        public static /* synthetic */ void getTpat$annotations() {
        }

        public static /* synthetic */ void getUsePreloading$annotations() {
        }

        public static /* synthetic */ void getViewAbility$annotations() {
        }

        public static /* synthetic */ void getVmURL$annotations() {
        }

        public static /* synthetic */ void getVmVersion$annotations() {
        }

        public static /* synthetic */ void getWebViewSettings$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getMediationName() {
            return this.mediationName;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getInfo() {
            return this.info;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Integer getSleep() {
            return this.sleep;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final Map<String, List<String>> component14() {
            return this.tpat;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getVmURL() {
            return this.vmURL;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getVmVersion() {
            return this.vmVersion;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getAdMarketId() {
            return this.adMarketId;
        }

        public final List<String> component18() {
            return this.notification;
        }

        public final List<String> component19() {
            return this.loadAdUrls;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAdType() {
            return this.adType;
        }

        /* JADX INFO: renamed from: component20, reason: from getter */
        public final ViewAbility getViewAbility() {
            return this.viewAbility;
        }

        /* JADX INFO: renamed from: component21, reason: from getter */
        public final String getTemplateType() {
            return this.templateType;
        }

        /* JADX INFO: renamed from: component22, reason: from getter */
        public final TemplateSettings getTemplateSettings() {
            return this.templateSettings;
        }

        /* JADX INFO: renamed from: component23, reason: from getter */
        public final String getCreativeId() {
            return this.creativeId;
        }

        /* JADX INFO: renamed from: component24, reason: from getter */
        public final String getAdvAppId() {
            return this.advAppId;
        }

        /* JADX INFO: renamed from: component25, reason: from getter */
        public final Integer getShowClose() {
            return this.showClose;
        }

        /* JADX INFO: renamed from: component26, reason: from getter */
        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        /* JADX INFO: renamed from: component27, reason: from getter */
        public final AdSizeInfo getAdSizeInfo() {
            return this.adSizeInfo;
        }

        /* JADX INFO: renamed from: component28, reason: from getter */
        public final WebViewSettings getWebViewSettings() {
            return this.webViewSettings;
        }

        /* JADX INFO: renamed from: component29, reason: from getter */
        public final Boolean getUsePreloading() {
            return this.usePreloading;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAdSource() {
            return this.adSource;
        }

        /* JADX INFO: renamed from: component30, reason: from getter */
        public final Boolean getPartialDownloadEnabled() {
            return this.partialDownloadEnabled;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getExpiry() {
            return this.expiry;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Integer getExpiryDuration() {
            return this.expiryDuration;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Boolean getAdLoadOptimizationEnabled() {
            return this.adLoadOptimizationEnabled;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Boolean getTemplateHeartbeatCheck() {
            return this.templateHeartbeatCheck;
        }

        public final AdUnit copy(String id2, String adType, String adSource, Integer expiry, Integer expiryDuration, String deeplinkUrl, Boolean clickCoordinatesEnabled, Boolean adLoadOptimizationEnabled, Boolean templateHeartbeatCheck, String mediationName, String info, Integer sleep, Integer errorCode, Map<String, ? extends List<String>> tpat, String vmURL, String vmVersion, String adMarketId, List<String> notification, List<String> loadAdUrls, ViewAbility viewAbility, String templateType, TemplateSettings templateSettings, String creativeId, String advAppId, Integer showClose, Integer showCloseIncentivized, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean usePreloading, Boolean partialDownloadEnabled) {
            return new AdUnit(id2, adType, adSource, expiry, expiryDuration, deeplinkUrl, clickCoordinatesEnabled, adLoadOptimizationEnabled, templateHeartbeatCheck, mediationName, info, sleep, errorCode, tpat, vmURL, vmVersion, adMarketId, notification, loadAdUrls, viewAbility, templateType, templateSettings, creativeId, advAppId, showClose, showCloseIncentivized, adSizeInfo, webViewSettings, usePreloading, partialDownloadEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdUnit)) {
                return false;
            }
            AdUnit adUnit = (AdUnit) other;
            return p.e(this.id, adUnit.id) && p.e(this.adType, adUnit.adType) && p.e(this.adSource, adUnit.adSource) && p.e(this.expiry, adUnit.expiry) && p.e(this.expiryDuration, adUnit.expiryDuration) && p.e(this.deeplinkUrl, adUnit.deeplinkUrl) && p.e(this.clickCoordinatesEnabled, adUnit.clickCoordinatesEnabled) && p.e(this.adLoadOptimizationEnabled, adUnit.adLoadOptimizationEnabled) && p.e(this.templateHeartbeatCheck, adUnit.templateHeartbeatCheck) && p.e(this.mediationName, adUnit.mediationName) && p.e(this.info, adUnit.info) && p.e(this.sleep, adUnit.sleep) && p.e(this.errorCode, adUnit.errorCode) && p.e(this.tpat, adUnit.tpat) && p.e(this.vmURL, adUnit.vmURL) && p.e(this.vmVersion, adUnit.vmVersion) && p.e(this.adMarketId, adUnit.adMarketId) && p.e(this.notification, adUnit.notification) && p.e(this.loadAdUrls, adUnit.loadAdUrls) && p.e(this.viewAbility, adUnit.viewAbility) && p.e(this.templateType, adUnit.templateType) && p.e(this.templateSettings, adUnit.templateSettings) && p.e(this.creativeId, adUnit.creativeId) && p.e(this.advAppId, adUnit.advAppId) && p.e(this.showClose, adUnit.showClose) && p.e(this.showCloseIncentivized, adUnit.showCloseIncentivized) && p.e(this.adSizeInfo, adUnit.adSizeInfo) && p.e(this.webViewSettings, adUnit.webViewSettings) && p.e(this.usePreloading, adUnit.usePreloading) && p.e(this.partialDownloadEnabled, adUnit.partialDownloadEnabled);
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.adType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.adSource;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.expiry;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryDuration;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str4 = this.deeplinkUrl;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.clickCoordinatesEnabled;
            int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.adLoadOptimizationEnabled;
            int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.templateHeartbeatCheck;
            int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str5 = this.mediationName;
            int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.info;
            int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num3 = this.sleep;
            int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.errorCode;
            int iHashCode13 = (iHashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Map<String, List<String>> map = this.tpat;
            int iHashCode14 = (iHashCode13 + (map == null ? 0 : map.hashCode())) * 31;
            String str7 = this.vmURL;
            int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.vmVersion;
            int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.adMarketId;
            int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
            List<String> list = this.notification;
            int iHashCode18 = (iHashCode17 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.loadAdUrls;
            int iHashCode19 = (iHashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
            ViewAbility viewAbility = this.viewAbility;
            int iHashCode20 = (iHashCode19 + (viewAbility == null ? 0 : viewAbility.hashCode())) * 31;
            String str10 = this.templateType;
            int iHashCode21 = (iHashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
            TemplateSettings templateSettings = this.templateSettings;
            int iHashCode22 = (iHashCode21 + (templateSettings == null ? 0 : templateSettings.hashCode())) * 31;
            String str11 = this.creativeId;
            int iHashCode23 = (iHashCode22 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.advAppId;
            int iHashCode24 = (iHashCode23 + (str12 == null ? 0 : str12.hashCode())) * 31;
            Integer num5 = this.showClose;
            int iHashCode25 = (iHashCode24 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.showCloseIncentivized;
            int iHashCode26 = (iHashCode25 + (num6 == null ? 0 : num6.hashCode())) * 31;
            AdSizeInfo adSizeInfo = this.adSizeInfo;
            int iHashCode27 = (iHashCode26 + (adSizeInfo == null ? 0 : adSizeInfo.hashCode())) * 31;
            WebViewSettings webViewSettings = this.webViewSettings;
            int iHashCode28 = (iHashCode27 + (webViewSettings == null ? 0 : webViewSettings.hashCode())) * 31;
            Boolean bool4 = this.usePreloading;
            int iHashCode29 = (iHashCode28 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.partialDownloadEnabled;
            return iHashCode29 + (bool5 != null ? bool5.hashCode() : 0);
        }

        public String toString() {
            return "AdUnit(id=" + this.id + ", adType=" + this.adType + ", adSource=" + this.adSource + ", expiry=" + this.expiry + ", expiryDuration=" + this.expiryDuration + ", deeplinkUrl=" + this.deeplinkUrl + ", clickCoordinatesEnabled=" + this.clickCoordinatesEnabled + ", adLoadOptimizationEnabled=" + this.adLoadOptimizationEnabled + ", templateHeartbeatCheck=" + this.templateHeartbeatCheck + ", mediationName=" + this.mediationName + ", info=" + this.info + ", sleep=" + this.sleep + ", errorCode=" + this.errorCode + ", tpat=" + this.tpat + ", vmURL=" + this.vmURL + ", vmVersion=" + this.vmVersion + ", adMarketId=" + this.adMarketId + ", notification=" + this.notification + ", loadAdUrls=" + this.loadAdUrls + ", viewAbility=" + this.viewAbility + ", templateType=" + this.templateType + ", templateSettings=" + this.templateSettings + ", creativeId=" + this.creativeId + ", advAppId=" + this.advAppId + ", showClose=" + this.showClose + ", showCloseIncentivized=" + this.showCloseIncentivized + ", adSizeInfo=" + this.adSizeInfo + ", webViewSettings=" + this.webViewSettings + ", usePreloading=" + this.usePreloading + ", partialDownloadEnabled=" + this.partialDownloadEnabled + ')';
        }

        public static final void write$Self(AdUnit adUnit, d dVar, a aVar) {
            Integer num;
            Integer num2;
            p.j(adUnit, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            if (dVar.q(aVar, 0) || adUnit.id != null) {
                dVar.C(aVar, 0, d2.f5397a, adUnit.id);
            }
            if (dVar.q(aVar, 1) || adUnit.adType != null) {
                dVar.C(aVar, 1, d2.f5397a, adUnit.adType);
            }
            if (dVar.q(aVar, 2) || adUnit.adSource != null) {
                dVar.C(aVar, 2, d2.f5397a, adUnit.adSource);
            }
            if (dVar.q(aVar, 3) || adUnit.expiry != null) {
                dVar.C(aVar, 3, p0.f5452a, adUnit.expiry);
            }
            if (dVar.q(aVar, 4) || adUnit.expiryDuration != null) {
                dVar.C(aVar, 4, p0.f5452a, adUnit.expiryDuration);
            }
            if (dVar.q(aVar, 5) || adUnit.deeplinkUrl != null) {
                dVar.C(aVar, 5, d2.f5397a, adUnit.deeplinkUrl);
            }
            if (dVar.q(aVar, 6) || adUnit.clickCoordinatesEnabled != null) {
                dVar.C(aVar, 6, bl.i.f5416a, adUnit.clickCoordinatesEnabled);
            }
            if (dVar.q(aVar, 7) || adUnit.adLoadOptimizationEnabled != null) {
                dVar.C(aVar, 7, bl.i.f5416a, adUnit.adLoadOptimizationEnabled);
            }
            if (dVar.q(aVar, 8) || adUnit.templateHeartbeatCheck != null) {
                dVar.C(aVar, 8, bl.i.f5416a, adUnit.templateHeartbeatCheck);
            }
            if (dVar.q(aVar, 9) || adUnit.mediationName != null) {
                dVar.C(aVar, 9, d2.f5397a, adUnit.mediationName);
            }
            if (dVar.q(aVar, 10) || adUnit.info != null) {
                dVar.C(aVar, 10, d2.f5397a, adUnit.info);
            }
            if (dVar.q(aVar, 11) || adUnit.sleep != null) {
                dVar.C(aVar, 11, p0.f5452a, adUnit.sleep);
            }
            if (dVar.q(aVar, 12) || adUnit.errorCode != null) {
                dVar.C(aVar, 12, p0.f5452a, adUnit.errorCode);
            }
            if (dVar.q(aVar, 13) || adUnit.tpat != null) {
                dVar.C(aVar, 13, TpatSerializer.INSTANCE, adUnit.tpat);
            }
            if (dVar.q(aVar, 14) || adUnit.vmURL != null) {
                dVar.C(aVar, 14, d2.f5397a, adUnit.vmURL);
            }
            if (dVar.q(aVar, 15) || adUnit.vmVersion != null) {
                dVar.C(aVar, 15, d2.f5397a, adUnit.vmVersion);
            }
            if (dVar.q(aVar, 16) || adUnit.adMarketId != null) {
                dVar.C(aVar, 16, d2.f5397a, adUnit.adMarketId);
            }
            if (dVar.q(aVar, 17) || adUnit.notification != null) {
                dVar.C(aVar, 17, new bl.f(d2.f5397a), adUnit.notification);
            }
            if (dVar.q(aVar, 18) || adUnit.loadAdUrls != null) {
                dVar.C(aVar, 18, new bl.f(d2.f5397a), adUnit.loadAdUrls);
            }
            if (dVar.q(aVar, 19) || adUnit.viewAbility != null) {
                dVar.C(aVar, 19, AdPayload$ViewAbility$$serializer.INSTANCE, adUnit.viewAbility);
            }
            if (dVar.q(aVar, 20) || adUnit.templateType != null) {
                dVar.C(aVar, 20, d2.f5397a, adUnit.templateType);
            }
            if (dVar.q(aVar, 21) || adUnit.templateSettings != null) {
                dVar.C(aVar, 21, AdPayload$TemplateSettings$$serializer.INSTANCE, adUnit.templateSettings);
            }
            if (dVar.q(aVar, 22) || adUnit.creativeId != null) {
                dVar.C(aVar, 22, d2.f5397a, adUnit.creativeId);
            }
            if (dVar.q(aVar, 23) || adUnit.advAppId != null) {
                dVar.C(aVar, 23, d2.f5397a, adUnit.advAppId);
            }
            if (dVar.q(aVar, 24) || (num = adUnit.showClose) == null || num.intValue() != 0) {
                dVar.C(aVar, 24, p0.f5452a, adUnit.showClose);
            }
            if (dVar.q(aVar, 25) || (num2 = adUnit.showCloseIncentivized) == null || num2.intValue() != 0) {
                dVar.C(aVar, 25, p0.f5452a, adUnit.showCloseIncentivized);
            }
            if (dVar.q(aVar, 26) || adUnit.adSizeInfo != null) {
                dVar.C(aVar, 26, AdPayload$AdSizeInfo$$serializer.INSTANCE, adUnit.adSizeInfo);
            }
            if (dVar.q(aVar, 27) || adUnit.webViewSettings != null) {
                dVar.C(aVar, 27, AdPayload$WebViewSettings$$serializer.INSTANCE, adUnit.webViewSettings);
            }
            if (dVar.q(aVar, 28) || !p.e(adUnit.usePreloading, Boolean.FALSE)) {
                dVar.C(aVar, 28, bl.i.f5416a, adUnit.usePreloading);
            }
            if (dVar.q(aVar, 29) || adUnit.partialDownloadEnabled != null) {
                dVar.C(aVar, 29, bl.i.f5416a, adUnit.partialDownloadEnabled);
            }
        }

        public final Boolean getAdLoadOptimizationEnabled() {
            return this.adLoadOptimizationEnabled;
        }

        public final String getAdMarketId() {
            return this.adMarketId;
        }

        public final AdSizeInfo getAdSizeInfo() {
            return this.adSizeInfo;
        }

        public final String getAdSource() {
            return this.adSource;
        }

        public final String getAdType() {
            return this.adType;
        }

        public final String getAdvAppId() {
            return this.advAppId;
        }

        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        public final String getCreativeId() {
            return this.creativeId;
        }

        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final Integer getExpiry() {
            return this.expiry;
        }

        public final Integer getExpiryDuration() {
            return this.expiryDuration;
        }

        public final String getId() {
            return this.id;
        }

        public final String getInfo() {
            return this.info;
        }

        public final List<String> getLoadAdUrls() {
            return this.loadAdUrls;
        }

        public final String getMediationName() {
            return this.mediationName;
        }

        public final List<String> getNotification() {
            return this.notification;
        }

        public final Boolean getPartialDownloadEnabled() {
            return this.partialDownloadEnabled;
        }

        public final Integer getShowClose() {
            return this.showClose;
        }

        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        public final Integer getSleep() {
            return this.sleep;
        }

        public final Boolean getTemplateHeartbeatCheck() {
            return this.templateHeartbeatCheck;
        }

        public final TemplateSettings getTemplateSettings() {
            return this.templateSettings;
        }

        public final String getTemplateType() {
            return this.templateType;
        }

        public final Map<String, List<String>> getTpat() {
            return this.tpat;
        }

        public final Boolean getUsePreloading() {
            return this.usePreloading;
        }

        public final ViewAbility getViewAbility() {
            return this.viewAbility;
        }

        public final String getVmURL() {
            return this.vmURL;
        }

        public final String getVmVersion() {
            return this.vmVersion;
        }

        public final WebViewSettings getWebViewSettings() {
            return this.webViewSettings;
        }

        public /* synthetic */ AdUnit(int i10, String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, Integer num3, Integer num4, @f(with = TpatSerializer.class) Map map, String str7, String str8, String str9, List list, List list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool4, Boolean bool5, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, AdPayload$AdUnit$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.id = null;
            } else {
                this.id = str;
            }
            if ((i10 & 2) == 0) {
                this.adType = null;
            } else {
                this.adType = str2;
            }
            if ((i10 & 4) == 0) {
                this.adSource = null;
            } else {
                this.adSource = str3;
            }
            if ((i10 & 8) == 0) {
                this.expiry = null;
            } else {
                this.expiry = num;
            }
            if ((i10 & 16) == 0) {
                this.expiryDuration = null;
            } else {
                this.expiryDuration = num2;
            }
            if ((i10 & 32) == 0) {
                this.deeplinkUrl = null;
            } else {
                this.deeplinkUrl = str4;
            }
            if ((i10 & 64) == 0) {
                this.clickCoordinatesEnabled = null;
            } else {
                this.clickCoordinatesEnabled = bool;
            }
            if ((i10 & 128) == 0) {
                this.adLoadOptimizationEnabled = null;
            } else {
                this.adLoadOptimizationEnabled = bool2;
            }
            if ((i10 & 256) == 0) {
                this.templateHeartbeatCheck = null;
            } else {
                this.templateHeartbeatCheck = bool3;
            }
            if ((i10 & 512) == 0) {
                this.mediationName = null;
            } else {
                this.mediationName = str5;
            }
            if ((i10 & 1024) == 0) {
                this.info = null;
            } else {
                this.info = str6;
            }
            if ((i10 & 2048) == 0) {
                this.sleep = null;
            } else {
                this.sleep = num3;
            }
            if ((i10 & 4096) == 0) {
                this.errorCode = null;
            } else {
                this.errorCode = num4;
            }
            if ((i10 & 8192) == 0) {
                this.tpat = null;
            } else {
                this.tpat = map;
            }
            if ((i10 & 16384) == 0) {
                this.vmURL = null;
            } else {
                this.vmURL = str7;
            }
            if ((32768 & i10) == 0) {
                this.vmVersion = null;
            } else {
                this.vmVersion = str8;
            }
            if ((65536 & i10) == 0) {
                this.adMarketId = null;
            } else {
                this.adMarketId = str9;
            }
            if ((131072 & i10) == 0) {
                this.notification = null;
            } else {
                this.notification = list;
            }
            if ((262144 & i10) == 0) {
                this.loadAdUrls = null;
            } else {
                this.loadAdUrls = list2;
            }
            if ((524288 & i10) == 0) {
                this.viewAbility = null;
            } else {
                this.viewAbility = viewAbility;
            }
            if ((1048576 & i10) == 0) {
                this.templateType = null;
            } else {
                this.templateType = str10;
            }
            if ((2097152 & i10) == 0) {
                this.templateSettings = null;
            } else {
                this.templateSettings = templateSettings;
            }
            if ((4194304 & i10) == 0) {
                this.creativeId = null;
            } else {
                this.creativeId = str11;
            }
            if ((8388608 & i10) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str12;
            }
            if ((16777216 & i10) == 0) {
                this.showClose = 0;
            } else {
                this.showClose = num5;
            }
            if ((33554432 & i10) == 0) {
                this.showCloseIncentivized = 0;
            } else {
                this.showCloseIncentivized = num6;
            }
            if ((67108864 & i10) == 0) {
                this.adSizeInfo = null;
            } else {
                this.adSizeInfo = adSizeInfo;
            }
            if ((134217728 & i10) == 0) {
                this.webViewSettings = null;
            } else {
                this.webViewSettings = webViewSettings;
            }
            this.usePreloading = (268435456 & i10) == 0 ? Boolean.FALSE : bool4;
            if ((i10 & 536870912) == 0) {
                this.partialDownloadEnabled = null;
            } else {
                this.partialDownloadEnabled = bool5;
            }
        }

        public /* synthetic */ AdUnit(String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, Integer num3, Integer num4, Map map, String str7, String str8, String str9, List list, List list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool4, Boolean bool5, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : bool, (i10 & 128) != 0 ? null : bool2, (i10 & 256) != 0 ? null : bool3, (i10 & 512) != 0 ? null : str5, (i10 & 1024) != 0 ? null : str6, (i10 & 2048) != 0 ? null : num3, (i10 & 4096) != 0 ? null : num4, (i10 & 8192) != 0 ? null : map, (i10 & 16384) != 0 ? null : str7, (i10 & 32768) != 0 ? null : str8, (i10 & 65536) != 0 ? null : str9, (i10 & 131072) != 0 ? null : list, (i10 & 262144) != 0 ? null : list2, (i10 & 524288) != 0 ? null : viewAbility, (i10 & 1048576) != 0 ? null : str10, (i10 & 2097152) != 0 ? null : templateSettings, (i10 & 4194304) != 0 ? null : str11, (i10 & 8388608) != 0 ? null : str12, (i10 & 16777216) != 0 ? 0 : num5, (i10 & 33554432) != 0 ? 0 : num6, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : adSizeInfo, (i10 & 134217728) != 0 ? null : webViewSettings, (i10 & 268435456) != 0 ? Boolean.FALSE : bool4, (i10 & 536870912) != 0 ? null : bool5);
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B+\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b!\u0010\"B;\b\u0017\u0012\u0006\u0010#\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\tHÖ\u0001J\t\u0010\u0015\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\"\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u000e¨\u0006)"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "component2", "", "component3", "()Ljava/lang/Integer;", "url", "extension", "downloadPercent", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "getExtension", "Ljava/lang/Integer;", "getDownloadPercent", "getDownloadPercent$annotations", "()V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class CacheableReplacement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer downloadPercent;
        private final String extension;
        private final String url;

        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final xk.b<CacheableReplacement> serializer() {
                return AdPayload$CacheableReplacement$$serializer.INSTANCE;
            }
        }

        public CacheableReplacement() {
            this((String) null, (String) null, (Integer) null, 7, (i) null);
        }

        public /* synthetic */ CacheableReplacement(int i10, String str, String str2, Integer num, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, AdPayload$CacheableReplacement$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.url = null;
            } else {
                this.url = str;
            }
            if ((i10 & 2) == 0) {
                this.extension = null;
            } else {
                this.extension = str2;
            }
            if ((i10 & 4) == 0) {
                this.downloadPercent = null;
            } else {
                this.downloadPercent = num;
            }
        }

        public static /* synthetic */ CacheableReplacement copy$default(CacheableReplacement cacheableReplacement, String str, String str2, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cacheableReplacement.url;
            }
            if ((i10 & 2) != 0) {
                str2 = cacheableReplacement.extension;
            }
            if ((i10 & 4) != 0) {
                num = cacheableReplacement.downloadPercent;
            }
            return cacheableReplacement.copy(str, str2, num);
        }

        public static /* synthetic */ void getDownloadPercent$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getExtension() {
            return this.extension;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getDownloadPercent() {
            return this.downloadPercent;
        }

        public final CacheableReplacement copy(String url, String extension, Integer downloadPercent) {
            return new CacheableReplacement(url, extension, downloadPercent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheableReplacement)) {
                return false;
            }
            CacheableReplacement cacheableReplacement = (CacheableReplacement) other;
            return p.e(this.url, cacheableReplacement.url) && p.e(this.extension, cacheableReplacement.extension) && p.e(this.downloadPercent, cacheableReplacement.downloadPercent);
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.extension;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.downloadPercent;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "CacheableReplacement(url=" + this.url + ", extension=" + this.extension + ", downloadPercent=" + this.downloadPercent + ')';
        }

        public CacheableReplacement(String str, String str2, Integer num) {
            this.url = str;
            this.extension = str2;
            this.downloadPercent = num;
        }

        public static final void write$Self(CacheableReplacement cacheableReplacement, d dVar, a aVar) {
            p.j(cacheableReplacement, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            if (dVar.q(aVar, 0) || cacheableReplacement.url != null) {
                dVar.C(aVar, 0, d2.f5397a, cacheableReplacement.url);
            }
            if (dVar.q(aVar, 1) || cacheableReplacement.extension != null) {
                dVar.C(aVar, 1, d2.f5397a, cacheableReplacement.extension);
            }
            if (dVar.q(aVar, 2) || cacheableReplacement.downloadPercent != null) {
                dVar.C(aVar, 2, p0.f5452a, cacheableReplacement.downloadPercent);
            }
        }

        public final Integer getDownloadPercent() {
            return this.downloadPercent;
        }

        public final String getExtension() {
            return this.extension;
        }

        public final String getUrl() {
            return this.url;
        }

        public /* synthetic */ CacheableReplacement(String str, String str2, Integer num, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num);
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/AdPayload;", "serializer", "", "FILE_SCHEME", "Ljava/lang/String;", AdPayload.INCENTIVIZED_BODY_TEXT, AdPayload.INCENTIVIZED_CLOSE_TEXT, AdPayload.INCENTIVIZED_CONTINUE_TEXT, AdPayload.INCENTIVIZED_TITLE_TEXT, "KEY_VM", "TAG", "TPAT_CLICK_COORDINATES_URLS", "UNKNOWN", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final xk.b<AdPayload> serializer() {
            return AdPayload$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001f\u0010 B3\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0011\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "component2", "placementReferenceId", "adMarkup", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getPlacementReferenceId", "()Ljava/lang/String;", "getPlacementReferenceId$annotations", "()V", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "getAdMarkup", "()Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "getAdMarkup$annotations", "<init>", "(Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$AdUnit;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$AdUnit;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class PlacementAdUnit {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AdUnit adMarkup;
        private final String placementReferenceId;

        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final xk.b<PlacementAdUnit> serializer() {
                return AdPayload$PlacementAdUnit$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PlacementAdUnit() {
            this((String) null, (AdUnit) (0 == true ? 1 : 0), 3, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ PlacementAdUnit(int i10, String str, AdUnit adUnit, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, AdPayload$PlacementAdUnit$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str;
            }
            if ((i10 & 2) == 0) {
                this.adMarkup = null;
            } else {
                this.adMarkup = adUnit;
            }
        }

        public static /* synthetic */ PlacementAdUnit copy$default(PlacementAdUnit placementAdUnit, String str, AdUnit adUnit, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = placementAdUnit.placementReferenceId;
            }
            if ((i10 & 2) != 0) {
                adUnit = placementAdUnit.adMarkup;
            }
            return placementAdUnit.copy(str, adUnit);
        }

        public static /* synthetic */ void getAdMarkup$annotations() {
        }

        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AdUnit getAdMarkup() {
            return this.adMarkup;
        }

        public final PlacementAdUnit copy(String placementReferenceId, AdUnit adMarkup) {
            return new PlacementAdUnit(placementReferenceId, adMarkup);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlacementAdUnit)) {
                return false;
            }
            PlacementAdUnit placementAdUnit = (PlacementAdUnit) other;
            return p.e(this.placementReferenceId, placementAdUnit.placementReferenceId) && p.e(this.adMarkup, placementAdUnit.adMarkup);
        }

        public int hashCode() {
            String str = this.placementReferenceId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AdUnit adUnit = this.adMarkup;
            return iHashCode + (adUnit != null ? adUnit.hashCode() : 0);
        }

        public String toString() {
            return "PlacementAdUnit(placementReferenceId=" + this.placementReferenceId + ", adMarkup=" + this.adMarkup + ')';
        }

        public PlacementAdUnit(String str, AdUnit adUnit) {
            this.placementReferenceId = str;
            this.adMarkup = adUnit;
        }

        public static final void write$Self(PlacementAdUnit placementAdUnit, d dVar, a aVar) {
            p.j(placementAdUnit, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            if (dVar.q(aVar, 0) || placementAdUnit.placementReferenceId != null) {
                dVar.C(aVar, 0, d2.f5397a, placementAdUnit.placementReferenceId);
            }
            if (dVar.q(aVar, 1) || placementAdUnit.adMarkup != null) {
                dVar.C(aVar, 1, AdPayload$AdUnit$$serializer.INSTANCE, placementAdUnit.adMarkup);
            }
        }

        public final AdUnit getAdMarkup() {
            return this.adMarkup;
        }

        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public /* synthetic */ PlacementAdUnit(String str, AdUnit adUnit, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : adUnit);
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B7\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\u0004\b\u001e\u0010\u001fBK\b\u0017\u0012\u0006\u0010 \u001a\u00020\u0012\u0012\u0016\b\u0001\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0016\b\u0001\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0017\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\nHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R.\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R.\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0017\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\u0019¨\u0006&"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "", "component1", "Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "component2", "normalReplacements", "cacheableReplacements", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/Map;", "getNormalReplacements", "()Ljava/util/Map;", "getNormalReplacements$annotations", "()V", "getCacheableReplacements", "getCacheableReplacements$annotations", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class TemplateSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Map<String, CacheableReplacement> cacheableReplacements;
        private final Map<String, String> normalReplacements;

        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final xk.b<TemplateSettings> serializer() {
                return AdPayload$TemplateSettings$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TemplateSettings() {
            this((Map) null, (Map) (0 == true ? 1 : 0), 3, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ TemplateSettings(int i10, Map map, Map map2, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, AdPayload$TemplateSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.normalReplacements = null;
            } else {
                this.normalReplacements = map;
            }
            if ((i10 & 2) == 0) {
                this.cacheableReplacements = null;
            } else {
                this.cacheableReplacements = map2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TemplateSettings copy$default(TemplateSettings templateSettings, Map map, Map map2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = templateSettings.normalReplacements;
            }
            if ((i10 & 2) != 0) {
                map2 = templateSettings.cacheableReplacements;
            }
            return templateSettings.copy(map, map2);
        }

        public static /* synthetic */ void getCacheableReplacements$annotations() {
        }

        public static /* synthetic */ void getNormalReplacements$annotations() {
        }

        public final Map<String, String> component1() {
            return this.normalReplacements;
        }

        public final Map<String, CacheableReplacement> component2() {
            return this.cacheableReplacements;
        }

        public final TemplateSettings copy(Map<String, String> normalReplacements, Map<String, CacheableReplacement> cacheableReplacements) {
            return new TemplateSettings(normalReplacements, cacheableReplacements);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TemplateSettings)) {
                return false;
            }
            TemplateSettings templateSettings = (TemplateSettings) other;
            return p.e(this.normalReplacements, templateSettings.normalReplacements) && p.e(this.cacheableReplacements, templateSettings.cacheableReplacements);
        }

        public int hashCode() {
            Map<String, String> map = this.normalReplacements;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, CacheableReplacement> map2 = this.cacheableReplacements;
            return iHashCode + (map2 != null ? map2.hashCode() : 0);
        }

        public String toString() {
            return "TemplateSettings(normalReplacements=" + this.normalReplacements + ", cacheableReplacements=" + this.cacheableReplacements + ')';
        }

        public TemplateSettings(Map<String, String> map, Map<String, CacheableReplacement> map2) {
            this.normalReplacements = map;
            this.cacheableReplacements = map2;
        }

        public static final void write$Self(TemplateSettings templateSettings, d dVar, a aVar) {
            p.j(templateSettings, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            if (dVar.q(aVar, 0) || templateSettings.normalReplacements != null) {
                d2 d2Var = d2.f5397a;
                dVar.C(aVar, 0, new u0(d2Var, d2Var), templateSettings.normalReplacements);
            }
            if (dVar.q(aVar, 1) || templateSettings.cacheableReplacements != null) {
                dVar.C(aVar, 1, new u0(d2.f5397a, AdPayload$CacheableReplacement$$serializer.INSTANCE), templateSettings.cacheableReplacements);
            }
        }

        public final Map<String, CacheableReplacement> getCacheableReplacements() {
            return this.cacheableReplacements;
        }

        public final Map<String, String> getNormalReplacements() {
            return this.normalReplacements;
        }

        public /* synthetic */ TemplateSettings(Map map, Map map2, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : map, (i10 & 2) != 0 ? null : map2);
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¨\u0006\n"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$TpatSerializer;", "Lcl/w;", "", "", "", "Lkotlinx/serialization/json/b;", "element", "transformDeserialize", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class TpatSerializer extends w<Map<String, ? extends List<? extends String>>> {
        public static final TpatSerializer INSTANCE = new TpatSerializer();

        /* JADX WARN: Illegal instructions before constructor call */
        private TpatSerializer() {
            ck.w wVar = ck.w.f6066a;
            super(yk.a.k(yk.a.C(wVar), yk.a.h(yk.a.C(wVar))));
        }

        @Override // cl.w
        public kotlinx.serialization.json.b transformDeserialize(kotlinx.serialization.json.b element) {
            p.j(element, "element");
            JsonObject jsonObjectK = cl.i.k(element);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, kotlinx.serialization.json.b> entry : jsonObjectK.entrySet()) {
                if (!p.e(entry.getKey(), "moat")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new JsonObject(linkedHashMap);
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\u0013\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0017\u0010\u0018B%\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "component1", AdMeasurerFactory.OM, "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "getOm", "()Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "<init>", "(Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class ViewAbility {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ViewAbilityInfo om;

        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewAbility$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final xk.b<ViewAbility> serializer() {
                return AdPayload$ViewAbility$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewAbility() {
            this((ViewAbilityInfo) null, 1, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ ViewAbility(int i10, ViewAbilityInfo viewAbilityInfo, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, AdPayload$ViewAbility$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.om = null;
            } else {
                this.om = viewAbilityInfo;
            }
        }

        public static /* synthetic */ ViewAbility copy$default(ViewAbility viewAbility, ViewAbilityInfo viewAbilityInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                viewAbilityInfo = viewAbility.om;
            }
            return viewAbility.copy(viewAbilityInfo);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewAbilityInfo getOm() {
            return this.om;
        }

        public final ViewAbility copy(ViewAbilityInfo om2) {
            return new ViewAbility(om2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewAbility) && p.e(this.om, ((ViewAbility) other).om);
        }

        public int hashCode() {
            ViewAbilityInfo viewAbilityInfo = this.om;
            if (viewAbilityInfo == null) {
                return 0;
            }
            return viewAbilityInfo.hashCode();
        }

        public String toString() {
            return "ViewAbility(om=" + this.om + ')';
        }

        public ViewAbility(ViewAbilityInfo viewAbilityInfo) {
            this.om = viewAbilityInfo;
        }

        public static final void write$Self(ViewAbility viewAbility, d dVar, a aVar) {
            p.j(viewAbility, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            boolean z10 = true;
            if (!dVar.q(aVar, 0) && viewAbility.om == null) {
                z10 = false;
            }
            if (z10) {
                dVar.C(aVar, 0, AdPayload$ViewAbilityInfo$$serializer.INSTANCE, viewAbility.om);
            }
        }

        public final ViewAbilityInfo getOm() {
            return this.om;
        }

        public /* synthetic */ ViewAbility(ViewAbilityInfo viewAbilityInfo, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : viewAbilityInfo);
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001e\u0010\u001fB3\b\u0017\u0012\u0006\u0010 \u001a\u00020\u0013\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000e\u0010\u000bR\"\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "()Ljava/lang/Boolean;", "", "component2", "isEnabled", "extraVast", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "toString", "", "hashCode", "other", "equals", "Ljava/lang/Boolean;", "isEnabled$annotations", "()V", "Ljava/lang/String;", "getExtraVast", "()Ljava/lang/String;", "getExtraVast$annotations", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class ViewAbilityInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String extraVast;
        private final Boolean isEnabled;

        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final xk.b<ViewAbilityInfo> serializer() {
                return AdPayload$ViewAbilityInfo$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewAbilityInfo() {
            this((Boolean) null, (String) (0 == true ? 1 : 0), 3, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ ViewAbilityInfo(int i10, Boolean bool, String str, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, AdPayload$ViewAbilityInfo$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.isEnabled = null;
            } else {
                this.isEnabled = bool;
            }
            if ((i10 & 2) == 0) {
                this.extraVast = null;
            } else {
                this.extraVast = str;
            }
        }

        public static /* synthetic */ ViewAbilityInfo copy$default(ViewAbilityInfo viewAbilityInfo, Boolean bool, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = viewAbilityInfo.isEnabled;
            }
            if ((i10 & 2) != 0) {
                str = viewAbilityInfo.extraVast;
            }
            return viewAbilityInfo.copy(bool, str);
        }

        public static /* synthetic */ void getExtraVast$annotations() {
        }

        public static /* synthetic */ void isEnabled$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getExtraVast() {
            return this.extraVast;
        }

        public final ViewAbilityInfo copy(Boolean isEnabled, String extraVast) {
            return new ViewAbilityInfo(isEnabled, extraVast);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewAbilityInfo)) {
                return false;
            }
            ViewAbilityInfo viewAbilityInfo = (ViewAbilityInfo) other;
            return p.e(this.isEnabled, viewAbilityInfo.isEnabled) && p.e(this.extraVast, viewAbilityInfo.extraVast);
        }

        public int hashCode() {
            Boolean bool = this.isEnabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.extraVast;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "ViewAbilityInfo(isEnabled=" + this.isEnabled + ", extraVast=" + this.extraVast + ')';
        }

        public ViewAbilityInfo(Boolean bool, String str) {
            this.isEnabled = bool;
            this.extraVast = str;
        }

        public static final void write$Self(ViewAbilityInfo viewAbilityInfo, d dVar, a aVar) {
            p.j(viewAbilityInfo, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            if (dVar.q(aVar, 0) || viewAbilityInfo.isEnabled != null) {
                dVar.C(aVar, 0, bl.i.f5416a, viewAbilityInfo.isEnabled);
            }
            if (dVar.q(aVar, 1) || viewAbilityInfo.extraVast != null) {
                dVar.C(aVar, 1, d2.f5397a, viewAbilityInfo.extraVast);
            }
        }

        public final String getExtraVast() {
            return this.extraVast;
        }

        public final Boolean isEnabled() {
            return this.isEnabled;
        }

        public /* synthetic */ ViewAbilityInfo(Boolean bool, String str, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001d\u0010\u001eB3\b\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0013\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u000bR\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006%"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "()Ljava/lang/Boolean;", "component2", "allowFileAccessFromFileUrls", "allowUniversalAccessFromFileUrls", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "", "toString", "", "hashCode", "other", "equals", "Ljava/lang/Boolean;", "getAllowFileAccessFromFileUrls", "getAllowFileAccessFromFileUrls$annotations", "()V", "getAllowUniversalAccessFromFileUrls", "getAllowUniversalAccessFromFileUrls$annotations", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class WebViewSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean allowFileAccessFromFileUrls;
        private final Boolean allowUniversalAccessFromFileUrls;

        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final xk.b<WebViewSettings> serializer() {
                return AdPayload$WebViewSettings$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WebViewSettings() {
            this((Boolean) null, (Boolean) (0 == true ? 1 : 0), 3, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ WebViewSettings(int i10, Boolean bool, Boolean bool2, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, AdPayload$WebViewSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.allowFileAccessFromFileUrls = null;
            } else {
                this.allowFileAccessFromFileUrls = bool;
            }
            if ((i10 & 2) == 0) {
                this.allowUniversalAccessFromFileUrls = null;
            } else {
                this.allowUniversalAccessFromFileUrls = bool2;
            }
        }

        public static /* synthetic */ WebViewSettings copy$default(WebViewSettings webViewSettings, Boolean bool, Boolean bool2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = webViewSettings.allowFileAccessFromFileUrls;
            }
            if ((i10 & 2) != 0) {
                bool2 = webViewSettings.allowUniversalAccessFromFileUrls;
            }
            return webViewSettings.copy(bool, bool2);
        }

        public static /* synthetic */ void getAllowFileAccessFromFileUrls$annotations() {
        }

        public static /* synthetic */ void getAllowUniversalAccessFromFileUrls$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getAllowFileAccessFromFileUrls() {
            return this.allowFileAccessFromFileUrls;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getAllowUniversalAccessFromFileUrls() {
            return this.allowUniversalAccessFromFileUrls;
        }

        public final WebViewSettings copy(Boolean allowFileAccessFromFileUrls, Boolean allowUniversalAccessFromFileUrls) {
            return new WebViewSettings(allowFileAccessFromFileUrls, allowUniversalAccessFromFileUrls);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebViewSettings)) {
                return false;
            }
            WebViewSettings webViewSettings = (WebViewSettings) other;
            return p.e(this.allowFileAccessFromFileUrls, webViewSettings.allowFileAccessFromFileUrls) && p.e(this.allowUniversalAccessFromFileUrls, webViewSettings.allowUniversalAccessFromFileUrls);
        }

        public int hashCode() {
            Boolean bool = this.allowFileAccessFromFileUrls;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.allowUniversalAccessFromFileUrls;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            return "WebViewSettings(allowFileAccessFromFileUrls=" + this.allowFileAccessFromFileUrls + ", allowUniversalAccessFromFileUrls=" + this.allowUniversalAccessFromFileUrls + ')';
        }

        public WebViewSettings(Boolean bool, Boolean bool2) {
            this.allowFileAccessFromFileUrls = bool;
            this.allowUniversalAccessFromFileUrls = bool2;
        }

        public static final void write$Self(WebViewSettings webViewSettings, d dVar, a aVar) {
            p.j(webViewSettings, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            if (dVar.q(aVar, 0) || webViewSettings.allowFileAccessFromFileUrls != null) {
                dVar.C(aVar, 0, bl.i.f5416a, webViewSettings.allowFileAccessFromFileUrls);
            }
            if (dVar.q(aVar, 1) || webViewSettings.allowUniversalAccessFromFileUrls != null) {
                dVar.C(aVar, 1, bl.i.f5416a, webViewSettings.allowUniversalAccessFromFileUrls);
            }
        }

        public final Boolean getAllowFileAccessFromFileUrls() {
            return this.allowFileAccessFromFileUrls;
        }

        public final Boolean getAllowUniversalAccessFromFileUrls() {
            return this.allowUniversalAccessFromFileUrls;
        }

        public /* synthetic */ WebViewSettings(Boolean bool, Boolean bool2, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdPayload() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AdPayload(int i10, List list, ConfigPayload configPayload, Long l10, ConcurrentHashMap concurrentHashMap, @VisibleForTesting Map map, boolean z10, String str, y1 y1Var) {
        if ((i10 & 0) != 0) {
            o1.a(i10, 0, AdPayload$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.ads = null;
        } else {
            this.ads = list;
        }
        if ((i10 & 2) == 0) {
            this.config = null;
        } else {
            this.config = configPayload;
        }
        if ((i10 & 4) == 0) {
            this.expiryWindowStart = null;
        } else {
            this.expiryWindowStart = l10;
        }
        if ((i10 & 8) == 0) {
            this.mraidFiles = new ConcurrentHashMap<>();
        } else {
            this.mraidFiles = concurrentHashMap;
        }
        if ((i10 & 16) == 0) {
            this.incentivizedTextSettings = new HashMap();
        } else {
            this.incentivizedTextSettings = map;
        }
        if ((i10 & 32) == 0) {
            this.assetsFullyDownloaded = false;
        } else {
            this.assetsFullyDownloaded = z10;
        }
        this.adConfig = null;
        this.logEntry = null;
        if ((i10 & 64) == 0) {
            this.indexFilePath = null;
        } else {
            this.indexFilePath = str;
        }
        this.partialDownloadAssets = new LinkedHashMap();
    }

    public static /* synthetic */ void getAdConfig$annotations() {
    }

    private static /* synthetic */ void getAds$annotations() {
    }

    private static /* synthetic */ void getConfig$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getIncentivizedTextSettings$annotations() {
    }

    public static /* synthetic */ void getLogEntry$vungle_ads_release$annotations() {
    }

    private static /* synthetic */ void getMraidFiles$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPartialDownloadAssets$vungle_ads_release$annotations() {
    }

    private final String valueOrEmpty(String value) {
        return value == null ? "" : value;
    }

    public final void setAssetFullyDownloaded() {
        this.assetsFullyDownloaded = true;
    }

    public final synchronized void updateAdAssetPath(String str, File file) {
        p.j(str, "adIdentifier");
        p.j(file, "localFile");
        if (file.exists()) {
            this.mraidFiles.put(str, FILE_SCHEME + file.getAbsolutePath());
        }
    }

    private final PlacementAdUnit getAd() {
        List<PlacementAdUnit> list = this.ads;
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        return list.get(0);
    }

    public static /* synthetic */ List getTpatUrls$default(AdPayload adPayload, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        return adPayload.getTpatUrls(str, str2, str3);
    }

    public static final void write$Self(AdPayload adPayload, d dVar, a aVar) {
        p.j(adPayload, "self");
        p.j(dVar, "output");
        p.j(aVar, "serialDesc");
        if (dVar.q(aVar, 0) || adPayload.ads != null) {
            dVar.C(aVar, 0, new bl.f(AdPayload$PlacementAdUnit$$serializer.INSTANCE), adPayload.ads);
        }
        if (dVar.q(aVar, 1) || adPayload.config != null) {
            dVar.C(aVar, 1, ConfigPayload$$serializer.INSTANCE, adPayload.config);
        }
        if (dVar.q(aVar, 2) || adPayload.expiryWindowStart != null) {
            dVar.C(aVar, 2, a1.f5375a, adPayload.expiryWindowStart);
        }
        if (dVar.q(aVar, 3) || !p.e(adPayload.mraidFiles, new ConcurrentHashMap())) {
            c cVarB = s.b(ConcurrentHashMap.class);
            d2 d2Var = d2.f5397a;
            dVar.m(aVar, 3, new ContextualSerializer(cVarB, null, new xk.b[]{d2Var, d2Var}), adPayload.mraidFiles);
        }
        if (dVar.q(aVar, 4) || !p.e(adPayload.incentivizedTextSettings, new HashMap())) {
            d2 d2Var2 = d2.f5397a;
            dVar.m(aVar, 4, new u0(d2Var2, d2Var2), adPayload.incentivizedTextSettings);
        }
        if (dVar.q(aVar, 5) || adPayload.assetsFullyDownloaded) {
            dVar.o(aVar, 5, adPayload.assetsFullyDownloaded);
        }
        if (dVar.q(aVar, 6) || adPayload.indexFilePath != null) {
            dVar.C(aVar, 6, d2.f5397a, adPayload.indexFilePath);
        }
    }

    /* JADX INFO: renamed from: config, reason: from getter */
    public final ConfigPayload getConfig() {
        return this.config;
    }

    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    public final boolean getAssetsFullyDownloaded() {
        return this.assetsFullyDownloaded;
    }

    public final List<AdAsset> getDownloadableAssets(File dir) {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        p.j(dir, "dir");
        ArrayList arrayList = new ArrayList();
        Pair<String, File> indexHtmlFile = getIndexHtmlFile(dir);
        if (indexHtmlFile != null) {
            String strComponent1 = indexHtmlFile.component1();
            File fileComponent2 = indexHtmlFile.component2();
            this.indexFilePath = fileComponent2.getAbsolutePath();
            if (!fileComponent2.exists()) {
                Logger.INSTANCE.d(TAG, "No cacheable index file found, creating new one: " + fileComponent2);
                String absolutePath = fileComponent2.getAbsolutePath();
                p.i(absolutePath, "indexFile.absolutePath");
                arrayList.add(new AdAsset(KEY_VM, strComponent1, absolutePath, true, null, 16, null));
            }
        }
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (templateSettings = adMarkup.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String key = entry.getKey();
                CacheableReplacement value = entry.getValue();
                String url = value.getUrl();
                if (url != null) {
                    FileUtility fileUtility = FileUtility.INSTANCE;
                    if (fileUtility.isValidUrl(url)) {
                        String absolutePath2 = new File(dir, fileUtility.guessFileName(url, value.getExtension())).getAbsolutePath();
                        Pair<Boolean, Integer> pairComputeAssetRequirement = computeAssetRequirement(value.getDownloadPercent());
                        boolean zBooleanValue = pairComputeAssetRequirement.component1().booleanValue();
                        Integer numComponent2 = pairComputeAssetRequirement.component2();
                        p.i(absolutePath2, Y5.c.f27929c);
                        AdAsset adAsset = new AdAsset(key, url, absolutePath2, zBooleanValue, numComponent2);
                        arrayList.add(adAsset);
                        if (zBooleanValue && numComponent2 != null) {
                            this.partialDownloadAssets.put(url, adAsset);
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            nj.w.B(arrayList, new Comparator() { // from class: com.vungle.ads.internal.model.AdPayload$getDownloadableAssets$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return qj.b.d(Boolean.valueOf(((AdAsset) t11).getIsRequired()), Boolean.valueOf(((AdAsset) t10).getIsRequired()));
                }
            });
        }
        return arrayList;
    }

    public final Map<String, String> getIncentivizedTextSettings() {
        return this.incentivizedTextSettings;
    }

    public final String getIndexFilePath() {
        return this.indexFilePath;
    }

    public final AdAsset getLocalPartialDownloadAssets(String remoteUrl) {
        p.j(remoteUrl, "remoteUrl");
        return this.partialDownloadAssets.get(remoteUrl);
    }

    /* JADX INFO: renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final LogEntry getLogEntry() {
        return this.logEntry;
    }

    public final Map<String, AdAsset> getPartialDownloadAssets$vungle_ads_release() {
        return this.partialDownloadAssets;
    }

    public final int getShowCloseDelay(Boolean incentivized) {
        Integer showClose;
        Integer showCloseIncentivized;
        if (p.e(incentivized, Boolean.TRUE)) {
            AdUnit adMarkup = getAdMarkup();
            if (adMarkup == null || (showCloseIncentivized = adMarkup.getShowCloseIncentivized()) == null) {
                return 0;
            }
            return showCloseIncentivized.intValue() * 1000;
        }
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (showClose = adMarkup2.getShowClose()) == null) {
            return 0;
        }
        return showClose.intValue() * 1000;
    }

    public final List<String> getTpatUrls(String event, String value, String secondValue) {
        ArrayList arrayList;
        Map<String, List<String>> tpat;
        Map<String, List<String>> tpat2;
        p.j(event, "event");
        AdUnit adMarkup = getAdMarkup();
        if ((adMarkup == null || (tpat2 = adMarkup.getTpat()) == null || tpat2.containsKey(event)) ? false : true) {
            new TpatError(Sdk.SDKError.Reason.INVALID_TPAT_KEY, "Arbitrary tpat key: " + event).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        AdUnit adMarkup2 = getAdMarkup();
        List<String> list = (adMarkup2 == null || (tpat = adMarkup2.getTpat()) == null) ? null : tpat.get(event);
        if (list == null || list.isEmpty()) {
            new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key: " + event).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        switch (event) {
            case "checkpoint.0":
                arrayList = new ArrayList(t.v(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(complexReplace(complexReplace(complexReplace((String) it.next(), Constants.REMOTE_PLAY_KEY, String.valueOf(!this.assetsFullyDownloaded)), Constants.NETWORK_OPERATOR_KEY, value), Constants.DEVICE_VOLUME_KEY, secondValue));
                }
                break;
            case "video.length":
                arrayList = new ArrayList(t.v(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(complexReplace((String) it2.next(), Constants.VIDEO_LENGTH_KEY, value));
                }
                break;
            case "ad.loadDuration":
                arrayList = new ArrayList(t.v(list, 10));
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(complexReplace((String) it3.next(), Constants.AD_LOAD_DURATION_KEY, value));
                }
                break;
            case "ad.close":
                arrayList = new ArrayList(t.v(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList.add(complexReplace(complexReplace((String) it4.next(), Constants.AD_DURATION_KEY, value), Constants.DEVICE_VOLUME_KEY, secondValue));
                }
                break;
            case "deeplink.click":
                arrayList = new ArrayList(t.v(list, 10));
                Iterator<T> it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList.add(complexReplace((String) it5.next(), Constants.DEEPLINK_SUCCESS_KEY, value));
                }
                break;
            default:
                return list;
        }
        return arrayList;
    }

    public final boolean isCriticalAsset(String failingUrl) {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        p.j(failingUrl, "failingUrl");
        if (!isNativeTemplateType()) {
            AdUnit adMarkup = getAdMarkup();
            if (p.e(adMarkup != null ? adMarkup.getVmURL() : null, failingUrl)) {
                return true;
            }
        }
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (templateSettings = adMarkup2.getTemplateSettings()) == null || (cacheableReplacements = templateSettings.getCacheableReplacements()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
            if (p.e(entry.getValue().getUrl(), failingUrl)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public final void setAdConfig(AdConfig adConfig) {
        this.adConfig = adConfig;
    }

    public final void setAssetsFullyDownloaded(boolean z10) {
        this.assetsFullyDownloaded = z10;
    }

    public final void setIncentivizedTextSettings(Map<String, String> map) {
        p.j(map, "<set-?>");
        this.incentivizedTextSettings = map;
    }

    public final void setLogEntry$vungle_ads_release(LogEntry logEntry) {
        this.logEntry = logEntry;
    }

    private final String complexReplace(String str, String str2, String str3) {
        String strQuote = Pattern.quote(str2);
        p.i(strQuote, "quote(oldValue)");
        return new Regex(strQuote).replace(str, valueOrEmpty(str3));
    }

    private final Pair<Boolean, Integer> computeAssetRequirement(Integer percentage) {
        if (!isNativeTemplateType() && adLoadOptimizationEnabled()) {
            if (!isPartialDownloadEnabled()) {
                return h.a(Boolean.FALSE, null);
            }
            if (percentage != null && percentage.intValue() > 0) {
                return h.a(Boolean.TRUE, percentage);
            }
            return h.a(Boolean.FALSE, null);
        }
        return h.a(Boolean.TRUE, null);
    }

    private final AdUnit getAdMarkup() {
        PlacementAdUnit ad2 = getAd();
        if (ad2 != null) {
            return ad2.getAdMarkup();
        }
        return null;
    }

    private final Pair<String, File> getIndexHtmlFile(File dir) {
        AdUnit adMarkup;
        String vmURL;
        Object objM3458constructorimpl;
        File parentFile;
        String strP0;
        if (isNativeTemplateType() || (adMarkup = getAdMarkup()) == null || (vmURL = adMarkup.getVmURL()) == null) {
            return null;
        }
        if (!FileUtility.INSTANCE.isValidUrl(vmURL)) {
            vmURL = null;
        }
        if (vmURL == null) {
            return null;
        }
        try {
            Result.a aVar = Result.Companion;
            String path = new URI(vmURL).getPath();
            p.i(path, "URI(url).path");
            List listM0 = a0.M0(a0.l1(path, '/'), new char[]{'/'}, false, 0, 6, null);
            if (listM0.size() >= 2) {
                strP0 = b0.p0(b0.J0(listM0, 2), "_", null, null, 0, null, null, 62, null);
            } else {
                strP0 = "index.html";
            }
            objM3458constructorimpl = Result.m3458constructorimpl(strP0);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        String str = (String) objM3458constructorimpl;
        if (str == null || (parentFile = dir.getParentFile()) == null) {
            return null;
        }
        return new Pair<>(vmURL, new File(parentFile, str));
    }

    public final int adHeight() {
        AdSizeInfo adSizeInfo;
        Integer height;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (adSizeInfo = adMarkup.getAdSizeInfo()) != null && (height = adSizeInfo.getHeight()) != null) {
            return height.intValue();
        }
        return 0;
    }

    public final boolean adLoadOptimizationEnabled() {
        Boolean adLoadOptimizationEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (adLoadOptimizationEnabled = adMarkup.getAdLoadOptimizationEnabled()) != null) {
            return adLoadOptimizationEnabled.booleanValue();
        }
        return true;
    }

    public final AdUnit adUnit() {
        return getAdMarkup();
    }

    public final int adWidth() {
        AdSizeInfo adSizeInfo;
        Integer width;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (adSizeInfo = adMarkup.getAdSizeInfo()) != null && (width = adSizeInfo.getWidth()) != null) {
            return width.intValue();
        }
        return 0;
    }

    public final String advAppId() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdvAppId();
        }
        return null;
    }

    public final JsonObject createMRAIDArgs() {
        Map<String, String> mRAIDArgsInMap = getMRAIDArgsInMap();
        cl.s sVar = new cl.s();
        for (Map.Entry<String, String> entry : mRAIDArgsInMap.entrySet()) {
            cl.h.d(sVar, entry.getKey(), entry.getValue());
        }
        return sVar.a();
    }

    public final String eventId() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getId();
        }
        return null;
    }

    public final String getAdSource() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdSource();
        }
        return null;
    }

    public final String getCreativeId() {
        String creativeId;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (creativeId = adMarkup.getCreativeId()) == null) {
            return "unknown";
        }
        return creativeId;
    }

    public final Map<String, String> getMRAIDArgsInMap() {
        TemplateSettings templateSettings;
        TemplateSettings templateSettings2;
        Map<String, CacheableReplacement> cacheableReplacements;
        TemplateSettings templateSettings3;
        Map<String, String> normalReplacements;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            templateSettings = adMarkup.getTemplateSettings();
        } else {
            templateSettings = null;
        }
        if (templateSettings != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AdUnit adMarkup2 = getAdMarkup();
            if (adMarkup2 != null && (templateSettings3 = adMarkup2.getTemplateSettings()) != null && (normalReplacements = templateSettings3.getNormalReplacements()) != null) {
                linkedHashMap.putAll(normalReplacements);
            }
            AdUnit adMarkup3 = getAdMarkup();
            if (adMarkup3 != null && (templateSettings2 = adMarkup3.getTemplateSettings()) != null && (cacheableReplacements = templateSettings2.getCacheableReplacements()) != null) {
                for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                    String url = entry.getValue().getUrl();
                    if (url != null) {
                        linkedHashMap.put(entry.getKey(), url);
                    }
                }
            }
            if (!this.mraidFiles.isEmpty()) {
                linkedHashMap.putAll(this.mraidFiles);
            }
            if (!this.incentivizedTextSettings.isEmpty()) {
                linkedHashMap.putAll(this.incentivizedTextSettings);
            }
            return linkedHashMap;
        }
        throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!".toString());
    }

    public final String getMediationName() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getMediationName();
        }
        return null;
    }

    public final String getViewMasterVersion() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getVmVersion();
        }
        return null;
    }

    public final WebViewSettings getWebViewSettings() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getWebViewSettings();
        }
        return null;
    }

    public final List<String> getWinNotifications() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getNotification();
        }
        return null;
    }

    public final boolean hasExpired() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null) {
            return false;
        }
        Long l10 = this.expiryWindowStart;
        Long lValueOf = null;
        if (adMarkup.getExpiryDuration() != null && l10 != null) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - l10.longValue()) / 1000;
            Integer expiryDuration = adMarkup.getExpiryDuration();
            if (expiryDuration != null) {
                lValueOf = Long.valueOf(expiryDuration.intValue());
            }
            if (jCurrentTimeMillis <= lValueOf.longValue()) {
                return false;
            }
        } else {
            if (adMarkup.getExpiry() == null) {
                return false;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
            Integer expiry = adMarkup.getExpiry();
            if (expiry != null) {
                lValueOf = Long.valueOf(expiry.intValue());
            }
            if (jCurrentTimeMillis2 <= lValueOf.longValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean heartbeatEnabled() {
        Boolean templateHeartbeatCheck;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (templateHeartbeatCheck = adMarkup.getTemplateHeartbeatCheck()) != null) {
            return templateHeartbeatCheck.booleanValue();
        }
        return false;
    }

    public final boolean isClickCoordinatesTrackingEnabled() {
        Boolean clickCoordinatesEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (clickCoordinatesEnabled = adMarkup.getClickCoordinatesEnabled()) != null) {
            return clickCoordinatesEnabled.booleanValue();
        }
        return false;
    }

    public final boolean isNativeTemplateType() {
        return p.e(templateType(), "native");
    }

    public final boolean isPartialDownloadEnabled() {
        Boolean partialDownloadEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (partialDownloadEnabled = adMarkup.getPartialDownloadEnabled()) != null) {
            return partialDownloadEnabled.booleanValue();
        }
        return false;
    }

    public final boolean omEnabled() {
        ViewAbility viewAbility;
        ViewAbilityInfo om2;
        Boolean boolIsEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (viewAbility = adMarkup.getViewAbility()) != null && (om2 = viewAbility.getOm()) != null && (boolIsEnabled = om2.isEnabled()) != null) {
            return boolIsEnabled.booleanValue();
        }
        return false;
    }

    public final String placementId() {
        PlacementAdUnit ad2 = getAd();
        if (ad2 != null) {
            return ad2.getPlacementReferenceId();
        }
        return null;
    }

    public final void recordExpiryWindowStart() {
        this.expiryWindowStart = Long.valueOf(System.currentTimeMillis());
    }

    public final void setIncentivizedText(String str, String str2, String str3, String str4) {
        boolean z10;
        boolean z11;
        boolean z12;
        p.j(str, "title");
        p.j(str2, "body");
        p.j(str3, "keepWatching");
        p.j(str4, "close");
        boolean z13 = true;
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.incentivizedTextSettings.put(INCENTIVIZED_TITLE_TEXT, str);
        }
        if (str2.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.incentivizedTextSettings.put(INCENTIVIZED_BODY_TEXT, str2);
        }
        if (str3.length() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CONTINUE_TEXT, str3);
        }
        if (str4.length() <= 0) {
            z13 = false;
        }
        if (z13) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CLOSE_TEXT, str4);
        }
    }

    public final String templateType() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getTemplateType();
        }
        return null;
    }

    public final boolean usePreloading() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return p.e(adMarkup.getUsePreloading(), Boolean.TRUE);
        }
        return false;
    }

    public AdPayload(List<PlacementAdUnit> list, ConfigPayload configPayload) {
        this.ads = list;
        this.config = configPayload;
        this.mraidFiles = new ConcurrentHashMap<>();
        this.incentivizedTextSettings = new HashMap();
        this.partialDownloadAssets = new LinkedHashMap();
    }

    public /* synthetic */ AdPayload(List list, ConfigPayload configPayload, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : configPayload);
    }
}
