package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class he extends hb<MediaPlayer.OnPreparedListener> implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2303 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2304;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private a f2307;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2306 = {36373, 13679, 63676, 48185, 25427, 9965, 59929, 37205, 21735, 6157, 57240, 33498, 18029, 3505, 45253, 29793, 15247, 65315, 41592, 27134, 11557, 53314, 38906, 23318, 7846, 50646, 35094, 'E', 47913, 30404, 12926, 60702, 43239, 25675, 7955, 56056, 38494, 20954, 3211, 51208, 33782, 16009, 64033, 46549, 29029, 11267, 59315, 41788, 24088, 6588, 54653, 37114, 19334, 1870, 49912, 32134, 14634, 62670};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2305 = 2253410054340262747L;

    public interface a {
        /* JADX INFO: renamed from: ﻐ */
        void mo1832(he heVar, MediaPlayer mediaPlayer);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2247(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2306[i10 + i12]) ^ (((long) i12) * f2305)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        int i10 = f2304 + 89;
        f2303 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f2307.mo1832(this, mediaPlayer);
            int i12 = f2303 + 39;
            f2304 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2247((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (char) (36443 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 26 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), m2247(View.MeasureSpec.makeMeasureSpec(0, 0) + 27, (char) Color.red(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 30).intern(), th2, false);
        }
        if ((mo742() != null ? ':' : 'a') != ':') {
            return;
        }
        int i14 = f2304 + 33;
        f2303 = i14 % 128;
        int i15 = i14 % 2;
        mo742().onPrepared(mediaPlayer);
    }

    public he(MediaPlayer.OnPreparedListener onPreparedListener, a aVar) {
        super(onPreparedListener);
        this.f2307 = aVar;
    }
}
