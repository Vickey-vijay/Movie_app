package ib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.fvvcl.flickverse.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.style.BottomNavBarStyle;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.style.TitleBarStyle;
import f8.b0;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import o8.k;
import o8.q;
import sa.l;
import wo.h;
import wo.i;
import z7.j;

/* JADX INFO: compiled from: PhotoUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static e f54095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static n8.a f54096b;

    /* JADX INFO: compiled from: PhotoUtil.java */
    public class a implements b0<LocalMedia> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ib.c f54097a;

        @Override // f8.b0
        public void onCancel() {
        }

        public a(ib.c cVar) {
            this.f54097a = cVar;
        }

        @Override // f8.b0
        public void a(ArrayList<LocalMedia> arrayList) {
            ib.c cVar = this.f54097a;
            if (cVar != null) {
                cVar.a(arrayList, 0);
            }
        }
    }

    /* JADX INFO: compiled from: PhotoUtil.java */
    public class b implements b0<LocalMedia> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ib.c f54099a;

        @Override // f8.b0
        public void onCancel() {
        }

        public b(ib.c cVar) {
            this.f54099a = cVar;
        }

        @Override // f8.b0
        public void a(ArrayList<LocalMedia> arrayList) {
            ib.c cVar = this.f54099a;
            if (cVar != null) {
                cVar.a(arrayList, 0);
            }
        }
    }

    /* JADX INFO: compiled from: PhotoUtil.java */
    public class d implements c8.d {

        /* JADX INFO: compiled from: PhotoUtil.java */
        public class a implements fd.c {

            /* JADX INFO: renamed from: ib.e$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: PhotoUtil.java */
            public class C0487a extends CustomTarget<Bitmap> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ fd.c.a f54107b;

                @Override // com.bumptech.glide.request.target.Target
                public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable Transition transition) {
                    onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
                }

                public C0487a(fd.c.a aVar) {
                    this.f54107b = aVar;
                }

                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(@Nullable Drawable drawable) {
                    fd.c.a aVar = this.f54107b;
                    if (aVar != null) {
                        aVar.a(null);
                    }
                }

                public void onResourceReady(@NonNull Bitmap bitmap, @Nullable Transition<? super Bitmap> transition) {
                    fd.c.a aVar = this.f54107b;
                    if (aVar != null) {
                        aVar.a(bitmap);
                    }
                }
            }

            public a() {
            }

            @Override // fd.c
            public void a(Context context, String str, ImageView imageView) {
                if (!l.a(context)) {
                    return;
                }
                Glide.with(context).load(str).override(BaseTransientBottomBar.ANIMATION_FADE_DURATION, BaseTransientBottomBar.ANIMATION_FADE_DURATION).into(imageView);
            }

            @Override // fd.c
            public void b(Context context, Uri uri, int i10, int i11, fd.c.a<Bitmap> aVar) {
                Glide.with(context).asBitmap().load(uri).override(i10, i11).into(new C0487a(aVar));
            }
        }

        public d() {
        }

        @Override // c8.d
        public void a(Fragment fragment, Uri uri, Uri uri2, ArrayList<String> arrayList, int i10) {
            com.yalantis.ucrop.a.C0450a c0450aB = e.this.b(fragment.getContext());
            com.yalantis.ucrop.a aVarI = com.yalantis.ucrop.a.i(uri, uri2, arrayList);
            aVarI.l(c0450aB);
            aVarI.j(new a());
            aVarI.k(fragment.requireActivity(), fragment, i10);
        }
    }

    /* JADX INFO: compiled from: PhotoUtil.java */
    public static class c implements c8.b {

        /* JADX INFO: compiled from: PhotoUtil.java */
        public class a implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f8.l f54101a;

            @Override // wo.h
            public void onStart() {
            }

            public a(f8.l lVar) {
                this.f54101a = lVar;
            }

            @Override // wo.h
            public void a(String str, File file) {
                f8.l lVar = this.f54101a;
                if (lVar != null) {
                    lVar.a(str, file.getAbsolutePath());
                }
            }

            @Override // wo.h
            public void b(String str, Throwable th2) {
                f8.l lVar = this.f54101a;
                if (lVar != null) {
                    lVar.a(str, null);
                }
            }
        }

        /* JADX INFO: compiled from: PhotoUtil.java */
        public class b implements wo.a {
            public b() {
            }

            @Override // wo.a
            public boolean a(String str) {
                if (a8.d.n(str) && !a8.d.g(str)) {
                    return true;
                }
                return !a8.d.m(str);
            }
        }

        /* JADX INFO: renamed from: ib.e$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PhotoUtil.java */
        public class C0486c implements i {
            public C0486c() {
            }

            @Override // wo.i
            public String a(String str) {
                int iLastIndexOf = str.lastIndexOf(".");
                return o8.d.c("CMP_") + (iLastIndexOf != -1 ? str.substring(iLastIndexOf) : ".jpg");
            }
        }

        public c() {
        }

        @Override // c8.b
        public void a(Context context, ArrayList<Uri> arrayList, f8.l lVar) {
            wo.e.k(context).r(arrayList).m(100).t(new C0486c()).l(new b()).s(new a(lVar)).n();
        }
    }

    public static e c() {
        if (f54095a == null) {
            f54095a = new e();
        }
        return f54095a;
    }

    @Nullable
    public static String d(LocalMedia localMedia) {
        if (localMedia == null) {
            return "";
        }
        Log.i("cyp", "文件名: " + localMedia.p());
        String strW = localMedia.w();
        Log.i("cyp", "初始路径:" + localMedia.w());
        Log.i("cyp", "绝对路径:" + localMedia.y());
        Log.i("cyp", "是否压缩:" + localMedia.F());
        if (localMedia.F()) {
            strW = localMedia.i();
            Log.i("cyp", "压缩:" + localMedia.i());
        }
        Log.i("cyp", "是否裁剪:" + localMedia.G());
        if (localMedia.G()) {
            strW = localMedia.m();
            Log.i("cyp", "裁剪路径:" + localMedia.m());
        }
        Log.i("cyp", "是否开启原图:" + localMedia.K());
        Log.i("cyp", "原图路径:" + localMedia.u());
        Log.i("cyp", "沙盒路径:" + localMedia.z());
        Log.i("cyp", "水印路径:" + localMedia.C());
        Log.i("cyp", "视频缩略图:" + localMedia.B());
        Log.i("cyp", "原始宽高: " + localMedia.D() + VastAttributes.HORIZONTAL_POSITION + localMedia.q());
        Log.i("cyp", "裁剪宽高: " + localMedia.k() + VastAttributes.HORIZONTAL_POSITION + localMedia.j());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("文件大小: ");
        sb2.append(k.e(localMedia.A()));
        Log.i("cyp", sb2.toString());
        Log.i("cyp", "文件时长: " + localMedia.o());
        return strW;
    }

    public static n8.a f(Context context) {
        if (f54096b == null) {
            f54096b = new n8.a();
            TitleBarStyle titleBarStyle = new TitleBarStyle();
            titleBarStyle.x(ContextCompat.getColor(context, R.color.ps_color_white));
            titleBarStyle.z(R.drawable.ic_orange_arrow_down);
            titleBarStyle.A(R.drawable.ps_ic_black_back);
            titleBarStyle.B(ContextCompat.getColor(context, R.color.ps_color_black));
            titleBarStyle.y(ContextCompat.getColor(context, R.color.ps_color_53575e));
            titleBarStyle.v(true);
            BottomNavBarStyle bottomNavBarStyle = new BottomNavBarStyle();
            bottomNavBarStyle.w(Color.parseColor("#EEEEEE"));
            bottomNavBarStyle.z(ContextCompat.getColor(context, R.color.ps_color_53575e));
            bottomNavBarStyle.y(ContextCompat.getColor(context, R.color.ps_color_9b));
            bottomNavBarStyle.z(ContextCompat.getColor(context, R.color.ps_color_fa632d));
            bottomNavBarStyle.A(false);
            bottomNavBarStyle.v(ContextCompat.getColor(context, R.color.ps_color_53575e));
            bottomNavBarStyle.x(ContextCompat.getColor(context, R.color.ps_color_53575e));
            SelectMainStyle selectMainStyle = new SelectMainStyle();
            selectMainStyle.g0(ContextCompat.getColor(context, R.color.ps_color_white));
            selectMainStyle.Z(true);
            selectMainStyle.d0(ContextCompat.getColor(context, R.color.ps_color_9b));
            selectMainStyle.f0(ContextCompat.getColor(context, R.color.ps_color_fa632d));
            selectMainStyle.b0(R.drawable.ps_demo_white_preview_selector);
            selectMainStyle.c0(R.drawable.ps_checkbox_selector);
            selectMainStyle.e0(context.getString(R.string.ps_done_front_num));
            selectMainStyle.a0(ContextCompat.getColor(context, R.color.ps_color_white));
            f54096b.h(titleBarStyle);
            f54096b.f(bottomNavBarStyle);
            f54096b.g(selectMainStyle);
        }
        return f54096b;
    }

    public final com.yalantis.ucrop.a.C0450a b(Context context) {
        com.yalantis.ucrop.a.C0450a c0450a = new com.yalantis.ucrop.a.C0450a();
        c0450a.i(false);
        c0450a.h(true);
        c0450a.k(true);
        c0450a.l(true);
        c0450a.f(false);
        c0450a.p(1.0f, 1.0f);
        c0450a.g(e(context));
        c0450a.b(false);
        c0450a.d(true);
        c0450a.e(true);
        c0450a.j(100.0f);
        n8.a aVar = f54096b;
        if (aVar == null || aVar.c().R() == 0) {
            c0450a.m(ContextCompat.getColor(context, R.color.ps_color_grey));
            c0450a.n(ContextCompat.getColor(context, R.color.ps_color_grey));
            c0450a.o(ContextCompat.getColor(context, R.color.ps_color_white));
        } else {
            SelectMainStyle selectMainStyleC = f54096b.c();
            boolean zU = selectMainStyleC.U();
            int iR = selectMainStyleC.R();
            c0450a.c(zU);
            if (q.c(iR)) {
                c0450a.m(iR);
                c0450a.n(iR);
            } else {
                c0450a.m(ContextCompat.getColor(context, R.color.ps_color_grey));
                c0450a.n(ContextCompat.getColor(context, R.color.ps_color_grey));
            }
            TitleBarStyle titleBarStyleD = f54096b.d();
            if (q.c(titleBarStyleD.q())) {
                c0450a.o(titleBarStyleD.q());
            } else {
                c0450a.o(ContextCompat.getColor(context, R.color.ps_color_white));
            }
        }
        return c0450a;
    }

    public final String e(Context context) {
        File file = new File(context.getExternalFilesDir("").getAbsolutePath(), "Sandbox");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + File.separator;
    }

    @Nullable
    public static String g(int i10, List<LocalMedia> list) {
        if (h9.b.a(list)) {
            return "";
        }
        return d(list.get(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h(Context context, ib.c cVar) {
        j.a(context).c(a8.e.c()).e(1).g(1).d(ib.a.g()).h(f(context)).b(new c()).c(new d()).a(new a(cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i(Context context, ib.c cVar) {
        j.a(context).b(a8.e.c()).b(new c()).c(new d()).a(new b(cVar));
    }
}
