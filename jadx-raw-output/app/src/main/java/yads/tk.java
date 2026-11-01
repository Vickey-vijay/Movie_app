package yads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes11.dex */
public abstract class tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AudioAttributes f83071a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    @DoNotInline
    public static int a(int i10, int i11) {
        for (int i12 = 8; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(ib3.a(i12)).build(), f83071a)) {
                return i12;
            }
        }
        return 0;
    }

    @DoNotInline
    public static int[] a() {
        m51 m51Var = p51.f81258c;
        l51 l51Var = new l51();
        xm2 xm2Var = uk.f83514e;
        vm2 vm2Var = xm2Var.f82527c;
        if (vm2Var == null) {
            vm2 vm2Var2 = new vm2(xm2Var, new wm2(xm2Var.f84638f, 0, xm2Var.f84639g));
            xm2Var.f82527c = vm2Var2;
            vm2Var = vm2Var2;
        }
        ja3 it = vm2Var.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), f83071a)) {
                l51Var.a(num);
            }
        }
        l51Var.a((Object) 2);
        return td1.a(l51Var.a());
    }
}
