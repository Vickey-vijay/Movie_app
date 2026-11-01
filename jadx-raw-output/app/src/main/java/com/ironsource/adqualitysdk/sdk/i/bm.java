package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdController;
import com.amazon.aps.ads.ApsAdRequest;
import com.amazon.aps.ads.ApsAdView;
import com.amazon.aps.ads.activity.ApsAdActivity;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.listeners.ApsAdRequestListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.model.ApsAdType;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.AdType;
import com.amazon.device.ads.DTBActivity;
import com.amazon.device.ads.DTBAdActivity;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdBaseBannerListener;
import com.amazon.device.ads.DTBAdBaseInterstitialListener;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdExpandedListener;
import com.amazon.device.ads.DTBAdInterstitial;
import com.amazon.device.ads.DTBAdInterstitialListener;
import com.amazon.device.ads.DTBAdListener;
import com.amazon.device.ads.DTBAdLoader;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DTBAdViewSupportClient;
import com.amazon.device.ads.DTBFetchFactory;
import com.amazon.device.ads.DTBFetchManager;
import com.amazon.device.ads.DTBInterstitialActivity;
import com.amazon.device.ads.DTBRenderer;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class bm extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f880 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f881;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f882;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f883;

    public class a extends HashMap<String, DTBFetchManager> implements hg<HashMap<String, DTBFetchManager>> {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f907 = 1;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f908 = {'D', 'T', 'B', 'F', 'e', 't', 'c', 'h', 'M', 'a', 'n', 'g', 'r', 'k', 'H', 's', 'p', '.', 'u', 'E', 'G', 'I', 'J', 'K', 'L'};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f909 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f910 = 5;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ch f912;

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ HashMap<String, DTBFetchManager> mo742() {
            int i10 = f907 + 91;
            f909 = i10 % 128;
            int i11 = i10 % 2;
            HashMap<String, DTBFetchManager> mapM991 = m991();
            int i12 = f909 + 121;
            f907 = i12 % 128;
            int i13 = i12 % 2;
            return mapM991;
        }

        public a(HashMap<String, DTBFetchManager> map, ch chVar) {
            super(map);
            this.f912 = chVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private DTBFetchManager m990(String str, DTBFetchManager dTBFetchManager) {
            int i10 = f909 + 89;
            f907 = i10 % 128;
            int i11 = i10 % 2;
            bm.this.m818(this, this.f912, m992("\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000e\u0005\u000e\u0001\r\u000e\u0013\u000e\u0011\u0005\t\u0005\u0011\u0012\u0011\u0013¸", 28 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (68 - ExpandableListView.getPackedPositionType(0L))).intern(), str, dTBFetchManager);
            DTBFetchManager dTBFetchManager2 = (DTBFetchManager) super.put(str, dTBFetchManager);
            int i12 = f907 + 63;
            f909 = i12 % 128;
            if ((i12 % 2 != 0 ? 'B' : ' ') == ' ') {
                return dTBFetchManager2;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private HashMap<String, DTBFetchManager> m991() {
            int i10 = f907;
            int i11 = i10 + 111;
            f909 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i10 + 57;
            f909 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m992(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2129) {
                char[] cArr2 = f908;
                char c10 = f910;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    g.f2134 = 0;
                    while (true) {
                        int i11 = g.f2134;
                        if (i11 >= i10) {
                            break;
                        }
                        g.f2133 = cArr[i11];
                        g.f2131 = cArr[g.f2134 + 1];
                        if (g.f2133 == g.f2131) {
                            cArr3[g.f2134] = (char) (g.f2133 - b10);
                            cArr3[g.f2134 + 1] = (char) (g.f2131 - b10);
                        } else {
                            g.f2132 = g.f2133 / c10;
                            g.f2130 = g.f2133 % c10;
                            g.f2135 = g.f2131 / c10;
                            g.f2128 = g.f2131 % c10;
                            if (g.f2130 == g.f2128) {
                                g.f2132 = ((g.f2132 + c10) - 1) % c10;
                                g.f2135 = ((g.f2135 + c10) - 1) % c10;
                                int i12 = (g.f2132 * c10) + g.f2130;
                                int i13 = (g.f2135 * c10) + g.f2128;
                                int i14 = g.f2134;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (g.f2132 == g.f2135) {
                                g.f2130 = ((g.f2130 + c10) - 1) % c10;
                                g.f2128 = ((g.f2128 + c10) - 1) % c10;
                                int i15 = (g.f2132 * c10) + g.f2130;
                                int i16 = (g.f2135 * c10) + g.f2128;
                                int i17 = g.f2134;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (g.f2132 * c10) + g.f2128;
                                int i19 = (g.f2135 * c10) + g.f2130;
                                int i20 = g.f2134;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        g.f2134 += 2;
                    }
                }
                str2 = new String(cArr3);
            }
            return str2;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            int i10 = f907 + 19;
            f909 = i10 % 128;
            int i11 = i10 % 2;
            DTBFetchManager dTBFetchManagerM990 = m990((String) obj, (DTBFetchManager) obj2);
            int i12 = f907 + 79;
            f909 = i12 % 128;
            int i13 = i12 % 2;
            return dTBFetchManagerM990;
        }
    }

    public class c extends ThreadPoolExecutor implements hg<ThreadPoolExecutor> {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f913 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f914;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f915 = {'T', 37814, 10157, 48036, 20405, 58279, 30669, 3032, 40911, 13286, 51163, 23321, 61186, 33554, 5937, 43823, 16165, 54042, 26445, 64356, 36725, 9063, 46733, 19096, 56965};

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static long f916 = 3708850498202801140L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private ch f918;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private ThreadPoolExecutor m994() {
            int i10 = f914 + 125;
            f913 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 59 / 0;
            }
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(ThreadPoolExecutor threadPoolExecutor, ch chVar) {
            int corePoolSize = threadPoolExecutor.getCorePoolSize();
            int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            super(corePoolSize, maximumPoolSize, threadPoolExecutor.getKeepAliveTime(timeUnit), timeUnit, threadPoolExecutor.getQueue());
            this.f918 = chVar;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m993(int i10, char c10, int i11) {
            String str;
            synchronized (d.f1653) {
                char[] cArr = new char[i11];
                d.f1652 = 0;
                while (true) {
                    int i12 = d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f915[i10 + i12]) ^ (((long) i12) * f916)) ^ ((long) c10));
                        d.f1652 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            }
            return str;
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            int i10 = f913 + 111;
            f914 = i10 % 128;
            int i11 = i10 % 2;
            bm.this.m818(this, this.f918, m993(Process.myPid() >> 22, (char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf("", "", 0) + 25).intern(), runnable);
            super.execute(runnable);
            int i12 = f913 + 79;
            f914 = i12 % 128;
            int i13 = i12 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ ThreadPoolExecutor mo742() {
            int i10 = f913 + 9;
            f914 = i10 % 128;
            int i11 = i10 % 2;
            ThreadPoolExecutor threadPoolExecutorM994 = m994();
            int i12 = f913 + 23;
            f914 = i12 % 128;
            int i13 = i12 % 2;
            return threadPoolExecutorM994;
        }
    }

    static {
        char[] cArr = new char[1191];
        ByteBuffer.wrap("\u0000.\u0085Õ\u000bÓ\u0091Õ\u0017§\u009d§#\u009e©×/¥µÜ;ßÁÛGÞ\u000f`\u008aº\u0004\u008d\u009e¹\u0018º\u0092³,¨¦¬ «º·4£Î½HºÂ¼\u0000D\u0085«\u000b¼\u0091¼\u0017\u009f\u009d\u008f#\u0093©\u008f/\u0091µ\u0083;\u008f\u0000c\u0085\u0090\u000b\u0093\u0091Ó\u0017\u009d\u009d\u0096#\u009b©\u0083/\u0097µ\u0099;ØÁ\u0091G\u0091Í\u0085S\u009bÙ\u0092_\u0095åÁk\u008fñ\u0089w\u009fýÅ\u0083®\t½\u008fª\u0015¦\u009b\u0085!\u0091§\u008d-\u0095³\u008b9\u0095¿\u0099\u0000D\u0085«\u000b¼\u0091´\u0017\u0092\u009d\u008f#\u009f©\u008b/\u008bµ\u0083;\u009fÁ\u0081G\u009dÍ\u0092S\u009eÙ°_\u0093å\u009bk\u0087ñ\u009bw\u0085ý\u009f\u0083\u0093\u0000c\u0085\u0090\u000b\u0093\u0091Ó\u0017\u009d\u009d\u0096#\u009b©\u0083/\u0097µ\u0099;ØÁ\u0091G\u0091Í\u0085S\u009bÙ\u0092_\u0095åÁk\u008fñ\u0089w\u009fýÅ\u0083®\t½\u008fª\u0015®\u009b\u0088!\u0091§\u0081-\u0091³\u00919\u0095¿\u0089E«Ë·Q¼×°]\u009aã¹i\u00adï±u¡û¿\u0081¡\u0007\u00ad\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009dº#\u0099©\u008d/\u0091µ\u0081;\u009fÁ\u0081G\u008d\u0000c\u0085\u0090\u000b\u0093\u0091Ó\u0017\u009d\u009d\u0096#\u009b©\u0083/\u0097µ\u0099;ØÁ\u0091G\u0091Í\u0085S\u009bÙ\u0092_\u0095åÁk\u008fñ\u0089w\u009fýÅ\u0083®\t½\u008fª\u0015¦\u009b\u0082!¤§\u0087-\u0097³\u008b9\u0097¿\u0089E«Ë§\u0088\u0007\rè\u0083ÿ\u0019ÿ\u009fÛ\u0015ñ«×!Î§Þ=Æ³ÆIÂÏÞEÄÛØQÓ×ß\u0000Y\u0085¶\u000b¡\u0091¡\u0017\u0085\u009dª#\u0088©\u0085/\u0081µ\u008f;\u0099\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d©#\u009f©\u0088/\u008dµ\u0092;\u0085Á\u0081ºÖ?9±.+.\u00ad\n';\u0099\r\u0013\u0018\u0095\u001a\u000f\n\u0081\n{\u0014ý\u0003Z\u0018ß÷QàËàMÄÇñyÏóÀuÓ\u0080]\u0005®\u008b\u00ad\u0011í\u0097£\u001d¨£¥)½¯©5§»æA¯Ç¯M»Ó¥Y¬ß«eÿë±q·÷¡}û\u0003\u0090\u0089\u0083\u000f\u0094\u0095\u0098\u001b¼¡\u008d'³\u00ad¸3«^-ÛÂUÕÏÕIñÃÁ}ú÷êqô\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d\u00ad#\u0093©\u009c/\u008fµ¤;\u0083Á\u0085G\u0084Í\u009cS\u0080Ù\u0085_³å\u0083k\u0087ñ\u0088w\u0082ý\u009fÇhB\u0087Ì\u0090V\u0097ÐµZ£äµn½è\u0092rºü¹\u0006\u00ad\u0080·\n\u00ad\u0094§\u009dé\u0018\u0006\u0096\u0011\f\u0016\u008a4\u0000\"¾44<²\u0018(;¦5\\9Ú>P;Î-jWï¸a¯û¼}\u008a÷\u0086I\u008dÃ\u008fE\u0099ß\u0081Q\u0097\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d¹#\u009b©\u0097/\u0096µ\u0092;\u0084Á¹G\u009dÍ\u0080S\u0086Ù\u0094_\u009eå\u008ak\u009c´Y1¶¿¡%¡£\u0085)¤\u0097\u0086\u001d\u0097\u009b\u0080\u0001¨\u008f\u008au\u0086ó\u0087y\u008bç\u009dm ë\u0084Q\u0081ß\u0087E\u0095Ã\u009fI\u00937\u0085\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d¹#\u009b©\u008a/\u009dµ¾;\u0098Á\u0081G\u0091Í\u0081S\u0081Ù\u0085_\u0099å\u009bk\u0087ñ\u008cw\u0080ý§\u0083\u0083\t\u009a\u008f\u009c\u0015\u0082\u009b\u0088!\u0080§\u0096Ù\u0092\\}ÒjHjÎNDnúMpCöBlCâA\u0018@\u009eIÄìA\u0003Ï\u0014U\u0014Ó0Y\u0016ç*m!ë1q1ÿ:\u00058\u00838\t\u0017\u00973\u001d*\u009b,!\"¯(5 ³6\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d²#\u0094©\u008d/\u009dµ\u0085;\u0085Á\u0081G\u009dÍ\u0087S\u009bÙ\u0090_\u009cå£k\u0087ñ\u009ew\u0098ý\u008e\u0083\u0084\t\u008c\u008f\u009au\u0080ðo~xäxb\\èsVWÜNZHÀVN\\´T2B\u0000T\u0085½\u000b³\u0091\u009c\u0017\u0092\u009d\u009a#\u009d©\u009c/\u008aµ¿;\u0097Á\u0086G\u009cÍ¾S\u0093Ù\u0081\u0000T\u0085½\u000b»\u0091\u0085\u0017\u0099\u009d\u0098#\u008f©\u008d/\u0097µ\u0085;¥Á\u0090G\u0086Í\u0085S\u009bÙ\u0092_\u0095dÃá\ro\u000fõ6s\u0010ù\rG\u001dÍ\tK\tÑ\u0001_\u001d¥\u0003#\u001f©\u00107\u001c½2;\u0011\u0081\u0019\u000f\u0005\u0095\u0019\u0013\u0007\u0099\u001dç\u0011\u0000c\u0085\u0090\u000b\u0093\u0091Ó\u0017\u009d\u009d\u0096#\u009b©\u0083/\u0097µ\u0099;ØÁ\u0094G\u0084Í\u0080SÜÙ\u0090_\u0094å\u009ckÀñ\u008cw\u008fý\u009f\u0083\u0083\t\u009f\u008f\u0081\u0015\u0093\u009b\u009f!Ë§¥-\u0093³\u00919¨¿\u008eE«Ë»Q¯×¯]¯ã³i\u00adï±u¶ûº\u0081\u0094\u0007·\u008d§\u0013»\u0099§\u001f¹¥»+·Æ5CûÍùWÈÑì[Îåíoùéåsõýë\u0007õ\u0081ù9\r¼þ2ý¨½.ó¤ø\u001aõ\u0090í\u0016ù\u008c÷\u0002¶øú~êôîj²àþfúÜòR®ÈâNáÄñºí0ñ¶ï,ý¢ñ\u0018¥\u009eË\u0014ý\u008aÿ\u0000Î\u0086ê|ðòÓhÇîÛdÃÚÝPÃÖÏÑ\nTÄÚÆ@÷ÆÓLæòØx×þÄ\u0093ó\u0016=\u0098?\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u009d¸#\u0095©\u0097/\u008cµ\u0085;\u0099Á\u0099G\u0098Í\u0096S\u0080\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u009d·#\u0093©\u008a/\u008cµ\u0092;\u0098Á\u0090G\u0086\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u009d©#\u009f©\u0088/\u008dµ\u0092;\u0085Á\u0081G¸Í\u009aS\u0081Ù\u0085_\u0095å\u0081k\u008bñ\u009f\u0094q\u0011¿\u009f½\u0005\u008c\u0083¨\t\u008d·¥=»»¥!¦¯²\"Å§\u000b)\t³85\u001c¿+\u0001\u0007\u008b\r\r\u0019\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u009d©#\u009f©\u0088/\u008dµ\u0092;\u0085Á\u00810\u009bµf;v¡@'p\u00adw\u0013M\u0099`\u001f} +%Ö«Æ1÷·Õ=Ã\u0083Õ\tÝ\u008fò\u0015Ú\u009bÙaÍç×mÍóÇyôÿÒEÐËÖQÀ×Î]Ä#Ã\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u0098\u009d©#\u009f©\u008a/\u0088µ\u0098;\u0098Á\u0086G\u0091Í±S\u009bÙ\u0095_¹å\u008b,\u009c©a'q½G;c±R\u000fd\u0085q\u0003s\u0099c\u0017cí}kjáK\u007f{õosjÉ`G|Ý`[rÑY¯u\u009a±\u001fL\u0091\\\u000bj\u008dN\u0007\u007f¹I3\\µ^/N¡N[PÝGWlÉICWÅT\u007f\\ñKkHíSgR\u0019R\u0093j\u0015L\u008f]\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u0098\u009d©#\u009f©\u008a/\u0088µ\u0098;\u0098Á\u0086G\u0091Í¡S\u0097Ù\u009f_\u0094å\u008ak\u009cñ\u0084w\u0082ý\u008c\u0083§\t\u0088\u008f\u0098a\u009fäbjrðDv`üQBgÈrNpÔ`Z` ~&i¬Y2o¸g>l\u0084r\nd\u0090|\u0016z\u009ctâPhdî~t{úr@xh\"íßcÏùü\u007fÜõØKÞÁÉGÑÝÆSå©Ù/Õ¥Ó;Ø±õ7Ñ\u008dÙ\u0003ù\u0099Í\u001fØ\u0095ÛëÊaßçÙ}áóÖIÓÏÕEÉÛÊQô×Ä-è£ú9õ¿êÉ2LÏÂßXéÞÍTüêÊ`ßæÝ|ÍòÍ\bÓ\u008eÄ\u0004ç\u009aÃ\u0010×\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u0098\u009d©#\u009f©\u008a/\u0088µ\u0098;\u0098Á\u0086G\u0091Í£S\u0080Ù\u0098_\u0093å\u008ak¾ñ\u0082w\u0085ý\u0085\u0083\u009e ñ%\f«\u001c1*·\u000e=>\u0083\u0005\t\u0015\u008f\u000b\u00152\u009b\fa\fç\u0016m0ó1y.ÿ\"U\u0004Ðù^éÄßBûÈËvðüàzþàÕnñ\u0094Â\u0012î\u0098à\u0006ô¬H)µ§¥=\u0093»·1\u0087\u008f¼\u0005¬\u0083²\u0019\u0088\u0097¬m¸ë\u0088a¹ÿ©uªó¶I®Ç¦]±\u0000i\u0085\u008c\u000b¿\u0091\u0099\u0017¯\u009d\u0092#\u0080©\u009c/±µ\u0099;\u0082Á\u0090G\u0086Í\u0080S\u0086Ù\u0098_\u0084å\u0086k\u008fñ\u0081w\u00adý\u008f\u009eÚ\u001b4\u0095\"\u000f%\u00891\u0003'½\u00177\u0002±\u0007++¥;_/Ù%S\fÍ*G+Á={9õ%o-é\u0018c3\u001d=\u00971\u00116\u008b;\u0005-¿\u00119<³*a\u009eäpjfðavuücBSÈFN@ÔrZn k&|¬z2`¸~>^\u0084w\na\u0090f\u0016x\u009cuâr\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u008c\u009d\u0088#»©\u009d/ªµ\u0092;\u0087Á\u0080G\u0091Í\u0080S\u0086É\u0080L}ÂmXXÞrTxêT`pæy|\u007f^¹ÛDUTÏsIPÃL}G÷BqvëFeA\u009fE\u0019^\u0000g\u0085\u009a\u000b\u008a\u0091®\u0017\u0090\u009d\u0094#\u008e©¬/\u008dµ\u009e;\u0092\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u008c\u009d\u0088#»©\u009d/¾µ\u0098;\u0084Á\u0098G\u0095Í\u0087\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u0098\u009d·#\u0095©\u0098/\u009cµ\u0092;\u0084þF{»õ«o\u009dé¹c\u008cÝ²W½Ñ®".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1191);
        f882 = cArr;
        f883 = 1286376246626059775L;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static String m946() {
        int i10 = f880 + 9;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        String appKey = AdRegistration.getAppKey();
        int i12 = f881 + 63;
        f880 = i12 % 128;
        int i13 = i12 % 2;
        return appKey;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static DTBFetchFactory m950() {
        int i10 = f880 + 3;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        DTBFetchFactory dTBFetchFactory = DTBFetchFactory.getInstance();
        int i12 = f881 + 21;
        f880 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 5 : '(') != 5) {
            return dTBFetchFactory;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static List<DTBAdSize> m952(DTBAdResponse dTBAdResponse) {
        int i10 = f880 + 61;
        f881 = i10 % 128;
        if ((i10 % 2 != 0 ? 'c' : 'H') == 'c') {
            dTBAdResponse.getDTBAds();
            throw null;
        }
        List<DTBAdSize> dTBAds = dTBAdResponse.getDTBAds();
        int i11 = f881 + 1;
        f880 = i11 % 128;
        if ((i11 % 2 != 0 ? '`' : 'c') == '`') {
            return dTBAds;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ DTBAdView m953(ApsAd apsAd) {
        int i10 = f880 + 67;
        f881 = i10 % 128;
        if ((i10 % 2 != 0 ? ',' : (char) 14) != ',') {
            return m949(apsAd);
        }
        m949(apsAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ ApsAdRequest m956(ApsAd apsAd) {
        int i10 = f881 + 125;
        f880 = i10 % 128;
        int i11 = i10 % 2;
        ApsAdRequest apsAdRequestM951 = m951(apsAd);
        int i12 = f881 + 17;
        f880 = i12 % 128;
        int i13 = i12 % 2;
        return apsAdRequestM951;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m961(DTBAdResponse dTBAdResponse) {
        int i10 = f881 + 39;
        f880 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        String crid = dTBAdResponse.getCrid();
        if (!z10) {
            int i11 = 55 / 0;
        }
        int i12 = f880 + 43;
        f881 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return crid;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ List m964(DTBAdResponse dTBAdResponse) {
        int i10 = f880 + 1;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        List<DTBAdSize> listM952 = m952(dTBAdResponse);
        int i12 = f880 + 39;
        f881 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return listM952;
        }
        int i13 = 39 / 0;
        return listM952;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ Map m967(DTBAdResponse dTBAdResponse) {
        int i10 = f880 + 107;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        Map<String, String> mapM944 = m944(dTBAdResponse);
        int i12 = f881 + 29;
        f880 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 23 : (char) 19) != 23) {
            return mapM944;
        }
        int i13 = 35 / 0;
        return mapM944;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ ApsAdFormat m968(ApsAd apsAd) {
        int i10 = f880 + 7;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        ApsAdFormat apsAdFormatM945 = m945(apsAd);
        int i12 = f880 + 5;
        f881 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return apsAdFormatM945;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m971(ApsAd apsAd) {
        int i10 = f881 + 107;
        f880 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'Z' : (char) 20;
        String strM960 = m960(apsAd);
        if (c10 == 'Z') {
            int i11 = 47 / 0;
        }
        return strM960;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ ApsAdRequest m974(ApsAd apsAd) {
        int i10 = f880 + 53;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        ApsAdRequest apsAdRequestM965 = m965(apsAd);
        int i12 = f880 + 15;
        f881 = i12 % 128;
        int i13 = i12 % 2;
        return apsAdRequestM965;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Bundle m978(DTBAdResponse dTBAdResponse) {
        int i10 = f880 + 37;
        f881 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        Bundle bundleM948 = m948(dTBAdResponse);
        if (z10) {
            int i11 = 34 / 0;
        }
        return bundleM948;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ a m984(bm bmVar, HashMap map, ch chVar) {
        int i10 = f880 + 115;
        f881 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        a aVarM979 = bmVar.m979((HashMap<String, DTBFetchManager>) map, chVar);
        if (z10) {
            int i11 = 77 / 0;
        }
        int i12 = f881 + 27;
        f880 = i12 % 128;
        int i13 = i12 % 2;
        return aVarM979;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static String m943(ApsAd apsAd) {
        int i10 = f880 + 91;
        f881 = i10 % 128;
        if (i10 % 2 == 0) {
            return apsAd.getSlotUuid();
        }
        apsAd.getSlotUuid();
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static Map<String, String> m944(DTBAdResponse dTBAdResponse) {
        int i10 = f880 + 9;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        Map<String, String> defaultVideoAdsRequestCustomParams = dTBAdResponse.getDefaultVideoAdsRequestCustomParams();
        int i12 = f880 + 99;
        f881 = i12 % 128;
        if ((i12 % 2 != 0 ? '*' : (char) 17) != '*') {
            return defaultVideoAdsRequestCustomParams;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static HashMap<String, Object> m947(DTBAdResponse dTBAdResponse) {
        int i10 = f881 + 119;
        f880 = i10 % 128;
        int i11 = i10 % 2;
        HashMap<String, Object> renderingMap = dTBAdResponse.getRenderingMap();
        int i12 = f880 + 9;
        f881 = i12 % 128;
        int i13 = i12 % 2;
        return renderingMap;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static Bundle m948(DTBAdResponse dTBAdResponse) {
        int i10 = f880 + 69;
        f881 = i10 % 128;
        if (i10 % 2 == 0) {
            return dTBAdResponse.getRenderingBundle();
        }
        dTBAdResponse.getRenderingBundle();
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static ApsAdRequest m951(ApsAd apsAd) {
        int i10 = f880 + 1;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        ApsAdRequest adLoader = apsAd.getAdLoader();
        int i12 = f880 + 53;
        f881 = i12 % 128;
        int i13 = i12 % 2;
        return adLoader;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m954() {
        int i10 = f880 + 7;
        f881 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 25 : 'Z') == 'Z') {
            return m946();
        }
        m946();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ DTBFetchFactory m957() {
        int i10 = f880 + 81;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        DTBFetchFactory dTBFetchFactoryM950 = m950();
        int i12 = f880 + 27;
        f881 = i12 % 128;
        int i13 = i12 % 2;
        return dTBFetchFactoryM950;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static JSONObject m962(DTBAdSize dTBAdSize) {
        int i10 = f880 + 57;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject pubSettings = dTBAdSize.getPubSettings();
        int i12 = f881 + 87;
        f880 = i12 % 128;
        int i13 = i12 % 2;
        return pubSettings;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m963(ApsAd apsAd) {
        int i10 = f880 + 77;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        String bidInfo = apsAd.getBidInfo();
        int i12 = f880 + 25;
        f881 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return bidInfo;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static AdType m966(DTBAdSize dTBAdSize) {
        int i10 = f881 + 71;
        f880 = i10 % 128;
        int i11 = i10 % 2;
        AdType dTBAdType = dTBAdSize.getDTBAdType();
        int i12 = f880 + 31;
        f881 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 2 : 'C') != 2) {
            return dTBAdType;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ AdType m969(DTBAdSize dTBAdSize) {
        int i10 = f881 + 125;
        f880 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '>' : '\\';
        AdType adTypeM966 = m966(dTBAdSize);
        if (c10 != '\\') {
            int i11 = 8 / 0;
        }
        return adTypeM966;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m972(DTBAdResponse dTBAdResponse) {
        int i10 = f881 + 45;
        f880 = i10 % 128;
        int i11 = i10 % 2;
        String strM958 = m958(dTBAdResponse);
        int i12 = f880 + 19;
        f881 = i12 % 128;
        if ((i12 % 2 != 0 ? 'H' : 'X') == 'X') {
            return strM958;
        }
        int i13 = 5 / 0;
        return strM958;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m975(DTBAdResponse dTBAdResponse) {
        int i10 = f880 + 73;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        String strM961 = m961(dTBAdResponse);
        int i12 = f881 + 17;
        f880 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return strM961;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m981(ApsAd apsAd) {
        int i10 = f881 + 99;
        f880 = i10 % 128;
        int i11 = i10 % 2;
        String strM963 = m963(apsAd);
        int i12 = f881 + 3;
        f880 = i12 % 128;
        if (i12 % 2 != 0) {
            return strM963;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ c m985(bm bmVar, ThreadPoolExecutor threadPoolExecutor, ch chVar) {
        int i10 = f880 + 9;
        f881 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 23 : 'R') != 23) {
            return bmVar.m986(threadPoolExecutor, chVar);
        }
        bmVar.m986(threadPoolExecutor, chVar);
        throw null;
    }

    public bm(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static ApsAdFormat m945(ApsAd apsAd) {
        int i10 = f881 + 107;
        f880 = i10 % 128;
        int i11 = i10 % 2;
        ApsAdFormat apsAdFormat = apsAd.getApsAdFormat();
        int i12 = f881 + 41;
        f880 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 14 : '%') == '%') {
            return apsAdFormat;
        }
        int i13 = 23 / 0;
        return apsAdFormat;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static DTBAdView m949(ApsAd apsAd) {
        int i10 = f881 + 35;
        f880 = i10 % 128;
        if ((i10 % 2 == 0 ? '=' : 'T') != '=') {
            return apsAd.getAdView();
        }
        apsAd.getAdView();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m955(DTBAdResponse dTBAdResponse) {
        int i10 = f880 + 99;
        f881 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            dTBAdResponse.getImpressionUrl();
            throw null;
        }
        String impressionUrl = dTBAdResponse.getImpressionUrl();
        int i11 = f880 + 63;
        f881 = i11 % 128;
        if (i11 % 2 == 0) {
            return impressionUrl;
        }
        int i12 = 92 / 0;
        return impressionUrl;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m958(DTBAdResponse dTBAdResponse) {
        int i10 = f881 + 17;
        f880 = i10 % 128;
        int i11 = i10 % 2;
        String bidId = dTBAdResponse.getBidId();
        int i12 = f881 + 13;
        f880 = i12 % 128;
        int i13 = i12 % 2;
        return bidId;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m960(ApsAd apsAd) {
        int i10 = f881 + 113;
        f880 = i10 % 128;
        int i11 = i10 % 2;
        String pricePoint = apsAd.getPricePoint();
        int i12 = f880 + 11;
        f881 = i12 % 128;
        int i13 = i12 % 2;
        return pricePoint;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static ApsAdRequest m965(ApsAd apsAd) {
        int i10 = f880 + 71;
        f881 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '@' : '^';
        ApsAdRequest apsAdRequest = apsAd.getApsAdRequest();
        if (c10 != '^') {
            int i11 = 38 / 0;
        }
        int i12 = f881 + 17;
        f880 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return apsAdRequest;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ HashMap m970(DTBAdResponse dTBAdResponse) {
        int i10 = f880 + 9;
        f881 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '$' : '\r';
        HashMap<String, Object> mapM947 = m947(dTBAdResponse);
        if (c10 == '$') {
            int i11 = 54 / 0;
        }
        return mapM947;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m973(DTBAdSize dTBAdSize) {
        int i10 = f881 + 55;
        f880 = i10 % 128;
        int i11 = i10 % 2;
        String strM989 = m989(dTBAdSize);
        int i12 = f880 + 79;
        f881 = i12 % 128;
        int i13 = i12 % 2;
        return strM989;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m977(DTBAdSize dTBAdSize) {
        int i10 = f881 + 119;
        f880 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return m959(dTBAdSize);
        }
        m959(dTBAdSize);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m982(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        int i10 = f880 + 117;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        String strM976 = m976(dTBAdResponse, dTBAdSize);
        int i12 = f881 + 95;
        f880 = i12 % 128;
        int i13 = i12 % 2;
        return strM976;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m987(ApsAd apsAd) {
        int i10 = f881 + 33;
        f880 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return m943(apsAd);
        }
        m943(apsAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean m959(DTBAdSize dTBAdSize) {
        int i10 = f881 + 125;
        f880 = i10 % 128;
        int i11 = i10 % 2;
        boolean zIsInterstitialAd = dTBAdSize.isInterstitialAd();
        int i12 = f880 + 71;
        f881 = i12 % 128;
        if ((i12 % 2 != 0 ? 'I' : 'J') == 'J') {
            return zIsInterstitialAd;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m976(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        int i10 = f881 + 1;
        f880 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        String pricePoints = dTBAdResponse.getPricePoints(dTBAdSize);
        if (z10) {
            int i11 = 10 / 0;
        }
        int i12 = f881 + 21;
        f880 = i12 % 128;
        if (i12 % 2 != 0) {
            return pricePoints;
        }
        int i13 = 37 / 0;
        return pricePoints;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m983(DTBAdSize dTBAdSize) {
        int i10 = f881 + 125;
        f880 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return m962(dTBAdSize);
        }
        m962(dTBAdSize);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m988(DTBAdResponse dTBAdResponse) {
        int i10 = f880 + 81;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        String strM955 = m955(dTBAdResponse);
        int i12 = f881 + 3;
        f880 = i12 % 128;
        int i13 = i12 % 2;
        return strM955;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        map.put(m980((ViewConfiguration.getKeyRepeatDelay() >> 16) + 753, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 12540), 9 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m954();
            }
        });
        map.put(m980(762 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (41036 - (KeyEvent.getMaxKeyCode() >> 16)), 24 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m957();
            }
        });
        map.put(m980(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 786, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m972((DTBAdResponse) list.get(0));
            }
        });
        map.put(m980(803 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (11515 - View.MeasureSpec.getMode(0)), 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m975((DTBAdResponse) list.get(0));
            }
        });
        map.put(m980(826 - Color.argb(0, 0, 0, 0), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 39638), View.MeasureSpec.getSize(0) + 26).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m988((DTBAdResponse) list.get(0));
            }
        });
        map.put(m980((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 851, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.resolveSize(0, 0) + 25).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m970((DTBAdResponse) list.get(0));
            }
        });
        map.put(m980(876 - TextUtils.lastIndexOf("", '0'), (char) (TextUtils.indexOf("", "", 0, 0) + 25080), 27 - TextUtils.lastIndexOf("", '0', 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.23
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m978((DTBAdResponse) list.get(0));
            }
        });
        map.put(m980(905 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (26693 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 37 - ExpandableListView.getPackedPositionType(0L)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.22
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m967((DTBAdResponse) list.get(0));
            }
        });
        map.put(m980((ViewConfiguration.getWindowTouchSlop() >> 8) + 942, (char) (TextUtils.indexOf((CharSequence) "", '0') + 51542), 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.21
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m964((DTBAdResponse) list.get(0));
            }
        });
        map.put(m980(959 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), Color.alpha(0) + 23).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m982((DTBAdResponse) list.get(0), (DTBAdSize) list.get(1));
            }
        });
        map.put(m980(KeyEvent.keyCodeFromString("") + 981, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 41110), Drawable.resolveOpacity(0, 0) + 17).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m973((DTBAdSize) list.get(0));
            }
        });
        map.put(m980(999 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (21859 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m969((DTBAdSize) list.get(0));
            }
        });
        map.put(m980(1013 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (44079 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 20).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m983((DTBAdSize) list.get(0));
            }
        });
        map.put(m980((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1032, (char) (Process.myPid() >> 22), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return Boolean.valueOf(bm.m977((DTBAdSize) list.get(0)));
            }
        });
        map.put(m980(Process.getGidForName("") + IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, (char) (40633 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 30).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m984(bm.this, (HashMap) list.get(0), chVar);
            }
        });
        map.put(m980(TextUtils.lastIndexOf("", '0') + 1086, (char) (TextUtils.indexOf("", "", 0) + 25085), 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m985(bm.this, (ThreadPoolExecutor) list.get(0), chVar);
            }
        });
        map.put(m980(1108 - Drawable.resolveOpacity(0, 0), (char) Color.red(0), 14 - TextUtils.indexOf((CharSequence) "", '0')).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m974((ApsAd) list.get(0));
            }
        });
        map.put(m980((ViewConfiguration.getTouchSlop() >> 8) + 1123, (char) (51687 - View.combineMeasuredStates(0, 0)), 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m981((ApsAd) list.get(0));
            }
        });
        map.put(m980(1133 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (24286 - ExpandableListView.getPackedPositionType(0L)), ((Process.getThreadPriority(0) + 20) >> 6) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m971((ApsAd) list.get(0));
            }
        });
        map.put(m980(1146 - Color.blue(0), (char) View.combineMeasuredStates(0, 0), 11 - TextUtils.indexOf("", "")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m987((ApsAd) list.get(0));
            }
        });
        map.put(m980((ViewConfiguration.getTouchSlop() >> 8) + 1157, (char) ((-1) - MotionEvent.axisFromString("")), 13 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m968((ApsAd) list.get(0));
            }
        });
        map.put(m980(1171 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m956((ApsAd) list.get(0));
            }
        });
        map.put(m980(View.getDefaultSize(0, 0) + 1182, (char) (65058 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bm.m953((ApsAd) list.get(0));
            }
        });
        int i10 = f880 + 13;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        Matcher matcher = Pattern.compile(m980(Color.red(0), (char) Color.red(0), (-16777203) - Color.rgb(0, 0, 0)).intern()).matcher(mo819());
        if (!matcher.matches()) {
            return null;
        }
        int i10 = f880 + 21;
        f881 = i10 % 128;
        String strGroup = !(i10 % 2 == 0) ? matcher.group(0) : matcher.group(1);
        int i11 = f881 + 59;
        f880 = i11 % 128;
        if (i11 % 2 != 0) {
            return strGroup;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private a m979(HashMap<String, DTBFetchManager> map, ch chVar) {
        a aVar = new a(map, chVar);
        int i10 = f881 + 65;
        f880 = i10 % 128;
        int i11 = i10 % 2;
        return aVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final String mo819() {
        int i10 = f881 + 23;
        f880 = i10 % 128;
        if ((i10 % 2 == 0 ? 'Q' : (char) 15) == 'Q') {
            AdRegistration.getVersion();
            throw null;
        }
        String version = AdRegistration.getVersion();
        int i11 = f880 + 75;
        f881 = i11 % 128;
        int i12 = i11 % 2;
        return version;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m980(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f882[i10 + i12]) ^ (((long) i12) * f883)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:174:0x0706  */
    /* JADX WARN: Code duplicated, block: B:35:0x0177 A[PHI: r4
  0x0177: PHI (r4v32 char) = (r4v2 char), (r4v0 char) binds: [B:168:0x06cb, B:34:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        byte b10;
        char c10 = 23;
        byte b11 = 1;
        switch (str.hashCode()) {
            case -2137858584:
                if (!str.equals(m980((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 203, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29), 10 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                    b11 = -1;
                } else {
                    int i10 = f880 + 29;
                    f881 = i10 % 128;
                    int i11 = i10 % 2;
                    b11 = 8;
                }
                break;
            case -2133119933:
                c10 = '!';
                if (!str.equals(m980(673 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    b11 = -1;
                } else {
                    int i12 = f880 + 105;
                    f881 = i12 % 128;
                    if (i12 % 2 == 0) {
                        b10 = 34;
                        b11 = b10;
                    } else {
                        b11 = c10;
                    }
                }
                break;
            case -1987686071:
                if (!str.equals(m980(482 - View.combineMeasuredStates(0, 0), (char) (MotionEvent.axisFromString("") + 30149), 13 - Color.argb(0, 0, 0, 0)).intern())) {
                    b11 = -1;
                } else {
                    b11 = 24;
                }
                break;
            case -1885106463:
                if (!str.equals(m980(27 - (Process.myPid() >> 22), (char) View.getDefaultSize(0, 0), 11 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    b11 = -1;
                } else {
                    int i13 = f881 + 57;
                    f880 = i13 % 128;
                    int i14 = i13 % 2;
                }
                break;
            case -1879113962:
                if ((str.equals(m980(280 - View.getDefaultSize(0, 0), (char) (24169 - Gravity.getAbsoluteGravity(0, 0)), 9 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? 'L' : '?') == '?') {
                    b11 = -1;
                } else {
                    b11 = 13;
                }
                break;
            case -1879025222:
                if (!str.equals(m980(240 - Drawable.resolveOpacity(0, 0), (char) (23180 - AndroidCharacter.getMirror('0')), 10 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    b11 = -1;
                } else {
                    int i15 = f881 + 115;
                    f880 = i15 % 128;
                    b11 = (i15 % 2 == 0 ? (byte) 0 : (byte) 1) == 0 ? (byte) 105 : (byte) 11;
                }
                break;
            case -1554728876:
                if ((str.equals(m980(93 - Process.getGidForName(""), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), View.combineMeasuredStates(0, 0) + 45).intern()) ? (byte) 0 : (byte) 1) == 0) {
                    b11 = 4;
                } else {
                    b11 = -1;
                }
                break;
            case -1464660218:
                if (!str.equals(m980(395 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    b11 = -1;
                } else {
                    b11 = 20;
                }
                break;
            case -1358954558:
                if (!str.equals(m980((Process.myPid() >> 22) + 311, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 50987), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15).intern())) {
                    b11 = -1;
                } else {
                    b11 = 15;
                }
                break;
            case -1293925587:
                if (!str.equals(m980(71 - TextUtils.indexOf("", "", 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 23 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    b11 = -1;
                } else {
                    b11 = 3;
                }
                break;
            case -1291566264:
                if (!str.equals(m980((ViewConfiguration.getEdgeSlop() >> 16) + 741, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 12).intern())) {
                    b11 = -1;
                } else {
                    b11 = 39;
                }
                break;
            case -1092884085:
                if ((str.equals(m980(153 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ('0' - AndroidCharacter.getMirror('0')), ImageFormat.getBitsPerPixel(0) + 36).intern()) ? ':' : (char) 14) == 14) {
                    b11 = -1;
                } else {
                    b11 = 6;
                }
                break;
            case -1090060454:
                if (!str.equals(m980(216 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) Color.green(0), 11 - ImageFormat.getBitsPerPixel(0)).intern())) {
                    b11 = -1;
                } else {
                    b11 = 9;
                }
                break;
            case -832298225:
                if (!str.equals(m980(495 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 16).intern())) {
                    b11 = -1;
                } else {
                    b11 = 25;
                }
                break;
            case -791598050:
                if (!str.equals(m980((KeyEvent.getMaxKeyCode() >> 16) + 721, (char) (TextUtils.indexOf("", "", 0, 0) + 37936), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10).intern())) {
                    b11 = -1;
                } else {
                    int i16 = f881 + 7;
                    f880 = i16 % 128;
                    b11 = i16 % 2 != 0 ? (byte) 37 : (byte) 122;
                }
                break;
            case -723985259:
                if ((str.equals(m980(341 - Color.red(0), (char) (ExpandableListView.getPackedPositionGroup(0L) + 27155), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11).intern()) ? (byte) 0 : (byte) 1) == 0) {
                    b11 = 17;
                } else {
                    b11 = -1;
                }
                break;
            case -696695160:
                if (!str.equals(m980((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 38, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 33 - (Process.myTid() >> 22)).intern())) {
                    b11 = -1;
                } else {
                    b11 = 2;
                }
                break;
            case -694845532:
                if ((str.equals(m980(Color.alpha(0) + 139, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 13 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()) ? (byte) 1 : (byte) 0) == 0) {
                    b11 = -1;
                } else {
                    b11 = 5;
                }
                break;
            case -466918522:
                if ((str.equals(m980(371 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (46109 - View.resolveSize(0, 0)), 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern()) ? '^' : '@') == '^') {
                    b11 = 19;
                } else {
                    b11 = -1;
                }
                break;
            case -341719851:
                if (!str.equals(m980(352 - View.resolveSize(0, 0), (char) View.MeasureSpec.getMode(0), 19 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                    b11 = -1;
                } else {
                    int i17 = f880 + 75;
                    f881 = i17 % 128;
                    b10 = i17 % 2 != 0 ? (byte) 118 : (byte) 18;
                    b11 = b10;
                }
                break;
            case -300800492:
                if (!str.equals(m980(TextUtils.getOffsetAfter("", 0) + 511, (char) Color.blue(0), Color.alpha(0) + 17).intern())) {
                    b11 = -1;
                } else {
                    int i18 = f881 + 89;
                    f880 = i18 % 128;
                    b11 = i18 % 2 != 0 ? (byte) 26 : (byte) 127;
                }
                break;
            case -197992833:
                if (!str.equals(m980((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 528, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25729), 23 - Color.red(0)).intern())) {
                    b11 = -1;
                } else {
                    b11 = 27;
                }
                break;
            case -27446238:
                if (!str.equals(m980(TextUtils.getOffsetBefore("", 0) + 436, (char) (50345 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 21 - TextUtils.getOffsetAfter("", 0)).intern())) {
                    b11 = -1;
                } else {
                    b11 = 22;
                }
                break;
            case 66052:
                if (!str.equals(m980(665 - View.combineMeasuredStates(0, 0), (char) (37810 - TextUtils.indexOf("", "")), KeyEvent.normalizeMetaState(0) + 3).intern())) {
                    b11 = -1;
                } else {
                    b11 = 32;
                }
                break;
            case 63478087:
                if (!str.equals(m980(Drawable.resolveOpacity(0, 0) + 668, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5).intern())) {
                    b11 = -1;
                } else {
                    b11 = 33;
                }
                break;
            case 355568411:
                if (!str.equals(m980((ViewConfiguration.getDoubleTapTimeout() >> 16) + 688, (char) (Process.myTid() >> 22), TextUtils.getOffsetBefore("", 0) + 13).intern())) {
                    b11 = -1;
                } else {
                    b11 = 35;
                }
                break;
            case 568188517:
                if (!str.equals(m980(Gravity.getAbsoluteGravity(0, 0) + 326, (char) (40365 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 15 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    b11 = -1;
                } else {
                    b11 = 16;
                }
                break;
            case 620798166:
                if (!str.equals(m980((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 227, (char) (TextUtils.indexOf((CharSequence) "", '0') + 47763), 13 - Color.argb(0, 0, 0, 0)).intern())) {
                    b11 = -1;
                } else {
                    b11 = 10;
                }
                break;
            case 788901082:
                if (!str.equals(m980(View.resolveSize(0, 0) + TypedValues.CycleType.TYPE_WAVE_PERIOD, (char) (TextUtils.indexOf("", "", 0, 0) + 55766), 13 - TextUtils.indexOf("", "")).intern())) {
                    b11 = -1;
                } else {
                    b11 = 21;
                }
                break;
            case 1036908700:
                if ((str.equals(m980(14 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 3874), 14 - TextUtils.indexOf("", "", 0)).intern()) ? (byte) 0 : (byte) 1) == 0) {
                    b11 = 0;
                } else {
                    b11 = -1;
                }
                break;
            case 1251356764:
                if (!str.equals(m980((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 614, (char) (14702 - View.getDefaultSize(0, 0)), 41 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    b11 = -1;
                } else {
                    int i19 = f880 + 13;
                    f881 = i19 % 128;
                    int i20 = i19 % 2;
                    b11 = 30;
                }
                break;
            case 1306698049:
                if (!str.equals(m980(ExpandableListView.getPackedPositionType(0L) + 187, (char) (34883 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), ((Process.getThreadPriority(0) + 20) >> 6) + 17).intern())) {
                    b11 = -1;
                } else {
                    int i21 = f881 + 51;
                    f880 = i21 % 128;
                    int i22 = i21 % 2;
                    b11 = 7;
                }
                break;
            case 1328085269:
                if (!str.equals(m980(((Process.getThreadPriority(0) + 20) >> 6) + 457, (char) Color.red(0), TextUtils.indexOf("", "", 0) + 25).intern())) {
                    b11 = -1;
                } else {
                    b11 = c10;
                }
                break;
            case 1340383521:
                if ((str.equals(m980((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 732, (char) (8836 - (Process.myPid() >> 22)), 9 - Color.alpha(0)).intern()) ? ']' : 'a') == ']') {
                    b11 = 38;
                } else {
                    b11 = -1;
                }
                break;
            case 1340427404:
                if (!str.equals(m980(TextUtils.lastIndexOf("", '0', 0) + 657, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 53579), 9 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b11 = -1;
                } else {
                    b11 = 31;
                }
                break;
            case 1600627740:
                if (!str.equals(m980((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 700, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 19 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                    b11 = -1;
                } else {
                    int i23 = f880 + 53;
                    f881 = i23 % 128;
                    int i24 = i23 % 2;
                    b11 = 36;
                }
                break;
            case 1648408950:
                if (!str.equals(m980(602 - View.resolveSizeAndState(0, 0, 0), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 50804), (Process.myTid() >> 22) + 13).intern())) {
                    b11 = -1;
                } else {
                    b11 = 29;
                }
                break;
            case 1713728997:
                if (!str.equals(m980(ExpandableListView.getPackedPositionChild(0L) + 552, (char) (AndroidCharacter.getMirror('0') - '0'), Color.red(0) + 51).intern())) {
                    b11 = -1;
                } else {
                    b11 = 28;
                }
                break;
            case 2019413793:
                if (!str.equals(m980(249 - (KeyEvent.getMaxKeyCode() >> 16), (char) (Color.argb(0, 0, 0, 0) + 32830), (ViewConfiguration.getWindowTouchSlop() >> 8) + 31).intern())) {
                    b11 = -1;
                } else {
                    b11 = 12;
                }
                break;
            case 2144664800:
                if (str.equals(m980((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 289, (char) (ViewConfiguration.getTapTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 22).intern())) {
                    b11 = 14;
                } else {
                    b11 = -1;
                }
                break;
            default:
                b11 = -1;
                break;
        }
        switch (b11) {
            case 0:
                return AdRegistration.class;
            case 1:
            case 2:
                return DTBActivity.class;
            case 3:
            case 4:
                return DTBInterstitialActivity.class;
            case 5:
            case 6:
                return DTBAdActivity.class;
            case 7:
                return DTBAdInterstitial.class;
            case 8:
                return DTBAdLoader.class;
            case 9:
                return DTBAdRequest.class;
            case 10:
                return DTBAdResponse.class;
            case 11:
            case 12:
                return DTBAdView.class;
            case 13:
                return DTBAdSize.class;
            case 14:
                return DTBAdViewSupportClient.class;
            case 15:
                return DTBFetchFactory.class;
            case 16:
                return DTBFetchManager.class;
            case 17:
                return DTBRenderer.class;
            case 18:
                return DTBAdBannerListener.class;
            case 19:
                return DTBAdBaseBannerListener.class;
            case 20:
                return DTBAdBaseInterstitialListener.class;
            case 21:
                return DTBAdCallback.class;
            case 22:
                return DTBAdExpandedListener.class;
            case 23:
                return DTBAdInterstitialListener.class;
            case 24:
                return DTBAdListener.class;
            case 25:
                return a.class;
            case 26:
                return c.class;
            case 27:
            case 28:
                return ApsInterstitialActivity.class;
            case 29:
            case 30:
                return ApsAdActivity.class;
            case 31:
                return ApsAdView.class;
            case 32:
                return Aps.class;
            case 33:
                return ApsAd.class;
            case 34:
                return ApsAdController.class;
            case 35:
                return ApsAdListener.class;
            case 36:
                return ApsAdRequestListener.class;
            case 37:
                return ApsAdFormat.class;
            case 38:
                return ApsAdType.class;
            case 39:
                return ApsAdRequest.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m989(DTBAdSize dTBAdSize) {
        int i10 = f880 + 95;
        f881 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            dTBAdSize.getSlotUUID();
            throw null;
        }
        String slotUUID = dTBAdSize.getSlotUUID();
        int i11 = f880 + 25;
        f881 = i11 % 128;
        if ((i11 % 2 != 0 ? '\t' : '<') == '<') {
            return slotUUID;
        }
        int i12 = 4 / 0;
        return slotUUID;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private c m986(ThreadPoolExecutor threadPoolExecutor, ch chVar) {
        c cVar = new c(threadPoolExecutor, chVar);
        int i10 = f881 + 105;
        f880 = i10 % 128;
        int i11 = i10 % 2;
        return cVar;
    }
}
