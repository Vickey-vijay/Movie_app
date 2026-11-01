package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.protobuf.ByteString;
import com.ironsource.G5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.WebRequestEvent;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import io.bidmachine.protobuf.EventTypeExtended;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ce extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1265 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1266 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1267;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1268;

    public class a extends WebViewApp implements hg<WebViewApp> {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f1284 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f1288 = 1;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private ch f1292;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private WebViewApp f1293;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char[] f1289 = {15750, 10963, 4989, 31666, 24612, 18615, 45516, 40513, 34457, 61246, 55289, 15567, 9568, 3486, 31268, 25277, 19395, 45127, 39071, 33028, 59793, 54989, 16234, 10228, 3100, 29882, 6738, 3335, 13481, 23654, 18416, 28515, 38424, 47509, 41293, 51434, 61485, 6913, 674, 10857, 24002, 17774, 27700, 38818, 48971, 42732, 52838, 61719, 6331, '!', 11209, 37047, 34786, 48716, 54915, 52501, 58758, 7421, 13168, 11176, 16911, 31432, 37354, 34897, 41135, 55061, 53132, 59122, 7521, 13751, 11296, 17563, 59920, 64837, 50411, 44068, 47026, 40737, 26202, 18903, 20751, 14504, 'o', 60249, 62198, 55816, 44466, 46379, 40021, 26566, 20240, 22151, 15932, 37286, 34547, 48989, 55186, 52228, 58519, 7660, 12897, 10937, 17182, 31705, 37103, 35136, 41406, 54800, 52887, 59375, 7232, 13478, 11571, 17800, 31472, 37706, 35780, 41008, 55441, 61929, 'W', 5890, 11948, 18019, 24053, 30054, 35869, 41872, 47944, 53999, 59944, 286, 6321, 12373, 18374, 24396, 30214, 36274, 42320, 48337, 52421, 56208, 57918, 35569, 37223, 47604, 16527, 28418, 30682, 7805, 9914, 52638, 54306, 64717, 35699, 37882, 47758, 16681, 27086, 28758, 6397, 10122, 56354, 52087, 62169, 39446, 33152, 43283, 20584, 32741, 26429, 3738, 13917, 56682, 50372, 60451, 39864, 33546, 43616, 20961, 31018, 24764, 2069, 14180, 57038, 50775, 60854};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f1290 = 8513197706427635559L;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static long f1286 = 2082429000782378280L;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f1287 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static char f1285 = 0;

        public a(WebViewApp webViewApp, ch chVar) {
            this.f1293 = webViewApp;
            this.f1292 = chVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m1508(int i10, char c10, int i11) {
            String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1653) {
                char[] cArr = new char[i11];
                com.ironsource.adqualitysdk.sdk.i.d.f1652 = 0;
                while (true) {
                    int i12 = com.ironsource.adqualitysdk.sdk.i.d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1289[i10 + i12]) ^ (((long) i12) * f1290)) ^ ((long) c10));
                        com.ironsource.adqualitysdk.sdk.i.d.f1652 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            }
            return str;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m1509(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1286) ^ ((long) f1287)) ^ ((long) f1285));
                        j.f2675 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            }
            return str4;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private WebViewApp m1510() {
            int i10 = f1284 + 109;
            int i11 = i10 % 128;
            f1288 = i11;
            int i12 = i10 % 2;
            WebViewApp webViewApp = this.f1293;
            int i13 = i11 + 105;
            f1284 = i13 % 128;
            int i14 = i13 % 2;
            return webViewApp;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void addCallback(NativeCallback nativeCallback) {
            int i10 = f1288 + 81;
            f1284 = i10 % 128;
            int i11 = i10 % 2;
            ce.this.m818(this, this.f1292, m1508(140 - Gravity.getAbsoluteGravity(0, 0), (char) (52370 - Color.argb(0, 0, 0, 0)), 22 - Gravity.getAbsoluteGravity(0, 0)).intern(), nativeCallback);
            WebViewApp webViewApp = this.f1293;
            if ((webViewApp != null ? '=' : 'I') == '=') {
                webViewApp.addCallback(nativeCallback);
            }
            int i12 = f1284 + 13;
            f1288 = i12 % 128;
            if ((i12 % 2 == 0 ? '7' : (char) 16) == 16) {
            } else {
                throw null;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public NativeCallback getCallback(String str) {
            int i10 = f1284 + 69;
            f1288 = i10 % 128;
            int i11 = i10 % 2;
            ce.this.m818(this, this.f1292, m1509("ۥ霥吤륄쓦럷蚄쎪쩒쒃ﾗﰓȹ愰볼\ud961ꓩ㖍㔞⳰멃ഡ", (char) (ViewConfiguration.getScrollBarSize() >> 8), "\uf528鶚䘤᳦", TextUtils.indexOf("", "", 0, 0), "䨒춰燙偏").intern(), str);
            WebViewApp webViewApp = this.f1293;
            if (webViewApp != null) {
                return webViewApp.getCallback(str);
            }
            int i12 = f1284 + 41;
            f1288 = i12 % 128;
            int i13 = i12 % 2;
            return null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public Configuration getConfiguration() {
            int i10 = f1284 + 81;
            f1288 = i10 % 128;
            int i11 = i10 % 2;
            ce.this.m818(this, this.f1292, m1509("횓\ud942ꇳ雍\ua9dc암뮐㒷醿葾湶퇕誗텆퇄憝\ue27e劸벃憸╃㷟\uf0b2ᎁ\uf1c1䪚땲", (char) (10947 - View.MeasureSpec.getSize(0)), "\uf528鶚䘤᳦", ((byte) KeyEvent.getModifierMetaStateMask()) + 1688992788, "ፃ\uabfc썤\udb2a").intern(), new Object[0]);
            WebViewApp webViewApp = this.f1293;
            if ((webViewApp != null ? '5' : '_') != '5') {
                return null;
            }
            int i12 = f1288 + 61;
            f1284 = i12 % 128;
            int i13 = i12 % 2;
            Configuration configuration = webViewApp.getConfiguration();
            int i14 = f1284 + 29;
            f1288 = i14 % 128;
            int i15 = i14 % 2;
            return configuration;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public ErrorState getErrorStateFromWebAppCode() {
            int i10 = f1284 + 7;
            f1288 = i10 % 128;
            int i11 = i10 % 2;
            ce.this.m818(this, this.f1292, m1509("흏최宋鳄Զ㏐弮굤렞\uf64b⦕隰\ue685ઠ\udeca澴䟚\uec4a翳撓\fﰜ⍕⍜ྈ拋핱ቴ楇랆\ue2cf⹋ﱆ뒚㝱봨䌚褭", (char) TextUtils.getCapsMode("", 0, 0), "\uf528鶚䘤᳦", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, "ﮍగ运ᴘ").intern(), new Object[0]);
            WebViewApp webViewApp = this.f1293;
            if (!(webViewApp != null)) {
                return null;
            }
            ErrorState errorStateFromWebAppCode = webViewApp.getErrorStateFromWebAppCode();
            int i12 = f1288 + 17;
            f1284 = i12 % 128;
            int i13 = i12 % 2;
            return errorStateFromWebAppCode;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public int getWebAppFailureCode() {
            int i10 = f1284 + 35;
            f1288 = i10 % 128;
            int i11 = i10 % 2;
            ce.this.m818(this, this.f1292, m1509("縌ㄣ㢷硷쮈ч槧㞄従⓽뉛㊓ꊌ\ufde7㘆廳웗⪪㮤Ꮸ搰\ue6ab⇀뻉澩䐢᭗蚠↦뙫膏", (char) (Color.green(0) + 43124), "\uf528鶚䘤᳦", ((byte) KeyEvent.getModifierMetaStateMask()) - 1777875429, "ᨄ߆璖誨").intern(), new Object[0]);
            WebViewApp webViewApp = this.f1293;
            if ((webViewApp != null ? '8' : (char) 0) == 0) {
                return 0;
            }
            int i12 = f1288 + 11;
            f1284 = i12 % 128;
            if ((i12 % 2 != 0 ? G5.T : '\f') == '\f') {
                return webViewApp.getWebAppFailureCode();
            }
            webViewApp.getWebAppFailureCode();
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public String getWebAppFailureMessage() {
            int i10 = f1284 + 113;
            f1288 = i10 % 128;
            int i11 = i10 % 2;
            ce.this.m818(this, this.f1292, m1509("뛋瀪秸찐킋᠋튖ˎ츭ᐯ\ue67d\ue1fd鞸ⰾ蕞鈊\uf4f2\uf799Šើ坈㊞풓\uea30롓㎈뮜\udffb梼鶤탶\ue868늬炒", (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), "\uf528鶚䘤᳦", 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\ude6eꇑ\ue2f4鼞").intern(), new Object[0]);
            WebViewApp webViewApp = this.f1293;
            if (webViewApp == null) {
                return null;
            }
            int i12 = f1288 + 21;
            f1284 = i12 % 128;
            char c10 = i12 % 2 != 0 ? '\b' : (char) 23;
            String webAppFailureMessage = webViewApp.getWebAppFailureMessage();
            if (c10 == '\b') {
                int i13 = 85 / 0;
            }
            return webAppFailureMessage;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public WebView getWebView() {
            int i10 = f1284 + 123;
            f1288 = i10 % 128;
            int i11 = i10 % 2;
            ce.this.m818(this, this.f1292, m1508((Process.myTid() >> 22) + 51, (char) (37088 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1293;
            if ((webViewApp != null ? 'B' : '`') != '`') {
                return webViewApp.getWebView();
            }
            int i12 = f1288 + 19;
            f1284 = i12 % 128;
            if ((i12 % 2 != 0 ? 'K' : '\r') == '\r') {
                return null;
            }
            throw null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean invokeCallback(Invocation invocation) {
            int i10 = f1284 + 7;
            f1288 = i10 % 128;
            int i11 = i10 % 2;
            ce.this.m818(this, this.f1292, m1509("\u2d97ᢉ낛쯰ꞟ餞\uab6c\ue9b7塁蜨吧쏑ᣬ嬴奸꺧铑崼朢茅햩閤̫鹴覲", (char) KeyEvent.getDeadChar(0, 0), "\uf528鶚䘤᳦", 526339778 - ((byte) KeyEvent.getModifierMetaStateMask()), "쌦彎餟뜞").intern(), invocation);
            WebViewApp webViewApp = this.f1293;
            if ((webViewApp != null ? '\t' : (char) 21) != 21) {
                return webViewApp.invokeCallback(invocation);
            }
            int i12 = f1284 + 79;
            f1288 = i12 % 128;
            if ((i12 % 2 == 0 ? 'Y' : (char) 15) != 'Y') {
                return false;
            }
            int i13 = 46 / 0;
            return false;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp, com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
        public boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
            int i10 = f1284 + 83;
            f1288 = i10 % 128;
            int i11 = i10 % 2;
            ce.this.m818(this, this.f1292, m1509("\udb02ꓞꮜ祎Ṩ㖌\uf809쏔痞ᐛ뾣\ud9e7淋ꑪ㬓엦韡햔뗔\ua7f1쳩웦暢", (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), "\uf528鶚䘤᳦", 1947390416 - TextUtils.getOffsetBefore("", 0), "탿ዑ扴\uea5b").intern(), str, str2, method, Arrays.asList(objArr));
            WebViewApp webViewApp = this.f1293;
            if (!(webViewApp != null)) {
                return false;
            }
            int i12 = f1284 + 71;
            f1288 = i12 % 128;
            int i13 = i12 % 2;
            boolean zInvokeMethod = webViewApp.invokeMethod(str, str2, method, objArr);
            int i14 = f1284 + 11;
            f1288 = i14 % 128;
            int i15 = i14 % 2;
            return zInvokeMethod;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
        
            if ((r11.f1293 != null) != true) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
        
            r0 = com.ironsource.adqualitysdk.sdk.i.ce.a.f1288 + 47;
            com.ironsource.adqualitysdk.sdk.i.ce.a.f1284 = r0 % 128;
            r0 = r0 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
        
            r0 = r11.f1293.isWebAppInitialized();
            r1 = com.ironsource.adqualitysdk.sdk.i.ce.a.f1288 + 113;
            com.ironsource.adqualitysdk.sdk.i.ce.a.f1284 = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
        
            if ((r11.f1293 != null ? 'Y' : ' ') != 'Y') goto L15;
         */
        @Override // com.unity3d.services.core.webview.WebViewApp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean isWebAppInitialized() {
            /*
                r11 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.ce.a.f1284
                int r0 = r0 + 53
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.ce.a.f1288 = r1
                int r0 = r0 % 2
                java.lang.String r1 = "鴩ͬ㡙ւ"
                r2 = 0
                java.lang.String r4 = "\uf528鶚䘤᳦"
                r5 = 33336(0x8238, float:4.6714E-41)
                java.lang.String r6 = "ㄫ감弋︯ꇕ̜褮༹ᆔ漟\ue157\uf5c3\udd44\uf1f2욮㵗殒绀◚⥞邮\u0b52\uda04䛩㡞︗㓸\u1ada屯薵"
                r7 = 1
                r8 = 0
                if (r0 != 0) goto L41
                com.ironsource.adqualitysdk.sdk.i.ce r0 = com.ironsource.adqualitysdk.sdk.i.ce.this
                com.ironsource.adqualitysdk.sdk.i.ch r9 = r11.f1292
                int r7 = android.view.View.combineMeasuredStates(r7, r8)
                int r5 = r5 >>> r7
                char r5 = (char) r5
                int r2 = android.widget.ExpandableListView.getPackedPositionGroup(r2)
                java.lang.String r1 = m1509(r6, r5, r4, r2, r1)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r2 = new java.lang.Object[r8]
                r0.m818(r11, r9, r1, r2)
                com.unity3d.services.core.webview.WebViewApp r0 = r11.f1293
                r1 = 89
                if (r0 == 0) goto L3c
                r0 = r1
                goto L3e
            L3c:
                r0 = 32
            L3e:
                if (r0 == r1) goto L70
                goto L65
            L41:
                com.ironsource.adqualitysdk.sdk.i.ce r0 = com.ironsource.adqualitysdk.sdk.i.ce.this
                com.ironsource.adqualitysdk.sdk.i.ch r9 = r11.f1292
                int r10 = android.view.View.combineMeasuredStates(r8, r8)
                int r10 = r10 + r5
                char r5 = (char) r10
                int r2 = android.widget.ExpandableListView.getPackedPositionGroup(r2)
                java.lang.String r1 = m1509(r6, r5, r4, r2, r1)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r2 = new java.lang.Object[r8]
                r0.m818(r11, r9, r1, r2)
                com.unity3d.services.core.webview.WebViewApp r0 = r11.f1293
                if (r0 == 0) goto L62
                r0 = r7
                goto L63
            L62:
                r0 = r8
            L63:
                if (r0 == r7) goto L70
            L65:
                int r0 = com.ironsource.adqualitysdk.sdk.i.ce.a.f1288
                int r0 = r0 + 47
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.ce.a.f1284 = r1
                int r0 = r0 % 2
                return r8
            L70:
                com.unity3d.services.core.webview.WebViewApp r0 = r11.f1293
                boolean r0 = r0.isWebAppInitialized()
                int r1 = com.ironsource.adqualitysdk.sdk.i.ce.a.f1288
                int r1 = r1 + 113
                int r2 = r1 % 128
                com.ironsource.adqualitysdk.sdk.i.ce.a.f1284 = r2
                int r1 = r1 % 2
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ce.a.isWebAppInitialized():boolean");
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean isWebAppLoaded() {
            int i10 = f1284 + 11;
            f1288 = i10 % 128;
            int i11 = i10 % 2;
            ce.this.m818(this, this.f1292, m1508(26 - KeyEvent.getDeadChar(0, 0), (char) (ImageFormat.getBitsPerPixel(0) + 6662), 25 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), new Object[0]);
            WebViewApp webViewApp = this.f1293;
            if (!(webViewApp != null)) {
                return false;
            }
            int i12 = f1284 + 3;
            f1288 = i12 % 128;
            int i13 = i12 % 2;
            boolean zIsWebAppLoaded = webViewApp.isWebAppLoaded();
            int i14 = f1288 + 17;
            f1284 = i14 % 128;
            int i15 = i14 % 2;
            return zIsWebAppLoaded;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void removeCallback(NativeCallback nativeCallback) {
            int i10 = f1284 + 7;
            f1288 = i10 % 128;
            int i11 = i10 % 2;
            ce.this.m818(this, this.f1292, m1508(TextUtils.indexOf("", "", 0, 0) + 162, (char) (56436 - TextUtils.indexOf((CharSequence) "", '0')), 25 - View.getDefaultSize(0, 0)).intern(), nativeCallback);
            WebViewApp webViewApp = this.f1293;
            if ((webViewApp != null ? 'N' : (char) 31) != 'N') {
                return;
            }
            webViewApp.removeCallback(nativeCallback);
            int i12 = f1284 + 29;
            f1288 = i12 % 128;
            int i13 = i12 % 2;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void resetWebViewAppInitialization() {
            ce.this.m818(this, this.f1292, m1509("八㉇䥖珨笿ܖꠜ┘ጱ䯄忺푏禌陶賞梬陂넌制礭楻㮽誴\ueb21뜦\ue4ae礿鄵捈\u09b5\ue9e6㙱㾣뗖䮛ꜵ酫\uf40b\ud872诏", (char) (Color.rgb(0, 0, 0) + 16822550), "\uf528鶚䘤᳦", ViewConfiguration.getEdgeSlop() >> 16, "번腛ᘲ钱").intern(), new Object[0]);
            WebViewApp webViewApp = this.f1293;
            if (!(webViewApp == null)) {
                int i10 = f1288 + 113;
                f1284 = i10 % 128;
                int i11 = i10 % 2;
                webViewApp.resetWebViewAppInitialization();
                if (i11 != 0) {
                    throw null;
                }
            }
            int i12 = f1288 + 123;
            f1284 = i12 % 128;
            if ((i12 % 2 != 0 ? (char) 11 : (char) 1) == 1) {
            } else {
                throw null;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean sendEvent(Enum r10, Enum r11, Object... objArr) {
            int i10 = f1288 + 65;
            f1284 = i10 % 128;
            int i11 = i10 % 2;
            ce.this.m818(this, this.f1292, m1508((ViewConfiguration.getFadingEdgeLength() >> 16) + 120, (char) (Process.myTid() >> 22), 20 - View.MeasureSpec.getSize(0)).intern(), r10, r11, Arrays.asList(objArr));
            WebViewApp webViewApp = this.f1293;
            if ((webViewApp != null ? 'a' : '%') != 'a') {
                return false;
            }
            int i12 = f1284 + 65;
            f1288 = i12 % 128;
            int i13 = i12 % 2;
            boolean zSendEvent = webViewApp.sendEvent(r10, r11, objArr);
            int i14 = f1288 + 81;
            f1284 = i14 % 128;
            int i15 = i14 % 2;
            return zSendEvent;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setConfiguration(Configuration configuration) {
            int i10 = f1288 + 21;
            f1284 = i10 % 128;
            int i11 = i10 % 2;
            ce.this.m818(this, this.f1292, m1508((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 92, (char) (37361 - (Process.myTid() >> 22)), (ViewConfiguration.getPressedStateDuration() >> 16) + 27).intern(), configuration);
            WebViewApp webViewApp = this.f1293;
            if ((webViewApp == null ? (char) 5 : '\\') != 5) {
                int i12 = f1284 + 79;
                f1288 = i12 % 128;
                int i13 = i12 % 2;
                webViewApp.setConfiguration(configuration);
                int i14 = f1284 + 3;
                f1288 = i14 % 128;
                int i15 = i14 % 2;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppFailureCode(int i10) {
            int i11 = f1288 + 123;
            f1284 = i11 % 128;
            int i12 = i11 % 2;
            ce.this.m818(this, this.f1292, m1509("ꖍ숖儃乍﹦ᅦ鱾岞䮠쓃\ue180눸정鈶㹮\ud8e2퇚꿆⬙ꛚ\uf889淍\uf2d2쮌奐\ue558\udd21쩈\uf3b6熷\ua7e0", (char) (24958 - (ViewConfiguration.getEdgeSlop() >> 16)), "\uf528鶚䘤᳦", (-960206802) - (Process.myTid() >> 22), "⸈쑨细捡").intern(), Integer.valueOf(i10));
            WebViewApp webViewApp = this.f1293;
            if (!(webViewApp != null)) {
                return;
            }
            int i13 = f1284 + 95;
            f1288 = i13 % 128;
            boolean z10 = i13 % 2 != 0;
            webViewApp.setWebAppFailureCode(i10);
            if (!z10) {
                int i14 = 52 / 0;
            }
            int i15 = f1284 + 59;
            f1288 = i15 % 128;
            int i16 = i15 % 2;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppFailureMessage(String str) {
            ce.this.m818(this, this.f1292, m1509("퍍띓䜟\ue942쿝\ue232帽\uf6ba\uf65d\u0cf5㭫때쾈戙浘粡镀쓆唐䲬\udc15쒮횽㿰쏿\uea2eᎾ瓼ꕳه痞᩶쯕㭳", (char) (ViewConfiguration.getFadingEdgeLength() >> 16), "\uf528鶚䘤᳦", (-1) - TextUtils.lastIndexOf("", '0'), "\u12bf﹀ۮힲ").intern(), str);
            WebViewApp webViewApp = this.f1293;
            if (!(webViewApp == null)) {
                int i10 = f1288 + 17;
                f1284 = i10 % 128;
                int i11 = i10 % 2;
                webViewApp.setWebAppFailureMessage(str);
                int i12 = f1288 + 59;
                f1284 = i12 % 128;
                int i13 = i12 % 2;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppInitialized(boolean z10) {
            int i10 = f1284 + 29;
            f1288 = i10 % 128;
            int i11 = i10 % 2;
            ce.this.m818(this, this.f1292, m1509("耀당嶫\ud955ꕣ\ue64b\uec2c\u20c5鴸䥧䶕⭔焔\uf6d0ᢖ놚䨃㐾읽ཛ쪇\ud808綀䭟佲\udb32ⶠ㘄\u1759駸⁺", (char) (56155 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "\uf528鶚䘤᳦", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 550039125, "吥죮嬠䏛").intern(), Boolean.valueOf(z10));
            WebViewApp webViewApp = this.f1293;
            if ((webViewApp != null ? '>' : '`') != '`') {
                int i12 = f1288 + 81;
                f1284 = i12 % 128;
                boolean z11 = i12 % 2 != 0;
                webViewApp.setWebAppInitialized(z10);
                if (!z11) {
                    return;
                }
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppLoaded(boolean z10) {
            int i10 = f1284 + 67;
            f1288 = i10 % 128;
            int i11 = i10 % 2;
            ce.this.m818(this, this.f1292, m1508(ViewConfiguration.getScrollDefaultDelay() >> 16, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 15825), 26 - KeyEvent.normalizeMetaState(0)).intern(), Boolean.valueOf(z10));
            WebViewApp webViewApp = this.f1293;
            if (!(webViewApp == null)) {
                int i12 = f1284 + 21;
                f1288 = i12 % 128;
                int i13 = i12 % 2;
                webViewApp.setWebAppLoaded(z10);
            }
            int i14 = f1288 + 117;
            f1284 = i14 % 128;
            if ((i14 % 2 != 0 ? ';' : (char) 11) != ';') {
            } else {
                throw null;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebView(WebView webView) {
            int i10 = f1288 + 7;
            f1284 = i10 % 128;
            int i11 = i10 % 2;
            ce.this.m818(this, this.f1292, m1508(72 - TextUtils.getTrimmedLength(""), (char) (59974 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), View.resolveSizeAndState(0, 0, 0) + 21).intern(), webView);
            WebViewApp webViewApp = this.f1293;
            if ((webViewApp != null ? '\r' : '`') != '`') {
                int i12 = f1284 + 1;
                f1288 = i12 % 128;
                char c10 = i12 % 2 == 0 ? (char) 2 : 'a';
                webViewApp.setWebView(webView);
                if (c10 == 2) {
                    int i13 = 88 / 0;
                }
                int i14 = f1288 + 49;
                f1284 = i14 % 128;
                int i15 = i14 % 2;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ WebViewApp mo742() {
            int i10 = f1284 + 89;
            f1288 = i10 % 128;
            if (i10 % 2 != 0) {
                return m1510();
            }
            m1510();
            throw null;
        }
    }

    public static class d extends bd {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f1294 = 0;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f1295 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f1296 = 1149251818;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static short[] f1297 = null;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static byte[] f1298 = {-32, -19, 126, -124, 108, -122, 110, -118, -101, 70, -124, 116, -110, 106, -100, 13, -58, -52, -76, -50, -74, -46, -29, -114, -52, -68, -38, -78, -28, -44, 123, -52, -68, -70, -46, -60, -12, 124, -48, -60, -12, 124, -49, -61, -69, -76, -59, -50, -77, 6, -117, -14, 123, -58, -52, -68, -70, 8, -126, -65, -51, -23, 115, 93, 116, 69, 110, 88, 97, 110, -128, 6, 87, 65, 88, 41, 82, 60, 69, 82, 100, 89, 0, 70, 82, 60, 69, 82, 68, 121, 0, 83, 71, 63, 56, 73, 82, 55, -118, 15, 118, -1, 74, 80, 64, 62, -116, 6, 67, 81};

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f1299 = -390470819;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f1300 = 33;

        @Override // com.ironsource.adqualitysdk.sdk.i.bd
        /* JADX INFO: renamed from: ﻐ */
        public final Map<String, bd.b> mo736() {
            HashMap map = new HashMap();
            int i10 = f1294 + 103;
            f1295 = i10 % 128;
            if ((i10 % 2 == 0 ? (char) 0 : (char) 26) != 0) {
                return map;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m1511(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (o.f2993) {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1300;
                int i14 = i12 + i13;
                boolean z10 = i14 == -1;
                if (z10) {
                    byte[] bArr = f1298;
                    i14 = bArr != null ? (byte) (bArr[f1296 + i10] + i13) : (short) (f1297[f1296 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f2994 = ((i10 + i14) - 2) + f1296 + (z10 ? 1 : 0);
                    o.f2995 = b10;
                    char c10 = (char) (i11 + f1299);
                    o.f2997 = c10;
                    sb2.append(c10);
                    o.f2996 = o.f2997;
                    o.f2998 = 1;
                    while (o.f2998 < i14) {
                        byte[] bArr2 = f1298;
                        if (bArr2 != null) {
                            int i15 = o.f2994;
                            o.f2994 = i15 - 1;
                            o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                        } else {
                            short[] sArr = f1297;
                            int i16 = o.f2994;
                            o.f2994 = i16 - 1;
                            o.f2997 = (char) (o.f2996 + (((short) (sArr[i16] + s10)) ^ o.f2995));
                        }
                        sb2.append(o.f2997);
                        o.f2996 = o.f2997;
                        o.f2998++;
                    }
                }
                string = sb2.toString();
            }
            return string;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.bd
        /* JADX INFO: renamed from: ﾒ */
        public final Class mo738(String str) {
            byte b10 = -1;
            switch (str.hashCode()) {
                case 252148886:
                    if (str.equals(m1511((-1149251818) - TextUtils.lastIndexOf("", '0', 0, 0), (short) (Drawable.resolveOpacity(0, 0) + (-121)), 390470884 - Color.alpha(0), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (-34) - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                        int i10 = f1295 + 61;
                        f1294 = i10 % 128;
                        int i11 = i10 % 2;
                        b10 = 0;
                    }
                    break;
                case 961844241:
                    if (str.equals(m1511((-1149251757) - View.resolveSize(0, 0), (short) ((ViewConfiguration.getTouchSlop() >> 8) - 97), (ViewConfiguration.getJumpTapTimeout() >> 16) + 390470885, (byte) Color.green(0), (-34) - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                        int i12 = f1294 + 117;
                        f1295 = i12 % 128;
                        int i13 = i12 % 2;
                        b10 = 2;
                    }
                    break;
                case 1067215379:
                    if (str.equals(m1511(Color.rgb(0, 0, 0) - 1132474531, (short) ((-69) - (ViewConfiguration.getWindowTouchSlop() >> 8)), TextUtils.getCapsMode("", 0, 0) + 390470918, (byte) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) - 34).intern())) {
                        b10 = 3;
                    }
                    break;
                case 1531208100:
                    if (!(str.equals(m1511(TextUtils.getTrimmedLength("") + (-1149251803), (short) ((Process.myPid() >> 22) + 63), KeyEvent.keyCodeFromString("") + 390470918, (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0') + (-33)).intern()) ? false : true)) {
                        int i14 = f1294 + 89;
                        f1295 = i14 % 128;
                        int i15 = i14 % 2;
                        b10 = 1;
                    }
                    break;
            }
            if (b10 == 0 || b10 == 1) {
                return AdUnitActivity.class;
            }
            if (b10 == 2 || b10 == 3) {
                return BannerView.class;
            }
            return null;
        }

        public d(String str) {
            super(str);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.bd
        /* JADX INFO: renamed from: ﻛ */
        public final String mo737() {
            boolean z10;
            String version = UnityAds.getVersion();
            if (version != null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                int i10 = f1294 + 93;
                f1295 = i10 % 128;
                int i11 = i10 % 2;
                String str = version.split(m1511((ViewConfiguration.getTouchSlop() >> 8) - 1149251818, (short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 27), Color.argb(0, 0, 0, 0) + 390470864, (byte) KeyEvent.getDeadChar(0, 0), (-35) - ((byte) KeyEvent.getModifierMetaStateMask())).intern())[0];
                int i12 = f1295 + 125;
                f1294 = i12 % 128;
                int i13 = i12 % 2;
                return str;
            }
            return null;
        }
    }

    static {
        char[] cArr = new char[1265];
        ByteBuffer.wrap("/ð\u0000U\u0013j&a9xLi_Ur|\u0085o\u0098u«J¾AÑXäI÷u\n\\\u001dO\u0000U\u0013j&a9xLi_Ur|\u0085o\u0098i«q¾FÑEäD÷M\ny\u001dX03C\bV!i?|$\u008f1¢6µ9È\u0012\u0000U\u0013j&a9xLi_Ur|\u0085o\u0098i«q¾FÑEäD÷M\ny\u001dX03C\u0001V0i8|5\u008f:¢<µ9È\u0004Û(î\u0001\u0001\u001f\u0014\u0004'\u0011:\u0016M\u0019`ò:Ü)ã\u001cè\u0003ñvàeÜHõ¿æ¢þ\u0091È\u0084ÃëóÞÐÍØ0Æ'ô\n¹y½7\u0007$\u0015\u0011\f\u000e:{!h\u0011E\"²*¯\u0004\u009c6\u0089\u000bæ\u000fê\u008cùºÌ±Ó\u0085¦®µ¾\u0098¶o¢r\u0088A\u008bT¶;\u0081\u000e\u008e\u001d\u0081à\u0097iWzaOjPZ%y6q\u001boìYñVÂA×F¸X\u008ds\u009eUcLtYY'*+?:\u00005íhþWË\\ÔE¡T²d\u009fJhOuxFmS|<k\tl\u001a}çlðnÝ\u0013\u0000S\u0013l&g9{LQ_prT\u0085u\u0098S«P¾MÑBäU÷F\ny\u001dX0!C4V<i)|\"ÐÕÃçöíéî\u009cé\u008fï¢ËUüHÓ{ÜnÊ«Ì¸ó\u008dø\u0092áçðôÌÙå.ö3î\u0000Ø\u0015ÓzãOÀ\\È¡Ö\u0000W\u0013a&j9^Lu_erm\u0085y\u0098S«PËnØOíròM\u0087V\u0094O¹vNPS{`buq\u001aj/k<b°÷£Ð\u0096Ó\u0089×üÀïÓ\u0000U\u0013j&a9xLi_Vry\u0085r\u0098N«A¾ZÑ_\u0000U\u0013j&a9xLi_Vry\u0085r\u0098N«A¾ZÑ\u007fäY÷N\n]\u0000B\u0013e&f9bLu_frK\u0085t\u0098O«S§©´\u008e\u0081\u008d\u009e\u0089ë\u009eø\u008dÕ»\"\u009e?¯\fª\u0000B\u0013e&f9bLu_fr]\u0085j\u0098E«J¾\\\u0000B\u0013e&f9bLu_frT\u0085u\u0098S«P¾MÑBäU÷F.@=g\bd\u0017`bwqd\\i«S¶M\u0085B\u0090_ÿBÊWÙu$U3P\u001e$m/x-G;R ¡7\u008c.\u009b7æ\rõ\b\u0000B\u0013e&f9bLu_frH\u0085n\u0098O«T¾MÑ^äD÷]\n]\u001dO\u0000B\u0013e&f9bLu_frH\u0085s\u0098S«M¾\\ÑEä_÷Z\u0000B\u0013e&f9bLu_frO\u0085y\u0098B«t¾DÑMäI÷Q\nJ\u001d\u007f0/C*V<i-|9\u008f:¢=µ.\u008d\u000e\u009e)«*´.Á9Ò*ÿ\u0011\b\"\u0015\u001e&\u00073\u0016\\#i\u0013z\u001c\u0087\u0011\u0000B\u0013e&f9bLu_fr]\u0085n\u0098R«K¾ZÑeä^÷R\nW\u0000B\u0013e&f9bLu_frN\u0085u\u0098E«S\u0000c\u0013k&e9\"Le_zrq\u0085h\u0098Y«\u0017¾LÑ\u0002äC÷Q\nJ\u001dJ0)C'V-i?|~\u008f6¢9µ2È\u000eÛ\u0001î\u001a\u0001\u001f\u0014^'6:\u0019M\u0012`îsá\u0086ú\u0099Ú¬ù¿ñÒï$^7y\u0002z\u001d~hi{zVR¡i¼Y\u008fO\u009awõQÀOÓ@.A\u0000I\u0013Q&f9eLd_mrZ\u0085}\u0098N«J¾MÑ^ä|÷]\nK\u001dH0%C*V-i>{\u008ch«]¨B¬7»$¨\t\u0080þ»ã\u008bÐ\u009dÅ¯ª®\u009f\u0097\u008c\u0089q\u0082f\u0097Kà8ï-ô\u0000B\u0013e&f9bLu_frN\u0085u\u0098E«S¾dÑEäC÷@\n]\u001dR0%C6iVzqOrPv%a6r\u001bZìañQÂG×s¸T\u008d@ÝeÎmûcä$\u0091c\u0082|¯wXnE_v\u0011cJ\f\u00049E*W×LÀLí/\u009e!\u008b+´9¡xR0\u007f?h4\u0015\b\u0006\u00073\u001cÜ\u0019ÉXú\u0004ç\u0017\u0090\u001f½ñ®¬[ÌDëqøbü\u000fû8è%ðÖËÃËìÝMâ^ÕkÀtÄ\u0001Ç\u0012Ó?ÎÈÝÕáæîóÛ\u009cí©öºÆGõPý}\u0093\u000e¤\u001b\u0085$\u009b1\u0084Â\u009cï\u009dø\u0081\u0000c\u0013k&e9\"Le_zrq\u0085h\u0098Y«\u0017¾LÑ\u0002äQ÷P\nK\u001d\u00120!C V8i |1\u008f-¢=µ.ÈNÛ\"î\u001d\u0001\u0000\u0014\u001c'':\u001bM\u000e`åsá\u0086æ\u0099Û¬õ¿öÒÎåõøÅ\u000bÓ\u001eì1ÅDÃWÄjÔ}Ý\u0090¹ûæèÇÝàÂÉ·Ý¤Ö\u0089Ü~Ï\u0000A\u0013j&l9~L\u007f_}r|\u0085Z\u0098U«H¾DÑ_äS÷F\n]\u001dY0.C\u0013V-i.|\u0006\u008f=¢=µ+È!Û\u0000î8\u0001\u0000\u0014\u0011'\r:\u001dM\u000e*÷9È\fÃ\u0013ÚfËu÷XÞ¯Í²Î\u0081é\u0094ëûêÎÝÝæ î7÷\u001a\u008di\u0088|\u0099îUýjÈa×x¢i±U\u009c|kovbEEP[?I\n\u007f\u0019DäLóUÞ/\u00ad*¸;\u0000A\u0013`&N9cLb_yry\u0085h\u0000C\u0013h&a9iL~_`rH\u0085n\u0098O«T¾MÑ^äD÷]\n]\u001dO\u0000D\u0013m&i9kL~_{rk\u0085h\u0098I«G¾mÑZäU÷Z\nLõàæøÓÏÌÌ¹ÍªÄ\u0087ðpÑmú^ÞKé$ê\u0011î\u0002ÑÿøèæÅ\u009d¶\u0088£\u008f\u009c\u0080\u0089\u008b\u0000g\u0013a&|9OLe_frj\u0085y\u0098N«P¾\u007fÑIäR÷b\nQ\u001dY07C\u0005V8i<'\n4\u001f\u0001\u0004\u001e\u0004k\rx\u0018U%¢7¿\u001e\u008c(\u0099#ö\u0013Ã0Ð8-&:\u0014\u0017Yd]óøàêÕ÷ÊÄ¿î¬í\u0081ávòkÅXÛMô\"Â\u0017Ù\u0004éùÚîÒÃ¼°\u008e¥³\u009a·\u0000g\u0013a&|9KLq_yr}\u0085U\u0098D\u0000g\u0013a&|9YL~_}rl\u0085e\u0098a«@¾[Ñ`äY÷G\nL\u001dY0.C!V:\u009c«\u008f¹º¤¥\u0081Ð¦Ã¥î´\u0019½\u0004¹7\u0098\"\u0083M¸x\u0081k\u009f\u0096\u0094\u0081\u0081¬ößùÊâ\u0000a\u0013`&l9YL~_}rl\u0085e\u0098a«@¾[Ñ`äY÷G\nL\u001dY0.C!V:\u0000r\u0013a&e9cLf_qrM\u0085r\u0098I«P¾QÑmäT÷G\nt\u001dU03C0V-i\"|5\u008f&ÎßÝÙèÄ÷ã\u0082Í\u0091Î¼öKÍVýeëpÕ\u001fâ*í9âÄôÓÇþ\u0099\u008d\u0088\u0098\u0095§\u0093²\u0087A\u009el\u0099\u0010$\u0003\"6?)\u0018\\6O5b\t\u0095:\u0088\u0012»\u0012®\u000eÁ\u001cô\u0007ç2\u001a\r\r\u001a mSsý~îxÛeÄE±e¢l\u008fbx`eTVXC_,A\u0019`\nI\u0000g\u0013a&|9NLq_zrv\u0085y\u0098R«h¾AÑ_äD÷Q\nV\u001dY02\u0000s\u0013a&|9NLq_zrv\u0085y\u0098R«h¾AÑ_äD÷Q\nV\u001dY02\u0000g\u0013a&|9CL`_drw\u0085n\u0098T«Q¾FÑEäD÷M\nq\u001dX\u0000g\u0013a&|9\\L|_ur{\u0085y\u0098M«A¾FÑXäy÷P\n~\u001dN0/C)V\ti(|\u001f\u008f6¢2µ9È\u0003Û\u0010\u0000g\u0013a&|9@L\u007f_ur|\u0085S\u0098P«P¾AÑCä^÷Gµú¦ü\u0093á\u008cÕùìêýÇäDÍWËbÖ}á\bÛ\u001bÓ6×ÁÿÜîïÈúð\u0095é ÷³ÝNþYÿt\u008f\u0007\u0080\u0012\u0096-¶8\u0088Ë\u0091æ\u0082ñ\u0093\u008c¸\u009fºª«E£P©øÜëÚÞÇÁç´Ç§Î\u008aÀ}Â`öSúFý)ã\u001cÂ\u000fëòÅåõÈ\u0094»\u0092®·\u0091\u009e\u0084\u008aw\u0088Z\u008dM\u00880¨#«\u0016ºù´ì\u008eß¹Â¦µ©\u0098OL9_?j\"u\u0001\u0000:\u00138>/É,Ô\u0019ç.ò\u0017\u009d\u0015¨\u001d\u0000A\u0013@&]9BLY_@\u0000V\u0013M&L9IL__DrT\u0085]\u0098y«a¾z\u0000R\u0013A&Y9YLU_GrLÞYÍJøPçH\u0092W\u0081I¬V¥©¶¯\u0083¡\u009c®é¿C1P9e4z0\u000f'\u001c%1>Æ'Û\u0004è\u001fý\u000e\u0092\u0007\u0000S\u0013P&G9^LQ_Sr]Ç\u0089Ô\u009dá\u008cþ\u0086\u008b\u009f\u0098\u009cµ\u0092B\u0084_¿\u0000L\u0013M&N9ILS_Mr[\u0085P\u0098e\u0089\u001d\u009a\u0015¯\u001b°\u0002Å\u0002Ö\u000fû\u0012\f\u0007\u0000F\u0013E&A9@LU_P".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1265);
        f1267 = cArr;
        f1268 = -847298327511756028L;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static Object m1479() {
        int i10 = f1266 + 95;
        f1265 = i10 % 128;
        int i11 = i10 % 2;
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        int i12 = f1266 + 113;
        f1265 = i12 % 128;
        int i13 = i12 % 2;
        return currentApp;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1483(AdObject adObject) {
        int i10 = f1265 + 39;
        f1266 = i10 % 128;
        if (i10 % 2 == 0) {
            m1493(adObject);
            throw null;
        }
        String strM1493 = m1493(adObject);
        int i11 = f1266 + 105;
        f1265 = i11 % 128;
        if ((i11 % 2 != 0 ? '<' : '4') == '4') {
            return strM1493;
        }
        int i12 = 96 / 0;
        return strM1493;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ ByteString m1487(AdObject adObject) {
        int i10 = f1266 + 21;
        f1265 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        ByteString byteStringM1498 = m1498(adObject);
        if (!z10) {
            int i11 = 66 / 0;
        }
        int i12 = f1265 + 59;
        f1266 = i12 % 128;
        if ((i12 % 2 == 0 ? '.' : '2') != '.') {
            return byteStringM1498;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1494(BannerView bannerView) {
        int i10 = f1266 + 101;
        f1265 = i10 % 128;
        char c10 = i10 % 2 != 0 ? (char) 5 : (char) 21;
        String strM1503 = m1503(bannerView);
        if (c10 != 21) {
            int i11 = 73 / 0;
        }
        return strM1503;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1500(IUnityAdsListener iUnityAdsListener) {
        int i10 = f1265 + 33;
        f1266 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'M' : '\r';
        m1485(iUnityAdsListener);
        if (c10 != '\r') {
            int i11 = 12 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ UnityAdsLoadOptions m1502(AdObject adObject) {
        int i10 = f1266 + 45;
        f1265 = i10 % 128;
        int i11 = i10 % 2;
        UnityAdsLoadOptions unityAdsLoadOptionsM1477 = m1477(adObject);
        int i12 = f1266 + 103;
        f1265 = i12 % 128;
        int i13 = i12 % 2;
        return unityAdsLoadOptionsM1477;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static /* synthetic */ String m1473() {
        int i10 = f1265 + 35;
        f1266 = i10 % 128;
        int i11 = i10 % 2;
        String strM1474 = m1474();
        int i12 = f1266 + 99;
        f1265 = i12 % 128;
        int i13 = i12 % 2;
        return strM1474;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static String m1474() {
        int i10 = f1266 + 93;
        f1265 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 0 : '[') == '[') {
            return ClientProperties.getGameId();
        }
        int i11 = 96 / 0;
        return ClientProperties.getGameId();
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static /* synthetic */ Object m1475() {
        int i10 = f1265 + 13;
        f1266 = i10 % 128;
        int i11 = i10 % 2;
        Object objM1476 = m1476();
        int i12 = f1265 + 123;
        f1266 = i12 % 128;
        int i13 = i12 % 2;
        return objM1476;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static Object m1476() {
        int i10 = f1265 + 81;
        f1266 = i10 % 128;
        int i11 = i10 % 2;
        IUnityAdsListener listener = UnityAds.getListener();
        int i12 = f1265 + 61;
        f1266 = i12 % 128;
        if (i12 % 2 != 0) {
            return listener;
        }
        int i13 = 14 / 0;
        return listener;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static Enum m1478(String str) {
        byte b10 = -1;
        int iHashCode = str.hashCode();
        if (iHashCode == 183181625) {
            if ((str.equals(m1490(TextUtils.indexOf((CharSequence) "", '0', 0) + 1252, (char) (35165 - ExpandableListView.getPackedPositionChild(0L)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7).intern()) ? 'R' : 'Q') != 'Q') {
                int i10 = f1265 + 19;
                int i11 = i10 % 128;
                f1266 = i11;
                int i12 = i10 % 2;
                int i13 = i11 + 35;
                f1265 = i13 % 128;
                int i14 = i13 % 2;
                b10 = 0;
            }
        } else if (iHashCode == 2066319421) {
            if (str.equals(m1490(ExpandableListView.getPackedPositionGroup(0L) + 1259, (char) Color.red(0), MotionEvent.axisFromString("") + 7).intern())) {
                b10 = 1;
            }
        }
        if (b10 == 0) {
            return WebRequestEvent.COMPLETE;
        }
        if (b10 != 1) {
            return null;
        }
        return WebRequestEvent.FAILED;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static String m1480() {
        int i10 = f1265 + 79;
        f1266 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            ClientProperties.getGameId();
            throw null;
        }
        String gameId = ClientProperties.getGameId();
        int i11 = f1265 + 55;
        f1266 = i11 % 128;
        int i12 = i11 % 2;
        return gameId;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static void m1481(IUnityAdsListener iUnityAdsListener) {
        int i10 = f1266 + 25;
        f1265 = i10 % 128;
        int i11 = i10 % 2;
        UnityAds.removeListener(iUnityAdsListener);
        int i12 = f1265 + 47;
        f1266 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ BannerView.IListener m1488(BannerView bannerView) {
        int i10 = f1265 + 125;
        f1266 = i10 % 128;
        if ((i10 % 2 == 0 ? '\\' : (char) 17) == '\\') {
            m1482(bannerView);
            throw null;
        }
        BannerView.IListener iListenerM1482 = m1482(bannerView);
        int i11 = f1265 + 51;
        f1266 = i11 % 128;
        int i12 = i11 % 2;
        return iListenerM1482;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1495(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i10 = f1265 + 109;
        f1266 = i10 % 128;
        char c10 = i10 % 2 == 0 ? ',' : '\f';
        String strM1499 = m1499(diagnosticEvent);
        if (c10 != '\f') {
            int i11 = 68 / 0;
        }
        return strM1499;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1501(BannerView bannerView, BannerView.IListener iListener) {
        int i10 = f1266 + 123;
        f1265 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        m1497(bannerView, iListener);
        if (!z10) {
            throw null;
        }
        int i11 = f1266 + 29;
        f1265 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1505(UnityAdsLoadOptions unityAdsLoadOptions) {
        int i10 = f1265 + 63;
        f1266 = i10 % 128;
        if (i10 % 2 == 0) {
            m1484(unityAdsLoadOptions);
            throw null;
        }
        JSONObject jSONObjectM1484 = m1484(unityAdsLoadOptions);
        int i11 = f1265 + 41;
        f1266 = i11 % 128;
        if ((i11 % 2 == 0 ? (char) 16 : (char) 31) != 16) {
            return jSONObjectM1484;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        map.put(m1490(Color.red(0) + EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_LOSS_VALUE, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 19 - ExpandableListView.getPackedPositionChild(0L)).intern(), new bd.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return ce.m1479();
            }
        });
        map.put(m1490(826 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (10089 - View.MeasureSpec.getMode(0)), TextUtils.getOffsetAfter("", 0) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return ce.this.m1507(list.get(0), chVar);
            }
        });
        map.put(m1490(843 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (62347 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 20 - Color.green(0)).intern(), new bd.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                ce.m1486(list.get(0));
                return null;
            }
        });
        map.put(m1490(View.combineMeasuredStates(0, 0) + 863, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9).intern(), new bd.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return ce.m1480();
            }
        });
        map.put(m1490(872 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return ce.m1475();
            }
        });
        map.put(m1490(ExpandableListView.getPackedPositionType(0L) + 891, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 40151), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                ce.m1496((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m1490((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_PAID_VALUE, (char) Color.blue(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                ce.m1500((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m1490((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 929, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                ce.m1506((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m1490(951 - Gravity.getAbsoluteGravity(0, 0), (char) (52920 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 22).intern(), new bd.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return ce.m1489((String) list.get(0));
            }
        });
        map.put(m1490((-16776242) - Color.rgb(0, 0, 0), (char) (4163 - View.MeasureSpec.makeMeasureSpec(0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18).intern(), new bd.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return ce.m1478((String) list.get(0));
            }
        });
        map.put(m1490(Color.argb(0, 0, 0, 0) + 992, (char) (64793 - (ViewConfiguration.getPressedStateDuration() >> 16)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return ce.m1494((BannerView) list.get(0));
            }
        });
        map.put(m1490(View.getDefaultSize(0, 0) + 1006, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return ce.m1488((BannerView) list.get(0));
            }
        });
        map.put(m1490(TextUtils.getCapsMode("", 0, 0) + 1023, (char) (ViewConfiguration.getScrollBarSize() >> 8), 18 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                ce.m1501((BannerView) list.get(0), (BannerView.IListener) list.get(1));
                return null;
            }
        });
        map.put(m1490(KeyEvent.normalizeMetaState(0) + IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, (char) ExpandableListView.getPackedPositionType(0L), 16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return ce.m1487((AdObject) list.get(0));
            }
        });
        map.put(m1490(ImageFormat.getBitsPerPixel(0) + IronSourceError.ERROR_RV_EXPIRED_ADS, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 26).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return ce.m1483((AdObject) list.get(0));
            }
        });
        map.put(m1490(1082 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) TextUtils.getOffsetAfter("", 0), KeyEvent.getDeadChar(0, 0) + 14).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return ce.m1502((AdObject) list.get(0));
            }
        });
        map.put(m1490(1096 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (46493 - (ViewConfiguration.getScrollBarSize() >> 8)), 6 - ExpandableListView.getPackedPositionChild(0L)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return ce.m1505((UnityAdsLoadOptions) list.get(0));
            }
        });
        map.put(m1490((ViewConfiguration.getPressedStateDuration() >> 16) + 1103, (char) (TextUtils.indexOf((CharSequence) "", '0') + 17579), Gravity.getAbsoluteGravity(0, 0) + 29).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return ce.m1473();
            }
        });
        map.put(m1490((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1131, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 63675), 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return ce.m1495((DiagnosticEventRequestOuterClass.DiagnosticEvent) list.get(0));
            }
        });
        map.put(m1490(View.getDefaultSize(0, 0) + 1165, (char) (Drawable.resolveOpacity(0, 0) + 19550), View.resolveSizeAndState(0, 0, 0) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return ce.m1491((DiagnosticEventRequestOuterClass.DiagnosticEvent) list.get(0));
            }
        });
        int i10 = f1266 + 9;
        f1265 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return map;
        }
        int i11 = 28 / 0;
        return map;
    }

    public ce(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Map m1491(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i10 = f1266 + 51;
        f1265 = i10 % 128;
        int i11 = i10 % 2;
        Map mapM1504 = m1504(diagnosticEvent);
        int i12 = f1265 + 91;
        f1266 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return mapM1504;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1496(IUnityAdsListener iUnityAdsListener) {
        int i10 = f1266 + 41;
        f1265 = i10 % 128;
        int i11 = i10 % 2;
        m1492(iUnityAdsListener);
        int i12 = f1266 + 31;
        f1265 = i12 % 128;
        if ((i12 % 2 != 0 ? 'L' : (char) 31) != 'L') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ByteString m1498(AdObject adObject) {
        int i10 = f1266 + 49;
        f1265 = i10 % 128;
        if ((i10 % 2 != 0 ? ')' : 'b') != 'b') {
            adObject.getOpportunityId();
            throw null;
        }
        ByteString opportunityId = adObject.getOpportunityId();
        int i11 = f1265 + 59;
        f1266 = i11 % 128;
        int i12 = i11 % 2;
        return opportunityId;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1506(IUnityAdsListener iUnityAdsListener) {
        int i10 = f1266 + 87;
        f1265 = i10 % 128;
        int i11 = i10 % 2;
        m1481(iUnityAdsListener);
        int i12 = f1265 + 93;
        f1266 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1499(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i10 = f1265 + 9;
        f1266 = i10 % 128;
        int i11 = i10 % 2;
        String placementId = diagnosticEvent.getPlacementId();
        int i12 = f1265 + 95;
        f1266 = i12 % 128;
        if ((i12 % 2 == 0 ? '(' : 'Y') == 'Y') {
            return placementId;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        int i10 = f1266 + 57;
        f1265 = i10 % 128;
        int i11 = i10 % 2;
        String version = UnityAds.getVersion();
        if (!(version == null)) {
            int i12 = f1266 + 5;
            f1265 = i12 % 128;
            return (i12 % 2 != 0 ? '0' : '8') != '8' ? version.split(m1490(Color.blue(0), (char) (7564 - (AudioTrack.getMaxVolume() > 2.0f ? 1 : (AudioTrack.getMaxVolume() == 2.0f ? 0 : -1))), 1 - TextUtils.getTrimmedLength("")).intern())[1] : version.split(m1490(Color.blue(0), (char) (12254 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1 - TextUtils.getTrimmedLength("")).intern())[0];
        }
        int i13 = f1265 + 113;
        f1266 = i13 % 128;
        int i14 = i13 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m1507(Object obj, ch chVar) {
        a aVar = new a((WebViewApp) obj, chVar);
        int i10 = f1265 + 83;
        f1266 = i10 % 128;
        if ((i10 % 2 == 0 ? 'D' : '/') == '/') {
            return aVar;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:4:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
    
        if (r21.equals(m1490(android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 229, (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45237), android.view.View.resolveSizeAndState(0, 0, 0) + 6).intern()) != false) goto L185;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo738(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 2332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ce.mo738(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1497(BannerView bannerView, BannerView.IListener iListener) {
        int i10 = f1265 + 107;
        f1266 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'D' : '+';
        bannerView.setListener(iListener);
        if (c10 != '+') {
            int i11 = 11 / 0;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static UnityAdsLoadOptions m1477(AdObject adObject) {
        int i10 = f1265 + 115;
        f1266 = i10 % 128;
        char c10 = i10 % 2 == 0 ? (char) 27 : '\'';
        UnityAdsLoadOptions loadOptions = adObject.getLoadOptions();
        if (c10 != '\'') {
            int i11 = 12 / 0;
        }
        return loadOptions;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1493(AdObject adObject) {
        int i10 = f1265 + 33;
        f1266 = i10 % 128;
        int i11 = i10 % 2;
        String placementId = adObject.getPlacementId();
        int i12 = f1265 + 93;
        f1266 = i12 % 128;
        if ((i12 % 2 == 0 ? 'Q' : (char) 5) == 5) {
            return placementId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1492(IUnityAdsListener iUnityAdsListener) {
        int i10 = f1265 + 29;
        f1266 = i10 % 128;
        int i11 = i10 % 2;
        UnityAds.setListener(iUnityAdsListener);
        int i12 = f1265 + 67;
        f1266 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 27 : '^') != 27) {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0129  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Enum m1489(String str) {
        byte b10 = 6;
        switch (str.hashCode()) {
            case -1810696374:
                if (!str.equals(m1490(Color.alpha(0) + 1242, (char) TextUtils.getCapsMode("", 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f1265 + 59;
                    f1266 = i10 % 128;
                    b10 = i10 % 2 != 0 ? (byte) 8 : (byte) 96;
                }
                break;
            case -1166291365:
                if (!(str.equals(m1490(KeyEvent.keyCodeFromString("") + 1226, (char) ((-1) - MotionEvent.axisFromString("")), MotionEvent.axisFromString("") + 8).intern()))) {
                    b10 = -1;
                }
                break;
            case -276710660:
                b10 = !str.equals(m1490((ViewConfiguration.getTouchSlop() >> 8) + 1184, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11).intern()) ? (byte) -1 : (byte) 1;
                break;
            case -54373961:
                if ((str.equals(m1490(1214 - Color.argb(0, 0, 0, 0), (char) (17266 - Color.green(0)), 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern()) ? ')' : (char) 31) == ')') {
                    b10 = 5;
                } else {
                    b10 = -1;
                }
                break;
            case 63879010:
                if (str.equals(m1490((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1209, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 42473), Color.alpha(0) + 5).intern())) {
                    int i11 = f1265 + 43;
                    f1266 = i11 % 128;
                    int i12 = i11 % 2;
                    b10 = 4;
                } else {
                    b10 = -1;
                }
                break;
            case 1167718561:
                b10 = (str.equals(m1490(1233 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (51147 - TextUtils.getCapsMode("", 0, 0)), KeyEvent.getDeadChar(0, 0) + 9).intern()) ? 'U' : (char) 5) == 'U' ? (byte) 7 : (byte) -1;
                break;
            case 1813675631:
                b10 = !str.equals(m1490(1195 - (ViewConfiguration.getEdgeSlop() >> 16), (char) KeyEvent.getDeadChar(0, 0), 7 - TextUtils.getTrimmedLength("")).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 1815350732:
                if (!str.equals(m1490(1202 - TextUtils.indexOf("", "", 0), (char) (56842 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6).intern())) {
                    b10 = -1;
                } else {
                    int i13 = f1266 + 9;
                    f1265 = i13 % 128;
                    if (i13 % 2 == 0) {
                        b10 = 3;
                    } else {
                        b10 = 5;
                    }
                }
                break;
            case 1926303783:
                b10 = !str.equals(m1490((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1177, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 7 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 0;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return WebViewEventCategory.ADUNIT;
            case 1:
                return WebViewEventCategory.VIDEOPLAYER;
            case 2:
                return WebViewEventCategory.REQUEST;
            case 3:
                return WebViewEventCategory.RESOLVE;
            case 4:
                return WebViewEventCategory.CACHE;
            case 5:
                return WebViewEventCategory.CONNECTIVITY;
            case 6:
                return WebViewEventCategory.STORAGE;
            case 7:
                return WebViewEventCategory.BROADCAST;
            case 8:
                return WebViewEventCategory.LIFECYCLE;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1485(IUnityAdsListener iUnityAdsListener) {
        int i10 = f1265 + 95;
        f1266 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        UnityAds.addListener(iUnityAdsListener);
        if (!z10) {
            throw null;
        }
        int i11 = f1265 + 97;
        f1266 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1490(int i10, char c10, int i11) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1653) {
            char[] cArr = new char[i11];
            com.ironsource.adqualitysdk.sdk.i.d.f1652 = 0;
            while (true) {
                int i12 = com.ironsource.adqualitysdk.sdk.i.d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1267[i10 + i12]) ^ (((long) i12) * f1268)) ^ ((long) c10));
                    com.ironsource.adqualitysdk.sdk.i.d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m1486(Object obj) {
        int i10 = f1266 + 89;
        f1265 = i10 % 128;
        int i11 = i10 % 2;
        WebViewApp.setCurrentApp((a) obj);
        int i12 = f1266 + 81;
        f1265 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static BannerView.IListener m1482(BannerView bannerView) {
        int i10 = f1266 + 1;
        f1265 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return bannerView.getListener();
        }
        bannerView.getListener();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m1484(UnityAdsLoadOptions unityAdsLoadOptions) {
        int i10 = f1265 + 65;
        f1266 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject data = unityAdsLoadOptions.getData();
        int i12 = f1265 + 119;
        f1266 = i12 % 128;
        int i13 = i12 % 2;
        return data;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1503(BannerView bannerView) {
        int i10 = f1265 + 65;
        f1266 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 0 : (char) 30) != 0) {
            return bannerView.getPlacementId();
        }
        bannerView.getPlacementId();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Map m1504(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i10 = f1265 + 21;
        f1266 = i10 % 128;
        int i11 = i10 % 2;
        Map<String, String> stringTagsMap = diagnosticEvent.getStringTagsMap();
        int i12 = f1266 + 97;
        f1265 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return stringTagsMap;
        }
        int i13 = 74 / 0;
        return stringTagsMap;
    }
}
