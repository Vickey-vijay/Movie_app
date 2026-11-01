package com.luck.picture.lib;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import f8.a0;
import f8.p;
import java.util.ArrayList;
import java.util.List;
import o8.l;
import o8.r;

/* JADX INFO: loaded from: classes5.dex */
public class PictureSelectorSystemFragment extends PictureCommonFragment {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f32018r = PictureSelectorSystemFragment.class.getSimpleName();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ActivityResultLauncher<String> f32019n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ActivityResultLauncher<String> f32020o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ActivityResultLauncher<String> f32021p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ActivityResultLauncher<String> f32022q;

    public class a implements ActivityResultCallback<Uri> {
        public a() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(Uri uri) throws Throwable {
            if (uri == null) {
                PictureSelectorSystemFragment.this.j0();
                return;
            }
            LocalMedia localMediaI = PictureSelectorSystemFragment.this.i(uri.toString());
            localMediaI.p0(l.e() ? localMediaI.w() : localMediaI.y());
            if (PictureSelectorSystemFragment.this.u(localMediaI, false) == 0) {
                PictureSelectorSystemFragment.this.H();
            } else {
                PictureSelectorSystemFragment.this.j0();
            }
        }
    }

    public class b implements l8.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f32024a;

        public b(String[] strArr) {
            this.f32024a = strArr;
        }

        @Override // l8.c
        public void a() {
            PictureSelectorSystemFragment.this.Q(this.f32024a);
        }

