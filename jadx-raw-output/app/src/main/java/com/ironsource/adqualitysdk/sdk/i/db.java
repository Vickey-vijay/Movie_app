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
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class db implements ci {

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static int f1654 = 0;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static int f1655 = 1;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static long f1656;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char[] f1657;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final cx f1670 = new cx();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final de f1668 = new de();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final cv f1669 = new cv();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final da f1667 = new da();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final dc f1666 = new dc();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private final dd f1661 = new dd();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final cw f1663 = new cw();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final ct f1664 = new ct();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private final cr f1665 = new cr();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final cy f1662 = new cy();

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private final df f1658 = new df();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private final cs f1660 = new cs();

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private final cu f1659 = new cu();

    static {
        char[] cArr = new char[IronSourceError.ERROR_LEGACY_INIT_POST_FAILED];
        ByteBuffer.wrap("\u0000cK\u000e\u0096²âZ-Îx\u0096Ä)\u000fÉ[M¦\u0007ñ¾=Y\u0088åÓ\u0088\u001f=öe½\b`´\u0014\\ÛÈ\u008e\u00902/ùÏ\u00adAP\r\u0007¦ËH~é%\u009f\u0000gK\u0004\u0096¶â`-ñx\u0097Ä4\u000fÂ[f¦\u001dñ\u0080=X\u0088ãÓ\u0083ü\u008f·øjJ\u001e\u009cÑ\r\u0084k8Èó>§\u009aZá\r|Á¤t\u001f/\u007fþ+µHhú\u001c.Ó¬\u0086þ:oñ\u0089¥\u0012XL\u000fãÃ\u0010v\u0086-Óám\u0094\u008eH\u001dÿ^²êf\u0016\u001d®ÐÐ\u0084n;\u0082\u0000iK\u0012\u0096\u0094âJ-áx\u0092Ä\u0010\u000fÎ[{¦\u0000ñ¨=G\u0088éîk¥\bxº\fyÃá\u0096\u008c*=\u008f£ÄÀ\u0019rm¤¢/÷OKö\u0080\u0006Ô¢)Ù~X²\u0086\u0007-\\^\u0000gK\u0004\u0096¶âe-íx\u0080Ä*\u000fÃ»\u009bðø-JY\u0099\u0096\u0011Ã|\u007fÖ´?à\u0087\u0000gK\u0004\u0096¶âe-íx\u0097Ä5\u000fÓ[N¦\u0000ñ¯=G\u0088èÓ¢\u001f(jû¶i\u0001\u0001L·ó=¸^eì\u0011?Þ·\u008bÍ7oü\u0089¨\u0014UZ\u0002õÎ\u001d{² àì}\u0099\u0081E\"ò{¿úk\f\u0010¨ÝÆ\u0089trÝ9\u00adä\u0019\u0090ü_N\n>¶¾}p)ÓÔ»\u0083\u0010OÑúW¡5m²\u0018dÄÇs£>\bêè\u0091X§Uì61\u0084E\\\u008aÓß£c\u001c¨úü^t½?Þâl\u0096´Y;\fK°ô{\u0012/¶ÒÀvr=\u0002à¶\u0094S[á\u000e\u0091²\u001ayÓ-mÐ\u0010\u0087´K^þÙ¥\u0099i9\u001cüÀtw\t:¯îF\u0095àX\u0096½\u0004ög+Õ_\u0006\u0090\u008eÅôyV²°æ8\u001b~LÛ\u0080!5\u0081né\u0015ð^\u0080\u00834÷Ñ8cm\u0013Ñ\u0086\u001aQNú³\u0088ä:(Ð\u009d[Æ\u001b\n»\u007f~£ö\u0014\u008bY-\u008dÄöb;\u0014\u0000gK\u0004\u0096¶âl-æx\u008fÄ#\u000fÄ[| \u001bëx6ÊB\u0010\u008d\u009aØód_¯¸û\u0000\u0006f\u0089RÂ1\u001f\u0083kY¤ÓñºM\u0016\u0086ñÒI/\u001ax\u0096´{\u0001ÕZ¼\u0000gK\u0004\u0096¶âl-æx\u008fÄ#\u000fÄ[|¦?ñ«=G\u0088ùÓ\u0088½vö\u0015+§_}\u0090÷Å\u009ey2²Õæm\u001b>L²\u0080_5ñn\u0098¢,\u0000gK\u0004\u0096¶âl-æx\u008fÄ#\u000fÄ[|¦?ñ«=G\u0088ùÓ\u0088\u001f=\u0000vK\u0004\u0096°âP-íx\u008aÄ(\u000fä[g¦\u0004ñº=J\u0088þÓ\u0088Ô;\u009fXBê6>ù´¬Õ\u0010IÛ\u008f\u008f&r\\%øé\u0010\\£\u00053NP\u0093âç6(¼}ÝÁ@\n\u0096^;£Xôæ82\u008d¹ÖÍ\u001ayo\u0093³!\u0004V\u0000gK\u0004\u0096¶âe-íx\u0097Ä5\u000fÓ[Z¦\fñ\u00ad=N\u0088ôÓ \u001f/jÛ¶s\u0001\u0019\u0000iK\u0012\u0096\u0085ây-íx\u0095Ä\u0005\u000fÈ[e¦\u0019ñ¸=N\u0088ÿÓ\u009e\u001f+jË¶C\u0001\u0005L \u0098Zãú.\u0092\u0000dK\u0004\u0096¡âL-éx\u0095Ä4\u000fÂ[{¦\u001añ\u008d=q\u0088åÓ\u009d\u001f\u001djÛ¶b\u0001\u0018L¼\u0098T\u008c\u008fÇÿ\u001aKn®¡\u001côlHì\u00839×\u0085*è}C±\u008b\u0004\t_r\u0093Öæ&:\u0092\u008døÀL\u0000sK\u0004\u0096¶âV-ôx£Ä4\u000fÆ[e¦\fñ\u0086=B\u0088ÿÓ\u0099\u001f+jÁ¶u\u0001\u0003ë' Q}ú\t\u0019Æ§\u0093Õ/Uä\u0080°<MQ\u001aúÖ2c°8Ëôo\u0081\u009f]+êA§õ¾óõ\u0085(3\\Î\u0093dÆ\u0007z¢±iåç\u0018«O'\u0083Ã6nm\u0007¡\u0083ÔG\bâ¿\u0084ò6&Ü]p\u0090\u00065Ï~¿£\u000b×î\u0018\\M,ñ¼:bnÁ\u0093²Ä)\bé½cæ-*\u008b_`\u0083×4\u0091y\u0017\u00adìÖL\u001b<O\u0094ð~$Æ\u0000rK\u0004\u0096²âO-åx\u0086Ä#\u000fè[f¦=ñ¥=^\u0088ïÓ\u0085\u001f\u0002jÆ¶c\u0001\u0005L·\u0098]ãñ.\u0087¬æç\u0096:\"NÇ\u0081uÔ\u0005h\u0095£K÷è\n\u009b]\u0000\u0091À$]\u007f\u0007³¾ÆI\u001aý\u00ad¸à>4ÅOe\u0082\u0015Ö½iW½ïYL\u0012/Ï\u009d»GtÁ!\u008d\u009d\u0001Vå\u0002@ÿ)¨\u00addiÑÔ\u008a²F\u00003êï^X(\u0000gK\u0004\u0096¶âl-êx±Ä)\u000fÒ[k¦\u0001ñ\u0086=B\u0088ÿÓ\u0099\u001f+jÁ¶u\u0001\u0003\u0000cK\u0013\u0096§âB-ðx\u0080Ä\u000b\u000fÂ[l¦\u0000ñ«={\u0088àÓ\u008c\u001f7jÊ¶b\u0001>L¼\u0098cãæ.\u0090z&ÅÖ\u0011j\\\u001c§¾ów>õ\u0089\u008eÕ* ÚlN·ä\u0002\u0090w÷<\u0087á3\u0095ÖZd\u000f\u0014³\u009fxV,øÑ\u0094\u0086?Jïÿt¤\u0018h£\u001d^Áövª;(ïî\u0094nY\u0007\r\u00ad²ofå+\u009eÐ:\u0084ÊIfþ\f¢¸\u0000cK\u0013\u0096§âB-ðx\u0080Ä\u000b\u000fÂ[l¦\u0000ñ«={\u0088àÓ\u008c\u001f7jÊ¶b\u0001>L¼\u0098pãû.\u0098z&ÅÛ\u0011}\\\r§³óT>ò\u0089±Õ7 ÌlT·ä\u0002\u008cN&\u0099Ö\u0000cK\u0013\u0096§âB-ðx\u0080Ä\u000b\u000fÂ[l¦\u0000ñ«={\u0088àÓ\u008c\u001f7jÊ¶b\u0001>L¼\u0098`ãñ.\u0090z=Åô\u0011w\\\u0014§ªóW>ù\u0089\u0089Õ; ólI·ò\u0002\u0096N&\u0099Êå`0\u0014\u0000cK\u0013\u0096§âB-ðx\u0080Ä\t\u000fÉ[D¦\bñ³=D\u0088ùÓ\u0099\u001f\rjÇ¶q\u0001\u001fLµ\u0098VãØ.\u009cz%ÅÃ\u0011}\\\u0017§¿óIÂã\u0089\u0093T' Âïpº\u0000\u0006\u0089ÍI\u0099Éd\u009d3>ÿÊJo\u0011\u0005Ý\u009d¨[tñÃ\u0085\u008e7Zð!|ì\u0014¸¸\u0007PÓý\u009eµe31ÈühK\u0018\u0017°âZ®Ò\u0097ÝÜ«\u0001\u001duàºJï)S\u008c\u0098GÌÉ1\u0095f\u0000ªá\u001fHD\u0001\u0088\u008eým!Ï\u0096²Û\u0018\u000fèt^¹\u0016í\u0090Rk\u0086ÃË³0\u001bdñ©A\u0003DH2\u0095\u0084áy.Ó{°Ç\u0015\fÞXP¥\u0012ò\u0099>y\u008bÓÐº\u001c(iëµC\u00027O\u0085\u009bwàÇ-§y,Æè\u0012]_;¤\u0089ðc=Ï\u008a¹¢Ìéº4\f@ñ\u008f[Ú8f\u009d\u00adVùØ\u0004\u009aS\u0011\u009fñ*[q2½¹È\u007f\u0014È£ î :äAY\u008c?Ø\u008dgg³ÃþµVé\u001d\u009fÀ)´Ô{~.\u001d\u0092¸Ys\rýð¿§4kÔÞ~\u0085\u0017I\u0096<[àæW\u009a\u001a%ÎÍµ{x\u0007,¢\u0093BGÏ\n\u008bñ2¥Ôhbß\b\u0083 vV\u0000gK\u0004\u0096¶âg-áx\u0086Ä)\u000fÕ[i¦\u001dñ¯=O\u0088ÏÓ\u008c\u001f\"jÃ¶r\u0001\u0010L±\u0098X\u0000cK\u0013\u0096§âB-ðx\u0080Ä\u0004\u000fÕ[g¦\bñ®=H\u0088íÓ\u009e\u001f:jý¶u\u0001\u0012L·\u0098Zãâ.\u0090z$\u0000cK\u0013\u0096§âB-ðx\u0080Ä\u0012\u000få[D¦\u0000ñ¹=_\u0088éÓ\u0083\u001f+jÝ\u008f\u008aÄñ\u0019`m¤¢6÷sKÄ\u0080(Ô\u0082)þ~P²\u0098\u0007\u001d\\a\u0090Õå59¿\u008eûÃB\u0017¤l\u0012¡xõÐJ&\u0000cK\u0013\u0096§âB-ðx\u0080Ä\u0011\u000fÂ[j¦?ñ£=N\u0088ûÓ¡\u001f'jÜ¶d\u0001\u0014L¼\u0098Vãæ\u0000sK\u0004\u0096¶ât-áx\u0087Ä\u0010\u000fÎ[m¦\u001eñ\u0089=G\u0088åÓ\u0088\u001f jÛ'µlÂ±pÅ²\n'_AãÃ(\t|¼\u0081ÀÖa\u001a\u0088¯\tôG8áM\f\u0091¸&Ã\u000f\fDo\u0099Ýí\u001f\"\u008awìË{\u0000¥T\u0006©uþâ2,\u0087\u008eÜã\u0010Ke°Tr\u001f\u0011Â£¶ayô,\u0092\u0090\u0010[Ú\u000foò\u0013¥²i[ÜÚ\u0087\u0094K2>ßâkU\u0010[\u0007\u0010pÍØ¹3vµ#ã\u009f@T¼\u0000\u000eÃI\u0088>U\u0096!}îô»¬\u0007\u0013Ìó\u0098we%2\u0095þ\u007fKÂ\u0089µÂÑ\u001frk²¤&ñTMü\u0086\u0007Ò\u0099/Åxn´\u009e\u00016Z]\u0096ÿã\t\u0000gK\u0004\u0096¶â`-ëx\u008bÄ(\u000fÂ[k¦\u001dñ¥=Y\u0082fÉ\u0005\u0014·`a¯êú\u008aF3\u008dÃÙq$\u001c\u0000gK\u0004\u0096¶âw-íx\u0088Ä#\u0085\u008bÎè\u0013Zg\u0083¨\týzAÞ\u008a\u001fÞ\u008b#ðtE¸¯\u0000gK\u0004\u0096¶âo-åx\u0096Ä2\u000fó[g¦\u001cñ©=C\u0088ØÓ\u0084\u001f#jÊ\u0000gK\u0004\u0096¶â`-ñx\u0097Ä4\u000fÂ[f¦\u001dñ\u008b=H\u0088øÓ\u0084\u001f8jÆ¶d\u0001\b^±\u0015ÁÈu¼\u0090s\"&R\u009a×Q\u0007\u0005¿øÚ¯lc\u0090Ö(\u008dZAÕ4\u0013è¤_Ì>êu\u009a¨.ÜË\u0013yF\tú\u008e1Je÷\u0098\u0085Ï1\u0003Ö¶lí\u0017!¢TT\u0088Ð?\u0096r=¦Õ\u0000cK\u0013\u0096§âB-ðx\u0080Ä\u0005\u000fÕ[m¦\bñ¾=B\u0088úÓ\u0088\u001f\u0007jË¶c\u0000cK\u0013\u0096§âB-ðx\u0080Ä\u000b\u000fÂ[l¦\u0000ñ«=_\u0088åÓ\u0082\u001f jë¶q\u0001\u0005L³\u0000gK\u0004\u0096¶âp-àx\u008eÄ\u0010\u000fÂ[z¦\u001añ£=D\u0088â\u0000gK\u0004\u0096¶âe-ñx\u0089Ä*\u000fô[l¦\u0002ñ\u009c=N\u0088þÓ\u009e\u001f'jÀ¶~\u0000gK\u0004\u0096¶âp-ëx\u008aÄ+\u000fË[i¦:ñ®=@\u0088ÚÓ\u0088\u001f<jÜ¶y\u0001\u001eL¼\u0000gK\u0004\u0096¶âb-ãx\u0080Ä(\u000fÓ[Z¦\fñ§=D\u0088øÓ\u0088\u001f\rjÀ¶~\u0001\u0017L»\u0098T\u0000cK\u0013\u0096§âB-ðx\u0080Ä\u0002\u000fÂ[n¦\bñ¿=G\u0088øÓ¨\u001f8jÊ¶~\u0001\u0005L\u0098\u0098@ãû.\u009b\u0000gK\u0004\u0096¶â`-ëx\u008bÄ(\u000fÂ[k¦\u001dñ¥=Y\u0088ÚÓ\u0088\u001f<jÜ¶y\u0001\u001eL¼\u0012¢YÀ\u0084kð¨?<jNÖæ\u001d\u001d¹çò\u009c/\u001f[É\u0094aÁ\"}¦¶}âã\u001f\u0094H0\u0084è1mj\u0007¦¥\u0000gK\u0004\u0096¶âb-àx±Ä?\u000f×[m¦-ñ¯=X\u0088ïÓ\u009f\u001f'jß¶d\u0001\u0018L½\u0098]\u0000gK\u0004\u0096¶â`-ñx\u0097Ä4\u000fÂ[f¦\u001dñ\u0089=D\u0088âÓ\u0083\u001f+jÌ¶d\u0001\u001eL \u0098}ãõ.\u0098z3\u0000gK\u0004\u0096¶â`-ñx\u0097Ä4\u000fÂ[f¦\u001dñ\u0086=B\u0088ÿÓ\u0099\u001f+jÁ¶u\u0001\u0003L\u009c\u0098Rãù.\u0090£ýè\u00865\u0015AØ\u008e~Û\u0017g»¬TøÚ\u0005\u0092R,\u009eÜ+}p*¼¿ÉU\u0015à¢ ï(;Æ@b\u008d\rÙ§fG\u008eTÅ7\u0018\u0085lS£Øö¸J\u0013\u0081ýÕ\\(\u0014\u007f\u0096³Q\u0006Ò]®\u00918ää8W\u008f0Â\u0080\u0016EmÑ £ô\u000bKð\u009f{Ò/)\u009b}k°Ê\u0007 [\u0019\u0000bK\u0013\u0096\u00adâB-àx\u0086Ä'\u000fÔ[|¦,ñ¼=N\u0088âÓ\u0099\u0099»ÒØ\u000fj{º´ áI]ÿ\u0096\tÂ½?Øhs¤\u0099\u0011$Jr\u0086ýó\u001d/ª\u0098ÄÕiÇ´\u008c×Qe%µê/¿F\u0003ðÈ\u0006\u009c²a×6|ú\u0096O+\u0014kØî\u00ad\u0019q±Æö\u008bn_\u008b$\"éH\u0000gK\u0004\u0096¶âf-üx\u0095Ä#\u000fÕ[a¦\u0004ñ¯=E\u0088øÓ¹\u001f<jÎ¶y\u0001\u0005L¡Ù\u0014\u0092wOÅ;\u0015ô\u008f¡æ\u001dPÖ¦\u0082\u0012\u007fw(Üä6Q\u008b\nÊÆO³½o\nØv\u0000nK\u0004\u0096µ\u0000cK\t\u0096£âQ\u009f¥Ô×\tt}\u0086²9çu[û\u0090\u0013Ä©\u0000oK\u0003\u0096¨âF-çx\u0091Ä\u000e\u000fÆ[{¦$ñ¯=_\u0088äÓ\u0082\u001f*fØ-¨ð\u001c\u0084ùKK\u001e;¢¯ii=ÝÀ¼\u0097\u0010[òî[µ3\u0000rK\u0014\u0096¬âl-êx¨Ä'\u000fÎ[f¦=ñ¢=Y\u0088éÓ\u008c\u001f*\u0000pK\u000e\u0096±âW-Ëx\u008bÄ\u000b\u000fÆ[a¦\u0007ñ\u009e=C\u0088þÓ\u0088\u001f/jË\u0000pK\u000e\u0096±âW-Àx\u0080Ä*\u000fÆ[q¦\fñ®=d\u0088âÓ \u001f/jÆ¶~\u0001%Lº\u0098Aãñ.\u0094z2òd¹\u0002dº\u0010zßü\u008a°6?ýß©pT\u001a\u0003¿ÏIzõ!\u0089í\f\u0098ÑDtó\u0002¾¥jA\u0000pK\u000e\u0096±âW-Ëx\u008bÄ\u0005\u000fÈ[f¦\u0007ñ¯=H\u0088øÓ\u0082\u001f<jû¶x\u0001\u0003L·\u0098Rãð\u0000pK\u000e\u0096±âW-Àx\u0080Ä*\u000fÆ[q¦\fñ®=d\u0088âÓ®\u001f!jÁ¶~\u0001\u0014L±\u0098Gãû.\u0087z\u0002Åß\u0011j\\\u001c§»ó_<lw\u000fª½Þd\u0011àD\u008dø,3ÀgA\u009a\u0010Í®\u0001A´ãï\u0085#$V×\u008ao=7p¸¤Vßþ\u0012\u0099F8ùÎ-Z`\u001c\u009b¢ÏD\u0002öµ\u0098é6\u001cÑûº°Ìmm\u0019\u0082Ö?\u0083Y?ëô\u001d \u0082]Ó\nmÆ\u0082s (Fäç\u0091\u0014M¬úë·\u007fc\u0098\u00189ÕT\u0081è>\u001aê¢\u0000uK\u000f\u0096°âF-ãx\u008cÄ5\u000fÓ[m¦\u001bñ\u0088=Y\u0088ãÓ\u008c\u001f*jÌ¶q\u0001\u0002L¦\u0098aãñ.\u0096z3ÅÞ\u0011n\\\u001c§¨\u0000gK\u0004\u0096¶âs-åx\u008cÄ4\u000fá[a¦\u001bñ¹=_\u0088ÃÓ\u008f\u001f$jÊ¶s\u0001\u0005\u0012ÂY¡\u0084\u0013ðÖ?@j)Ö\u0091\u001dQIÈ´¯ã\u0000/à\u009aMÁ\u0007\r\u0089x`¤Ð\u0013·^\u0003f\u0093-ððB\u0084\u009aK\u0015\u001eu¢Ûi2=¬Àñ\u0097_[¦î\u001dµk\u0000gK\u0004\u0096¶âg-áx\u0093Ä/\u000fÄ[m¦<ñº=\u007f\u0088åÓ\u0080\u001f+jæ¶~\u0001<L»\u0098_ãý.\u0086\u0000mK\u0000\u0096²\u0000fK\u000e\u0096°âf-åx\u0086Ä.6à}\u008e (ÔÑ\u001bgN\u0011\u0000EK\u0013\u0096°âL-öxÅÄ#\u000fß[m¦\nñ¿=_\u0088åÓ\u0083\u001f)j\u008f¶}\u0001\u0014L¦\u0098[ãû.\u0091zv¥\u0013îh3\u0086Go\u0088ÙÝ¤a\u0000ªêþ\u0001\u0003.T\u008c\u0098v-\u0085v·º\u0012Ïö\u0013I¤7é\u0089=nFØ\u008b¸".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, IronSourceError.ERROR_LEGACY_INIT_POST_FAILED);
        f1657 = cArr;
        f1656 = 6955871437058558817L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:252:0x0bb1  */
    /* JADX WARN: Code duplicated, block: B:354:0x0ffc  */
    /* JADX WARN: Code duplicated, block: B:360:0x1051  */
    /* JADX WARN: Code duplicated, block: B:391:0x11f5  */
    @Override // com.ironsource.adqualitysdk.sdk.i.ci
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo1545(cq cqVar, String str, List<Object> list, du duVar) {
        try {
            char c10 = '\r';
            byte b10 = 2;
            switch (str.hashCode()) {
                case -2004702861:
                    if (!str.equals(m1857(579 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf("", "", 0, 0) + 44165), 25 - View.MeasureSpec.getSize(0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 36;
                    }
                    break;
                case -2004586504:
                    if (!str.equals(m1857(844 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (38831 - TextUtils.getCapsMode("", 0, 0)), Gravity.getAbsoluteGravity(0, 0) + 29).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 45;
                    }
                    break;
                case -1940880443:
                    c10 = 20;
                    if (!str.equals(m1857(291 - KeyEvent.keyCodeFromString(""), (char) (35125 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = c10;
                    }
                    break;
                case -1935452010:
                    if (!str.equals(m1857(412 - Color.red(0), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 22 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 28;
                    }
                    break;
                case -1926335428:
                    if (!str.equals(m1857(305 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 21;
                    }
                    break;
                case -1862527602:
                    if (!str.equals(m1857((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1098, (char) (3947 - Color.alpha(0)), TextUtils.lastIndexOf("", '0') + 17).intern())) {
                        b10 = -1;
                    } else {
                        int i10 = f1655 + 91;
                        f1654 = i10 % 128;
                        int i11 = i10 % 2;
                        b10 = 56;
                    }
                    break;
                case -1811057601:
                    if (!str.equals(m1857(43 - TextUtils.getOffsetAfter("", 0), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 64764), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case -1784213698:
                    if (!str.equals(m1857(622 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 18 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 38;
                    }
                    break;
                case -1759122910:
                    if (!str.equals(m1857(873 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (822 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 30).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 46;
                    }
                    break;
                case -1673354837:
                    if (!str.equals(m1857(237 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (MotionEvent.axisFromString("") + 48484), (ViewConfiguration.getFadingEdgeLength() >> 16) + 14).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 16;
                    }
                    break;
                case -1654145783:
                    if (!str.equals(m1857((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1451, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 79;
                    }
                    break;
                case -1475737971:
                    if (!str.equals(m1857(1708 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 15 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 94;
                    }
                    break;
                case -1424907981:
                    if (!str.equals(m1857(View.combineMeasuredStates(0, 0) + 1671, (char) (40900 - TextUtils.indexOf("", "", 0, 0)), (-16777207) - Color.rgb(0, 0, 0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 91;
                    }
                    break;
                case -1412269250:
                    if (!str.equals(m1857(1003 - (ViewConfiguration.getTapTimeout() >> 16), (char) TextUtils.indexOf("", "", 0), 15 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 51;
                    }
                    break;
                case -1296960936:
                    if (!str.equals(m1857(394 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 18 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 27;
                    }
                    break;
                case -1296887564:
                    if (!str.equals(m1857(KeyEvent.getDeadChar(0, 0) + 1889, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), TextUtils.getCapsMode("", 0, 0) + 27).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 102;
                    }
                    break;
                case -1274492040:
                    if (!str.equals(m1857(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2000, (char) (13957 - ((byte) KeyEvent.getModifierMetaStateMask())), '6' - AndroidCharacter.getMirror('0')).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 109;
                    }
                    break;
                case -1253789331:
                    if (!(!str.equals(m1857(KeyEvent.keyCodeFromString("") + 1864, (char) (64456 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 25 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()))) {
                        b10 = 101;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1242814655:
                    if (!str.equals(m1857(1410 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (TextUtils.lastIndexOf("", '0') + 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19).intern())) {
                        b10 = -1;
                    } else {
                        int i12 = f1655 + 47;
                        f1654 = i12 % 128;
                        int i13 = i12 % 2;
                        b10 = 76;
                    }
                    break;
                case -1214823651:
                    if (!str.equals(m1857((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 491, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 60245), 19 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 32;
                    }
                    break;
                case -1198560170:
                    if (!str.equals(m1857(1803 - TextUtils.lastIndexOf("", '0', 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 29).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 99;
                    }
                    break;
                case -1145074375:
                    if (!str.equals(m1857(640 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getTouchSlop() >> 8) + 35).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 39;
                    }
                    break;
                case -1124602405:
                    if (!str.equals(m1857((ViewConfiguration.getTapTimeout() >> 16) + 1646, (char) (55667 - KeyEvent.keyCodeFromString("")), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 88;
                    }
                    break;
                case -1071201617:
                    if ((str.equals(m1857(1952 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (26356 - (ViewConfiguration.getTouchSlop() >> 8)), 13 - ((byte) KeyEvent.getModifierMetaStateMask())).intern()) ? (char) 11 : '\n') == '\n') {
                        b10 = -1;
                    } else {
                        b10 = 105;
                    }
                    break;
                case -1029444991:
                    if (!(str.equals(m1857((ViewConfiguration.getTouchSlop() >> 8) + 928, (char) (22171 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), MotionEvent.axisFromString("") + 33).intern()))) {
                        b10 = -1;
                    } else {
                        b10 = 48;
                    }
                    break;
                case -1029356152:
                    if (!str.equals(m1857(101 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (36804 - Color.green(0)), 14 - TextUtils.indexOf("", "")).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case -1013936139:
                    if (!str.equals(m1857(1472 - View.combineMeasuredStates(0, 0), (char) (ImageFormat.getBitsPerPixel(0) + 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 80;
                    }
                    break;
                case -997695964:
                    if (!str.equals(m1857(1740 - TextUtils.indexOf("", ""), (char) (ViewConfiguration.getLongPressTimeout() >> 16), (-16777193) - Color.rgb(0, 0, 0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 96;
                    }
                    break;
                case -992018155:
                    if (!str.equals(m1857(Color.green(0) + 1586, (char) (Process.getGidForName("") + 39389), 19 - TextUtils.indexOf("", "")).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 85;
                    }
                    break;
                case -952854909:
                    if (!str.equals(m1857(80 - ImageFormat.getBitsPerPixel(0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 13 - Color.alpha(0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case -924373867:
                    if (!str.equals(m1857(1262 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (View.resolveSizeAndState(0, 0, 0) + 16009), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 68;
                    }
                    break;
                case -899502102:
                    if ((str.equals(m1857(1141 - Color.green(0), (char) (TextUtils.indexOf("", "", 0, 0) + 49978), TextUtils.getOffsetBefore("", 0) + 13).intern()) ? '$' : (char) 2) == 2) {
                        b10 = -1;
                    } else {
                        int i14 = f1654 + 13;
                        f1655 = i14 % 128;
                        if (i14 % 2 != 0) {
                            b10 = 59;
                        } else {
                            b10 = 61;
                        }
                    }
                    break;
                case -834290483:
                    if ((str.equals(m1857(Color.argb(0, 0, 0, 0) + 743, (char) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getTouchSlop() >> 8) + 39).intern()) ? 'X' : '`') == 'X') {
                        b10 = ExifInterface.START_CODE;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -788426345:
                    if (!str.equals(m1857(364 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 54363), 13 - TextUtils.indexOf("", "")).intern())) {
                        b10 = -1;
                    } else {
                        int i15 = f1654 + 81;
                        f1655 = i15 % 128;
                        b10 = i15 % 2 != 0 ? (byte) 25 : (byte) 111;
                    }
                    break;
                case -764989270:
                    if (!str.equals(m1857((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 674, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30612), 31 - View.combineMeasuredStates(0, 0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 40;
                    }
                    break;
                case -678635926:
                    if (!str.equals(m1857(1992 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((-1) - Process.getGidForName("")), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 108;
                    }
                    break;
                case -633198692:
                    if (!str.equals(m1857(Color.rgb(0, 0, 0) + 16778896, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 15).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 92;
                    }
                    break;
                case -622788386:
                    if (!str.equals(m1857(282 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (41084 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 19;
                    }
                    break;
                case -588814953:
                    if (!str.equals(m1857(1170 - TextUtils.getCapsMode("", 0, 0), (char) Color.blue(0), 12 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 61;
                    }
                    break;
                case -525192167:
                    if (!str.equals(m1857(TextUtils.lastIndexOf("", '0', 0, 0) + 1246, (char) (24274 - (ViewConfiguration.getPressedStateDuration() >> 16)), 18 - KeyEvent.getDeadChar(0, 0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 67;
                    }
                    break;
                case -502936072:
                    if (!str.equals(m1857(1627 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (Process.getGidForName("") + 1), View.MeasureSpec.getMode(0) + 19).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 87;
                    }
                    break;
                case -429121350:
                    if (!str.equals(m1857(250 - Color.alpha(0), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 5523), (ViewConfiguration.getJumpTapTimeout() >> 16) + 22).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 17;
                    }
                    break;
                case -264400535:
                    if (!str.equals(m1857(510 - Color.blue(0), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 48769), 22 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 33;
                    }
                    break;
                case -100132040:
                    if (!str.equals(m1857(View.MeasureSpec.getSize(0) + 151, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 62297), View.getDefaultSize(0, 0) + 23).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 11;
                    }
                    break;
                case -75121853:
                    if (!str.equals(m1857(1193 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (Color.rgb(0, 0, 0) + 16777216), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 63;
                    }
                    break;
                case -75062501:
                    if (!str.equals(m1857((ViewConfiguration.getPressedStateDuration() >> 16) + 94, (char) (60940 - ((Process.getThreadPriority(0) + 20) >> 6)), View.resolveSizeAndState(0, 0, 0) + 7).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case -39321397:
                    if (!str.equals(m1857(28 - ExpandableListView.getPackedPositionChild(0L), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                        b10 = -1;
                    }
                    break;
                case -37751474:
                    if (!str.equals(m1857((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 318, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 48402), 15 - View.getDefaultSize(0, 0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 22;
                    }
                    break;
                case -20195056:
                    if (!str.equals(m1857((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1019, (char) (AndroidCharacter.getMirror('0') + 36787), ((Process.getThreadPriority(0) + 20) >> 6) + 24).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 52;
                    }
                    break;
                case 107868:
                    if (!str.equals(m1857(1989 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (-16777213) - Color.rgb(0, 0, 0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 107;
                    }
                    break;
                case 108960:
                    if (!str.equals(m1857(View.MeasureSpec.getMode(0) + 1664, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 4 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 89;
                    }
                    break;
                case 1820707:
                    if (!str.equals(m1857(1332 - Gravity.getAbsoluteGravity(0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 'A' - AndroidCharacter.getMirror('0')).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 72;
                    }
                    break;
                case 2656096:
                    if (!str.equals(m1857(View.resolveSizeAndState(0, 0, 0) + 1132, (char) (23412 - ((Process.getThreadPriority(0) + 20) >> 6)), Gravity.getAbsoluteGravity(0, 0) + 9).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 58;
                    }
                    break;
                case 3052374:
                    if (!str.equals(m1857(Color.argb(0, 0, 0, 0) + 1667, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 4 - TextUtils.indexOf("", "", 0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 90;
                    }
                    break;
                case 15484010:
                    if (!str.equals(m1857((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1436, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 47501), TextUtils.indexOf("", "", 0) + 15).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 78;
                    }
                    break;
                case 134176114:
                    if (!str.equals(m1857(View.resolveSizeAndState(0, 0, 0) + 1227, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 18 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                        b10 = -1;
                    } else {
                        int i16 = f1655 + 45;
                        f1654 = i16 % 128;
                        b10 = i16 % 2 == 0 ? (byte) 66 : (byte) 125;
                    }
                    break;
                case 151150886:
                    if (!str.equals(m1857(1300 - KeyEvent.getDeadChar(0, 0), (char) ((Process.getThreadPriority(0) + 20) >> 6), 19 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 70;
                    }
                    break;
                case 171861489:
                    if (!str.equals(m1857(132 - Color.alpha(0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 19 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case 186649624:
                    if (!str.equals(m1857((ViewConfiguration.getJumpTapTimeout() >> 16) + 1783, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), Color.blue(0) + 21).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 98;
                    }
                    break;
                case 190032796:
                    if (!str.equals(m1857(15 - Color.argb(0, 0, 0, 0), (char) (62981 - TextUtils.lastIndexOf("", '0', 0, 0)), Color.alpha(0) + 14).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case 317728381:
                    if (!str.equals(m1857(1389 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.keyCodeFromString("") + 22).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 75;
                    }
                    break;
                case 370758723:
                    if (!str.equals(m1857(1934 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (4772 - TextUtils.lastIndexOf("", '0')), Color.argb(0, 0, 0, 0) + 19).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 104;
                    }
                    break;
                case 383897184:
                    if (!str.equals(m1857(1153 - Process.getGidForName(""), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 35284), 15 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 60;
                    }
                    break;
                case 386145701:
                    if (!str.equals(m1857(455 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ExpandableListView.getPackedPositionType(0L) + 36076), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 30;
                    }
                    break;
                case 398700013:
                    if (!str.equals(m1857(1282 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 18).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 69;
                    }
                    break;
                case 404330675:
                    if (!str.equals(m1857(214 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (30225 - View.combineMeasuredStates(0, 0)), Color.red(0) + 22).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 15;
                    }
                    break;
                case 413143991:
                    if (!str.equals(m1857(334 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 23;
                    }
                    break;
                case 421306799:
                    if (!str.equals(m1857((ViewConfiguration.getJumpTapTimeout() >> 16) + 123, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 48124), TextUtils.indexOf("", "") + 9).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 9;
                    }
                    break;
                case 449440345:
                    if (!str.equals(m1857((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1571, (char) KeyEvent.keyCodeFromString(""), 13 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 84;
                    }
                    break;
                case 451302467:
                    if (!str.equals(m1857((Process.myPid() >> 22) + 1349, (char) (TextUtils.lastIndexOf("", '0') + 1), 19 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 73;
                    }
                    break;
                case 468780064:
                    if (!str.equals(m1857(TextUtils.indexOf((CharSequence) "", '0', 0) + 558, (char) (KeyEvent.getMaxKeyCode() >> 16), View.MeasureSpec.getSize(0) + 22).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 35;
                    }
                    break;
                case 496987426:
                    if (str.equals(m1857(1723 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15).intern())) {
                        b10 = 95;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 502192375:
                    if (!str.equals(m1857(376 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1365), (-16777198) - Color.rgb(0, 0, 0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 26;
                    }
                    break;
                case 518569412:
                    if (!str.equals(m1857(474 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) Drawable.resolveOpacity(0, 0), 19 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 31;
                    }
                    break;
                case 526577620:
                    if (!str.equals(m1857(174 - Color.argb(0, 0, 0, 0), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29374), 21 - TextUtils.getTrimmedLength("")).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 12;
                    }
                    break;
                case 600996866:
                    if (!str.equals(m1857(1064 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 16 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 54;
                    }
                    break;
                case 618460119:
                    if (!str.equals(m1857((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 195, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 42802), ((byte) KeyEvent.getModifierMetaStateMask()) + 10).intern())) {
                        b10 = -1;
                    } else {
                        b10 = c10;
                    }
                    break;
                case 622025239:
                    if ((str.equals(m1857((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1368, (char) (Process.myPid() >> 22), (ViewConfiguration.getWindowTouchSlop() >> 8) + 20).intern()) ? (char) 0 : 'C') == 0) {
                        b10 = 74;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 660677592:
                    if (!str.equals(m1857(706 - (Process.myTid() >> 22), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 36 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 41;
                    }
                    break;
                case 672646709:
                    if (str.equals(m1857((ViewConfiguration.getScrollBarSize() >> 8) + 272, (char) Drawable.resolveOpacity(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10).intern())) {
                        b10 = 18;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 675563679:
                    if (!str.equals(m1857(1917 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) TextUtils.indexOf("", "", 0), 18 - KeyEvent.getDeadChar(0, 0)).intern())) {
                        b10 = -1;
                    } else {
                        int i17 = f1655 + 67;
                        f1654 = i17 % 128;
                        int i18 = i17 % 2;
                        b10 = 103;
                    }
                    break;
                case 759503924:
                    if (!str.equals(m1857(980 - KeyEvent.getDeadChar(0, 0), (char) Drawable.resolveOpacity(0, 0), 23 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 50;
                    }
                    break;
                case 776628755:
                    if (!str.equals(m1857(902 - KeyEvent.keyCodeFromString(""), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 41662), 26 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                        b10 = -1;
                    } else {
                        int i19 = f1654 + 19;
                        f1655 = i19 % 128;
                        if (i19 % 2 != 0) {
                            b10 = 47;
                        } else {
                            b10 = 91;
                        }
                    }
                    break;
                case 791624502:
                    if (!str.equals(m1857((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1832, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 15371), 33 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 100;
                    }
                    break;
                case 861400366:
                    if (!str.equals(m1857(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 435, (char) (ViewConfiguration.getScrollBarSize() >> 8), KeyEvent.keyCodeFromString("") + 20).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 29;
                    }
                    break;
                case 956170787:
                    if (!str.equals(m1857(1114 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (21525 - TextUtils.getTrimmedLength("")), TextUtils.indexOf("", "", 0, 0) + 18).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 57;
                    }
                    break;
                case 1057201549:
                    if (!(str.equals(m1857(1763 - ExpandableListView.getPackedPositionGroup(0L), (char) (TextUtils.getOffsetBefore("", 0) + 61974), 19 - TextUtils.lastIndexOf("", '0', 0, 0)).intern()))) {
                        b10 = -1;
                    } else {
                        b10 = 97;
                    }
                    break;
                case 1076958445:
                    if (!str.equals(m1857(TextUtils.indexOf("", "", 0, 0) + 349, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (Process.myTid() >> 22) + 14).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 24;
                    }
                    break;
                case 1107904233:
                    if (!str.equals(m1857((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 781, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 43;
                    }
                    break;
                case 1125810632:
                    if (!str.equals(m1857(KeyEvent.keyCodeFromString("") + 1541, (char) (36403 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 31).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 83;
                    }
                    break;
                case 1414080697:
                    if (!str.equals(m1857((Process.myPid() >> 22) + 57, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 65101), ExpandableListView.getPackedPositionType(0L) + 24).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case 1444942133:
                    if (!str.equals(m1857((ViewConfiguration.getEdgeSlop() >> 16) + 810, (char) (49791 - ((byte) KeyEvent.getModifierMetaStateMask())), 34 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 44;
                    }
                    break;
                case 1521072706:
                    if (!str.equals(m1857(1495 - Color.red(0), (char) View.MeasureSpec.getSize(0), 22 - TextUtils.getOffsetBefore("", 0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 81;
                    }
                    break;
                case 1525623361:
                    if (!str.equals(m1857(1966 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 22 - TextUtils.indexOf("", "")).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 106;
                    }
                    break;
                case 1546196954:
                    if (!str.equals(m1857(1516 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (Color.argb(0, 0, 0, 0) + 41876), 24 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 82;
                    }
                    break;
                case 1557083836:
                    if (!str.equals(m1857(532 - View.getDefaultSize(0, 0), (char) (13740 - Color.alpha(0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 25).intern())) {
                        b10 = -1;
                    } else {
                        int i20 = f1655 + 83;
                        f1654 = i20 % 128;
                        if (i20 % 2 == 0) {
                            b10 = 34;
                        } else {
                            b10 = 79;
                        }
                    }
                    break;
                case 1590874683:
                    if (!(!str.equals(m1857(1605 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (51155 - TextUtils.indexOf("", "", 0, 0)), TextUtils.getTrimmedLength("") + 22).intern()))) {
                        int i21 = f1654 + 125;
                        f1655 = i21 % 128;
                        int i22 = i21 % 2;
                        b10 = 86;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 1622498214:
                    if (!str.equals(m1857(960 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), Color.argb(0, 0, 0, 0) + 20).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 49;
                    }
                    break;
                case 1664124883:
                    if (!str.equals(m1857(Color.green(0), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 15 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                case 1746583808:
                    if (!str.equals(m1857(1211 - TextUtils.getCapsMode("", 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 16).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 65;
                    }
                    break;
                case 1751981113:
                    if (!str.equals(m1857(1695 - (Process.myPid() >> 22), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 26299), TextUtils.getOffsetAfter("", 0) + 14).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 93;
                    }
                    break;
                case 1777572999:
                    if (!str.equals(m1857(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 605, (char) (View.MeasureSpec.getSize(0) + 22827), View.MeasureSpec.getSize(0) + 18).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 37;
                    }
                    break;
                case 1825714001:
                    if (!str.equals(m1857(1043 - TextUtils.indexOf("", "", 0, 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0) + 21).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 53;
                    }
                    break;
                case 1876204439:
                    if (!str.equals(m1857(KeyEvent.getDeadChar(0, 0) + 1080, (char) (10181 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 18).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 55;
                    }
                    break;
                case 1953253188:
                    if (!str.equals(m1857(116 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) TextUtils.indexOf("", "", 0), 8 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case 1988391289:
                    if (!str.equals(m1857(KeyEvent.keyCodeFromString("") + 1182, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 33281), 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 62;
                    }
                    break;
                case 1989757366:
                    if (!str.equals(m1857(Color.alpha(0) + 1429, (char) (4814 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 77;
                    }
                    break;
                case 1992394620:
                    if (!str.equals(m1857(204 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (29914 - (ViewConfiguration.getTapTimeout() >> 16)), 10 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 14;
                    }
                    break;
                case 1993407379:
                    if (!str.equals(m1857(1198 - TextUtils.indexOf((CharSequence) "", '0'), (char) (34284 - (ViewConfiguration.getScrollBarSize() >> 8)), 11 - ImageFormat.getBitsPerPixel(0)).intern())) {
                        b10 = -1;
                    } else {
                        int i23 = f1655 + 9;
                        f1654 = i23 % 128;
                        int i24 = i23 % 2;
                        b10 = 64;
                    }
                    break;
                case 2034588468:
                    if (!str.equals(m1857(1319 - TextUtils.indexOf("", ""), (char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 71;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    return cx.m1841(list);
                case 1:
                    return cx.m1842(list);
                case 2:
                    return cx.m1844(cqVar);
                case 3:
                    return cx.m1843(cqVar, list);
                case 4:
                    return de.m1874(list);
                case 5:
                    return Boolean.valueOf(de.m1873(list));
                case 6:
                    return de.m1875(list);
                case 7:
                    return de.m1876(list);
                case 8:
                    return cv.m1794(list);
                case 9:
                    return cv.m1793(list);
                case 10:
                    return cv.m1792(list);
                case 11:
                    return cv.m1790(list);
                case 12:
                    return cv.m1791();
                case 13:
                    return da.m1854(list);
                case 14:
                    return da.m1855(list);
                case 15:
                    return da.m1856();
                case 16:
                    return dc.m1861(list);
                case 17:
                    return dc.m1858(list);
                case 18:
                    return dc.m1859(list);
                case 19:
                    return dc.m1860(list);
                case 20:
                    return this.f1666.m1864(duVar, cqVar, list);
                case 21:
                    return this.f1666.m1862(duVar, cqVar, list);
                case 22:
                    return this.f1666.m1865(duVar, cqVar, list);
                case 23:
                    return this.f1666.m1863(duVar, cqVar, list);
                case 24:
                    return Integer.valueOf(dd.m1872(list));
                case 25:
                    return dd.m1870(list);
                case 26:
                    return dd.m1868(list);
                case 27:
                    return dd.m1871(list);
                case 28:
                    return Boolean.valueOf(dd.m1869(list));
                case 29:
                    return dd.m1867(list);
                case 30:
                    return this.f1663.m1820(cqVar, list, duVar);
                case 31:
                    return cw.m1803(list);
                case 32:
                    return cw.m1804(list);
                case 33:
                    return this.f1663.m1825(list);
                case 34:
                    return this.f1663.m1827(cqVar, list, duVar);
                case 35:
                    return this.f1663.m1823(list);
                case 36:
                    return this.f1663.m1821(cqVar, list, duVar);
                case 37:
                    return cw.m1809(list);
                case 38:
                    return cw.m1802(list);
                case 39:
                    return this.f1663.m1822(cqVar, list, duVar);
                case 40:
                    return this.f1663.m1824(cqVar, list, duVar);
                case 41:
                    return this.f1663.m1816(cqVar, list, duVar);
                case 42:
                    return this.f1663.m1818(cqVar, list, duVar);
                case 43:
                    return this.f1663.m1812(cqVar, list, duVar);
                case 44:
                    return this.f1663.m1811(cqVar, list, duVar);
                case 45:
                    return this.f1663.m1817(list);
                case 46:
                    return this.f1663.m1813(list);
                case 47:
                    return this.f1663.m1819(list);
                case 48:
                    return this.f1663.m1815(list);
                case 49:
                    return cw.m1799(list);
                case 50:
                    return this.f1663.m1814(cqVar, list, duVar);
                case 51:
                    return this.f1663.m1826(cqVar, list);
                case 52:
                    return Boolean.valueOf(cw.m1798(list));
                case 53:
                    return cw.m1797(list);
                case 54:
                    return cw.m1801(list);
                case 55:
                    return cw.m1800(list);
                case 56:
                    return cw.m1796(list);
                case 57:
                    return cw.m1795(list);
                case 58:
                    return ct.m1785(cqVar, list);
                case 59:
                    return cr.m1762(cqVar, list);
                case 60:
                    return this.f1665.m1775(cqVar, list, duVar);
                case 61:
                    return cr.m1761(cqVar);
                case 62:
                    return cr.m1774(cqVar);
                case 63:
                    return Long.valueOf(cr.m1764());
                case 64:
                    return cr.m1771();
                case 65:
                    return Long.valueOf(cr.m1766());
                case 66:
                    return cr.m1773();
                case 67:
                    return cr.m1760();
                case 68:
                    return cr.m1755();
                case 69:
                    return cr.m1757();
                case 70:
                    return cr.m1759();
                case 71:
                    return cr.m1768(cqVar);
                case 72:
                    return cr.m1765(cqVar);
                case 73:
                    return cr.m1752();
                case 74:
                    return cr.m1754();
                case 75:
                    return cr.m1772(cqVar);
                case 76:
                    return cr.m1756(cqVar);
                case 77:
                    return cr.m1763(list);
                case 78:
                    return Boolean.valueOf(cr.m1751());
                case 79:
                    return cr.m1769(list);
                case 80:
                    return cr.m1758(cqVar);
                case 81:
                    return cr.m1753(cqVar);
                case 82:
                    return Boolean.valueOf(cr.m1749());
                case 83:
                    return Double.valueOf(cr.m1747());
                case 84:
                    return this.f1665.m1776(list);
                case 85:
                    return cr.m1750();
                case 86:
                    return cr.m1748();
                case 87:
                    return cr.m1746();
                case 88:
                    return cr.m1770(list);
                case 89:
                    return cy.m1846(cqVar, list);
                case 90:
                    return Character.valueOf(cy.m1845(list));
                case 91:
                    return cy.m1848(list);
                case 92:
                    return Boolean.valueOf(cy.m1847(list));
                case 93:
                    return this.f1658.m1884(cqVar, list, duVar);
                case 94:
                    return this.f1658.m1881(cqVar, list, duVar);
                case 95:
                    return this.f1658.m1883(cqVar, list, duVar);
                case 96:
                    return this.f1658.m1882(cqVar, list, duVar);
                case 97:
                    return this.f1658.m1885(cqVar, list, duVar);
                case 98:
                    return this.f1658.m1880(cqVar, list, duVar);
                case 99:
                    return this.f1658.m1879(cqVar, list, duVar);
                case 100:
                    return cs.m1782(list);
                case 101:
                    return cs.m1783(list);
                case 102:
                    return cs.m1779(list);
                case 103:
                    return cs.m1778(list);
                case 104:
                    return cs.m1781(list);
                case 105:
                    return cs.m1777(list);
                case 106:
                    return Long.valueOf(cs.m1780());
                case 107:
                    return this.f1659.m1787(cqVar, list);
                case 108:
                    return this.f1659.m1789(cqVar, list);
                case 109:
                    return this.f1659.m1788(cqVar, list);
                default:
                    String strM1683 = cqVar.m1683();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m1857((Process.myPid() >> 22) + 2005, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 23 - ExpandableListView.getPackedPositionType(0L)).intern());
                    sb2.append(str);
                    sb2.append(m1857(2028 - ExpandableListView.getPackedPositionGroup(0L), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 42282), AndroidCharacter.getMirror('0') - 26).intern());
                    co.m1623(strM1683, sb2.toString(), null);
                    return null;
            }
        } catch (Exception e10) {
            String strM1684 = cqVar.m1683();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m1857(2005 - View.resolveSize(0, 0), (char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 23).intern());
            sb3.append(str);
            co.m1623(strM1684, sb3.toString(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1857(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1657[i10 + i12]) ^ (((long) i12) * f1656)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }
}
