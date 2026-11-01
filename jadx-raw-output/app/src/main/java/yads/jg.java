package yads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class jg {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final RectF f79028j = new RectF();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ConcurrentHashMap f79029k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ConcurrentHashMap f79030l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79031a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f79032b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f79033c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f79034d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f79035e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextPaint f79036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f79037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f79038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ig f79039i;

    public final void a() {
        TextView textView = this.f79037g;
        if (!(!(textView instanceof EditText)) || this.f79031a == 0) {
            return;
        }
        if (this.f79032b) {
            if (textView.getMeasuredHeight() <= 0 || this.f79037g.getMeasuredWidth() <= 0) {
                return;
            }
            int measuredWidth = this.f79039i.a(this.f79037g) ? 1048576 : (this.f79037g.getMeasuredWidth() - this.f79037g.getTotalPaddingLeft()) - this.f79037g.getTotalPaddingRight();
            int height = (this.f79037g.getHeight() - this.f79037g.getCompoundPaddingBottom()) - this.f79037g.getCompoundPaddingTop();
            if (measuredWidth <= 0 || height <= 0) {
                return;
            }
            RectF rectF = f79028j;
            synchronized (rectF) {
                rectF.setEmpty();
                rectF.right = measuredWidth;
                rectF.bottom = height;
                float fA = a(rectF);
                if (fA != this.f79037g.getTextSize()) {
                    a(0, fA);
                }
            }
        }
        this.f79032b = true;
    }

    public static Method b(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f79029k;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public jg(TextView textView) {
        this.f79037g = textView;
        this.f79038h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f79039i = new hg();
        } else {
            this.f79039i = new gg();
        }
    }

    public final int a(RectF rectF) {
        CharSequence transformation;
        int length = this.f79035e.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                int i14 = this.f79035e[i13];
                CharSequence text = this.f79037g.getText();
                TransformationMethod transformationMethod = this.f79037g.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f79037g)) != null) {
                    text = transformation;
                }
                int maxLines = this.f79037g.getMaxLines();
                TextPaint textPaint = this.f79036f;
                if (textPaint == null) {
                    this.f79036f = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f79036f.set(this.f79037g.getPaint());
                this.f79036f.setTextSize(i14);
                Layout.Alignment alignment = (Layout.Alignment) a(this.f79037g, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f79036f, Math.round(rectF.right));
                builderObtain.setAlignment(alignment).setLineSpacing(this.f79037g.getLineSpacingExtra(), this.f79037g.getLineSpacingMultiplier()).setIncludePad(this.f79037g.getIncludeFontPadding()).setBreakStrategy(this.f79037g.getBreakStrategy()).setHyphenationFrequency(this.f79037g.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                try {
                    this.f79039i.a(builderObtain, this.f79037g);
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                StaticLayout staticLayoutBuild = builderObtain.build();
                if ((maxLines == -1 || (staticLayoutBuild.getLineCount() <= maxLines && staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount() - 1) == text.length())) && staticLayoutBuild.getHeight() <= rectF.bottom) {
                    int i15 = i13 + 1;
                    i12 = i11;
                    i11 = i15;
                } else {
                    i12 = i13 - 1;
                    i10 = i12;
                }
            }
            return this.f79035e[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public static Object a(Object obj, String str, Object obj2) {
        try {
            return b(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a(int i10, float f10) {
        Resources resources;
        Context context = this.f79038h;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float fApplyDimension = TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics());
        if (fApplyDimension != this.f79037g.getPaint().getTextSize()) {
            this.f79037g.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = this.f79037g.isInLayout();
            if (this.f79037g.getLayout() != null) {
                this.f79032b = false;
                try {
                    Method methodB = b("nullLayouts");
                    if (methodB != null) {
                        methodB.invoke(this.f79037g, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!zIsInLayout) {
                    this.f79037g.requestLayout();
                } else {
                    this.f79037g.forceLayout();
                }
                this.f79037g.invalidate();
            }
        }
    }
}