        @Override // l8.c
        public void onGranted() {
            PictureSelectorSystemFragment.this.e1();
        }
    }

    public class c implements a0 {
        public c() {
        }
    }

    public class d extends ActivityResultContract<String, List<Uri>> {
        public d() {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public Intent createIntent(@NonNull Context context, String str) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType(str);
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public List<Uri> parseResult(int i10, @Nullable Intent intent) {
            ArrayList arrayList = new ArrayList();
            if (intent == null) {
                return arrayList;
            }
            if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                int itemCount = clipData.getItemCount();
                for (int i11 = 0; i11 < itemCount; i11++) {
                    arrayList.add(clipData.getItemAt(i11).getUri());
                }
            } else if (intent.getData() != null) {
                arrayList.add(intent.getData());
            }
            return arrayList;
        }
    }

    public class e implements ActivityResultCallback<List<Uri>> {
        public e() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(List<Uri> list) throws Throwable {
            if (list == null || list.size() == 0) {
                PictureSelectorSystemFragment.this.j0();
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                LocalMedia localMediaI = PictureSelectorSystemFragment.this.i(list.get(i10).toString());
                localMediaI.p0(l.e() ? localMediaI.w() : localMediaI.y());
                j8.a.c(localMediaI);
            }
            PictureSelectorSystemFragment.this.H();
        }
    }

    public class f extends ActivityResultContract<String, Uri> {
        public f() {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public Intent createIntent(@NonNull Context context, String str) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType(str);
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Uri parseResult(int i10, @Nullable Intent intent) {
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    public class g implements ActivityResultCallback<Uri> {
        public g() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(Uri uri) throws Throwable {
            if (uri == null) {
                PictureSelectorSystemFragment.this.j0();
                return;
            }
            LocalMedia localMediaI = PictureSelectorSystemFragment.this.i(uri.toString());
            localMediaI.p0(l.e() ? localMediaI.w() : localMediaI.y());
            if (PictureSelectorSystemFragment.this.u(localMediaI, false) == 0) {
                PictureSelectorSystemFragment.this.H();
            } else {
                PictureSelectorSystemFragment.this.j0();
            }
        }
    }

    public class h extends ActivityResultContract<String, List<Uri>> {
        public h() {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public Intent createIntent(@NonNull Context context, String str) {
            Intent intent;
            if (TextUtils.equals("video/*", str)) {
                intent = new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
            } else {
                intent = TextUtils.equals("audio/*", str) ? new Intent("android.intent.action.PICK", MediaStore.Audio.Media.EXTERNAL_CONTENT_URI) : new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            }
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public List<Uri> parseResult(int i10, @Nullable Intent intent) {
            ArrayList arrayList = new ArrayList();
            if (intent == null) {
                return arrayList;
            }
            if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                int itemCount = clipData.getItemCount();
                for (int i11 = 0; i11 < itemCount; i11++) {
                    arrayList.add(clipData.getItemAt(i11).getUri());
                }
            } else if (intent.getData() != null) {
                arrayList.add(intent.getData());
            }
            return arrayList;
        }
    }

    public class i implements ActivityResultCallback<List<Uri>> {
        public i() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(List<Uri> list) throws Throwable {
            if (list == null || list.size() == 0) {
                PictureSelectorSystemFragment.this.j0();
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                LocalMedia localMediaI = PictureSelectorSystemFragment.this.i(list.get(i10).toString());
                localMediaI.p0(l.e() ? localMediaI.w() : localMediaI.y());
                j8.a.c(localMediaI);
            }
            PictureSelectorSystemFragment.this.H();
        }
    }

    public class j extends ActivityResultContract<String, Uri> {
        public j() {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public Intent createIntent(@NonNull Context context, String str) {
            if (TextUtils.equals("video/*", str)) {
                return new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
            }
            return TextUtils.equals("audio/*", str) ? new Intent("android.intent.action.PICK", MediaStore.Audio.Media.EXTERNAL_CONTENT_URI) : new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Uri parseResult(int i10, @Nullable Intent intent) {
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void R(String[] strArr) {
        m0(false, null);
        p pVar = PictureSelectionConfig.f32182a1;
        if (pVar != null ? pVar.a(this, strArr) : l8.a.f(this.f32146f.f32200b, getContext())) {
            e1();
        } else {
            r.c(getContext(), getString(R$string.ps_jurisdiction));
            j0();
        }
        l8.b.f63496a = new String[0];
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void W(int i10, String[] strArr) {
        if (i10 == -2) {
            PictureSelectionConfig.f32182a1.b(this, l8.b.a(this.f32146f.f32200b), new c());
        }
    }

    public final void e1() {
        m0(false, null);
        PictureSelectionConfig pictureSelectionConfig = this.f32146f;
        if (pictureSelectionConfig.f32218k == 1) {
            if (pictureSelectionConfig.f32200b == a8.e.a()) {
                this.f32020o.launch("image/*,video/*");
                return;
            } else {
                this.f32022q.launch(c1());
                return;
            }
        }
        if (pictureSelectionConfig.f32200b == a8.e.a()) {
            this.f32019n.launch("image/*,video/*");
        } else {
            this.f32021p.launch(c1());
        }
    }

    public static PictureSelectorSystemFragment d1() {
        return new PictureSelectorSystemFragment();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public int N() {
        return R$layout.ps_empty;
    }

    public final void X0() {
        this.f32022q = registerForActivityResult(new j(), new a());
    }

    public final void Y0() {
        this.f32021p = registerForActivityResult(new h(), new i());
    }

    public final void Z0() {
        this.f32019n = registerForActivityResult(new d(), new e());
    }

    public final void a1() {
        this.f32020o = registerForActivityResult(new f(), new g());
    }

    public final void b1() {
        PictureSelectionConfig pictureSelectionConfig = this.f32146f;
        if (pictureSelectionConfig.f32218k == 1) {
            if (pictureSelectionConfig.f32200b == a8.e.a()) {
                a1();
                return;
            } else {
                X0();
                return;
            }
        }
        if (pictureSelectionConfig.f32200b == a8.e.a()) {
            Z0();
        } else {
            Y0();
        }
    }

    public final String c1() {
        if (this.f32146f.f32200b == a8.e.d()) {
            return "video/*";
        }
        return this.f32146f.f32200b == a8.e.b() ? "audio/*" : "image/*";
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            j0();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ActivityResultLauncher<String> activityResultLauncher = this.f32019n;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        ActivityResultLauncher<String> activityResultLauncher2 = this.f32020o;
        if (activityResultLauncher2 != null) {
            activityResultLauncher2.unregister();
        }
        ActivityResultLauncher<String> activityResultLauncher3 = this.f32021p;
        if (activityResultLauncher3 != null) {
            activityResultLauncher3.unregister();
        }
        ActivityResultLauncher<String> activityResultLauncher4 = this.f32022q;
        if (activityResultLauncher4 != null) {
            activityResultLauncher4.unregister();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        b1();
        if (l8.a.f(this.f32146f.f32200b, getContext())) {
            e1();
            return;
        }
        String[] strArrA = l8.b.a(this.f32146f.f32200b);
        m0(true, strArrA);
        if (PictureSelectionConfig.f32182a1 != null) {
            W(-2, strArrA);
        } else {
            l8.a.b().requestPermissions(this, strArrA, new b(strArrA));
        }
    }
}
