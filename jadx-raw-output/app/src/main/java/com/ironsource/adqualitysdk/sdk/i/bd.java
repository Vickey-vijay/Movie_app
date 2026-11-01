package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bd extends cz implements cl {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static long f767 = 6453402919862608218L;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f768 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f769 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f770 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f771 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f772 = -301922893601565001L;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f773;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f774;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f775;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, b> f776;

    public interface b {
        /* JADX INFO: renamed from: ｋ */
        Object mo739(List<Object> list, ch chVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m805(bd bdVar) {
        int i10 = f770 + 55;
        int i11 = i10 % 128;
        f771 = i11;
        char c10 = i10 % 2 == 0 ? 'X' : '-';
        String str = bdVar.f775;
        if (c10 == 'X') {
            throw null;
        }
        int i12 = i11 + 99;
        f770 = i12 % 128;
        int i13 = i12 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Class m807(bd bdVar, String str) {
        int i10 = f771 + 125;
        f770 = i10 % 128;
        int i11 = i10 % 2;
        Class clsM804 = bdVar.m804(str, false);
        int i12 = f770 + 97;
        f771 = i12 % 128;
        if ((i12 % 2 == 0 ? '4' : '_') != '4') {
            return clsM804;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public abstract Map<String, b> mo736();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m813(String str) {
        int i10 = f770;
        int i11 = i10 + 43;
        f771 = i11 % 128;
        int i12 = i11 % 2;
        this.f775 = str;
        int i13 = i10 + 103;
        f771 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            int i14 = 97 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public abstract String mo737();

    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[Catch: all -> 0x005c, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000e, B:15:0x0058, B:14:0x0048), top: B:21:0x0001 }] */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized String m817() {
        if (!TextUtils.isEmpty(this.f773)) {
            int i10 = f771 + 87;
            f770 = i10 % 128;
            int i11 = i10 % 2;
            if ((this.f773.equals(m808("㕥ሳ턛粗밗茕ꍎ", (char) (Process.myPid() >> 22), "⅚雡ៃ妏", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 782668984, "렔ꚔȮ툛").intern()) ? '\"' : '?') == '\"') {
                this.f773 = mo737();
                int i12 = f770 + 119;
                f771 = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            this.f773 = mo737();
            int i14 = f770 + 119;
            f771 = i14 % 128;
            int i15 = i14 % 2;
        }
        return this.f773;
    }

    /* JADX INFO: renamed from: ﾒ */
    public abstract Class mo738(String str);

    /* JADX INFO: renamed from: Ꮧ, reason: contains not printable characters */
    public static /* synthetic */ Object m803(List list, Class cls) {
        int i10 = f771 + 77;
        f770 = i10 % 128;
        int i11 = i10 % 2;
        Object objM1851 = cz.m1851(list, 0, cls);
        int i12 = f770 + 31;
        f771 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return objM1851;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m806(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2019) {
            f.f2017 = i10;
            char[] cArr2 = new char[cArr.length];
            f.f2018 = 0;
            while (true) {
                int i11 = f.f2018;
                if (i11 < cArr.length) {
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f772);
                    f.f2018++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final boolean m809() {
        int i10 = f770;
        int i11 = i10 + 81;
        int i12 = i11 % 128;
        f771 = i12;
        int i13 = i11 % 2;
        if ((this.f775 != null ? '6' : '\t') == '6') {
            int i14 = i12 + 81;
            f770 = i14 % 128;
            int i15 = i14 % 2;
            return true;
        }
        int i16 = i10 + 101;
        f771 = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
        return false;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public boolean mo810() {
        int i10 = f771 + 95;
        int i11 = i10 % 128;
        f770 = i11;
        boolean z10 = !(i10 % 2 == 0);
        int i12 = i11 + 23;
        f771 = i12 % 128;
        int i13 = i12 % 2;
        return z10;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public boolean mo811() {
        int i10 = f771;
        int i11 = i10 + 93;
        f770 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 75;
        f770 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return false;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object mo812(String str, List<Object> list, ch chVar) {
        b bVar = this.f776.get(str);
        try {
            if ((bVar != null ? '@' : (char) 17) == '@') {
                Object objMo739 = bVar.mo739(list, chVar);
                int i10 = f770 + 9;
                f771 = i10 % 128;
                if (!(i10 % 2 == 0)) {
                    return objMo739;
                }
                int i11 = 33 / 0;
                return objMo739;
            }
            String str2 = this.f774;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m806("ᛲ꡴殧⫋\uec01꿢滴‘\ue35aꋭ搨❘\ue692려签㫈\ufdc9뼗纱ㇽ\uf315뉗疡㜽\uf64a覊䬥ੳ춏貚丮", View.MeasureSpec.getMode(0) + 48817).intern());
            sb2.append(str);
            sb2.append(m806("ᚐ쌆북陻䃾㵴ឝ쀕몋靴䆷㨡ᑇ캘뭞闧乷㣼ᔞ쾔렟銵伡", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 54666).intern());
            co.m1623(str2, sb2.toString(), null);
            int i12 = f771 + 3;
            f770 = i12 % 128;
            if (i12 % 2 == 0) {
                return null;
            }
            throw null;
        } catch (Exception e10) {
            String str3 = this.f774;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m806("ᛲ꡴殧⫋\uec01꿢滴‘\ue35aꋭ搨❘\ue692려签㫈\ufdc9뼗纱ㇽ\uf315뉗疡㜽\uf64a覊䬥ੳ춏貚丮", 48817 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
            sb3.append(str);
            sb3.append(m808("괁", (char) ((ViewConfiguration.getTouchSlop() >> 8) + 5119), "⅚雡ៃ妏", (-283108343) - View.MeasureSpec.makeMeasureSpec(0, 0), "क़“\uffefꐓ").intern());
            co.m1623(str3, sb3.toString(), e10);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m815() {
        Map<String, b> mapMo736 = mo736();
        this.f776 = mapMo736;
        mapMo736.put(m806("ᛄ껝曝㻜\uf6fe躐䚁ẍ횫湛♷ﹷ뙱万،\ude39阩", View.MeasureSpec.getMode(0) + 47119).intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.bd.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                bd.this.m813((String) bd.m803(list, String.class));
                return bd.m805(bd.this);
            }
        });
        this.f776.put(m808("ਰᰫ骎敇蚁\uf1af앂亟浘踂獒વ罍露䦴즉䕸嬦\ufb0a", (char) (38375 - Color.red(0)), "⅚雡ៃ妏", TextUtils.lastIndexOf("", '0', 0) - 1490347111, "飾⬛\ue7a7▕").intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.bd.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return Boolean.valueOf(bd.this.m809());
            }
        });
        this.f776.put(m808("认혴\uf0b3뾾鿞氜泄後", (char) TextUtils.indexOf("", "", 0), "⅚雡ៃ妏", KeyEvent.getMaxKeyCode() >> 16, "蘕㛑ݶℍ").intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.bd.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                return bd.m807(bd.this, (String) list.get(0));
            }
        });
        int i10 = f770 + 77;
        f771 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 16 : (char) 18) != 16) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public String mo819() {
        int i10 = f770 + 87;
        f771 = i10 % 128;
        int i11 = i10 % 2;
        String str = this.f775;
        if (!(str == null)) {
            return str;
        }
        String strM817 = m817();
        int i12 = f770 + 117;
        f771 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 17 : '4') == '4') {
            return strM817;
        }
        throw null;
    }

    public bd(String str) {
        this.f774 = str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Class m814(String str) {
        int i10 = f770 + 73;
        f771 = i10 % 128;
        int i11 = i10 % 2;
        Class clsM804 = m804(str, true);
        int i12 = f770 + 29;
        f771 = i12 % 128;
        if ((i12 % 2 == 0 ? 'c' : (char) 11) == 11) {
            return clsM804;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Class m816(String str) {
        int i10 = f771 + 29;
        f770 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                if ((!Prode.m241() ? (char) 20 : (char) 2) != 20) {
                    return mo738(str);
                }
                Class clsM804 = m804(str, false);
                int i11 = f770 + 17;
                f771 = i11 % 128;
                if (i11 % 2 != 0) {
                    return clsM804;
                }
                int i12 = 85 / 0;
                return clsM804;
            }
            Prode.m241();
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0195  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Class m804(String str, boolean z10) {
        try {
            if (str.contains(m808("請", (char) (KeyEvent.normalizeMetaState(0) + 36875), "⅚雡ៃ妏", TextUtils.lastIndexOf("", '0', 0) + 1418647382, "嗩軗\u0b54檐").intern())) {
                int i10 = f771 + 85;
                f770 = i10 % 128;
                if (i10 % 2 == 0) {
                    return kb.m2848(str, z10);
                }
                kb.m2848(str, z10);
                throw null;
            }
            byte b10 = 4;
            switch (str.hashCode()) {
                case -1325958191:
                    if ((str.equals(m808("\uf31d럭鑮ɲﾴﶌ", (char) (AndroidCharacter.getMirror('0') + 41442), "⅚雡ៃ妏", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), "ጬ誤ዐ쮢").intern()) ? (byte) 25 : (byte) 4) == 25) {
                        int i11 = f771 + 3;
                        f770 = i11 % 128;
                        int i12 = i11 % 2;
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 104431:
                    if ((str.equals(m808("\uf062\u0cf8뼌", (char) (53400 - Color.argb(0, 0, 0, 0)), "⅚雡ៃ妏", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 683415491, "쒙밗頨ᣐ").intern()) ? '$' : 'I') == '$') {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 3029738:
                    if (!str.equals(m808("롹巜텐\ud816", (char) (MotionEvent.axisFromString("") + 22815), "⅚雡ៃ妏", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "飶㚶ặ≙").intern())) {
                        b10 = -1;
                    }
                    break;
                case 3039496:
                    if (!str.equals(m808("쩱櫯彦㥬", (char) (Color.green(0) + 1951), "⅚雡ៃ妏", TextUtils.indexOf("", "", 0, 0), "갏⹎龀耇").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case 3052374:
                    if (!str.equals(m806("ᛔ仸ꚘẰ", (ViewConfiguration.getTapTimeout() >> 16) + 22567).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case 3327612:
                    if (!str.equals(m806("ᛛ喗遇\udf3d", Color.argb(0, 0, 0, 0) + 17231).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case 3625364:
                    if ((str.equals(m806("ᛁ\ue82b\ueb38\uea0a", 65267 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern()) ? '\n' : 'B') == '\n') {
                        b10 = 7;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 97526364:
                    if ((str.equals(m808("뗂ღ㒤縆酪", (char) (57508 - TextUtils.getOffsetAfter("", 0)), "⅚雡ៃ妏", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1297945174, "嗋崒ꑍ懠").intern()) ? 'F' : (char) 3) == 3) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case 109413500:
                    if (!str.equals(m806("ᛄ藆リ꾎媧", 37658 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    return Integer.TYPE;
                case 1:
                    return Long.TYPE;
                case 2:
                    return Double.TYPE;
                case 3:
                    Class cls = Float.TYPE;
                    int i13 = f771 + 83;
                    f770 = i13 % 128;
                    int i14 = i13 % 2;
                    return cls;
                case 4:
                    return Boolean.TYPE;
                case 5:
                    return Character.TYPE;
                case 6:
                    return Byte.TYPE;
                case 7:
                    return Void.TYPE;
                case 8:
                    return Short.TYPE;
                default:
                    return mo738(str);
            }
        } catch (Throwable th2) {
            if (z10) {
                String str2 = this.f774;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m808("䖜\ue1d3ᯊ꜉刳淰", (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 53632), "⅚雡ៃ妏", ViewConfiguration.getMinimumFlingVelocity() >> 16, "竌\uec32缿\ud9d1").intern());
                sb2.append(str);
                sb2.append(m808("㷮╽ΰ꯵칛삹覚甄ࣛ硕", (char) View.MeasureSpec.getMode(0), "⅚雡ៃ妏", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, "峾⌍蚴雡").intern());
                co.m1623(str2, sb2.toString(), th2);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m818(hg hgVar, ch chVar, String str, Object... objArr) {
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
            arrayList.add(0, hgVar);
            chVar.mo1544(str, arrayList);
            int i10 = f770 + 111;
            f771 = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th2) {
            String str2 = this.f774;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m806("ᛲ꿪撛㵕\uf279譼䇄ڐ\udfef", (Process.myPid() >> 22) + 47407).intern());
            sb2.append(this);
            co.m1623(str2, sb2.toString(), th2);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m808(String str, char c10, String str2, int i10, String str3) {
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
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f767) ^ ((long) f769)) ^ ((long) f768));
                    j.f2675 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }
}
