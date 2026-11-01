package com.mbridge.msdk.video.dynview.util.draw;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.video.dynview.c;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ChoiceOneDrawBitBg.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f38709d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f38710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f38711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f38712c;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChoiceOneDrawBitBg.java */
    public class RunnableC0403a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bitmap f38713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f38714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f38715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f38716d;

        /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ChoiceOneDrawBitBg.java */
        public class RunnableC0404a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.mbridge.msdk.video.dynview.shape.a.b f38718a;

            public RunnableC0404a(com.mbridge.msdk.video.dynview.shape.a.b bVar) {
                this.f38718a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f38710a == null || this.f38718a.build() == null) {
                    return;
                }
                a.this.f38710a.setBackground(this.f38718a.build());
            }
        }

        public RunnableC0403a(Bitmap bitmap, int i10, float f10, float f11) {
            this.f38713a = bitmap;
            this.f38714b = i10;
            this.f38715c = f10;
            this.f38716d = f11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap bitmapA = a0.a(this.f38713a, 10);
                Bitmap bitmapA2 = a0.a(this.f38713a, 10);
                com.mbridge.msdk.video.dynview.shape.a.b bVarA = com.mbridge.msdk.video.dynview.shape.a.a();
                bVarA.orientation(this.f38714b).b(bitmapA).a(bitmapA2);
                if (this.f38714b == 2) {
                    float f10 = this.f38715c;
                    float f11 = this.f38716d;
                    if (f10 > f11) {
                        bVarA.b(f10).a(this.f38716d);
                    } else {
                        bVarA.b(f11).a(this.f38715c);
                    }
                } else {
                    bVarA.b(this.f38715c).a(this.f38716d);
                }
                if (a.this.f38710a != null) {
                    a.this.f38710a.post(new RunnableC0404a(bVarA));
                }
            } catch (Exception e10) {
                q0.b("ChoiceOneDrawBitBg", e10.getMessage());
            }
        }
    }

    public static a a() {
        a aVar;
        if (f38709d != null) {
            return f38709d;
        }
        synchronized (a.class) {
            if (f38709d == null) {
                f38709d = new a();
            }
            aVar = f38709d;
        }
        return aVar;
    }

    public void b() {
        if (this.f38710a != null) {
            this.f38710a = null;
        }
        Bitmap bitmap = this.f38711b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f38711b.recycle();
            this.f38711b = null;
        }
        Bitmap bitmap2 = this.f38712c;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.f38712c.recycle();
        this.f38712c = null;
    }

    private a() {
    }

    public void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view == null || cVar == null || map == null || map.size() == 0 || map.size() < 2 || cVar.b() == null || cVar.b().size() < 2) {
            return;
        }
        this.f38710a = view;
        int iH = cVar.h();
        float fM = cVar.m();
        float fK = cVar.k();
        try {
            List<CampaignEx> listB = cVar.b();
            String md5 = listB.get(0) != null ? SameMD5.getMD5(listB.get(0).getImageUrl()) : "";
            String md6 = listB.get(1) != null ? SameMD5.getMD5(listB.get(1).getImageUrl()) : "";
            Bitmap bitmap = (TextUtils.isEmpty(md5) || !map.containsKey(md5)) ? null : map.get(md5);
            Bitmap bitmap2 = (TextUtils.isEmpty(md6) || !map.containsKey(md6)) ? null : map.get(md6);
            if (bitmap == null || bitmap.isRecycled() || bitmap2 == null || bitmap2.isRecycled()) {
                return;
            }
            a(iH, fM, fK, bitmap, bitmap2);
        } catch (Exception e10) {
            q0.b("ChoiceOneDrawBitBg", e10.getMessage());
        }
    }

    private synchronized void a(int i10, float f10, float f11, Bitmap bitmap, Bitmap bitmap2) {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new RunnableC0403a(bitmap, i10, f10, f11));
        } catch (Exception e10) {
            q0.a("ChoiceOneDrawBitBg", e10.getMessage());
        }
    }
}
