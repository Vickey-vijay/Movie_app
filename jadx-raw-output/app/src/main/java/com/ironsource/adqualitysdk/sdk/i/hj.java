package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import android.os.Process;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes9.dex */
public final class hj extends hb<MediaPlayer.OnSeekCompleteListener> implements MediaPlayer.OnSeekCompleteListener {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2323 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2324 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2325 = 22296;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2326 = 29824;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2327 = 45187;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2328 = 488;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private c f2329;

    public interface c {
        /* JADX INFO: renamed from: ｋ */
        void mo1837(hj hjVar, MediaPlayer mediaPlayer);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2253(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f2992) {
            char[] cArr2 = new char[cArr.length];
            n.f2991 = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i11 = n.f2991;
                if (i11 < cArr.length) {
                    cArr3[0] = cArr[i11];
                    cArr3[1] = cArr[i11 + 1];
                    int i12 = 58224;
                    for (int i13 = 0; i13 < 16; i13++) {
                        char c10 = cArr3[1];
                        char c11 = cArr3[0];
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2328)) ^ ((c11 >>> 5) + f2326)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2325) ^ ((c12 + i12) ^ ((c12 << 4) + f2327))));
                        i12 -= 40503;
                    }
                    int i14 = n.f2991;
                    cArr2[i14] = cArr3[0];
                    cArr2[i14 + 1] = cArr3[1];
                    n.f2991 = i14 + 2;
                } else {
                    str2 = new String(cArr2, 0, i10);
                }
            }
        }
        return str2;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        int i10 = f2324 + 97;
        f2323 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f2329.mo1837(this, mediaPlayer);
            int i12 = f2324 + 5;
            f2323 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2253("韴\ud85a⓽ꂌ蜝鵛끠뾉⸆醘비嶟\uefdf\uf3bc\u18ad\uead3䖰둂ɓﲢ健诔尝霵䵥売쩕鲳ମꐯ\uee9e甒", 31 - (Process.myPid() >> 22)).intern(), m2253("༫询삜界ꪱ\u09de⃪葠團\ue80dᡘ✍\u18ad\uead3䖰둂ɓﲢ健诔莹ൠ\uf59d읢ꦌͩ迓⟇ᱶ烵£ᆏ㖠⫡ꕗ\ueddb", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 35).intern(), th2, false);
        }
        if ((mo742() != null ? '/' : 'E') != '/') {
            return;
        }
        int i14 = f2323 + 109;
        f2324 = i14 % 128;
        if (i14 % 2 != 0) {
            mo742().onSeekComplete(mediaPlayer);
            return;
        }
        mo742().onSeekComplete(mediaPlayer);
        try {
            throw null;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public hj(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, c cVar) {
        super(onSeekCompleteListener);
        this.f2329 = cVar;
    }
}
