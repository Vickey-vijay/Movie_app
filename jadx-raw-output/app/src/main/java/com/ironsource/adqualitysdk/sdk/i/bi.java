package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
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
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.applovin.adview.AdViewController;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenThemedActivity;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialActivity;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorEntity;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AdViewControllerImpl;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.mediation.MaxAdapterParametersImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinMediaView;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.AppLovinMediationAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.adapters.MediationAdapterRouter;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.G5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bi extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f798 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f799;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f800;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f801;

    static {
        char[] cArr = new char[2053];
        ByteBuffer.wrap("J|\u0090\u0000þ×Ä\u0096#f\tÊW\u009a²H\u0098\u0006æìÍT\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Ta&;ù\u0015\u009e\u0000cÚ\"´÷\u008eÉiUCñ\u001d¾øwÒ\u0007¬Ã\u0087ka!;²\u0015\u0088ðRÊõ¤¹\u007fxY\u001d3\u0099\u000eEè!Âî\u009c§wWQó+»\u0006qà-ºÝ\u0095Po:IÅ#\u009a\u0000AÚ)´Ì\u008e\u008eiQCö\u001d\u008døtÒ\u0006¬Á\u0087pa ;ð\u0015\u0085ðSÊñ\u0015\tÏu¡¢\u009bã|\u0013V¿\bïí=Çi¹\u0093\u0092>tb.¦\u0000Òå\nß¢±ìj<LC&\u0093\u001b\rýz×¢\u0089Êb\u0006D¤>î\u0013.\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ!¬Û\u0087va*;î\u0015\u009aðBÊê¤¤\u007ftY\u000b3Û\u000eEè5ÂÚ\u009c\u0082wYQé+½\u0006x\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Aa#;õ\u0015\u008að]ÊÏ¤¹\u007fnY\u001e3Ò\u000ejè4Âì\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Fa&;ï\u0015\u0099ðZÊâ¤©\u007fQY\u00033Ä\u000epè4Âð\u009c\u008ewJ$«þ×\u0090\u0000ªAM±g\u001d9MÜ\u009föÃ\u0088;£ºEÀ\u001f\u00011bÔ®î\r\u0080v[\u009e}ó\u0017)*\u008bÌÕæ\u0011¸s\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Ta&;ø\u0015\u008cðYÊÓ¤¼\u007f|Y\u00133Õ\u000eeè2Âõ\u009c§wQQö+¦\u0006zà\u0002ºÜ\u0095t\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Qa&;æ\u0015\u008c\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Va6;ì\u0015\u008c\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ!¬Û\u0087aa*;ò\u0015\u009dð_Êõ¤¹\u007fgY\u000f3Ó\u000eMè?Âê\u009c\u008ewJQö+¦\u0006và\u0018ºÐ\u0095go?\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ!¬Û\u0087va*;î\u0015\u009aðBÊê¤¤\u007ftY\u000b3Û\u000eEè5°øj\u0084\u0004S>\u0012ÙâóN\u00ad\u001eHÌb\u0086\u001ci7ÙÑ \u008bL¥5@øz{\u0014\nÏÐéº\u0083x¾ÔX\u009cr^\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Qa*;î\u0015\u009fð_Êà¤µ\u007fTY\u00073Ç\u000eh\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ)¬Ñ\u0087Ta&;ù\u0015\u009eðsÊõ¤µ\u007fsY\u001e3û\u000emè\"Âê\u009c\u008ewVQà+ 1Ùë¥\u0085r¿3XÃro,?Éíã¦\u009dD¶þP²\nk$'ÁÇû~\u0095?\u0000AÚ)´Ì\u008e\u008eiQCö\u001d\u008døtÒ\u0006¬Á\u0087pa ;ð\u0015\u0085ðSÊñ¤\u0099\u007fpY\u001a3ÛxU¢)Ìþö¿\u0011O;ãe³\u0080aª=ÔÅÿT\u0019:Cûm\u0098\u0000MÚ,´â\u008e¦iPC×\u001d§ø~Ò\u001fòì(\u008dFC|\u000f\u009bû±Tï\n\nÈ º^`uÊ\u0093\u009aÉTç)\u0002û8cV\u00154Âî£\u0080mº:]Þwy) Ìææ\u0083\u0098_³éU\u0081\u000fwú( IN\u0087tÃ\u00935¹²çÂ\u0002\u001b(zV\u0099}\n\u009bZÁ\u0095\u0000MÚ,´â\u008e¡iACí\u001d¢øhÒ\u000b¬Ç\u0087ga*;ò\u0015¨ðRÊÊ¤½\u007fmY\u0006\u0000MÚ,´â\u008e¦iPCà\u001d¾øoÒ\r¬Ç\u0087Ra.;î\u0015\u0088ð[Êæ¤¤\u007fxY\u00183Ä\u000eMè<Âî\u009c\u0087IW\u00932ýäÇ\u0094 O\nïT½±n\u009b\u001cåüÎ}('rð\\\u009a¹O\u0083üí\u00836j\u0010\u0000zÁ.Éô¨\u009af \"GÔmd3:Öëü\u0089\u0082C\r:×[¹\u0095\u0083Ñd'\u0000MÚ,´â\u008e¦iPCÇ\u001d¡øiÒ\u0005¬Ô\u0087v\u0000MÚ,´â\u008e¦iPCÍ\u001d§øhÒ\u001c¬Ð\u0087la*;î\u0000MÚ,´â\u008e¦iPC×\u001d§ø~Ò\u001f¬ô\u0087fa\u0003;õ\u0015\u009aðBÊæ¤¾\u007fxY\u0018\u0001pÛ\u0011µß\u008f\u0088hlBË\u001c\u0092ùTÓ1WÒ\u008d³ã}Ù*>Î\u0014iJ0¯ö\u0085\u0093ûOÐù6\u0091lgB:§À\u009doó;(ç\u000e\u009bdMYé\u0000MÚ(´þ\u008e\u008eiUCõ\u001d§øtÒ\u0006¬ô\u0087fa.;ì\u0015\u009dðSÊñ¤\u0092\u007f|Y\u00193Ò\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ%¬Ð\u0087fa&;ý\u0015\u009dð_Êì¤¾\u007f\\Y\u000e3Ö\u000etè%Âû\u009c\u0099ú^ ;Nít\u009d\u0093F¹æç´\u0002g(\u0015Vç}u\u009b=Áÿï\u008e\n@0â^\u0091\u0085a£\fÉÐôr\u00120\u0000MÚ,´â\u008e¦iPC×\u001d§ø~Ò\u001f¬ô\u0087fa.;ì\u0015\u009dðSÊñ=\u001aç{\u0089µ³ùT\r~¢ üÅ>ïL\u0091\u0096º<\\l\u0006¢(ßÍ\r÷\u0095\u0099ãB+dM\u000e\u009436Õt\u0000MÚ,´â\u008eµiQCö\u001d¯øiÒ\f¬Ð\u0087fa\u000e;ø\u0015\u0088ðFÊ÷¤µ\u007foÏ·\u0015Ö{\u0018AN¦§\u008c\u001cÒZ7\u0080\u001dþc\u001fH\u008a®Úô\u0010Úz?¨\u0005\u001ckX\u0000MÚ,´â\u008e¦iPCà\u001d¾øoÒ\r¬Ç\u0087Ra.;î\u0015\u0088ð[Êæ¤¤\u007fxY\u00183ÄE\u001c\u009f}ñ³Ë÷,\u0001\u0006±Xï½>\u0097\\é\u0096Â\u0001${~¾PÈµ\b\u008f¼áò:)\u001ckv\u0087K'\u00ada\u0087¢Ùß2\u001d\u0014±nñC=Q\u001a\u008b{åµßñ8\u0007\u0012·Lé©8\u0083Zý\u0090Ö\u00060qj¬DÐ¡\u0000\u009b¸õÄ.%\bQb\u008c_6¹e\u0093½ÍÕ&\u0000\u0000¼zÕW)±Ië\u008fÄ<>a\u0018\u0083rß¯\u001f\u0089£Á\u0087\u001bæu(Ol¨\u009a\u0082*Üt9¥\u0013Çm\rF\u0081 ëú?ÔW1\u0095\u000b(ev¾¾\u0098Úò\u001cÏº)ò\u0003;]O¶¢\u0090.êjÇ´!Ë{\u0016T¸®ü\u0088\u0018âTK\u001d\u0091|ÿ²Åö\"\u0000\b°Vî³?\u0099]ç\u0097Ì\u001e*vp¿^Í»\u0003\u0081½ïå4?õ|/\u001dAÓ{\u0097\u009ca¶æè\u0096\rO'.YÅrW\u0094\u001fÎÝà¬\u0005b?ÀQ\u00ad\u008aE¬(ÆòûP\u001d\u000e7Êi¨\u0000MÚ,´â\u008e®iZCõ\u001d«øiÒ\u001b¬Á\u0087ka;;õ\u0015\u0088ðZÊÂ¤´\u007f|Y\u001a3Ã\u000eaè#ÂÒ\u009c\u0082wKQñ+·\u0006qà\tºË\u0000MÚ,´â\u008eµiQCö\u001d¯øiÒ\f¬Ð\u0087fa\u000e;ø\u0015\u0088ðFÊ÷¤µ\u007foY&3Þ\u000ewè%Âû\u009c\u0085w]Q÷\u0000MÚ,´â\u008e´i]Cæ\u001d øzÒ\u0004¬ö\u0087ma#;ð\u0015\u008cðUÊ÷¤¹\u007frY\u00043û\u000emè\"Âê\u009c\u008ewVQà+ \u0000MÚ,´â\u008e¢iFCó\u001d¡øi\u009bYA%/ò\u0015³òCØï\u0086¿cmI27ß\u001cuú6 à\u008e\u0092kOQè?¼äHÂ\u0013¨Á\u0095}s.Yã\u0007\u0081\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ*¬Ç\u0087ma.;ø\u0015\u008aðWÊð¤¤\u007fPY\u000b3Ù\u000eeè6Âû\u009c\u0099wjQà+±\u0006zà\u0005ºÏ\u0095co!e]¿!Ñöë·\fG&ëx»\u009di·7ÉÆâs\u0004>^õp\u009b\u0095C¯üÁ\u00ad\u001au<\u0019VÙkU\u008d(§ñù\u0084\u0012E4þN«\u0000CÚ\"´÷\u008e\u008aiACï\u001d§øxÒ\t¬Á\u0087ma=;Ñ\u0015\u008cðEÊð¤±\u007fzY\u000f3þ\u000eiè!Âò\u0087\u0007]{3¬\tíî\u001dÄ±\u009aá\u007f3Um+\u009c\u0000)æd¼¯\u0092Áw\u0019M¦#÷ø/ÞC´\u0083\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ+¬Ú\u0087oa\";é\u0015\u0087ð_Êà¤±\u007fiY\u00053Å\u000eWè$Âü\u009c\u0098w[Q÷+»\u0006}à\tºË@\u009a\u009aæô1Îp)\u0080\u0003,]|¸®\u0092ðì\u0001Ç´!ù{2U\\°\u0084\u008a;äj?²\u0019Þs\u001eN\u008f¨ÿ\u0082'Ü\\7\u008a\u0011-kaF¡ Åk\u0019±eß²åó\u0002\u0003(¯vÿ\u0093-¹sÇ\u0082ì7\nzP±~ß\u009b\u0007¡¸Ïé\u001412]X\u009de\u0011\u0083l©µ÷À\u001c\u0001:º@ãm)\u008bSÑ²þ;\u0004y\"\u008eHÜ\u0095\u0001³º\u008a_P#>ô\u0004µãEÉé\u0097¹rkX5&Ä\rqë<±÷\u009f\u0099zA@þ.¯õwÓ\u001b¹Û\u0084_b!Hô\u0016\u009cýRÛâ\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ.¬À\u0087na#;ï\u0015\u008aðDÊæ¤µ\u007fsY>3ß\u000eaè<Âû\u009c\u008fwyQæ+¦\u0006và\u001aºÐ\u0095ro*\u0000cÚ\"´÷\u008eÉiUCñ\u001d¾øwÒ\u0007¬Ã\u0087ka!;²\u0015\u0088ðRÊõ¤¹\u007fxY\u001d3\u0099\u000eEè!Âî\u009c§wWQó+»\u0006qà*ºÌ\u0095jo?IÓ#\u008eþHØâ²±\u008dOg:AÓ\u001cmö8ÐÇª\u008b\u0085}_ê9¢\u0014Jî\u0006ÈÔ£~}.\u0000MÚ,´â\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087f\u0000MÚ,´â\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\u0003;õ\u0015\u009aðBÊæ¤¾\u007fxY\u0018\u0000MÚ,´â\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\u0003;ó\u0015\u0088ðRÊæ¤¢\u0000MÚ,´â\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\u0006;ñ\u0015\u0099ðZ\u0000MÚ,´â\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\u0019;õ\u0015\u008cðA\u0000cÚ\"´÷\u008eÉiUCñ\u001d¾øwÒ\u0007¬Ã\u0087ka!;²\u0015\u0084ðSÊç¤¹\u007f|Y\u001e3Þ\u000ekè?Â°\u009c\u0085wYQñ+»\u0006ià\tºø\u0095bo I\u008e# þ[Øÿ²\u009a\u008d@g\u001aAÒ\u001c~ö0Ðãª\u008b\u0085j_à9³\u0014TI\u0016\u0093wý¹Çò \u000e\n®Tü±6\u009bVå¯Î=(Br®\\×¹\u001a\u0083\u009aíâ6(\u0010Uz\u0089G-\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ&¬Ô\u0087va&;ê\u0015\u008cðwÊç\u001f\u0084Åø«/\u0091nv\u009e\\2\u0002bç°Íã³\u0011\u0098³~ã$/\nIï²Õ\"»P`®FÊ,\u001c\u0011µ÷ØÝ2\u0083]h\u0089N%4y\u0019¿ÿÛ\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ&¬Ô\u0087va&;ê\u0015\u008cðwÊç¤\u0083\u007fxY\u00183Á\u000emè2Âû\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ%¬Ð\u0087fa&;ý\u0015¿ð_Êæ¤§\u0000AÚ=´ê\u008e«i[C÷\u001d§øuÒ>¬Ô\u0087qa;;Ñ\u0015\u008cðRÊê¤±\u007fKY\u00033Ò\u000es$¥þÙ\u0090\u000eªOM¿g\u00139CÜ\u0091öÂ\u00880£\u0092EÂ\u001f\u000e1hÔ\u0093î\u0003\u0080}[\u0094}þ\u0017?\u0000VÚ\b´È\u008e´i}CÎ\u001d\u0080\u0000^Ú\u0011´þ\u008e¼ihCå\u001dàøFÒC¬é\u0087fak\u0000sÚ(´î\u008e¦iPCÂ\u001d¢ørÒ\u000b¬Þ\u0087Na&;ï\u0015\u009dðSÊí¤µ\u007fo{\u0093¡ÈÏ\u000eõF\u0012°87fG\u0083\u009f©í×:ü²\u001aÃ@\u001dnp\u008b´±\u0002ßS\u0004\u0096\"ÆH>u\u0097\u0093Å¹\u001bçe\f½*\u0017\u0000sÚ(´î\u008e¦iPCÅ\u001d§øhÒ\u0018¬Ù\u0087ca6;Ð\u0015\u0080ðEÊ÷¤µ\u007fsY\u000f3ÅÞ5\u0004zj¼Pô·\u0002\u009d\u0085Ãõ&,\fMr¤Y?¿såºËÉ.\u000b\u0014½zî¡*\u0087Jò\u0095(ÚF\u001c|T\u009b¢±:ïX\n§ ï^*u\u0092\u0093ØÉ\u001c\u0000gÚ(´î\u008e´i]Cû\u001d«\u0000gÚ(´î\u008e³iMCñ\u001d«\u0000gÚ(´î\u008e½i[Cï\u001d«øRÒ\f\u0013ÃÉ\u008c§J\u009d\u0000zâP@\u000e\u000bëËÁ¥¿g\u0094Ãr¢(\\\u0000iÚ>´Ì\u008e\u008eiPCä\u001d¡øZÒ\f\u0000iÚ>´Ø\u008e\u0086iZCï\u001d«øi\u0000iÚ>´Ó\u008e\u0089iWCä\u001d øoÒ\u0001¬Ã\u0087ka5;ù\u0015\u008dðwÊç\u0000gÚ(´î\u008e¦iDCñ\u001d\u0082øtÒ\u001e¬Ü\u0087la\r;î\u0015\u0086ðWÊç¤³\u007f|Y\u00193Ã\u000eIè0Âð\u009c\u008aw_Qà+ 9\u000bãQ\u008d\u0084·÷P>z\u008c$ÒÁ\u0010ëP\u0095¼¾\u000bXz\u0002\u008a,æÉ&ó\u0094\u009dëF\u0016`|\n¯7\u0019ÑKû\u0086¥áN5h®\u0012Î?\u0005Ùp\u0083©¬\tVOp«\u0000uÚ#´è\u008e\u0082iSCè\u001d½øoÒ\r¬Ç\u0087Ca?;ì\u0015¥ðYÊõ¤¹\u007fsY(3Å\u000ekè0Âú\u009c\u0088wYQö+¦\u0006Mà\tºÚ\u0095co:IÖ#\u0088þHuS¯\u001cÁÚû\u0092\u001cp6Åh¶\u008d@§*ÙèòX\u00148NÇ`°\u0085o¿ÂÑ\u008a\n@,=Fâ{D\u009d\n·Øé\u0092\u0002i$Â^\u0095sJ\u0095?Ïèàv\u001a\u0006<àV¸\u0000sÚ8´ø\u008e\u0094iWCó\u001d§øyÒ\r¬á\u0087ma\u000e;ì\u0015\u0099ðzÊì¤¦\u007ftY\u00043ô\u000ekè<Âó\u009c\u009ewVQì+±\u0006~à\u0018ºÖ\u0095t\u0000gÚ(´î\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\u0002;ý\u0015\u0080ðXÊÊ¤½\u007f|Y\r3Ò\u000eQè#Â÷\u0000sÚ(´î\u008e©iUCõ\u001d§ømÒ\r¬ô\u0087fa\n;ê\u0015\u008cðXÊ÷¤\u009c\u007ftY\u00193Ã\u000eaè?Âû\u009c\u0099:\ràB\u008e\u0084´ÃS?y\u009f'ÍÂ\u0007èg\u0096\u009e½\f[l\u0001\u0095/ìÊ2ð¼\u009eÈE\u001e".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2053);
        f800 = cArr;
        f801 = -1288543479881606579L;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static boolean m826(AppLovinAd appLovinAd) {
        if (!(appLovinAd == null)) {
            int i10 = f798 + 35;
            f799 = i10 % 128;
            if (i10 % 2 != 0) {
                m830(appLovinAd);
                int i11 = AppLovinAdSize.SPAN;
                throw null;
            }
            if (!(m830(appLovinAd) != AppLovinAdSize.BANNER) || m830(appLovinAd) == AppLovinAdSize.LEADER || m830(appLovinAd) == AppLovinAdSize.MREC) {
                int i12 = f799 + 93;
                f798 = i12 % 128;
                if (i12 % 2 != 0) {
                    return true;
                }
                throw null;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ AppLovinBroadcastManager m832(Context context) {
        int i10 = f799 + 101;
        f798 = i10 % 128;
        int i11 = i10 % 2;
        AppLovinBroadcastManager appLovinBroadcastManagerM841 = m841(context);
        int i12 = f799 + 37;
        f798 = i12 % 128;
        if (i12 % 2 != 0) {
            return appLovinBroadcastManagerM841;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Uri m840(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i10 = f798 + 97;
        f799 = i10 % 128;
        int i11 = i10 % 2;
        Uri uriM852 = m852(appLovinNativeAdImpl);
        int i12 = f798 + 73;
        f799 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 5 : '1') == '1') {
            return uriM852;
        }
        int i13 = 50 / 0;
        return uriM852;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ AdViewController m847(AppLovinAdView appLovinAdView) {
        int i10 = f799 + 9;
        f798 = i10 % 128;
        if ((i10 % 2 == 0 ? '.' : 'F') == '.') {
            m862(appLovinAdView);
            throw null;
        }
        AdViewController adViewControllerM862 = m862(appLovinAdView);
        int i11 = f798 + 13;
        f799 = i11 % 128;
        int i12 = i11 % 2;
        return adViewControllerM862;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ AppLovinAdType m854(AppLovinAd appLovinAd) {
        int i10 = f798 + 103;
        f799 = i10 % 128;
        if ((i10 % 2 != 0 ? '7' : '`') == '`') {
            return m828(appLovinAd);
        }
        m828(appLovinAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ long m859(AppLovinAd appLovinAd) {
        int i10 = f798 + 77;
        f799 = i10 % 128;
        int i11 = i10 % 2;
        long jM829 = m829(appLovinAd);
        int i12 = f798 + 75;
        f799 = i12 % 128;
        if ((i12 % 2 != 0 ? '4' : '>') == '>') {
            return jM829;
        }
        int i13 = 44 / 0;
        return jM829;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static boolean m824(AppLovinAd appLovinAd) {
        int i10 = f798 + 119;
        f799 = i10 % 128;
        int i11 = i10 % 2;
        boolean zIsVideoAd = appLovinAd.isVideoAd();
        int i12 = f798 + 59;
        f799 = i12 % 128;
        int i13 = i12 % 2;
        return zIsVideoAd;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean m825(AppLovinAd appLovinAd) {
        int i10 = f798 + 75;
        f799 = i10 % 128;
        int i11 = i10 % 2;
        if ((appLovinAd != null ? 'a' : 'E') == 'a') {
            if (appLovinAd.getType().equals(AppLovinAdType.INCENTIVIZED)) {
                int i12 = f798 + 13;
                f799 = i12 % 128;
                int i13 = i12 % 2;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m827(AppLovinAd appLovinAd) {
        int i10 = f799 + 73;
        f798 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM825 = m825(appLovinAd);
        int i12 = f799 + 23;
        f798 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return zM825;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static AppLovinAdType m828(AppLovinAd appLovinAd) {
        int i10 = f798 + 7;
        f799 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        AppLovinAdType type = appLovinAd.getType();
        if (!z10) {
            int i11 = 66 / 0;
        }
        int i12 = f798 + 27;
        f799 = i12 % 128;
        int i13 = i12 % 2;
        return type;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long m829(AppLovinAd appLovinAd) {
        long adIdNumber;
        int i10 = f798 + 91;
        f799 = i10 % 128;
        if ((i10 % 2 != 0 ? '1' : '6') != '1') {
            adIdNumber = appLovinAd.getAdIdNumber();
        } else {
            adIdNumber = appLovinAd.getAdIdNumber();
            int i11 = 49 / 0;
        }
        int i12 = f798 + 51;
        f799 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return adIdNumber;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static AppLovinAdSize m830(AppLovinAd appLovinAd) {
        int i10 = f799 + 5;
        f798 = i10 % 128;
        int i11 = i10 % 2;
        AppLovinAdSize size = appLovinAd.getSize();
        int i12 = f799 + 3;
        f798 = i12 % 128;
        int i13 = i12 % 2;
        return size;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static String m831(AppLovinAd appLovinAd) {
        int i10 = f799 + 103;
        f798 = i10 % 128;
        int i11 = i10 % 2;
        String zoneId = appLovinAd.getZoneId();
        int i12 = f799 + 29;
        f798 = i12 % 128;
        int i13 = i12 % 2;
        return zoneId;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ AppLovinAdSize m833(AppLovinAd appLovinAd) {
        int i10 = f799 + 31;
        f798 = i10 % 128;
        if ((i10 % 2 == 0 ? 'T' : (char) 31) != 'T') {
            return m830(appLovinAd);
        }
        m830(appLovinAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m843(AdViewController adViewController, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        int i10 = f799 + 121;
        f798 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m856(adViewController, appLovinAdDisplayListener);
        if (!z10) {
            int i11 = 50 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m848(AppLovinAd appLovinAd) {
        int i10 = f798 + 7;
        f799 = i10 % 128;
        if ((i10 % 2 != 0 ? G5.T : 'U') == 'U') {
            return m831(appLovinAd);
        }
        m831(appLovinAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m855(MaxAd maxAd) {
        int i10 = f798 + 17;
        f799 = i10 % 128;
        int i11 = i10 % 2;
        String strM842 = m842(maxAd);
        int i12 = f799 + 61;
        f798 = i12 % 128;
        int i13 = i12 % 2;
        return strM842;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Uri m860(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i10 = f798 + 45;
        f799 = i10 % 128;
        int i11 = i10 % 2;
        Uri uriM846 = m846(appLovinNativeAdImpl);
        int i12 = f799 + 99;
        f798 = i12 % 128;
        int i13 = i12 % 2;
        return uriM846;
    }

    public bi(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m838(bi biVar, Context context, String str, String str2) {
        int i10 = f799 + 89;
        f798 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        biVar.m835(context, str, str2);
        if (!z10) {
            throw null;
        }
        int i11 = f799 + 35;
        f798 = i11 % 128;
        if ((i11 % 2 == 0 ? '^' : ';') == ';') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m845(AppLovinAd appLovinAd) {
        int i10 = f798 + 35;
        f799 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            m824(appLovinAd);
            throw null;
        }
        boolean zM824 = m824(appLovinAd);
        int i11 = f798 + 83;
        f799 = i11 % 128;
        if ((i11 % 2 != 0 ? (char) 5 : 'A') == 'A') {
            return zM824;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m849(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        int i10 = f799 + 31;
        f798 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '&' : (char) 0;
        m844(appLovinInterstitialAdDialog, appLovinAdVideoPlaybackListener);
        if (c10 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m857(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdClickListener appLovinAdClickListener) {
        int i10 = f799 + 113;
        f798 = i10 % 128;
        char c10 = i10 % 2 == 0 ? (char) 2 : (char) 16;
        m836(appLovinInterstitialAdDialog, appLovinAdClickListener);
        if (c10 != 2) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Bundle m861(CommunicatorMessageImpl communicatorMessageImpl) {
        int i10 = f799 + 55;
        f798 = i10 % 128;
        int i11 = i10 % 2;
        Bundle bundleM853 = m853(communicatorMessageImpl);
        int i12 = f799 + 37;
        f798 = i12 % 128;
        if (i12 % 2 != 0) {
            return bundleM853;
        }
        int i13 = 31 / 0;
        return bundleM853;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m839(bi biVar, AppLovinAd appLovinAd) {
        int i10 = f798 + 13;
        f799 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            m826(appLovinAd);
            throw null;
        }
        boolean zM826 = m826(appLovinAd);
        int i11 = f798 + 65;
        f799 = i11 % 128;
        int i12 = i11 % 2;
        return zM826;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m850(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver, IntentFilter intentFilter) {
        int i10 = f798 + 51;
        f799 = i10 % 128;
        int i11 = i10 % 2;
        a0.a();
        int i12 = f798 + 27;
        f799 = i12 % 128;
        if ((i12 % 2 != 0 ? '\\' : 'G') != '\\') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m858(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver, IntentFilter intentFilter) {
        int i10 = f798 + 29;
        f799 = i10 % 128;
        int i11 = i10 % 2;
        m850(appLovinBroadcastManager, receiver, intentFilter);
        int i12 = f799 + 113;
        f798 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m863(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver) {
        int i10 = f799 + 49;
        f798 = i10 % 128;
        int i11 = i10 % 2;
        m837(appLovinBroadcastManager, receiver);
        int i12 = f799 + 45;
        f798 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        int i10 = f799 + 63;
        f798 = i10 % 128;
        try {
            try {
                String str = (String) ((i10 % 2 == 0 ? '*' : (char) 4) != '*' ? AppLovinSdk.class.getDeclaredField(m834(TextUtils.lastIndexOf("", '0', 0) + 1645, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.MeasureSpec.getSize(0) + 7).intern()) : AppLovinSdk.class.getDeclaredField(m834(10499 << TextUtils.lastIndexOf("", 'u', 1), (char) (0 >> (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 66 / View.MeasureSpec.getSize(1)).intern())).get(null);
                int i11 = f798 + 123;
                f799 = i11 % 128;
                int i12 = i11 % 2;
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return hu.m2349().m2351().m2451(AppLovinSdk.class, m834(TextUtils.getCapsMode("", 0, 0) + 1651, (char) TextUtils.getCapsMode("", 0, 0), Color.green(0) + 12).intern());
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Uri m846(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i10 = f799 + 13;
        f798 = i10 % 128;
        char c10 = i10 % 2 == 0 ? (char) 11 : 'H';
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        if (c10 != 'H') {
            int i11 = 37 / 0;
        }
        int i12 = f799 + 19;
        f798 = i12 % 128;
        if ((i12 % 2 == 0 ? '>' : 'S') == 'S') {
            return mainImageUri;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m856(AdViewController adViewController, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        int i10 = f799 + 69;
        f798 = i10 % 128;
        int i11 = i10 % 2;
        adViewController.setAdDisplayListener(appLovinAdDisplayListener);
        int i12 = f798 + 87;
        f799 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m864(AppLovinNativeAdImpl appLovinNativeAdImpl, AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        int i10 = f798 + 97;
        f799 = i10 % 128;
        int i11 = i10 % 2;
        m851(appLovinNativeAdImpl, appLovinNativeAdEventListener);
        int i12 = f799 + 89;
        f798 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        map.put(m834(1663 - View.resolveSize(0, 0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), Drawable.resolveOpacity(0, 0) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bi.m857((AppLovinInterstitialAdDialog) list.get(0), (AppLovinAdClickListener) list.get(1));
                return null;
            }
        });
        map.put(m834(((byte) KeyEvent.getModifierMetaStateMask()) + 1682, (char) (31712 - TextUtils.indexOf("", "", 0, 0)), KeyEvent.keyCodeFromString("") + 26).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bi.m849((AppLovinInterstitialAdDialog) list.get(0), (AppLovinAdVideoPlaybackListener) list.get(1));
                return null;
            }
        });
        map.put(m834(1707 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 20 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bi.m843((AdViewController) list.get(0), (AppLovinAdDisplayListener) list.get(1));
                return null;
            }
        });
        map.put(m834(1727 - View.combineMeasuredStates(0, 0), (char) (56914 - (ViewConfiguration.getPressedStateDuration() >> 16)), 19 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bi.m847((AppLovinAdView) list.get(0));
            }
        });
        map.put(m834(1746 - Drawable.resolveOpacity(0, 0), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 62194), 13 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return Long.valueOf(bi.m859((AppLovinAd) list.get(0)));
            }
        });
        map.put(m834((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1760, (char) TextUtils.getOffsetAfter("", 0), 7 - View.MeasureSpec.getMode(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bi.m833((AppLovinAd) list.get(0));
            }
        });
        map.put(m834(1766 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) Color.green(0), View.combineMeasuredStates(0, 0) + 7).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bi.m854((AppLovinAd) list.get(0));
            }
        });
        map.put(m834((ViewConfiguration.getPressedStateDuration() >> 16) + 1773, (char) Gravity.getAbsoluteGravity(0, 0), View.MeasureSpec.getMode(0) + 9).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bi.m848((AppLovinAd) list.get(0));
            }
        });
        map.put(m834((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1782, (char) (5028 - (ViewConfiguration.getTouchSlop() >> 8)), 13 - View.resolveSize(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.21
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bi.m855((MaxAd) list.get(0));
            }
        });
        map.put(m834(1843 - AndroidCharacter.getMirror('0'), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 9 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return Boolean.valueOf(bi.m845((AppLovinAd) list.get(0)));
            }
        });
        map.put(m834(1804 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), Color.alpha(0) + 8).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return Boolean.valueOf(bi.m839(bi.this, (AppLovinAd) list.get(0)));
            }
        });
        map.put(m834(1812 - Color.blue(0), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 16 - ExpandableListView.getPackedPositionType(0L)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return Boolean.valueOf(bi.m827((AppLovinAd) list.get(0)));
            }
        });
        map.put(m834(1828 - TextUtils.indexOf("", "", 0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), MotionEvent.axisFromString("") + 28).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bi.m832((Context) list.get(0));
            }
        });
        map.put(m834((-16775361) - Color.rgb(0, 0, 0), (char) (KeyEvent.keyCodeFromString("") + 14713), KeyEvent.getDeadChar(0, 0) + 33).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bi.m858((AppLovinBroadcastManager) list.get(0), (AppLovinBroadcastManager.Receiver) list.get(1), (IntentFilter) list.get(2));
                return null;
            }
        });
        map.put(m834((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1888, (char) KeyEvent.getDeadChar(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 35).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bi.m863((AppLovinBroadcastManager) list.get(0), (AppLovinBroadcastManager.Receiver) list.get(1));
                return null;
            }
        });
        map.put(m834(TextUtils.lastIndexOf("", '0') + 1924, (char) (30004 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 35).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bi.m861((AppLovinCommunicatorMessage) list.get(0));
            }
        });
        map.put(m834(1957 - (KeyEvent.getMaxKeyCode() >> 16), (char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf((CharSequence) "", '0', 0) + 32).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bi.m838(bi.this, (Context) list.get(0), (String) list.get(1), (String) list.get(2));
                return null;
            }
        });
        map.put(m834(((Process.getThreadPriority(0) + 20) >> 6) + 1988, (char) ExpandableListView.getPackedPositionGroup(0L), ExpandableListView.getPackedPositionChild(0L) + 24).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bi.m860((AppLovinNativeAdImpl) list.get(0));
            }
        });
        map.put(m834(2011 - View.combineMeasuredStates(0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getOffsetBefore("", 0) + 24).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bi.m864((AppLovinNativeAdImpl) list.get(0), (AppLovinNativeAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m834((ViewConfiguration.getEdgeSlop() >> 16) + 2035, (char) (14953 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 19).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bi.m840((AppLovinNativeAdImpl) list.get(0));
            }
        });
        int i10 = f798 + 63;
        f799 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m851(AppLovinNativeAdImpl appLovinNativeAdImpl, AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        int i10 = f798 + 83;
        f799 = i10 % 128;
        int i11 = i10 % 2;
        appLovinNativeAdImpl.setEventListener(appLovinNativeAdEventListener);
        int i12 = f798 + 31;
        f799 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Bundle m853(CommunicatorMessageImpl communicatorMessageImpl) {
        int i10 = f798 + 117;
        f799 = i10 % 128;
        int i11 = i10 % 2;
        Bundle messageData = communicatorMessageImpl.getMessageData();
        int i12 = f799 + 49;
        f798 = i12 % 128;
        int i13 = i12 % 2;
        return messageData;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x051b  */
    /* JADX WARN: Code duplicated, block: B:161:0x0709  */
    /* JADX WARN: Code duplicated, block: B:191:0x0874  */
    /* JADX WARN: Code duplicated, block: B:218:0x0968  */
    /* JADX WARN: Code duplicated, block: B:254:0x0b33 A[PHI: r5
  0x0b33: PHI (r5v6 byte) = (r5v5 byte), (r5v0 byte) binds: [B:253:0x0b31, B:250:0x0b0a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x01e5  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        byte b10 = 27;
        byte b11 = 24;
        switch (str.hashCode()) {
            case -2080431557:
                b10 = !str.equals(m834(TextUtils.lastIndexOf("", '0', 0) + 1098, (char) (TextUtils.getCapsMode("", 0, 0) + 25884), KeyEvent.normalizeMetaState(0) + 27).intern()) ? (byte) -1 : (byte) 54;
                break;
            case -2043340463:
                b10 = !str.equals(m834((ViewConfiguration.getJumpTapTimeout() >> 16) + 980, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 26 - (Process.myPid() >> 22)).intern()) ? (byte) -1 : (byte) 49;
                break;
            case -2004957298:
                b10 = (str.equals(m834(TextUtils.indexOf("", "", 0, 0) + 671, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 23 - ((byte) KeyEvent.getModifierMetaStateMask())).intern()) ? '\f' : 'H') == '\f' ? (byte) 36 : (byte) -1;
                break;
            case -1881559119:
                b10 = !str.equals(m834(1672 - AndroidCharacter.getMirror('0'), (char) (Process.getGidForName("") + 9445), 20 - TextUtils.getOffsetBefore("", 0)).intern()) ? (byte) -1 : (byte) 75;
                break;
            case -1833485839:
                b10 = !str.equals(m834(TextUtils.indexOf("", "") + 1518, (char) (MotionEvent.axisFromString("") + 1), 16 - TextUtils.getTrimmedLength("")).intern()) ? (byte) -1 : (byte) 70;
                break;
            case -1467734148:
                b10 = !str.equals(m834(164 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getScrollBarSize() >> 8), 25 - (ViewConfiguration.getEdgeSlop() >> 16)).intern()) ? (byte) -1 : (byte) 8;
                break;
            case -1450375470:
                if ((str.equals(m834((ViewConfiguration.getScrollBarSize() >> 8) + 1383, (char) Color.alpha(0), 19 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()) ? 'I' : '#') == '#') {
                    b10 = -1;
                } else {
                    int i10 = f799 + 37;
                    f798 = i10 % 128;
                    int i11 = i10 % 2;
                    b10 = 64;
                }
                break;
            case -1375681914:
                b11 = 14;
                if (!str.equals(m834(305 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), ImageFormat.getBitsPerPixel(0) + 23).intern())) {
                    b10 = -1;
                } else {
                    b10 = b11;
                }
                break;
            case -1352001524:
                if (!str.equals(m834(View.MeasureSpec.getSize(0) + 487, (char) (Color.argb(0, 0, 0, 0) + 64101), 13 - Color.blue(0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = b11;
                }
                break;
            case -1287385676:
                b10 = !str.equals(m834((ViewConfiguration.getScrollBarSize() >> 8) + 1167, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (Process.myTid() >> 22) + 30).intern()) ? (byte) -1 : (byte) 57;
                break;
            case -1229948432:
                b10 = !str.equals(m834(213 - TextUtils.getOffsetAfter("", 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 30).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -1201363365:
                b10 = !str.equals(m834(589 - (Process.myPid() >> 22), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 14 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 31;
                break;
            case -1179967667:
                if (!str.equals(m834((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1496, (char) (18779 - TextUtils.indexOf("", "")), 21 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f798 + 73;
                    f799 = i12 % 128;
                    if (i12 % 2 == 0) {
                        b10 = 69;
                    } else {
                        b10 = 26;
                    }
                }
                break;
            case -1153520596:
                b10 = !str.equals(m834(Color.argb(0, 0, 0, 0) + 1147, (char) (34630 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 20 - TextUtils.indexOf("", "", 0)).intern()) ? (byte) -1 : (byte) 56;
                break;
            case -1109694355:
                b10 = !str.equals(m834((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 272, (char) View.MeasureSpec.getSize(0), 32 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()) ? (byte) -1 : (byte) 13;
                break;
            case -1073613085:
                b10 = !str.equals(m834(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 603, (char) (AndroidCharacter.getMirror('0') - '0'), View.MeasureSpec.makeMeasureSpec(0, 0) + 19).intern()) ? (byte) -1 : (byte) 32;
                break;
            case -1046364472:
                b10 = !str.equals(m834(651 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) TextUtils.indexOf("", "", 0), ((Process.getThreadPriority(0) + 20) >> 6) + 20).intern()) ? (byte) -1 : (byte) 35;
                break;
            case -998829219:
                if (!str.equals(m834(1226 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0) + 27481), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 36).intern())) {
                    b10 = -1;
                } else {
                    int i13 = f799 + 95;
                    f798 = i13 % 128;
                    int i14 = i13 % 2;
                    b10 = 59;
                }
                break;
            case -922738309:
                if (!str.equals(m834((ViewConfiguration.getWindowTouchSlop() >> 8) + 35, (char) View.getDefaultSize(0, 0), TextUtils.getTrimmedLength("") + 34).intern())) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case -859912744:
                b10 = !str.equals(m834(TextUtils.indexOf("", "", 0) + 1320, (char) ((-1) - MotionEvent.axisFromString("")), TextUtils.indexOf("", "", 0, 0) + 52).intern()) ? (byte) -1 : (byte) 62;
                break;
            case -812800838:
                b10 = !str.equals(m834((ViewConfiguration.getWindowTouchSlop() >> 8) + 11, (char) Color.red(0), 10 - ((Process.getThreadPriority(0) + 20) >> 6)).intern()) ? (byte) -1 : (byte) 1;
                break;
            case -781635730:
                b10 = !str.equals(m834(113 - View.combineMeasuredStates(0, 0), (char) (Process.myPid() >> 22), 28 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -702340466:
                b10 = !(!str.equals(m834(AndroidCharacter.getMirror('0') + 1401, (char) Gravity.getAbsoluteGravity(0, 0), 47 - TextUtils.lastIndexOf("", '0')).intern())) ? (byte) 68 : (byte) -1;
                break;
            case -558305015:
                if (!str.equals(m834(630 - ExpandableListView.getPackedPositionGroup(0L), (char) (View.resolveSize(0, 0) + 22431), Color.green(0) + 21).intern())) {
                    b10 = -1;
                } else {
                    int i15 = f798 + 3;
                    f799 = i15 % 128;
                    if (i15 % 2 != 0) {
                        b10 = 71;
                    } else {
                        b10 = 34;
                    }
                }
                break;
            case -529676547:
                if (!str.equals(m834((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1533, (char) (8133 - View.resolveSize(0, 0)), Process.getGidForName("") + 30).intern())) {
                    b10 = -1;
                } else {
                    b10 = 71;
                }
                break;
            case -515103971:
                b10 = !str.equals(m834(773 - Color.argb(0, 0, 0, 0), (char) (Color.rgb(0, 0, 0) + 16830458), 17 - View.resolveSizeAndState(0, 0, 0)).intern()) ? (byte) -1 : (byte) 41;
                break;
            case -499617006:
                if (!str.equals(m834(Color.alpha(0) + 1065, (char) TextUtils.getOffsetBefore("", 0), TextUtils.indexOf("", "") + 32).intern())) {
                    b10 = -1;
                } else {
                    int i16 = f798 + 19;
                    f799 = i16 % 128;
                    int i17 = i16 % 2;
                    b10 = 53;
                }
                break;
            case -490511554:
                b10 = !str.equals(m834(1419 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getLongPressTimeout() >> 16) + 15).intern()) ? (byte) -1 : (byte) 66;
                break;
            case -490128445:
                b10 = !str.equals(m834(1434 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), MotionEvent.axisFromString("") + 16).intern()) ? (byte) -1 : (byte) 67;
                break;
            case -388222861:
                b10 = !str.equals(m834(View.MeasureSpec.getMode(0) + 950, (char) KeyEvent.getDeadChar(0, 0), 30 - View.resolveSizeAndState(0, 0, 0)).intern()) ? (byte) -1 : (byte) 48;
                break;
            case -313801005:
                b10 = !str.equals(m834(457 - Color.alpha(0), (char) (62113 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), View.getDefaultSize(0, 0) + 17).intern()) ? (byte) -1 : (byte) 22;
                break;
            case -294317262:
                if (!str.equals(m834(KeyEvent.keyCodeFromString("") + 85, (char) (5448 - View.MeasureSpec.getMode(0)), 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    int i18 = f799 + 57;
                    f798 = i18 % 128;
                    if (i18 % 2 != 0) {
                        b10 = 5;
                    } else {
                        b10 = 3;
                    }
                }
                break;
            case -292897006:
                b10 = !str.equals(m834(1124 - TextUtils.getOffsetAfter("", 0), (char) View.getDefaultSize(0, 0), 22 - TextUtils.lastIndexOf("", '0', 0, 0)).intern()) ? (byte) -1 : (byte) 55;
                break;
            case -265039036:
                if (!str.equals(m834(Color.alpha(0) + 69, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 16 - View.combineMeasuredStates(0, 0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case -155576673:
                b10 = !str.equals(m834(Color.green(0) + 733, (char) (15703 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 22 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern()) ? (byte) -1 : (byte) 39;
                break;
            case -62837376:
                b10 = !str.equals(m834(694 - Process.getGidForName(""), (char) (64018 - TextUtils.indexOf((CharSequence) "", '0')), 22 - Color.alpha(0)).intern()) ? (byte) -1 : (byte) 37;
                break;
            case 9498927:
                b10 = !str.equals(m834(TextUtils.lastIndexOf("", '0', 0) + 371, (char) (Color.rgb(0, 0, 0) + 16777216), TextUtils.getCapsMode("", 0, 0) + 27).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 74118279:
                b10 = str.equals(m834(574 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (3447 - (KeyEvent.getMaxKeyCode() >> 16)), 6 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern()) ? (byte) 29 : (byte) -1;
                break;
            case 113294717:
                b10 = !str.equals(m834(755 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18).intern()) ? (byte) -1 : (byte) 40;
                break;
            case 113748919:
                b10 = !str.equals(m834(926 - Drawable.resolveOpacity(0, 0), (char) (ExpandableListView.getPackedPositionGroup(0L) + 62769), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24).intern()) ? (byte) -1 : (byte) 47;
                break;
            case 148784004:
                b10 = !(!str.equals(m834(1563 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 23 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) ? (byte) 72 : (byte) -1;
                break;
            case 404925231:
                b10 = !str.equals(m834(1262 - (KeyEvent.getMaxKeyCode() >> 16), (char) (35359 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 26).intern()) ? (byte) -1 : (byte) 60;
                break;
            case 448683812:
                b10 = !str.equals(m834(ExpandableListView.getPackedPositionChild(0L) + IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, (char) ((Process.getThreadPriority(0) + 20) >> 6), View.combineMeasuredStates(0, 0) + 8).intern()) ? (byte) -1 : (byte) 51;
                break;
            case 572995203:
                b10 = !str.equals(m834(Color.argb(0, 0, 0, 0), (char) (ImageFormat.getBitsPerPixel(0) + 19006), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()) ? (byte) -1 : (byte) 0;
                break;
            case 605983675:
                b10 = !str.equals(m834(Color.rgb(0, 0, 0) + 16778054, (char) (KeyEvent.normalizeMetaState(0) + 20823), 36 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 44;
                break;
            case 729244021:
                if (!str.equals(m834(TextUtils.indexOf("", "") + 519, (char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 24).intern())) {
                    b10 = -1;
                } else {
                    b10 = 26;
                }
                break;
            case 735058557:
                if (!str.equals(m834(TextUtils.indexOf((CharSequence) "", '0', 0) + 544, (char) (18714 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 20 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                    b10 = -1;
                }
                break;
            case 752486192:
                b10 = !str.equals(m834(Drawable.resolveOpacity(0, 0) + 1197, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 16602), 29 - KeyEvent.keyCodeFromString("")).intern()) ? (byte) -1 : (byte) 58;
                break;
            case 794586549:
                b10 = !str.equals(m834((Process.myTid() >> 22) + 790, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19).intern()) ? (byte) -1 : ExifInterface.START_CODE;
                break;
            case 896010188:
                b10 = !str.equals(m834(View.MeasureSpec.getMode(0) + 448, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 9 - (ViewConfiguration.getTouchSlop() >> 8)).intern()) ? (byte) -1 : (byte) 21;
                break;
            case 983006005:
                b10 = !str.equals(m834(TextUtils.indexOf((CharSequence) "", '0') + 875, (char) (49611 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 34 - Color.blue(0)).intern()) ? (byte) -1 : (byte) 45;
                break;
            case 1003087195:
                b10 = !str.equals(m834(349 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 21).intern()) ? (byte) -1 : (byte) 16;
                break;
            case 1072916356:
                b10 = !str.equals(m834(Color.rgb(0, 0, 0) + 16777630, (char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.getOffsetBefore("", 0) + 20).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 1152082353:
                b10 = !str.equals(m834(Color.red(0) + 1402, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 17).intern()) ? (byte) -1 : (byte) 65;
                break;
            case 1234617814:
                b10 = !str.equals(m834(809 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (17745 - (ViewConfiguration.getPressedStateDuration() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0) + 29).intern()) ? (byte) -1 : (byte) 43;
                break;
            case 1265496546:
                b10 = !str.equals(m834(500 - ExpandableListView.getPackedPositionGroup(0L), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 19).intern()) ? (byte) -1 : (byte) 25;
                break;
            case 1278030609:
                b10 = !str.equals(m834(Gravity.getAbsoluteGravity(0, 0) + 326, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45241), View.resolveSizeAndState(0, 0, 0) + 23).intern()) ? (byte) -1 : (byte) 15;
                break;
            case 1318309173:
                b10 = !str.equals(m834(474 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (TextUtils.getOffsetAfter("", 0) + 13455), 13 - TextUtils.getOffsetBefore("", 0)).intern()) ? (byte) -1 : (byte) 23;
                break;
            case 1337781577:
                b10 = !(!str.equals(m834((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 397, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12696), (Process.myTid() >> 22) + 17).intern())) ? (byte) 18 : (byte) -1;
                break;
            case 1342402498:
                if (!str.equals(m834(TextUtils.getTrimmedLength("") + 141, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 23 - Color.green(0)).intern())) {
                    b10 = -1;
                } else {
                    int i19 = f799 + 59;
                    f798 = i19 % 128;
                    b10 = !(i19 % 2 != 0) ? (byte) 119 : (byte) 7;
                }
                break;
            case 1342953158:
                b10 = !str.equals(m834(1603 - (ViewConfiguration.getTouchSlop() >> 8), (char) Color.blue(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 20).intern()) ? (byte) -1 : (byte) 74;
                break;
            case 1383609003:
                b10 = !str.equals(m834(433 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (30739 - ImageFormat.getBitsPerPixel(0)), 14 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 20;
                break;
            case 1384123355:
                b10 = !str.equals(m834((Process.myTid() >> 22) + 244, (char) ExpandableListView.getPackedPositionGroup(0L), 14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()) ? (byte) -1 : (byte) 11;
                break;
            case 1384168212:
                b10 = !str.equals(m834(TextUtils.getOffsetBefore("", 0) + 258, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 14 - TextUtils.indexOf("", "")).intern()) ? (byte) -1 : (byte) 12;
                break;
            case 1384212095:
                if (!str.equals(m834((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), Color.green(0) + 14).intern())) {
                    b10 = -1;
                } else {
                    int i20 = f798 + 37;
                    f799 = i20 % 128;
                    if (i20 % 2 == 0) {
                        b10 = 2;
                    } else {
                        b10 = 4;
                    }
                }
                break;
            case 1384605075:
                if (!str.equals(m834(View.MeasureSpec.getMode(0) + 621, (char) (316 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 9 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 33;
                }
                break;
            case 1450884094:
                b10 = !str.equals(m834(1372 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) View.combineMeasuredStates(0, 0), 12 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 63;
                break;
            case 1620186974:
                b10 = str.equals(m834(577 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 11 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()) ? (byte) 30 : (byte) -1;
                break;
            case 1724415069:
                b10 = !str.equals(m834(ExpandableListView.getPackedPositionChild(0L) + 190, (char) (9450 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (KeyEvent.getMaxKeyCode() >> 16) + 24).intern()) ? (byte) -1 : (byte) 9;
                break;
            case 1753212735:
                b10 = !str.equals(m834(907 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (View.getDefaultSize(0, 0) + 19280), MotionEvent.axisFromString("") + 19).intern()) ? (byte) -1 : (byte) 46;
                break;
            case 1880938499:
                b10 = !str.equals(m834(View.MeasureSpec.getMode(0) + IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION, (char) (39704 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 24 - (ViewConfiguration.getTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 52;
                break;
            case 1944524259:
                b10 = !str.equals(m834(716 - Process.getGidForName(""), (char) KeyEvent.keyCodeFromString(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15).intern()) ? (byte) -1 : (byte) 38;
                break;
            case 1991372702:
                b10 = !str.equals(m834(1006 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 27 - ExpandableListView.getPackedPositionGroup(0L)).intern()) ? (byte) -1 : (byte) 50;
                break;
            case 2016893291:
                b10 = !str.equals(m834((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + TTAdConstant.STYLE_SIZE_RADIO_9_16, (char) (11908 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 10).intern()) ? (byte) -1 : (byte) 28;
                break;
            case 2063749596:
                if (!str.equals(m834((Process.myTid() >> 22) + 1288, (char) TextUtils.indexOf("", "", 0), View.resolveSizeAndState(0, 0, 0) + 32).intern())) {
                    b10 = -1;
                } else {
                    int i21 = f799 + 113;
                    f798 = i21 % 128;
                    if (i21 % 2 != 0) {
                        b10 = 61;
                    } else {
                        b10 = 33;
                    }
                }
                break;
            case 2145283122:
                b10 = !str.equals(m834(Gravity.getAbsoluteGravity(0, 0) + 1586, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 17 - (ViewConfiguration.getEdgeSlop() >> 16)).intern()) ? (byte) -1 : (byte) 73;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return AppLovinSdk.class;
            case 1:
                return AppLovinAd.class;
            case 2:
            case 3:
                return AppLovinAdView.class;
            case 4:
                return AdViewController.class;
            case 5:
                return AppLovinInterstitialActivity.class;
            case 6:
                return AppLovinInterstitialAdDialog.class;
            case 7:
                return AppLovinAdClickListener.class;
            case 8:
                return AppLovinAdDisplayListener.class;
            case 9:
                return AppLovinAdRewardListener.class;
            case 10:
                return AppLovinAdVideoPlaybackListener.class;
            case 11:
                return AppLovinAdSize.class;
            case 12:
                return AppLovinAdType.class;
            case 13:
                return AppLovinIncentivizedInterstitial.class;
            case 14:
                return AppLovinInterstitialAd.class;
            case 15:
                return AppLovinWebViewActivity.class;
            case 16:
                return AppLovinAdServiceImpl.class;
            case 17:
                return AppLovinAdViewEventListener.class;
            case 18:
                return AppLovinVideoView.class;
            case 19:
                return AdViewControllerImpl.class;
            case 20:
                return AppLovinAdBase.class;
            case 21:
                return MaxAdView.class;
            case 22:
                return MaxInterstitialAd.class;
            case 23:
                return MaxRewardedAd.class;
            case 24:
                return MaxAdViewImpl.class;
            case 25:
                return MaxFullscreenAdImpl.class;
            case 26:
                return MaxAdapterParametersImpl.class;
            case 27:
                return MediationServiceImpl.class;
            case 28:
                return MaxAdapter.class;
            case 29:
                return MaxAd.class;
            case 30:
                return MaxAdFormat.class;
            case 31:
                return MaxAdListener.class;
            case 32:
                return MaxAdViewAdListener.class;
            case 33:
                return MaxReward.class;
            case 34:
                return MaxRewardedAdListener.class;
            case 35:
                return MediationAdapterBase.class;
            case 36:
                return AppLovinMediationAdapter.class;
            case 37:
                return MediationAdapterRouter.class;
            case 38:
                return MaxAdViewAdapter.class;
            case 39:
                return MaxInterstitialAdapter.class;
            case 40:
                return MaxRewardedAdapter.class;
            case 41:
                return MaxSignalProvider.class;
            case 42:
                return MaxAdapterParameters.class;
            case 43:
                return MaxAdapterResponseParameters.class;
            case 44:
                return MaxAdapterSignalCollectionParameters.class;
            case 45:
                return MaxAdapterInitializationParameters.class;
            case 46:
                return MaxAdapterListener.class;
            case 47:
                return MaxAdViewAdapterListener.class;
            case 48:
                return MaxInterstitialAdapterListener.class;
            case 49:
                return MaxRewardedAdapterListener.class;
            case 50:
                return MaxSignalCollectionListener.class;
            case 51:
                return MaxError.class;
            case 52:
                return AppLovinBroadcastManager.class;
            case 53:
                return AppLovinBroadcastManager.Receiver.class;
            case 54:
                return AppLovinCommunicatorMessage.class;
            case 55:
                return CommunicatorMessageImpl.class;
            case 56:
                return AppLovinCommunicator.class;
            case 57:
                return AppLovinCommunicatorSubscriber.class;
            case 58:
                return AppLovinCommunicatorPublisher.class;
            case 59:
                return AppLovinCommunicatorMessagingService.class;
            case 60:
                return AppLovinCommunicatorEntity.class;
            case 61:
            case 62:
                return AppLovinFullscreenThemedActivity.class;
            case 63:
                return MaxNativeAd.class;
            case 64:
                return MaxNativeAdListener.class;
            case 65:
                return MaxNativeAdLoader.class;
            case 66:
                return MaxNativeAdImpl.class;
            case 67:
            case 68:
                return MaxNativeAdView.class;
            case 69:
                return MaxNativeAdViewBinder.class;
            case 70:
                return AppLovinNativeAd.class;
            case 71:
                return AppLovinNativeAdEventListener.class;
            case 72:
                int i22 = f799 + 57;
                f798 = i22 % 128;
                if (i22 % 2 != 0) {
                    return AppLovinNativeAdService.class;
                }
                throw null;
            case 73:
                return AppLovinMediaView.class;
            case 74:
                return AppLovinVastMediaView.class;
            case 75:
                return AppLovinNativeAdImpl.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Uri m852(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i10 = f798 + 33;
        f799 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            appLovinNativeAdImpl.getIconUri();
            throw null;
        }
        Uri iconUri = appLovinNativeAdImpl.getIconUri();
        int i11 = f799 + 125;
        f798 = i11 % 128;
        if (!(i11 % 2 == 0)) {
            return iconUri;
        }
        int i12 = 56 / 0;
        return iconUri;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m844(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        int i10 = f798 + 59;
        f799 = i10 % 128;
        int i11 = i10 % 2;
        appLovinInterstitialAdDialog.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
        int i12 = f799 + 117;
        f798 = i12 % 128;
        if ((i12 % 2 == 0 ? '%' : (char) 24) != 24) {
            int i13 = 29 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m842(MaxAd maxAd) {
        int i10 = f798 + 15;
        f799 = i10 % 128;
        int i11 = i10 % 2;
        String creativeId = maxAd.getCreativeId();
        int i12 = f799 + 39;
        f798 = i12 % 128;
        int i13 = i12 % 2;
        return creativeId;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static AppLovinBroadcastManager m841(Context context) {
        int i10 = f798 + 121;
        f799 = i10 % 128;
        int i11 = i10 % 2;
        AppLovinBroadcastManager appLovinBroadcastManager = AppLovinBroadcastManager.getInstance(context);
        int i12 = f799 + 67;
        f798 = i12 % 128;
        int i13 = i12 % 2;
        return appLovinBroadcastManager;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m836(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdClickListener appLovinAdClickListener) {
        int i10 = f799 + 7;
        f798 = i10 % 128;
        int i11 = i10 % 2;
        appLovinInterstitialAdDialog.setAdClickListener(appLovinAdClickListener);
        int i12 = f799 + 117;
        f798 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m837(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver) {
        int i10 = f799 + 9;
        f798 = i10 % 128;
        int i11 = i10 % 2;
        a0.a();
        int i12 = f799 + 91;
        f798 = i12 % 128;
        if (!(i12 % 2 == 0)) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m835(Context context, final String str, String str2) {
        AppLovinCommunicator.getInstance(context).subscribe(new AppLovinCommunicatorSubscriber() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.14
            @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
            public final void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
            }

            @Override // com.applovin.communicator.AppLovinCommunicatorEntity
            public final String getCommunicatorId() {
                return str;
            }
        }, str2);
        int i10 = f799 + 53;
        f798 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 16 : '`') != '`') {
            int i11 = 90 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m834(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f800[i10 + i12]) ^ (((long) i12) * f801)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static AdViewController m862(AppLovinAdView appLovinAdView) {
        int i10 = f799 + 51;
        f798 = i10 % 128;
        char c10 = i10 % 2 == 0 ? (char) 26 : (char) 22;
        AdViewController adViewController = appLovinAdView.getAdViewController();
        if (c10 == 26) {
            int i11 = 27 / 0;
        }
        return adViewController;
    }
}
