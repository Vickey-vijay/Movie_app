package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class cp {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f1382;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> f1383;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private hy.c f1384;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private cn f1385;

    public static class e extends cz implements cl {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f1386 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f1387 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f1388 = 6;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char[] f1389 = {'s', 'e', 't', 'M', 'i', 'n', 'D', 'p', 'h', 'F', 'o', 'r', 'S', 'u', 'C', 'l', 'a', 'c', 'W', 'k', 'R', 'f', 'w', 'I', 'A', 'y', 'O', 'b', 'j', 'g', 'm', 'v', 'x', 'z', '{', '|'};

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f1390 = 57;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private cn.e f1391;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private cp f1392;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private cp m1634() {
            int i10 = f1387 + 37;
            f1386 = i10 % 128;
            int i11 = i10 % 2;
            this.f1392.f1385 = this.f1391.m1620();
            cp cpVar = this.f1392;
            int i12 = f1386 + 91;
            f1387 = i12 % 128;
            int i13 = i12 % 2;
            return cpVar;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m1636(String str, int i10, boolean z10, int i11, int i12) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (b.f706) {
                char[] cArr2 = new char[i10];
                b.f704 = 0;
                while (true) {
                    int i13 = b.f704;
                    if (i13 >= i10) {
                        break;
                    }
                    b.f705 = cArr[i13];
                    cArr2[b.f704] = (char) (b.f705 + i12);
                    int i14 = b.f704;
                    cArr2[i14] = (char) (cArr2[i14] - f1390);
                    b.f704 = i14 + 1;
                }
                if (i11 > 0) {
                    b.f707 = i11;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = b.f707;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = b.f707;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    b.f704 = 0;
                    while (true) {
                        int i17 = b.f704;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        b.f704 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            }
            return str2;
        }

        public e(List<String> list, int i10) {
            cp cpVar = new cp();
            this.f1392 = cpVar;
            cpVar.f1384 = new hy.c();
            this.f1392.f1383 = list;
            this.f1392.f1382 = i10;
            this.f1391 = new cn.e();
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0333  */
        /* JADX WARN: Code duplicated, block: B:102:0x0335  */
        /* JADX WARN: Code duplicated, block: B:104:0x0354  */
        /* JADX WARN: Code duplicated, block: B:155:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:156:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:157:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:158:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:159:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:160:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:161:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:162:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:163:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:164:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:165:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:166:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:167:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:168:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:169:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:170:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:172:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:173:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:18:0x004d  */
        /* JADX WARN: Code duplicated, block: B:20:0x0070  */
        /* JADX WARN: Code duplicated, block: B:21:0x0072  */
        /* JADX WARN: Code duplicated, block: B:23:0x0075  */
        /* JADX WARN: Code duplicated, block: B:24:0x0079  */
        /* JADX WARN: Code duplicated, block: B:27:0x0098  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:33:0x00be  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:39:0x010c  */
        /* JADX WARN: Code duplicated, block: B:42:0x0119  */
        /* JADX WARN: Code duplicated, block: B:43:0x011d  */
        /* JADX WARN: Code duplicated, block: B:45:0x013e  */
        /* JADX WARN: Code duplicated, block: B:46:0x0141  */
        /* JADX WARN: Code duplicated, block: B:48:0x0144  */
        /* JADX WARN: Code duplicated, block: B:49:0x0148  */
        /* JADX WARN: Code duplicated, block: B:51:0x016a  */
        /* JADX WARN: Code duplicated, block: B:54:0x016f  */
        /* JADX WARN: Code duplicated, block: B:55:0x0173  */
        /* JADX WARN: Code duplicated, block: B:57:0x0192  */
        /* JADX WARN: Code duplicated, block: B:58:0x0195  */
        /* JADX WARN: Code duplicated, block: B:61:0x019b  */
        /* JADX WARN: Code duplicated, block: B:62:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:64:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:65:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:67:0x01d2  */
        /* JADX WARN: Code duplicated, block: B:68:0x01d6  */
        /* JADX WARN: Code duplicated, block: B:70:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:71:0x0200  */
        /* JADX WARN: Code duplicated, block: B:73:0x021f  */
        /* JADX WARN: Code duplicated, block: B:74:0x022c  */
        /* JADX WARN: Code duplicated, block: B:76:0x0249  */
        /* JADX WARN: Code duplicated, block: B:77:0x0255  */
        /* JADX WARN: Code duplicated, block: B:79:0x0276  */
        /* JADX WARN: Code duplicated, block: B:80:0x027a  */
        /* JADX WARN: Code duplicated, block: B:82:0x02a0  */
        /* JADX WARN: Code duplicated, block: B:83:0x02a3  */
        /* JADX WARN: Code duplicated, block: B:85:0x02cb  */
        /* JADX WARN: Code duplicated, block: B:86:0x02ce  */
        /* JADX WARN: Code duplicated, block: B:89:0x02d4  */
        /* JADX WARN: Code duplicated, block: B:90:0x02d7  */
        /* JADX WARN: Code duplicated, block: B:92:0x02f4  */
        /* JADX WARN: Code duplicated, block: B:94:0x02ff  */
        /* JADX WARN: Code duplicated, block: B:95:0x0302  */
        /* JADX WARN: Code duplicated, block: B:96:0x0304  */
        /* JADX WARN: Code duplicated, block: B:98:0x032e  */
        @Override // com.ironsource.adqualitysdk.sdk.i.cl
        /* JADX INFO: renamed from: ﻐ */
        public final Object mo812(String str, List<Object> list, ch chVar) {
            int i10;
            char c10;
            boolean z10;
            char c11;
            char c12;
            int i11;
            char c13;
            boolean z11;
            int i12 = f1387 + 117;
            f1386 = i12 % 128;
            byte b10 = 1;
            if (i12 % 2 != 0) {
                int i13 = 88 / 0;
                switch (str.hashCode()) {
                    case -1930334554:
                        if (str.equals(m1635("\u0001\u0002\u0000\u000e\u0004\r\u0011\u0017\u000b\u0014\u0000\u0004\r\n¶", 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (TextUtils.getCapsMode("", 0, 0) + 67)).intern())) {
                            b10 = -1;
                        } else {
                            int i14 = f1387 + 81;
                            f1386 = i14 % 128;
                            int i15 = i14 % 2;
                            b10 = 7;
                        }
                        break;
                    case -1826216039:
                        if ((str.equals(m1636("\t\u0002\ufff7\u000b\u0007ￛ\ufffb\u0006\u000f\n", 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 163).intern()) ? (byte) 0 : (byte) 1) != 0) {
                            b10 = 14;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case -994397843:
                        if (str.equals(m1635("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0000\b\u0001\t\n\u000b\u0006\u0004\u000f\u0006\u0001", TextUtils.lastIndexOf("", '0', 0) + 19, (byte) (40 - TextUtils.indexOf("", ""))).intern())) {
                            b10 = -1;
                        } else {
                            i10 = f1386 + 51;
                            f1387 = i10 % 128;
                            if (i10 % 2 == 0) {
                                b10 = 6;
                            } else {
                                b10 = 70;
                            }
                        }
                        break;
                    case -941967812:
                        if (str.equals(m1636("\u000b\f\u0001\u0005\u0001￤\u000b\u000b\ufff9\u0004ￛ\n�\b\r￫\f�", 18 - (ViewConfiguration.getPressedStateDuration() >> 16), true, 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), 161 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
                            c10 = '\n';
                        } else {
                            c10 = '8';
                        }
                        if (c10 != '8') {
                            b10 = -1;
                        } else {
                            b10 = 3;
                        }
                        break;
                    case -770599694:
                        if (str.equals(m1636("￪\u0006\u000b￡\u0002\r\u0011\u0005￣\f\u000f￠\u0005\u0002\u0000\b\u0010\u0002\u0011", 19 - View.getDefaultSize(0, 0), false, 16 - (ViewConfiguration.getTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 156).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    case -235079533:
                        if (str.equals(m1635("\u0001\u0002\b\u0014\u0011\f\u0007\u0002\u001b\f\u000e\u001b\u001c\u001d\u0005\r\u0003\u0001", 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (58 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 12;
                        }
                        break;
                    case -213689933:
                        if (str.equals(m1635("\u0001\u0002\u0003\b\t\u0010\u0010\t\u0017\u0013\u0004\r\u0014\u0015\u0003\u0013\u0005\u0007\u0002\u0000\r\u0005Ã", 23 - TextUtils.getTrimmedLength(""), (byte) (TextUtils.getCapsMode("", 0, 0) + 80)).intern())) {
                            b10 = -1;
                        } else {
                            int i16 = f1387 + 65;
                            f1386 = i16 % 128;
                            int i17 = i16 % 2;
                            b10 = 5;
                        }
                        break;
                    case 46561673:
                        if (str.equals(m1635("\u0001\u0002\u0000\u000e\u0004\r\u0011\u0017\u000b\u0014\u0000\u001dìì\r\u001cí", (Process.myPid() >> 22) + 17, (byte) (122 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern())) {
                            b10 = -1;
                        } else {
                            int i18 = f1387 + 115;
                            f1386 = i18 % 128;
                            int i19 = i18 % 2;
                            b10 = 11;
                        }
                        break;
                    case 94094958:
                        if (str.equals(m1636("\f\ufff9\ufffb\u0003\u0000", 5 - Color.green(0), true, 2 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 162).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 17;
                        }
                        break;
                    case 841006591:
                        if (str.equals(m1636("\uffff\n\u000e\u0002￠\t\f\uffdd\t\u0006\u0006\uffff�\u000e\u0003\t\b\r\r\uffff\u000e\uffe7\u0003\b\uffde", 25 - KeyEvent.getDeadChar(0, 0), false, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17, View.resolveSizeAndState(0, 0, 0) + 159).intern())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (!z10) {
                            b10 = -1;
                        } else {
                            b10 = 8;
                        }
                        break;
                    case 902024524:
                        if (str.equals(m1635("\u0005\u0000\u0001\u0003\u0011\u0004\r\u0005\u001b\u0014", 9 - Process.getGidForName(""), (byte) (KeyEvent.getDeadChar(0, 0) + 112)).intern())) {
                            c11 = '$';
                        } else {
                            c11 = '_';
                        }
                        if (c11 != '_') {
                            b10 = -1;
                        } else {
                            int i20 = f1387 + 9;
                            f1386 = i20 % 128;
                            int i21 = i20 % 2;
                            b10 = 15;
                        }
                        break;
                    case 923334616:
                        if ((str.equals(m1636("\u0001\b�￼\u000e\f\r\b\u0006ￜ\u0001\ufffe￼\u0004￦\ufffe\r", 17 - TextUtils.getCapsMode("", 0, 0), false, '3' - AndroidCharacter.getMirror('0'), AndroidCharacter.getMirror('0') + 'p').intern()) ? (byte) 0 : (byte) 1) != 0) {
                            b10 = 16;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 1080975014:
                        if (str.equals(m1636("\u0006\t\uffdd\b￣\u0002�\f\ufffb\uffff￭\u000e\uffff\r\r\b\t\u0003\u000e�\uffff\u0006", TextUtils.indexOf("", "", 0, 0) + 22, true, KeyEvent.getDeadChar(0, 0) + 14, 158 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                            c12 = '1';
                        } else {
                            c12 = 0;
                        }
                        if (c12 != 0) {
                            b10 = -1;
                        } else {
                            b10 = 9;
                        }
                        break;
                    case 1083215325:
                        if (str.equals(m1635("\u0005\u0001\u001e\u0006\u0001\u0005#\u000b\u000f\u001c\r\u0003\n\u0006\u0006\"", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15, (byte) (Color.argb(0, 0, 0, 0) + 89)).intern())) {
                            b10 = -1;
                        } else {
                            i11 = f1386 + 31;
                            f1387 = i11 % 128;
                            if (i11 % 2 == 0) {
                                b10 = 13;
                            } else {
                                b10 = 0;
                            }
                        }
                        break;
                    case 1202614773:
                        if (str.equals(m1635("\u0001\u0002\u0000\u000e\u0004\r\u0011\u0017\u0006\u000e\u0013\r\u0005\u0007\u000f\u0010\f\u0004\u0001\u0002â", ((byte) KeyEvent.getModifierMetaStateMask()) + 22, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 110)).intern())) {
                            b10 = -1;
                        } else {
                            int i22 = f1386 + 33;
                            f1387 = i22 % 128;
                            int i23 = i22 % 2;
                            b10 = 2;
                        }
                        break;
                    case 1689765750:
                        if (str.equals(m1635("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0000\b\u0001\t\n\u000b\u0006\u0013\u0000\r\u0016\u0013\u0002\u0013\u0003\u0007\u0005\u000b\u0017\u0002\u0001", 28 - TextUtils.indexOf("", ""), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33)).intern())) {
                            c13 = '8';
                        } else {
                            c13 = 'H';
                        }
                        if (c13 != 'H') {
                            b10 = -1;
                        } else {
                            b10 = 4;
                        }
                        break;
                    case 1766229249:
                        if (!str.equals(m1635("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0000\b\u0001\t\n\u000b\u0006\r\u000e\r\u0007\b\u0011\u0010\u0011°°\u0002\u0001", Color.alpha(0) + 26, (byte) ('m' - AndroidCharacter.getMirror('0'))).intern())) {
                            b10 = -1;
                        }
                        break;
                    case 1833576080:
                        if (str.equals(m1636("\t￠\u0002\u000e\n\uffff\uffde\b\u0003\uffe7\u000e\uffff\r\r\u0013\ufffb\f\fￛ\f", 20 - Color.red(0), true, 14 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 160).intern())) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (!z11) {
                            b10 = -1;
                        } else {
                            b10 = 10;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
            } else {
                switch (str.hashCode()) {
                    case -1930334554:
                        if (str.equals(m1635("\u0001\u0002\u0000\u000e\u0004\r\u0011\u0017\u000b\u0014\u0000\u0004\r\n¶", 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (TextUtils.getCapsMode("", 0, 0) + 67)).intern())) {
                            b10 = -1;
                        } else {
                            int i110 = f1387 + 81;
                            f1386 = i110 % 128;
                            int i111 = i110 % 2;
                            b10 = 7;
                        }
                        break;
                    case -1826216039:
                        if ((str.equals(m1636("\t\u0002\ufff7\u000b\u0007ￛ\ufffb\u0006\u000f\n", 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 163).intern()) ? (byte) 0 : (byte) 1) != 0) {
                            b10 = 14;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case -994397843:
                        if (str.equals(m1635("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0000\b\u0001\t\n\u000b\u0006\u0004\u000f\u0006\u0001", TextUtils.lastIndexOf("", '0', 0) + 19, (byte) (40 - TextUtils.indexOf("", ""))).intern())) {
                            b10 = -1;
                        } else {
                            i10 = f1386 + 51;
                            f1387 = i10 % 128;
                            if (i10 % 2 == 0) {
                                b10 = 6;
                            } else {
                                b10 = 70;
                            }
                        }
                        break;
                    case -941967812:
                        if (str.equals(m1636("\u000b\f\u0001\u0005\u0001￤\u000b\u000b\ufff9\u0004ￛ\n�\b\r￫\f�", 18 - (ViewConfiguration.getPressedStateDuration() >> 16), true, 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), 161 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
                            c10 = '\n';
                        } else {
                            c10 = '8';
                        }
                        if (c10 != '8') {
                            b10 = -1;
                        } else {
                            b10 = 3;
                        }
                        break;
                    case -770599694:
                        if (str.equals(m1636("￪\u0006\u000b￡\u0002\r\u0011\u0005￣\f\u000f￠\u0005\u0002\u0000\b\u0010\u0002\u0011", 19 - View.getDefaultSize(0, 0), false, 16 - (ViewConfiguration.getTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 156).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    case -235079533:
                        if (str.equals(m1635("\u0001\u0002\b\u0014\u0011\f\u0007\u0002\u001b\f\u000e\u001b\u001c\u001d\u0005\r\u0003\u0001", 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (58 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 12;
                        }
                        break;
                    case -213689933:
                        if (str.equals(m1635("\u0001\u0002\u0003\b\t\u0010\u0010\t\u0017\u0013\u0004\r\u0014\u0015\u0003\u0013\u0005\u0007\u0002\u0000\r\u0005Ã", 23 - TextUtils.getTrimmedLength(""), (byte) (TextUtils.getCapsMode("", 0, 0) + 80)).intern())) {
                            b10 = -1;
                        } else {
                            int i112 = f1387 + 65;
                            f1386 = i112 % 128;
                            int i113 = i112 % 2;
                            b10 = 5;
                        }
                        break;
                    case 46561673:
                        if (str.equals(m1635("\u0001\u0002\u0000\u000e\u0004\r\u0011\u0017\u000b\u0014\u0000\u001dìì\r\u001cí", (Process.myPid() >> 22) + 17, (byte) (122 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern())) {
                            b10 = -1;
                        } else {
                            int i114 = f1387 + 115;
                            f1386 = i114 % 128;
                            int i115 = i114 % 2;
                            b10 = 11;
                        }
                        break;
                    case 94094958:
                        if (str.equals(m1636("\f\ufff9\ufffb\u0003\u0000", 5 - Color.green(0), true, 2 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 162).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 17;
                        }
                        break;
                    case 841006591:
                        if (str.equals(m1636("\uffff\n\u000e\u0002￠\t\f\uffdd\t\u0006\u0006\uffff�\u000e\u0003\t\b\r\r\uffff\u000e\uffe7\u0003\b\uffde", 25 - KeyEvent.getDeadChar(0, 0), false, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17, View.resolveSizeAndState(0, 0, 0) + 159).intern())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (!z10) {
                            b10 = -1;
                        } else {
                            b10 = 8;
                        }
                        break;
                    case 902024524:
                        if (str.equals(m1635("\u0005\u0000\u0001\u0003\u0011\u0004\r\u0005\u001b\u0014", 9 - Process.getGidForName(""), (byte) (KeyEvent.getDeadChar(0, 0) + 112)).intern())) {
                            c11 = '$';
                        } else {
                            c11 = '_';
                        }
                        if (c11 != '_') {
                            b10 = -1;
                        } else {
                            int i24 = f1387 + 9;
                            f1386 = i24 % 128;
                            int i25 = i24 % 2;
                            b10 = 15;
                        }
                        break;
                    case 923334616:
                        if ((str.equals(m1636("\u0001\b�￼\u000e\f\r\b\u0006ￜ\u0001\ufffe￼\u0004￦\ufffe\r", 17 - TextUtils.getCapsMode("", 0, 0), false, '3' - AndroidCharacter.getMirror('0'), AndroidCharacter.getMirror('0') + 'p').intern()) ? (byte) 0 : (byte) 1) != 0) {
                            b10 = 16;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 1080975014:
                        if (str.equals(m1636("\u0006\t\uffdd\b￣\u0002�\f\ufffb\uffff￭\u000e\uffff\r\r\b\t\u0003\u000e�\uffff\u0006", TextUtils.indexOf("", "", 0, 0) + 22, true, KeyEvent.getDeadChar(0, 0) + 14, 158 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                            c12 = '1';
                        } else {
                            c12 = 0;
                        }
                        if (c12 != 0) {
                            b10 = -1;
                        } else {
                            b10 = 9;
                        }
                        break;
                    case 1083215325:
                        if (str.equals(m1635("\u0005\u0001\u001e\u0006\u0001\u0005#\u000b\u000f\u001c\r\u0003\n\u0006\u0006\"", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15, (byte) (Color.argb(0, 0, 0, 0) + 89)).intern())) {
                            b10 = -1;
                        } else {
                            i11 = f1386 + 31;
                            f1387 = i11 % 128;
                            if (i11 % 2 == 0) {
                                b10 = 13;
                            } else {
                                b10 = 0;
                            }
                        }
                        break;
                    case 1202614773:
                        if (str.equals(m1635("\u0001\u0002\u0000\u000e\u0004\r\u0011\u0017\u0006\u000e\u0013\r\u0005\u0007\u000f\u0010\f\u0004\u0001\u0002â", ((byte) KeyEvent.getModifierMetaStateMask()) + 22, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 110)).intern())) {
                            b10 = -1;
                        } else {
                            int i26 = f1386 + 33;
                            f1387 = i26 % 128;
                            int i27 = i26 % 2;
                            b10 = 2;
                        }
                        break;
                    case 1689765750:
                        if (str.equals(m1635("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0000\b\u0001\t\n\u000b\u0006\u0013\u0000\r\u0016\u0013\u0002\u0013\u0003\u0007\u0005\u000b\u0017\u0002\u0001", 28 - TextUtils.indexOf("", ""), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33)).intern())) {
                            c13 = '8';
                        } else {
                            c13 = 'H';
                        }
                        if (c13 != 'H') {
                            b10 = -1;
                        } else {
                            b10 = 4;
                        }
                        break;
                    case 1766229249:
                        if (!str.equals(m1635("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0000\b\u0001\t\n\u000b\u0006\r\u000e\r\u0007\b\u0011\u0010\u0011°°\u0002\u0001", Color.alpha(0) + 26, (byte) ('m' - AndroidCharacter.getMirror('0'))).intern())) {
                            b10 = -1;
                        }
                        break;
                    case 1833576080:
                        if (str.equals(m1636("\t￠\u0002\u000e\n\uffff\uffde\b\u0003\uffe7\u000e\uffff\r\r\u0013\ufffb\f\fￛ\f", 20 - Color.red(0), true, 14 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 160).intern())) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (!z11) {
                            b10 = -1;
                        } else {
                            b10 = 10;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
            }
            switch (b10) {
                case 0:
                    this.f1392.f1384.m2423(((Integer) cz.m1851(list, 0, Integer.class)).intValue());
                    return this;
                case 1:
                    this.f1392.f1384.m2428(((Integer) cz.m1851(list, 0, Integer.class)).intValue());
                    return this;
                case 2:
                    this.f1392.f1384.m2419(((Boolean) cz.m1851(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 3:
                    this.f1392.f1384.m2417(((Integer) cz.m1851(list, 0, Integer.class)).intValue());
                    return this;
                case 4:
                    this.f1392.f1384.m2421(((Integer) cz.m1851(list, 0, Integer.class)).intValue());
                    int i28 = f1386 + 99;
                    f1387 = i28 % 128;
                    if (i28 % 2 != 0) {
                        return this;
                    }
                    int i29 = 47 / 0;
                    return this;
                case 5:
                    this.f1392.f1384.m2427(((Boolean) cz.m1851(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 6:
                    this.f1392.f1384.m2426(((Integer) cz.m1851(list, 0, Integer.class)).intValue());
                    return this;
                case 7:
                    this.f1392.f1384.m2429(((Boolean) cz.m1851(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 8:
                    this.f1392.f1384.m2414(((Integer) cz.m1851(list, 0, Integer.class)).intValue());
                    return this;
                case 9:
                    this.f1392.f1384.m2424(((Boolean) cz.m1851(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 10:
                    this.f1392.f1384.m2415(((Integer) cz.m1851(list, 0, Integer.class)).intValue());
                    return this;
                case 11:
                    this.f1392.f1384.m2422(((Boolean) cz.m1851(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 12:
                    this.f1392.f1384.m2416(((Boolean) cz.m1851(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 13:
                    this.f1391.m1618((Class) cz.m1851(list, 0, Class.class));
                    return this;
                case 14:
                    this.f1391.m1619((Class) cz.m1851(list, 0, Class.class));
                    return this;
                case 15:
                    this.f1391.m1622((Class) cz.m1851(list, 0, Class.class));
                    return this;
                case 16:
                    ds dsVar = (ds) cz.m1851(list, 0, ds.class);
                    this.f1391.m1621(dsVar);
                    this.f1392.f1384.m2418(dsVar);
                    return this;
                case 17:
                    return m1634();
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m1635(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2129) {
                char[] cArr2 = f1389;
                char c10 = f1388;
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
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final hy m1633(ia iaVar) {
        return this.f1384.m2425(iaVar, this.f1383, this.f1382);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final cn m1632() {
        return this.f1385;
    }
}
