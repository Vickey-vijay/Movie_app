package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes8.dex */
public class YandexWarningTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f70201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f70202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f70203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f70204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f70205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f70206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f70207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f70208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f70209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f70210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f70211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f70212l;

    public YandexWarningTextView(Context context) {
        super(context);
        this.f70201a = 25;
        this.f70202b = 10;
        this.f70203c = 35.0f;
        this.f70205e = 1;
        this.f70206f = 50.0f;
        this.f70207g = false;
        this.f70208h = 0;
        this.f70209i = 0.0f;
        this.f70210j = 1000;
        this.f70211k = 1000;
        this.f70212l = 1000;
        a(null);
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70201a = 25;
        this.f70202b = 10;
        this.f70203c = 35.0f;
        this.f70205e = 1;
        this.f70206f = 50.0f;
        this.f70207g = false;
        this.f70208h = 0;
        this.f70209i = 0.0f;
        this.f70210j = 1000;
        this.f70211k = 1000;
        this.f70212l = 1000;
        a(attributeSet);
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f70201a = 25;
        this.f70202b = 10;
        this.f70203c = 35.0f;
        this.f70205e = 1;
        this.f70206f = 50.0f;
        this.f70207g = false;
        this.f70208h = 0;
        this.f70209i = 0.0f;
        this.f70210j = 1000;
        this.f70211k = 1000;
        this.f70212l = 1000;
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.YandexWarningTextView);
            this.f70201a = e.d(getContext(), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexWarningTextView_bigo_ad_maxTextSize, this.f70201a));
            this.f70202b = e.d(getContext(), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexWarningTextView_bigo_ad_minTextSize, this.f70202b));
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f70210j = e.c(getContext());
        this.f70211k = e.b(getContext());
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int i10 = this.f70205e;
        if (i10 > 2) {
            i10 = 2;
        }
        canvas.save();
        float f10 = (this.f70204d * 1.0f) / i10;
        float f11 = f10 / this.f70206f;
        sg.bigo.ads.common.t.a.a("yandexWarn", "onDraw...singleLineHeight:" + f10 + "...scaleY:" + f11 + "...mPy:" + this.f70209i);
        canvas.scale(1.0f, f11, 0.0f, this.f70209i);
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        try {
            if (TextUtils.isEmpty(getText())) {
                return;
            }
            int paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
            int paddingTop = (i11 - getPaddingTop()) - getPaddingBottom();
            this.f70204d = paddingTop;
            float f10 = this.f70201a;
            float f11 = paddingTop * 0.5f;
            this.f70203c = f11;
            setLineSpacing(f11, 0.0f);
            setTextSize(2, f10);
            StaticLayout staticLayout = new StaticLayout(getText(), getPaint(), paddingLeft, Layout.Alignment.ALIGN_NORMAL, 0.0f, this.f70203c, true);
            while (true) {
                if ((staticLayout.getHeight() <= this.f70204d && staticLayout.getWidth() <= paddingLeft) || f10 <= this.f70202b) {
                    break;
                }
                f10 -= 1.0f;
                setTextSize(2, f10);
                staticLayout = new StaticLayout(getText(), getPaint(), paddingLeft, Layout.Alignment.ALIGN_NORMAL, 0.0f, this.f70203c, true);
            }
            this.f70205e = staticLayout.getLineCount();
            this.f70208h = staticLayout.getLineAscent(0);
            this.f70206f = e.b(getContext(), Math.round(f10));
            int iAbs = Math.abs(this.f70208h);
            boolean z10 = this.f70207g;
            if (z10 || 1 == (i14 = this.f70205e)) {
                if (!z10 || f10 <= 20.0f) {
                    this.f70209i = iAbs / 2.0f;
                } else {
                    this.f70209i = iAbs * 1.1f;
                }
            } else if (i14 >= 3) {
                this.f70209i = 0.0f;
            } else if (f10 > 36.0f) {
                this.f70209i = iAbs * 1.1f;
            } else {
                this.f70209i = (iAbs * 1.0f) / i14;
            }
            if (this.f70211k <= 1000 && this.f70210j <= 1000) {
                this.f70209i = 0.0f;
            }
            setLineSpacing(this.f70206f, 0.0f);
            sg.bigo.ads.common.t.a.a("yandexWarn", "adjust...line " + this.f70205e + "...TextSizeSP:" + f10 + "...TextSizePx:" + this.f70206f + "...TotalHeight:" + this.f70204d + "..lineSpace:" + this.f70203c + "...scaleX:" + getPaint().getTextScaleX() + "...mSecondLineAscentHeight:" + this.f70208h + "...secondLineTopH:" + staticLayout.getLineTop(0) + "...mPy:" + this.f70209i);
        } catch (Throwable unused) {
        }
    }

    public void setIsHorizontal(boolean z10) {
        this.f70207g = z10;
    }
}
