package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.device.ads.DTBAdView;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import com.ironsource.mediationsdk.ads.nativead.NativeAdLayout;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInteractionListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdLoadListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoAutomaticListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.InterstitialActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.banner.BannerAdViewListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import com.unity3d.ironsourceads.interstitial.InterstitialAdListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import com.unity3d.ironsourceads.rewarded.RewardedAdListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class bt extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1027 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1028 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1029 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1030;

    static {
        char[] cArr = new char[1642];
        ByteBuffer.wrap("\u0000AîÙÝ\u0005ÌEº\u009e©Æ\u0098\u0001\u0087iu\u0099d÷S/By0°\u001f\u001a\u000eH\u0000Pî×Ý\u0017ÌRº\u0089©Ê\u0098\u0007\u0087su¬\u0000CîÔÝ\u0018ÌEº\u009e©È\u0098\u000e\u0087qu½dáS\u000fBj0°\u001f\u0016\u000eLü\u009cëÄÚ\u0012\u0000cîÔÝ\u001bÌ\u001fº\u0085©Õ\u0098\r\u0087su«düS;B{0§\u001f\u001a\u000e\u0014ü\u0086ëÔÚ\u0000É\b·\u0082¦ó\u00959\u0084fr¿açP/>\u0092-Ü\u001c\u0006\u000b\u0001ù©èÊ×\u000eÆo´¤£þ\u0092 \u0081ko§^\u000fMy;\u0090*Ú\u0019\u0000\bRö¶åîÔ,\u0000IîÕÝ\u0002ÌTº\u009e©Ô\u0098\u0016\u0087tu¬dúS/Be0\u0085\u001f\u001c\u000eNü\u009cëÆÚ\u0002ÉR·\u0098'÷É@ú\u008fë\u008b\u009d\u0011\u008eA¿\u0099 çR?Cht¯eï\u001738\u008e)\u0080Û\u0012Ì@ý\u0094î\u009c\u0090\u0016\u0081g²\u00ad£òU+Fsw»\u0019\u0006\nH;\u0092,\u0095Þ7Ï_ð\u0080áê\u00930\u0084vµ¬¦úH\"y\u0080jÍ\u001c\u000b\r{>\u009e/ÄÑ\"Âxó¨äð\u0096&$#Ê§ù\u007fè3\u009eÕ\u008d¹¼b£0Q×@\u008bwKf\u0013\u0014Á;g*/I´§\u0003\u0094Ì\u0085ÈóRà\u0002ÑÚÎ¤<|-+\u001aì\u000b¬ypVÍGÃµQ¢\u0003\u0093×\u0080ßþUï$ÜîÍ±;h(0\u0019øwEd\u000bUÑBÖ°r¡\u0002\u009eÒ\u008f¢ýTê4Û÷È\u0091&v\u0017Þ\u0004\u0086rRc\u0010PÊA\u008a\u0000IîÉÝ\u0019Ì_º¿©È\u0098\u0017\u0087ou»döS\fBh0ª\u001f\u0011\u000e_ü\u0087ëüÚ\nÉ_·\u008e¦é\u0095#ÁÓ/d\u001c«\r¯{5heY½FÃ´\u001b¥L\u0092\u008b\u0083Ëñ\u0017ÞªÏ¤=(*e\u001b¿\bÿv0gXT\u008eEÍ³\u0013 K\u0091\u0097ÿ%ì'Ý\u008dÊí85){\u0016\u0083\u0007Äu\u0013bSS\u009f@Ò®0\u009f¬\u008cæú-ë{Ø«ÉØ7\u000e$S\u0015\u008a\u0002Õp\u000f\u0000BîÚÝ\u0018Ì_º\u0089©Õ\u00981\u0087pu¹dàS&BE0\u00ad\u001f\f\u000eNü\u0090ëÞÚ\u000eÉTé\u007f\u0007ÿ4/%iS\u0089@þq!nY\u009c\u008d\u008dÀÍ\u0002#\u009d\u0010M\u0001\bwÂd\u009fUZJ?¸ü©¶\u009eA\u008f#ýûÒU\u0000IîÖÝ\u0006ÌCº\u0089©Ô\u0098\u0011\u0087tu·dýS\nBh0°\u001f\u001e\u000evü\u009cëÃÚ\u001fÉC·\u008f¦ù\u0095%÷Õ\u0019~*¥;áM\u0019^`o\u009apé\u0082>\u0000cîÔÝ\u001bÌ\u001fº\u008d©Ê\u0098\u0003\u0087gu·dýS`Bm0¡\u001f\t\u000eSü\u0096ëÕÚEÉG·\u0085¦ï\u0095y\u0084Vr\u0099aÊP\u0002>\u009a-ï\u001c\u001d\u000bJù\u009d\u001f\u008bñ\u0019ÂÇÓ\u0093¥G¶0\u0087É\u0098»jf{\u0016Lè] /m\u0000Ý\u0011\u008fã~ô\u001eÅßÖ\u0095¨C¹5\u008aõ\u009b§\u0000LîÞÝ\u0000ÌTº\u0080©÷\u0098\u000e\u0087|u¡dÚS B}0¡\u001f\r\u000eIü\u0081ëÙÚ\u001fÉO·\u0080¦ð\u0095\u001b\u0084{r¾aüP&>\u0090-Ü\u001c\u0006\u0001\u0012ï\u0080Ü^Í\n»Þ¨©\u0099P\u0086\"tÿe\u009fRuC 1û\u001eS\u000f\u0000ýÎê\u008aÛcÈ\u0011¶Û§§\u0094f\u0085\rsæ`¢Qr?Í,\u0086\u001d^\n\u0018ø×é·ÖWÇ6µü¢ª\u0093|\u0080<nî\u008aÌd^W\u0080FÔ0\u0000#w\u0012\u008e\rüÿ!îAÙ«Èþº%\u0095\u008d\u0084Þv\u0010aTP½CÏ=\u0005,y\u001f¸\u000eÞø$ë{Ú·´\u001b§W\u0096\u0091\u0081Ý\u0000LîÞÝ\u0000ÌTº\u0080©÷\u0098\u000e\u0087|u¡dÁS+B~0¥\u001f\r\u000e^ü\u0090ëÔÚ=ÉO·\u0085¦ù\u00958\u0084_r¬aæP6>\u009f-Õ\u001c8\u000bFù\u0099èÑ×\u0005Æu´³£ã\u0000AîßÝ?Ì_º\u008a©È\u0000LîÞÝ\u0000ÌTº\u0080©÷\u0098\u000e\u0087|u¡dÝS/B}0\u00ad\u001f\t\u000e_ü´ëÔ\u0000NîÚÝ\u0002ÌXº\u009a©Â\u0098#\u0087yu\u0094dòS7Bf0±\u001f\u000b\u0000LîÞÝ\u0000ÌTº\u0080©÷\u0098\u000e\u0087|u¡dÝS/B}0\u00ad\u001f\t\u000e_ü´ëÔÚ'ÉO·\u0092¦è\u00952\u0084|r¨aú\fZâÈÑ\u0016ÀB¶\u0096¥á\u0094\u0018\u008bjy·hÈ_=N{<»\u0013\b\u0002zð\u008açÃÖ\n\u0000AîßÝ\u0017ÌAº\u0098©Â\u0098\u0010\u0087Su¹dçS'B\u007f0¡\u001f>\u000e^ü±ëÑÚ\u001fÉG\u0000NîÚÝ\u0002ÌXº\u009a©Â\u0098#\u0087yu\u008edúS+B~0\u008c\u001f\u0010\u000eVü\u0091ëÕÚ\u0019\u0000IîÕÝ\u0002ÌTº\u009e©É\u0098\u0003\u0087qu\u0096dòS:B`0²\u001f\u001a\u000e{ü\u0091ëüÚ\u0002ÉU·\u0095¦ù\u00959\u0084wr¿Pº¾.\u008dö\u009c¬ênù6È××\u008d%m4\u0003\u0003Û\u0012\u008d`DOî^¼¬H»*\u008aë\u0099·çgö\u000eÅÂÔ\u0085\"\\î¨\u0000<3ä\"¾T|G$vÅi\u009f\u009bz\u008a\u0014½Ü¬\u008eÞkñ÷à¨\u0012v\u0005$4ë'¡YdH\u001f\u0000NîÚÝ\u0002ÌXº\u009a©Â\u0098#\u0087yu\u0091dýS:Bl0¶\u001f\u001e\u000eYü\u0081ëÙÚ\u0004ÉH·\u00ad¦õ\u0095$\u0084fr¨aæP&>\u008c\u008eÝ`IS\u0091BË4\t'Q\u0016°\têû\u0002ênÝ©Ìÿ¾%\u0091\u008a\u0080Èr\u0005eF\u0000NîÚÝ\u0002ÌXº\u009a©Â\u0098#\u0087yu\u0094düS/Bm0\u0088\u001f\u0016\u000eIü\u0081ëÕÚ\u0005ÉC·\u0093\u0000NîÚÝ\u0002ÌXº\u009a©Â\u0098#\u0087yu\u008bdþS/Bz0¬\u001f3\u000eSü\u0086ëÄÚ\u000eÉH·\u0084¦î\u0005ÎëZØ\u0082ÉØ¿\u001a¬B\u009d£\u0082ùp\u000eazV«Gþ5\u0006\u001a\u0096\u000bÔù\u0011îUß\u0099Ìï²\u000f£h\u0090²\u0081àw+diU ;\u001b\u0000AîßÝ2ÌPº\u0098©Æ¼kRùa'ps\u0006§\u0015Ð$);[É\u0086Øõï\rþg\u008c\u008d£>²r\u008cÞbLQ\u0092@Æ6\u0012%e\u0014\u009c\u000bîù3èCß½Îõ¼8\u0093\u0088\u0082Úp&gFV¯EÝ;\u0016*y\u0000cîÔÝ\u001bÌ\u001fº\u0099©É\u0098\u000b\u0087iu¡d S*B'0©\u001f\u001a\u000e^ü\u009cëÑÚ\u001fÉO·\u008e¦ò\u0095y\u0084pr¬aæP->\u009b-Ë\u001cZ\u000bcù\u008fèÓ×\u0005Æw´\u0086£ý\u0092-\u0081~o\u0080^\u001cMV;\u009d*Ë\u0019\u001b\beö»åÌÔ<Ãu±¼\u0000LîÞÝ\u0000ÌTº\u0080©÷\u0098\u000e\u0087|u¡dÑS/Bg0ª\u001f\u001a\u000eHü´ëÔÚ=ÉO·\u0084¦ë\u0095\u001b\u0084{r¾aüP&>\u0090-Ü\u001c\u0006\u0000IîÉÝ\u0019Ì_º¿©È\u0098\u0017\u0087ou»döS\u000fBm0·\u001f9\u000eUü\u0087ëÝÚ\nÉR\u008c%b½Q\u007f@86î%²\u0014D\u000b\u001eùöè\u009aßOÎ\u0001\u0000BîÚÝ\u0018Ì_º\u0089©Õ\u0098#\u0087yu\u008adöS?B|0¡\u001f\f\u000eN\u0000BîÚÝ\u0018Ì_º\u0089©Õ\u0098#\u0087yu\u008edúS+B~\u0088\ff»UtDp2ö!¦\u0010d\u000f\u0006ýÎìÏÛEÊH¸Â\u0097b\u0086:tôc¬RkA<?ü.\u0090\u001d]\f\u001cúÆé\u0094Ø\u0002¶ó¥·\u0094u\u0083.qà`¸_!N6<Ø+\u0090\u001aM\t\rçßÖSÅ3³Ê¢¨\u0091c\u0080<\u001cæò~Á¼Ðû¦-µq\u0084\u0087\u009bÝi*x^O\u008f^Ú,,\u0003²\u0012íà%÷qÆ¡Õç«7+:Å¦öqç'\u0091í\u0082§³e¬\u0007^ßO\u0089x\\i\u0016\u001bö4h\u0000IîÕÝ\u0002ÌTº\u009e©Ô\u0098\u0016\u0087tu¬dúS/Be0\u0085\u001f\u001b\u000esü\u009bëÖÚ\u0004\u0000IîÕÝ\u0002ÌTº\u009e©Ô\u0098\u0016\u0087tu¬dúS/Be0\u0085\u001f\u001b\u000evü\u009cëÃÚ\u001fÉC·\u008f¦ù\u0095%\u0000IîÕÝ\u0002ÌTº\u009e©Ô\u0098\u0016\u0087tu¬dúS/Be0\u0085\u001f\u001b\u000ehü\u0090ëÁÚ\u001eÉC·\u0092¦è;«Õ'æø÷©\u0081g\u0092:£þ¼\u0080N`_\u000e\u0000RîÞÝ\u0001ÌPº\u009e©Ã\u0098\u0007\u0087yu\u0099d÷S\u0007Bg0¢\u001f\u0010U\u0004»\u0088\u0088W\u0099\u0006ïÈü\u0095ÍQÒ/ Ï1¡\u0006T\u00176eáJ][\t©Í¾\u0083\u008fO\u0000RîÞÝ\u0001ÌPº\u009e©Ã\u0098\u0007\u0087yu\u0099d÷S\u001cBl0µ\u001f\n\u000e_ü\u0086ëÄ\u0000LîÞÝ\u0000ÌTº\u0080©÷\u0098\u000e\u0087|u¡dÚS B}0¡\u001f\r\u000eIü\u0081ëÙÚ\u001fÉO·\u0080¦ð\u0095\u0016\u0084v\u009cVrÄA\u001aPN&\u009a5í\u0004\u0014\u001bfé»øÀÏ:Þg¬»\u0083\u0017\u0092S`\u009bwÃF\u0005UU+\u009a:ê\t\f\u0018lî\u009býûÌ*¢\u0090±Æ\u0080\u0000\u0097Pe\u0082Ñ\u001a?\u0088\fV\u001d\u0002kÖx¡IXV*¤÷µ\u0097\u0082}\u0093(áóÎ[ß\b-Æ:\u0082\u000b|\u0018\u0014ÓÂ=P\u000e\u008e\u001fÚi\u000ezyK\u0080Tò¦/·O\u0080¥\u0091ðã+Ì\u0083ÝÐ/\u001e8Z\t¤\u001aÌd#u{FªWè¡&²h\u0083¨í\u0002ÿ^\u0011Ì\"\u00123FE\u0092Våg\u001cxn\u008a³\u009bÓ¬9½lÏ·à\u001fñL\u0000LîÞÝ\u0000ÌTº\u0080©÷\u0098\u000e\u0087|u¡dÚS#By0¶\u001f\u001a\u000eIü\u0086ëÙÚ\u0004ÉH·¥¦ý\u0095#\u0084s\u0000LîÞÝ\u0000ÌTº\u0080©÷\u0098\u000e\u0087|u¡dÚS#By0¶\u001f\u001a\u000eIü\u0086ëÙÚ\u0004ÉH·¥¦ý\u0095#\u0084sr\u0081aáP0>\u008a-Ü\u001c\u001a\u000bJù\u0098úô\u0014M'\u00916ò@\u0013SUb\u0092}ë\u008f&\u009ee©³¸îÊ\u0019å\u008dôÄ\u0006\u0003\u0000gîÞÝ\u0002Ìsº\u008d©É\u0098\f\u0087xuªdßS/Bp0«\u001f\n\u000eNü¥ëÜÚ\nÉE·\u0084¦ñ\u00952\u0084|r¹aÆP\">\u0093-Ü]ò³K\u0080\u0097\u0091íç\u0014ôBÅ\u0085Úí(>9u\u000e²\u001fóm?B®SÎ¡\u0014¶D\u0087´\u0094Àê\u001bûgdÁ\u008a\u007f¹²¨ØÞ!Íwü°ãØ\u0011\u000b\u0000@7\u0087&ÆT\n{\u009bjû\u0098!\u008fq¾\u0087\u00adïÓ2ÂHñ\u0092àÜ\u0016\b\u0005Z\u0000rîÞÝ\u001bÌ^º\u009a©Â\u0098+\u0087pu¨dáS+Bz0·\u001f\u0016\u000eUü\u009bëôÚ\nÉR·\u0080¦Ð\u0095>\u0084ar¹aíP->\u009b-Ë1.ß\u0097ìKý4\u008bÀ\u0098\u0098©N¶8DÁU¶bfs9\u0001Ä.[?\u0003ÍÎÚ\u009cëQø\u001c\u0086Á\u0097º¤pµ\u001fCåPµak\u000fý\u001c\u0083-R:\bÏ¸!\u0006\u0012Ë\u0003¤uPf\bWÞH¨ºQ«&\u009cö\u008d©ÿTÐËÁ\u00933^$\f\u0015Á\u0006\u008cxQi*ZàK\u0087½}®\"\u009fîñBâ\u000eÓÈÄ\u0084\u0000rîÞÝ\u001bÌ^º\u009a©Â\u0098.\u0087xu®döS\"BY0¨\u001f\u001e\u000eCü¼ëÝÚ\u001bÉT·\u0084¦ï\u0095$\u0084{r¢aæP\u000f>\u0097-Ê\u001c\u0000\u000bJù\u0084èÀ×\u0012\u0000sîÞÝ\u0002Ì\u007fº\u008d©Ó\u0098\u000b\u0087ku½dÒS*BE0\u00ad\u001f\f\u000eNü\u0090ëÞÚ\u000eÉT\u0000gîÞÝ\u0002Ìbº\u0089©Õ\u0098\u0014\u0087xuªd×S/B}0¥".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1642);
        f1030 = cArr;
        f1028 = -7737270007047524677L;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1142(LevelPlayNativeAd levelPlayNativeAd, LevelPlayNativeAdListener levelPlayNativeAdListener) {
        int i10 = f1027 + 19;
        f1029 = i10 % 128;
        int i11 = i10 % 2;
        m1159(levelPlayNativeAd, levelPlayNativeAdListener);
        int i12 = f1027 + 1;
        f1029 = i12 % 128;
        if ((i12 % 2 == 0 ? ':' : '\\') != ':') {
            return;
        }
        int i13 = 6 / 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1145(IronSourceBannerLayout ironSourceBannerLayout) {
        int i10 = f1027 + 83;
        f1029 = i10 % 128;
        if ((i10 % 2 == 0 ? '@' : (char) 19) == 19) {
            return m1152(ironSourceBannerLayout);
        }
        m1152(ironSourceBannerLayout);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1153(LevelPlayImpressionData levelPlayImpressionData) {
        int i10 = f1027 + 119;
        f1029 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        JSONObject jSONObjectM1149 = m1149(levelPlayImpressionData);
        if (z10) {
            int i11 = 35 / 0;
        }
        int i12 = f1029 + 117;
        f1027 = i12 % 128;
        int i13 = i12 % 2;
        return jSONObjectM1149;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1156(Placement placement) {
        int i10 = f1029 + 49;
        f1027 = i10 % 128;
        int i11 = i10 % 2;
        if (placement == null) {
            return null;
        }
        String placementName = placement.getPlacementName();
        int i12 = f1027 + 115;
        f1029 = i12 % 128;
        if (i12 % 2 != 0) {
            return placementName;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1160(ImpressionDataListener impressionDataListener) {
        int i10 = f1029 + 31;
        f1027 = i10 % 128;
        int i11 = i10 % 2;
        m1157(impressionDataListener);
        int i12 = f1027 + 15;
        f1029 = i12 % 128;
        if ((i12 % 2 == 0 ? 'H' : 'W') != 'H') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1143(ImpressionDataListener impressionDataListener) {
        int i10 = f1029 + 37;
        f1027 = i10 % 128;
        int i11 = i10 % 2;
        m1150(impressionDataListener);
        int i12 = f1029 + 21;
        f1027 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1146(AdData adData) {
        int i10 = f1027 + 87;
        f1029 = i10 % 128;
        if (i10 % 2 == 0) {
            m1155(adData);
            throw null;
        }
        String strM1155 = m1155(adData);
        int i11 = f1027 + 111;
        f1029 = i11 % 128;
        int i12 = i11 % 2;
        return strM1155;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1152(IronSourceBannerLayout ironSourceBannerLayout) {
        int i10 = f1029 + 87;
        f1027 = i10 % 128;
        int i11 = i10 % 2;
        String placementName = ironSourceBannerLayout.getPlacementName();
        int i12 = f1029 + 29;
        f1027 = i12 % 128;
        if ((i12 % 2 != 0 ? '9' : ',') != '9') {
            return placementName;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x0165  */
    /* JADX WARN: Code duplicated, block: B:79:0x03a3  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        char c10;
        char c11;
        char c12;
        char c13;
        byte b10 = 1;
        switch (str.hashCode()) {
            case -2063883567:
                b10 = (str.equals(m1154(616 - TextUtils.getTrimmedLength(""), (char) (3094 - (ViewConfiguration.getPressedStateDuration() >> 16)), TextUtils.lastIndexOf("", '0', 0) + 19).intern()) ? 'a' : 'G') == 'a' ? (byte) 25 : (byte) -1;
                break;
            case -2054763962:
                b10 = !str.equals(m1154(591 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), 24 - TextUtils.indexOf((CharSequence) "", '0')).intern()) ? (byte) -1 : (byte) 24;
                break;
            case -2044561387:
                b10 = !str.equals(m1154(719 - KeyEvent.normalizeMetaState(0), (char) (TextUtils.getTrimmedLength("") + 61158), 21 - Color.red(0)).intern()) ? (byte) -1 : (byte) 30;
                break;
            case -2012752057:
                b10 = !str.equals(m1154(TextUtils.indexOf("", "", 0) + 1230, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 22 - ExpandableListView.getPackedPositionChild(0L)).intern()) ? (byte) -1 : (byte) 55;
                break;
            case -1879025222:
                b10 = !str.equals(m1154((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 357, (char) (63377 - Drawable.resolveOpacity(0, 0)), TextUtils.getOffsetAfter("", 0) + 9).intern()) ? (byte) -1 : (byte) 14;
                break;
            case -1810844504:
                b10 = (str.equals(m1154(1076 - TextUtils.indexOf("", "", 0, 0), (char) (7332 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 20).intern()) ? (byte) 0 : (byte) 1) == 0 ? (byte) 46 : (byte) -1;
                break;
            case -1704786309:
                b10 = !str.equals(m1154(90 - KeyEvent.keyCodeFromString(""), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 20 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -1678289205:
                b10 = str.equals(m1154((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42, (char) ExpandableListView.getPackedPositionGroup(0L), 48 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern()) ? false : true ? (byte) -1 : (byte) 3;
                break;
            case -1555060867:
                b10 = !str.equals(m1154((ViewConfiguration.getTouchSlop() >> 8) + 1303, (char) (Color.argb(0, 0, 0, 0) + 54158), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 27).intern()) ? (byte) -1 : (byte) 58;
                break;
            case -1406023077:
                b10 = !str.equals(m1154((-16777106) - Color.rgb(0, 0, 0), (char) (10131 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 49 - MotionEvent.axisFromString("")).intern()) ? (byte) -1 : (byte) 5;
                break;
            case -1282106699:
                if (str.equals(m1154(TextUtils.indexOf((CharSequence) "", '0', 0) + 895, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 50 - TextUtils.getTrimmedLength("")).intern())) {
                    c10 = '#';
                    c11 = '#';
                } else {
                    c10 = '#';
                    c11 = 27;
                }
                if (c11 == c10) {
                    int i10 = f1029 + 107;
                    f1027 = i10 % 128;
                    int i11 = i10 % 2;
                    b10 = 39;
                } else {
                    b10 = -1;
                }
                break;
            case -1276273849:
                b10 = !str.equals(m1154(335 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getTouchSlop() >> 8) + 22).intern()) ? (byte) -1 : (byte) 13;
                break;
            case -1115843213:
                b10 = !str.equals(m1154(Gravity.getAbsoluteGravity(0, 0) + Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, (char) (52555 - TextUtils.indexOf("", "", 0, 0)), 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 12;
                break;
            case -1088585376:
                if (!str.equals(m1154(944 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), View.MeasureSpec.getMode(0) + 29).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f1027 + 7;
                    f1029 = i12 % 128;
                    b10 = i12 % 2 != 0 ? (byte) 40 : (byte) 92;
                }
                break;
            case -989825485:
                b10 = !str.equals(m1154(AndroidCharacter.getMirror('0') + 586, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 20 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 26;
                break;
            case -838208757:
                b10 = !str.equals(m1154(653 - TextUtils.getOffsetBefore("", 0), (char) Color.argb(0, 0, 0, 0), Color.blue(0) + 18).intern()) ? (byte) -1 : (byte) 27;
                break;
            case -643050252:
                b10 = (str.equals(m1154((ViewConfiguration.getScrollDefaultDelay() >> 16) + HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION, (char) (Drawable.resolveOpacity(0, 0) + 18903), (ViewConfiguration.getFadingEdgeLength() >> 16) + 45).intern()) ? (char) 19 : '9') == '9' ? (byte) -1 : (byte) 7;
                break;
            case -609786639:
                b10 = !str.equals(m1154(View.MeasureSpec.getMode(0) + 1171, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 15352), 10 - Gravity.getAbsoluteGravity(0, 0)).intern()) ? (byte) -1 : (byte) 51;
                break;
            case -559540471:
                b10 = !str.equals(m1154((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 488, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35456), 29 - ImageFormat.getBitsPerPixel(0)).intern()) ? (byte) -1 : (byte) 19;
                break;
            case -498709917:
                b10 = !str.equals(m1154(1127 - Process.getGidForName(""), (char) (KeyEvent.getMaxKeyCode() >> 16), AndroidCharacter.getMirror('0') - 26).intern()) ? (byte) -1 : (byte) 49;
                break;
            case -498060603:
                if (!str.equals(m1154(15 - (Process.myPid() >> 22), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 9 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    b10 = -1;
                }
                break;
            case -393802555:
                b10 = !str.equals(m1154(1195 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 21846), 19 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 53;
                break;
            case -284636416:
                b10 = !str.equals(m1154((ViewConfiguration.getPressedStateDuration() >> 16) + 1004, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14).intern()) ? (byte) -1 : (byte) 43;
                break;
            case -154075626:
                b10 = !str.equals(m1154(804 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21).intern()) ? (byte) -1 : (byte) 34;
                break;
            case -153002112:
                if (!str.equals(m1154(TextUtils.lastIndexOf("", '0', 0, 0) + 1032, (char) ((Process.myPid() >> 22) + 34927), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 45).intern())) {
                    b10 = -1;
                } else {
                    int i13 = f1029 + 71;
                    f1027 = i13 % 128;
                    int i14 = i13 % 2;
                    b10 = 45;
                }
                break;
            case 30304559:
                b10 = !str.equals(m1154(TextUtils.indexOf("", "") + 518, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 36 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 20;
                break;
            case 85893348:
                b10 = !str.equals(m1154((ViewConfiguration.getWindowTouchSlop() >> 8) + 973, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19).intern()) ? (byte) -1 : (byte) 41;
                break;
            case 149942051:
                b10 = !str.equals(m1154((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 312, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 59701), 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 11;
                break;
            case 204617641:
                b10 = !str.equals(m1154(1284 - KeyEvent.keyCodeFromString(""), (char) ((Process.myTid() >> 22) + 53590), (ViewConfiguration.getEdgeSlop() >> 16) + 19).intern()) ? (byte) -1 : (byte) 57;
                break;
            case 204897024:
                b10 = !str.equals(m1154((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1150, (char) View.MeasureSpec.getMode(0), View.MeasureSpec.getSize(0) + 21).intern()) ? (byte) -1 : (byte) 50;
                break;
            case 307677661:
                b10 = !str.equals(m1154(991 - ImageFormat.getBitsPerPixel(0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 35942), 12 - TextUtils.getTrimmedLength("")).intern()) ? (byte) -1 : ExifInterface.START_CODE;
                break;
            case 308060116:
                b10 = !str.equals(m1154(1019 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 44;
                break;
            case 320151695:
                if (!str.equals(m1154(Gravity.getAbsoluteGravity(0, 0) + 1096, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 11123), 13 - MotionEvent.axisFromString("")).intern())) {
                    b10 = -1;
                } else {
                    int i15 = f1029 + 69;
                    f1027 = i15 % 128;
                    if (i15 % 2 != 0) {
                        c13 = 23;
                        c12 = 23;
                    } else {
                        c12 = ' ';
                        c13 = 23;
                    }
                    b10 = c12 == c13 ? (byte) 100 : (byte) 47;
                }
                break;
            case 334118616:
                b10 = !str.equals(m1154(397 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (8135 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 23 - (KeyEvent.getMaxKeyCode() >> 16)).intern()) ? (byte) -1 : (byte) 16;
                break;
            case 663296747:
                b10 = !str.equals(m1154(24 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 18).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 766880816:
                b10 = str.equals(m1154(TextUtils.lastIndexOf("", '0', 0) + 826, (char) (1408 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getEdgeSlop() >> 16) + 27).intern()) ? false : true ? (byte) -1 : (byte) 35;
                break;
            case 779287609:
                b10 = !str.equals(m1154(220 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) View.MeasureSpec.getMode(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 23).intern()) ? (byte) -1 : (byte) 8;
                break;
            case 823061407:
                b10 = str.equals(m1154((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 766, (char) (KeyEvent.keyCodeFromString("") + 36499), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17).intern()) ? false : true ? (byte) -1 : (byte) 32;
                break;
            case 846220331:
                if (!str.equals(m1154(1346 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), Drawable.resolveOpacity(0, 0) + 23).intern())) {
                    b10 = -1;
                } else {
                    int i16 = f1029 + 103;
                    f1027 = i16 % 128;
                    if (i16 % 2 == 0) {
                        b10 = 60;
                    } else {
                        b10 = 52;
                    }
                }
                break;
            case 894546539:
                b10 = (str.equals(m1154(671 - TextUtils.getOffsetAfter("", 0), (char) ExpandableListView.getPackedPositionType(0L), 23 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern()) ? '<' : '#') == '<' ? (byte) 28 : (byte) -1;
                break;
            case 1052532031:
                if (!str.equals(m1154(1180 - TextUtils.lastIndexOf("", '0'), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 14 - View.getDefaultSize(0, 0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 52;
                }
                break;
            case 1069602180:
                if (!str.equals(m1154((ViewConfiguration.getKeyRepeatDelay() >> 16) + 695, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20724), ((byte) KeyEvent.getModifierMetaStateMask()) + 25).intern())) {
                    b10 = -1;
                } else {
                    b10 = 29;
                    int i17 = f1029 + 25;
                    f1027 = i17 % 128;
                    int i18 = i17 % 2;
                }
                break;
            case 1081984916:
                b10 = !str.equals(m1154(783 - TextUtils.lastIndexOf("", '0', 0), (char) (Process.getGidForName("") + 1), (Process.myPid() >> 22) + 20).intern()) ? (byte) -1 : (byte) 33;
                break;
            case 1180349927:
                if (!str.equals(m1154(ExpandableListView.getPackedPositionChild(0L) + 243, (char) (49584 - TextUtils.getOffsetBefore("", 0)), 50 - View.MeasureSpec.getSize(0)).intern())) {
                    b10 = -1;
                } else {
                    int i19 = f1029 + 39;
                    f1027 = i19 % 128;
                    int i20 = i19 % 2;
                    b10 = 9;
                }
                break;
            case 1226831433:
                b10 = !str.equals(m1154(KeyEvent.keyCodeFromString("") + 858, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 48167), MotionEvent.axisFromString("") + 16).intern()) ? (byte) -1 : (byte) 37;
                break;
            case 1266525324:
                if (!str.equals(m1154(AndroidCharacter.getMirror('0') + 825, (char) (ImageFormat.getBitsPerPixel(0) + 35987), 21 - Color.alpha(0)).intern())) {
                    b10 = -1;
                } else {
                    int i21 = f1029 + 99;
                    f1027 = i21 % 128;
                    if (i21 % 2 == 0) {
                        b10 = 38;
                    } else {
                        b10 = 21;
                    }
                }
                break;
            case 1267145181:
                b10 = !str.equals(m1154((KeyEvent.getMaxKeyCode() >> 16) + 1110, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 18).intern()) ? (byte) -1 : (byte) 48;
                break;
            case 1304950957:
                if (!str.equals(m1154(ViewConfiguration.getLongPressTimeout() >> 16, (char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15).intern())) {
                    b10 = -1;
                } else {
                    int i22 = f1027 + 121;
                    f1029 = i22 % 128;
                    int i23 = i22 % 2;
                    b10 = 0;
                }
                break;
            case 1325013503:
                b10 = !str.equals(m1154(Color.red(0) + 1368, (char) (ViewConfiguration.getTapTimeout() >> 16), 31 - TextUtils.indexOf("", "")).intern()) ? (byte) -1 : (byte) 61;
                break;
            case 1432059210:
                b10 = !str.equals(m1154(TextUtils.getCapsMode("", 0, 0) + 449, (char) (Drawable.resolveOpacity(0, 0) + 350), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 39).intern()) ? (byte) -1 : (byte) 18;
                break;
            case 1517126868:
                b10 = !str.equals(m1154(160 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (View.combineMeasuredStates(0, 0) + 9324), (ViewConfiguration.getTapTimeout() >> 16) + 15).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 1628896204:
                b10 = !str.equals(m1154(740 - (ViewConfiguration.getTouchSlop() >> 8), (char) KeyEvent.normalizeMetaState(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 28).intern()) ? (byte) -1 : (byte) 31;
                break;
            case 1715808775:
                b10 = !str.equals(m1154(1329 - MotionEvent.axisFromString(""), (char) (65298 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 15 - (Process.myTid() >> 22)).intern()) ? (byte) -1 : (byte) 59;
                break;
            case 1773831812:
                b10 = !str.equals(m1154(577 - View.resolveSize(0, 0), (char) View.resolveSize(0, 0), TextUtils.indexOf("", "", 0, 0) + 14).intern()) ? (byte) -1 : (byte) 23;
                break;
            case 1870849118:
                if ((str.equals(m1154(1214 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern()) ? (byte) 0 : (byte) 1) == 0) {
                    b10 = 54;
                } else {
                    b10 = -1;
                }
                break;
            case 1910059890:
                b10 = !str.equals(m1154(560 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) Color.alpha(0), 16 - MotionEvent.axisFromString("")).intern()) ? (byte) -1 : (byte) 22;
                break;
            case 1910219460:
                b10 = !str.equals(m1154(292 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) Color.blue(0), 19 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case 1955369613:
                b10 = !str.equals(m1154(851 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), View.resolveSize(0, 0) + 6).intern()) ? (byte) -1 : (byte) 36;
                break;
            case 1955530641:
                if (!str.equals(m1154(View.MeasureSpec.makeMeasureSpec(0, 0) + 554, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 7).intern())) {
                    b10 = -1;
                } else {
                    b10 = 21;
                }
                break;
            case 2019413793:
                b10 = !str.equals(m1154(366 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 31 - Color.blue(0)).intern()) ? (byte) -1 : (byte) 15;
                break;
            case 2019599576:
                if (!str.equals(m1154(468 - AndroidCharacter.getMirror('0'), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), ImageFormat.getBitsPerPixel(0) + 30).intern())) {
                    b10 = -1;
                } else {
                    int i24 = f1027 + 15;
                    f1029 = i24 % 128;
                    if (i24 % 2 != 0) {
                        b10 = 17;
                    } else {
                        b10 = 54;
                    }
                }
                break;
            case 2102577435:
                b10 = !str.equals(m1154(1252 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (39962 - (Process.myTid() >> 22)), (ViewConfiguration.getTapTimeout() >> 16) + 31).intern()) ? (byte) -1 : (byte) 56;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return AbstractAdapter.class;
            case 1:
                return Placement.class;
            case 2:
            case 3:
                return ControllerActivity.class;
            case 4:
            case 5:
                return InterstitialActivity.class;
            case 6:
            case 7:
                return OpenUrlActivity.class;
            case 8:
            case 9:
                return IronSourceBannerLayout.class;
            case 10:
                return BannerSmashListener.class;
            case 11:
                return IronSource.class;
            case 12:
                return ImpressionData.class;
            case 13:
                return ImpressionDataListener.class;
            case 14:
            case 15:
                return DTBAdView.class;
            case 16:
                return LevelPlayBannerListener.class;
            case 17:
                return LevelPlayInterstitialListener.class;
            case 18:
                return LevelPlayRewardedVideoAutomaticListener.class;
            case 19:
                return LevelPlayRewardedVideoListener.class;
            case 20:
                return LevelPlayRewardedVideoManualListener.class;
            case 21:
                return AdInfo.class;
            case 22:
                return LevelPlayNativeAd.class;
            case 23:
                return NativeAdLayout.class;
            case 24:
                return LevelPlayNativeAdListener.class;
            case 25:
                return LevelPlayMediaView.class;
            case 26:
                return AdapterNativeAdData.class;
            case 27:
                return NativeAdViewHolder.class;
            case 28:
                return InternalNativeAdListener.class;
            case 29:
                return NativeAdAdapterInterface.class;
            case 30:
                return NativeAdDataInterface.class;
            case 31:
                return NativeAdInteractionListener.class;
            case 32:
                return NativeAdInterface.class;
            case 33:
                return NativeAdLoadListener.class;
            case 34:
                return NativeAdSmashListener.class;
            case 35:
                return NativeAdViewBinderInterface.class;
            case 36:
                return AdData.class;
            case 37:
                return LevelPlayAdInfo.class;
            case 38:
            case 39:
                return LevelPlayBannerAdView.class;
            case 40:
                return LevelPlayBannerAdViewListener.class;
            case 41:
                return IronSourceAds.AdFormat.class;
            case 42:
                return BannerAdInfo.class;
            case 43:
                return BannerAdRequest.class;
            case 44:
            case 45:
                return BannerAdView.class;
            case 46:
                return BannerAdViewListener.class;
            case 47:
                return InterstitialAd.class;
            case 48:
                return InterstitialAdInfo.class;
            case 49:
                return InterstitialAdListener.class;
            case 50:
                return InterstitialAdRequest.class;
            case 51:
                return RewardedAd.class;
            case 52:
                return RewardedAdInfo.class;
            case 53:
                return RewardedAdListener.class;
            case 54:
                return RewardedAdRequest.class;
            case 55:
                return LevelPlayInterstitialAd.class;
            case 56:
                return LevelPlayInterstitialAdListener.class;
            case 57:
                return LevelPlayRewardedAd.class;
            case 58:
                return LevelPlayRewardedAdListener.class;
            case 59:
                return LevelPlayReward.class;
            case 60:
                return LevelPlayImpressionData.class;
            case 61:
                return LevelPlayImpressionDataListener.class;
            default:
                return null;
        }
    }

    public bt(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1144(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        int i10 = f1027 + 117;
        f1029 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'I' : 'V';
        m1158(levelPlayImpressionDataListener);
        if (c10 != 'I') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1147(Placement placement) {
        int i10 = f1027 + 75;
        f1029 = i10 % 128;
        int i11 = i10 % 2;
        String strM1156 = m1156(placement);
        int i12 = f1029 + 25;
        f1027 = i12 % 128;
        if ((i12 % 2 != 0 ? 'Q' : '\t') == '\t') {
            return strM1156;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1148(ImpressionData impressionData) {
        int i10 = f1029 + 33;
        f1027 = i10 % 128;
        if ((i10 % 2 != 0 ? '@' : (char) 6) != '@') {
            return m1141(impressionData);
        }
        m1141(impressionData);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1157(ImpressionDataListener impressionDataListener) {
        int i10 = f1027 + 117;
        f1029 = i10 % 128;
        int i11 = i10 % 2;
        IronSource.removeImpressionDataListener(impressionDataListener);
        int i12 = f1027 + 37;
        f1029 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        map.put(m1154(TextUtils.lastIndexOf("", '0', 0, 0) + 1400, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 64147), 16 - Color.argb(0, 0, 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bt.m1147((Placement) list.get(0));
            }
        });
        map.put(m1154(1415 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 29).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bt.m1145((IronSourceBannerLayout) list.get(0));
            }
        });
        map.put(m1154(1443 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 23957), 21 - View.combineMeasuredStates(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bt.m1148((ImpressionData) list.get(0));
            }
        });
        map.put(m1154(TextUtils.indexOf("", "") + 1464, (char) (TextUtils.indexOf("", "", 0) + 25760), 24 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bt.m1143((ImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m1154((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1489, (char) Gravity.getAbsoluteGravity(0, 0), KeyEvent.keyCodeFromString("") + 28).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bt.m1160((ImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m1154(1516 - ImageFormat.getBitsPerPixel(0), (char) (12618 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 30 - Color.blue(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bt.m1153((LevelPlayImpressionData) list.get(0));
            }
        });
        map.put(m1154(((Process.getThreadPriority(0) + 20) >> 6) + 1547, (char) (53209 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 30 - View.combineMeasuredStates(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bt.m1151((LevelPlayImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m1154((ViewConfiguration.getEdgeSlop() >> 16) + 1577, (char) ((-1) - TextUtils.lastIndexOf("", '0')), 32 - ImageFormat.getBitsPerPixel(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bt.m1144((LevelPlayImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m1154(Color.red(0) + 1610, (char) ((-1) - Process.getGidForName("")), 19 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bt.m1142((LevelPlayNativeAd) list.get(0), (LevelPlayNativeAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1154(1629 - Drawable.resolveOpacity(0, 0), (char) TextUtils.indexOf("", "", 0), ExpandableListView.getPackedPositionGroup(0L) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bt.m1146((AdData) list.get(0));
            }
        });
        int i10 = f1027 + 83;
        f1029 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1151(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        int i10 = f1029 + 65;
        f1027 = i10 % 128;
        int i11 = i10 % 2;
        m1161(levelPlayImpressionDataListener);
        int i12 = f1027 + 5;
        f1029 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return;
        }
        int i13 = 80 / 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1158(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        int i10 = f1027 + 123;
        f1029 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        LevelPlay.removeImpressionDataListener(levelPlayImpressionDataListener);
        if (!z10) {
            throw null;
        }
        int i11 = f1029 + 21;
        f1027 = i11 % 128;
        if ((i11 % 2 != 0 ? ',' : '1') == '1') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1155(AdData adData) {
        int i10 = f1027 + 5;
        f1029 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            adData.getServerData();
            throw null;
        }
        String serverData = adData.getServerData();
        int i11 = f1029 + 93;
        f1027 = i11 % 128;
        if ((i11 % 2 != 0 ? (char) 0 : (char) 27) != 0) {
            return serverData;
        }
        int i12 = 14 / 0;
        return serverData;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        int i10 = f1027 + 5;
        f1029 = i10 % 128;
        int i11 = i10 % 2;
        try {
            try {
                String sdkVersion = LevelPlay.getSdkVersion();
                int i12 = f1029 + 99;
                f1027 = i12 % 128;
                if (!(i12 % 2 != 0)) {
                    return sdkVersion;
                }
                int i13 = 97 / 0;
                return sdkVersion;
            } catch (Throwable unused) {
                return IronSourceUtils.getSDKVersion();
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1154(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1030[i10 + i12]) ^ (((long) i12) * f1028)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1150(ImpressionDataListener impressionDataListener) {
        int i10 = f1029 + 19;
        f1027 = i10 % 128;
        int i11 = i10 % 2;
        IronSource.addImpressionDataListener(impressionDataListener);
        int i12 = f1027 + 117;
        f1029 = i12 % 128;
        if ((i12 % 2 == 0 ? 'O' : '6') == '6') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject m1149(LevelPlayImpressionData levelPlayImpressionData) {
        int i10 = f1027 + 61;
        f1029 = i10 % 128;
        if (i10 % 2 != 0) {
            return levelPlayImpressionData.getAllData();
        }
        levelPlayImpressionData.getAllData();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m1141(ImpressionData impressionData) {
        int i10 = f1029 + 39;
        f1027 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject allData = impressionData.getAllData();
        int i12 = f1027 + 47;
        f1029 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return allData;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1161(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        int i10 = f1029 + 89;
        f1027 = i10 % 128;
        int i11 = i10 % 2;
        LevelPlay.addImpressionDataListener(levelPlayImpressionDataListener);
        int i12 = f1027 + 27;
        f1029 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1159(LevelPlayNativeAd levelPlayNativeAd, LevelPlayNativeAdListener levelPlayNativeAdListener) {
        int i10 = f1029 + 55;
        f1027 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        levelPlayNativeAd.setListener(levelPlayNativeAdListener);
        if (!z10) {
        } else {
            throw null;
        }
    }
}
