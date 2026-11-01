package com.yalantis.ucrop;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import com.yalantis.ucrop.model.AspectRatio;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.TransformImageView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kd.i;
import kd.j;

/* JADX INFO: loaded from: classes10.dex */
public class UCropActivity extends AppCompatActivity {
    public static final int ALL = 3;
    public static final Bitmap.CompressFormat DEFAULT_COMPRESS_FORMAT = Bitmap.CompressFormat.JPEG;
    public static final int DEFAULT_COMPRESS_QUALITY = 90;
    public static final int NONE = 0;
    public static final int ROTATE = 2;
    public static final int SCALE = 1;
    public TextView A;
    public TextView B;
    public View C;
    public Transition D;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f45563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ColorInt
    public int f45570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @DrawableRes
    public int f45571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @DrawableRes
    public int f45572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45573m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f45574n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f45576p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public UCropView f45577q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public GestureCropImageView f45578r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public OverlayView f45579s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ViewGroup f45580t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ViewGroup f45581u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ViewGroup f45582v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ViewGroup f45583w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ViewGroup f45584x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ViewGroup f45585y;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45575o = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List<ViewGroup> f45586z = new ArrayList();
    public Bitmap.CompressFormat E = DEFAULT_COMPRESS_FORMAT;
    public int F = 90;
    public int[] G = {1, 2, 3};
    public TransformImageView.c H = new a();
    public final View.OnClickListener I = new g();

    public class a implements TransformImageView.c {
        public a() {
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.c
        public void a() {
            UCropActivity.this.f45577q.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            UCropActivity.this.C.setClickable(false);
            if (UCropActivity.this.getIntent().getBooleanExtra("com.yalantis.ucrop.ForbidCropGifWebp", false)) {
                String strF = j.f(UCropActivity.this, (Uri) UCropActivity.this.getIntent().getParcelableExtra("com.yalantis.ucrop.InputUri"));
                if (j.m(strF) || j.t(strF)) {
                    UCropActivity.this.C.setClickable(true);
                }
            }
            UCropActivity.this.f45575o = false;
            UCropActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.c
        public void b(@NonNull Exception exc) {
            UCropActivity.this.H(exc);
            UCropActivity.this.finish();
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.c
        public void c(float f10) {
            UCropActivity.this.J(f10);
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.c
        public void d(float f10) {
            UCropActivity.this.D(f10);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.f45578r.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).b(view.isSelected()));
            UCropActivity.this.f45578r.y();
            if (view.isSelected()) {
                return;
            }
            for (ViewGroup viewGroup : UCropActivity.this.f45586z) {
                viewGroup.setSelected(viewGroup == view);
            }
        }
    }

    public class c implements HorizontalProgressWheelView.a {
        public c() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a() {
            UCropActivity.this.f45578r.y();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b() {
            UCropActivity.this.f45578r.s();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void c(float f10, float f11) {
            UCropActivity.this.f45578r.w(f10 / 42.0f);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.A();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.B(90);
        }
    }

    public class f implements HorizontalProgressWheelView.a {
        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void c(float f10, float f11) {
            if (f10 > 0.0f) {
                UCropActivity.this.f45578r.B(UCropActivity.this.f45578r.getCurrentScale() + (f10 * ((UCropActivity.this.f45578r.getMaxScale() - UCropActivity.this.f45578r.getMinScale()) / 15000.0f)));
            } else {
                UCropActivity.this.f45578r.D(UCropActivity.this.f45578r.getCurrentScale() + (f10 * ((UCropActivity.this.f45578r.getMaxScale() - UCropActivity.this.f45578r.getMinScale()) / 15000.0f)));
            }
        }

        public f() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void a() {
            UCropActivity.this.f45578r.y();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.a
        public void b() {
            UCropActivity.this.f45578r.s();
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!view.isSelected()) {
                UCropActivity.this.M(view.getId());
            }
        }
    }

    public class h implements gd.a {
        public h() {
        }

        @Override // gd.a
        public void a(@NonNull Uri uri, int i10, int i11, int i12, int i13) {
            UCropActivity uCropActivity = UCropActivity.this;
            uCropActivity.I(uri, uCropActivity.f45578r.getTargetAspectRatio(), i10, i11, i12, i13);
            UCropActivity.this.finish();
        }

        @Override // gd.a
        public void b(@NonNull Throwable th2) {
            UCropActivity.this.H(th2);
            UCropActivity.this.finish();
        }
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public final void A() {
        GestureCropImageView gestureCropImageView = this.f45578r;
        gestureCropImageView.w(-gestureCropImageView.getCurrentAngle());
        this.f45578r.y();
    }

    public final void B(int i10) {
        this.f45578r.w(i10);
        this.f45578r.y();
    }

    public final void C(int i10) {
        GestureCropImageView gestureCropImageView = this.f45578r;
        int i11 = this.G[i10];
        gestureCropImageView.setScaleEnabled(i11 == 3 || i11 == 1);
        GestureCropImageView gestureCropImageView2 = this.f45578r;
        int i12 = this.G[i10];
        gestureCropImageView2.setRotateEnabled(i12 == 3 || i12 == 2);
        this.f45578r.setGestureEnabled(getIntent().getBooleanExtra("com.yalantis.ucrop.isDragImages", true));
    }

    public final void D(float f10) {
        TextView textView = this.A;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f10)));
        }
    }

