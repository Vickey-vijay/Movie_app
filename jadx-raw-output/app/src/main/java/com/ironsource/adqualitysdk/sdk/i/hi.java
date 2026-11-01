package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.G5;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hi extends WebChromeClient implements bb.e, cl {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2317 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2318;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2319;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2320;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private WebChromeClient f2321;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private WebChromeClient f2322;

    static {
        char[] cArr = new char[1100];
        ByteBuffer.wrap("$X\u0085¿gÇÁ3£3\rTî\u009eH±*Â\u00941v1ÐA±\u0096\u0013°ýÝ_09:\u009bID\u009a&²\u0080Êb\u0002Ì.®^\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008as+\u008aÍ¢oÅ\u0011\u0005³)URö\u0085\u0098\u0088:ÈÜ\u0014~$ xÁ\u0091c\u00ad\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008aq+\u009dÍ®oÇ\u0011\u001e³:UDö\u0092\u0098\u009f:ÉÜ\u0001~& z\f\u0010\u00adòO\u008déE\u008bs%\\ÆÂ`è\u0002Ý¼E^Sø\u0010\u0099å;íÕ\u0080wZ\u0011`³\u001elÊ\u000eè¨ÑJCäu\u0086$'ÈÁûc\u0092\u001dK¿oY\u0011úÇ\u0094×6\u0096ÐOrq7C\u0096¡tÞÒ\u0016° \u001e\u000fý\u0091[»9\u008e\u0087\u0016e\u0000ÃC¢¶\u0000¾îÓL\t*3\u0088MW\u00995»\u0093\u0082q\u0010ß&½w\u001c\u009bú¨XÁ&\u0018\u0084<bBÁ\u0094¯\u0099\rÉë\u0006I/\u0017qö»T¬2÷\u0090\u001b~\u001bÜi»\u0098FWçµ\u0005Ê£\u0002Á4o\u001b\u008c\u0085*¯H\u009aö\u0002\u0014\u0014²WÓ¢qª\u009fÇ=\u001d['ùY&\u008dD¯â\u0096\u0000\u0004®2Ìbm\u0082\u008b°)ÇW&õ+\u0013@°\u0090Þ¶|ß\u009a181fh\u0087\u0091\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008ak+\u0091Í©oÇ\u00114³9URö\u0082\u0098¤:ÍÜ#~# zÁ\u0083\u0085±$SÆ,`ä\u0002Ò¬ýOcéI\u008b|5ä×òq±\u0010D²L\\!þû\u0098Á:¿åk\u0087I!pÃâmÔ\u000f\u0094®~H\\ê7\u0094÷6ÝÐ\u0082sk\u001dQ¿0YîûÉ\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008aq+\u009dÍ¼o×\u0011\u0012³?UUö°\u0098¤:ÃÜ\u0000~9\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008a`+\u0094Í¢oÑ\u0011\u0012³\u001bUHö\u0098\u0098¯:ÏÜ\u0002\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008ai+\u008bÍ\u008coÎ\u0011\u0012³>UU\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008ai+\u008bÍ\u008eoÍ\u0011\u0019³*UHö\u0084\u0098¦*'\u008bÅiºÏr\u00adD\u0003kàõFß$ê\u009arxdÞ'¿Ò\u001dÚó·Qm7W\u0095)Jý(ß\u008eæltÂB \u000b\u0001éçÿE²;z\u0099C\u007f3Üà\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008ai+\u008bÍ\u008foÇ\u0011\u0011³#USö\u0093\u0098\u009e:ÎÜ\u0019~% ~Á\u0090\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008af+\u0080Í®oÇ\u0011\u0012³(UDö\u0092\u0098\u008f:ÁÜ\u0001~+ }Á\u0095cº\u0005û§\"I=ër\u008c\u0086.¦\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008ad+\u009dÍ¢oÎ\u0011\u0018³/U@ö\u0082\u0098¢:ÏÜ\u001b~\u001a zÁ\u0086c¤\u0005÷§\u0000I;ët\u008c\u009d.©Ðïr\"\u0014.¶tW\u0087ù\u0095\u009bè=\u0000ß)\u0081i\"\u009a\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008ad+\u009dÍ¢oÎ\u0011\u0018³/U@ö\u0082\u0098¢:ÏÜ\u001b~\u001a zÁ\u0086c¤\u0005÷§\u0000I;ët\u008c\u009d.©Ðïr9\u0014/¶\u007fW\u0095ù\u0095\u009bè=\u0000ß)\u0081i\"\u009aúQ[³¹Ì\u001f\u0004}2Ó\u001d0\u0083\u0096©ô\u009cJ\u0004¨\u0012\u000eQo¤Í¬#Á\u0081\u001bç!E_\u009a\u008bø©^\u0090¼\u0002\u00124pgÑ\u00897«\u0095Ûë\nI+¯F\f\u008bb°ÀÚ&3\u0084;Úz;\u0095\u0099¸ÿù]\u0013\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u001eR3ôK\u0095\u00907¸ÙÈ{\u001c\u001dp¿J`\u0088\u0002¦¤ÃF\u0010è \u008a\u0003+\u0097Í£oò\u0011\u0012³>ULö\u009f\u0098¸:ÓÜ\u001c~% qÁ¦c¬\u0005ï§\u0006I-ën\u008c\u0086\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008as+\u009dÍ¿oÏ\u0011\u001e³?URö\u009f\u0098¤:ÎÜ'~/ nÁ\u0081c¬\u0005í§\u0007I\u000bë|\u008c\u009c.¤Ðùr\u001d\u0014#¶\u007fq5Ð×2¨\u0094`öVXy»ç\u001dÍ\u007føÁn#C\u0085;äàFÈ¨¸\nll\u0000Î:\u0011øsÖÕ³7`\u0099PûsZç¼Ó\u001e\u0082`bÂN$<\u0087ïéÈK£\u00adl\u000fUQ\u0001°Ö\u0012Üt\u009fÖv8]\u009a\u001eýö_ô¡\u008d\u0003oeUÇ\u000e&ì\u0088Ðê\u008e²§\u0013Eñ:Wò5Ä\u009bëxuÞ_¼j\u0002òàäF§'R\u0085Zk7Éí¯×\r©Ò}°_\u0016fôôZÂ8\u008b\u0099i\u007f{Ý)£ø\u0001Ëç¬Da*]³¤\u0012Fð9Vñ4Ç\u009aèyvß\\½i\u0003ñáçG¤&Q\u0084Yj4Èî®Ô\fªÓ~±\\\u0017eõ÷[Á9\u0081\u0098v~BÜ0¢ù\u0000Áæ¥EZ+O\u00892oçÍÊ\u0093\u0099rp\u0086ù'\u001bÅdc¬\u0001\u009a¯µL+ê\u0001\u008846¬Ôºrù\u0013\f±\u0004_iý³\u009b\u00899÷æ#\u0084\u0001\"8À¢n\u0097\fë\u00ad\u0000K\u0014éx\u0097ª5\u0085Óñp>\u001e!¼uZ\u00adø\u0093¦ÌG\u0018å\u001a\u0083Q!»Ï\u0091mÓø^Y¼»Ã\u001d\u000b\u007f=Ñ\u00122\u008c\u0094¦ö\u0093H\u000bª\u001d\f^m«Ï£!Î\u0083\u0014å.GP\u0098\u0084ú¦\\\u009f¾\u0005\u00100rLÓµ5¿\u0097Ýé\tK8\u00adv\u000e\u0082`±Âß$\u0007\u0086?Øc9¿\u009b ýê_\u000f±!\u0013ct\u009aÖ¯(Ñ\u008a\u0003ì8Nw-N\u008c¬nÓÈ\u001bª-\u0004\u0002ç\u009cA¶#\u0083\u009d\u001b\u007f\rÙN¸»\u001a³ôÞV\u00040>\u0092@M\u0094/¶\u0089\u008fk\u0015Å §\\\u0006¥à¯BÚ<\u0015\u009e3xOÛ\u0099µ\u0088\u0017Âñ\rS5\r{ì\u008dN»\u0000E¡§CØå\u0010\u0087&)\tÊ\u0097l½\u000e\u0088°\u0010R\u0006ôE\u0095°7¸ÙÕ{\u000f\u001d5¿K`\u009f\u0002½¤\u0084F\u0016è \u008ap+\u0090Í¢oÕ\u00111³%UMö\u0093\u0098\u0088:ÈÜ\u001a~% lÁ\u0091c»þ\u0089_^½0\u001bÆyÈ×¦4`\u0092Mð#N÷¬ë\n¬kpÉ|' \u0085çãÑA¦\u009eqübZ&¸þ\u0016Åt£Õbª°\u000bgé\tOü-á\u0083©`LÆf¤<\u001aÂø÷^\u009f?F\u009dcs2ÑÀ·î\u0015\u0097ÊC¨l".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1100);
        f2318 = cArr;
        f2320 = 7165630791747346901L;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Object m2250() {
        int i10 = f2319 + 37;
        int i11 = i10 % 128;
        f2317 = i11;
        int i12 = i10 % 2;
        WebChromeClient webChromeClient = this.f2321;
        int i13 = i11 + 109;
        f2319 = i13 % 128;
        int i14 = i13 % 2;
        return webChromeClient;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        try {
            this.f2321.getDefaultVideoPoster();
            int i10 = f2317 + 119;
            f2319 = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2252(Process.myTid() >> 22, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9231), 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m2252((ViewConfiguration.getEdgeSlop() >> 16) + 889, (char) (34492 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 42 - TextUtils.indexOf("", "")).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2322;
        if (webChromeClient == null) {
            return super.getDefaultVideoPoster();
        }
        int i12 = f2319 + 29;
        f2317 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return webChromeClient.getDefaultVideoPoster();
        }
        webChromeClient.getDefaultVideoPoster();
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        try {
            this.f2321.getVideoLoadingProgressView();
        } catch (Throwable th2) {
            kd.m2872(m2252(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9232), 24 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), m2252(931 - Color.red(0), (char) (63515 - TextUtils.indexOf("", "", 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2322;
        if (webChromeClient != null) {
            int i10 = f2317 + 77;
            f2319 = i10 % 128;
            int i11 = i10 % 2;
            return webChromeClient.getVideoLoadingProgressView();
        }
        View videoLoadingProgressView = super.getVideoLoadingProgressView();
        int i12 = f2319 + 77;
        f2317 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return videoLoadingProgressView;
        }
        int i13 = 62 / 0;
        return videoLoadingProgressView;
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        try {
            this.f2321.onCloseWindow(webView);
            int i10 = f2319 + 31;
            f2317 = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2252(ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (9232 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), m2252(TextUtils.indexOf("", "") + Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, (char) View.resolveSize(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 34).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2322;
        if (webChromeClient == null) {
            super.onCloseWindow(webView);
            return;
        }
        int i12 = f2317 + 7;
        f2319 = i12 % 128;
        int i13 = i12 % 2;
        webChromeClient.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onConsoleMessage(String str, int i10, String str2) {
        try {
            this.f2321.onConsoleMessage(str, i10, str2);
        } catch (Throwable th2) {
            kd.m2872(m2252(ViewConfiguration.getTapTimeout() >> 16, (char) (9231 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 24).intern(), m2252(852 - Drawable.resolveOpacity(0, 0), (char) (View.combineMeasuredStates(0, 0) + 46049), 38 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2322;
        if ((webChromeClient != null ? '@' : 'J') == 'J') {
            super.onConsoleMessage(str, i10, str2);
            int i11 = f2317 + 27;
            f2319 = i11 % 128;
            if ((i11 % 2 != 0 ? 'T' : 'M') != 'T') {
                return;
            } else {
                throw null;
            }
        }
        int i12 = f2317 + 79;
        f2319 = i12 % 128;
        if (i12 % 2 != 0) {
            webChromeClient.onConsoleMessage(str, i10, str2);
            throw null;
        }
        webChromeClient.onConsoleMessage(str, i10, str2);
        int i13 = f2319 + 83;
        f2317 = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        int i10 = f2319 + 93;
        f2317 = i10 % 128;
        try {
            if ((i10 % 2 == 0 ? 'X' : 'T') != 'X') {
                this.f2321.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
            } else {
                this.f2321.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
                int i11 = 36 / 0;
            }
        } catch (Throwable th2) {
            kd.m2872(m2252(Process.myTid() >> 22, (char) (9231 - View.resolveSizeAndState(0, 0, 0)), 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m2252(KeyEvent.getDeadChar(0, 0) + 484, (char) View.resolveSize(0, 0), 43 - TextUtils.lastIndexOf("", '0', 0)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2322;
        if (webChromeClient == null) {
            super.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
            int i12 = f2317 + 29;
            f2319 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i13 = f2319 + 121;
        f2317 = i13 % 128;
        if (i13 % 2 != 0) {
            webChromeClient.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
        } else {
            webChromeClient.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        try {
            this.f2321.onGeolocationPermissionsHidePrompt();
            int i10 = f2317 + 27;
            f2319 = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2252(TextUtils.indexOf("", "", 0, 0), (char) (MotionEvent.axisFromString("") + 9232), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m2252(583 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.getTrimmedLength("") + 55).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2322;
        if (!(webChromeClient != null)) {
            super.onGeolocationPermissionsHidePrompt();
            return;
        }
        int i12 = f2319 + 23;
        f2317 = i12 % 128;
        char c10 = i12 % 2 == 0 ? 'A' : '5';
        webChromeClient.onGeolocationPermissionsHidePrompt();
        if (c10 == 'A') {
            throw null;
        }
        int i13 = f2317 + 123;
        f2319 = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f2321.onJsBeforeUnload(webView, str, str2, jsResult);
            int i10 = f2319 + 57;
            f2317 = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2252((Process.getThreadPriority(0) + 20) >> 6, (char) ((Process.myTid() >> 22) + 9231), 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m2252(447 - Drawable.resolveOpacity(0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 37 - (Process.myTid() >> 22)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2322;
        if (!(webChromeClient != null)) {
            return super.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        int i12 = f2317 + 29;
        f2319 = i12 % 128;
        if ((i12 % 2 != 0 ? '\n' : 'X') == 'X') {
            return webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult);
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        try {
            this.f2321.onReceivedTitle(webView, str);
        } catch (Throwable th2) {
            kd.m2872(m2252(TextUtils.getTrimmedLength(""), (char) (9231 - Gravity.getAbsoluteGravity(0, 0)), 24 - Color.red(0)).intern(), m2252(62 - (ViewConfiguration.getTapTimeout() >> 16), (char) Drawable.resolveOpacity(0, 0), 36 - View.resolveSize(0, 0)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2322;
        if (webChromeClient == null) {
            super.onReceivedTitle(webView, str);
            return;
        }
        int i10 = f2317 + 11;
        f2319 = i10 % 128;
        int i11 = i10 % 2;
        webChromeClient.onReceivedTitle(webView, str);
        int i12 = f2317 + 31;
        f2319 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(WebView webView) {
        try {
            this.f2321.onRequestFocus(webView);
            int i10 = f2319 + 3;
            f2317 = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2252(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, (char) (TextUtils.indexOf((CharSequence) "", '0') + 9232), ExpandableListView.getPackedPositionGroup(0L) + 24).intern(), m2252(285 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.green(0) + 35).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2322;
        if (webChromeClient != null) {
            webChromeClient.onRequestFocus(webView);
            return;
        }
        super.onRequestFocus(webView);
        int i12 = f2317 + 45;
        f2319 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        int i10 = f2317 + 33;
        f2319 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f2321.onShowCustomView(view, customViewCallback);
            int i12 = f2319 + 109;
            f2317 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2252(KeyEvent.normalizeMetaState(0), (char) (9279 - AndroidCharacter.getMirror('0')), 23 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), m2252(176 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 17939), (ViewConfiguration.getTapTimeout() >> 16) + 37).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2322;
        if (!(webChromeClient == null)) {
            webChromeClient.onShowCustomView(view, customViewCallback);
        } else {
            super.onShowCustomView(view, customViewCallback);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private WebChromeClient m2251() {
        int i10 = f2319 + 31;
        int i11 = i10 % 128;
        f2317 = i11;
        int i12 = i10 % 2;
        WebChromeClient webChromeClient = this.f2322;
        int i13 = i11 + 67;
        f2319 = i13 % 128;
        int i14 = i13 % 2;
        return webChromeClient;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2252(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2318[i10 + i12]) ^ (((long) i12) * f2320)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        try {
            this.f2321.getVisitedHistory(valueCallback);
        } catch (Throwable th2) {
            kd.m2872(m2252(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 9231), 24 - TextUtils.getOffsetBefore("", 0)).intern(), m2252(979 - (ViewConfiguration.getTouchSlop() >> 8), (char) (11532 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 38 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2322;
        if (!(webChromeClient == null)) {
            int i10 = f2317 + 121;
            f2319 = i10 % 128;
            int i11 = i10 % 2;
            webChromeClient.getVisitedHistory(valueCallback);
            return;
        }
        super.getVisitedHistory(valueCallback);
        int i12 = f2317 + 51;
        f2319 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return;
        }
        int i13 = 16 / 0;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        int i10 = f2319 + 101;
        f2317 = i10 % 128;
        try {
            if (!(i10 % 2 != 0)) {
                this.f2321.onCreateWindow(webView, z10, z11, message);
                throw null;
            }
            this.f2321.onCreateWindow(webView, z10, z11, message);
            WebChromeClient webChromeClient = this.f2322;
            if (!(webChromeClient == null)) {
                return webChromeClient.onCreateWindow(webView, z10, z11, message);
            }
            boolean zOnCreateWindow = super.onCreateWindow(webView, z10, z11, message);
            int i11 = f2319 + 17;
            f2317 = i11 % 128;
            int i12 = i11 % 2;
            return zOnCreateWindow;
        } catch (Throwable th2) {
            kd.m2872(m2252(Color.argb(0, 0, 0, 0), (char) (Color.red(0) + 9231), Color.alpha(0) + 24).intern(), m2252((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 250, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 34292), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 36).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        int i10 = f2317 + 7;
        f2319 = i10 % 128;
        try {
            if (!(i10 % 2 == 0)) {
                this.f2321.onGeolocationPermissionsShowPrompt(str, callback);
                throw null;
            }
            this.f2321.onGeolocationPermissionsShowPrompt(str, callback);
            WebChromeClient webChromeClient = this.f2322;
            if (webChromeClient == null) {
                super.onGeolocationPermissionsShowPrompt(str, callback);
                return;
            }
            webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
            int i11 = f2319 + 61;
            f2317 = i11 % 128;
            if ((i11 % 2 == 0 ? (char) 14 : 'W') != 'W') {
                int i12 = 16 / 0;
            }
        } catch (Throwable th2) {
            kd.m2872(m2252(TextUtils.indexOf("", "", 0), (char) (9230 - TextUtils.indexOf((CharSequence) "", '0')), 23 - ImageFormat.getBitsPerPixel(0)).intern(), m2252(528 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 55).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        int i10 = f2317 + 67;
        f2319 = i10 % 128;
        try {
            if (!(i10 % 2 == 0)) {
                this.f2321.onHideCustomView();
                throw null;
            }
            this.f2321.onHideCustomView();
            int i11 = f2319 + 7;
            f2317 = i11 % 128;
            int i12 = i11 % 2;
            WebChromeClient webChromeClient = this.f2322;
            if (!(webChromeClient != null)) {
                super.onHideCustomView();
            } else {
                webChromeClient.onHideCustomView();
            }
        } catch (Throwable th2) {
            kd.m2872(m2252(1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9230), 24 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), m2252(213 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8), 37 - View.combineMeasuredStates(0, 0)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        int i10 = f2319 + 73;
        f2317 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f2321.onJsAlert(webView, str, str2, jsResult);
        } catch (Throwable th2) {
            kd.m2872(m2252(ViewConfiguration.getTouchSlop() >> 8, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 9231), 23 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), m2252(Drawable.resolveOpacity(0, 0) + 354, (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) + 30).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2322;
        if (!(webChromeClient != null)) {
            return super.onJsAlert(webView, str, str2, jsResult);
        }
        int i12 = f2319 + 105;
        f2317 = i12 % 128;
        int i13 = i12 % 2;
        return webChromeClient.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i10 = f2319 + 37;
        f2317 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2321.onJsConfirm(webView, str, str2, jsResult);
                throw null;
            }
            this.f2321.onJsConfirm(webView, str, str2, jsResult);
            WebChromeClient webChromeClient = this.f2322;
            if ((webChromeClient != null ? '0' : 'L') != '0') {
                return super.onJsConfirm(webView, str, str2, jsResult);
            }
            int i11 = f2317 + 81;
            f2319 = i11 % 128;
            if (i11 % 2 != 0) {
                webChromeClient.onJsConfirm(webView, str, str2, jsResult);
                throw null;
            }
            boolean zOnJsConfirm = webChromeClient.onJsConfirm(webView, str, str2, jsResult);
            int i12 = f2319 + 121;
            f2317 = i12 % 128;
            if ((i12 % 2 == 0 ? '6' : (char) 3) != '6') {
                return zOnJsConfirm;
            }
            throw null;
        } catch (Throwable th2) {
            kd.m2872(m2252(TextUtils.indexOf("", "", 0, 0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 9231), 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), m2252((ViewConfiguration.getEdgeSlop() >> 16) + 384, (char) Gravity.getAbsoluteGravity(0, 0), 32 - View.MeasureSpec.getSize(0)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        int i10 = f2319 + 51;
        f2317 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f2321.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        } catch (Throwable th2) {
            kd.m2872(m2252(Color.blue(0), (char) (9231 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 24 - TextUtils.indexOf("", "", 0)).intern(), m2252(416 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (10850 - (ViewConfiguration.getTouchSlop() >> 8)), 31 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2322;
        if (webChromeClient == null) {
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        int i12 = f2319 + 43;
        f2317 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public boolean onJsTimeout() {
        int i10 = f2317 + 49;
        f2319 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f2321.onJsTimeout();
                throw null;
            }
            this.f2321.onJsTimeout();
            WebChromeClient webChromeClient = this.f2322;
            if (webChromeClient == null) {
                return super.onJsTimeout();
            }
            int i11 = f2319 + 59;
            f2317 = i11 % 128;
            int i12 = i11 % 2;
            return webChromeClient.onJsTimeout();
        } catch (Throwable th2) {
            kd.m2872(m2252(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 9231), (ViewConfiguration.getTapTimeout() >> 16) + 24).intern(), m2252((ViewConfiguration.getLongPressTimeout() >> 16) + 820, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 45794), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        try {
            this.f2321.onPermissionRequest(permissionRequest);
            int i10 = f2319 + 111;
            f2317 = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2252(View.combineMeasuredStates(0, 0), (char) (9231 - View.MeasureSpec.getMode(0)), 24 - View.combineMeasuredStates(0, 0)).intern(), m2252(638 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 64021), TextUtils.indexOf("", "", 0, 0) + 40).intern(), th2, false);
        }
        try {
            WebChromeClient webChromeClient = this.f2322;
            if (webChromeClient != null) {
                int i12 = f2317 + 71;
                f2319 = i12 % 128;
                int i13 = i12 % 2;
                webChromeClient.onPermissionRequest(permissionRequest);
                return;
            }
            super.onPermissionRequest(permissionRequest);
            int i14 = f2317 + 57;
            f2319 = i14 % 128;
            int i15 = i14 % 2;
        } catch (Throwable th3) {
            kd.m2872(m2252(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (9231 - (Process.myTid() >> 22)), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m2252(678 - View.MeasureSpec.getMode(0), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 42 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), th3, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        try {
            this.f2321.onPermissionRequestCanceled(permissionRequest);
        } catch (Throwable th2) {
            kd.m2872(m2252(ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9230), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m2252(721 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((-1) - Process.getGidForName("")), (Process.myPid() >> 22) + 48).intern(), th2, false);
        }
        try {
            WebChromeClient webChromeClient = this.f2322;
            if (!(webChromeClient != null)) {
                super.onPermissionRequestCanceled(permissionRequest);
                int i10 = f2317 + 53;
                f2319 = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
            int i12 = f2317 + 121;
            f2319 = i12 % 128;
            int i13 = i12 % 2;
            webChromeClient.onPermissionRequestCanceled(permissionRequest);
        } catch (Throwable th3) {
            kd.m2872(m2252(TextUtils.indexOf("", "", 0), (char) (9231 - TextUtils.indexOf("", "")), 24 - Color.green(0)).intern(), m2252(770 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (TextUtils.getOffsetBefore("", 0) + 29040), 51 - Gravity.getAbsoluteGravity(0, 0)).intern(), th3, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        int i11 = f2319 + 37;
        f2317 = i11 % 128;
        try {
            if ((i11 % 2 == 0 ? '@' : (char) 1) != '@') {
                this.f2321.onProgressChanged(webView, i10);
            } else {
                this.f2321.onProgressChanged(webView, i10);
                int i12 = 33 / 0;
            }
        } catch (Throwable th2) {
            kd.m2872(m2252((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, (char) (9231 - (Process.myTid() >> 22)), View.MeasureSpec.makeMeasureSpec(0, 0) + 24).intern(), m2252((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24, (char) (Process.myPid() >> 22), 38 - TextUtils.indexOf("", "", 0, 0)).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2322;
        if (!(webChromeClient == null)) {
            webChromeClient.onProgressChanged(webView, i10);
            int i13 = f2319 + 69;
            f2317 = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        super.onProgressChanged(webView, i10);
        int i15 = f2317 + 75;
        f2319 = i15 % 128;
        int i16 = i15 % 2;
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        int i10 = f2319 + 19;
        f2317 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f2321.onReceivedIcon(webView, bitmap);
        } catch (Throwable th2) {
            kd.m2872(m2252((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9230), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25).intern(), m2252(ExpandableListView.getPackedPositionChild(0L) + 99, (char) (View.combineMeasuredStates(0, 0) + 3157), 36 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2322;
        if ((webChromeClient != null ? 'U' : '!') != 'U') {
            super.onReceivedIcon(webView, bitmap);
            return;
        }
        int i12 = f2317 + 87;
        f2319 = i12 % 128;
        boolean z10 = i12 % 2 != 0;
        webChromeClient.onReceivedIcon(webView, bitmap);
        if (z10) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z10) {
        int i10 = f2319 + 125;
        f2317 = i10 % 128;
        try {
            if ((i10 % 2 == 0 ? '!' : (char) 1) == '!') {
                this.f2321.onReceivedTouchIconUrl(webView, str, z10);
                throw null;
            }
            this.f2321.onReceivedTouchIconUrl(webView, str, z10);
            WebChromeClient webChromeClient = this.f2322;
            if (webChromeClient == null) {
                super.onReceivedTouchIconUrl(webView, str, z10);
                return;
            }
            int i11 = f2319 + 59;
            f2317 = i11 % 128;
            if ((i11 % 2 == 0 ? G5.T : (char) 31) != 31) {
                webChromeClient.onReceivedTouchIconUrl(webView, str, z10);
                throw null;
            }
            webChromeClient.onReceivedTouchIconUrl(webView, str, z10);
            int i12 = f2317 + 39;
            f2319 = i12 % 128;
            if (i12 % 2 == 0) {
            } else {
                throw null;
            }
        } catch (Throwable th2) {
            kd.m2872(m2252(TextUtils.getTrimmedLength(""), (char) (9230 - TextUtils.lastIndexOf("", '0', 0, 0)), 24 - (Process.myPid() >> 22)).intern(), m2252(134 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (Color.green(0) + 14086), (Process.myTid() >> 22) + 43).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        int i10 = f2317 + 23;
        f2319 = i10 % 128;
        if (i10 % 2 != 0) {
            try {
                if ((Build.VERSION.SDK_INT >= 34 ? '_' : 'V') != 'V') {
                    this.f2321.onShowFileChooser(webView, valueCallback, fileChooserParams);
                }
            } catch (Throwable th2) {
                kd.m2872(m2252(TextUtils.getOffsetBefore("", 0), (char) (ExpandableListView.getPackedPositionType(0L) + 9231), 24 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), m2252(1017 - TextUtils.indexOf("", "", 0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 38).intern(), th2, false);
            }
        } else {
            this.f2321.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        int i11 = f2317 + 51;
        f2319 = i11 % 128;
        int i12 = i11 % 2;
        WebChromeClient webChromeClient = this.f2322;
        if ((webChromeClient != null ? 'T' : 'Q') != 'T') {
            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        boolean zOnShowFileChooser = webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams);
        int i13 = f2317 + 81;
        f2319 = i13 % 128;
        int i14 = i13 % 2;
        return zOnShowFileChooser;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo812(String str, List<Object> list, ch chVar) {
        int i10 = f2319 + 83;
        f2317 = i10 % 128;
        int i11 = i10 % 2;
        byte b10 = -1;
        int iHashCode = str.hashCode();
        if (iHashCode != 1395849045) {
            if (iHashCode == 1442029578) {
                if ((str.equals(m2252(1056 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (65262 - Color.green(0)), TextUtils.getOffsetBefore("", 0) + 25).intern()) ? (char) 24 : '4') == 24) {
                    int i12 = f2317 + 99;
                    f2319 = i12 % 128;
                    b10 = i12 % 2 != 0 ? (byte) 1 : (byte) 0;
                }
            }
        } else if (str.equals(m2252(1080 - ExpandableListView.getPackedPositionGroup(0L), (char) (43736 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 19 - Process.getGidForName("")).intern())) {
            int i13 = f2319;
            int i14 = i13 + 35;
            f2317 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i13 + 111;
            f2317 = i16 % 128;
            int i17 = i16 % 2;
        }
        if (b10 == 0) {
            return m2251();
        }
        if (b10 != 1) {
            return null;
        }
        return m2250();
    }

    public hi(WebChromeClient webChromeClient, WebChromeClient webChromeClient2) {
        this.f2322 = webChromeClient;
        this.f2321 = webChromeClient2;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        int i11 = f2319 + 109;
        f2317 = i11 % 128;
        int i12 = i11 % 2;
        try {
            this.f2321.onShowCustomView(view, i10, customViewCallback);
        } catch (Throwable th2) {
            kd.m2872(m2252(1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (9231 - Color.argb(0, 0, 0, 0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23).intern(), m2252(176 - ExpandableListView.getPackedPositionType(0L), (char) (MotionEvent.axisFromString("") + 17939), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 37).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2322;
        if (webChromeClient == null) {
            super.onShowCustomView(view, i10, customViewCallback);
            return;
        }
        int i13 = f2319 + 115;
        f2317 = i13 % 128;
        char c10 = i13 % 2 == 0 ? '\r' : '9';
        webChromeClient.onShowCustomView(view, i10, customViewCallback);
        if (c10 == '9') {
        } else {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        int i10 = f2319 + 27;
        f2317 = i10 % 128;
        try {
            if ((i10 % 2 == 0 ? (char) 17 : (char) 18) != 18) {
                this.f2321.onConsoleMessage(consoleMessage);
                int i11 = 25 / 0;
            } else {
                this.f2321.onConsoleMessage(consoleMessage);
            }
        } catch (Throwable th2) {
            kd.m2872(m2252(View.MeasureSpec.getSize(0), (char) (9231 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 24 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), m2252((ViewConfiguration.getScrollDefaultDelay() >> 16) + 852, (char) (View.MeasureSpec.getSize(0) + 46049), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36).intern(), th2, false);
        }
        WebChromeClient webChromeClient = this.f2322;
        if ((webChromeClient == null ? '7' : (char) 24) != '7') {
            int i12 = f2317 + 39;
            f2319 = i12 % 128;
            int i13 = i12 % 2;
            return webChromeClient.onConsoleMessage(consoleMessage);
        }
        boolean zOnConsoleMessage = super.onConsoleMessage(consoleMessage);
        int i14 = f2317 + 85;
        f2319 = i14 % 128;
        int i15 = i14 % 2;
        return zOnConsoleMessage;
    }
}
