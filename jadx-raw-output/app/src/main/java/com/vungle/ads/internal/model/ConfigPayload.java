package com.vungle.ads.internal.model;

import al.d;
import bl.a1;
import bl.d2;
import bl.o1;
import bl.p0;
import bl.y1;
import ck.i;
import ck.p;
import com.inmobi.sdk.InMobiSdk;
import ik.k;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.a;
import nj.l0;
import xk.b;
import xk.f;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes5.dex */
@f
@Metadata(bv = {}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b_\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 \u008a\u00012\u00020\u0001:\u0014\u008b\u0001\u008c\u0001\u008d\u0001\u008a\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001Bó\u0001\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0018¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001B\u008a\u0002\b\u0017\u0012\u0007\u0010\u0086\u0001\u001a\u00020\u001c\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u00106\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010:\u001a\u0004\u0018\u00010$\u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u00010'\u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010=\u001a\u0004\u0018\u00010\u0018\u0012\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0089\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\b%\u0010&J\u000b\u0010(\u001a\u0004\u0018\u00010'HÆ\u0003J\u0012\u0010)\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b)\u0010\u001aJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b*\u0010\u001aJú\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010:\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b>\u0010?J\t\u0010@\u001a\u00020\u0016HÖ\u0001J\t\u0010A\u001a\u00020\u001cHÖ\u0001J\u0013\u0010C\u001a\u00020\u00182\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010+\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010D\u0012\u0004\bG\u0010H\u001a\u0004\bE\u0010FR\"\u0010,\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010I\u0012\u0004\bL\u0010H\u001a\u0004\bJ\u0010KR\"\u0010-\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010M\u0012\u0004\bP\u0010H\u001a\u0004\bN\u0010OR\"\u0010.\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010Q\u0012\u0004\bT\u0010H\u001a\u0004\bR\u0010SR(\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010U\u0012\u0004\bX\u0010H\u001a\u0004\bV\u0010WR\"\u00100\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010Y\u0012\u0004\b\\\u0010H\u001a\u0004\bZ\u0010[R\"\u00101\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010]\u0012\u0004\b`\u0010H\u001a\u0004\b^\u0010_R\"\u00102\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010a\u0012\u0004\bc\u0010H\u001a\u0004\bb\u0010\u001aR\"\u00103\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010a\u0012\u0004\bd\u0010H\u001a\u0004\b3\u0010\u001aR\"\u00104\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010e\u0012\u0004\bg\u0010H\u001a\u0004\bf\u0010\u001eR\"\u00105\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010a\u0012\u0004\bi\u0010H\u001a\u0004\bh\u0010\u001aR\"\u00106\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010e\u0012\u0004\bk\u0010H\u001a\u0004\bj\u0010\u001eR\"\u00107\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010a\u0012\u0004\bm\u0010H\u001a\u0004\bl\u0010\u001aR\"\u00108\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010a\u0012\u0004\bo\u0010H\u001a\u0004\bn\u0010\u001aR\"\u00109\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010a\u0012\u0004\bq\u0010H\u001a\u0004\bp\u0010\u001aR*\u0010:\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b:\u0010r\u0012\u0004\bv\u0010H\u001a\u0004\bs\u0010&\"\u0004\bt\u0010uR*\u0010;\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b;\u0010w\u0012\u0004\b|\u0010H\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R+\u0010<\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0019\n\u0004\b<\u0010a\u0012\u0005\b\u0080\u0001\u0010H\u001a\u0004\b}\u0010\u001a\"\u0004\b~\u0010\u007fR-\u0010=\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b=\u0010a\u0012\u0005\b\u0083\u0001\u0010H\u001a\u0005\b\u0081\u0001\u0010\u001a\"\u0005\b\u0082\u0001\u0010\u007f¨\u0006\u0094\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "component1", "Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "component2", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "component3", "Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "component4", "", "Lcom/vungle/ads/internal/model/Placement;", "component5", "Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "component6", "", "component7", "", "component8", "()Ljava/lang/Boolean;", "component9", "", "component10", "()Ljava/lang/Integer;", "component11", "component12", "component13", "component14", "component15", "", "component16", "()Ljava/lang/Long;", "Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "component17", "component18", "component19", "cleverCache", "configSettings", "endpoints", "logMetricsSettings", "placements", "userPrivacy", "configExtension", "disableAdId", "isReportIncentivizedEnabled", "sessionTimeout", "waitForConnectivityForTPAT", "signalSessionTimeout", "signalsDisabled", "fpdEnabled", "rtaDebugging", "configLastValidatedTimestamp", "autoRedirect", "retryPriorityTPATs", "enableOT", "copy", "(Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/ConfigPayload;", "toString", "hashCode", "other", "equals", "Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "getCleverCache", "()Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "getCleverCache$annotations", "()V", "Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "getConfigSettings", "()Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "getConfigSettings$annotations", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "getEndpoints", "()Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "getEndpoints$annotations", "Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "getLogMetricsSettings", "()Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "getLogMetricsSettings$annotations", "Ljava/util/List;", "getPlacements", "()Ljava/util/List;", "getPlacements$annotations", "Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "getUserPrivacy", "()Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "getUserPrivacy$annotations", "Ljava/lang/String;", "getConfigExtension", "()Ljava/lang/String;", "getConfigExtension$annotations", "Ljava/lang/Boolean;", "getDisableAdId", "getDisableAdId$annotations", "isReportIncentivizedEnabled$annotations", "Ljava/lang/Integer;", "getSessionTimeout", "getSessionTimeout$annotations", "getWaitForConnectivityForTPAT", "getWaitForConnectivityForTPAT$annotations", "getSignalSessionTimeout", "getSignalSessionTimeout$annotations", "getSignalsDisabled", "getSignalsDisabled$annotations", "getFpdEnabled", "getFpdEnabled$annotations", "getRtaDebugging", "getRtaDebugging$annotations", "Ljava/lang/Long;", "getConfigLastValidatedTimestamp", "setConfigLastValidatedTimestamp", "(Ljava/lang/Long;)V", "getConfigLastValidatedTimestamp$annotations", "Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "getAutoRedirect", "()Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "setAutoRedirect", "(Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;)V", "getAutoRedirect$annotations", "getRetryPriorityTPATs", "setRetryPriorityTPATs", "(Ljava/lang/Boolean;)V", "getRetryPriorityTPATs$annotations", "getEnableOT", "setEnableOT", "getEnableOT$annotations", "<init>", "(Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/ConfigPayload$CleverCache;Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;Ljava/lang/Boolean;Ljava/lang/Boolean;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "AutoRedirect", "CleverCache", "ConfigSettings", "Endpoints", "GDPRSettings", "IABSettings", "LogMetricsSettings", "UserPrivacy", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ConfigPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private AutoRedirect autoRedirect;
    private final CleverCache cleverCache;
    private final String configExtension;
    private Long configLastValidatedTimestamp;
    private final ConfigSettings configSettings;
    private final Boolean disableAdId;
    private Boolean enableOT;
    private final Endpoints endpoints;
    private final Boolean fpdEnabled;
    private final Boolean isReportIncentivizedEnabled;
    private final LogMetricsSettings logMetricsSettings;
    private final List<Placement> placements;
    private Boolean retryPriorityTPATs;
    private final Boolean rtaDebugging;
    private final Integer sessionTimeout;
    private final Integer signalSessionTimeout;
    private final Boolean signalsDisabled;
    private final UserPrivacy userPrivacy;
    private final Boolean waitForConnectivityForTPAT;

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b \u0010!B3\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0015\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u000bR\"\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001d\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\u000e¨\u0006("}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "()Ljava/lang/Boolean;", "", "component2", "()Ljava/lang/Long;", "allowAutoRedirect", "afterClickDuration", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "", "toString", "", "hashCode", "other", "equals", "Ljava/lang/Boolean;", "getAllowAutoRedirect", "getAllowAutoRedirect$annotations", "()V", "Ljava/lang/Long;", "getAfterClickDuration", "getAfterClickDuration$annotations", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Long;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class AutoRedirect {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Long afterClickDuration;
        private final Boolean allowAutoRedirect;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final b<AutoRedirect> serializer() {
                return ConfigPayload$AutoRedirect$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AutoRedirect() {
            this((Boolean) null, (Long) (0 == true ? 1 : 0), 3, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ AutoRedirect(int i10, Boolean bool, Long l10, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, ConfigPayload$AutoRedirect$$serializer.INSTANCE.getDescriptor());
            }
            this.allowAutoRedirect = (i10 & 1) == 0 ? Boolean.FALSE : bool;
            if ((i10 & 2) == 0) {
                this.afterClickDuration = Long.MAX_VALUE;
            } else {
                this.afterClickDuration = l10;
            }
        }

        public static /* synthetic */ AutoRedirect copy$default(AutoRedirect autoRedirect, Boolean bool, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = autoRedirect.allowAutoRedirect;
            }
            if ((i10 & 2) != 0) {
                l10 = autoRedirect.afterClickDuration;
            }
            return autoRedirect.copy(bool, l10);
        }

        public static /* synthetic */ void getAfterClickDuration$annotations() {
        }

        public static /* synthetic */ void getAllowAutoRedirect$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getAllowAutoRedirect() {
            return this.allowAutoRedirect;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getAfterClickDuration() {
            return this.afterClickDuration;
        }

        public final AutoRedirect copy(Boolean allowAutoRedirect, Long afterClickDuration) {
            return new AutoRedirect(allowAutoRedirect, afterClickDuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoRedirect)) {
                return false;
            }
            AutoRedirect autoRedirect = (AutoRedirect) other;
            return p.e(this.allowAutoRedirect, autoRedirect.allowAutoRedirect) && p.e(this.afterClickDuration, autoRedirect.afterClickDuration);
        }

        public int hashCode() {
            Boolean bool = this.allowAutoRedirect;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l10 = this.afterClickDuration;
            return iHashCode + (l10 != null ? l10.hashCode() : 0);
        }

        public String toString() {
            return "AutoRedirect(allowAutoRedirect=" + this.allowAutoRedirect + ", afterClickDuration=" + this.afterClickDuration + ')';
        }

        public static final void write$Self(AutoRedirect autoRedirect, d dVar, a aVar) {
            Long l10;
            p.j(autoRedirect, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            if (dVar.q(aVar, 0) || !p.e(autoRedirect.allowAutoRedirect, Boolean.FALSE)) {
                dVar.C(aVar, 0, bl.i.f5416a, autoRedirect.allowAutoRedirect);
            }
            if (dVar.q(aVar, 1) || (l10 = autoRedirect.afterClickDuration) == null || l10.longValue() != Long.MAX_VALUE) {
                dVar.C(aVar, 1, a1.f5375a, autoRedirect.afterClickDuration);
            }
        }

        public final Long getAfterClickDuration() {
            return this.afterClickDuration;
        }

        public final Boolean getAllowAutoRedirect() {
            return this.allowAutoRedirect;
        }

        public AutoRedirect(Boolean bool, Long l10) {
            this.allowAutoRedirect = bool;
            this.afterClickDuration = l10;
        }

        public /* synthetic */ AutoRedirect(Boolean bool, Long l10, int i10, i iVar) {
            this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? Long.MAX_VALUE : l10);
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b&\u0010'B?\b\u0017\u0012\u0006\u0010(\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0019\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u000bR\"\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u000eR\"\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010#\u0012\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010\u0011¨\u0006."}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "()Ljava/lang/Boolean;", "", "component2", "()Ljava/lang/Long;", "", "component3", "()Ljava/lang/Integer;", "enabled", "diskSize", "diskPercentage", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "", "toString", "hashCode", "other", "equals", "Ljava/lang/Boolean;", "getEnabled", "getEnabled$annotations", "()V", "Ljava/lang/Long;", "getDiskSize", "getDiskSize$annotations", "Ljava/lang/Integer;", "getDiskPercentage", "getDiskPercentage$annotations", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class CleverCache {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer diskPercentage;
        private final Long diskSize;
        private final Boolean enabled;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final b<CleverCache> serializer() {
                return ConfigPayload$CleverCache$$serializer.INSTANCE;
            }
        }

        public CleverCache() {
            this((Boolean) null, (Long) null, (Integer) null, 7, (i) null);
        }

        public /* synthetic */ CleverCache(int i10, Boolean bool, Long l10, Integer num, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, ConfigPayload$CleverCache$$serializer.INSTANCE.getDescriptor());
            }
            this.enabled = (i10 & 1) == 0 ? Boolean.FALSE : bool;
            if ((i10 & 2) == 0) {
                this.diskSize = 1000L;
            } else {
                this.diskSize = l10;
            }
            if ((i10 & 4) == 0) {
                this.diskPercentage = 3;
            } else {
                this.diskPercentage = num;
            }
        }

        public static /* synthetic */ CleverCache copy$default(CleverCache cleverCache, Boolean bool, Long l10, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = cleverCache.enabled;
            }
            if ((i10 & 2) != 0) {
                l10 = cleverCache.diskSize;
            }
            if ((i10 & 4) != 0) {
                num = cleverCache.diskPercentage;
            }
            return cleverCache.copy(bool, l10, num);
        }

        public static /* synthetic */ void getDiskPercentage$annotations() {
        }

        public static /* synthetic */ void getDiskSize$annotations() {
        }

        public static /* synthetic */ void getEnabled$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getEnabled() {
            return this.enabled;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getDiskSize() {
            return this.diskSize;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getDiskPercentage() {
            return this.diskPercentage;
        }

        public final CleverCache copy(Boolean enabled, Long diskSize, Integer diskPercentage) {
            return new CleverCache(enabled, diskSize, diskPercentage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CleverCache)) {
                return false;
            }
            CleverCache cleverCache = (CleverCache) other;
            return p.e(this.enabled, cleverCache.enabled) && p.e(this.diskSize, cleverCache.diskSize) && p.e(this.diskPercentage, cleverCache.diskPercentage);
        }

        public int hashCode() {
            Boolean bool = this.enabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l10 = this.diskSize;
            int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
            Integer num = this.diskPercentage;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "CleverCache(enabled=" + this.enabled + ", diskSize=" + this.diskSize + ", diskPercentage=" + this.diskPercentage + ')';
        }

        public static final void write$Self(CleverCache cleverCache, d dVar, a aVar) {
            Long l10;
            Integer num;
            p.j(cleverCache, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            if (dVar.q(aVar, 0) || !p.e(cleverCache.enabled, Boolean.FALSE)) {
                dVar.C(aVar, 0, bl.i.f5416a, cleverCache.enabled);
            }
            if (dVar.q(aVar, 1) || (l10 = cleverCache.diskSize) == null || l10.longValue() != 1000) {
                dVar.C(aVar, 1, a1.f5375a, cleverCache.diskSize);
            }
            if (dVar.q(aVar, 2) || (num = cleverCache.diskPercentage) == null || num.intValue() != 3) {
                dVar.C(aVar, 2, p0.f5452a, cleverCache.diskPercentage);
            }
        }

        public final Integer getDiskPercentage() {
            return this.diskPercentage;
        }

        public final Long getDiskSize() {
            return this.diskSize;
        }

        public final Boolean getEnabled() {
            return this.enabled;
        }

        public CleverCache(Boolean bool, Long l10, Integer num) {
            this.enabled = bool;
            this.diskSize = l10;
            this.diskPercentage = num;
        }

        public /* synthetic */ CleverCache(Boolean bool, Long l10, Integer num, int i10, i iVar) {
            this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? 1000L : l10, (i10 & 4) != 0 ? 3 : num);
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final b<ConfigPayload> serializer() {
            return ConfigPayload$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0013\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bB'\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0011\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u000b¨\u0006\""}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "()Ljava/lang/Long;", "refreshTime", "copy", "(Ljava/lang/Long;)Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Long;", "getRefreshTime", "getRefreshTime$annotations", "()V", "<init>", "(Ljava/lang/Long;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/Long;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class ConfigSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Long refreshTime;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final b<ConfigSettings> serializer() {
                return ConfigPayload$ConfigSettings$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ConfigSettings() {
            this((Long) null, 1, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ ConfigSettings(int i10, Long l10, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, ConfigPayload$ConfigSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.refreshTime = null;
            } else {
                this.refreshTime = l10;
            }
        }

        public static /* synthetic */ ConfigSettings copy$default(ConfigSettings configSettings, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = configSettings.refreshTime;
            }
            return configSettings.copy(l10);
        }

        public static /* synthetic */ void getRefreshTime$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getRefreshTime() {
            return this.refreshTime;
        }

        public final ConfigSettings copy(Long refreshTime) {
            return new ConfigSettings(refreshTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfigSettings) && p.e(this.refreshTime, ((ConfigSettings) other).refreshTime);
        }

        public int hashCode() {
            Long l10 = this.refreshTime;
            if (l10 == null) {
                return 0;
            }
            return l10.hashCode();
        }

        public String toString() {
            return "ConfigSettings(refreshTime=" + this.refreshTime + ')';
        }

        public ConfigSettings(Long l10) {
            this.refreshTime = l10;
        }

        public static final void write$Self(ConfigSettings configSettings, d dVar, a aVar) {
            p.j(configSettings, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            boolean z10 = true;
            if (!dVar.q(aVar, 0) && configSettings.refreshTime == null) {
                z10 = false;
            }
            if (z10) {
                dVar.C(aVar, 0, a1.f5375a, configSettings.refreshTime);
            }
        }

        public final Long getRefreshTime() {
            return this.refreshTime;
        }

        public /* synthetic */ ConfigSettings(Long l10, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : l10);
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B7\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b$\u0010%BK\b\u0017\u0012\u0006\u0010&\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b$\u0010)J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u0012\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001bR\"\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u0012\u0004\b!\u0010\u001d\u001a\u0004\b \u0010\u001bR\"\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0019\u0012\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010\u001b¨\u0006,"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "component2", "component3", "component4", "adsEndpoint", "riEndpoint", "errorLogsEndpoint", "metricsEndpoint", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getAdsEndpoint", "()Ljava/lang/String;", "getAdsEndpoint$annotations", "()V", "getRiEndpoint", "getRiEndpoint$annotations", "getErrorLogsEndpoint", "getErrorLogsEndpoint$annotations", "getMetricsEndpoint", "getMetricsEndpoint$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Endpoints {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String adsEndpoint;
        private final String errorLogsEndpoint;
        private final String metricsEndpoint;
        private final String riEndpoint;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final b<Endpoints> serializer() {
                return ConfigPayload$Endpoints$$serializer.INSTANCE;
            }
        }

        public Endpoints() {
            this((String) null, (String) null, (String) null, (String) null, 15, (i) null);
        }

        public /* synthetic */ Endpoints(int i10, String str, String str2, String str3, String str4, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, ConfigPayload$Endpoints$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.adsEndpoint = null;
            } else {
                this.adsEndpoint = str;
            }
            if ((i10 & 2) == 0) {
                this.riEndpoint = null;
            } else {
                this.riEndpoint = str2;
            }
            if ((i10 & 4) == 0) {
                this.errorLogsEndpoint = null;
            } else {
                this.errorLogsEndpoint = str3;
            }
            if ((i10 & 8) == 0) {
                this.metricsEndpoint = null;
            } else {
                this.metricsEndpoint = str4;
            }
        }

        public static /* synthetic */ Endpoints copy$default(Endpoints endpoints, String str, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = endpoints.adsEndpoint;
            }
            if ((i10 & 2) != 0) {
                str2 = endpoints.riEndpoint;
            }
            if ((i10 & 4) != 0) {
                str3 = endpoints.errorLogsEndpoint;
            }
            if ((i10 & 8) != 0) {
                str4 = endpoints.metricsEndpoint;
            }
            return endpoints.copy(str, str2, str3, str4);
        }

        public static /* synthetic */ void getAdsEndpoint$annotations() {
        }

        public static /* synthetic */ void getErrorLogsEndpoint$annotations() {
        }

        public static /* synthetic */ void getMetricsEndpoint$annotations() {
        }

        public static /* synthetic */ void getRiEndpoint$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        public final Endpoints copy(String adsEndpoint, String riEndpoint, String errorLogsEndpoint, String metricsEndpoint) {
            return new Endpoints(adsEndpoint, riEndpoint, errorLogsEndpoint, metricsEndpoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Endpoints)) {
                return false;
            }
            Endpoints endpoints = (Endpoints) other;
            return p.e(this.adsEndpoint, endpoints.adsEndpoint) && p.e(this.riEndpoint, endpoints.riEndpoint) && p.e(this.errorLogsEndpoint, endpoints.errorLogsEndpoint) && p.e(this.metricsEndpoint, endpoints.metricsEndpoint);
        }

        public int hashCode() {
            String str = this.adsEndpoint;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.riEndpoint;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.errorLogsEndpoint;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.metricsEndpoint;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Endpoints(adsEndpoint=" + this.adsEndpoint + ", riEndpoint=" + this.riEndpoint + ", errorLogsEndpoint=" + this.errorLogsEndpoint + ", metricsEndpoint=" + this.metricsEndpoint + ')';
        }

        public Endpoints(String str, String str2, String str3, String str4) {
            this.adsEndpoint = str;
            this.riEndpoint = str2;
            this.errorLogsEndpoint = str3;
            this.metricsEndpoint = str4;
        }

        public static final void write$Self(Endpoints endpoints, d dVar, a aVar) {
            p.j(endpoints, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            if (dVar.q(aVar, 0) || endpoints.adsEndpoint != null) {
                dVar.C(aVar, 0, d2.f5397a, endpoints.adsEndpoint);
            }
            if (dVar.q(aVar, 1) || endpoints.riEndpoint != null) {
                dVar.C(aVar, 1, d2.f5397a, endpoints.riEndpoint);
            }
            if (dVar.q(aVar, 2) || endpoints.errorLogsEndpoint != null) {
                dVar.C(aVar, 2, d2.f5397a, endpoints.errorLogsEndpoint);
            }
            if (dVar.q(aVar, 3) || endpoints.metricsEndpoint != null) {
                dVar.C(aVar, 3, d2.f5397a, endpoints.metricsEndpoint);
            }
        }

        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }

        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        public /* synthetic */ Endpoints(String str, String str2, String str3, String str4, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254BO\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b.\u0010/Bc\b\u0017\u0012\u0006\u00100\u001a\u00020\u001b\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b.\u00103J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0003JX\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\fHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b \u0010!\u001a\u0004\b\u0012\u0010\u000bR\"\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$R\"\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\"\u0012\u0004\b'\u0010!\u001a\u0004\b&\u0010$R\"\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\"\u0012\u0004\b)\u0010!\u001a\u0004\b(\u0010$R\"\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\"\u0012\u0004\b+\u0010!\u001a\u0004\b*\u0010$R\"\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u0012\u0004\b-\u0010!\u001a\u0004\b,\u0010$¨\u00066"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "()Ljava/lang/Boolean;", "", "component2", "component3", "component4", "component5", "component6", "isCountryDataProtected", "consentTitle", "consentMessage", "consentMessageVersion", "buttonAccept", "buttonDeny", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "toString", "", "hashCode", "other", "equals", "Ljava/lang/Boolean;", "isCountryDataProtected$annotations", "()V", "Ljava/lang/String;", "getConsentTitle", "()Ljava/lang/String;", "getConsentTitle$annotations", "getConsentMessage", "getConsentMessage$annotations", "getConsentMessageVersion", "getConsentMessageVersion$annotations", "getButtonAccept", "getButtonAccept$annotations", "getButtonDeny", "getButtonDeny$annotations", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class GDPRSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String buttonAccept;
        private final String buttonDeny;
        private final String consentMessage;
        private final String consentMessageVersion;
        private final String consentTitle;
        private final Boolean isCountryDataProtected;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final b<GDPRSettings> serializer() {
                return ConfigPayload$GDPRSettings$$serializer.INSTANCE;
            }
        }

        public GDPRSettings() {
            this((Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (i) null);
        }

        public /* synthetic */ GDPRSettings(int i10, Boolean bool, String str, String str2, String str3, String str4, String str5, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, ConfigPayload$GDPRSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.isCountryDataProtected = null;
            } else {
                this.isCountryDataProtected = bool;
            }
            if ((i10 & 2) == 0) {
                this.consentTitle = null;
            } else {
                this.consentTitle = str;
            }
            if ((i10 & 4) == 0) {
                this.consentMessage = null;
            } else {
                this.consentMessage = str2;
            }
            if ((i10 & 8) == 0) {
                this.consentMessageVersion = null;
            } else {
                this.consentMessageVersion = str3;
            }
            if ((i10 & 16) == 0) {
                this.buttonAccept = null;
            } else {
                this.buttonAccept = str4;
            }
            if ((i10 & 32) == 0) {
                this.buttonDeny = null;
            } else {
                this.buttonDeny = str5;
            }
        }

        public static /* synthetic */ GDPRSettings copy$default(GDPRSettings gDPRSettings, Boolean bool, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = gDPRSettings.isCountryDataProtected;
            }
            if ((i10 & 2) != 0) {
                str = gDPRSettings.consentTitle;
            }
            String str6 = str;
            if ((i10 & 4) != 0) {
                str2 = gDPRSettings.consentMessage;
            }
            String str7 = str2;
            if ((i10 & 8) != 0) {
                str3 = gDPRSettings.consentMessageVersion;
            }
            String str8 = str3;
            if ((i10 & 16) != 0) {
                str4 = gDPRSettings.buttonAccept;
            }
            String str9 = str4;
            if ((i10 & 32) != 0) {
                str5 = gDPRSettings.buttonDeny;
            }
            return gDPRSettings.copy(bool, str6, str7, str8, str9, str5);
        }

        public static /* synthetic */ void getButtonAccept$annotations() {
        }

        public static /* synthetic */ void getButtonDeny$annotations() {
        }

        public static /* synthetic */ void getConsentMessage$annotations() {
        }

        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        public static /* synthetic */ void getConsentTitle$annotations() {
        }

        public static /* synthetic */ void isCountryDataProtected$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConsentTitle() {
            return this.consentTitle;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getConsentMessage() {
            return this.consentMessage;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getButtonDeny() {
            return this.buttonDeny;
        }

        public final GDPRSettings copy(Boolean isCountryDataProtected, String consentTitle, String consentMessage, String consentMessageVersion, String buttonAccept, String buttonDeny) {
            return new GDPRSettings(isCountryDataProtected, consentTitle, consentMessage, consentMessageVersion, buttonAccept, buttonDeny);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GDPRSettings)) {
                return false;
            }
            GDPRSettings gDPRSettings = (GDPRSettings) other;
            return p.e(this.isCountryDataProtected, gDPRSettings.isCountryDataProtected) && p.e(this.consentTitle, gDPRSettings.consentTitle) && p.e(this.consentMessage, gDPRSettings.consentMessage) && p.e(this.consentMessageVersion, gDPRSettings.consentMessageVersion) && p.e(this.buttonAccept, gDPRSettings.buttonAccept) && p.e(this.buttonDeny, gDPRSettings.buttonDeny);
        }

        public int hashCode() {
            Boolean bool = this.isCountryDataProtected;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.consentTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.consentMessage;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.consentMessageVersion;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buttonAccept;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.buttonDeny;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "GDPRSettings(isCountryDataProtected=" + this.isCountryDataProtected + ", consentTitle=" + this.consentTitle + ", consentMessage=" + this.consentMessage + ", consentMessageVersion=" + this.consentMessageVersion + ", buttonAccept=" + this.buttonAccept + ", buttonDeny=" + this.buttonDeny + ')';
        }

        public GDPRSettings(Boolean bool, String str, String str2, String str3, String str4, String str5) {
            this.isCountryDataProtected = bool;
            this.consentTitle = str;
            this.consentMessage = str2;
            this.consentMessageVersion = str3;
            this.buttonAccept = str4;
            this.buttonDeny = str5;
        }

        public static final void write$Self(GDPRSettings gDPRSettings, d dVar, a aVar) {
            p.j(gDPRSettings, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            if (dVar.q(aVar, 0) || gDPRSettings.isCountryDataProtected != null) {
                dVar.C(aVar, 0, bl.i.f5416a, gDPRSettings.isCountryDataProtected);
            }
            if (dVar.q(aVar, 1) || gDPRSettings.consentTitle != null) {
                dVar.C(aVar, 1, d2.f5397a, gDPRSettings.consentTitle);
            }
            if (dVar.q(aVar, 2) || gDPRSettings.consentMessage != null) {
                dVar.C(aVar, 2, d2.f5397a, gDPRSettings.consentMessage);
            }
            if (dVar.q(aVar, 3) || gDPRSettings.consentMessageVersion != null) {
                dVar.C(aVar, 3, d2.f5397a, gDPRSettings.consentMessageVersion);
            }
            if (dVar.q(aVar, 4) || gDPRSettings.buttonAccept != null) {
                dVar.C(aVar, 4, d2.f5397a, gDPRSettings.buttonAccept);
            }
            if (dVar.q(aVar, 5) || gDPRSettings.buttonDeny != null) {
                dVar.C(aVar, 5, d2.f5397a, gDPRSettings.buttonDeny);
            }
        }

        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        public final String getButtonDeny() {
            return this.buttonDeny;
        }

        public final String getConsentMessage() {
            return this.consentMessage;
        }

        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final String getConsentTitle() {
            return this.consentTitle;
        }

        public final Boolean isCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        public /* synthetic */ GDPRSettings(Boolean bool, String str, String str2, String str3, String str4, String str5, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5);
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0003 \u001f!B\u0013\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aB'\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u000b¨\u0006\""}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "tcfStatus", "copy", "(Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getTcfStatus", "getTcfStatus$annotations", "()V", "<init>", "(Ljava/lang/Integer;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "TcfStatus", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class IABSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer tcfStatus;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final b<IABSettings> serializer() {
                return ConfigPayload$IABSettings$$serializer.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "", "rawValue", "", "(Ljava/lang/String;II)V", "getRawValue", "()I", "ALLOW_ID", "DISABLE_ID", "LEGACY", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public enum TcfStatus {
            ALLOW_ID(0),
            DISABLE_ID(1),
            LEGACY(2);


            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final Map<Integer, TcfStatus> rawValueMap;
            private final int rawValue;

            /* JADX INFO: compiled from: ConfigPayload.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus$Companion;", "", "()V", "rawValueMap", "", "", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "fromRawValue", "rawValue", "(Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(i iVar) {
                    this();
                }

                public final TcfStatus fromRawValue(Integer rawValue) {
                    return (TcfStatus) TcfStatus.rawValueMap.get(rawValue);
                }
            }

            static {
                TcfStatus[] tcfStatusArrValues = values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(k.d(l0.f(tcfStatusArrValues.length), 16));
                for (TcfStatus tcfStatus : tcfStatusArrValues) {
                    linkedHashMap.put(Integer.valueOf(tcfStatus.rawValue), tcfStatus);
                }
                rawValueMap = linkedHashMap;
            }

            public final int getRawValue() {
                return this.rawValue;
            }

            TcfStatus(int i10) {
                this.rawValue = i10;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IABSettings() {
            this((Integer) null, 1, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ IABSettings(int i10, Integer num, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, ConfigPayload$IABSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.tcfStatus = null;
            } else {
                this.tcfStatus = num;
            }
        }

        public static /* synthetic */ IABSettings copy$default(IABSettings iABSettings, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = iABSettings.tcfStatus;
            }
            return iABSettings.copy(num);
        }

        public static /* synthetic */ void getTcfStatus$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getTcfStatus() {
            return this.tcfStatus;
        }

        public final IABSettings copy(Integer tcfStatus) {
            return new IABSettings(tcfStatus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IABSettings) && p.e(this.tcfStatus, ((IABSettings) other).tcfStatus);
        }

        public int hashCode() {
            Integer num = this.tcfStatus;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            return "IABSettings(tcfStatus=" + this.tcfStatus + ')';
        }

        public IABSettings(Integer num) {
            this.tcfStatus = num;
        }

        public static final void write$Self(IABSettings iABSettings, d dVar, a aVar) {
            p.j(iABSettings, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            boolean z10 = true;
            if (!dVar.q(aVar, 0) && iABSettings.tcfStatus == null) {
                z10 = false;
            }
            if (z10) {
                dVar.C(aVar, 0, p0.f5452a, iABSettings.tcfStatus);
            }
        }

        public final Integer getTcfStatus() {
            return this.tcfStatus;
        }

        public /* synthetic */ IABSettings(Integer num, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : num);
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001f\u0010 B3\b\u0017\u0012\u0006\u0010!\u001a\u00020\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0015\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u000bR\"\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u000e¨\u0006'"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "", "component2", "()Ljava/lang/Boolean;", "errorLogLevel", "metricsEnabled", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "", "toString", "hashCode", "other", "equals", "Ljava/lang/Integer;", "getErrorLogLevel", "getErrorLogLevel$annotations", "()V", "Ljava/lang/Boolean;", "getMetricsEnabled", "getMetricsEnabled$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Boolean;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class LogMetricsSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer errorLogLevel;
        private final Boolean metricsEnabled;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final b<LogMetricsSettings> serializer() {
                return ConfigPayload$LogMetricsSettings$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LogMetricsSettings() {
            this((Integer) null, (Boolean) (0 == true ? 1 : 0), 3, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ LogMetricsSettings(int i10, Integer num, Boolean bool, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.errorLogLevel = null;
            } else {
                this.errorLogLevel = num;
            }
            if ((i10 & 2) == 0) {
                this.metricsEnabled = null;
            } else {
                this.metricsEnabled = bool;
            }
        }

        public static /* synthetic */ LogMetricsSettings copy$default(LogMetricsSettings logMetricsSettings, Integer num, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = logMetricsSettings.errorLogLevel;
            }
            if ((i10 & 2) != 0) {
                bool = logMetricsSettings.metricsEnabled;
            }
            return logMetricsSettings.copy(num, bool);
        }

        public static /* synthetic */ void getErrorLogLevel$annotations() {
        }

        public static /* synthetic */ void getMetricsEnabled$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getErrorLogLevel() {
            return this.errorLogLevel;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        public final LogMetricsSettings copy(Integer errorLogLevel, Boolean metricsEnabled) {
            return new LogMetricsSettings(errorLogLevel, metricsEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogMetricsSettings)) {
                return false;
            }
            LogMetricsSettings logMetricsSettings = (LogMetricsSettings) other;
            return p.e(this.errorLogLevel, logMetricsSettings.errorLogLevel) && p.e(this.metricsEnabled, logMetricsSettings.metricsEnabled);
        }

        public int hashCode() {
            Integer num = this.errorLogLevel;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.metricsEnabled;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "LogMetricsSettings(errorLogLevel=" + this.errorLogLevel + ", metricsEnabled=" + this.metricsEnabled + ')';
        }

        public LogMetricsSettings(Integer num, Boolean bool) {
            this.errorLogLevel = num;
            this.metricsEnabled = bool;
        }

        public static final void write$Self(LogMetricsSettings logMetricsSettings, d dVar, a aVar) {
            p.j(logMetricsSettings, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            if (dVar.q(aVar, 0) || logMetricsSettings.errorLogLevel != null) {
                dVar.C(aVar, 0, p0.f5452a, logMetricsSettings.errorLogLevel);
            }
            if (dVar.q(aVar, 1) || logMetricsSettings.metricsEnabled != null) {
                dVar.C(aVar, 1, bl.i.f5416a, logMetricsSettings.metricsEnabled);
            }
        }

        public final Integer getErrorLogLevel() {
            return this.errorLogLevel;
        }

        public final Boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        public /* synthetic */ LogMetricsSettings(Integer num, Boolean bool, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : bool);
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010!B3\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "component1", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "component2", InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, "iab", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "getGdpr", "()Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "getGdpr$annotations", "()V", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "getIab", "()Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "getIab$annotations", "<init>", "(Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class UserPrivacy {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final GDPRSettings gdpr;
        private final IABSettings iab;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final b<UserPrivacy> serializer() {
                return ConfigPayload$UserPrivacy$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UserPrivacy() {
            this((GDPRSettings) null, (IABSettings) (0 == true ? 1 : 0), 3, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ UserPrivacy(int i10, GDPRSettings gDPRSettings, IABSettings iABSettings, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, ConfigPayload$UserPrivacy$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = gDPRSettings;
            }
            if ((i10 & 2) == 0) {
                this.iab = null;
            } else {
                this.iab = iABSettings;
            }
        }

        public static /* synthetic */ UserPrivacy copy$default(UserPrivacy userPrivacy, GDPRSettings gDPRSettings, IABSettings iABSettings, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gDPRSettings = userPrivacy.gdpr;
            }
            if ((i10 & 2) != 0) {
                iABSettings = userPrivacy.iab;
            }
            return userPrivacy.copy(gDPRSettings, iABSettings);
        }

        public static /* synthetic */ void getGdpr$annotations() {
        }

        public static /* synthetic */ void getIab$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GDPRSettings getGdpr() {
            return this.gdpr;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final IABSettings getIab() {
            return this.iab;
        }

        public final UserPrivacy copy(GDPRSettings gdpr, IABSettings iab) {
            return new UserPrivacy(gdpr, iab);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserPrivacy)) {
                return false;
            }
            UserPrivacy userPrivacy = (UserPrivacy) other;
            return p.e(this.gdpr, userPrivacy.gdpr) && p.e(this.iab, userPrivacy.iab);
        }

        public int hashCode() {
            GDPRSettings gDPRSettings = this.gdpr;
            int iHashCode = (gDPRSettings == null ? 0 : gDPRSettings.hashCode()) * 31;
            IABSettings iABSettings = this.iab;
            return iHashCode + (iABSettings != null ? iABSettings.hashCode() : 0);
        }

        public String toString() {
            return "UserPrivacy(gdpr=" + this.gdpr + ", iab=" + this.iab + ')';
        }

        public UserPrivacy(GDPRSettings gDPRSettings, IABSettings iABSettings) {
            this.gdpr = gDPRSettings;
            this.iab = iABSettings;
        }

        public static final void write$Self(UserPrivacy userPrivacy, d dVar, a aVar) {
            p.j(userPrivacy, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            if (dVar.q(aVar, 0) || userPrivacy.gdpr != null) {
                dVar.C(aVar, 0, ConfigPayload$GDPRSettings$$serializer.INSTANCE, userPrivacy.gdpr);
            }
            if (dVar.q(aVar, 1) || userPrivacy.iab != null) {
                dVar.C(aVar, 1, ConfigPayload$IABSettings$$serializer.INSTANCE, userPrivacy.iab);
            }
        }

        public final GDPRSettings getGdpr() {
            return this.gdpr;
        }

        public final IABSettings getIab() {
            return this.iab;
        }

        public /* synthetic */ UserPrivacy(GDPRSettings gDPRSettings, IABSettings iABSettings, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : gDPRSettings, (i10 & 2) != 0 ? null : iABSettings);
        }
    }

    public ConfigPayload() {
        this((CleverCache) null, (ConfigSettings) null, (Endpoints) null, (LogMetricsSettings) null, (List) null, (UserPrivacy) null, (String) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (AutoRedirect) null, (Boolean) null, (Boolean) null, 524287, (i) null);
    }

    public /* synthetic */ ConfigPayload(int i10, CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, AutoRedirect autoRedirect, Boolean bool7, Boolean bool8, y1 y1Var) {
        if ((i10 & 0) != 0) {
            o1.a(i10, 0, ConfigPayload$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.cleverCache = null;
        } else {
            this.cleverCache = cleverCache;
        }
        if ((i10 & 2) == 0) {
            this.configSettings = null;
        } else {
            this.configSettings = configSettings;
        }
        if ((i10 & 4) == 0) {
            this.endpoints = null;
        } else {
            this.endpoints = endpoints;
        }
        if ((i10 & 8) == 0) {
            this.logMetricsSettings = null;
        } else {
            this.logMetricsSettings = logMetricsSettings;
        }
        if ((i10 & 16) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i10 & 32) == 0) {
            this.userPrivacy = null;
        } else {
            this.userPrivacy = userPrivacy;
        }
        if ((i10 & 64) == 0) {
            this.configExtension = null;
        } else {
            this.configExtension = str;
        }
        this.disableAdId = (i10 & 128) == 0 ? Boolean.TRUE : bool;
        if ((i10 & 256) == 0) {
            this.isReportIncentivizedEnabled = null;
        } else {
            this.isReportIncentivizedEnabled = bool2;
        }
        if ((i10 & 512) == 0) {
            this.sessionTimeout = null;
        } else {
            this.sessionTimeout = num;
        }
        if ((i10 & 1024) == 0) {
            this.waitForConnectivityForTPAT = null;
        } else {
            this.waitForConnectivityForTPAT = bool3;
        }
        if ((i10 & 2048) == 0) {
            this.signalSessionTimeout = null;
        } else {
            this.signalSessionTimeout = num2;
        }
        if ((i10 & 4096) == 0) {
            this.signalsDisabled = null;
        } else {
            this.signalsDisabled = bool4;
        }
        if ((i10 & 8192) == 0) {
            this.fpdEnabled = null;
        } else {
            this.fpdEnabled = bool5;
        }
        if ((i10 & 16384) == 0) {
            this.rtaDebugging = null;
        } else {
            this.rtaDebugging = bool6;
        }
        if ((32768 & i10) == 0) {
            this.configLastValidatedTimestamp = null;
        } else {
            this.configLastValidatedTimestamp = l10;
        }
        if ((65536 & i10) == 0) {
            this.autoRedirect = null;
        } else {
            this.autoRedirect = autoRedirect;
        }
        if ((131072 & i10) == 0) {
            this.retryPriorityTPATs = null;
        } else {
            this.retryPriorityTPATs = bool7;
        }
        if ((i10 & 262144) == 0) {
            this.enableOT = null;
        } else {
            this.enableOT = bool8;
        }
    }

    public static /* synthetic */ void getAutoRedirect$annotations() {
    }

    public static /* synthetic */ void getCleverCache$annotations() {
    }

    public static /* synthetic */ void getConfigExtension$annotations() {
    }

    public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
    }

    public static /* synthetic */ void getConfigSettings$annotations() {
    }

    public static /* synthetic */ void getDisableAdId$annotations() {
    }

    public static /* synthetic */ void getEnableOT$annotations() {
    }

    public static /* synthetic */ void getEndpoints$annotations() {
    }

    public static /* synthetic */ void getFpdEnabled$annotations() {
    }

    public static /* synthetic */ void getLogMetricsSettings$annotations() {
    }

    public static /* synthetic */ void getPlacements$annotations() {
    }

    public static /* synthetic */ void getRetryPriorityTPATs$annotations() {
    }

    public static /* synthetic */ void getRtaDebugging$annotations() {
    }

    public static /* synthetic */ void getSessionTimeout$annotations() {
    }

    public static /* synthetic */ void getSignalSessionTimeout$annotations() {
    }

    public static /* synthetic */ void getSignalsDisabled$annotations() {
    }

    public static /* synthetic */ void getUserPrivacy$annotations() {
    }

    public static /* synthetic */ void getWaitForConnectivityForTPAT$annotations() {
    }

    public static /* synthetic */ void isReportIncentivizedEnabled$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CleverCache getCleverCache() {
        return this.cleverCache;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getWaitForConnectivityForTPAT() {
        return this.waitForConnectivityForTPAT;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getFpdEnabled() {
        return this.fpdEnabled;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Long getConfigLastValidatedTimestamp() {
        return this.configLastValidatedTimestamp;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final AutoRedirect getAutoRedirect() {
        return this.autoRedirect;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getRetryPriorityTPATs() {
        return this.retryPriorityTPATs;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getEnableOT() {
        return this.enableOT;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Endpoints getEndpoints() {
        return this.endpoints;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LogMetricsSettings getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    public final List<Placement> component5() {
        return this.placements;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final UserPrivacy getUserPrivacy() {
        return this.userPrivacy;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getConfigExtension() {
        return this.configExtension;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public final ConfigPayload copy(CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List<Placement> placements, UserPrivacy userPrivacy, String configExtension, Boolean disableAdId, Boolean isReportIncentivizedEnabled, Integer sessionTimeout, Boolean waitForConnectivityForTPAT, Integer signalSessionTimeout, Boolean signalsDisabled, Boolean fpdEnabled, Boolean rtaDebugging, Long configLastValidatedTimestamp, AutoRedirect autoRedirect, Boolean retryPriorityTPATs, Boolean enableOT) {
        return new ConfigPayload(cleverCache, configSettings, endpoints, logMetricsSettings, placements, userPrivacy, configExtension, disableAdId, isReportIncentivizedEnabled, sessionTimeout, waitForConnectivityForTPAT, signalSessionTimeout, signalsDisabled, fpdEnabled, rtaDebugging, configLastValidatedTimestamp, autoRedirect, retryPriorityTPATs, enableOT);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigPayload)) {
            return false;
        }
        ConfigPayload configPayload = (ConfigPayload) other;
        return p.e(this.cleverCache, configPayload.cleverCache) && p.e(this.configSettings, configPayload.configSettings) && p.e(this.endpoints, configPayload.endpoints) && p.e(this.logMetricsSettings, configPayload.logMetricsSettings) && p.e(this.placements, configPayload.placements) && p.e(this.userPrivacy, configPayload.userPrivacy) && p.e(this.configExtension, configPayload.configExtension) && p.e(this.disableAdId, configPayload.disableAdId) && p.e(this.isReportIncentivizedEnabled, configPayload.isReportIncentivizedEnabled) && p.e(this.sessionTimeout, configPayload.sessionTimeout) && p.e(this.waitForConnectivityForTPAT, configPayload.waitForConnectivityForTPAT) && p.e(this.signalSessionTimeout, configPayload.signalSessionTimeout) && p.e(this.signalsDisabled, configPayload.signalsDisabled) && p.e(this.fpdEnabled, configPayload.fpdEnabled) && p.e(this.rtaDebugging, configPayload.rtaDebugging) && p.e(this.configLastValidatedTimestamp, configPayload.configLastValidatedTimestamp) && p.e(this.autoRedirect, configPayload.autoRedirect) && p.e(this.retryPriorityTPATs, configPayload.retryPriorityTPATs) && p.e(this.enableOT, configPayload.enableOT);
    }

    public int hashCode() {
        CleverCache cleverCache = this.cleverCache;
        int iHashCode = (cleverCache == null ? 0 : cleverCache.hashCode()) * 31;
        ConfigSettings configSettings = this.configSettings;
        int iHashCode2 = (iHashCode + (configSettings == null ? 0 : configSettings.hashCode())) * 31;
        Endpoints endpoints = this.endpoints;
        int iHashCode3 = (iHashCode2 + (endpoints == null ? 0 : endpoints.hashCode())) * 31;
        LogMetricsSettings logMetricsSettings = this.logMetricsSettings;
        int iHashCode4 = (iHashCode3 + (logMetricsSettings == null ? 0 : logMetricsSettings.hashCode())) * 31;
        List<Placement> list = this.placements;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        UserPrivacy userPrivacy = this.userPrivacy;
        int iHashCode6 = (iHashCode5 + (userPrivacy == null ? 0 : userPrivacy.hashCode())) * 31;
        String str = this.configExtension;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.disableAdId;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isReportIncentivizedEnabled;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.sessionTimeout;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.waitForConnectivityForTPAT;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.signalSessionTimeout;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.signalsDisabled;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.fpdEnabled;
        int iHashCode14 = (iHashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.rtaDebugging;
        int iHashCode15 = (iHashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Long l10 = this.configLastValidatedTimestamp;
        int iHashCode16 = (iHashCode15 + (l10 == null ? 0 : l10.hashCode())) * 31;
        AutoRedirect autoRedirect = this.autoRedirect;
        int iHashCode17 = (iHashCode16 + (autoRedirect == null ? 0 : autoRedirect.hashCode())) * 31;
        Boolean bool7 = this.retryPriorityTPATs;
        int iHashCode18 = (iHashCode17 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.enableOT;
        return iHashCode18 + (bool8 != null ? bool8.hashCode() : 0);
    }

    public String toString() {
        return "ConfigPayload(cleverCache=" + this.cleverCache + ", configSettings=" + this.configSettings + ", endpoints=" + this.endpoints + ", logMetricsSettings=" + this.logMetricsSettings + ", placements=" + this.placements + ", userPrivacy=" + this.userPrivacy + ", configExtension=" + this.configExtension + ", disableAdId=" + this.disableAdId + ", isReportIncentivizedEnabled=" + this.isReportIncentivizedEnabled + ", sessionTimeout=" + this.sessionTimeout + ", waitForConnectivityForTPAT=" + this.waitForConnectivityForTPAT + ", signalSessionTimeout=" + this.signalSessionTimeout + ", signalsDisabled=" + this.signalsDisabled + ", fpdEnabled=" + this.fpdEnabled + ", rtaDebugging=" + this.rtaDebugging + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ", autoRedirect=" + this.autoRedirect + ", retryPriorityTPATs=" + this.retryPriorityTPATs + ", enableOT=" + this.enableOT + ')';
    }

    public static final void write$Self(ConfigPayload configPayload, d dVar, a aVar) {
        p.j(configPayload, "self");
        p.j(dVar, "output");
        p.j(aVar, "serialDesc");
        if (dVar.q(aVar, 0) || configPayload.cleverCache != null) {
            dVar.C(aVar, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, configPayload.cleverCache);
        }
        if (dVar.q(aVar, 1) || configPayload.configSettings != null) {
            dVar.C(aVar, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, configPayload.configSettings);
        }
        if (dVar.q(aVar, 2) || configPayload.endpoints != null) {
            dVar.C(aVar, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, configPayload.endpoints);
        }
        if (dVar.q(aVar, 3) || configPayload.logMetricsSettings != null) {
            dVar.C(aVar, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, configPayload.logMetricsSettings);
        }
        if (dVar.q(aVar, 4) || configPayload.placements != null) {
            dVar.C(aVar, 4, new bl.f(Placement$$serializer.INSTANCE), configPayload.placements);
        }
        if (dVar.q(aVar, 5) || configPayload.userPrivacy != null) {
            dVar.C(aVar, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, configPayload.userPrivacy);
        }
        if (dVar.q(aVar, 6) || configPayload.configExtension != null) {
            dVar.C(aVar, 6, d2.f5397a, configPayload.configExtension);
        }
        if (dVar.q(aVar, 7) || !p.e(configPayload.disableAdId, Boolean.TRUE)) {
            dVar.C(aVar, 7, bl.i.f5416a, configPayload.disableAdId);
        }
        if (dVar.q(aVar, 8) || configPayload.isReportIncentivizedEnabled != null) {
            dVar.C(aVar, 8, bl.i.f5416a, configPayload.isReportIncentivizedEnabled);
        }
        if (dVar.q(aVar, 9) || configPayload.sessionTimeout != null) {
            dVar.C(aVar, 9, p0.f5452a, configPayload.sessionTimeout);
        }
        if (dVar.q(aVar, 10) || configPayload.waitForConnectivityForTPAT != null) {
            dVar.C(aVar, 10, bl.i.f5416a, configPayload.waitForConnectivityForTPAT);
        }
        if (dVar.q(aVar, 11) || configPayload.signalSessionTimeout != null) {
            dVar.C(aVar, 11, p0.f5452a, configPayload.signalSessionTimeout);
        }
        if (dVar.q(aVar, 12) || configPayload.signalsDisabled != null) {
            dVar.C(aVar, 12, bl.i.f5416a, configPayload.signalsDisabled);
        }
        if (dVar.q(aVar, 13) || configPayload.fpdEnabled != null) {
            dVar.C(aVar, 13, bl.i.f5416a, configPayload.fpdEnabled);
        }
        if (dVar.q(aVar, 14) || configPayload.rtaDebugging != null) {
            dVar.C(aVar, 14, bl.i.f5416a, configPayload.rtaDebugging);
        }
        if (dVar.q(aVar, 15) || configPayload.configLastValidatedTimestamp != null) {
            dVar.C(aVar, 15, a1.f5375a, configPayload.configLastValidatedTimestamp);
        }
        if (dVar.q(aVar, 16) || configPayload.autoRedirect != null) {
            dVar.C(aVar, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, configPayload.autoRedirect);
        }
        if (dVar.q(aVar, 17) || configPayload.retryPriorityTPATs != null) {
            dVar.C(aVar, 17, bl.i.f5416a, configPayload.retryPriorityTPATs);
        }
        if (dVar.q(aVar, 18) || configPayload.enableOT != null) {
            dVar.C(aVar, 18, bl.i.f5416a, configPayload.enableOT);
        }
    }

    public final AutoRedirect getAutoRedirect() {
        return this.autoRedirect;
    }

    public final CleverCache getCleverCache() {
        return this.cleverCache;
    }

    public final String getConfigExtension() {
        return this.configExtension;
    }

    public final Long getConfigLastValidatedTimestamp() {
        return this.configLastValidatedTimestamp;
    }

    public final ConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    public final Boolean getEnableOT() {
        return this.enableOT;
    }

    public final Endpoints getEndpoints() {
        return this.endpoints;
    }

    public final Boolean getFpdEnabled() {
        return this.fpdEnabled;
    }

    public final LogMetricsSettings getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    public final List<Placement> getPlacements() {
        return this.placements;
    }

    public final Boolean getRetryPriorityTPATs() {
        return this.retryPriorityTPATs;
    }

    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    public final Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    public final UserPrivacy getUserPrivacy() {
        return this.userPrivacy;
    }

    public final Boolean getWaitForConnectivityForTPAT() {
        return this.waitForConnectivityForTPAT;
    }

    public final Boolean isReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public final void setAutoRedirect(AutoRedirect autoRedirect) {
        this.autoRedirect = autoRedirect;
    }

    public final void setConfigLastValidatedTimestamp(Long l10) {
        this.configLastValidatedTimestamp = l10;
    }

    public final void setEnableOT(Boolean bool) {
        this.enableOT = bool;
    }

    public final void setRetryPriorityTPATs(Boolean bool) {
        this.retryPriorityTPATs = bool;
    }

    public ConfigPayload(CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List<Placement> list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, AutoRedirect autoRedirect, Boolean bool7, Boolean bool8) {
        this.cleverCache = cleverCache;
        this.configSettings = configSettings;
        this.endpoints = endpoints;
        this.logMetricsSettings = logMetricsSettings;
        this.placements = list;
        this.userPrivacy = userPrivacy;
        this.configExtension = str;
        this.disableAdId = bool;
        this.isReportIncentivizedEnabled = bool2;
        this.sessionTimeout = num;
        this.waitForConnectivityForTPAT = bool3;
        this.signalSessionTimeout = num2;
        this.signalsDisabled = bool4;
        this.fpdEnabled = bool5;
        this.rtaDebugging = bool6;
        this.configLastValidatedTimestamp = l10;
        this.autoRedirect = autoRedirect;
        this.retryPriorityTPATs = bool7;
        this.enableOT = bool8;
    }

    public /* synthetic */ ConfigPayload(CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, AutoRedirect autoRedirect, Boolean bool7, Boolean bool8, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : cleverCache, (i10 & 2) != 0 ? null : configSettings, (i10 & 4) != 0 ? null : endpoints, (i10 & 8) != 0 ? null : logMetricsSettings, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : userPrivacy, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? Boolean.TRUE : bool, (i10 & 256) != 0 ? null : bool2, (i10 & 512) != 0 ? null : num, (i10 & 1024) != 0 ? null : bool3, (i10 & 2048) != 0 ? null : num2, (i10 & 4096) != 0 ? null : bool4, (i10 & 8192) != 0 ? null : bool5, (i10 & 16384) != 0 ? null : bool6, (i10 & 32768) != 0 ? null : l10, (i10 & 65536) != 0 ? null : autoRedirect, (i10 & 131072) != 0 ? null : bool7, (i10 & 262144) != 0 ? null : bool8);
    }
}
