package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.http.SslError;
import android.os.Message;
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
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import androidx.annotation.RequiresApi;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hk extends WebViewClient implements bb.e, cl {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2330 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2331;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2332;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2333;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private WebViewClient f2334;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private WebViewClient f2335;

    static {
        char[] cArr = new char[1031];
        ByteBuffer.wrap("ãðº~P½îÅ\u0085>#nù¸\u0097À.+ÄRb\u009a8Ý×\u0003mo\u000b\u008a¡Àx\b\u0016©¬þK'áx¿¹\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u001f¶@\u000f\u008biÕÃ0\u001d|v\u009bÐæ*)\u0084zÝ¶7é\u0091Xê\u009dDá\u009e\u0002ø@Q¤«Ë\u0005\u0001_x¸±\u0012úl7Æ$\u001f½yöÓ,,Õ\u00044]¿·{\t*bóÄý\u001epp;É±#\u0080\u0085fß\u00170È\u008a\u009aìPF\u001b\u009fòñaK ¬à\u0006¯Xi²y\u000bæm¹ÇB\u0019\u001crÉÔ\u0085.r\u0080\u000fÙÐ3\u0083\u0095?îà@¡\u009adü\bUë¯¹\u0001][\u0002¼È\u0016\u0081hHÂ\u0013\u001bÞ}Ý×D(ÿ\u0082¥ä,\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u001f¶@\u000f\u008biÕÃ0\u001d|v\u009bÐæ*)\u0084zÝ¶7é\u0091Xê\u009dDá\u009e\u0002ø@Q¤«Ë\u0005\u0001_x¸±\u0012úl7Æ$\u001fºyáÓ1,\u0089\u0086Ýà\u0007:D\u0093Å\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\u0017Ûf4¹\u008eëè!Bj\u009b\u0083õ\u0010OQ¨\u0091\u0002Þ\\\u0018¶\b\u000f\u0097iÈÃ3\u001dmv¸Ðô*\u0003\u0084~Ý¡7ò\u0091Nê\u0091DÐ\u009e\u0015øyQ\u009a«È\u0005,_s¸¹\u0012ðl9Æb\u001f¯y¬Ó2,\u0099\u0086Éà\u0001:U\u0093\u009fíÜGMî\u009d·\u0016]Òã\u0083\u0088Z.TôÙ\u009a\u0092#\u0018É)oÔ5®ÚD`=\u0006ã¬¨u}\u001bÊ¡\u0085F^ìH²ÛX\u009eál\u0087\u0019-ãó¥\u0098_><Äõj¢3hÙ=\u007f\u0080\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u0003¶F\u000f´iÁÃ;\u001d}v\u0092Ðù*\"\u0084aÝ·7è\u0091Yê\u009c¿\u008bæ\u0000\fÄ²\u0095ÙL\u007fB¥ÏË\u0084r\u000e\u0098?>Âd¸\u008bR1+Wõý¾$kJÜð\u0093\u0017H½^ãÍ\t\u0088°fÖ\u0001|ó¢²ÉHo;\u0095ñ;©b\u007f\u0088<.\u0091US\u0000VYÝ³\u0019\rHf\u0091À\u009f\u001a\u0012tYÍÓ'â\u0081\u001fÛe4\u008f\u008eöè(Bc\u009b¶õ\u0001ON¨\u0095\u0002\u0083\\\f¶S\u000f\u0098iÆÃ#\u001dov\u008eÐí*+\u0084~Ý¥7ð\u0091Jê\u009bDÓ\u009e1øZQ\u008a«Â\u0005\u0016_|¸¿\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u0003¶F\u000f°iÏÃ3\u001dUvµÐþ*5\u0084ZÝ¡7ä\u0091Uê\u008aDÑ\u009e\u0013øXQ\u009bA\u0013\u0018\u0098ò\\L\r'Ô\u0081Ú[W5\u001c\u008c\u0096f§ÀZ\u009a uÊÏ³©m\u0003&Úó´D\u000e\u000béÐCÆ\u001dU÷\u0010Nà(\u0093\u0082i\\+7ë\u0091°k\u007fÅ:\u009c×v¤Ð\u0018«Á\u0005\u0090\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u0003¶F\u000f¢iÏÃ.\u001duv\u0086Ðõ*?\u0084}Ý¦7í\u0091Uê\u008bDÇ\u009e\u0019øCQ\u0086\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ó\u00816ÛR4¿\u008eþè%BV\u009b¥õ\u000fOM¨\u0096\u0002Ý\\\u0005¶[\u000f\u0097iÉÃ3\u001dv\u0080¢Ù)3í\u008d¼æe@k\u009aæô\u00adM'§\u0016\u0001ë[\u0091´{\u000e\u0002hÜÂ\u0097\u001bBuõÏº(a\u0082wÜï6 \u008fVé7Cß\u009d\u009eöGP\u0012ªý\u0004\u0086]P·\u000e\u0011¯jzÄ7\u001eßx¢Ñ|+7\u0085èß\u00898F9ª`!\u008aå4´_mùc#îM¥ô/\u001e\u001e¸ãâ\u0099\rs·\nÑÔ{\u009f¢JÌýv²\u0091i;\u007feì\u008f©6YP*úÐ$\u0092ORé\t\u0013Æ½\u0083äx\u000e\u001c¨¿ÓR})§íÁ¬hu\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u0003¶F\u000f¶iÅÃ?\u001d}v½Ðæ*)\u0084lÝ\u00877ì\u0091Uê\u009dDÚ\u009e\u0004øoQ\u008d«Ö\u0005\u0014_N¸½\u0012ål%Æi\u001f»yðMj\u0014áþ%@t+\u00ad\u008d£W.9e\u0080ïjÐÌ\u0016\u0096Wy\u0093ÃÊ¥\t\u000fLÖÏ¸<\u0002eå²Oø\u0011*ûiBë$à\u008e\u001dPe;\u009e\u009dÜg\u0006ÉN\u0090\u009dzÊÜw§\u0094\t÷Ó6µf\u001c©æÿH\f\u0012Võ\u0085_Ï!-\u008bFR\u00964Þ\u009e\na Ëã\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u0003¶F\u000f¶iÅÃ?\u001d}v½Ðæ*)\u0084lÝ\u008c7ô\u0091Hê\u0088Dõ\u009e\u0005øXQ\u0080«ö\u0005\u0005_m¸\u00ad\u0012ñl#Æx\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u001f¶@\u000f\u008biÕÃ0\u001d|v\u009bÐæ*)\u0084zÝ¶7é\u0091Xê\u009dDÿ\u009e\u0015øUQ\u00ad«Ò\u0005\u0005_r¸¬\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u0003¶F\u000f±iÎÃ4\u001dyvºÐô* \u0084mÝ 7Ë\u0091Yê\u0081Dñ\u009e\u0006øIQ\u0086«Ð\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u0003¶F\u000f·iÃÃ=\u001dtv±ÐÓ*$\u0084iÝª7ç\u0091Yê\u009c\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u0003¶F\u000f¶iÅÃ?\u001d}v½Ðæ*)\u0084lÝ\u00887ï\u0091[ê\u0091DÚ\u009e\"øIQ\u0099«Ñ\u0005\u0005_o¸¬\u008e*×¡=e\u00834èíNã\u0094nú%C¯©\u009e\u000fcU\u0019ºó\u0000\u008afTÌ\u001f\u0015Ê{}Á2&é\u008cÿÒl8)\u0081ÙçªMP\u0093\u0012øÒ^\u0089¤F\n\u0003Sã¹\u009b\u001f'dçÊ\u009e\u0010mv1ßè%¹f\u009b?\u0010ÕÔk\u0085\u0000\\¦R|ß\u0012\u0094«\u001eA/çÒ½¨RBè;\u008eå$®ý{\u0093Ì)\u0083ÎXdN:ÝÐ\u0098ih\u000f\u001b¥ì{¢\u0010o¶<LÂâ¤»uQ=÷\u0087\u008cU\"\u0019øé\u009e\u009d7XÍ\u001f\u0000gYÙ³\f\rcf\u0082ÀÍ\u001a\u0018tTÍ\u0085'ø\u0081\u000fÛq4²\u008eÚè!Ba\u009b·õ?OT¨\u009d\u0002Õ\\\u0002¶\\þ\u0095§+Mþó\u0092\u0098`>\täÿ\u008a´3DÙ\u0007\u007fÏ%\u0091Êap\u0012\u0016Ó¼\u0093e\\\u000bú".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1031);
        f2333 = cArr;
        f2331 = 697491909067233724L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if ((r9 ? '\t' : 'Q') != 'Q') goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r9 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        r2 = r2 + 115;
        com.ironsource.adqualitysdk.sdk.i.hk.f2330 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m2255(android.webkit.WebView r7, java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hk.m2255(android.webkit.WebView, java.lang.String, boolean):boolean");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Object m2258() {
        int i10 = f2330;
        int i11 = i10 + 109;
        f2332 = i11 % 128;
        int i12 = i11 % 2;
        WebViewClient webViewClient = this.f2335;
        int i13 = i10 + 99;
        f2332 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return webViewClient;
        }
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/hk;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44960f, webView, str);
        safedk_hk_onLoadResource_b848beb9d682b6ba8e4bf762a03bc23d(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/hk;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44960f, webView, str);
        safedk_hk_onPageFinished_9b7b0092cc16a74399270b6c70111b16(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        try {
            this.f2335.onPageStarted(webView, str, bitmap);
        } catch (Throwable th2) {
            kd.m2872(m2254(ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) (58279 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), ((Process.getThreadPriority(0) + 20) >> 6) + 22).intern(), m2254(233 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (61144 - (Process.myTid() >> 22)), View.MeasureSpec.getSize(0) + 34).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient != null) {
            int i10 = f2330 + 111;
            f2332 = i10 % 128;
            int i11 = i10 % 2;
            webViewClient.onPageStarted(webView, str, bitmap);
            return;
        }
        super.onPageStarted(webView, str, bitmap);
        int i12 = f2332 + 123;
        f2330 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        int i11 = f2332 + 115;
        f2330 = i11 % 128;
        try {
            if (i11 % 2 == 0) {
                this.f2335.onReceivedError(webView, i10, str, str2);
                throw null;
            }
            this.f2335.onReceivedError(webView, i10, str, str2);
            WebViewClient webViewClient = this.f2334;
            if ((webViewClient != null ? 'b' : ';') != 'b') {
                super.onReceivedError(webView, i10, str, str2);
                return;
            }
            int i12 = f2330 + 59;
            f2332 = i12 % 128;
            if (i12 % 2 == 0) {
                webViewClient.onReceivedError(webView, i10, str, str2);
            } else {
                webViewClient.onReceivedError(webView, i10, str, str2);
                throw null;
            }
        } catch (Throwable th2) {
            kd.m2872(m2254(View.resolveSize(0, 0), (char) (58279 - TextUtils.getOffsetBefore("", 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22).intern(), m2254(468 - AndroidCharacter.getMirror('0'), (char) (16727 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 36).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        try {
            this.f2335.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            int i10 = f2330 + 69;
            f2332 = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2254(Process.myTid() >> 22, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58278), TextUtils.getOffsetAfter("", 0) + 22).intern(), m2254(704 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) Color.alpha(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 45).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if ((webViewClient != null ? 'U' : 'C') == 'C') {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            return;
        }
        webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        int i12 = f2330 + 77;
        f2332 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            this.f2335.onRenderProcessGone(webView, renderProcessGoneDetail);
            int i10 = f2330 + 77;
            f2332 = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2254((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (char) (Color.rgb(0, 0, 0) + 16835495), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22).intern(), m2254(949 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26334), (Process.myTid() >> 22) + 40).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if ((webViewClient != null ? 'W' : (char) 5) == 5) {
            return true;
        }
        boolean zOnRenderProcessGone = webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
        int i12 = f2330 + 21;
        f2332 = i12 % 128;
        if (i12 % 2 == 0) {
            return zOnRenderProcessGone;
        }
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        try {
            this.f2335.onUnhandledKeyEvent(webView, keyEvent);
        } catch (Throwable th2) {
            kd.m2872(m2254(ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 58279), 22 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), m2254(792 - Color.alpha(0), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.lastIndexOf("", '0', 0, 0) + 41).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient == null) {
            super.onUnhandledKeyEvent(webView, keyEvent);
            return;
        }
        int i10 = f2332 + 77;
        f2330 = i10 % 128;
        int i11 = i10 % 2;
        webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        int i12 = f2332 + 61;
        f2330 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 14 : (char) 7) != 14) {
            return;
        }
        int i13 = 24 / 0;
    }

    public WebResourceResponse safedk_hk_shouldInterceptRequest_0093e81be0897ca4957883339c71a8fb(WebView p10, String p11) {
        int i10 = f2332 + 71;
        f2330 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f2335.shouldInterceptRequest(p10, p11);
            int i12 = f2330 + 9;
            f2332 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2254(KeyEvent.keyCodeFromString(""), (char) (58279 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22).intern(), m2254(ImageFormat.getBitsPerPixel(0) + 339, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18), 43 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient != null) {
            return webViewClient.shouldInterceptRequest(p10, p11);
        }
        WebResourceResponse webResourceResponseShouldInterceptRequest = super.shouldInterceptRequest(p10, p11);
        int i14 = f2330 + 91;
        f2332 = i14 % 128;
        if ((i14 % 2 != 0 ? 'A' : 'b') == 'b') {
            return webResourceResponseShouldInterceptRequest;
        }
        throw null;
    }

    public boolean safedk_hk_shouldOverrideUrlLoading_5255e624c9285601dcdfa3408a668df2(WebView p10, String p11) {
        int i10 = f2330 + 49;
        f2332 = i10 % 128;
        if (i10 % 2 != 0) {
        }
        boolean zM2255 = m2255(p10, p11, false);
        int i11 = f2332 + 47;
        f2330 = i11 % 128;
        int i12 = i11 % 2;
        return zM2255;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/hk;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44960f, webView, webResourceRequest, safedk_hk_shouldInterceptRequest_9fa75386ca915b92ff63f3e90e6504cb(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/hk;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44960f, webView, str, safedk_hk_shouldInterceptRequest_0093e81be0897ca4957883339c71a8fb(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        try {
            this.f2335.shouldOverrideKeyEvent(webView, keyEvent);
        } catch (Throwable th2) {
            kd.m2872(m2254((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, (char) (View.resolveSizeAndState(0, 0, 0) + 58279), 22 - View.MeasureSpec.getSize(0)).intern(), m2254((ViewConfiguration.getPressedStateDuration() >> 16) + 749, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 43 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (!(webViewClient != null)) {
            return super.shouldOverrideKeyEvent(webView, keyEvent);
        }
        int i10 = f2330 + 89;
        f2332 = i10 % 128;
        int i11 = i10 % 2;
        boolean zShouldOverrideKeyEvent = webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
        int i12 = f2330 + 59;
        f2332 = i12 % 128;
        int i13 = i12 % 2;
        return zShouldOverrideKeyEvent;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/hk;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_hk_shouldOverrideUrlLoading_85b93fcae4fcfb70785cbbb88d3f6168 = safedk_hk_shouldOverrideUrlLoading_85b93fcae4fcfb70785cbbb88d3f6168(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders(com.safedk.android.utils.g.f44960f, webView, webResourceRequest, zSafedk_hk_shouldOverrideUrlLoading_85b93fcae4fcfb70785cbbb88d3f6168);
        return zSafedk_hk_shouldOverrideUrlLoading_85b93fcae4fcfb70785cbbb88d3f6168;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/hk;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_hk_shouldOverrideUrlLoading_5255e624c9285601dcdfa3408a668df2 = safedk_hk_shouldOverrideUrlLoading_5255e624c9285601dcdfa3408a668df2(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44960f, webView, str, zSafedk_hk_shouldOverrideUrlLoading_5255e624c9285601dcdfa3408a668df2);
        return zSafedk_hk_shouldOverrideUrlLoading_5255e624c9285601dcdfa3408a668df2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean m2256() {
        int i10 = f2332 + 57;
        int i11 = i10 % 128;
        f2330 = i11;
        int i12 = i10 % 2;
        WebViewClient webViewClient = this.f2334;
        if ((webViewClient != null ? '(' : 'a') == '(') {
            int i13 = i11 + 65;
            f2332 = i13 % 128;
            boolean z10 = i13 % 2 != 0;
            Class<?> cls = webViewClient.getClass();
            if (z10) {
                cls.equals(WebViewClient.class);
                throw null;
            }
            if (!cls.equals(WebViewClient.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private WebViewClient m2257() {
        int i10 = f2332 + 105;
        f2330 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return this.f2334;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.webkit.WebView] */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.webkit.WebView] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.webkit.WebViewClient, com.ironsource.adqualitysdk.sdk.i.hk] */
    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean m2259(WebView webView, WebResourceRequest webResourceRequest, boolean z10) {
        try {
            if (this.f2335.shouldOverrideUrlLoading((WebView) webView, webResourceRequest) || z10) {
                WebViewClient webViewClient = this.f2334;
                if ((webViewClient instanceof hk ? (char) 5 : 'C') != 'C') {
                    int i10 = f2330 + 65;
                    f2332 = i10 % 128;
                    ((i10 % 2 != 0 ? (char) 25 : (char) 14) != 25 ? (hk) webViewClient : (hk) webViewClient).m2259((WebView) webView, webResourceRequest, true);
                }
                return true;
            }
            int i11 = f2332 + 21;
            f2330 = i11 % 128;
            int i12 = i11 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2254((Process.getThreadPriority(0) + 20) >> 6, (char) (58280 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21).intern(), m2254(125 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0), 54 - KeyEvent.keyCodeFromString("")).intern(), th2, false);
        }
        WebViewClient webViewClient2 = this.f2334;
        ?? r10 = webView;
        if (webViewClient2 != null) {
            int i13 = f2330 + 91;
            f2332 = i13 % 128;
            try {
                if ((i13 % 2 != 0 ? (char) 29 : 'S') != 29) {
                    webView = webViewClient2.shouldOverrideUrlLoading((WebView) webView, webResourceRequest);
                } else {
                    int i14 = 40 / 0;
                    webView = webViewClient2.shouldOverrideUrlLoading((WebView) webView, webResourceRequest);
                }
                return webView;
            } catch (Throwable th3) {
                kd.m2872(m2254(Process.myPid() >> 22, (char) (KeyEvent.keyCodeFromString("") + 58279), ExpandableListView.getPackedPositionGroup(0L) + 22).intern(), m2254(178 - Color.argb(0, 0, 0, 0), (char) TextUtils.getCapsMode("", 0, 0), 'h' - AndroidCharacter.getMirror('0')).intern(), th3, false);
                r10 = webView;
            }
        }
        return super.shouldOverrideUrlLoading(r10, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        int i10 = f2330 + 21;
        f2332 = i10 % 128;
        try {
            if (!(i10 % 2 != 0)) {
                this.f2335.doUpdateVisitedHistory(webView, str, z10);
            } else {
                this.f2335.doUpdateVisitedHistory(webView, str, z10);
                int i11 = 69 / 0;
            }
        } catch (Throwable th2) {
            kd.m2872(m2254(View.MeasureSpec.getSize(0), (char) (58279 - (ViewConfiguration.getLongPressTimeout() >> 16)), 22 - TextUtils.indexOf("", "", 0)).intern(), m2254(View.resolveSizeAndState(0, 0, 0) + 522, (char) (Color.blue(0) + 32999), 44 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient == null) {
            super.doUpdateVisitedHistory(webView, str, z10);
            return;
        }
        int i12 = f2330 + 83;
        f2332 = i12 % 128;
        char c10 = i12 % 2 != 0 ? (char) 17 : '\\';
        webViewClient.doUpdateVisitedHistory(webView, str, z10);
        if (c10 != 17) {
            return;
        }
        int i13 = 18 / 0;
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        int i10 = f2330 + 51;
        f2332 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f2335.onFormResubmission(webView, message, message2);
            int i12 = f2332 + 95;
            f2330 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2254(Color.red(0), (char) (58279 - View.MeasureSpec.getSize(0)), 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m2254((ViewConfiguration.getTapTimeout() >> 16) + 456, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ImageFormat.getBitsPerPixel(0) + 40).intern(), th2, false);
        }
        try {
            WebViewClient webViewClient = this.f2334;
            if (!(webViewClient != null)) {
                super.onFormResubmission(webView, message, message2);
            } else {
                webViewClient.onFormResubmission(webView, message, message2);
            }
        } catch (Error e10) {
            kd.m2872(m2254((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (Color.green(0) + 58279), 22 - Drawable.resolveOpacity(0, 0)).intern(), m2254(View.resolveSize(0, 0) + 495, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 27).intern(), e10, false);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public void onPageCommitVisible(WebView webView, String str) {
        int i10 = f2330 + 37;
        f2332 = i10 % 128;
        try {
            if ((i10 % 2 != 0 ? (char) 5 : (char) 20) != 20) {
                this.f2335.onPageCommitVisible(webView, str);
                throw null;
            }
            this.f2335.onPageCommitVisible(webView, str);
            WebViewClient webViewClient = this.f2334;
            if (webViewClient == null) {
                super.onPageCommitVisible(webView, str);
                return;
            }
            int i11 = f2332 + 59;
            f2330 = i11 % 128;
            if (i11 % 2 != 0) {
                webViewClient.onPageCommitVisible(webView, str);
            } else {
                webViewClient.onPageCommitVisible(webView, str);
                throw null;
            }
        } catch (Throwable th2) {
            kd.m2872(m2254(ViewConfiguration.getPressedStateDuration() >> 16, (char) (58279 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 22).intern(), m2254(234 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 61144), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 34).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        int i10 = f2332 + 121;
        f2330 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f2335.onReceivedClientCertRequest(webView, clientCertRequest);
        } catch (Throwable th2) {
            kd.m2872(m2254((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (char) (58279 - Color.blue(0)), TextUtils.lastIndexOf("", '0', 0, 0) + 23).intern(), m2254(View.MeasureSpec.makeMeasureSpec(0, 0) + 604, (char) View.getDefaultSize(0, 0), 47 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), th2, false);
        }
        try {
            WebViewClient webViewClient = this.f2334;
            if ((webViewClient != null ? '1' : 'Q') == 'Q') {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
                return;
            }
            int i12 = f2332 + 61;
            f2330 = i12 % 128;
            int i13 = i12 % 2;
            webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
        } catch (Throwable th3) {
            kd.m2872(m2254(View.MeasureSpec.makeMeasureSpec(0, 0), (char) (58279 - (KeyEvent.getMaxKeyCode() >> 16)), 22 - ExpandableListView.getPackedPositionType(0L)).intern(), m2254(652 - View.getDefaultSize(0, 0), (char) (19759 - TextUtils.indexOf("", "")), ((Process.getThreadPriority(0) + 20) >> 6) + 51).intern(), th3, false);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.f2335.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            int i10 = f2330 + 95;
            f2332 = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2254(ExpandableListView.getPackedPositionType(0L), (char) (58279 - Color.blue(0)), TextUtils.getTrimmedLength("") + 22).intern(), m2254(910 - (Process.myTid() >> 22), (char) (TextUtils.getOffsetBefore("", 0) + 36463), ((byte) KeyEvent.getModifierMetaStateMask()) + 41).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if ((webViewClient != null ? '3' : (char) 28) == 28) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            return;
        }
        int i12 = f2330 + 27;
        f2332 = i12 % 128;
        int i13 = i12 % 2;
        webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        int i10 = f2330 + 99;
        f2332 = i10 % 128;
        try {
            if ((i10 % 2 != 0 ? (char) 21 : 'R') != 21) {
                this.f2335.onReceivedLoginRequest(webView, str, str2, str3);
            } else {
                this.f2335.onReceivedLoginRequest(webView, str, str2, str3);
                int i11 = 24 / 0;
            }
        } catch (Throwable th2) {
            kd.m2872(m2254((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (char) (58279 - Gravity.getAbsoluteGravity(0, 0)), 22 - ExpandableListView.getPackedPositionGroup(0L)).intern(), m2254(Color.alpha(0) + 867, (char) ExpandableListView.getPackedPositionGroup(0L), 42 - ExpandableListView.getPackedPositionChild(0L)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient == null) {
            super.onReceivedLoginRequest(webView, str, str2, str3);
            return;
        }
        int i12 = f2330 + 85;
        f2332 = i12 % 128;
        int i13 = i12 % 2;
        webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        int i10 = f2332 + 65;
        f2330 = i10 % 128;
        try {
            if (!(i10 % 2 != 0)) {
                this.f2335.onReceivedSslError(webView, sslErrorHandler, sslError);
                throw null;
            }
            this.f2335.onReceivedSslError(webView, sslErrorHandler, sslError);
            WebViewClient webViewClient = this.f2334;
            if (!(webViewClient != null)) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                return;
            }
            int i11 = f2332 + 115;
            f2330 = i11 % 128;
            boolean z10 = i11 % 2 != 0;
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            if (z10) {
            } else {
                throw null;
            }
        } catch (Throwable th2) {
            kd.m2872(m2254(ViewConfiguration.getEdgeSlop() >> 16, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 58279), 22 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), m2254((-16776651) - Color.rgb(0, 0, 0), (char) (14831 - View.resolveSizeAndState(0, 0, 0)), 39 - TextUtils.getCapsMode("", 0, 0)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f10, float f11) {
        int i10 = f2332 + 99;
        f2330 = i10 % 128;
        try {
            if (!(i10 % 2 != 0)) {
                this.f2335.onScaleChanged(webView, f10, f11);
                throw null;
            }
            this.f2335.onScaleChanged(webView, f10, f11);
            WebViewClient webViewClient = this.f2334;
            if (!(webViewClient != null)) {
                super.onScaleChanged(webView, f10, f11);
                return;
            }
            int i11 = f2332 + 111;
            f2330 = i11 % 128;
            if (i11 % 2 != 0) {
                webViewClient.onScaleChanged(webView, f10, f11);
            } else {
                webViewClient.onScaleChanged(webView, f10, f11);
                throw null;
            }
        } catch (Throwable th2) {
            kd.m2872(m2254(ViewConfiguration.getTouchSlop() >> 8, (char) (58279 - ExpandableListView.getPackedPositionGroup(0L)), 21 - TextUtils.lastIndexOf("", '0')).intern(), m2254(832 - View.MeasureSpec.getMode(0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 35 - View.resolveSizeAndState(0, 0, 0)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        int i10 = f2330 + 25;
        f2332 = i10 % 128;
        try {
            if ((i10 % 2 != 0 ? (char) 6 : 'M') != 6) {
                this.f2335.onTooManyRedirects(webView, message, message2);
            } else {
                this.f2335.onTooManyRedirects(webView, message, message2);
                int i11 = 79 / 0;
            }
            int i12 = f2332 + 113;
            f2330 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2254(ViewConfiguration.getFadingEdgeLength() >> 16, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 58280), TextUtils.indexOf("", "", 0, 0) + 22).intern(), m2254(381 - ExpandableListView.getPackedPositionGroup(0L), (char) (AndroidCharacter.getMirror('0') - '0'), 39 - ExpandableListView.getPackedPositionType(0L)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient == null) {
            super.onTooManyRedirects(webView, message, message2);
            return;
        }
        int i14 = f2332 + 21;
        f2330 = i14 % 128;
        if ((i14 % 2 == 0 ? 'D' : '0') != 'D') {
            webViewClient.onTooManyRedirects(webView, message, message2);
        } else {
            webViewClient.onTooManyRedirects(webView, message, message2);
            throw null;
        }
    }

    public void safedk_hk_onLoadResource_b848beb9d682b6ba8e4bf762a03bc23d(WebView p10, String p11) {
        int i10 = f2332 + 93;
        f2330 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2335.onLoadResource(p10, p11);
                int i11 = 69 / 0;
            } else {
                this.f2335.onLoadResource(p10, p11);
            }
        } catch (Throwable th2) {
            kd.m2872(m2254(ViewConfiguration.getPressedStateDuration() >> 16, (char) (58278 - TextUtils.indexOf((CharSequence) "", '0', 0)), 22 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), m2254((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 302, (char) (49101 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf("", "", 0) + 35).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient == null) {
            super.onLoadResource(p10, p11);
            int i12 = f2332 + 93;
            f2330 = i12 % 128;
            int i13 = i12 % 2;
            return;
        }
        int i14 = f2332 + 27;
        f2330 = i14 % 128;
        if ((i14 % 2 == 0 ? 'G' : '@') == '@') {
            webViewClient.onLoadResource(p10, p11);
        } else {
            webViewClient.onLoadResource(p10, p11);
            int i15 = 64 / 0;
        }
    }

    public void safedk_hk_onPageFinished_9b7b0092cc16a74399270b6c70111b16(WebView p10, String p11) {
        int i10 = f2332 + 41;
        f2330 = i10 % 128;
        try {
            if ((i10 % 2 == 0 ? 'M' : (char) 4) != 'M') {
                this.f2335.onPageFinished(p10, p11);
            } else {
                this.f2335.onPageFinished(p10, p11);
                int i11 = 80 / 0;
            }
        } catch (Throwable th2) {
            kd.m2872(m2254((-1) - TextUtils.indexOf((CharSequence) "", '0'), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 58279), 21 - MotionEvent.axisFromString("")).intern(), m2254(268 - View.MeasureSpec.getMode(0), (char) View.getDefaultSize(0, 0), (Process.myPid() >> 22) + 35).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient == null) {
            super.onPageFinished(p10, p11);
            return;
        }
        int i12 = f2330 + 61;
        f2332 = i12 % 128;
        if (i12 % 2 == 0) {
            webViewClient.onPageFinished(p10, p11);
        } else {
            webViewClient.onPageFinished(p10, p11);
            throw null;
        }
    }

    @RequiresApi(api = 24)
    public boolean safedk_hk_shouldOverrideUrlLoading_85b93fcae4fcfb70785cbbb88d3f6168(WebView p10, WebResourceRequest p11) {
        int i10 = f2330 + 7;
        f2332 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM2259 = m2259(p10, p11, false);
        int i12 = f2332 + 37;
        f2330 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return zM2259;
        }
        throw null;
    }

    public hk(WebViewClient webViewClient, WebViewClient webViewClient2) {
        this.f2334 = webViewClient;
        this.f2335 = webViewClient2;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            this.f2335.onReceivedError(webView, webResourceRequest, webResourceError);
            int i10 = f2330 + 1;
            f2332 = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2254((-1) - TextUtils.lastIndexOf("", '0'), (char) (58279 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Color.rgb(0, 0, 0) + 16777238).intern(), m2254((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 419, (char) (16726 - KeyEvent.keyCodeFromString("")), 36 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if ((webViewClient != null ? (char) 31 : 'G') != 'G') {
            int i12 = f2330 + 55;
            f2332 = i12 % 128;
            int i13 = i12 % 2;
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @RequiresApi(api = 21)
    public WebResourceResponse safedk_hk_shouldInterceptRequest_9fa75386ca915b92ff63f3e90e6504cb(WebView p10, WebResourceRequest p11) {
        int i10 = f2332 + 57;
        f2330 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f2335.shouldInterceptRequest(p10, p11);
        } catch (Throwable th2) {
            kd.m2872(m2254(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) (58279 - Color.alpha(0)), 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), m2254(Color.rgb(0, 0, 0) + 16777554, (char) (20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 43 - ExpandableListView.getPackedPositionType(0L)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if ((webViewClient != null ? '=' : 'F') != '=') {
            return super.shouldInterceptRequest(p10, p11);
        }
        int i12 = f2330 + 45;
        f2332 = i12 % 128;
        if (i12 % 2 == 0) {
            return webViewClient.shouldInterceptRequest(p10, p11);
        }
        webViewClient.shouldInterceptRequest(p10, p11);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo812(String str, List<Object> list, ch chVar) {
        int i10 = f2330 + 101;
        f2332 = i10 % 128;
        int i11 = i10 % 2;
        byte b10 = -1;
        int iHashCode = str.hashCode();
        if (iHashCode == 368095040) {
            if (str.equals(m2254((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1013, (char) (65265 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18).intern())) {
                int i12 = f2330 + 5;
                f2332 = i12 % 128;
                b10 = (i12 % 2 != 0 ? '[' : '8') != '8' ? (byte) 0 : (byte) 1;
            }
        } else if (iHashCode == 381550901 && str.equals(m2254(989 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
            int i13 = f2330 + 11;
            f2332 = i13 % 128;
            int i14 = i13 % 2;
        }
        if (b10 == 0) {
            return m2257();
        }
        if (b10 != 1) {
            return null;
        }
        return m2258();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2254(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2333[i10 + i12]) ^ (((long) i12) * f2331)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }
}
