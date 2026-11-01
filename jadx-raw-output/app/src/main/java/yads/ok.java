package yads;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes10.dex */
public final class ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioAttributes f81061a;

    public ok(pk pkVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(pkVar.f81432b).setFlags(pkVar.f81433c).setUsage(pkVar.f81434d);
        int i10 = ib3.f78556a;
        if (i10 >= 29) {
            mk.a(usage, pkVar.f81435e);
        }
        if (i10 >= 32) {
            nk.a(usage, pkVar.f81436f);
        }
        this.f81061a = usage.build();
    }
}
