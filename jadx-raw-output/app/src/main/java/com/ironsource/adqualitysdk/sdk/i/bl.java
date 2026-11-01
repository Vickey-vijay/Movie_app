package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
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
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.explorestack.iab.mraid.MraidActivity;
import com.explorestack.iab.mraid.MraidAdView;
import com.explorestack.iab.mraid.MraidDialogActivity;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.mraid.MraidInterstitialListener;
import com.explorestack.iab.mraid.MraidView;
import com.explorestack.iab.mraid.MraidViewListener;
import com.explorestack.iab.vast.VastViewListener;
import com.explorestack.iab.vast.activity.VastActivity;
import com.explorestack.iab.vast.activity.VastView;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.adcom.Ad;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.AdContentType;
import io.bidmachine.AdFullScreenListener;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdView;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachine;
import io.bidmachine.BidMachineAd;
import io.bidmachine.CreativeFormat;
import io.bidmachine.FullScreenAd;
import io.bidmachine.ImageData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerView;
import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import io.bidmachine.nativead.NativeAd;
import io.bidmachine.nativead.NativeListener;
import io.bidmachine.nativead.view.MediaView;
import io.bidmachine.nativead.view.NativeMediaView;
import io.bidmachine.nativead.view.VideoPlayerActivity;
import io.bidmachine.protobuf.EventTypeExtended;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import io.bidmachine.richmedia.RichMediaListener;
import io.bidmachine.richmedia.RichMediaView;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bl extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f858 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f859 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f860 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f861;

    static {
        char[] cArr = new char[1179];
        ByteBuffer.wrap("Q^\u001esÏ:¼ÖmàÚ\u008f\u008a4{\u0014(S\u0099ûF²6!\u0000AOK\u009e\u001díâ<Ò\u008b\u009fÛ\u007f*'y\fÈó\u0017¯gu¶QêÜ¥Öt\u0087\u0007yÖRa\u00061ëÀµ\u0093\u009c\u0000AOK\u009e\bíä<Ø\u008b\u008eÛuvB9Hè\u001b\u009bûJÓý\u0084\u00adJ\\)\u000f\t¾Áa°\u0011hÀ{s\t\"âÕ¶\u0084\u00964rç(\u0096\f\u0000AOK\u009e\u0012íä<Ï\u008b\u009fÛ\u007f*'y\u001dÈÕØA\u0097KF\f5èäÍS\u009e\u0003\u007fò:¡\f#!l+½lÎ\u0088\u001f\u00ad¨þø\u001f\tZZlë\u00974×D\u0017\u00955&nw\u0097\u0080ÕÑõa\r²]\u0000AOK\u009e-íÙ<Å\u008b\u009bÛ\u007f\u0000AOK\u009e\bíä<Ù\u008b\u009c\u0000BON\u009e0íã<Ù\u008b\u0099ÛV* y\u000bÈÓ\u0017³gk¶Q\u0005\u0011ù;¶7gI\u0014\u009aÅ rà\"5ÓY\u0080d1©\u0000iO@\u009epíï<Õ\u008b\u008fÛw*(y\u001bÈÏ\u0017¿gk¶Q\u0005MTð£ ò\u009eBq\u0091+à\u000f/\u0082~\u0099Îk\u001dWl\u0006»ò\n´Y£©Mø6Gõ\u0000BOF\u009e:íÀ<Ý\u008b\u0088Ûr* y\u0016ÈÂÂ«\u008d¯\\Ó/)þ4Ia\u0019\u009bèÉ»ÿ\n+Õ~¥\u0088o¥ »ñÝ\u0082\nS.äd´\u008aEÊ\u0016Ø§.xB\b\u008eÙ³jñoã èñ\u0095\u0082@Ssä\u0005´ÑE\u0097\u0016³\u0000IOA\u009e*íè<Î\u008b\u0098Ûn* y\fÈÎ\u0017·gi¶u\u0005\u0007ð£¿«nÀ\u001d\u0002Ì${r+\u0084ÚÊ\u0089æ8$ç]\u0097\u0083F\u0092õà¤\u000bS_\u0002\u007f²\u009baÁ\u0010å\u0000FOZ\u009e2íá<ï\u008b\u0088Ûh*,y\u001dÈÉ\u0017\u0097gac¯,¨ýØ\u008e\u0006_?èH¸\u008bIØ\u001aÿ«1t`\u0004\u009eÕ¦fäÒÄ\u009dÃL³?mîTY4\túø¥«\u0086\u0000iO@\u009epíï<Õ\u008b\u008fÛw*(y\u001bÈÏ\u0017¿gk¶Q\u0005MTü£ ò\u0084Bv\u00918à\u0018/Í~¿Î$\u001dOl\u0001»ò\n±YÛ©iø6Gæ\u0096Øå\u00815Y\u0084WÓ\b\"ë\u0000NON\u009e*íä<Ê\u008b\u008eÛ[*-\u0000NON\u009e*íä<Ê\u008b\u008eÛV* y\u000bÈÓ\u0017³gk¶Q\u0005\u0011zª5ªäÎ\u0097\u0000F.ñj¡³PÈ\u0003ø²*mS\u001d·Ì¹\u007fâ.\u0001&ZiB¸!Ëä\u001aÆ\u00ad\u0087ýw\f%_1îËè\\§Dv'\u0005âÔÀc\u00813qÂ#\u0091: Àÿ«\u008f\u007f^_í\u0003¼ùK½¿\u0014ð\u0000!{R£\u0083·4Èd8\u0095fÆ_w\u00ad¨ùØ0\t\u0006º@ëº\u001câMÄ\u0000ROF\u009e=íå<ñ\u008b\u008eÛ~* y\u0019Èñ\u0017¿g`¶C\u0000iO@\u009epíï<Õ\u008b\u008fÛw*(y\u001bÈÏ\u0017¿gk¶Q\u0005MTà£¨ò\u0093Bw\u0091#à\u0018/È~²Îk\u001d\u0017l:»þ\n¥Y\u009d©iø6Gæ\u0096Øå\u00815Y\u0084WÓ\b\"ëCC\fSÝ/®ý\u007fÆÈ®\u0098ci=:\u0014\u008b×T±$QõBF\u0002\u0017îà¢±\u008c\u0001~Ò\"\u0000iO@\u009epíï<Õ\u008b\u008fÛw*(y\u001bÈÏ\u0017¿gk¶Q\u0005MTü£ ò\u0084Bv\u00918à\u0018/Í~¿Î$\u001dOl\u0001»ò\n±YÛ©rø:Gæ\u0096Ôå\u008f5_\u0084RÓ\f\"åq®À\u0088\u0010h_;®óýßL\u0093\u009c}ë7:\u000b\t¯F¥\u008b%Ä5\u0015Wf\u008c·°\u0000ÂP\u0011¡UòyC¹\u009c×ì\u0019=%\u0000cO@\u009e3í£<Ù\u008b\u0093Ûj*%y\u0017ÈÕ\u0017³gv¶@\u0005\u0002Tñ£ªòÞBv\u0091/à\u001f/\u0082~¶Îx\u001dXl\u0001»ó\nèY¸©Vø2Gë\u0096Õå¡5l\u0084JÓ\u0004\"êq¢À\u008e\u0010P\u0000MO]\u009e?íä<Ø\u008b¯Ûs*(y\u0014ÈÈ\u0017±gD¶W\u0005\u0017Tû£·ò\u0099Bk\u00917¼óóÐ\"£Q3\u0080I7\u0003gú\u0096µÅ\u0087tE«#Ûæ\nÐ¹\u0092èa\u001f:NNþæ-¿\\\u008f\u0093\u0012Â&rè¡ÈÐ\u0091\u0007c¶xå(\u0015ÆD¢û{*EY4\u0089ö8Ïo\u0091\u009ecÍ<|+¬Úã¼\u0012~APð\u001c ðWª\u0000MO]\u009e?íä<Ø\u008b¢Ût*=y\u001dÈÕ\u0017¥gq¶]\u0005\u0017Tû£ ò\u009c\u0000MO]\u009e?íä<Ø\u008b¢Ût*=y\u001dÈÕ\u0017¥gq¶]\u0005\u0017Tû£ ò\u009cBS\u0091'à\u000e/Ø~¾Îd\u001d\\l\u001a\u0000MO]\u009e?íä<Ø\u008b½Ûs*,y\u000f\u0000cO@\u009e3í£<Ù\u008b\u0093Ûj*%y\u0017ÈÕ\u0017³gv¶@\u0005\u0002Tñ£ªòÞBv\u0091/à\u001f/\u0082~¶Îx\u001dXl\u0001»ó\nèY¸©Vø2Gë\u0096Õå¶5f\u0084[Ó\u001a@?\u000f/ÞM\u00ad\u0096|ªËÏ\u009b\u0001j^9}\u0088\u0099WÍ'\u0004ö2Et\u0014\u008eãÖ²ðpD?\\î?\u009dëLïû\u009a«|Z2\t\u001c¸Üg°\u0017n\u001dURv\u0083\u0005ð\u0095!ï\u0096¥Æ\\7\u0013d!Õã\n\u0085z@«v\u00184IÇ¾\u009cïè_@\u008c\u0019ý)2´c\u009bÓ]\u0000|q*¦\u008f\u0017\u0091D ´få\fZÂ\u008bîø¢(@\u0099&Î\r?Ël\u008eÝ¸\r^B\r³ÅàéQ¥\u0081Kö\u0001'=(Ïg×¶´Å`\u0014s£\u001bóæ\u0002§\u0084\u009cË¿\u001aÌi\\¸&\u000fl_\u0095®ÚýèL*\u0093Lã\u00892¿\u0081ýÐ\u000e'Uv!Æ\u0089\u0015Ðdà«}úRJ\u0094\u0099µèã?F\u008eXÝi-¯|ÅÃ\u000b\u0012'ak±\u0089\u0000ïWÄ¦\u0002õGDq\u0094\u0080ÛÎ*\u001dy>kÁ$Ñõ³\u0086hWTà&°òA\u0093\u0012\u009d£N|-\u0000cO@\u009e3í£<Ù\u008b\u0093Ûj*%y\u0017ÈÕ\u0017³gv¶@\u0005\u0002Tñ£ªòÞBv\u0091/à\u001f/\u0082~¶Îx\u001dXl\u0001»ó\nèY¸©Vø2Gë\u0096Õå¡5k\u0084hÓ\u0004\"ùq¼ù°¶¨gË\u0014\u001fÅ\frd\"\u0099ÓØ\u0080Ò1(îC\u009e\u0097O·üë\u00ad\u0011ZU\u0000ROJ\u009e/íø<Ù\u008b\u0098Ûn*\fy\u0000ÈÓ\u0017³gk¶G\u0005\nTý£¯¡\u0097îº?ÚL9\u009d%*hz\u009a\u008bÕØéi.¶gÆ\u0091\u0017©\u0000gOJ\u009e*íÛ<Õ\u008b\u008fÛ\u007f*&y9ÈÃ\u0017»\u0000gOJ\u009e*íÏ<É\u008b\u0085Û~*%y\u001d¥\u0013ê>;^H½\u0099¡.ì~\u001e\u008fQÜmmª\u0000gOJ\u009e*íÉ<Õ\u008b\u0098Ûj*%y\u0019ÈÞ\u0017\u0094gd¶Z\u0005\rT÷£³\u0000gOJ\u009e*íÏ<Ý\u008b\u0085Ût*,y\nÈâ\u0017®gq¶d\u0005\u0011Tý£µò\u009fBS\u0091'à\u000e/Ø\u0000gOJ\u009e*íÛ<Õ\u008b\u008fÛ\u007f*&#]lp½\u0010Îö\u001fâ¨¾øM\t\u0012Z+ëó\u0019\u0084V©\u0087Éô-%-\u0092mÂ\u00983Þ`òÑ2\u000eP~¯¯³\u0000gOJ\u009e*íÝ<Ð\u008b\u008aÛy*,y\u0015ÈÂ\u0017¸gq¶}\u0005\u0007\u0019îVÃ\u0087£ôE%Q\u00926Âê3°`\u0094\u000f§@\u008a\u0091êâ\u001e3\u0019\u0084GÔ¶%ìvÊÇ.\u0018r\u0000sOJ\u009e*íÄ<Ò\u008b\u009fÛ\u007f*;y\u000bÈÓ\u0017¿gq¶]\u0005\u0002Tþ£\u008dò\u0099Bl\u0091:à\u0018/Â~¾ÎxÎ\u009d\u0081¤PÄ#1ò7Er\u0015\u0095äÕ·ò\u0006,Ù\\©§x³Ëþ\u009a\bmJ<p\u008c\u0094_ÒÿO°va\u0016\u0012óÃát¹$HÕ\u0010\u008667×è\u0083\u0098JI|ú:«À\\\u0098\r¾\u0097 Ø\r\tmz\u008f«\u0083\u001cØL\r½|îP_\u0094\u0080þð\u000e!\u001a\u0092WÃ¡\u0000gOJ\u009e*íÏ<Å\u008b\u009fÛ\u007f*\u001ay\fÈÕ\u0017¿gk¶S\u00ad\u0012â&3Z@\u0098\u0091\u009f&ïv\u0018\u0087PÔfe°ºòÊ\u001a\u001b\u0017¨gù\u0090\u000eØ_îï\b".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1179);
        f861 = cArr;
        f858 = -1616313329768902865L;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m911(Ad ad2, int i10) {
        int i11 = f859 + 61;
        f860 = i11 % 128;
        int i12 = i11 % 2;
        String strM939 = m939(ad2, i10);
        int i13 = f860 + 115;
        f859 = i13 % 128;
        if (i13 % 2 == 0) {
            return strM939;
        }
        int i14 = 17 / 0;
        return strM939;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m917(Ad ad2) {
        int i10 = f860 + 9;
        f859 = i10 % 128;
        int i11 = i10 % 2;
        String strM906 = m906(ad2);
        int i12 = f860 + 75;
        f859 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 17 : (char) 18) == 18) {
            return strM906;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m924(Ad.Display display) {
        int i10 = f860 + 91;
        f859 = i10 % 128;
        int i11 = i10 % 2;
        String strM910 = m910(display);
        int i12 = f860 + 39;
        f859 = i12 % 128;
        if (i12 % 2 == 0) {
            return strM910;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ ByteString m928(Any any) {
        int i10 = f859 + 97;
        f860 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        ByteString byteStringM916 = m916(any);
        if (!z10) {
            int i11 = 6 / 0;
        }
        int i12 = f859 + 7;
        f860 = i12 % 128;
        int i13 = i12 % 2;
        return byteStringM916;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Ad.Display.Banner m936(Ad.Display display) {
        int i10 = f859 + 29;
        f860 = i10 % 128;
        int i11 = i10 % 2;
        Ad.Display.Banner bannerM929 = m929(display);
        int i12 = f860 + 93;
        f859 = i12 % 128;
        int i13 = i12 % 2;
        return bannerM929;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m906(Ad ad2) {
        int i10 = f860 + 25;
        f859 = i10 % 128;
        int i11 = i10 % 2;
        String id2 = ad2.getId();
        int i12 = f859 + 41;
        f860 = i12 % 128;
        if (i12 % 2 != 0) {
            return id2;
        }
        int i13 = 39 / 0;
        return id2;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Ad.Video m907(Ad ad2) {
        int i10 = f859 + 21;
        f860 = i10 % 128;
        if (i10 % 2 != 0) {
            return ad2.getVideo();
        }
        ad2.getVideo();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static List<Any> m908(Ad ad2) {
        int i10 = f860 + 25;
        f859 = i10 % 128;
        int i11 = i10 % 2;
        List<Any> extProtoList = ad2.getExtProtoList();
        int i12 = f860 + 95;
        f859 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 17 : (char) 24) == 24) {
            return extProtoList;
        }
        int i13 = 62 / 0;
        return extProtoList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m914(InterstitialAd interstitialAd, InterstitialListener interstitialListener) {
        int i10 = f860 + 69;
        f859 = i10 % 128;
        int i11 = i10 % 2;
        m921(interstitialAd, interstitialListener);
        int i12 = f860 + 121;
        f859 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m918(AdRequestParameters adRequestParameters) {
        int i10 = f859 + 23;
        f860 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 3 : '[') != '[') {
            m934(adRequestParameters);
            throw null;
        }
        String strM934 = m934(adRequestParameters);
        int i11 = f860 + 113;
        f859 = i11 % 128;
        int i12 = i11 % 2;
        return strM934;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m925(Ad ad2, int i10) {
        int i11 = f859 + 107;
        f860 = i11 % 128;
        char c10 = i11 % 2 == 0 ? '6' : (char) 25;
        String strM933 = m933(ad2, i10);
        if (c10 != 25) {
            int i12 = 4 / 0;
        }
        return strM933;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Ad.Display m930(Ad ad2) {
        int i10 = f860 + 5;
        f859 = i10 % 128;
        int i11 = i10 % 2;
        Ad.Display displayM909 = m909(ad2);
        int i12 = f860 + 55;
        f859 = i12 % 128;
        if (i12 % 2 == 0) {
            return displayM909;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Ad.Video m937(Ad ad2) {
        int i10 = f859 + 27;
        f860 = i10 % 128;
        int i11 = i10 % 2;
        Ad.Video videoM907 = m907(ad2);
        int i12 = f859 + 19;
        f860 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return videoM907;
        }
        int i13 = 30 / 0;
        return videoM907;
    }

    public bl(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m920(BannerView bannerView, BannerListener bannerListener) {
        int i10 = f859 + 99;
        f860 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m913(bannerView, bannerListener);
        if (z10) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ List m926(Ad ad2) {
        int i10 = f859 + 75;
        f860 = i10 % 128;
        int i11 = i10 % 2;
        List<Any> listM908 = m908(ad2);
        int i12 = f860 + 47;
        f859 = i12 % 128;
        int i13 = i12 % 2;
        return listM908;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m931(ByteString byteString) {
        int i10 = f860 + 3;
        f859 = i10 % 128;
        if (i10 % 2 == 0) {
            return m923(byteString);
        }
        m923(byteString);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m940(AdRequestParameters adRequestParameters) {
        int i10 = f860 + 25;
        f859 = i10 % 128;
        int i11 = i10 % 2;
        String strM912 = m912(adRequestParameters);
        int i12 = f859 + 99;
        f860 = i12 % 128;
        int i13 = i12 % 2;
        return strM912;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        map.put(m922((ViewConfiguration.getEdgeSlop() >> 16) + 929, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 41455), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bl.m924((Ad.Display) list.get(0));
            }
        });
        map.put(m922(KeyEvent.keyCodeFromString("") + 942, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.resolveSizeAndState(0, 0, 0) + 11).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bl.m932((Ad.Video) list.get(0));
            }
        });
        map.put(m922(953 - TextUtils.getCapsMode("", 0, 0), (char) View.combineMeasuredStates(0, 0), 9 - Color.green(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bl.m911((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        map.put(m922((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 962, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42356), TextUtils.getOffsetBefore("", 0) + 10).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bl.m930((Ad) list.get(0));
            }
        });
        map.put(m922(972 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bl.m936((Ad.Display) list.get(0));
            }
        });
        map.put(m922(View.getDefaultSize(0, 0) + 988, (char) ExpandableListView.getPackedPositionGroup(0L), 21 - KeyEvent.keyCodeFromString("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bl.m935((Ad.Display.Banner) list.get(0));
            }
        });
        map.put(m922(1009 - Color.green(0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 8 - KeyEvent.keyCodeFromString("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bl.m937((Ad) list.get(0));
            }
        });
        map.put(m922(KeyEvent.getDeadChar(0, 0) + 1017, (char) (9018 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bl.m925((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        map.put(m922(1028 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 6627), Process.getGidForName("") + 14).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bl.m917((Ad) list.get(0));
            }
        });
        map.put(m922((Process.myTid() >> 22) + IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, (char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bl.m918((AdRequestParameters) list.get(0));
            }
        });
        map.put(m922((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1053, (char) (6537 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 9).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bl.m940((AdRequestParameters) list.get(0));
            }
        });
        map.put(m922(MotionEvent.axisFromString("") + 1064, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4032), 11 - Color.argb(0, 0, 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bl.m941((RequestExtension) list.get(0));
            }
        });
        map.put(m922(Drawable.resolveOpacity(0, 0) + 1074, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 22 - Process.getGidForName("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bl.m914((InterstitialAd) list.get(0), (InterstitialListener) list.get(1));
                return null;
            }
        });
        map.put(m922(1097 - View.resolveSize(0, 0), (char) (Drawable.resolveOpacity(0, 0) + 52974), TextUtils.indexOf((CharSequence) "", '0') + 20).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bl.m927((RewardedAd) list.get(0), (RewardedListener) list.get(1));
                return null;
            }
        });
        map.put(m922(1116 - TextUtils.indexOf("", "", 0, 0), (char) (65340 - (ViewConfiguration.getFadingEdgeLength() >> 16)), TextUtils.lastIndexOf("", '0', 0, 0) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bl.m920((BannerView) list.get(0), (BannerListener) list.get(1));
                return null;
            }
        });
        map.put(m922(1132 - ExpandableListView.getPackedPositionChild(0L), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 38727), 15 - Gravity.getAbsoluteGravity(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bl.m926((Ad) list.get(0));
            }
        });
        map.put(m922(1149 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), View.MeasureSpec.getSize(0) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bl.m928((Any) list.get(0));
            }
        });
        map.put(m922(1161 - TextUtils.getOffsetBefore("", 0), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 44400), 17 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bl.m931((ByteString) list.get(0));
            }
        });
        int i10 = f859 + 83;
        f860 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m927(RewardedAd rewardedAd, RewardedListener rewardedListener) {
        int i10 = f859 + 11;
        f860 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        m915(rewardedAd, rewardedListener);
        if (!z10) {
            return;
        }
        int i11 = 35 / 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m932(Ad.Video video) {
        int i10 = f860 + 67;
        f859 = i10 % 128;
        int i11 = i10 % 2;
        String strM938 = m938(video);
        int i12 = f859 + 35;
        f860 = i12 % 128;
        int i13 = i12 % 2;
        return strM938;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m941(RequestExtension requestExtension) {
        int i10 = f860 + 123;
        f859 = i10 % 128;
        if (i10 % 2 != 0) {
            m919(requestExtension);
            throw null;
        }
        String strM919 = m919(requestExtension);
        int i11 = f859 + 101;
        f860 = i11 % 128;
        int i12 = i11 % 2;
        return strM919;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        hz hzVarM2351;
        String strM922;
        int i10 = f860 + 31;
        f859 = i10 % 128;
        try {
            if ((i10 % 2 != 0 ? (char) 21 : '[') != '[') {
                hzVarM2351 = hu.m2349().m2351();
                strM922 = m922(0 % (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1)), (char) (22158 % (ViewConfiguration.getPressedStateDuration() >> 20)), 47 / (ViewConfiguration.getJumpTapTimeout() - 43));
            } else {
                hzVarM2351 = hu.m2349().m2351();
                strM922 = m922(1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 20736), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12);
            }
            return hzVarM2351.m2451(BidMachine.class, strM922.intern());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m923(ByteString byteString) {
        int i10 = f860 + 55;
        f859 = i10 % 128;
        int i11 = i10 % 2;
        String stringUtf8 = byteString.toStringUtf8();
        int i12 = f860 + 91;
        f859 = i12 % 128;
        if (i12 % 2 == 0) {
            return stringUtf8;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ List m935(Ad.Display.Banner banner) {
        int i10 = f860 + 39;
        f859 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        List<Any> listM942 = m942(banner);
        if (!z10) {
            int i11 = 34 / 0;
        }
        return listM942;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0097 A[PHI: r6
  0x0097: PHI (r6v39 byte) = (r6v8 byte), (r6v14 byte), (r6v0 byte) binds: [B:179:0x0771, B:141:0x05cd, B:12:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        byte b10 = 19;
        byte b11 = 22;
        switch (str.hashCode()) {
            case -2127904484:
                b10 = str.equals(m922(TextUtils.indexOf((CharSequence) "", '0') + 382, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 48966), TextUtils.lastIndexOf("", '0') + 18).intern()) ? (byte) 27 : (byte) -1;
                break;
            case -2032115546:
                if (!str.equals(m922(TextUtils.indexOf((CharSequence) "", '0', 0) + 190, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28645), (ViewConfiguration.getLongPressTimeout() >> 16) + 14).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f860 + 119;
                    f859 = i10 % 128;
                    int i11 = i10 % 2;
                    b10 = 14;
                }
                break;
            case -1921270373:
                b10 = !str.equals(m922((ViewConfiguration.getScrollDefaultDelay() >> 16) + 738, (char) (28690 - (ViewConfiguration.getScrollBarSize() >> 8)), 12 - Color.argb(0, 0, 0, 0)).intern()) ? (byte) -1 : ExifInterface.START_CODE;
                break;
            case -1798479256:
                b10 = !str.equals(m922(AndroidCharacter.getMirror('0') + 702, (char) ((-16769738) - Color.rgb(0, 0, 0)), 47 - View.combineMeasuredStates(0, 0)).intern()) ? (byte) -1 : (byte) 43;
                break;
            case -1683121555:
                if (!str.equals(m922((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 178, (char) (ExpandableListView.getPackedPositionChild(0L) + 49898), (ViewConfiguration.getFadingEdgeLength() >> 16) + 12).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f859 + 1;
                    f860 = i12 % 128;
                    b10 = i12 % 2 != 0 ? (byte) 13 : (byte) 107;
                }
                break;
            case -1628534628:
                b10 = !str.equals(m922(676 - TextUtils.indexOf("", ""), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0') + 10).intern()) ? (byte) -1 : (byte) 39;
                break;
            case -1627944928:
                b11 = 9;
                if ((str.equals(m922(112 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ViewConfiguration.getTapTimeout() >> 16), 14 - ((Process.getThreadPriority(0) + 20) >> 6)).intern()) ? 'U' : 'W') == 'U') {
                    b10 = b11;
                } else {
                    b10 = -1;
                }
                break;
            case -1518365947:
                b10 = !str.equals(m922(897 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 63973), Color.alpha(0) + 16).intern()) ? (byte) -1 : (byte) 48;
                break;
            case -1507727624:
                b10 = !str.equals(m922(281 - ExpandableListView.getPackedPositionType(0L), (char) (Process.myPid() >> 22), 37 - TextUtils.indexOf("", "", 0, 0)).intern()) ? (byte) -1 : (byte) 21;
                break;
            case -1371195010:
                b10 = !str.equals(m922(Drawable.resolveOpacity(0, 0) + 246, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.resolveSize(0, 0) + 12).intern()) ? (byte) -1 : (byte) 18;
                break;
            case -1246480821:
                b10 = !str.equals(m922(448 - TextUtils.getOffsetBefore("", 0), (char) (View.getDefaultSize(0, 0) + 17173), 19 - TextUtils.indexOf("", "", 0, 0)).intern()) ? (byte) -1 : (byte) 30;
                break;
            case -1146475727:
                b10 = !(str.equals(m922(796 - MotionEvent.axisFromString(""), (char) (10393 - (ViewConfiguration.getTouchSlop() >> 8)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7).intern()) ? false : true) ? (byte) 44 : (byte) -1;
                break;
            case -1087582685:
                if (!str.equals(m922((ViewConfiguration.getWindowTouchSlop() >> 8) + 634, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16).intern())) {
                    b10 = -1;
                } else {
                    int i13 = f860 + 91;
                    f859 = i13 % 128;
                    int i14 = i13 % 2;
                    b10 = 37;
                }
                break;
            case -1011229113:
                b10 = !str.equals(m922((Process.myPid() >> 22) + 588, (char) (48272 - KeyEvent.getDeadChar(0, 0)), 46 - Color.red(0)).intern()) ? (byte) -1 : (byte) 36;
                break;
            case -838844802:
                b10 = !str.equals(m922(TextUtils.getCapsMode("", 0, 0) + EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_LOSS_VALUE, (char) (View.resolveSizeAndState(0, 0, 0) + 34047), 43 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern()) ? (byte) -1 : (byte) 45;
                break;
            case -642689680:
                b10 = !str.equals(m922(KeyEvent.normalizeMetaState(0) + 721, (char) (TextUtils.indexOf("", "") + 16498), KeyEvent.getDeadChar(0, 0) + 17).intern()) ? (byte) -1 : (byte) 41;
                break;
            case -609786639:
                b11 = 9;
                if (!str.equals(m922(356 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (Drawable.resolveOpacity(0, 0) + 9736), 10 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    b10 = -1;
                } else {
                    int i15 = f859 + 13;
                    f860 = i15 % 128;
                    if (i15 % 2 != 0) {
                        b10 = 25;
                    } else {
                        b10 = b11;
                    }
                }
                break;
            case -589219056:
                b10 = !str.equals(m922(TextUtils.lastIndexOf("", '0', 0, 0) + 13, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), MotionEvent.axisFromString("") + 14).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -572702516:
                b10 = !str.equals(m922(70 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 55296), 8 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern()) ? (byte) -1 : (byte) 5;
                break;
            case -475472046:
                b10 = !str.equals(m922(41 - View.MeasureSpec.getMode(0), (char) (30211 - TextUtils.getOffsetBefore("", 0)), TextUtils.indexOf("", "", 0, 0) + 20).intern()) ? (byte) -1 : (byte) 3;
                break;
            case -211807062:
                b10 = !str.equals(m922(167 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 11).intern()) ? (byte) -1 : (byte) 12;
                break;
            case -150492023:
                b10 = !str.equals(m922(271 - TextUtils.lastIndexOf("", '0', 0), (char) (53897 - Gravity.getAbsoluteGravity(0, 0)), 9 - TextUtils.indexOf("", "", 0)).intern()) ? (byte) -1 : (byte) 20;
                break;
            case 2115:
                b10 = !str.equals(m922(TextUtils.lastIndexOf("", '0', 0, 0) + EventTypeExtended.EVENT_TYPE_EXTENDED_BROKEN_CREATIVE_DETECTOR_VALUE, (char) (ExpandableListView.getPackedPositionType(0L) + 2542), (Process.myPid() >> 22) + 2).intern()) ? (byte) -1 : (byte) 32;
                break;
            case 1282165:
                b10 = (str.equals(m922(Color.red(0) + 685, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 35 - TextUtils.lastIndexOf("", '0')).intern()) ? 'W' : '\'') == 'W' ? (byte) 40 : (byte) -1;
                break;
            case 3368703:
                b10 = !str.equals(m922(25 - ExpandableListView.getPackedPositionType(0L), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 60060), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 9).intern()) ? (byte) -1 : (byte) 1;
                break;
            case 141091039:
                b10 = !str.equals(m922(529 - TextUtils.getOffsetAfter("", 0), (char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 40).intern()) ? (byte) -1 : (byte) 34;
                break;
            case 320151695:
                b10 = !(str.equals(m922(212 - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.normalizeMetaState(0) + 14).intern()) ? false : true) ? (byte) 16 : (byte) -1;
                break;
            case 503762424:
                b10 = !str.equals(m922(34 - Color.argb(0, 0, 0, 0), (char) ((-1) - Process.getGidForName("")), KeyEvent.keyCodeFromString("") + 7).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 529939434:
                b10 = !str.equals(m922((ViewConfiguration.getWindowTouchSlop() >> 8) + 99, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollBarSize() >> 8) + 7).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 625873720:
                b10 = !str.equals(m922((ViewConfiguration.getKeyRepeatDelay() >> 16) + 859, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 38 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern()) ? (byte) -1 : (byte) 47;
                break;
            case 713768498:
                b10 = !str.equals(m922(TextUtils.lastIndexOf("", '0') + 341, (char) (31461 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14).intern()) ? (byte) -1 : (byte) 24;
                break;
            case 737636858:
                b10 = !str.equals(m922(467 - View.getDefaultSize(0, 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 48).intern()) ? (byte) -1 : (byte) 31;
                break;
            case 742497451:
                b10 = !str.equals(m922((ViewConfiguration.getFadingEdgeLength() >> 16) + 411, (char) Color.red(0), 38 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 29;
                break;
            case 745946635:
                b10 = !str.equals(m922(326 - Color.argb(0, 0, 0, 0), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14).intern()) ? (byte) -1 : (byte) 23;
                break;
            case 961844241:
                b10 = !str.equals(m922(174 - AndroidCharacter.getMirror('0'), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 63865), 10 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case 1125320581:
                if (!str.equals(m922(204 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (28586 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 9 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    b10 = -1;
                } else {
                    int i16 = f859 + 75;
                    f860 = i16 % 128;
                    int i17 = i16 % 2;
                    b10 = 15;
                }
                break;
            case 1165508119:
                b10 = (str.equals(m922(View.combineMeasuredStates(0, 0) + 61, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + (-1)), KeyEvent.getDeadChar(0, 0) + 10).intern()) ? (char) 27 : (char) 7) == 27 ? (byte) 4 : (byte) -1;
                break;
            case 1212533506:
                b10 = !str.equals(m922(TextUtils.lastIndexOf("", '0', 0, 0) + 366, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 59407), ((Process.getThreadPriority(0) + 20) >> 6) + 16).intern()) ? (byte) -1 : (byte) 26;
                break;
            case 1297340448:
                b10 = !str.equals(m922(226 - KeyEvent.normalizeMetaState(0), (char) (61674 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 20 - KeyEvent.normalizeMetaState(0)).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 1387614166:
                if ((str.equals(m922(80 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 9056), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20).intern()) ? (char) 2 : (char) 0) == 0) {
                    b10 = -1;
                } else {
                    int i18 = f860 + 111;
                    f859 = i18 % 128;
                    b10 = i18 % 2 == 0 ? (byte) 6 : (byte) 111;
                }
                break;
            case 1395486086:
                b10 = !str.equals(m922(Drawable.resolveOpacity(0, 0) + 516, (char) (35687 - TextUtils.lastIndexOf("", '0')), 12 - TextUtils.lastIndexOf("", '0', 0, 0)).intern()) ? (byte) -1 : (byte) 33;
                break;
            case 1444286894:
                if (!str.equals(m922(568 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 19).intern())) {
                    b10 = -1;
                } else {
                    int i19 = f859 + 105;
                    f860 = i19 % 128;
                    b10 = i19 % 2 != 0 ? (byte) 35 : (byte) 109;
                }
                break;
            case 1461955341:
                if (!str.equals(m922((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 398, (char) (ImageFormat.getBitsPerPixel(0) + 1), Color.green(0) + 13).intern())) {
                    b10 = -1;
                } else {
                    int i20 = f859 + 39;
                    f860 = i20 % 128;
                    b10 = i20 % 2 != 0 ? (byte) 28 : (byte) 102;
                }
                break;
            case 1494941328:
                if (!str.equals(m922(912 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.rgb(0, 0, 0) + InputDeviceCompat.SOURCE_JOYSTICK).intern())) {
                    b10 = -1;
                } else {
                    int i21 = f860 + 73;
                    f859 = i21 % 128;
                    int i22 = i21 % 2;
                    b10 = 49;
                }
                break;
            case 1917129446:
                if ((str.equals(m922((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 258, (char) (TextUtils.getOffsetBefore("", 0) + 25570), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14).intern()) ? 'O' : '\t') != 'O') {
                    b10 = -1;
                }
                break;
            case 1955913096:
                b10 = !str.equals(m922(106 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7).intern()) ? (byte) -1 : (byte) 8;
                break;
            case 2034998687:
                b10 = !(str.equals(m922(848 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (AndroidCharacter.getMirror('0') + 27484), 11 - (Process.myTid() >> 22)).intern()) ? false : true) ? (byte) 46 : (byte) -1;
                break;
            case 2110329530:
                if (!str.equals(m922((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 317, (char) View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf("", "", 0) + 8).intern())) {
                    b10 = -1;
                } else {
                    b10 = b11;
                }
                break;
            case 2112955383:
                b10 = !str.equals(m922((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 650, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 25 - View.combineMeasuredStates(0, 0)).intern()) ? (byte) -1 : (byte) 38;
                break;
            case 2136410007:
                b10 = !str.equals(m922(135 - TextUtils.indexOf((CharSequence) "", '0'), (char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 31).intern()) ? (byte) -1 : (byte) 11;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return AdContentType.class;
            case 1:
                return Ad.Display.class;
            case 2:
                return Ad.Video.class;
            case 3:
                return AdFullScreenListener.class;
            case 4:
                return AdListener.class;
            case 5:
                return AdRequest.class;
            case 6:
                int i23 = f859 + 57;
                f860 = i23 % 128;
                if (i23 % 2 == 0) {
                    int i24 = 11 / 0;
                    return AdRequestParameters.class;
                }
                return AdRequestParameters.class;
            case 7:
                return AdsType.class;
            case 8:
                return AdView.class;
            case 9:
                return BannerListener.class;
            case 10:
            case 11:
                return BannerView.class;
            case 12:
                return BidMachine.class;
            case 13:
                return BidMachineAd.class;
            case 14:
                return CreativeFormat.class;
            case 15:
                return ImageData.class;
            case 16:
                return InterstitialAd.class;
            case 17:
                return InterstitialListener.class;
            case 18:
                return FullScreenAd.class;
            case 19:
                return MediaAssetType.class;
            case 20:
            case 21:
                return MediaView.class;
            case 22:
                return NativeAd.class;
            case 23:
                return NativeListener.class;
            case 24:
                return NativeMediaView.class;
            case 25:
                return RewardedAd.class;
            case 26:
                return RewardedListener.class;
            case 27:
                return RichMediaListener.class;
            case 28:
            case 29:
                return RichMediaView.class;
            case 30:
            case 31:
                return VideoPlayerActivity.class;
            case 32:
                return Ad.class;
            case 33:
            case 34:
                return MraidActivity.class;
            case 35:
            case 36:
                return MraidDialogActivity.class;
            case 37:
                return MraidInterstitial.class;
            case 38:
                return MraidInterstitialListener.class;
            case 39:
            case 40:
                return MraidView.class;
            case 41:
                return MraidViewListener.class;
            case 42:
            case 43:
                return VastActivity.class;
            case 44:
            case 45:
                return VastView.class;
            case 46:
            case 47:
                return MraidAdView.class;
            case 48:
                return VastViewListener.class;
            case 49:
                return RequestExtension.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static ByteString m916(Any any) {
        int i10 = f860 + 19;
        f859 = i10 % 128;
        if ((i10 % 2 != 0 ? '6' : 'K') == '6') {
            any.getValue();
            throw null;
        }
        ByteString value = any.getValue();
        int i11 = f859 + 91;
        f860 = i11 % 128;
        if ((i11 % 2 == 0 ? 'V' : '`') != 'V') {
            return value;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m922(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f861[i10 + i12]) ^ (((long) i12) * f858)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Ad.Display.Banner m929(Ad.Display display) {
        int i10 = f859 + 53;
        f860 = i10 % 128;
        int i11 = i10 % 2;
        Ad.Display.Banner banner = display.getBanner();
        int i12 = f859 + 109;
        f860 = i12 % 128;
        int i13 = i12 % 2;
        return banner;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m919(RequestExtension requestExtension) {
        int i10 = f859 + 63;
        f860 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '@' : 'L';
        String sellerId = requestExtension.getSellerId();
        if (c10 != 'L') {
            int i11 = 43 / 0;
        }
        return sellerId;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m933(Ad ad2, int i10) {
        int i11 = f860 + 31;
        f859 = i11 % 128;
        int i12 = i11 % 2;
        String adomain = ad2.getAdomain(i10);
        int i13 = f860 + 21;
        f859 = i13 % 128;
        if ((i13 % 2 != 0 ? 'H' : (char) 14) != 'H') {
            return adomain;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m921(InterstitialAd interstitialAd, InterstitialListener interstitialListener) {
        int i10 = f860 + 25;
        f859 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '^' : (char) 7;
        interstitialAd.setListener(interstitialListener);
        if (c10 == 7) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m934(AdRequestParameters adRequestParameters) {
        int i10 = f859 + 103;
        f860 = i10 % 128;
        char c10 = i10 % 2 == 0 ? (char) 27 : 'M';
        String placementId = adRequestParameters.getPlacementId();
        if (c10 != 'M') {
            int i11 = 79 / 0;
        }
        return placementId;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m910(Ad.Display display) {
        int i10 = f860 + 23;
        f859 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 11 : 'R') == 'R') {
            return display.getAdm();
        }
        display.getAdm();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Ad.Display m909(Ad ad2) {
        int i10 = f860 + 105;
        f859 = i10 % 128;
        int i11 = i10 % 2;
        Ad.Display display = ad2.getDisplay();
        int i12 = f859 + 105;
        f860 = i12 % 128;
        if ((i12 % 2 == 0 ? 'B' : 'N') == 'N') {
            return display;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m912(AdRequestParameters adRequestParameters) {
        int i10 = f860 + 59;
        f859 = i10 % 128;
        int i11 = i10 % 2;
        String name = adRequestParameters.getAdsType().getName();
        int i12 = f859 + 51;
        f860 = i12 % 128;
        if (i12 % 2 != 0) {
            return name;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m915(RewardedAd rewardedAd, RewardedListener rewardedListener) {
        int i10 = f860 + 113;
        f859 = i10 % 128;
        int i11 = i10 % 2;
        rewardedAd.setListener(rewardedListener);
        int i12 = f859 + 37;
        f860 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m913(BannerView bannerView, BannerListener bannerListener) {
        int i10 = f859 + 83;
        f860 = i10 % 128;
        int i11 = i10 % 2;
        bannerView.setListener(bannerListener);
        int i12 = f860 + 87;
        f859 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m938(Ad.Video video) {
        int i10 = f859 + 95;
        f860 = i10 % 128;
        if ((i10 % 2 == 0 ? '6' : 'Z') != '6') {
            return video.getAdm();
        }
        video.getAdm();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m939(Ad ad2, int i10) {
        int i11 = f860 + 99;
        f859 = i11 % 128;
        if (!(i11 % 2 == 0)) {
            ad2.getBundle(i10);
            throw null;
        }
        String bundle = ad2.getBundle(i10);
        int i12 = f860 + 41;
        f859 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return bundle;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<Any> m942(Ad.Display.Banner banner) {
        int i10 = f860 + 41;
        f859 = i10 % 128;
        char c10 = i10 % 2 != 0 ? (char) 26 : 'R';
        List<Any> extProtoList = banner.getExtProtoList();
        if (c10 != 'R') {
            int i11 = 7 / 0;
        }
        int i12 = f860 + 45;
        f859 = i12 % 128;
        int i13 = i12 % 2;
        return extProtoList;
    }
}
