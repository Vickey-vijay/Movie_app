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
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.G5;
import com.ironsource.InterfaceC3382ae;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class dq {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1816 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f1817;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f1818;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1819;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map<ed, ed> f1820;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Map<fr, fr> f1821;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private int f1822 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1823;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1824;

    public interface b<T> {
        /* JADX INFO: renamed from: ﾒ */
        T mo2080(List<dy> list);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private fr m2049(List<dy> list) {
        m2077(list, m2061(Color.argb(0, 0, 0, 0), (char) (14612 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), m2061(399 - ImageFormat.getBitsPerPixel(0), (char) (42102 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
        fk fkVarM2044 = m2044(list);
        m2077(list, m2061(444 - (Process.myPid() >> 22), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4).intern(), m2061((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 449, (char) (59340 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 53 - ExpandableListView.getPackedPositionGroup(0L)).intern());
        m2077(list, m2061((ViewConfiguration.getFadingEdgeLength() >> 16) + 110, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m2061(502 - View.MeasureSpec.getSize(0), (char) KeyEvent.keyCodeFromString(""), 40 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
        dy dyVarM2036 = m2036(list);
        m2069(dyVarM2036, dy.d.f1910, fkVarM2044, m2061((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 543, (char) Color.alpha(0), 27 - Color.alpha(0)).intern());
        ek ekVar = (ek) m2054(new ek(dyVarM2036.m2127(), dm.m2010(this.f1824, dyVarM2036.m2128())));
        m2077(list, m2061((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 151, (char) KeyEvent.keyCodeFromString(""), 1 - Color.alpha(0)).intern(), m2061(570 - KeyEvent.keyCodeFromString(""), (char) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getScrollBarSize() >> 8) + 39).intern());
        m2077(list, m2061(ExpandableListView.getPackedPositionType(0L), (char) (14612 - (Process.myPid() >> 22)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), m2061(610 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (25235 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 46 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
        fr frVarM2067 = m2067(new fw(fkVarM2044, m2044(list), ekVar));
        int i10 = f1819 + 73;
        f1816 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return frVarM2067;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private fr m2050(List<dy> list) {
        fr frVarM2067 = m2067(new fu(m2068(list, m2061(43 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (Process.myPid() >> 22), KeyEvent.keyCodeFromString("") + 1).intern(), new b<ed>() { // from class: com.ironsource.adqualitysdk.sdk.i.dq.5

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char[] f1832 = {'E', 'x', 'p', 'e', 'c', 't', 'd', ' ', 'v', 'a', 'r', 'i', 'b', 'l', 'u', 'F'};

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f1833 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char f1834 = 4;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1835;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m2083(String str, int i10, byte b10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2129) {
                    char[] cArr2 = f1832;
                    char c10 = f1834;
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

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private ed m2084(List<dy> list2) {
                int i10 = f1833 + 43;
                f1835 = i10 % 128;
                int i11 = i10 % 2;
                ed edVarM2079 = dq.this.m2079(list2);
                if (!(edVarM2079 instanceof ek)) {
                    int i12 = f1833 + 17;
                    f1835 = i12 % 128;
                    if (i12 % 2 != 0) {
                        boolean z10 = edVarM2079 instanceof dw;
                        throw null;
                    }
                    if ((edVarM2079 instanceof dw ? (char) 24 : ',') == ',') {
                        dq dqVar = dq.this;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m2083("\u0001\u0002\u0003\u0000\u0005\u0006\u0002\u0007\u0004\u000b\n\u000b\b\n\r\u000e\u0007\u000b\r\u000f\u0006\u0004\u000b\u0002\u0007\u0000\b\t\u0002\u0007r", 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 82)).intern());
                        sb2.append(edVarM2079);
                        dq.m2057(dqVar, sb2.toString());
                        return null;
                    }
                }
                return edVarM2079;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.dq.b
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ ed mo2080(List list2) {
                int i10 = f1833 + 19;
                f1835 = i10 % 128;
                int i11 = i10 % 2;
                ed edVarM2084 = m2084(list2);
                int i12 = f1833 + 107;
                f1835 = i12 % 128;
                if ((i12 % 2 != 0 ? '0' : 'X') == 'X') {
                    return edVarM2084;
                }
                throw null;
            }
        })));
        int i10 = f1816 + 103;
        f1819 = i10 % 128;
        if ((i10 % 2 != 0 ? '^' : (char) 17) == 17) {
            return frVarM2067;
        }
        int i11 = 83 / 0;
        return frVarM2067;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m2057(dq dqVar, String str) {
        int i10 = f1819 + 81;
        f1816 = i10 % 128;
        int i11 = i10 % 2;
        dqVar.m2070(str);
        int i12 = f1816 + 103;
        f1819 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private fr m2060(List<dy> list) {
        int i10 = f1816 + 9;
        f1819 = i10 % 128;
        int i11 = i10 % 2;
        m2077(list, m2061(110 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Process.myPid() >> 22), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern(), m2061(View.MeasureSpec.makeMeasureSpec(0, 0) + 111, (char) (28028 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40).intern());
        ed edVarM2079 = m2079(list);
        m2058(list, m2061(152 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) View.MeasureSpec.getSize(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), edVarM2079, m2061((ViewConfiguration.getWindowTouchSlop() >> 8) + 152, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 43 - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
        fr frVarM2074 = m2074(list);
        fr frVarM2075 = null;
        if (m2037(list)) {
            if (!(m2038(list).m2130(m2061(TextUtils.indexOf("", "") + 196, (char) TextUtils.indexOf("", ""), (Process.myTid() >> 22) + 4).intern()) ? false : true)) {
                int i12 = f1816 + 25;
                f1819 = i12 % 128;
                int i13 = i12 % 2;
                this.f1822++;
                frVarM2075 = m2074(list);
                int i14 = f1816 + 51;
                f1819 = i14 % 128;
                int i15 = i14 % 2;
            }
        }
        return m2067(new fq(edVarM2079, frVarM2074, frVarM2075));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2063() {
        char[] cArr = new char[1307];
        ByteBuffer.wrap("9o\u0000mûÀ÷>ò\u0087îûê]åþááÝGØ©Ô\u000bÐ7ËÏÇ\tÃi¾Þº<µ\u0091±º\u00ad]¨\u0081¤© O\u009bó\u0097\u001b\u0093r\u008e¯\u008a\u0017\u0086c\u0081Ä}8x\u009ft\u0080p6k\u009egîc@^¼Z\u0013VFQ¦M\u0019\u0000;\rÒöx\u0018Hãäï\u0016\u0000wûÍ÷#ò\u0083îñ\u0000rûÀ÷>ò\u009aîæêW\u0000bû×÷/ò\u008eîÿ\u0000cûÊ÷$ò\u009bîýêWå«áæ\u0000tû×÷3\u0004aÿÓó/ÈÙ3x?\u008d:(&I\"ã-\r)\u0017\u0015»\u0010B\u001cá\u0018\u0083\u0003i\u000f¡\u000b\u0092vzr\u008a}%y\u000eeä`6l\u001dhéS\u0013_\u00ad[ÝF\u0013B¾NÝIkµ\u0096\u0000(m\u0015\u0096¿\u009a\u0016\u009fà\u0083\u009c\u0087$\u0088Ö\u008c\u009a°9µÔ¹`½\u001f¦àªn®\u0012Ó¸×YØåÜ\u0082ÀcÅúÉ\u0090ÍröÉúkþ\rãÒçtë\u0007ì¨\u0010N\u0015§\u0019¾\u001d@\u0006¶\n\u0092\u000eh3\u00827*;x\u0000)\u0000iûÃ÷jò\u009cîàêXåªáæÝEØ¨Ô\u001cÐcË\u009cÇ\u0002Ãi¾Åº4µ\u009c±î\u00adV¨\u008b¤ç \u000e\u009b \u0097\u0010\u0093r\u008e·\u008a\u000b\u0086h\u0081\u0091}4x\u009et\u0080p,k\u0084güc]^½Z\u001bV\u0003QïMEI;D\u0090\u0000eûÉ÷9ò\u008a\u0000fûÊ÷8òÏîçêMå¿á÷ÝMØ Ô\u0017ÐyËÈÇAÃu¾Ãº?µ\u0080±ö\u00ad[¨Ä¤ë K\u009bó\u0097\u001e\u0093r\u008e®\u008a\u000b\u0086c\u0081Æ}3x\u009ft\u0080p'k\u0093g¯cU^ùZYV\u000bQïý\u0005\u0006©\n[\u000f¬\u0013\u0094\u00175\u0018Ó\u001c\u0084 \"%Ú)x-\u001b6±:\">\u0016C G\\HãL\u0095P8U§Y\u008f]#fÔj;n\tsÈwp{\u0007|ò\u0080\u0012\u0085£\u0089ä\u000eÃõyù\u0092ü*àWäûë\u0013ïCÓ¤Ö\u0004Ú¦ÞËÅbÉ¨ÍÙ°t´\u0095»6¿X£³¦;ªM®í\u0095\n\u0099¸\u009dÕ\u0080N\u0084®\u0088Î\u008fysÚv ze~\u009de.i\u0003\u0000wûÍ÷#ò\u0083îñê\u0019å\u00adá÷ÝIØ¹Ô\u0017ÐzËÙÇ\u000fÃr¾\u008bº#µ\u009d±õ\u00adJ¨\u0088¤í \u000e\u009b±\u0097\u001d\u0093=\u008e¤\u008a\b\u0086`\u0081Ý}9x\u008ctÅp!kÊgícM^ùZ\u001fV\u0003QïMEI5\u000fØôbø\u008cý,á^å¶ê\u0002îXÒæ×\u0016Û¸ßÕÄvÈ ÌÝ±$µ\u009cº5¾[¢ô§\"«R¯è\u0094\u0013\u0098¹\u009c\u0092\u0081\u001e\u0085 \u0089Ì\u008ekr\u0095w0{/\u007f\u0088d h\u0000lòQ\u0018U¢Yå^\u0003B§F\u009dK?OÛ3\u00878.¤\u0002_¡SEV¹J\u0091N;AÉE\u0081y;|Öpat\u000fo¾c7g\u001d\u001a¨\u001eU\u0011÷\u0015Ì\t+\f÷\u0000ß\u0004;?Ê3c7\u001b*Û.d\"\u0014%£Ù\u0000Ü¥Ð¿Ô]ÏïÃ\u0090Ç&úÊþ(òrõÅéfíCàè\u0000cûÄ÷>ò\u008cîüç¿\u001c\u001c\u0010ø\u0015\u0004\t,\r\u0086\u0002t\u0006<:\u0086?k3Ü7²,\u0003 \u008a$¾Y\b]ôRKV=J\u0090O\u000fC G\u0080|8pÕt¹iemÀa¨f\r\u009aø\u009fT\u0093K\u0097ì\u008cX\u0080d\u0084\u009e¹2½Ö±\u0089¶wªÅ®±£\\§äÛ¾Ð\fÔôÉ^Í3Á\u0094Æzú;\u0000cûÄ÷>ò\u008cîüê\u0019åµáæÝQØºÔ\u001dÐeËØÇAÃu¾Ãº?µ\u0080±ö\u00ad[¨Ä¤ë K\u009bó\u0097\u001e\u0093r\u008e®\u008a\u000b\u0086c\u0081Æ}3x\u009ft\u0080p'k\u0093g¯cU^ùZYV\u000bQï\u0000mûÌ÷9ò\u009cîýêWå¹á£ÝKØ¬Ô\u0006ÐtËÔÇAÃp¾Êº\"µ\u009c±û\u00ad]¨\u0088¤ì \u000e\u009b½\u0097\u0019\u0093p\u008e§\u0000cûÄ÷>ò\u008cîüê\u0019å®áâÝZØ¬Ô\u001fÐ7ËÏÇ\tÃi¾Þº<µ\u0091±º\u00ad]¨\u0081¤© H\u009b¼\u0097\u0014\u0093q\u008e\u00ad\u008a\u0010\u0086i\u0081Õ}vx\u0099tÙpek\u008bg¯c\u0013^ðZYbð\u0099W\u0095\u00ad\u0090\u001f\u008co\u0088\u008a\u0087>\u0083d¿Úº*¶\u0084²é©J¥\u009c¡áÜ\u0018Ø®×\u0013ÓzÏØÊWÆxÂØù`õ\u0088ñáì<è\u0084äðãW\u001f«\u001a\f\u0016\u0013\u0012þ\t\u0010\u0005r\u0001Ô<#8\u00894Õ3{/Ù+ú&Y\"è^»\u0000rûÀ÷>ò\u009aîæêWåþáðÝ\\Ø¬Ô\u0006ÐrËÑÇ\u0004Ãh¾ßºpµ\u0086±ò\u00adP¨\u0091¤å J\u009bó\u0097\u001d\u0093s\u008e¦\u008aG\u0086{\u0081Ø}\"x\u0093t\u0080pbkÑg¨Òê)_%§ \u0006<w8\u00917%3\u007f\u000fÁ\n1\u0006\u009f\u0002ò\u0019Q\u0015\u0087\u0011úl\u0003h«g\u0015c}\u007fÂz\u0000ver\u0086I>E\u009eAñ\\jX\u0098TíSM¯¶ªS¦\u000f¢ö¹E\u0000cûÊ÷$ò\u009bîýêWå«áæÝ\bØ¾Ô\u0006ÐvËÈÇ\u0004Ãk¾Îº>µ\u0081±º\u00adL¨\u008c¤æ [\u009b¿\u0097\u001c\u0093=\u008e§\u008a\t\u0086h\u0081\u0091}!x\u0092tÔp-kÊg¨c\u000f^þ\u0000}\u0082>y\u009b\u0000|ûÙ\u0000=û\u0098\u00053þ\u008au:\u0012~\u0000<û\u0098\u0000>û\u0098\u009e\u008bG\u0087 \u009b[>\u0000-û\u0088\u0000*CÄ\u0000%¾|\u0000[\u0000=\u0007&\u0000mûÌ÷9ò\u009cîýêWå¹á£ÝKØ¡Ô\u001dÐdËÕÇ\u000fÃa¾\u008bºwµÜ±½\u0000]ò\u0096\t\b\u0005ì\u0000T\u001c'\u0018\u009f\u0017~\u00134/\u008e*j&\u0091\"»9\u000f5Ç1·L\tHçGYC+_Ü\u001egåùé\u001dì¥ðÖônû\u008fÿÅÃ\u007fÆ\u009bÊ`ÎQÕáÙ8ÝQ ÷¤B\u0000CûÄ÷?ò\u0088îüêMåþáæÝPØ®Ô\u0017ÐgËÈÇ\bÃi¾Åûk\u0000ó\f\u0014\t¤\u0015Ù\u0011c\u001e\u0095\u001aÉ&&#\u008a/8+\\0ü<;8AEãA\u0017N¾JÆV1S¨_Ò[t`Ýl1h\\u\u0098qi\u0000rûÀ÷,ò\u0083îñêZåªáêÝGØ£ÔRÐtËÐÇ\u0000Ãu¾Øºpµ\u009b±û\u00adR¨\u0081¤ú \u000e\u009b \u0097\u0010\u0093r\u008e·\u008a\u000b\u0086h\u0081\u0091}4x\u009et\u0080p#k\u0085gãcX^¶Z\tVFQ¬MMIpDÎ@|<h7È3=.\u009f*ö&[!«\u001dí\u0019F\u0014 \u0010S\f?\u0007\u0095\u0003Lÿ)ú\u0082öxñÑ\u0097Ëlh`\u0090e$yO}ór\u000fvKJäOUC¹GÇ\\kP¬TÒ)w-È\"/&G:§??3]7ù\f\u0018\u0000¥\u0004Á\u0019Z\u001d¨\u0011Ý\u0016}ê\u0086ïcã?ç üu\u0000nûÐ÷&ò\u0083\u0000sûÐ÷:ò\u008aîæeÝ\u009e~\u0092\u0094\u0097$\u008bH\u008f·\u0080\u0003\u0084E¸é½\u0016±°µÝ®2¢\u00ad¦ÍÛ%ß\u0098Ð4ÔXÈýÍ%ÁPÅåþ\u0019òööÑë\u0015ïéãÃä?\u0018\u0095\u001d0\u0011z\u0015\u0083\u000e+\u0002E\u0006º;\u001e?¾3û4\t( ,Ý!m%\u009bYÀRfÔÎ/V#±&\u0001:|>Æ105l\t\u0083\f\u0015\u0000\u008d\u0004î\u001f^\u0013\u0084\u0017êj\u0000n¹a\u000beey\u0094|\bpmtÑOx\u0000:\u0000jûÖ÷%ò\u0081î´êRå»áúÝ\bØ¾Ô\u001aÐxËÉÇ\rÃb¾\u008bº2µ\u0090±º\u00adY¨\u008b¤å B\u009b¼\u0097\u000f\u0093x\u008e¦\u008aG\u0086n\u0081È}vx\u009at\u0080p3k\u008bgãcA^¼Z^VBQ®M\u0019IwDÅ@|<&7\u009c3l\u0000,\u0000lûÌ÷9ò\u009bî´êJå¶áìÝ]Ø¡Ô\u0016Ð7ËÙÇ\u000fÃb¾\u008bº'µ\u009c±î\u00adW¨Ä¤®\u0003ÄÊ\u00111\u008f=k8Ó$  \u0018/ù+³\u0017\t\u0012í\u001e\u0016\u001a6\u0001\u0096\rA\tbt\u0080pr\u007f\u0091{ªg\u0014bËn¨j\u0004Qä\u0000EûÝ÷)ò\u008aîäêMå·áìÝFØíÔ\u0005Ð\u007fËÕÇ\rÃc¾\u008bº7µ\u0090±î\u00adK¨\u008d¤ç I\u009bó\u0097\u0016\u0093x\u008eº\u008a\u0013\u0086,\u0081Å}9x\u0090tÅp+\u001fúäbè\u0096í5ñ[õòú\bþSÂùÇRËºÏÀÔjØ²ÜÜ¡4¥\u009fª/®@²ë·2»X¿ö\u0084L\u0088¦\u008cÖ\u0091]\u0095¶\u0099Ö\u009evb\u009dgdkko\u0095t>xU|åÂF9¢5J0ý,\u0097(-'\u0098\u0000EûÝ÷:ò\u008aî÷êMå»áçÝ\b\u0000 ûÇ÷?ò\u009bî´êKå»áàÝMØ¤Ô\u0004ÐrËØÇAÔR/ú#\u0018\u0000PûÄ÷8ò\u009cîñêKåñ\u0000PûÄ÷8ò\u009cîýêWå¹á£ÝNØ¬Ô\u001bÐ{ËÙÇ\u0005Ã&¾Ïº%µ\u0090±º\u00adK¨\u008b¤© K\u009b¡\u0097\n\u0093r\u008e°\u008a\u0014".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1307);
        f1817 = cArr;
        f1818 = -5462852528441525339L;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Pair m2064(dq dqVar, List list) {
        int i10 = f1819 + 115;
        f1816 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        Pair<String, ed> pairM2043 = dqVar.m2043(list);
        if (!z10) {
            int i11 = 78 / 0;
        }
        return pairM2043;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ ed m2072(dq dqVar, List list) {
        int i10 = f1819 + 81;
        f1816 = i10 % 128;
        int i11 = i10 % 2;
        ed edVarM2040 = dqVar.m2040(list);
        int i12 = f1816 + 47;
        f1819 = i12 % 128;
        int i13 = i12 % 2;
        return edVarM2040;
    }

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    private dy m2036(List<dy> list) {
        int i10 = f1816 + 87;
        f1819 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                m2037(list);
                throw null;
            }
            if ((m2037(list) ? 'X' : '3') != 'X') {
                m2071(m2061(Color.alpha(0) + 1144, (char) (51780 - (ViewConfiguration.getTapTimeout() >> 16)), Color.rgb(0, 0, 0) + 16777240).intern(), (Throwable) null);
                return null;
            }
            int i11 = this.f1822;
            this.f1822 = i11 + 1;
            dy dyVar = list.get(i11);
            int i12 = f1816 + 17;
            f1819 = i12 % 128;
            if ((i12 % 2 != 0 ? '&' : '*') != '&') {
                return dyVar;
            }
            throw null;
        } catch (Exception e10) {
            m2071(m2061((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1168, (char) Drawable.resolveOpacity(0, 0), 34 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), e10);
        }
    }

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    private boolean m2037(List<dy> list) {
        int i10 = f1819 + 105;
        f1816 = i10 % 128;
        int i11 = i10 % 2;
        if ((this.f1822 < list.size() ? 'b' : (char) 0) == 0) {
            return false;
        }
        int i12 = f1819 + 115;
        f1816 = i12 % 128;
        if (i12 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    private dy m2038(List<dy> list) {
        int i10 = f1816 + 75;
        f1819 = i10 % 128;
        int i11 = i10 % 2;
        try {
            if (m2037(list)) {
                int i12 = f1819 + 73;
                f1816 = i12 % 128;
                int i13 = i12 % 2;
                return list.get(this.f1822);
            }
            int i14 = f1819 + 11;
            f1816 = i14 % 128;
            int i15 = i14 % 2;
            return null;
        } catch (Exception e10) {
            m2071(m2061((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + InterfaceC3382ae.a.f28169c, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8126), ExpandableListView.getPackedPositionType(0L) + 37).intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private Map<String, ed> m2039(List<dy> list) {
        HashMap map = new HashMap();
        Iterator it = m2068(list, m2061(764 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (KeyEvent.getMaxKeyCode() >> 16), View.getDefaultSize(0, 0) + 1).intern(), new b<Pair<String, ed>>() { // from class: com.ironsource.adqualitysdk.sdk.i.dq.3
            @Override // com.ironsource.adqualitysdk.sdk.i.dq.b
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ Pair<String, ed> mo2080(List list2) {
                return dq.m2064(dq.this, list2);
            }
        }).iterator();
        int i10 = f1816 + 45;
        f1819 = i10 % 128;
        while (true) {
            int i11 = i10 % 2;
            if ((it.hasNext() ? (char) 0 : 'S') == 'S') {
                return map;
            }
            int i12 = f1816 + 95;
            f1819 = i12 % 128;
            int i13 = i12 % 2;
            Pair pair = (Pair) it.next();
            map.put(pair.first, pair.second);
            i10 = f1816 + 5;
            f1819 = i10 % 128;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:94:0x0252  */
    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private ed m2040(List<dy> list) {
        byte b10;
        byte b11;
        try {
            dy dyVarM2036 = m2036(list);
            dm dmVarM2010 = dm.m2010(this.f1824, dyVarM2036.m2128());
            if ((dyVarM2036.m2119() ? 'O' : 'Y') != 'Y') {
                int i10 = f1816 + 11;
                f1819 = i10 % 128;
                int i11 = i10 % 2;
                String strM2127 = dyVarM2036.m2127();
                String strM2128 = m2036(list).m2127();
                int iHashCode = strM2128.hashCode();
                if (iHashCode == 40) {
                    if ((strM2128.equals(m2061(110 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) Color.green(0), 1 - View.combineMeasuredStates(0, 0)).intern()) ? 'T' : (char) 3) != 'T') {
                        b11 = -1;
                    } else {
                        int i12 = f1819 + 35;
                        f1816 = i12 % 128;
                        int i13 = i12 % 2;
                        b11 = 1;
                    }
                } else if (iHashCode == 61 && strM2128.equals(m2061(790 - View.resolveSize(0, 0), (char) TextUtils.indexOf("", "", 0), 1 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    b11 = 0;
                } else {
                    b11 = -1;
                }
                if (b11 == 0) {
                    return m2054(new dw((ek) m2054(new ek(strM2127, dmVarM2010)), m2079(list), dmVarM2010));
                }
                if (b11 != 1) {
                    this.f1822--;
                    return m2054(new ek(strM2127, dmVarM2010));
                }
                ed edVarM2054 = m2054(new ea(strM2127, m2062(list, m2061(View.getDefaultSize(0, 0) + 151, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern()), dmVarM2010));
                int i14 = f1819 + 31;
                f1816 = i14 % 128;
                if (i14 % 2 != 0) {
                    return edVarM2054;
                }
                int i15 = 47 / 0;
                return edVarM2054;
            }
            if (dyVarM2036.m2125()) {
                int i16 = f1816 + 45;
                f1819 = i16 % 128;
                int i17 = i16 % 2;
                return m2065(dyVarM2036);
            }
            if (dyVarM2036.m2123()) {
                return m2054(new dv(dyVarM2036.m2127(), dmVarM2010));
            }
            if (dyVarM2036.m2118()) {
                int i18 = f1819 + 21;
                f1816 = i18 % 128;
                int i19 = i18 % 2;
                return m2073(dyVarM2036, list);
            }
            if (!dyVarM2036.m2121()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2061((ViewConfiguration.getPressedStateDuration() >> 16) + 832, (char) (7730 - TextUtils.getCapsMode("", 0, 0)), 17 - View.MeasureSpec.getSize(0)).intern());
                sb2.append(dyVarM2036);
                m2070(sb2.toString());
                return null;
            }
            int i20 = f1819 + 33;
            f1816 = i20 % 128;
            int i21 = i20 % 2;
            String strM2129 = dyVarM2036.m2127();
            int iHashCode2 = strM2129.hashCode();
            if (iHashCode2 != 33) {
                if (iHashCode2 == 40) {
                    if ((strM2129.equals(m2061(TextUtils.lastIndexOf("", '0', 0, 0) + 111, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 1 - ExpandableListView.getPackedPositionType(0L)).intern()) ? (char) 2 : (char) 14) != 2) {
                        b10 = -1;
                    } else {
                        int i22 = f1819 + 79;
                        f1816 = i22 % 128;
                        int i23 = i22 % 2;
                    }
                } else if (iHashCode2 != 45) {
                    if (iHashCode2 != 91) {
                        if (iHashCode2 == 123 && strM2129.equals(m2061(ViewConfiguration.getTapTimeout() >> 16, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 14612), -ImageFormat.getBitsPerPixel(0)).intern())) {
                            int i24 = f1816 + 61;
                            f1819 = i24 % 128;
                            b10 = i24 % 2 != 0 ? (byte) 4 : (byte) 2;
                        } else {
                            b10 = -1;
                        }
                    } else if (strM2129.equals(m2061(Color.green(0) + 789, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), View.resolveSize(0, 0) + 1).intern())) {
                        int i25 = f1816 + 41;
                        f1819 = i25 % 128;
                        b10 = i25 % 2 != 0 ? (byte) 0 : (byte) 1;
                    } else {
                        b10 = -1;
                    }
                } else if (!strM2129.equals(m2061(TextUtils.indexOf("", "", 0) + 780, (char) (18394 - AndroidCharacter.getMirror('0')), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    b10 = -1;
                }
            } else if (strM2129.equals(m2061((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 790, (char) (1798 - ExpandableListView.getPackedPositionChild(0L)), (Process.myTid() >> 22) + 1).intern())) {
                b10 = 3;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                ed edVarM2055 = m2054(new eh(m2079(list), dmVarM2010));
                m2058(list, m2061(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 152, (char) KeyEvent.getDeadChar(0, 0), 1 - Color.red(0)).intern(), edVarM2055, m2061((-16776424) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 18 - ImageFormat.getBitsPerPixel(0)).intern());
                return edVarM2055;
            }
            if (b10 == 1) {
                return m2054(new dx(m2062(list, m2061(Color.green(0) + 811, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), ExpandableListView.getPackedPositionType(0L) + 1).intern()), dmVarM2010));
            }
            if (b10 == 2) {
                return m2054(new eb(m2039(list), dmVarM2010));
            }
            if (b10 == 3) {
                return m2054(new fb(m2042(list), dmVarM2010));
            }
            if (b10 == 4) {
                return m2054(new ex(m2054(new fg(0, dmVarM2010)), m2040(list), dmVarM2010));
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2061(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 813, (char) ((Process.myTid() >> 22) + 62147), TextUtils.getOffsetBefore("", 0) + 20).intern());
            sb3.append(dyVarM2036.m2127());
            m2070(sb3.toString());
            return null;
        } catch (Exception e10) {
            m2071(m2061((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 849, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), Color.blue(0) + 16).intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private Pair<String, ed> m2043(List<dy> list) {
        int i10 = f1819 + 39;
        f1816 = i10 % 128;
        int i11 = i10 % 2;
        dy dyVarM2036 = m2036(list);
        if (!dyVarM2036.m2129()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2061(1047 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (MotionEvent.axisFromString("") + 54412), 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
            sb2.append(dyVarM2036);
            m2071(sb2.toString(), (Throwable) null);
            int i12 = f1816 + 95;
            f1819 = i12 % 128;
            int i13 = i12 % 2;
        }
        String strM2127 = dyVarM2036.m2127();
        m2058(list, m2061((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + com.ironsource.mediationsdk.demandOnly.j.a.f29734j, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), Color.red(0) + 1).intern(), strM2127, m2061(1072 - KeyEvent.keyCodeFromString(""), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 48 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
        return new Pair<>(strM2127, m2079(list));
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private fk m2044(List<dy> list) {
        ArrayList arrayList = new ArrayList();
        dy dyVarM2038 = m2038(list);
        int i10 = f1819 + 1;
        f1816 = i10 % 128;
        int i11 = i10 % 2;
        while (true) {
            if ((dyVarM2038.m2130(m2061(MotionEvent.axisFromString("") + 765, (char) TextUtils.getOffsetBefore("", 0), 1 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern()) ? (char) 14 : (char) 0) != 0) {
                this.f1822++;
                return (fk) m2067(new fk(arrayList));
            }
            int i12 = f1816 + 81;
            f1819 = i12 % 128;
            int i13 = i12 % 2;
            arrayList.add(m2074(list));
            dyVarM2038 = m2038(list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0168  */
    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private ed m2045(List<dy> list) {
        ed edVarM2048 = m2048(list);
        byte b10 = 0;
        if (!m2037(list)) {
            return edVarM2048;
        }
        dm dmVarM2010 = dm.m2010(this.f1824, edVarM2048.m2145());
        String strM2127 = m2036(list).m2127();
        int iHashCode = strM2127.hashCode();
        if (iHashCode == 60) {
            if ((strM2127.equals(m2061(774 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-16747258) - Color.rgb(0, 0, 0)), -TextUtils.indexOf((CharSequence) "", '0', 0)).intern()) ? ',' : 'C') != 'C') {
                int i10 = f1819 + 75;
                f1816 = i10 % 128;
                int i11 = i10 % 2;
                b10 = 2;
            } else {
                b10 = -1;
            }
        } else if (iHashCode != 62) {
            if (iHashCode != 1084) {
                if (iHashCode == 1921) {
                    if ((strM2127.equals(m2061(775 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), 2 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern()) ? (byte) 1 : (byte) 0) != 1) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                } else if (iHashCode != 1952) {
                    if (iHashCode == 1983 && strM2127.equals(m2061(776 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), Color.red(0) + 2).intern())) {
                        b10 = 5;
                    } else {
                        b10 = -1;
                    }
                } else if (strM2127.equals(m2061(769 - (ViewConfiguration.getScrollBarSize() >> 8), (char) Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 3).intern())) {
                    int i12 = f1819 + 33;
                    f1816 = i12 % 128;
                    if (i12 % 2 == 0) {
                        b10 = 1;
                    }
                } else {
                    b10 = -1;
                }
            } else if (strM2127.equals(m2061(771 - TextUtils.getOffsetBefore("", 0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1297), 1 - ImageFormat.getBitsPerPixel(0)).intern())) {
                int i13 = f1816 + 1;
                f1819 = i13 % 128;
                if (i13 % 2 == 0) {
                    b10 = 1;
                }
            } else {
                b10 = -1;
            }
        } else if (strM2127.equals(m2061(775 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (4672 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 1).intern())) {
            int i14 = f1819 + 115;
            f1816 = i14 % 128;
            int i15 = i14 % 2;
            b10 = 3;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            return m2054(new er(edVarM2048, m2045(list), dmVarM2010));
        }
        if (b10 == 1) {
            return m2054(new ez(edVarM2048, m2045(list), dmVarM2010));
        }
        if (b10 == 2) {
            return m2054(new eu(edVarM2048, m2045(list), dmVarM2010));
        }
        if (b10 == 3) {
            return m2054(new et(edVarM2048, m2045(list), dmVarM2010));
        }
        if (b10 == 4) {
            return m2054(new ew(edVarM2048, m2045(list), dmVarM2010));
        }
        if (b10 == 5) {
            return m2054(new eq(edVarM2048, m2045(list), dmVarM2010));
        }
        this.f1822--;
        int i16 = f1816 + 51;
        f1819 = i16 % 128;
        int i17 = i16 % 2;
        return edVarM2048;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (m2037(r15) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.dm.m2010(r14.f1824, r0.m2145());
        r5 = m2036(r15).m2127();
        r6 = r5.hashCode();
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r6 == 43) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r6 == 45) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r6 == 1376) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r6 == 1440) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r5.equals(m2061(782 - android.text.TextUtils.lastIndexOf("", '0', 0, 0), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2).intern()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r5 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r5.equals(m2061(782 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), (char) (41135 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0')), 1 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0')).intern()) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (r5.equals(m2061(android.view.View.resolveSize(0, 0) + 780, (char) (18346 - android.text.TextUtils.indexOf("", "", 0, 0)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern()) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
    
        r5 = '4';
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        r5 = '\t';
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        if (r5 == '\t') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        r5 = com.ironsource.adqualitysdk.sdk.i.dq.f1816 + 37;
        com.ironsource.adqualitysdk.sdk.i.dq.f1819 = r5 % 128;
        r5 = r5 % 2;
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0102, code lost:
    
        if (r5.equals(m2061(779 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 40609), -android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0)).intern()) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0104, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0105, code lost:
    
        if (r9 == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0107, code lost:
    
        if (r9 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0109, code lost:
    
        if (r9 == 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:
    
        if (r9 == 3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010d, code lost:
    
        r14.f1822--;
        r15 = com.ironsource.adqualitysdk.sdk.i.dq.f1819 + 11;
        com.ironsource.adqualitysdk.sdk.i.dq.f1816 = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011b, code lost:
    
        if ((r15 % 2) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011e, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011f, code lost:
    
        if (r2 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0121, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0123, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0131, code lost:
    
        return m2054(new com.ironsource.adqualitysdk.sdk.i.es((com.ironsource.adqualitysdk.sdk.i.ek) r0, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013d, code lost:
    
        return m2054(new com.ironsource.adqualitysdk.sdk.i.ey((com.ironsource.adqualitysdk.sdk.i.ek) r0, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014b, code lost:
    
        return m2054(new com.ironsource.adqualitysdk.sdk.i.ex(r0, m2048(r15), r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0159, code lost:
    
        return m2054(new com.ironsource.adqualitysdk.sdk.i.fd(r0, m2048(r15), r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (m2037(r15) != false) goto L15;
     */
    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ironsource.adqualitysdk.sdk.i.ed m2048(java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> r15) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.m2048(java.util.List):com.ironsource.adqualitysdk.sdk.i.ed");
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private fr m2053(List<dy> list) {
        fr frVarM2067;
        int i10 = f1819 + 1;
        f1816 = i10 % 128;
        int i11 = i10 % 2;
        if (m2038(list).m2130(m2061(43 - Color.red(0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
            frVarM2067 = m2067(new fo(null));
        } else {
            frVarM2067 = m2067(new fo(m2079(list)));
            int i12 = f1819 + 57;
            f1816 = i12 % 128;
            int i13 = i12 % 2;
        }
        m2058(list, m2061(TextUtils.getOffsetAfter("", 0) + 43, (char) Color.argb(0, 0, 0, 0), 1 - Color.argb(0, 0, 0, 0)).intern(), frVarM2067, m2061(655 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) TextUtils.indexOf("", ""), 36 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
        return frVarM2067;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static ed m2054(ed edVar) {
        int i10 = f1816 + 117;
        f1819 = i10 % 128;
        int i11 = i10 % 2;
        ed edVar2 = f1820.get(edVar);
        if ((edVar2 == null ? 'C' : (char) 20) == 20) {
            return edVar2;
        }
        int i12 = f1819 + 11;
        f1816 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            f1820.put(edVar, edVar);
            return edVar;
        }
        f1820.put(edVar, edVar);
        try {
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static fr m2067(fr frVar) {
        int i10 = f1816 + 17;
        f1819 = i10 % 128;
        int i11 = i10 % 2;
        fr frVar2 = f1821.get(frVar);
        if ((frVar2 == null ? (char) 7 : '/') != 7) {
            return frVar2;
        }
        int i12 = f1819 + 7;
        f1816 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 26 : G5.T) != 26) {
            f1821.put(frVar, frVar);
            return frVar;
        }
        f1821.put(frVar, frVar);
        try {
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private fr m2074(List<dy> list) {
        int i10 = f1819 + 101;
        f1816 = i10 % 128;
        if (i10 % 2 == 0) {
            m2036(list).m2127().hashCode();
            throw null;
        }
        String strM2127 = m2036(list).m2127();
        byte b10 = 7;
        switch (strM2127.hashCode()) {
            case -934396624:
                b10 = !(!strM2127.equals(m2061(55 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-1) - Process.getGidForName("")), View.getDefaultSize(0, 0) + 6).intern())) ? (byte) 4 : (byte) -1;
                break;
            case -567202649:
                b10 = !strM2127.equals(m2061(66 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 8 - TextUtils.indexOf("", "", 0, 0)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 59:
                if (!strM2127.equals(m2061((KeyEvent.getMaxKeyCode() >> 16) + 43, (char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 1).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f1816 + 101;
                    f1819 = i11 % 128;
                    b10 = i11 % 2 == 0 ? (byte) 0 : (byte) 1;
                }
                break;
            case 123:
                if (!strM2127.equals(m2061(AndroidCharacter.getMirror('0') - '0', (char) (TextUtils.indexOf("", "", 0) + 14612), ExpandableListView.getPackedPositionType(0L) + 1).intern())) {
                    b10 = -1;
                }
                break;
            case 3357:
                if (!strM2127.equals(m2061((Process.myTid() >> 22) + 44, (char) (3514 - Process.getGidForName("")), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f1819 + 7;
                    f1816 = i12 % 128;
                    int i13 = i12 % 2;
                }
                break;
            case 101577:
                if (!strM2127.equals(m2061(46 - TextUtils.getOffsetBefore("", 0), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6190), MotionEvent.axisFromString("") + 4).intern())) {
                    b10 = -1;
                } else {
                    int i14 = f1819 + 97;
                    f1816 = i14 % 128;
                    int i15 = i14 % 2;
                    b10 = 2;
                }
                break;
            case 115131:
                b10 = strM2127.equals(m2061(((byte) KeyEvent.getModifierMetaStateMask()) + 74, (char) View.resolveSize(0, 0), 3 - TextUtils.getOffsetBefore("", 0)).intern()) ? (byte) 8 : (byte) -1;
                break;
            case 116519:
                if (!strM2127.equals(m2061(75 - ExpandableListView.getPackedPositionChild(0L), (char) (1047 - ExpandableListView.getPackedPositionType(0L)), 3 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i16 = f1819 + 123;
                    f1816 = i16 % 128;
                    int i17 = i16 % 2;
                    b10 = 9;
                }
                break;
            case 94001407:
                b10 = !strM2127.equals(m2061((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 60, (char) Color.argb(0, 0, 0, 0), TextUtils.getTrimmedLength("") + 5).intern()) ? (byte) -1 : (byte) 5;
                break;
            case 113101617:
                if (!strM2127.equals(m2061(MotionEvent.axisFromString("") + 50, (char) (ViewConfiguration.getTouchSlop() >> 8), 5 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i18 = f1816 + 69;
                    f1819 = i18 % 128;
                    int i19 = i18 % 2;
                    b10 = 3;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return m2067(new fp(null));
            case 1:
                return m2060(list);
            case 2:
                return m2056(list);
            case 3:
                fr frVarM2051 = m2051(list);
                int i20 = f1819 + 81;
                f1816 = i20 % 128;
                int i21 = i20 % 2;
                return frVarM2051;
            case 4:
                return m2053(list);
            case 5:
                return m2052(list);
            case 6:
                return m2046(list);
            case 7:
                return m2044(list);
            case 8:
                return m2049(list);
            case 9:
                return m2050(list);
            default:
                this.f1822--;
                ed edVarM2079 = m2079(list);
                m2058(list, m2061((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 43, (char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1).intern(), edVarM2079, m2061(79 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (51380 - Color.argb(0, 0, 0, 0)), 31 - Drawable.resolveOpacity(0, 0)).intern());
                return m2067(new fp(edVarM2079));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a2  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ed m2079(List<dy> list) {
        int i10 = f1816 + 13;
        f1819 = i10 % 128;
        int i11 = i10 % 2;
        ed edVarM2045 = m2045(list);
        if ((m2037(list) ? '1' : 'Q') == 'Q') {
            return edVarM2045;
        }
        dm dmVarM2010 = dm.m2010(this.f1824, edVarM2045.m2145());
        String strM2127 = m2036(list).m2127();
        byte b10 = -1;
        int iHashCode = strM2127.hashCode();
        if (iHashCode != 1216) {
            if (iHashCode == 3968) {
                if (!(!strM2127.equals(m2061(768 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2).intern()))) {
                    int i12 = f1819 + 25;
                    f1816 = i12 % 128;
                    if (i12 % 2 == 0) {
                        b10 = 0;
                    } else {
                        b10 = 1;
                    }
                }
            }
        } else if (strM2127.equals(m2061(765 - Color.alpha(0), (char) (33304 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 3 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
            b10 = 0;
        }
        if (b10 != 0) {
            if (b10 == 1) {
                return m2054(new fa(edVarM2045, m2079(list), dmVarM2010));
            }
            this.f1822--;
            return edVarM2045;
        }
        ed edVarM2054 = m2054(new em(edVarM2045, m2079(list), dmVarM2010));
        int i13 = f1819 + 39;
        f1816 = i13 % 128;
        int i14 = i13 % 2;
        return edVarM2054;
    }

    static {
        m2063();
        f1820 = new HashMap();
        f1821 = new HashMap();
        int i10 = f1819 + 123;
        f1816 = i10 % 128;
        int i11 = i10 % 2;
    }

    public dq(String str, String str2) {
        this.f1823 = str;
        this.f1824 = str2;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private List<ed> m2041(List<dy> list) {
        List<ed> listM2068 = m2068(list, m2061((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 773, (char) (4672 - Drawable.resolveOpacity(0, 0)), 1 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new b<ed>() { // from class: com.ironsource.adqualitysdk.sdk.i.dq.4

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static char f1827 = 5;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char[] f1828 = {'E', 'x', 'p', 'e', 'c', 't', 'd', ' ', 'l', 'a', 's', '/', 'v', 'r', 'b', 'u', 'i', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M'};

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f1829 = 0;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1830 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m2081(String str, int i10, byte b10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2129) {
                    char[] cArr2 = f1828;
                    char c10 = f1827;
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

            /* JADX WARN: Code duplicated, block: B:15:0x002c A[PHI: r6
  0x002c: PHI (r6v3 com.ironsource.adqualitysdk.sdk.i.ed) = (r6v1 com.ironsource.adqualitysdk.sdk.i.ed), (r6v6 com.ironsource.adqualitysdk.sdk.i.ed) binds: [B:14:0x002a, B:9:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:17:0x0031  */
            /* JADX WARN: Code duplicated, block: B:18:0x0033  */
            /* JADX WARN: Code duplicated, block: B:20:0x0037  */
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private ed m2082(List<dy> list2) {
                ed edVarM2072;
                char c10;
                int i10 = f1829 + 41;
                f1830 = i10 % 128;
                if (i10 % 2 == 0) {
                    edVarM2072 = dq.m2072(dq.this, list2);
                    int i11 = 16 / 0;
                    if (!(edVarM2072 instanceof dv)) {
                        if (edVarM2072 instanceof ek) {
                            c10 = 6;
                        } else {
                            c10 = 'a';
                        }
                        if (c10 != 6) {
                            dq dqVar = dq.this;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m2081("\u0001\u0002\u0003\u0004\u0000\t\u0001\b\t\u0002\t\u0005ÍÍ\f\r\b\u000e\t\f\u0014\n\b\f\u0004\u0000\u0001\u0012\r\u0002\u0007\b", 32 - ExpandableListView.getPackedPositionType(0L), (byte) (90 - View.combineMeasuredStates(0, 0))).intern());
                            sb2.append(edVarM2072);
                            dq.m2057(dqVar, sb2.toString());
                            return null;
                        }
                    }
                } else {
                    edVarM2072 = dq.m2072(dq.this, list2);
                    if (!(edVarM2072 instanceof dv)) {
                        if (edVarM2072 instanceof ek) {
                            c10 = 6;
                        } else {
                            c10 = 'a';
                        }
                        if (c10 != 6) {
                            dq dqVar2 = dq.this;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m2081("\u0001\u0002\u0003\u0004\u0000\t\u0001\b\t\u0002\t\u0005ÍÍ\f\r\b\u000e\t\f\u0014\n\b\f\u0004\u0000\u0001\u0012\r\u0002\u0007\b", 32 - ExpandableListView.getPackedPositionType(0L), (byte) (90 - View.combineMeasuredStates(0, 0))).intern());
                            sb3.append(edVarM2072);
                            dq.m2057(dqVar2, sb3.toString());
                            return null;
                        }
                    }
                }
                int i12 = f1830 + 85;
                f1829 = i12 % 128;
                int i13 = i12 % 2;
                return edVarM2072;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.dq.b
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ ed mo2080(List list2) {
                int i10 = f1829 + 61;
                f1830 = i10 % 128;
                if ((i10 % 2 == 0 ? (char) 0 : 'P') == 'P') {
                    return m2082(list2);
                }
                m2082(list2);
                throw null;
            }
        });
        int i10 = f1816 + 95;
        f1819 = i10 % 128;
        int i11 = i10 % 2;
        return listM2068;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008d  */
    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private ed m2042(List<dy> list) {
        boolean z10;
        boolean z11;
        ed edVarM2040 = m2040(list);
        int i10 = f1816 + 39;
        f1819 = i10 % 128;
        int i11 = i10 % 2;
        while (true) {
            byte b10 = 0;
            if (m2037(list)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                String strM2127 = m2036(list).m2127();
                int iHashCode = strM2127.hashCode();
                if (iHashCode != 46) {
                    if (iHashCode == 91 && strM2127.equals(m2061((ViewConfiguration.getEdgeSlop() >> 16) + 789, (char) Color.alpha(0), 1 - Drawable.resolveOpacity(0, 0)).intern())) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                } else {
                    if (strM2127.equals(m2061(TextUtils.getCapsMode("", 0, 0) + 788, (char) (48721 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        int i12 = f1816 + 25;
                        f1819 = i12 % 128;
                        int i13 = i12 % 2;
                    } else {
                        b10 = -1;
                    }
                }
                if (b10 != 0) {
                    if (b10 != 1) {
                        this.f1822--;
                        return edVarM2040;
                    }
                    edVarM2040 = m2059(edVarM2040, list);
                } else {
                    edVarM2040 = m2066(edVarM2040, list);
                }
            } else {
                return edVarM2040;
            }
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private fr m2046(List<dy> list) {
        boolean z10 = false;
        m2077(list, m2061((ViewConfiguration.getFadingEdgeLength() >> 16) + 43, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), -MotionEvent.axisFromString("")).intern(), m2061(726 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 39 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
        fr frVarM2067 = m2067(new fn());
        int i10 = f1819 + 81;
        f1816 = i10 % 128;
        if (i10 % 2 != 0) {
            z10 = true;
        }
        if (z10) {
            return frVarM2067;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0065 A[PHI: r1 r9
  0x0065: PHI (r1v14 com.ironsource.adqualitysdk.sdk.i.dm) = (r1v9 com.ironsource.adqualitysdk.sdk.i.dm), (r1v16 com.ironsource.adqualitysdk.sdk.i.dm) binds: [B:21:0x0060, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r9v5 java.lang.String) = (r9v2 java.lang.String), (r9v8 java.lang.String) binds: [B:21:0x0060, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0096 A[PHI: r1 r9
  0x0096: PHI (r1v11 com.ironsource.adqualitysdk.sdk.i.dm) = (r1v9 com.ironsource.adqualitysdk.sdk.i.dm), (r1v16 com.ironsource.adqualitysdk.sdk.i.dm) binds: [B:20:0x005e, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x0096: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v8 java.lang.String) binds: [B:20:0x005e, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5 A[PHI: r1 r9
  0x00b5: PHI (r1v10 com.ironsource.adqualitysdk.sdk.i.dm) = (r1v9 com.ironsource.adqualitysdk.sdk.i.dm), (r1v16 com.ironsource.adqualitysdk.sdk.i.dm) binds: [B:19:0x005c, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00b5: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v8 java.lang.String) binds: [B:19:0x005c, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00da  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:43:0x0103  */
    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private ed m2047(List<dy> list) {
        boolean z10;
        char c10;
        dm dmVarM2010;
        String strM2127;
        ed edVarM2042 = m2042(list);
        byte b10 = 0;
        if (m2037(list)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i10 = f1816 + 103;
            f1819 = i10 % 128;
            if (i10 % 2 != 0) {
                dmVarM2010 = dm.m2010(this.f1824, edVarM2042.m2145());
                strM2127 = m2036(list).m2127();
                int iHashCode = strM2127.hashCode();
                int i11 = 91 / 0;
                if (iHashCode != 37) {
                    if (iHashCode != 42) {
                        if (iHashCode == 47) {
                            if (strM2127.equals(m2061((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 786, (char) (17387 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 1 - View.combineMeasuredStates(0, 0)).intern())) {
                                int i12 = f1819 + 61;
                                f1816 = i12 % 128;
                                int i13 = i12 % 2;
                                b10 = 1;
                            }
                        }
                        if (b10 != 0) {
                            if (b10 != 1) {
                                if (b10 != 2) {
                                    this.f1822--;
                                    return edVarM2042;
                                }
                                return m2054(new ev(edVarM2042, m2047(list), dmVarM2010));
                            }
                            return m2054(new ep(edVarM2042, m2047(list), dmVarM2010));
                        }
                        return m2054(new fc(edVarM2042, m2047(list), dmVarM2010));
                    }
                    if (!strM2127.equals(m2061(785 - Color.red(0), (char) View.MeasureSpec.makeMeasureSpec(0, 0), Color.alpha(0) + 1).intern())) {
                    }
                    if (b10 != 0) {
                        if (b10 != 1) {
                            if (b10 != 2) {
                                this.f1822--;
                                return edVarM2042;
                            }
                            return m2054(new ev(edVarM2042, m2047(list), dmVarM2010));
                        }
                        return m2054(new ep(edVarM2042, m2047(list), dmVarM2010));
                    }
                    return m2054(new fc(edVarM2042, m2047(list), dmVarM2010));
                }
                if (strM2127.equals(m2061(TextUtils.getOffsetAfter("", 0) + 787, (char) (KeyEvent.getMaxKeyCode() >> 16), Color.blue(0) + 1).intern())) {
                    b10 = 1;
                }
                if (b10 != 0) {
                    b10 = 2;
                }
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            this.f1822--;
                            return edVarM2042;
                        }
                        return m2054(new ev(edVarM2042, m2047(list), dmVarM2010));
                    }
                    return m2054(new ep(edVarM2042, m2047(list), dmVarM2010));
                }
                return m2054(new fc(edVarM2042, m2047(list), dmVarM2010));
            }
            dmVarM2010 = dm.m2010(this.f1824, edVarM2042.m2145());
            strM2127 = m2036(list).m2127();
            int iHashCode2 = strM2127.hashCode();
            if (iHashCode2 != 37) {
                if (iHashCode2 != 42) {
                    if (iHashCode2 == 47) {
                        if (strM2127.equals(m2061((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 786, (char) (17387 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 1 - View.combineMeasuredStates(0, 0)).intern())) {
                            int i14 = f1819 + 61;
                            f1816 = i14 % 128;
                            int i15 = i14 % 2;
                            b10 = 1;
                        }
                    }
                    if (b10 != 0) {
                        if (b10 != 1) {
                            if (b10 != 2) {
                                this.f1822--;
                                return edVarM2042;
                            }
                            return m2054(new ev(edVarM2042, m2047(list), dmVarM2010));
                        }
                        return m2054(new ep(edVarM2042, m2047(list), dmVarM2010));
                    }
                    return m2054(new fc(edVarM2042, m2047(list), dmVarM2010));
                }
                if (!strM2127.equals(m2061(785 - Color.red(0), (char) View.MeasureSpec.makeMeasureSpec(0, 0), Color.alpha(0) + 1).intern())) {
                }
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            this.f1822--;
                            return edVarM2042;
                        }
                        return m2054(new ev(edVarM2042, m2047(list), dmVarM2010));
                    }
                    return m2054(new ep(edVarM2042, m2047(list), dmVarM2010));
                }
                return m2054(new fc(edVarM2042, m2047(list), dmVarM2010));
            }
            if (strM2127.equals(m2061(TextUtils.getOffsetAfter("", 0) + 787, (char) (KeyEvent.getMaxKeyCode() >> 16), Color.blue(0) + 1).intern())) {
                b10 = 1;
            }
            if (b10 != 0) {
                b10 = 2;
            }
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 2) {
                        this.f1822--;
                        return edVarM2042;
                    }
                    return m2054(new ev(edVarM2042, m2047(list), dmVarM2010));
                }
                return m2054(new ep(edVarM2042, m2047(list), dmVarM2010));
            }
            return m2054(new fc(edVarM2042, m2047(list), dmVarM2010));
            b10 = -1;
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 2) {
                        this.f1822--;
                        return edVarM2042;
                    }
                    return m2054(new ev(edVarM2042, m2047(list), dmVarM2010));
                }
                return m2054(new ep(edVarM2042, m2047(list), dmVarM2010));
            }
            return m2054(new fc(edVarM2042, m2047(list), dmVarM2010));
        }
        int i16 = f1816 + 89;
        f1819 = i16 % 128;
        if (i16 % 2 != 0) {
            c10 = '<';
        } else {
            c10 = 31;
        }
        if (c10 == 31) {
            return edVarM2042;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private fr m2051(List<dy> list) {
        m2077(list, m2061((-16777106) - Color.rgb(0, 0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), TextUtils.getTrimmedLength("") + 1).intern(), m2061(TextUtils.indexOf((CharSequence) "", '0', 0) + 311, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 43 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern());
        ed edVarM2079 = m2079(list);
        m2077(list, m2061((ViewConfiguration.getScrollDefaultDelay() >> 16) + 151, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.getOffsetAfter("", 0) + 1).intern(), m2061((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 352, (char) (4015 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 47).intern());
        fr frVarM2067 = m2067(new fv(edVarM2079, m2074(list)));
        int i10 = f1819 + 63;
        f1816 = i10 % 128;
        int i11 = i10 % 2;
        return frVarM2067;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private fr m2052(List<dy> list) {
        m2077(list, m2061((KeyEvent.getMaxKeyCode() >> 16) + 43, (char) (ViewConfiguration.getTapTimeout() >> 16), KeyEvent.keyCodeFromString("") + 1).intern(), m2061(691 - View.resolveSize(0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 53895), (ViewConfiguration.getPressedStateDuration() >> 16) + 35).intern());
        fr frVarM2067 = m2067(new fl());
        int i10 = f1816 + 121;
        f1819 = i10 % 128;
        int i11 = i10 % 2;
        return frVarM2067;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private fr m2056(List<dy> list) {
        m2077(list, m2061(110 - TextUtils.getCapsMode("", 0, 0), (char) TextUtils.getOffsetAfter("", 0), -ExpandableListView.getPackedPositionChild(0L)).intern(), m2061(MotionEvent.axisFromString("") + 201, (char) ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf((CharSequence) "", '0', 0) + 42).intern());
        ed edVarM2055 = m2055(list, m2061((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.green(0) + 1).intern());
        ed edVarM2079 = m2079(list);
        m2058(list, m2061(43 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), 1 - View.combineMeasuredStates(0, 0)).intern(), edVarM2079, m2061(241 - Color.alpha(0), (char) (TextUtils.indexOf("", "", 0) + 64867), 33 - KeyEvent.normalizeMetaState(0)).intern());
        fr frVarM2067 = m2067(new fs(edVarM2055, edVarM2079, m2055(list, m2061((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 150, (char) TextUtils.indexOf("", "", 0, 0), 1 - Color.red(0)).intern()), m2074(list)));
        int i10 = f1816 + 25;
        f1819 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return frVarM2067;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final fk m2078(List<dy> list) {
        int i10 = f1816 + 55;
        f1819 = i10 % 128;
        int i11 = i10 % 2;
        this.f1822 = 0;
        m2077(list, m2061((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (14611 - TextUtils.indexOf((CharSequence) "", '0', 0)), -ImageFormat.getBitsPerPixel(0)).intern(), m2061(1 - KeyEvent.getDeadChar(0, 0), (char) View.combineMeasuredStates(0, 0), 42 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
        fk fkVarM2044 = m2044(list);
        int i12 = f1816 + 75;
        f1819 = i12 % 128;
        if (i12 % 2 == 0) {
            return fkVarM2044;
        }
        int i13 = 43 / 0;
        return fkVarM2044;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed m2065(dy dyVar) {
        dm dmVarM2010 = dm.m2010(this.f1824, dyVar.m2128());
        if (dyVar.m2124()) {
            try {
                try {
                    return m2054(new fg(Integer.valueOf(Integer.parseInt(dyVar.m2127())), dmVarM2010));
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                return m2054(new fe(Long.valueOf(Long.parseLong(dyVar.m2127())), dmVarM2010));
            }
        } else {
            if (dyVar.m2122()) {
                ed edVarM2054 = m2054(new fh(Double.valueOf(Double.parseDouble(dyVar.m2127())), dmVarM2010));
                int i10 = f1816 + 71;
                f1819 = i10 % 128;
                int i11 = i10 % 2;
                return edVarM2054;
            }
            if (dyVar.m2120()) {
                ed edVarM2055 = m2054(new ff(Boolean.valueOf(Boolean.parseBoolean(dyVar.m2127())), dmVarM2010));
                int i12 = f1819 + 3;
                f1816 = i12 % 128;
                if ((i12 % 2 == 0 ? 'Y' : '\r') == '\r') {
                    return edVarM2055;
                }
                int i13 = 70 / 0;
                return edVarM2055;
            }
        }
        return m2054(new fm(dyVar.m2127(), dmVarM2010));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ed m2055(List<dy> list, String str) {
        ed edVarM2079;
        if (m2038(list).m2130(str)) {
            edVarM2079 = null;
        } else {
            edVarM2079 = m2079(list);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2061((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 274, (char) (Drawable.resolveOpacity(0, 0) + 3756), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 36).intern());
            sb2.append(str);
            m2058(list, str, edVarM2079, sb2.toString());
            int i10 = f1819 + 53;
            f1816 = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = f1816 + 85;
        f1819 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return edVarM2079;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed m2059(ed edVar, List<dy> list) {
        int i10 = f1816 + 43;
        f1819 = i10 % 128;
        int i11 = i10 % 2;
        ed edVarM2079 = m2079(list);
        m2058(list, m2061(811 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.rgb(0, 0, 0) + 16777217).intern(), edVarM2079, m2061(956 - ExpandableListView.getPackedPositionType(0L), (char) (38840 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 35).intern());
        dy dyVarM2036 = m2036(list);
        dm dmVarM2010 = dm.m2010(this.f1824, dyVarM2036.m2128());
        if (dyVarM2036.m2130(m2061((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 790, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern())) {
            ed edVarM2054 = m2054(new ej(edVar, edVarM2079, m2079(list), dmVarM2010));
            int i12 = f1816 + 119;
            f1819 = i12 % 128;
            if ((i12 % 2 != 0 ? '?' : '`') != '?') {
                return edVarM2054;
            }
            throw null;
        }
        this.f1822--;
        return m2054(new ei(edVar, edVarM2079, dmVarM2010));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m2058(List<dy> list, String str, Object obj, String str2) {
        int i10 = f1819 + 5;
        f1816 = i10 % 128;
        if (i10 % 2 != 0) {
            m2076(m2036(list), str, obj, str2);
        } else {
            m2076(m2036(list), str, obj, str2);
            int i11 = 84 / 0;
        }
        int i12 = f1819 + 47;
        f1816 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed m2066(ed edVar, List<dy> list) {
        int i10 = f1819 + 75;
        f1816 = i10 % 128;
        List<ed> listM2041 = null;
        if (i10 % 2 != 0) {
            dy dyVarM2036 = m2036(list);
            if (!dyVarM2036.m2119()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2061(865 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (64301 - MotionEvent.axisFromString("")), TextUtils.getCapsMode("", 0, 0) + 28).intern());
                sb2.append(dyVarM2036);
                m2071(sb2.toString(), (Throwable) null);
                int i11 = f1816 + 49;
                f1819 = i11 % 128;
                int i12 = i11 % 2;
            }
            String strM2127 = dyVarM2036.m2127();
            dy dyVarM2037 = m2036(list);
            if ((dyVarM2037.m2130(m2061(772 - ImageFormat.getBitsPerPixel(0), (char) (29958 - Color.argb(0, 0, 0, 0)), 1 - KeyEvent.keyCodeFromString("")).intern()) ? (char) 11 : '0') != '0') {
                listM2041 = m2041(list);
                m2058(list, m2061(Color.rgb(0, 0, 0) + 16777326, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), listM2041, m2061(892 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 62).intern());
            } else if (!dyVarM2037.m2130(m2061(Color.green(0) + 110, (char) Color.argb(0, 0, 0, 0), TextUtils.getOffsetBefore("", 0) + 1).intern())) {
                this.f1822--;
                return m2054(new ec(edVar, strM2127, dm.m2010(strM2127, dyVarM2037.m2128())));
            }
            return m2054(new ee(edVar, strM2127, listM2041, m2062(list, m2061(View.getDefaultSize(0, 0) + 151, (char) (Color.rgb(0, 0, 0) + 16777216), -((byte) KeyEvent.getModifierMetaStateMask())).intern()), dm.m2010(strM2127, dyVarM2037.m2128())));
        }
        m2036(list).m2119();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<ed> m2062(List<dy> list, String str) {
        List<ed> listM2068 = m2068(list, str, new b<ed>() { // from class: com.ironsource.adqualitysdk.sdk.i.dq.1
            @Override // com.ironsource.adqualitysdk.sdk.i.dq.b
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final /* synthetic */ ed mo2080(List list2) {
                return dq.this.m2079(list2);
            }
        });
        int i10 = f1819 + 45;
        f1816 = i10 % 128;
        if ((i10 % 2 == 0 ? '`' : 'C') == 'C') {
            return listM2068;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2061(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1817[i10 + i12]) ^ (((long) i12) * f1818)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed m2073(dy dyVar, List<dy> list) {
        String strM2127 = dyVar.m2127();
        byte b10 = -1;
        int iHashCode = strM2127.hashCode();
        if (iHashCode != 3392903) {
            if (iHashCode == 109801339) {
                if ((strM2127.equals(m2061(995 - View.combineMeasuredStates(0, 0), (char) Gravity.getAbsoluteGravity(0, 0), Color.argb(0, 0, 0, 0) + 5).intern()) ? (char) 27 : ']') != ']') {
                    int i10 = f1819;
                    int i11 = i10 + 63;
                    f1816 = i11 % 128;
                    b10 = !(i11 % 2 == 0) ? (byte) 1 : (byte) 0;
                    int i12 = i10 + 105;
                    f1816 = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
        } else if (strM2127.equals(m2061(TextUtils.lastIndexOf("", '0', 0, 0) + 992, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 5).intern())) {
            b10 = 0;
        }
        if (b10 == 0) {
            return fj.m2184();
        }
        if (b10 != 1) {
            int i14 = f1816 + 27;
            f1819 = i14 % 128;
            int i15 = i14 % 2;
            return null;
        }
        m2058(list, m2061(TextUtils.indexOf("", "", 0, 0) + 788, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 48722), 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), dyVar, m2061((Process.myPid() >> 22) + 1000, (char) (26030 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getTapTimeout() >> 16) + 47).intern());
        ed edVarM2066 = m2066(m2054(new ek(m2061(((byte) KeyEvent.getModifierMetaStateMask()) + 996, (char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 6).intern(), dm.m2010(this.f1824, dyVar.m2128()))), list);
        int i16 = f1816 + 81;
        f1819 = i16 % 128;
        int i17 = i16 % 2;
        return edVarM2066;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private <T> List<T> m2068(List<dy> list, String str, b<T> bVar) {
        ArrayList arrayList = new ArrayList();
        if (!m2036(list).m2130(str)) {
            int i10 = f1816 + 39;
            f1819 = i10 % 128;
            int i11 = i10 % 2;
            this.f1822--;
            arrayList.add(bVar.mo2080(list));
            dy dyVarM2036 = m2036(list);
            while (true) {
                if ((dyVarM2036.m2130(m2061(TextUtils.indexOf((CharSequence) "", '0') + 1121, (char) (ViewConfiguration.getTapTimeout() >> 16), 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (char) 4 : 'C') != 4) {
                    break;
                }
                int i12 = f1816 + 1;
                f1819 = i12 % 128;
                int i13 = i12 % 2;
                arrayList.add(bVar.mo2080(list));
                dyVarM2036 = m2036(list);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2061(1122 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22).intern());
            sb2.append(str);
            sb2.append(m2061(Color.alpha(0) + 1143, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 995), 1 - KeyEvent.keyCodeFromString("")).intern());
            m2076(dyVarM2036, str, arrayList, sb2.toString());
        }
        int i14 = f1819 + 119;
        f1816 = i14 % 128;
        if ((i14 % 2 == 0 ? '6' : 'H') == 'H') {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2077(List<dy> list, String str, String str2) {
        int i10 = f1816 + 31;
        f1819 = i10 % 128;
        int i11 = i10 % 2;
        m2058(list, str, null, str2);
        int i12 = f1819 + 77;
        f1816 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2076(dy dyVar, String str, Object obj, String str2) {
        int i10 = f1819 + 19;
        f1816 = i10 % 128;
        int i11 = i10 % 2;
        if (!dyVar.m2130(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2061(MotionEvent.axisFromString("") + 1144, (char) (995 - KeyEvent.getDeadChar(0, 0)), 1 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
            sb2.append(str);
            sb2.append(m2061(Color.green(0) + 1143, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 995), -Process.getGidForName("")).intern());
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2061((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1143, (char) (996 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), KeyEvent.keyCodeFromString("") + 1).intern());
            sb3.append(dyVar.m2127());
            sb3.append(m2061(1144 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((-16776221) - Color.rgb(0, 0, 0)), 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern());
            m2070(m2075(string, sb3.toString(), obj, str2));
        }
        int i12 = f1816 + 91;
        f1819 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2075(String str, String str2, Object obj, String str3) {
        String string;
        String string2 = "";
        if (obj != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2061((ViewConfiguration.getJumpTapTimeout() >> 16) + 1239, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 49766), ExpandableListView.getPackedPositionGroup(0L) + 7).intern());
            sb2.append(obj);
            string = sb2.toString();
            int i10 = f1816 + 57;
            f1819 = i10 % 128;
            int i11 = i10 % 2;
        } else {
            int i12 = f1816 + 85;
            f1819 = i12 % 128;
            int i13 = i12 % 2;
            string = "";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m2061(1247 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) TextUtils.indexOf("", "", 0), 9 - TextUtils.getCapsMode("", 0, 0)).intern());
        sb3.append(str);
        sb3.append(string);
        sb3.append(m2061((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1255, (char) View.MeasureSpec.getSize(0), 14 - KeyEvent.getDeadChar(0, 0)).intern());
        sb3.append(str2);
        if (str3 != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m2061(1269 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (TextUtils.lastIndexOf("", '0', 0) + 54387), 3 - KeyEvent.getDeadChar(0, 0)).intern());
            sb4.append(str3);
            string2 = sb4.toString();
        }
        sb3.append(string2);
        return sb3.toString();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2069(dy dyVar, dy.d dVar, Object obj, String str) {
        if (!dyVar.m2126().equals(dVar)) {
            int i10 = f1819 + 77;
            f1816 = i10 % 128;
            boolean z10 = i10 % 2 == 0;
            m2070(m2075(dVar.toString(), dyVar.m2126().toString(), obj, str));
            if (z10) {
                int i11 = 71 / 0;
            }
        }
        int i12 = f1816 + 113;
        f1819 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2070(String str) {
        int i10 = f1816 + 73;
        f1819 = i10 % 128;
        int i11 = i10 % 2;
        m2071(str, (Throwable) null);
        int i12 = f1816 + 99;
        f1819 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2071(String str, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2061(1272 - Gravity.getAbsoluteGravity(0, 0), (char) Color.red(0), 7 - KeyEvent.normalizeMetaState(0)).intern());
        sb2.append(this.f1823);
        sb2.append(m2061((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 786, (char) (17387 - View.MeasureSpec.getMode(0)), 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
        sb2.append(this.f1824);
        co.m1623(sb2.toString(), str, th2);
        throw new RuntimeException(m2061(1279 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28).intern(), th2);
    }
}