    public final void E(int i10) {
        TextView textView = this.A;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public final void F(@NonNull Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        z(intent);
        if (uri == null || uri2 == null) {
            H(new NullPointerException(getString(R$string.ucrop_error_input_data_is_absent)));
            finish();
            return;
        }
        try {
            this.f45578r.k(uri, j.u(this, this.f45576p, uri, uri2), this.f45565e);
        } catch (Exception e10) {
            H(e10);
            finish();
        }
    }

    public final void G() {
        if (!this.f45574n) {
            C(0);
        } else if (this.f45580t.getVisibility() == 0) {
            M(R$id.state_aspect_ratio);
        } else {
            M(R$id.state_scale);
        }
    }

    public void H(Throwable th2) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th2));
    }

    public final void J(float f10) {
        TextView textView = this.B;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f10 * 100.0f))));
        }
    }

    public final void K(int i10) {
        TextView textView = this.B;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public final void M(@IdRes int i10) {
        if (this.f45574n) {
            ViewGroup viewGroup = this.f45580t;
            int i11 = R$id.state_aspect_ratio;
            viewGroup.setSelected(i10 == i11);
            ViewGroup viewGroup2 = this.f45581u;
            int i12 = R$id.state_rotate;
            viewGroup2.setSelected(i10 == i12);
            ViewGroup viewGroup3 = this.f45582v;
            int i13 = R$id.state_scale;
            viewGroup3.setSelected(i10 == i13);
            this.f45583w.setVisibility(i10 == i11 ? 0 : 8);
            this.f45584x.setVisibility(i10 == i12 ? 0 : 8);
            this.f45585y.setVisibility(i10 == i13 ? 0 : 8);
            v(i10);
            if (i10 == i13) {
                C(0);
            } else if (i10 == i12) {
                C(1);
            } else {
                C(2);
            }
        }
    }

    public final void N() {
        L(this.f45567g);
        Toolbar toolbar = (Toolbar) findViewById(R$id.toolbar);
        toolbar.setBackgroundColor(this.f45566f);
        toolbar.setTitleTextColor(this.f45569i);
        TextView textView = (TextView) toolbar.findViewById(R$id.toolbar_title);
        textView.setTextColor(this.f45569i);
        textView.setText(this.f45563c);
        textView.setTextSize(this.f45564d);
        Drawable drawableMutate = AppCompatResources.getDrawable(this, this.f45571k).mutate();
        drawableMutate.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(this.f45569i, BlendModeCompat.SRC_ATOP));
        toolbar.setNavigationIcon(drawableMutate);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
    }

    public final void O(@NonNull Intent intent) {
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList<AspectRatio> parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            intExtra = 2;
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new AspectRatio(null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new AspectRatio(null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new AspectRatio(getString(R$string.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new AspectRatio(null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new AspectRatio(null, 16.0f, 9.0f));
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.layout_aspect_ratio);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        for (AspectRatio aspectRatio : parcelableArrayListExtra) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(R$layout.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.f45568h);
            aspectRatioTextView.setAspectRatio(aspectRatio);
            linearLayout.addView(frameLayout);
            this.f45586z.add(frameLayout);
        }
        this.f45586z.get(intExtra).setSelected(true);
        Iterator<ViewGroup> it = this.f45586z.iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(new b());
        }
    }

    public final void P() {
        this.A = (TextView) findViewById(R$id.text_view_rotate);
        int i10 = R$id.rotate_scroll_wheel;
        ((HorizontalProgressWheelView) findViewById(i10)).setScrollingListener(new c());
        ((HorizontalProgressWheelView) findViewById(i10)).setMiddleLineColor(this.f45568h);
        findViewById(R$id.wrapper_reset_rotate).setOnClickListener(new d());
        findViewById(R$id.wrapper_rotate_by_angle).setOnClickListener(new e());
        E(this.f45568h);
    }

    public final void Q() {
        this.B = (TextView) findViewById(R$id.text_view_scale);
        int i10 = R$id.scale_scroll_wheel;
        ((HorizontalProgressWheelView) findViewById(i10)).setScrollingListener(new f());
        ((HorizontalProgressWheelView) findViewById(i10)).setMiddleLineColor(this.f45568h);
        K(this.f45568h);
    }

    public final void R() {
        ImageView imageView = (ImageView) findViewById(R$id.image_view_state_scale);
        ImageView imageView2 = (ImageView) findViewById(R$id.image_view_state_rotate);
        ImageView imageView3 = (ImageView) findViewById(R$id.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new i(imageView.getDrawable(), this.f45568h));
        imageView2.setImageDrawable(new i(imageView2.getDrawable(), this.f45568h));
        imageView3.setImageDrawable(new i(imageView3.getDrawable(), this.f45568h));
    }

    public final void S(@NonNull Intent intent) {
        this.f45576p = intent.getBooleanExtra("com.yalantis.ucrop.ForbidCropGifWebp", false);
        this.f45567g = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", ContextCompat.getColor(this, R$color.ucrop_color_statusbar));
        this.f45566f = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", ContextCompat.getColor(this, R$color.ucrop_color_toolbar));
        this.f45568h = intent.getIntExtra("com.yalantis.ucrop.UcropColorControlsWidgetActive", ContextCompat.getColor(this, R$color.ucrop_color_active_controls_color));
        this.f45569i = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", ContextCompat.getColor(this, R$color.ucrop_color_toolbar_widget));
        this.f45571k = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", R$drawable.ucrop_ic_cross);
        this.f45572l = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", R$drawable.ucrop_ic_done);
        this.f45563c = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.f45564d = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarTitleTextSize", 18);
        String string = this.f45563c;
        if (string == null) {
            string = getResources().getString(R$string.ucrop_label_edit_photo);
        }
        this.f45563c = string;
        this.f45573m = intent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", ContextCompat.getColor(this, R$color.ucrop_color_default_logo));
        this.f45574n = !intent.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
        this.f45570j = intent.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", ContextCompat.getColor(this, R$color.ucrop_color_crop_background));
        N();
        y();
        if (this.f45574n) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(R$id.ucrop_photobox)).findViewById(R$id.controls_wrapper);
            viewGroup.setVisibility(0);
            LayoutInflater.from(this).inflate(R$layout.ucrop_controls, viewGroup, true);
            AutoTransition autoTransition = new AutoTransition();
            this.D = autoTransition;
            autoTransition.setDuration(50L);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R$id.state_aspect_ratio);
            this.f45580t = viewGroup2;
            viewGroup2.setOnClickListener(this.I);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(R$id.state_rotate);
            this.f45581u = viewGroup3;
            viewGroup3.setOnClickListener(this.I);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(R$id.state_scale);
            this.f45582v = viewGroup4;
            viewGroup4.setOnClickListener(this.I);
            this.f45583w = (ViewGroup) findViewById(R$id.layout_aspect_ratio);
            this.f45584x = (ViewGroup) findViewById(R$id.layout_rotate_wheel);
            this.f45585y = (ViewGroup) findViewById(R$id.layout_scale_wheel);
            O(intent);
            P();
            Q();
            R();
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R$id.menu_crop).setVisible(!this.f45575o);
        menu.findItem(R$id.menu_loader).setVisible(this.f45575o);
        return super.onPrepareOptionsMenu(menu);
    }

    public final void u() {
        if (this.C == null) {
            this.C = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, R$id.toolbar);
            this.C.setLayoutParams(layoutParams);
            this.C.setClickable(true);
        }
        ((RelativeLayout) findViewById(R$id.ucrop_photobox)).addView(this.C);
    }

    public final void v(int i10) {
        TransitionManager.beginDelayedTransition((ViewGroup) findViewById(R$id.ucrop_photobox), this.D);
        this.f45582v.findViewById(R$id.text_view_scale).setVisibility(i10 == R$id.state_scale ? 0 : 8);
        this.f45580t.findViewById(R$id.text_view_crop).setVisibility(i10 == R$id.state_aspect_ratio ? 0 : 8);
        this.f45581u.findViewById(R$id.text_view_rotate).setVisibility(i10 != R$id.state_rotate ? 8 : 0);
    }

    public void w() {
        this.C.setClickable(true);
        this.f45575o = true;
        supportInvalidateOptionsMenu();
        this.f45578r.t(this.E, this.F, new h());
    }

    public final void y() {
        UCropView uCropView = (UCropView) findViewById(R$id.ucrop);
        this.f45577q = uCropView;
        this.f45578r = uCropView.getCropImageView();
        this.f45579s = this.f45577q.getOverlayView();
        this.f45578r.setTransformImageListener(this.H);
        ((ImageView) findViewById(R$id.image_view_logo)).setColorFilter(this.f45573m, PorterDuff.Mode.SRC_ATOP);
        int i10 = R$id.ucrop_frame;
        findViewById(i10).setBackgroundColor(this.f45570j);
        if (this.f45574n) {
            return;
        }
        ((RelativeLayout.LayoutParams) findViewById(i10).getLayoutParams()).bottomMargin = 0;
        findViewById(i10).requestLayout();
    }

    public final void z(@NonNull Intent intent) {
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.CompressionFormatName");
        Bitmap.CompressFormat compressFormatValueOf = !TextUtils.isEmpty(stringExtra) ? Bitmap.CompressFormat.valueOf(stringExtra) : null;
        if (compressFormatValueOf == null) {
            compressFormatValueOf = DEFAULT_COMPRESS_FORMAT;
        }
        this.E = compressFormatValueOf;
        this.F = intent.getIntExtra("com.yalantis.ucrop.CompressionQuality", 90);
        int[] intArrayExtra = intent.getIntArrayExtra("com.yalantis.ucrop.AllowedGestures");
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.G = intArrayExtra;
        }
        this.f45565e = intent.getBooleanExtra("com.yalantis.ucrop.CustomLoaderCropBitmap", false);
        this.f45578r.setMaxBitmapSize(intent.getIntExtra("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.f45578r.setMaxScaleMultiplier(intent.getFloatExtra("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.f45578r.setImageToWrapCropBoundsAnimDuration(intent.getIntExtra("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
        this.f45579s.setFreestyleCropEnabled(intent.getBooleanExtra("com.yalantis.ucrop.FreeStyleCrop", false));
        this.f45579s.setDragSmoothToCenter(intent.getBooleanExtra("com.yalantis.ucrop.DragSmoothToCenter", false));
        OverlayView overlayView = this.f45579s;
        Resources resources = getResources();
        int i10 = R$color.ucrop_color_default_dimmed;
        overlayView.setDimmedColor(intent.getIntExtra("com.yalantis.ucrop.DimmedLayerColor", resources.getColor(i10)));
        this.f45579s.setCircleStrokeColor(intent.getIntExtra("com.yalantis.ucrop.CircleStrokeColor", getResources().getColor(i10)));
        this.f45579s.setCircleDimmedLayer(intent.getBooleanExtra("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.f45579s.setShowCropFrame(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropFrame", true));
        this.f45579s.setCropFrameColor(intent.getIntExtra("com.yalantis.ucrop.CropFrameColor", getResources().getColor(R$color.ucrop_color_default_crop_frame)));
        this.f45579s.setCropFrameStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_frame_stoke_width)));
        this.f45579s.setShowCropGrid(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropGrid", true));
        this.f45579s.setCropGridRowCount(intent.getIntExtra("com.yalantis.ucrop.CropGridRowCount", 2));
        this.f45579s.setCropGridColumnCount(intent.getIntExtra("com.yalantis.ucrop.CropGridColumnCount", 2));
        this.f45579s.setCropGridColor(intent.getIntExtra("com.yalantis.ucrop.CropGridColor", getResources().getColor(R$color.ucrop_color_default_crop_grid)));
        OverlayView overlayView2 = this.f45579s;
        Resources resources2 = getResources();
        int i11 = R$dimen.ucrop_default_crop_grid_stoke_width;
        overlayView2.setCropGridStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropGridStrokeWidth", resources2.getDimensionPixelSize(i11)));
        this.f45579s.setDimmedStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CircleStrokeWidth", getResources().getDimensionPixelSize(i11)));
        float floatExtra = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioX", -1.0f);
        float floatExtra2 = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioY", -1.0f);
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (floatExtra >= 0.0f && floatExtra2 >= 0.0f) {
            ViewGroup viewGroup = this.f45580t;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            float f10 = floatExtra / floatExtra2;
            this.f45578r.setTargetAspectRatio(Float.isNaN(f10) ? 0.0f : f10);
        } else if (parcelableArrayListExtra == null || intExtra >= parcelableArrayListExtra.size()) {
            this.f45578r.setTargetAspectRatio(0.0f);
        } else {
            float fD = ((AspectRatio) parcelableArrayListExtra.get(intExtra)).d() / ((AspectRatio) parcelableArrayListExtra.get(intExtra)).e();
            this.f45578r.setTargetAspectRatio(Float.isNaN(fD) ? 0.0f : fD);
        }
        int intExtra2 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeX", 0);
        int intExtra3 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeY", 0);
        if (intExtra2 <= 0 || intExtra3 <= 0) {
            return;
        }
        this.f45578r.setMaxResultImageSizeX(intExtra2);
        this.f45578r.setMaxResultImageSizeY(intExtra3);
    }

    public void I(Uri uri, float f10, int i10, int i11, int i12, int i13) {
        setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f10).putExtra("com.yalantis.ucrop.ImageWidth", i12).putExtra("com.yalantis.ucrop.ImageHeight", i13).putExtra("com.yalantis.ucrop.OffsetX", i10).putExtra("com.yalantis.ucrop.OffsetY", i11).putExtra("com.yalantis.ucrop.CropInputOriginal", j.e((Uri) getIntent().getParcelableExtra("com.yalantis.ucrop.InputUri"))));
    }

    @TargetApi(21)
    public final void L(@ColorInt int i10) {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i10);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x();
        setContentView(R$layout.ucrop_activity_photobox);
        Intent intent = getIntent();
        S(intent);
        F(intent);
        G();
        u();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R$menu.ucrop_menu_activity, menu);
        MenuItem menuItemFindItem = menu.findItem(R$id.menu_loader);
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(this.f45569i, BlendModeCompat.SRC_ATOP));
                menuItemFindItem.setIcon(icon);
            } catch (IllegalStateException e10) {
                Log.i("UCropActivity", String.format("%s - %s", e10.getMessage(), getString(R$string.ucrop_mutate_exception_hint)));
            }
            ((Animatable) menuItemFindItem.getIcon()).start();
        }
        MenuItem menuItemFindItem2 = menu.findItem(R$id.menu_crop);
        Drawable drawable = ContextCompat.getDrawable(this, this.f45572l);
        if (drawable != null) {
            drawable.mutate();
            drawable.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(this.f45569i, BlendModeCompat.SRC_ATOP));
            menuItemFindItem2.setIcon(drawable);
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
            w();
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.f45578r;
        if (gestureCropImageView != null) {
            gestureCropImageView.s();
        }
    }

    public final void x() {
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("com.yalantis.ucrop.isDarkStatusBarBlack", false);
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", ContextCompat.getColor(this, R$color.ucrop_color_statusbar));
        this.f45567g = intExtra;
        id.a.a(this, intExtra, intExtra, booleanExtra);
    }
}
