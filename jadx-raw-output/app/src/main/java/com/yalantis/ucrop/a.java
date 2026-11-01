package com.yalantis.ucrop;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.safedk.android.utils.Logger;
import fd.c;
import java.util.ArrayList;

/* JADX INFO: compiled from: UCrop.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Intent f45658a = new Intent();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bundle f45659b;

    /* JADX INFO: renamed from: com.yalantis.ucrop.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: UCrop.java */
    public static class C0450a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f45660a = new Bundle();

        @NonNull
        public Bundle a() {
            return this.f45660a;
        }

        public void b(boolean z10) {
            this.f45660a.putBoolean("com.yalantis.ucrop.DragSmoothToCenter", z10);
        }

        public void c(boolean z10) {
            this.f45660a.putBoolean("com.yalantis.ucrop.isDarkStatusBarBlack", z10);
        }

        public void d(boolean z10) {
            this.f45660a.putBoolean("com.yalantis.ucrop.ForbidCropGifWebp", z10);
        }

        public void e(boolean z10) {
            this.f45660a.putBoolean("com.yalantis.ucrop.ForbidSkipCrop", z10);
        }

        public void f(boolean z10) {
            this.f45660a.putBoolean("com.yalantis.ucrop.CircleDimmedLayer", z10);
        }

        public void g(@NonNull String str) {
            this.f45660a.putString("com.yalantis.ucrop.CropOutputDir", str);
        }

        public void h(boolean z10) {
            this.f45660a.putBoolean("com.yalantis.ucrop.FreeStyleCrop", z10);
        }

        public void i(boolean z10) {
            this.f45660a.putBoolean("com.yalantis.ucrop.HideBottomControls", z10);
        }

        public void j(@FloatRange(from = 1.0d, fromInclusive = false) float f10) {
            this.f45660a.putFloat("com.yalantis.ucrop.MaxScaleMultiplier", f10);
        }

        public void k(boolean z10) {
            this.f45660a.putBoolean("com.yalantis.ucrop.ShowCropFrame", z10);
        }

        public void l(boolean z10) {
            this.f45660a.putBoolean("com.yalantis.ucrop.ShowCropGrid", z10);
        }

        public void m(@ColorInt int i10) {
            this.f45660a.putInt("com.yalantis.ucrop.StatusBarColor", i10);
        }

        public void n(@ColorInt int i10) {
            this.f45660a.putInt("com.yalantis.ucrop.ToolbarColor", i10);
        }

        public void o(@ColorInt int i10) {
            this.f45660a.putInt("com.yalantis.ucrop.UcropToolbarWidgetColor", i10);
        }

        public void p(float f10, float f11) {
            this.f45660a.putFloat("com.yalantis.ucrop.AspectRatioX", f10);
            this.f45660a.putFloat("com.yalantis.ucrop.AspectRatioY", f11);
        }
    }

    public a(@NonNull Uri uri, @NonNull Uri uri2) {
        Bundle bundle = new Bundle();
        this.f45659b = bundle;
        bundle.putParcelable("com.yalantis.ucrop.InputUri", uri);
        this.f45659b.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
    }

    public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        p10.startActivityForResult(p11, p12);
    }

    @Nullable
    public static Throwable a(@NonNull Intent intent) {
        return (Throwable) intent.getSerializableExtra("com.yalantis.ucrop.Error");
    }

    @Nullable
    public static Uri c(@NonNull Intent intent) {
        return (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
    }

    public static float d(@NonNull Intent intent) {
        return intent.getFloatExtra("com.yalantis.ucrop.CropAspectRatio", 0.0f);
    }

    public static int e(@NonNull Intent intent) {
        return intent.getIntExtra("com.yalantis.ucrop.ImageHeight", -1);
    }

    public static int f(@NonNull Intent intent) {
        return intent.getIntExtra("com.yalantis.ucrop.OffsetX", 0);
    }

    public static int g(@NonNull Intent intent) {
        return intent.getIntExtra("com.yalantis.ucrop.OffsetY", 0);
    }

    public static int h(@NonNull Intent intent) {
        return intent.getIntExtra("com.yalantis.ucrop.ImageWidth", -1);
    }

    public static a i(@NonNull Uri uri, @NonNull Uri uri2, ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            throw new IllegalArgumentException("Missing required parameters, count cannot be less than 1");
        }
        return arrayList.size() == 1 ? new a(uri, uri2) : new a(uri, uri2, arrayList);
    }

    public Intent b(@NonNull Context context) {
        ArrayList<String> stringArrayList = this.f45659b.getStringArrayList("com.yalantis.ucrop.CropTotalDataSource");
        if (stringArrayList == null || stringArrayList.size() <= 1) {
            this.f45658a.setClass(context, UCropActivity.class);
        } else {
            this.f45658a.setClass(context, UCropMultipleActivity.class);
        }
        this.f45658a.putExtras(this.f45659b);
        return this.f45658a;
    }

    public void j(c cVar) {
        ArrayList<String> stringArrayList = this.f45659b.getStringArrayList("com.yalantis.ucrop.CropTotalDataSource");
        boolean z10 = this.f45659b.getBoolean("com.yalantis.ucrop.CustomLoaderCropBitmap", false);
        if (((stringArrayList != null && stringArrayList.size() > 1) || z10) && cVar == null) {
            throw new NullPointerException("Missing ImageEngine,please implement UCrop.setImageEngine");
        }
        fd.b.f52944a = cVar;
    }

    public a l(@NonNull C0450a c0450a) {
        this.f45659b.putAll(c0450a.a());
        return this;
    }

    public void k(@NonNull Context context, @NonNull Fragment fragment, int i10) {
        safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(fragment, b(context), i10);
    }

    public a(@NonNull Uri uri, @NonNull Uri uri2, ArrayList<String> arrayList) {
        Bundle bundle = new Bundle();
        this.f45659b = bundle;
        bundle.putParcelable("com.yalantis.ucrop.InputUri", uri);
        this.f45659b.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
        this.f45659b.putStringArrayList("com.yalantis.ucrop.CropTotalDataSource", arrayList);
    }
}
