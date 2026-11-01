package com.yalantis.ucrop;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yalantis.ucrop.decoration.GridSpacingItemDecoration;
import com.yalantis.ucrop.model.AspectRatio;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd.c;
import kd.j;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class UCropMultipleActivity extends AppCompatActivity implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f45637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @DrawableRes
    public int f45641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @DrawableRes
    public int f45642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f45644j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public UCropFragment f45646l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45647m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<String> f45648n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<String> f45649o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f45651q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public UCropGalleryAdapter f45652r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f45653s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f45654t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<AspectRatio> f45655u;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<UCropFragment> f45645k = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinkedHashMap<String, JSONObject> f45650p = new LinkedHashMap<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashSet<String> f45656v = new HashSet<>();

    public class a implements UCropGalleryAdapter.b {
        public a() {
        }

        @Override // com.yalantis.ucrop.UCropGalleryAdapter.b
        public void a(int i10, View view) {
            if (UCropMultipleActivity.this.f45654t) {
                return;
            }
            if (UCropMultipleActivity.this.f45656v.contains(UCropMultipleActivity.this.s((String) UCropMultipleActivity.this.f45648n.get(i10)))) {
                Toast.makeText(UCropMultipleActivity.this.getApplicationContext(), UCropMultipleActivity.this.getString(R$string.ucrop_not_crop), 0).show();
                return;
            }
            if (UCropMultipleActivity.this.f45652r.d() == i10) {
                return;
            }
            UCropMultipleActivity.this.f45652r.notifyItemChanged(UCropMultipleActivity.this.f45652r.d());
            UCropMultipleActivity.this.f45652r.g(i10);
            UCropMultipleActivity.this.f45652r.notifyItemChanged(i10);
            UCropMultipleActivity.this.D((UCropFragment) UCropMultipleActivity.this.f45645k.get(i10), i10);
        }
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public final void B() {
        A(this.f45640f);
        Toolbar toolbar = (Toolbar) findViewById(R$id.toolbar);
        toolbar.setBackgroundColor(this.f45639e);
        toolbar.setTitleTextColor(this.f45643i);
        TextView textView = (TextView) toolbar.findViewById(R$id.toolbar_title);
        textView.setTextColor(this.f45643i);
        textView.setText(this.f45637c);
        textView.setTextSize(this.f45638d);
        Drawable drawableMutate = AppCompatResources.getDrawable(this, this.f45641g).mutate();
        drawableMutate.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(this.f45643i, BlendModeCompat.SRC_ATOP));
        toolbar.setNavigationIcon(drawableMutate);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
    }

    @Override // com.yalantis.ucrop.b
    public void loadingProgress(boolean z10) {
        this.f45644j = z10;
        supportInvalidateOptionsMenu();
    }

    @Override // com.yalantis.ucrop.b
    public void onCropFinish(UCropFragment.i iVar) {
        int i10 = iVar.f45628a;
        if (i10 != -1) {
            if (i10 != 96) {
                return;
            }
            u(iVar.f45629b);
            return;
        }
        int size = this.f45647m + this.f45649o.size();
        boolean z10 = true;
        int size2 = (this.f45649o.size() + this.f45648n.size()) - 1;
        x(iVar.f45629b);
        if (size == size2) {
            y();
            return;
        }
        int i11 = this.f45647m + 1;
        String strS = s(this.f45648n.get(i11));
        while (true) {
            if (!this.f45656v.contains(strS)) {
                z10 = false;
                break;
            } else {
                if (i11 == size2) {
                    break;
                }
                i11++;
                strS = s(this.f45648n.get(i11));
            }
        }
        if (z10) {
            y();
            return;
        }
        D(this.f45645k.get(i11), i11);
        UCropGalleryAdapter uCropGalleryAdapter = this.f45652r;
        uCropGalleryAdapter.notifyItemChanged(uCropGalleryAdapter.d());
        this.f45652r.g(i11);
        UCropGalleryAdapter uCropGalleryAdapter2 = this.f45652r;
        uCropGalleryAdapter2.notifyItemChanged(uCropGalleryAdapter2.d());
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R$id.menu_crop).setVisible(!this.f45644j);
        menu.findItem(R$id.menu_loader).setVisible(this.f45644j);
        return super.onPrepareOptionsMenu(menu);
    }

    public final void x(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("com.yalantis.ucrop.CropInputOriginal");
            JSONObject jSONObject = this.f45650p.get(stringExtra);
            Uri uriC = com.yalantis.ucrop.a.c(intent);
            jSONObject.put("outPutPath", uriC != null ? uriC.getPath() : "");
            jSONObject.put("imageWidth", com.yalantis.ucrop.a.h(intent));
            jSONObject.put("imageHeight", com.yalantis.ucrop.a.e(intent));
            jSONObject.put("offsetX", com.yalantis.ucrop.a.f(intent));
            jSONObject.put("offsetY", com.yalantis.ucrop.a.g(intent));
            jSONObject.put("aspectRatio", com.yalantis.ucrop.a.d(intent));
            this.f45650p.put(stringExtra, jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void y() {
        JSONArray jSONArray = new JSONArray();
        Iterator<Map.Entry<String, JSONObject>> it = this.f45650p.entrySet().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getValue());
        }
        Intent intent = new Intent();
        intent.putExtra("output", jSONArray.toString());
        setResult(-1, intent);
        finish();
    }

    public final void z() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.recycler_gallery);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new GridSpacingItemDecoration(Integer.MAX_VALUE, c.a(this, 6.0f), true));
        }
        recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(this, R$anim.ucrop_layout_animation_fall_down));
        recyclerView.setBackgroundResource(getIntent().getIntExtra("com.yalantis.ucrop.GalleryBarBackground", R$drawable.ucrop_gallery_bg));
        UCropGalleryAdapter uCropGalleryAdapter = new UCropGalleryAdapter(this.f45648n);
        this.f45652r = uCropGalleryAdapter;
        uCropGalleryAdapter.h(new a());
        recyclerView.setAdapter(this.f45652r);
    }

    @TargetApi(21)
    public final void A(@ColorInt int i10) {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i10);
        }
    }

    public final void C(@NonNull Intent intent) {
        this.f45655u = getIntent().getParcelableArrayListExtra("com.yalantis.ucrop.MultipleAspectRatio");
        this.f45653s = intent.getBooleanExtra("com.yalantis.ucrop.ForbidCropGifWebp", false);
        this.f45651q = intent.getStringExtra("com.yalantis.ucrop.CropOutputFileName");
        this.f45640f = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", ContextCompat.getColor(this, R$color.ucrop_color_statusbar));
        this.f45639e = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", ContextCompat.getColor(this, R$color.ucrop_color_toolbar));
        this.f45643i = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", ContextCompat.getColor(this, R$color.ucrop_color_toolbar_widget));
        this.f45641g = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", R$drawable.ucrop_ic_cross);
        this.f45642h = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", R$drawable.ucrop_ic_done);
        this.f45637c = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.f45638d = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarTitleTextSize", 18);
        String string = this.f45637c;
        if (string == null) {
            string = getResources().getString(R$string.ucrop_label_edit_photo);
        }
        this.f45637c = string;
        B();
    }

    public final void D(UCropFragment uCropFragment, int i10) {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        if (!uCropFragment.isAdded()) {
            UCropFragment uCropFragment2 = this.f45646l;
            if (uCropFragment2 != null) {
                fragmentTransactionBeginTransaction.hide(uCropFragment2);
            }
            fragmentTransactionBeginTransaction.add(R$id.fragment_container, uCropFragment, UCropFragment.B + "-" + i10);
        } else {
            fragmentTransactionBeginTransaction.hide(this.f45646l).show(uCropFragment);
            uCropFragment.p();
        }
        this.f45647m = i10;
        this.f45646l = uCropFragment;
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        v();
        setContentView(R$layout.ucrop_activity_multiple);
        C(getIntent());
        w();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R$menu.ucrop_menu_activity, menu);
        MenuItem menuItemFindItem = menu.findItem(R$id.menu_loader);
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(this.f45643i, BlendModeCompat.SRC_ATOP));
                menuItemFindItem.setIcon(icon);
            } catch (IllegalStateException e10) {
                e10.printStackTrace();
            }
            ((Animatable) menuItemFindItem.getIcon()).start();
        }
        MenuItem menuItemFindItem2 = menu.findItem(R$id.menu_crop);
        Drawable drawable = ContextCompat.getDrawable(this, this.f45642h);
        if (drawable != null) {
            drawable.mutate();
            drawable.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(this.f45643i, BlendModeCompat.SRC_ATOP));
            menuItemFindItem2.setIcon(drawable);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        fd.b.a();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R$id.menu_crop) {
            UCropFragment uCropFragment = this.f45646l;
            if (uCropFragment != null && uCropFragment.isAdded()) {
                this.f45646l.o();
            }
        } else if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final int r() {
        ArrayList<String> stringArrayList = getIntent().getExtras().getStringArrayList("com.yalantis.ucrop.SkipCropMimeType");
        if (stringArrayList == null || stringArrayList.size() <= 0) {
            return 0;
        }
        this.f45656v.addAll(stringArrayList);
        int i10 = -1;
        for (int i11 = 0; i11 < this.f45648n.size(); i11++) {
            i10++;
            if (!this.f45656v.contains(s(this.f45648n.get(i11)))) {
                break;
            }
        }
        if (i10 == -1 || i10 > this.f45645k.size()) {
            return 0;
        }
        return i10;
    }

    public final String s(String str) {
        if (j.j(str)) {
            return j.f(this, Uri.parse(str));
        }
        return j.f(this, Uri.fromFile(new File(str)));
    }

    public final String t() {
        File file;
        String stringExtra = getIntent().getStringExtra("com.yalantis.ucrop.CropOutputDir");
        if (stringExtra != null && !"".equals(stringExtra)) {
            file = new File(stringExtra);
        } else {
            file = new File(getExternalFilesDir(Environment.DIRECTORY_PICTURES).getAbsolutePath(), "Sandbox");
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + File.separator;
    }

    public final void u(@NonNull Intent intent) {
        Throwable thA = com.yalantis.ucrop.a.a(intent);
        if (thA != null) {
            Toast.makeText(this, thA.getMessage(), 1).show();
        } else {
            Toast.makeText(this, "Unexpected error", 0).show();
        }
    }

    public final void v() {
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("com.yalantis.ucrop.isDarkStatusBarBlack", false);
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", ContextCompat.getColor(this, R$color.ucrop_color_statusbar));
        this.f45640f = intExtra;
        id.a.a(this, intExtra, intExtra, booleanExtra);
    }

    public final void w() {
        String strG;
        Uri uriFromFile;
        String str;
        AspectRatio aspectRatio;
        float fD;
        this.f45654t = getIntent().getBooleanExtra("com.yalantis.ucrop.ForbidSkipCrop", false);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("com.yalantis.ucrop.CropTotalDataSource");
        if (stringArrayListExtra != null && stringArrayListExtra.size() > 0) {
            this.f45648n = new ArrayList<>();
            this.f45649o = new ArrayList<>();
            for (int i10 = 0; i10 < stringArrayListExtra.size(); i10++) {
                String str2 = stringArrayListExtra.get(i10);
                this.f45650p.put(str2, new JSONObject());
                if (j.j(str2)) {
                    strG = j.g(this, Uri.parse(str2));
                } else {
                    strG = str2;
                }
                String strS = s(str2);
                if (!j.s(strG) && !j.q(strS) && !j.o(strS)) {
                    this.f45648n.add(str2);
                    Bundle extras = getIntent().getExtras();
                    if (!j.j(str2) && !j.p(str2)) {
                        uriFromFile = Uri.fromFile(new File(str2));
                    } else {
                        uriFromFile = Uri.parse(str2);
                    }
                    String strI = j.i(this, this.f45653s, uriFromFile);
                    if (TextUtils.isEmpty(this.f45651q)) {
                        str = j.c("CROP_") + strI;
                    } else {
                        str = j.b() + "_" + this.f45651q;
                    }
                    Uri uriFromFile2 = Uri.fromFile(new File(t(), str));
                    extras.putParcelable("com.yalantis.ucrop.InputUri", uriFromFile);
                    extras.putParcelable("com.yalantis.ucrop.OutputUri", uriFromFile2);
                    ArrayList<AspectRatio> arrayList = this.f45655u;
                    if (arrayList != null && arrayList.size() > i10) {
                        aspectRatio = this.f45655u.get(i10);
                    } else {
                        aspectRatio = null;
                    }
                    float fE = -1.0f;
                    if (aspectRatio != null) {
                        fD = aspectRatio.d();
                    } else {
                        fD = -1.0f;
                    }
                    extras.putFloat("com.yalantis.ucrop.AspectRatioX", fD);
                    if (aspectRatio != null) {
                        fE = aspectRatio.e();
                    }
                    extras.putFloat("com.yalantis.ucrop.AspectRatioY", fE);
                    this.f45645k.add(UCropFragment.t(extras));
                } else {
                    this.f45649o.add(str2);
                }
            }
            if (this.f45648n.size() != 0) {
                z();
                D(this.f45645k.get(r()), r());
                this.f45652r.g(r());
                return;
            }
            throw new IllegalArgumentException("No clipping data sources are available");
        }
        throw new IllegalArgumentException("Missing required parameters, count cannot be less than 1");
    }
}
