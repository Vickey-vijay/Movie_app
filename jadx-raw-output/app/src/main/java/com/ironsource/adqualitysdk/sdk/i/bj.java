package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.chartboost.sdk.CBImpressionActivity;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostActivity;
import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.InPlay.CBInPlay;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.requests.models.MediationModel;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.callbacks.StartCallback;
import com.ironsource.G5;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bj extends bd {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f823 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f825;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f824 = {'1', 'h', 'o', 'q', 's', 'Z', 'R', 'k', 'n', 'o', 'o', 'n', 'v', '^', 'U', 'd', 'i', 's', 128, 'h', ']', '^', 137, 138, 132, 143, '|', 132, 127, 'Z', 177, 173, 178, 167, 166, 183, 181, 183, 179, 174, 175, 173, 162, '?', 128, 'h', 'L', 'O', 'e', 'x', '{', 'u', 'v', '}', 'x', 'v', 'x', 'g', 'b', 'p', 'n', 'l', 'x', 'g', '\\', 'u', 'x', 'y', 'y', 196, 209, 207, 204, 168, 161, 162, 141, 216, 194, 192, 198, 196, 203, 141, 202, 195, 210, 141, 211, 210, 206, 206, 193, 211, 209, 192, 199, 194, 141, 204, 206, 194, 216, 211, 200, 213, 200, 211, 194, 160, 205, 206, 200, 210, 210, '$', '[', 'q', 'l', 'k', 'r', 's', 'n', 'n', 'n', 'e', 'f', 'W', 'R', 'f', 'l', 'g', 'a', 'b', 'g', '<', 'v', 'n', 'o', 'o', 'n', 'k', 'R', '\\', 'n', 'g', '_', 'b', 'n', 'l', 'n', 's', 'l', 'k', 'q', 'n', '[', 'E', 'B', '4', 'e', 'H', 'M', 'n', 'i', 'n', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'W', 'n', 'l', 'n', 's', 'l', 'k', 'q', 'n', '[', 'E', 'B', '8', 'R', 'n', 'g', 'o', 'R', 'L', 'g', 'k', 'P', 'Q', 's', 'q', 'o', 'h', 'k', 's', 'i', '3', 'n', 'l', 'f', 'h', 'j', 'j', 'V', 'U', ']', 'f', 'n', 'n', 148, 303, 301, 295, 297, 299, 299, 279, 287, 310, 308, 306, 299, 302, 310, 300, 295, 280, 286, 303, 297, 'g', 206, 212, 195, 189, 204, 209, 219, 211, 208, 215, 217, 219, 205, 175, 179, 177, 177, 175, 162, 188, 208, 208, 206, 204, 210, 212, '1', 'j', 'k', 'c', 'j', 'l', '\\', 'K', 'B', 'U', 'd', 'i', 's', 'k', 'h', 'o', 'q', 's', '\\', 'T', 'h', 'h', 'f', 'd', 'j', 'l', 'q', 228, 236, 227, 220, 225, 218, 221, 229, 236, 220, 215, 229, 223, 229, 230, 'o', 222, 228, 216, 213, 225, 218, 226, 230, 228, 230, '\"', 'S', '[', 'c', 'n', 'g', 'l', 'j', 'd', 'f', 'h', 'h'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f827 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f826 = -2119553104;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f828 = 0;

    public class e extends ChartboostDelegate implements hg<ChartboostDelegate> {

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f838 = 0;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f839 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char[] f840;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f841;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private ch f843;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ChartboostDelegate f844;

        static {
            char[] cArr = new char[1261];
            ByteBuffer.wrap("\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ¦Í$Ê¬ÈOÅÝÃLÀÍ¾s»ü¹q¶\u001e³\u0081±\u001d®©¬9©º§ ¤Î¢@\u009fÞ\u009dH\u009aì\u0098f\u0095ç\u0092\u0091\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ¦Í$Ê¬ÈOÅÝÃLÀÛ¾\u007f»þ¹t¶\u0017³\u0093±\u0010®©¬9©º§ ¤Î¢@\u009fÞ\u009dH\u009aì\u0098f\u0095ç\u0092\u0091 Å]\u0099Z\tX\u0091U.S·P#N¨KMIÝFdDþA~\u007fè|cy\u001ew\u0082t\u0004röo7m£j!hÿeVcÍ`q\u001eõ\u001bB\u0019ì\u0016\u0089\u0013\u0011\u0011\u009d\u000e\u0015\f¥\t!\u0007·\u0004S\u0002Ô?@\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§È|ÅÐÃAÀó¾B»â¹H¶\u0014³\u0093±\r®©¬9©º§ ¤Î¢@\u009fÞ\u009dH\u009aì\u0098f\u0095ç\u0092\u0091_1¢m¥ý§eªÚ¬C¯×±\\´¹¶)¹\u0090»\n¾\u008a\u0080\u001c\u0083\u0097\u0086ê\u0088v\u008bð\u008d\u0002\u0090Ã\u0092W\u0095Õ\u0097\f\u009aª\u009c)\u009f\u0080á\rä\u008cæ\u0005é@ìîîoñ÷óWöÏøCû§ý5À±Â2Å\u0086\u008a\u0005wYpÉrQ\u007fîywzãdha\u008dc\u001dl¤n>k¾U(V£SÞ]B^ÄX6E÷Gc@áB?O\u009bI\u0001Jª451\u00823,<I9Ñ;]$Õ&e#á-w.\u0093(\u0014\u0015\u0080\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§ÈyÅÝÃAÀü¾}»Ä¹j¶\u000f³\u0097±\u001b®\u0093¬#©§§1¤Õ¢R\u009fÆ\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§È~ÅØÃ[Àï¾z»ì¹}¶2³\u009c±\u001d®\u0085¬%©½§1¤Õ¢G\u009fÃ\u009d@\u009aô\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§ÈyÅÞÃEÀï¾z»è¹p¶\u001e³»±\u0007®\u0094¬2©¼§6¤È¢Z\u009fÞ\u009dH\u009aù\u0098c_Ý¢\u0081¥\u0011§\u0089ª6¬¯¯;±°´U¶Å¹|»æ¾f\u0080ð\u0083{\u0086\u0006\u0088\u009a\u008b\u001c\u008dî\u00908\u0092º\u00952\u0097Ñ\u009aC\u009cÒ\u009fSáíäbæïé\u0080ì\u001fî\u0083ñ3ó¦ö\"ø¾ûcýÝÀDÂÌ\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§ÈyÅÐÃKÀ÷¾s»À¹k¶\t³\u0097±(®\u0090¬'©½Gÿº£½3¿«²\u0014´\u008d·\u0019©\u0092¬w®ç¡^£Ä¦D\u0098Ò\u009bY\u009e$\u0090¸\u0093>\u0095Ì\u0088\u001a\u008a\u0098\u008d\u0010\u008fó\u0082a\u0084ð\u0087gùÃüBþÈñ«ô/ö¬é\u0011ë\u0084î\u0000à\u009cãAåÿØfÚîß\\\"\u0000%\u0090'\b*·,./º114Ô6D9ý;g>ç\u0000q\u0003ú\u0006\u0087\b\u001b\u000b\u009d\ro\u0010®\u0012:\u0015¸\u0017c\u001aÏ\u001c^\u001fìa]dýfWi\u000bl\u008cn\u0012q²s'v£x?{â}\\@ÅBM\u0099²dîc~aælYjÀiTwßr:pª\u007f\u0013}\u0089x\tF\u009fE\u0014@iNõMsK\u0081V@TÔSVQ\u008f\\)ZªY\u0003'\u008e\"\u000f \u0086/Ç*l(ê7t5ç0O>Ä=>\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§ÈyÅÝÃGÀì¾s»À¹k¶\t³\u0097±(®\u0090¬'©½U\\¨\u0000¯\u0090\u00ad\b ·¦.¥º»1¾Ô¼D³ý±g´ç\u008aq\u0089ú\u008c\u0087\u0082\u001b\u0081\u009d\u0087o\u009a®\u0098:\u009f¸\u009df\u0090Â\u0096^\u0095ãëbîßìtã\u0016æ\u0088ä7û\u008fù8ü¢\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§È~ÅØÃ[Àï¾z»ì¹}¶6³\u009d±\u001b®\u0085¬\u0016©¾§5¤Ïï\u0013\u0012O\u0015ß\u0017G\u001aø\u001ca\u001fõ\u0001~\u0004\u009b\u0006\u000b\t²\u000b(\u000e¨0>3µ6È8T;Ò=  á\"u%÷',*\u0080,\u0011/£Q\u0012T²V\u0006YN\\Á^VAÂCcFÝHyK\u0085M\u0000p\u00917¥ÊùÍiÏñÂNÄ×ÇCÙÈÜ-Þ½Ñ\u0004Ó\u009eÖ\u001eè\u0088ë\u0003î~àâãdå\u0096øWúÃýAÿ\u008cò6ô»÷\n\u0089\u0095\u008c(\u008e\u008e\u0081ô\u0084w\u0086ä\u0099@\u009bÞ\u009eZ\u0090à\u00935\u0095»¨*ª®\u00ad\f¯\u0084¢\u0001¥o§ûºb¼êÃî>\u00949\u0000;¿670¬33-®(q*É%E'ô\"u\u001cÇ\u001fg\u001a\u0001\u0014¹\u0017\u0002\u0011º\f9\u000e¯\t;\u000bÝ\u0006Z\u0000Ö\u0003|}óxi\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ¦Í$Ê¬ÈOÅÝÃLÀÛ¾\u007f»þ¹t¶\u0017³\u0093±\u0010®²¬2©¹§$¤Î¢W\u009fÏ\u009dE\u009aÎ\u0098f\u0095â\u0092\u0098\u0090\u001bR\t¯U¨Åª]§â¡{¢ï¼d¹\u0081»\u0011´¨¶2³²\u008d$\u008e¯\u008bÒ\u0085N\u0086È\u0080:\u009dû\u009fo\u0098í\u009a3\u0097\u009a\u0091\u0001\u0092½ì9é\u0095ë+äFáÙãQüÎþxûàõYö\u009fð\u001dÍ\u0085Ï\u0004\u009bûf§a7c¯n\u0010h\u0089k\u001du\u0096psrã}Z\u007fÀz@DÖG]B L¼O:IÈT\tV\u009dQ\u001fSÄ^hXù[K%ú Z\"ð-¬(+*µ5\n7\u008a2\u0001<\u009c?v9ï\u0004w\u0006ý\u0001v\u0003Þ\u000eZ\t \u000b£î\u008a\u0013Ö\u0014F\u0016Þ\u001ba\u001dø\u001el\u0000ç\u0005\u0002\u0007\u0092\b+\n±\u000f11§2,7Q9Í:K<¹!x#ì$n&·+\u0011-\u0092.;P¶U7W¾Xà]^_×@HBìGcIéJ\u0011L¬q\ns\u008ct4v©\u000f\u0000ò\\õÌ÷Túëürÿæámä\u0088æ\u0018é¡ë;î»Ð-Ó¦ÖÛØGÛÁÝ3ÀòÂfÅäÇ:Ê\u009eÌ\u0004Ï¯±0´\u009c¶\"¹O¼Ð¾X¡Ç£q¦é¨P«\u0096\u00ad\u0014\u0090\u008c\u0092\rìD\u0011\u0018\u0016\u0088\u0014\u0010\u0019¯\u001f6\u001c¢\u0002)\u0007Ì\u0005\\\nå\b\u007f\rÿ3i0â5\u009f;\u00038\u0085>w#¶!\"& $~)Ú/F,ûRzWØUfZ\u000b_\u0094]\u001cB\u0083@5E\u00adK\u0014HÒNPsÈqI\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§ÈyÅÞÃEÀï¾z»è¹p¶\u001e³ ±\f®\u0097¬6©¼§!¤Ù¢W\u009fü\u009dH\u009aü\u0098j\u0095é6ÍË\u0091Ì\u0001Î\u0099Ã&Å¿Æ+Ø ÝEßÕÐlÒö×véàêkï\u0016á\u008aâ\fäþù?û«ü)þðóVõÕöa\u0088ô\u008db\u008fó\u0080§\u0085\u0019\u0087\u0090\u0098\u000f\u009a«\u009f$\u0091®\u0092V\u0094ë©M«Ë¬s®î\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ¢Í%Ê¯ÈVÅõÃAÀì¾f»á¹e¶\u0002³¤±\u0000®\u0084¬2©¡\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§ÈyÅÐÃKÀ÷¾s»Ä¹j¶+³\u009e±\b®\u0099\u0000Cý\u001fú\u008fø\u0017õ¨ó1ð¥î.ëËé[æâäxáøßnÜåÙ\u0098×\u0004Ô\u0082ÒpÏ±Í%Ê§È|ÅÐÃAÀó¾B»â¹H¶\u0014³\u0093±\r®©¬9©\u009e§)¤Ý¢J\u001a»ççàwâïïPéÉê]ôÖñ3ó£ü\u001aþ\u0080û\u0000Å\u0096Æ\u001dÃ`ÍüÎzÈ\u0088ÕI×ÝÐ_Ò\u008bß'Ù¹Ú\u0013¤\u0087¡\u0014£\u0090¬ê©p«ô".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1261);
            f840 = cArr;
            f841 = 6327416800644824439L;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ ChartboostDelegate mo742() {
            int i10 = f838 + 69;
            f839 = i10 % 128;
            int i11 = i10 % 2;
            ChartboostDelegate chartboostDelegateM885 = m885();
            int i12 = f839 + 115;
            f838 = i12 % 128;
            int i13 = i12 % 2;
            return chartboostDelegateM885;
        }

        public e(ChartboostDelegate chartboostDelegate, ch chVar) {
            this.f844 = chartboostDelegate;
            this.f843 = chVar;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private ChartboostDelegate m885() {
            int i10 = f838;
            int i11 = i10 + 79;
            f839 = i11 % 128;
            if ((i11 % 2 == 0 ? '%' : '9') == '%') {
                throw null;
            }
            ChartboostDelegate chartboostDelegate = this.f844;
            int i12 = i10 + 89;
            f839 = i12 % 128;
            int i13 = i12 % 2;
            return chartboostDelegate;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m886(int i10, char c10, int i11) {
            String str;
            synchronized (d.f1653) {
                char[] cArr = new char[i11];
                d.f1652 = 0;
                while (true) {
                    int i12 = d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f840[i10 + i12]) ^ (((long) i12) * f841)) ^ ((long) c10));
                        d.f1652 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            }
            return str;
        }

        public void didCacheInPlay(String str) {
            int i10 = f838 + 93;
            f839 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886(1158 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 33).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? '@' : '-') != '-') {
                int i12 = f838 + 63;
                f839 = i12 % 128;
                int i13 = i12 % 2;
                chartboostDelegate.didCacheInPlay(str);
            }
            int i14 = f839 + 119;
            f838 = i14 % 128;
            if (i14 % 2 == 0) {
            } else {
                throw null;
            }
        }

        public void didCacheInterstitial(String str) {
            bj.this.m818(this, this.f843, m886((-16777128) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 41093), 39 - TextUtils.indexOf("", "")).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if (chartboostDelegate != null) {
                int i10 = f838 + 45;
                f839 = i10 % 128;
                char c10 = i10 % 2 == 0 ? 'A' : 'X';
                chartboostDelegate.didCacheInterstitial(str);
                if (c10 == 'A') {
                    throw null;
                }
            }
            int i11 = f838 + 99;
            f839 = i11 % 128;
            if (i11 % 2 != 0) {
            } else {
                throw null;
            }
        }

        public void didCacheMoreApps(String str) {
            int i10 = f838 + 55;
            f839 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886(413 - TextUtils.indexOf("", ""), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), Color.argb(0, 0, 0, 0) + 35).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? (char) 5 : (char) 11) == 5) {
                int i12 = f838 + 55;
                f839 = i12 % 128;
                int i13 = i12 % 2;
                chartboostDelegate.didCacheMoreApps(str);
            }
            int i14 = f839 + 55;
            f838 = i14 % 128;
            int i15 = i14 % 2;
        }

        public void didCacheRewardedVideo(String str) {
            bj.this.m818(this, this.f843, m886((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 831, (char) (21066 - ExpandableListView.getPackedPositionGroup(0L)), 40 - Color.blue(0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if (!(chartboostDelegate == null)) {
                int i10 = f839 + 19;
                f838 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didCacheRewardedVideo(str);
            }
            int i12 = f839 + 57;
            f838 = i12 % 128;
            if ((i12 % 2 != 0 ? '\n' : 'R') == 'R') {
            } else {
                throw null;
            }
        }

        public void didClickInterstitial(String str) {
            bj.this.m818(this, this.f843, m886(251 - (Process.myPid() >> 22), (char) (TextUtils.lastIndexOf("", '0') + 1), 39 - View.resolveSizeAndState(0, 0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? (char) 2 : 'b') == 2) {
                int i10 = f839 + 11;
                f838 = i10 % 128;
                boolean z10 = i10 % 2 != 0;
                chartboostDelegate.didClickInterstitial(str);
                if (z10) {
                    int i11 = 70 / 0;
                }
            }
            int i12 = f838 + 99;
            f839 = i12 % 128;
            int i13 = i12 % 2;
        }

        public void didClickMoreApps(String str) {
            bj.this.m818(this, this.f843, m886(View.MeasureSpec.makeMeasureSpec(0, 0) + 600, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 21791), TextUtils.lastIndexOf("", '0') + 36).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? 'T' : 'c') != 'c') {
                int i10 = f838 + 9;
                f839 = i10 % 128;
                boolean z10 = i10 % 2 != 0;
                chartboostDelegate.didClickMoreApps(str);
                if (!z10) {
                    throw null;
                }
            }
            int i11 = f839 + 17;
            f838 = i11 % 128;
            int i12 = i11 % 2;
        }

        public void didClickRewardedVideo(String str) {
            int i10 = f839 + 75;
            f838 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 997, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 60422), 40 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? '/' : 'R') != 'R') {
                int i12 = f838 + 61;
                f839 = i12 % 128;
                char c10 = i12 % 2 == 0 ? '-' : (char) 29;
                chartboostDelegate.didClickRewardedVideo(str);
                if (c10 != '-') {
                    return;
                }
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void didCloseInterstitial(String str) {
            int i10 = f838 + 45;
            f839 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886(260 - AndroidCharacter.getMirror('0'), (char) (35398 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 39 - ExpandableListView.getPackedPositionType(0L)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? G5.T : (char) 1) != 1) {
                chartboostDelegate.didCloseInterstitial(str);
                int i12 = f838 + 123;
                f839 = i12 % 128;
                int i13 = i12 % 2;
            }
        }

        public void didCloseMoreApps(String str) {
            bj.this.m818(this, this.f843, m886((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 565, (char) KeyEvent.keyCodeFromString(""), 35 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? (char) 24 : '$') != '$') {
                int i10 = f838 + 103;
                f839 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didCloseMoreApps(str);
                int i12 = f838 + 43;
                f839 = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = f838 + 87;
            f839 = i14 % 128;
            int i15 = i14 % 2;
        }

        public void didCloseRewardedVideo(String str) {
            int i10 = f838 + 47;
            f839 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886(958 - Color.argb(0, 0, 0, 0), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 3907), (ViewConfiguration.getPressedStateDuration() >> 16) + 40).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if (chartboostDelegate != null) {
                int i12 = f838 + 81;
                f839 = i12 % 128;
                boolean z10 = i12 % 2 != 0;
                chartboostDelegate.didCloseRewardedVideo(str);
                if (!z10) {
                    throw null;
                }
            }
            int i13 = f838 + 65;
            f839 = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        }

        public void didCompleteInterstitial(String str) {
            int i10 = f838 + 103;
            f839 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886(View.MeasureSpec.getMode(0) + 331, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 41 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if (chartboostDelegate != null) {
                int i12 = f839 + 115;
                f838 = i12 % 128;
                char c10 = i12 % 2 != 0 ? ']' : 'N';
                chartboostDelegate.didCompleteInterstitial(str);
                if (c10 != 'N') {
                    throw null;
                }
            }
            int i13 = f838 + 99;
            f839 = i13 % 128;
            if (i13 % 2 != 0) {
            } else {
                throw null;
            }
        }

        public void didCompleteRewardedVideo(String str, int i10) {
            bj.this.m818(this, this.f843, m886(1038 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 43 - View.getDefaultSize(0, 0)).intern(), str, Integer.valueOf(i10));
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? ',' : (char) 18) == ',') {
                int i11 = f838 + 95;
                f839 = i11 % 128;
                int i12 = i11 % 2;
                chartboostDelegate.didCompleteRewardedVideo(str, i10);
            }
            int i13 = f838 + 107;
            f839 = i13 % 128;
            int i14 = i13 % 2;
        }

        public void didDismissInterstitial(String str) {
            int i10 = f838 + 19;
            f839 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886(170 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((Process.myTid() >> 22) + 24434), 41 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? (char) 6 : 'c') != 'c') {
                chartboostDelegate.didDismissInterstitial(str);
            }
            int i12 = f839 + 41;
            f838 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        }

        public void didDismissMoreApps(String str) {
            int i10 = f838 + 117;
            f839 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886(527 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ExpandableListView.getPackedPositionType(0L) + 39409), 37 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? '^' : '@') != '@') {
                int i12 = f838 + 61;
                f839 = i12 % 128;
                int i13 = i12 % 2;
                chartboostDelegate.didDismissMoreApps(str);
            }
            int i14 = f839 + 103;
            f838 = i14 % 128;
            if ((i14 % 2 != 0 ? 'E' : 'G') == 'G') {
            } else {
                throw null;
            }
        }

        public void didDismissRewardedVideo(String str) {
            int i10 = f839 + 13;
            f838 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 915, (char) (Process.getGidForName("") + 61130), (-16777174) - Color.rgb(0, 0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if (!(chartboostDelegate == null)) {
                int i12 = f838 + 19;
                f839 = i12 % 128;
                char c10 = i12 % 2 == 0 ? ':' : 'a';
                chartboostDelegate.didDismissRewardedVideo(str);
                if (c10 != 'a') {
                    int i13 = 98 / 0;
                }
            }
            int i14 = f838 + 21;
            f839 = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 32 / 0;
            }
        }

        public void didDisplayInterstitial(String str) {
            bj.this.m818(this, this.f843, m886((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 290, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 41 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? 'c' : '\t') == 'c') {
                int i10 = f839 + 63;
                f838 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didDisplayInterstitial(str);
            }
            int i12 = f838 + 123;
            f839 = i12 % 128;
            if (i12 % 2 != 0) {
            } else {
                throw null;
            }
        }

        public void didDisplayMoreApps(String str) {
            int i10 = f838 + 91;
            f839 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886((ViewConfiguration.getJumpTapTimeout() >> 16) + 635, (char) View.resolveSizeAndState(0, 0, 0), 37 - Color.argb(0, 0, 0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if (chartboostDelegate != null) {
                int i12 = f839 + 13;
                f838 = i12 % 128;
                boolean z10 = i12 % 2 == 0;
                chartboostDelegate.didDisplayMoreApps(str);
                if (!z10) {
                    int i13 = 43 / 0;
                }
                int i14 = f838 + 9;
                f839 = i14 % 128;
                int i15 = i14 % 2;
            }
        }

        public void didDisplayRewardedVideo(String str) {
            bj.this.m818(this, this.f843, m886(Color.blue(0) + 1081, (char) (13965 - ImageFormat.getBitsPerPixel(0)), ExpandableListView.getPackedPositionChild(0L) + 43).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? '1' : 'b') == '1') {
                int i10 = f839 + 63;
                f838 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didDisplayRewardedVideo(str);
            }
            int i12 = f838 + 67;
            f839 = i12 % 128;
            if (i12 % 2 != 0) {
            } else {
                throw null;
            }
        }

        public void didFailToLoadInPlay(String str, CBError.CBImpressionError cBImpressionError) {
            bj.this.m818(this, this.f843, m886((ViewConfiguration.getPressedStateDuration() >> 16) + 1191, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf("", "", 0) + 38).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? (char) 15 : '\t') != '\t') {
                int i10 = f839 + 99;
                f838 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didFailToLoadInPlay(str, cBImpressionError);
                int i12 = f838 + 85;
                f839 = i12 % 128;
                int i13 = i12 % 2;
            }
        }

        public void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
            int i10 = f839 + 65;
            f838 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, (char) View.MeasureSpec.getMode(0), 45 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? 'D' : '\b') == 'D') {
                int i12 = f839 + 29;
                f838 = i12 % 128;
                char c10 = i12 % 2 == 0 ? '0' : (char) 29;
                chartboostDelegate.didFailToLoadInterstitial(str, cBImpressionError);
                if (c10 != '0') {
                    throw null;
                }
            }
            int i13 = f839 + 39;
            f838 = i13 % 128;
            int i14 = i13 % 2;
        }

        public void didFailToLoadMoreApps(String str, CBError.CBImpressionError cBImpressionError) {
            int i10 = f839 + 19;
            f838 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886((Process.myPid() >> 22) + 488, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 57119), 40 - View.MeasureSpec.getMode(0)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? 'N' : 'b') != 'b') {
                int i12 = f838 + 31;
                f839 = i12 % 128;
                boolean z10 = i12 % 2 == 0;
                chartboostDelegate.didFailToLoadMoreApps(str, cBImpressionError);
                if (z10) {
                    throw null;
                }
            }
            int i13 = f838 + 39;
            f839 = i13 % 128;
            if (i13 % 2 != 0) {
            } else {
                throw null;
            }
        }

        public void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
            int i10 = f838 + 71;
            f839 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886(TextUtils.getOffsetBefore("", 0) + 871, (char) (39864 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Color.argb(0, 0, 0, 0) + 45).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f844;
            if (!(chartboostDelegate == null)) {
                chartboostDelegate.didFailToLoadRewardedVideo(str, cBImpressionError);
            }
            int i12 = f838 + 31;
            f839 = i12 % 128;
            int i13 = i12 % 2;
        }

        public void didFailToRecordClick(String str, CBError.CBClickError cBClickError) {
            int i10 = f839 + 75;
            f838 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886((ViewConfiguration.getTapTimeout() >> 16) + 672, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 61264), 40 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), str, cBClickError);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? 'C' : (char) 19) == 'C') {
                chartboostDelegate.didFailToRecordClick(str, cBClickError);
            }
            int i12 = f838 + 51;
            f839 = i12 % 128;
            if (i12 % 2 != 0) {
            } else {
                throw null;
            }
        }

        public void didInitialize() {
            bj.this.m818(this, this.f843, m886((KeyEvent.getMaxKeyCode() >> 16) + 1229, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6905), (ViewConfiguration.getTouchSlop() >> 8) + 32).intern(), new Object[0]);
            ChartboostDelegate chartboostDelegate = this.f844;
            if (chartboostDelegate != null) {
                int i10 = f839 + 29;
                f838 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didInitialize();
                int i12 = f839 + 63;
                f838 = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = f838 + 29;
            f839 = i14 % 128;
            if ((i14 % 2 != 0 ? 'a' : (char) 0) == 'a') {
            } else {
                throw null;
            }
        }

        public void didPauseClickForConfirmation(Activity activity) {
            int i10 = f839 + 39;
            f838 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886(710 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (14310 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), View.MeasureSpec.getMode(0) + 47).intern(), activity);
            ChartboostDelegate chartboostDelegate = this.f844;
            if (!(chartboostDelegate == null)) {
                try {
                    chartboostDelegate.getClass().getDeclaredMethod(m886(MotionEvent.axisFromString("") + 759, (char) (ExpandableListView.getPackedPositionType(0L) + 50058), 27 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), Activity.class).invoke(this.f844, activity);
                    int i12 = f839 + 39;
                    f838 = i12 % 128;
                    int i13 = i12 % 2;
                    return;
                } catch (Throwable unused) {
                }
            }
            int i14 = f838 + 47;
            f839 = i14 % 128;
            if (i14 % 2 != 0) {
            } else {
                throw null;
            }
        }

        public boolean shouldDisplayInterstitial(String str) {
            int i10 = f839 + 13;
            f838 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886(43 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getCapsMode("", 0, 0) + 44).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? 'R' : '\n') != '\n') {
                int i12 = f839 + 109;
                f838 = i12 % 128;
                int i13 = i12 % 2;
                return chartboostDelegate.shouldDisplayInterstitial(str);
            }
            int i14 = f838 + 3;
            f839 = i14 % 128;
            if ((i14 % 2 == 0 ? '-' : (char) 2) == 2) {
                return false;
            }
            throw null;
        }

        public boolean shouldDisplayMoreApps(String str) {
            int i10 = f839 + 97;
            f838 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886(448 - Drawable.resolveOpacity(0, 0), (char) (18364 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 39).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if (!(chartboostDelegate != null)) {
                return false;
            }
            int i12 = f838 + 77;
            f839 = i12 % 128;
            int i13 = i12 % 2;
            boolean zShouldDisplayMoreApps = chartboostDelegate.shouldDisplayMoreApps(str);
            int i14 = f839 + 101;
            f838 = i14 % 128;
            if ((i14 % 2 != 0 ? (char) 3 : 'K') == 'K') {
                return zShouldDisplayMoreApps;
            }
            throw null;
        }

        public boolean shouldDisplayRewardedVideo(String str) {
            int i10 = f838 + 89;
            f839 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886(785 - TextUtils.indexOf((CharSequence) "", '0'), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 45).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? '`' : 'J') != 'J') {
                return chartboostDelegate.shouldDisplayRewardedVideo(str);
            }
            int i12 = f838 + 61;
            f839 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }

        public boolean shouldRequestInterstitial(String str) {
            int i10 = f839 + 25;
            f838 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886(Color.red(0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 43 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? '#' : '5') != '5') {
                int i12 = f838 + 123;
                f839 = i12 % 128;
                int i13 = i12 % 2;
                return chartboostDelegate.shouldRequestInterstitial(str);
            }
            int i14 = f838 + 39;
            f839 = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }

        public boolean shouldRequestMoreApps(String str) {
            int i10 = f839 + 73;
            f838 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886(Process.getGidForName("") + 374, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 24478), 40 - View.resolveSizeAndState(0, 0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if ((chartboostDelegate != null ? '\'' : '#') != '\'') {
                int i12 = f839 + 41;
                f838 = i12 % 128;
                int i13 = i12 % 2;
                return false;
            }
            int i14 = f838 + 79;
            f839 = i14 % 128;
            int i15 = i14 % 2;
            return chartboostDelegate.shouldRequestMoreApps(str);
        }

        public void willDisplayVideo(String str) {
            int i10 = f838 + 103;
            f839 = i10 % 128;
            int i11 = i10 % 2;
            bj.this.m818(this, this.f843, m886((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1122, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), ExpandableListView.getPackedPositionGroup(0L) + 35).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f844;
            if (chartboostDelegate == null) {
                return;
            }
            int i12 = f839 + 29;
            f838 = i12 % 128;
            int i13 = i12 % 2;
            chartboostDelegate.willDisplayVideo(str);
            int i14 = f838 + 41;
            f839 = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m875(CBInPlay cBInPlay) {
        int i10 = f825 + 43;
        f823 = i10 % 128;
        int i11 = i10 % 2;
        String strM873 = m873(cBInPlay);
        int i12 = f825 + 101;
        f823 = i12 % 128;
        int i13 = i12 % 2;
        return strM873;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m879(ChartboostDelegate chartboostDelegate) {
        int i10 = f823 + 75;
        f825 = i10 % 128;
        int i11 = i10 % 2;
        m874(chartboostDelegate);
        int i12 = f823 + 7;
        f825 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return;
        }
        int i13 = 19 / 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ e m881(bj bjVar, ChartboostDelegate chartboostDelegate, ch chVar) {
        int i10 = f823 + 97;
        f825 = i10 % 128;
        int i11 = i10 % 2;
        e eVarM872 = bjVar.m872(chartboostDelegate, chVar);
        int i12 = f823 + 71;
        f825 = i12 % 128;
        if (i12 % 2 == 0) {
            return eVarM872;
        }
        int i13 = 15 / 0;
        return eVarM872;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m883(CBInPlay cBInPlay) {
        int i10 = f825 + 91;
        f823 = i10 % 128;
        int i11 = i10 % 2;
        String strM877 = m877(cBInPlay);
        int i12 = f823 + 1;
        f825 = i12 % 128;
        if (i12 % 2 == 0) {
            return strM877;
        }
        int i13 = 62 / 0;
        return strM877;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        map.put(m878(new int[]{203, 13, 2, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", true).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bj.m876(bj.this, chVar);
                return null;
            }
        });
        map.put(m878(new int[]{Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 21, 195, 0}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000", true).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bj.m871();
            }
        });
        map.put(m878(new int[]{237, 27, 104, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001", false).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bj.m870();
            }
        });
        map.put(m878(new int[]{264, 26, 0, 0}, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001", false).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bj.m881(bj.this, (ChartboostDelegate) list.get(0), chVar);
            }
        });
        map.put(m882("显浵̆滬क़劵♺譔칁᷽䍾줂轏삓핝蓧蝎\uf17e\uf4aa䴿\ue876", (char) (ViewConfiguration.getPressedStateDuration() >> 16), "\u0000\u0000\u0000\u0000", 35602157 - KeyEvent.normalizeMetaState(0), "\uedacἾᄂ骃").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bj.m879((ChartboostDelegate) list.get(0));
                return null;
            }
        });
        map.put(m878(new int[]{290, 16, 126, 1}, "\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001", false).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return Boolean.valueOf(bj.m869());
            }
        });
        map.put(m878(new int[]{306, 11, 120, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001", false).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bj.m875((CBInPlay) list.get(0));
            }
        });
        map.put(m882("쐍ﲗ\ue1d5귖浳㊎鄪⻩릂ᓼ", (char) KeyEvent.getDeadChar(0, 0), "\u0000\u0000\u0000\u0000", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "敁㨐㡕\u1ad8").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bj.m883((CBInPlay) list.get(0));
            }
        });
        map.put(m878(new int[]{317, 12, 0, 5}, "\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001", true).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return Boolean.valueOf(bj.m884(bj.this));
            }
        });
        int i10 = f823 + 83;
        f825 = i10 % 128;
        if ((i10 % 2 != 0 ? '3' : 'c') != '3') {
            return map;
        }
        int i11 = 61 / 0;
        return map;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static boolean m865() {
        int i10 = f825 + 97;
        f823 = i10 % 128;
        if ((i10 % 2 == 0 ? '>' : 'C') == 'C') {
            return m866() instanceof e;
        }
        int i11 = 70 / 0;
        return m866() instanceof e;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static Object m866() {
        int i10 = f825 + 27;
        f823 = i10 % 128;
        int i11 = i10 % 2;
        com.chartboost.sdk.a delegate = Chartboost.getDelegate();
        int i12 = f825 + 95;
        f823 = i12 % 128;
        int i13 = i12 % 2;
        return delegate;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static Object m867() {
        int i10 = f823 + 33;
        f825 = i10 % 128;
        int i11 = i10 % 2;
        com.chartboost.sdk.impl.a aVar = com.chartboost.sdk.g.d;
        int i12 = f823 + 35;
        f825 = i12 % 128;
        int i13 = i12 % 2;
        return aVar;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static boolean m868() {
        int i10 = f823 + 7;
        f825 = i10 % 128;
        int i11 = i10 % 2;
        boolean zIsWebViewEnabled = Chartboost.isWebViewEnabled();
        int i12 = f825 + 29;
        f823 = i12 % 128;
        int i13 = i12 % 2;
        return zIsWebViewEnabled;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static /* synthetic */ boolean m869() {
        int i10 = f823 + 23;
        f825 = i10 % 128;
        if (i10 % 2 == 0) {
            return m868();
        }
        m868();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ Object m870() {
        int i10 = f825 + 73;
        f823 = i10 % 128;
        int i11 = i10 % 2;
        Object objM867 = m867();
        int i12 = f823 + 41;
        f825 = i12 % 128;
        int i13 = i12 % 2;
        return objM867;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ Object m871() {
        int i10 = f825 + 53;
        f823 = i10 % 128;
        int i11 = i10 % 2;
        Object objM866 = m866();
        int i12 = f825 + 79;
        f823 = i12 % 128;
        int i13 = i12 % 2;
        return objM866;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m876(bj bjVar, ch chVar) {
        int i10 = f823 + 39;
        f825 = i10 % 128;
        char c10 = i10 % 2 != 0 ? (char) 7 : '4';
        bjVar.m880(chVar);
        if (c10 != 7) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m880(ch chVar) {
        int i10 = f825 + 85;
        f823 = i10 % 128;
        int i11 = i10 % 2;
        m874(m872((ChartboostDelegate) m866(), chVar));
        int i12 = f825 + 123;
        f823 = i12 % 128;
        if ((i12 % 2 == 0 ? ';' : ':') != ';') {
            return;
        }
        int i13 = 17 / 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m882(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2673) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c10 ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i10));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            j.f2675 = 0;
            while (true) {
                int i11 = j.f2675;
                if (i11 < length) {
                    int i12 = (i11 + 2) % 4;
                    int i13 = (i11 + 3) % 4;
                    int i14 = cArr4[i11 % 4] * 32718;
                    char c11 = cArr5[i12];
                    char c12 = (char) ((i14 + c11) % 65535);
                    j.f2674 = c12;
                    cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                    cArr4[i13] = c12;
                    int i15 = j.f2675;
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f827) ^ ((long) f826)) ^ ((long) f828));
                    j.f2675 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m884(bj bjVar) {
        int i10 = f825 + 5;
        f823 = i10 % 128;
        if (i10 % 2 == 0) {
            m865();
            throw null;
        }
        boolean zM865 = m865();
        int i11 = f823 + 43;
        f825 = i11 % 128;
        int i12 = i11 % 2;
        return zM865;
    }

    public bj(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m877(CBInPlay cBInPlay) {
        int i10 = f823 + 31;
        f825 = i10 % 128;
        int i11 = i10 % 2;
        String appName = cBInPlay.getAppName();
        int i12 = f825 + 55;
        f823 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return appName;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        int i10 = f823 + 11;
        f825 = i10 % 128;
        int i11 = i10 % 2;
        try {
            String sDKVersion = Chartboost.getSDKVersion();
            int i12 = f825 + 23;
            f823 = i12 % 128;
            if ((i12 % 2 == 0 ? ':' : 'P') != ':') {
                return sDKVersion;
            }
            throw null;
        } catch (Error unused) {
            return m882("镋\ud964鉎鐙秬", (char) (8752 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", TextUtils.indexOf((CharSequence) "", '0') - 122362581, "⪲듥⿸\ue322").intern();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        byte b10;
        int i10 = f823 + 63;
        f825 = i10 % 128;
        byte b11 = 2;
        int i11 = i10 % 2;
        switch (str.hashCode()) {
            case -1602236458:
                if (!str.equals(m882("ᎉ\ueee7ภ㝱䑖⇙닄\ue8db\ufaf3稍ꔗ㣖\ued6d㲎ᣝྏ罳ᐃ\ue5e6귞궠㵐\udd4e蓦蔷\uf83d䃲", (char) (TextUtils.indexOf("", "", 0, 0) + 56712), "\u0000\u0000\u0000\u0000", (-712000525) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\uf301辻裕៝").intern())) {
                    b11 = -1;
                } else {
                    int i12 = f823 + 23;
                    f825 = i12 % 128;
                    b11 = !(i12 % 2 == 0) ? (byte) 33 : (byte) 6;
                }
                break;
            case -1251618628:
                b11 = !str.equals(m878(new int[]{135, 24, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001", true).intern()) ? (byte) -1 : (byte) 17;
                break;
            case -921117961:
                b11 = !str.equals(m882("䘨돰鍵䣛⣆遠䷳ⶴ\u0ab4⛌䩷嶨遘䕷쵤貴떜ꉊ㑎띖", (char) TextUtils.getTrimmedLength(""), "\u0000\u0000\u0000\u0000", ViewConfiguration.getTapTimeout() >> 16, "휒븰挵씫").intern()) ? (byte) -1 : (byte) 1;
                break;
            case -869710636:
                b11 = !str.equals(m878(new int[]{0, 18, 0, 13}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000", false).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -513187163:
                if (!str.equals(m882("瘾睴펛ኼᆞ䮇枃䁞៳ຍ", (char) Color.red(0), "\u0000\u0000\u0000\u0000", ViewConfiguration.getLongPressTimeout() >> 16, "⽑㕻잩怤").intern())) {
                    b11 = -1;
                }
                break;
            case -416101408:
                if (!str.equals(m878(new int[]{43, 26, 10, 2}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001", false).intern())) {
                    b11 = -1;
                } else {
                    int i13 = f823 + 27;
                    f825 = i13 % 128;
                    if (!(i13 % 2 != 0)) {
                        b11 = 7;
                    } else {
                        b10 = 111;
                        b11 = b10;
                    }
                }
                break;
            case -371244199:
                b11 = !str.equals(m878(new int[]{18, 11, 27, 4}, null, true).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -352872024:
                if (!str.equals(m882("婔职ᥓ\uf657璘蔝柅婜쟵鋔", (char) Gravity.getAbsoluteGravity(0, 0), "\u0000\u0000\u0000\u0000", Color.green(0), "\ud96b㈞黓섪").intern())) {
                    b11 = -1;
                } else {
                    b10 = 12;
                    int i14 = f823 + 41;
                    f825 = i14 % 128;
                    int i15 = i14 % 2;
                    b11 = b10;
                }
                break;
            case -305846637:
                if (!str.equals(m882("⾁⤷\ueed6\uf670\ue360Җ䅶\ue13c₨깞㱉郼\uf5de醇搊쾒", (char) (55362 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), "\u0000\u0000\u0000\u0000", TextUtils.getOffsetAfter("", 0), "贑\ud9e0䋇俘").intern())) {
                    b11 = -1;
                } else {
                    int i16 = f825 + 7;
                    f823 = i16 % 128;
                    b11 = i16 % 2 != 0 ? (byte) 15 : (byte) 121;
                }
                break;
            case -221039695:
                b11 = !(str.equals(m878(new int[]{115, 20, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000", false).intern())) ? (byte) -1 : (byte) 14;
                break;
            case -174936018:
                if ((str.equals(m882("ᑚ⺛⸣섧ړ\uefed\ue433걫", (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "ஹ\uf68d퐞宧").intern()) ? '-' : ',') == '-') {
                    int i17 = f825 + 25;
                    f823 = i17 % 128;
                    int i18 = i17 % 2;
                    b11 = 11;
                } else {
                    b11 = -1;
                }
                break;
            case 2115:
                b11 = (str.equals(m882("✮ꛂ", (char) (Color.blue(0) + 29239), "\u0000\u0000\u0000\u0000", Process.myPid() >> 22, "웣흚㝪婲").intern()) ? (char) 3 : (char) 11) == 11 ? (byte) -1 : (byte) 9;
                break;
            case 296803428:
                b11 = (str.equals(m882("\u2dd7䌱鎭\u171fᤚ빤ጓ梊嶽盏퇉刾䖉㥵眈䈑창ꣁ翔돾띑", (char) (Color.rgb(0, 0, 0) + 16777216), "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", "", 0) + (-1622857353), "瞾䔩讟餂").intern()) ? '/' : '7') == '7' ? (byte) -1 : (byte) 13;
                break;
            case 544981520:
                b11 = !str.equals(m878(new int[]{159, 44, 0, 6}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001", true).intern()) ? (byte) -1 : (byte) 18;
                break;
            case 604162924:
                b11 = !str.equals(m878(new int[]{69, 46, 95, 33}, null, true).intern()) ? (byte) -1 : (byte) 8;
                break;
            case 650412337:
                b11 = !(str.equals(m878(new int[]{29, 14, 73, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000", true).intern()) ? false : true) ? (byte) 5 : (byte) -1;
                break;
            case 753858215:
                b11 = !str.equals(m882("恐\udedf梻冇㚭睎ꈾ阈릱㔏ቺ齸蓞", (char) (ExpandableListView.getPackedPositionGroup(0L) + 57456), "\u0000\u0000\u0000\u0000", (KeyEvent.getMaxKeyCode() >> 16) - 858836275, "춆켲烌ˠ").intern()) ? (byte) -1 : (byte) 16;
                break;
            case 769047372:
                b11 = (str.equals(m882("\udc2cေ娋娇ꪨᷝ硽䅮\ua63f\ue39d\u1f5c퉻", (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + (-1)), "\u0000\u0000\u0000\u0000", ViewConfiguration.getDoubleTapTimeout() >> 16, "\uf87c㝷쒦\uf358").intern()) ? (char) 14 : (char) 29) == 14 ? (byte) 10 : (byte) -1;
                break;
            case 1443881784:
                b11 = !str.equals(m882("\ue252\uea0fࡠ줤籅ᅗ隅䢄", (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionType(0L), "⩤厩㢄\ue6d0").intern()) ? (byte) -1 : (byte) 3;
                break;
            default:
                b11 = -1;
                break;
        }
        switch (b11) {
            case 0:
                return ChartboostActivity.class;
            case 1:
                return CBImpressionActivity.class;
            case 2:
                return Chartboost.class;
            case 3:
                return CBInPlay.class;
            case 4:
                return Chartboost.CBMediation.class;
            case 5:
                return MediationModel.class;
            case 6:
                return e.class;
            case 7:
            case 8:
                return com.chartboost.sdk.legacy.CBImpressionActivity.class;
            case 9:
                return Ad.class;
            case 10:
                return Interstitial.class;
            case 11:
                return Rewarded.class;
            case 12:
                return AdCallback.class;
            case 13:
                return DismissibleAdCallback.class;
            case 14:
                return InterstitialCallback.class;
            case 15:
                return RewardedCallback.class;
            case 16:
                return StartCallback.class;
            case 17:
            case 18:
                return com.chartboost.sdk.view.CBImpressionActivity.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m878(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2448) {
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            char[] cArr = new char[i11];
            System.arraycopy(f824, i10, cArr, 0, i11);
            if (bArr != null) {
                char[] cArr2 = new char[i11];
                i.f2447 = 0;
                char c10 = 0;
                while (true) {
                    int i14 = i.f2447;
                    if (i14 >= i11) {
                        break;
                    }
                    if (bArr[i14] == 1) {
                        cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                    } else {
                        cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                    }
                    c10 = cArr2[i14];
                    i.f2447 = i14 + 1;
                }
                cArr = cArr2;
            }
            if (i13 > 0) {
                char[] cArr3 = new char[i11];
                System.arraycopy(cArr, 0, cArr3, 0, i11);
                int i15 = i11 - i13;
                System.arraycopy(cArr3, 0, cArr, i15, i13);
                System.arraycopy(cArr3, i13, cArr, 0, i15);
            }
            if (z10) {
                char[] cArr4 = new char[i11];
                i.f2447 = 0;
                while (true) {
                    int i16 = i.f2447;
                    if (i16 >= i11) {
                        break;
                    }
                    cArr4[i16] = cArr[(i11 - i16) - 1];
                    i.f2447 = i16 + 1;
                }
                cArr = cArr4;
            }
            if (i12 > 0) {
                i.f2447 = 0;
                while (true) {
                    int i17 = i.f2447;
                    if (i17 >= i11) {
                        break;
                    }
                    cArr[i17] = (char) (cArr[i17] - iArr[2]);
                    i.f2447 = i17 + 1;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private e m872(ChartboostDelegate chartboostDelegate, ch chVar) {
        e eVar = new e(chartboostDelegate, chVar);
        int i10 = f825 + 69;
        f823 = i10 % 128;
        int i11 = i10 % 2;
        return eVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m874(ChartboostDelegate chartboostDelegate) {
        int i10 = f823 + 33;
        f825 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        Chartboost.setDelegate(chartboostDelegate);
        if (z10) {
            throw null;
        }
        int i11 = f823 + 11;
        f825 = i11 % 128;
        if (!(i11 % 2 != 0)) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m873(CBInPlay cBInPlay) {
        int i10 = f823 + 93;
        f825 = i10 % 128;
        int i11 = i10 % 2;
        String location = cBInPlay.getLocation();
        int i12 = f825 + 51;
        f823 = i12 % 128;
        if (i12 % 2 != 0) {
            return location;
        }
        int i13 = 77 / 0;
        return location;
    }
}
