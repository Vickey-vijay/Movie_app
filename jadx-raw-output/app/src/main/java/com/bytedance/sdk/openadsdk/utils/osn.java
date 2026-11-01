package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class osn {
    private static int bly = -1;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private static Boolean f13389cf = null;
    private static int fkw = -1;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static int f13390le = -1;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static float f13391lh = -1.0f;
    private static boolean mwh = true;
    private static float ouw = -1.0f;
    private static ViewConfiguration pno = null;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static WindowManager f13392ra = null;
    private static final Object ryl = new Object();
    private static float tlj = -1.0f;
    private static int vt = -1;
    private static int yu = -1;

    public static float bly(Context context) {
        ouw(context, true);
        return ouw;
    }

    public static int cf(Context context) {
        ouw(context, false);
        return vt;
    }

    public static void fkw(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.osn.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    osn.ouw(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    private static boolean ko(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(clsLoadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static void le(View view) {
        if (view == null) {
            return;
        }
        ouw(view, 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.osn.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    public static int[] lh(Context context) {
        if (context == null) {
            return null;
        }
        if (f13392ra == null) {
            f13392ra = (WindowManager) com.bytedance.sdk.openadsdk.core.zih.ouw().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = f13392ra;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i10 = point.x;
                i11 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i10;
            iArr[1] = i11;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static void ouw(Context context) {
        ouw(context, false);
    }

    public static int pno(Context context) {
        ouw(context, false);
        return vt(context, fkw);
    }

    public static int ra(Context context) {
        if (context == null) {
            com.bytedance.sdk.openadsdk.core.zih.ouw();
        }
        if (context == null) {
            return f13390le;
        }
        if (context.getResources() != null && context.getResources().getConfiguration() != null) {
            f13390le = context.getResources().getConfiguration().smallestScreenWidthDp;
        }
        return f13390le;
    }

    private static boolean rn(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static float tlj(Context context) {
        ouw(context, false);
        return f13391lh;
    }

    public static int vt(Context context, float f10) {
        ouw(context, true);
        float fBly = bly(context);
        if (fBly <= 0.0f) {
            fBly = 1.0f;
        }
        return (int) ((f10 / fBly) + 0.5f);
    }

    private static boolean yu() {
        return ouw < 0.0f || vt < 0 || f13391lh < 0.0f || yu < 0 || fkw < 0;
    }

    private static boolean zih(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", TypedValues.Custom.S_STRING, "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            return (string == null || TextUtils.isEmpty(string)) ? false : true;
        } catch (Exception unused) {
        }
    }

    private static void ouw(Context context, boolean z10) {
        Context contextOuw = context == null ? com.bytedance.sdk.openadsdk.core.zih.ouw() : context;
        if (contextOuw == null) {
            return;
        }
        f13392ra = (WindowManager) contextOuw.getSystemService("window");
        if (yu() || z10) {
            DisplayMetrics displayMetrics = contextOuw.getResources().getDisplayMetrics();
            ouw = displayMetrics.density;
            vt = displayMetrics.densityDpi;
            f13391lh = displayMetrics.scaledDensity;
            yu = displayMetrics.widthPixels;
            fkw = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration.orientation == 1) {
            int i10 = yu;
            int i11 = fkw;
            if (i10 > i11) {
                yu = i11;
                fkw = i10;
            }
        } else {
            int i12 = yu;
            int i13 = fkw;
            if (i12 < i13) {
                yu = i13;
                fkw = i12;
            }
        }
        f13390le = configuration.smallestScreenWidthDp;
    }

    public static Pair<Integer, Integer> ryl(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.zih.ouw();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static boolean yu(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static int jg(Context context) {
        return ((Integer) ryl(context).first).intValue();
    }

    public static int mwh(Context context) {
        return ((Integer) ryl(context).second).intValue();
    }

    public static int[] vt(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static boolean yu(Activity activity) {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        DisplayCutout displayCutout = null;
        try {
            WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets != null) {
                displayCutout = rootWindowInsets.getDisplayCutout();
                mwh = false;
            }
            return displayCutout != null;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.lh("UIUtils", e10.getMessage());
            return false;
        }
    }

    public static void vt(Activity activity) {
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    public static int fkw(Context context) {
        ouw(context, false);
        return vt(context, yu);
    }

    public static int le(Context context) {
        ouw(context, false);
        return fkw;
    }

    public static void ra(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static boolean vt() {
        return mwh && Build.VERSION.SDK_INT >= 28;
    }

    private static Bitmap vt(com.bytedance.sdk.component.bly.le leVar) {
        if (leVar == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(leVar.getWidth(), leVar.getHeight(), Bitmap.Config.RGB_565);
            leVar.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int yu(Context context) {
        ouw(context, false);
        return yu;
    }

    private static ArrayList<Integer> vt(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            int[] iArr = new int[i10];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = iArr[i11];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i12) >> 16, (65280 & i12) >> 8, i12 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static int[] lh(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a0  */
    public static boolean lh(Activity activity) {
        boolean z10;
        if (f13389cf == null) {
            synchronized (ryl) {
                if (f13389cf == null) {
                    String strOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("cutout_devices", "");
                    String str = Build.MODEL;
                    if (!TextUtils.isEmpty(strOuw) && !TextUtils.isEmpty(str)) {
                        try {
                            JSONArray jSONArray = new JSONArray(strOuw);
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                if (str.equals(jSONArray.getString(i10))) {
                                    f13389cf = Boolean.TRUE;
                                    return true;
                                }
                            }
                        } catch (Exception e10) {
                            com.bytedance.sdk.component.utils.qbp.lh("UIUtils", e10.getMessage());
                        }
                    }
                    if (!yu(activity) && ouw("ro.miui.notch", activity) != 1 && !ko(activity) && !activity.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism") && !rn(activity)) {
                        String str2 = Build.MODEL;
                        z10 = (str2.equals("IN2010") || str2.equals("IN2020") || str2.equals("KB2000") || str2.startsWith("ONEPLUS")) || zih(activity);
                    }
                    f13389cf = Boolean.valueOf(z10);
                }
            }
        }
        return f13389cf.booleanValue();
    }

    public static int ouw(Context context, float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return Float.valueOf(ouw(context, f10, true)).intValue();
    }

    public static void vt(View view, final float f10) {
        if (view != null && f10 > 0.0f) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.osn.5
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f10);
                }
            });
            view.setClipToOutline(true);
        }
    }

    @Nullable
    public static int[] ouw(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static float vt(Context context) {
        ouw(context, false);
        ouw(context, false);
        return f13391lh * 8.0f;
    }

    public static void ouw(View view, int i10) {
        if (view == null || view.getVisibility() == i10) {
            return;
        }
        if (i10 == 0 || i10 == 8 || i10 == 4) {
            view.setVisibility(i10);
        }
    }

    public static void ouw(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    public static /* synthetic */ void vt(final com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str, String str2, final Bitmap bitmap, final String str3, final long j10) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, str, str2, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.utils.osn.4
                        @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                        public final JSONObject lh() {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                int iOuw = osn.ouw(bitmap);
                                jSONObject.put("url", str3);
                                long j11 = j10;
                                if (j11 != -1) {
                                    jSONObject.put("page_id", j11);
                                }
                                jSONObject.put("render_type", "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", iOuw == 100 ? 1 : 0);
                                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.od.vt(vppVar) ? 1 : 0);
                                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(vppVar) ? 1 : 0);
                            } catch (JSONException unused) {
                            }
                            return jSONObject;
                        }
                    });
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.lh("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th2)));
            }
        }
    }

    public static void ouw(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.leftMargin == i10 && marginLayoutParams.topMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.bottomMargin == i13) {
            return;
        }
        if (i10 != -3) {
            marginLayoutParams.leftMargin = i10;
        }
        if (i11 != -3) {
            marginLayoutParams.topMargin = i11;
        }
        if (i12 != -3) {
            marginLayoutParams.rightMargin = i12;
        }
        if (i13 != -3) {
            marginLayoutParams.bottomMargin = i13;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    private static Bitmap ouw(WebView webView) {
        Bitmap bitmapCreateBitmap = null;
        try {
            Picture pictureCapturePicture = webView.capturePicture();
            bitmapCreateBitmap = Bitmap.createBitmap(pictureCapturePicture.getWidth(), pictureCapturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            pictureCapturePicture.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("UIUtils", th2.getMessage());
            return bitmapCreateBitmap;
        }
    }

    public static float ouw() {
        float f10 = tlj;
        if (f10 > 0.0f) {
            return f10;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.zih.ouw().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0.0f;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        tlj = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void lh() {
        f13389cf = Boolean.TRUE;
    }

    public static void ouw(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.lh("UIUtils", e10.getMessage());
        }
    }

    private static int ouw(String str, Activity activity) {
        if (!tc.lh()) {
            return 0;
        }
        try {
            Class<?> clsLoadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
            return ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String(str), 0)).intValue();
        } catch (ClassNotFoundException e10) {
            com.bytedance.sdk.component.utils.qbp.lh("UIUtils", e10.getMessage());
            return 0;
        } catch (IllegalAccessException e11) {
            com.bytedance.sdk.component.utils.qbp.lh("UIUtils", e11.getMessage());
            return 0;
        } catch (IllegalArgumentException e12) {
            com.bytedance.sdk.component.utils.qbp.lh("UIUtils", e12.getMessage());
            return 0;
        } catch (NoSuchMethodException e13) {
            com.bytedance.sdk.component.utils.qbp.lh("UIUtils", e13.getMessage());
            return 0;
        } catch (InvocationTargetException e14) {
            com.bytedance.sdk.component.utils.qbp.lh("UIUtils", e14.getMessage());
            return 0;
        }
    }

    public static void ouw(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.qbp.lh("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void ouw(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.qbp.lh("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void ouw(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
    }

    public static void ouw(TextView textView, com.bytedance.sdk.openadsdk.core.widget.rn rnVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        ouw(textView, rnVar, vppVar, 14);
    }

    private static void ouw(TextView textView, com.bytedance.sdk.openadsdk.core.widget.rn rnVar, double d10, int i10) {
        if (d10 == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            rnVar.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d10)));
            }
            ouw(rnVar, d10, i10);
        }
    }

    private static void ouw(com.bytedance.sdk.openadsdk.core.widget.rn rnVar, double d10, int i10) {
        if (d10 < 0.0d) {
            rnVar.setVisibility(8);
        } else {
            rnVar.setVisibility(0);
            rnVar.ouw(d10, i10);
        }
    }

    public static Bitmap ouw(com.bytedance.sdk.component.bly.le leVar) {
        WebView webView = leVar.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap bitmapVt = vt(leVar);
        if (bitmapVt == null) {
            bitmapVt = ouw(webView);
        }
        webView.setLayerType(layerType, null);
        if (bitmapVt == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.yu.ouw(bitmapVt, bitmapVt.getWidth() / 6, bitmapVt.getHeight() / 6);
    }

    public static void ouw(final com.bytedance.sdk.openadsdk.core.model.vpp vppVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j10) {
        bs.vt(new com.bytedance.sdk.component.pno.pno("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.osn.3
            @Override // java.lang.Runnable
            public final void run() {
                osn.vt(vppVar, str, str2, bitmap, str3, j10);
            }
        }, 10);
    }

    public static int ouw(Bitmap bitmap) {
        try {
            ArrayList<Integer> arrayListVt = vt(bitmap);
            if (arrayListVt == null) {
                return -1;
            }
            HashMap map = new HashMap();
            for (Integer num : arrayListVt) {
                if (map.containsKey(num)) {
                    Integer numValueOf = Integer.valueOf(((Integer) map.get(num)).intValue() + 1);
                    map.remove(num);
                    map.put(num, numValueOf);
                } else {
                    map.put(num, 1);
                }
            }
            int iIntValue = 0;
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (i10 < iIntValue2) {
                    iIntValue = ((Integer) entry.getKey()).intValue();
                    i10 = iIntValue2;
                }
            }
            if (iIntValue == 0) {
                return -1;
            }
            return (int) ((i10 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static boolean ouw(float f10, float f11, Context context) {
        com.bytedance.sdk.component.utils.ko.ouw("UIUtils", Float.valueOf(f10), Float.valueOf(f11));
        if (f10 != -1.0f && f11 != -1.0f) {
            if (pno == null) {
                pno = ViewConfiguration.get(context);
            }
            if (bly == -1) {
                bly = pno.getScaledTouchSlop();
            }
            if (f10 - f11 > bly) {
                return true;
            }
        }
        return false;
    }

    public static float ouw(Context context, float f10, boolean z10) {
        ouw(context, false);
        return (f10 * bly(context)) + (z10 ? 0.5f : 0.0f);
    }

    public static void ouw(TextView textView, com.bytedance.sdk.openadsdk.core.widget.rn rnVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, int i10) {
        com.bytedance.sdk.openadsdk.core.model.le leVar;
        ouw(textView, rnVar, (vppVar == null || (leVar = vppVar.wp) == null) ? -1.0d : leVar.fkw, i10);
    }
}
