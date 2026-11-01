package yads;

import android.view.View;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class of3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pf3 f81030b;

    public of3(pf3 pf3Var) {
        this.f81030b = pf3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pf3 pf3Var = this.f81030b;
        if (!pf3Var.f81404d) {
            if (pf3Var.f81401a.f79043a.contains(hg3.f78222d)) {
                yf3 yf3Var = (yf3) this.f81030b.f81402b;
                bg3 bg3Var = yf3Var.f84943f;
                ii3 ii3Var = yf3Var.f84944g;
                ii3Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!ck.x.m(linkedHashMap)) {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                View view = ii3Var.f78669b.getView();
                Integer numValueOf = view != null ? Integer.valueOf(view.getHeight()) : null;
                Integer numValueOf2 = view != null ? Integer.valueOf(view.getWidth()) : null;
                kl1 kl1Var = ii3Var.f78668a.f79015c;
                if (numValueOf == null || numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    linkedHashMap.put("view_container_height", "undefined");
                } else {
                    linkedHashMap.put("view_container_height", numValueOf);
                }
                if (numValueOf2 == null || numValueOf2.intValue() <= 0) {
                    numValueOf2 = null;
                }
                if (numValueOf2 == null) {
                    linkedHashMap.put("view_container_width", "undefined");
                } else {
                    linkedHashMap.put("view_container_width", numValueOf2);
                }
                int i10 = kl1Var.f79463g;
                Integer numValueOf3 = i10 > 0 ? Integer.valueOf(i10) : null;
                if (numValueOf3 == null) {
                    linkedHashMap.put("video_height", "undefined");
                } else {
                    linkedHashMap.put("video_height", numValueOf3);
                }
                int i11 = kl1Var.f79464h;
                Integer numValueOf4 = i11 > 0 ? Integer.valueOf(i11) : null;
                if (numValueOf4 == null) {
                    linkedHashMap.put("video_width", "undefined");
                } else {
                    linkedHashMap.put("video_width", numValueOf4);
                }
                String str = kl1Var.f79461e;
                if (str == null) {
                    linkedHashMap.put("video_codec", "undefined");
                } else {
                    linkedHashMap.put("video_codec", str);
                }
                String str2 = kl1Var.f79460d;
                if (str2 == null) {
                    linkedHashMap.put("video_mime_type", "undefined");
                } else {
                    linkedHashMap.put("video_mime_type", str2);
                }
                Float f10 = kl1Var.f79462f;
                if (f10 == null) {
                    linkedHashMap.put("video_vmaf", "undefined");
                } else {
                    linkedHashMap.put("video_vmaf", f10);
                }
                bg3Var.f75820f = nj.l0.g(mj.h.a("video_playback_info", linkedHashMap));
                yf3Var.f84938a.a(v5.f83761u);
                if (!yf3Var.f84945h) {
                    yf3Var.f84945h = true;
                    bg3 bg3Var2 = yf3Var.f84943f;
                    bg3Var2.getClass();
                    bg3Var2.a(kotlin.collections.a.o(mj.h.a("status", "success"), mj.h.a("durations", bg3Var2.f75817c.a())));
                }
                pf3 pf3Var2 = this.f81030b;
                pf3Var2.f81404d = true;
                pf3Var2.f81403c.removeCallbacksAndMessages(null);
                pf3Var2.f81405e = false;
                return;
            }
        }
        this.f81030b.f81403c.postDelayed(this, 200L);
    }
}
