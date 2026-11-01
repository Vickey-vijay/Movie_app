package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes10.dex */
public class PrivacyCheckBox extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f70112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f70113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f70114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f70115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f70116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f70117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f70118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f70119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f70120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f70121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PorterDuffXfermode f70122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f70123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f70124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d f70125n;

    public class a {
        private a() {
        }

        public /* synthetic */ a(PrivacyCheckBox privacyCheckBox, byte b10) {
            this();
        }

        public void a(Canvas canvas) {
            Paint paint;
            int i10;
            if (PrivacyCheckBox.this.f70112a) {
                paint = PrivacyCheckBox.this.f70116e;
                i10 = PrivacyCheckBox.this.f70118g;
            } else {
                paint = PrivacyCheckBox.this.f70116e;
                i10 = PrivacyCheckBox.this.f70119h;
            }
            paint.setColor(i10);
            canvas.drawCircle(0.0f, 0.0f, PrivacyCheckBox.this.f70115d, PrivacyCheckBox.this.f70116e);
        }

        public void b(Canvas canvas) {
            Paint paint;
            int i10;
            if (PrivacyCheckBox.this.f70112a) {
                paint = PrivacyCheckBox.this.f70116e;
                i10 = PrivacyCheckBox.this.f70120i;
            } else {
                paint = PrivacyCheckBox.this.f70116e;
                i10 = PrivacyCheckBox.this.f70121j;
            }
            paint.setColor(i10);
            PrivacyCheckBox.this.f70116e.setStyle(Paint.Style.STROKE);
            canvas.save();
            canvas.translate(-(PrivacyCheckBox.this.f70115d / 8.0f), PrivacyCheckBox.this.f70115d / 3.0f);
            canvas.rotate(-45.0f);
            Path path = new Path();
            path.reset();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(PrivacyCheckBox.this.f70117f, 0.0f);
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (-PrivacyCheckBox.this.f70117f) / 2.0f);
            canvas.drawPath(path, PrivacyCheckBox.this.f70116e);
            canvas.restore();
        }
    }

    public class b extends a {
        private b() {
            super(PrivacyCheckBox.this, (byte) 0);
        }

        public /* synthetic */ b(PrivacyCheckBox privacyCheckBox, byte b10) {
            this();
        }

        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.a
        public final void a(Canvas canvas) {
            Paint paint;
            Paint.Style style;
            if (PrivacyCheckBox.this.f70112a) {
                paint = PrivacyCheckBox.this.f70116e;
                style = Paint.Style.FILL;
            } else {
                paint = PrivacyCheckBox.this.f70116e;
                style = Paint.Style.STROKE;
            }
            paint.setStyle(style);
            super.a(canvas);
        }

        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.a
        public final void b(Canvas canvas) {
            if (PrivacyCheckBox.this.f70112a) {
                PrivacyCheckBox.this.f70116e.setXfermode(PrivacyCheckBox.this.f70122k);
                super.b(canvas);
                PrivacyCheckBox.this.f70116e.setXfermode(null);
            }
        }
    }

    public class c extends a {
        private c() {
            super(PrivacyCheckBox.this, (byte) 0);
        }

        public /* synthetic */ c(PrivacyCheckBox privacyCheckBox, byte b10) {
            this();
        }

        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.a
        public final void a(Canvas canvas) {
            PrivacyCheckBox.this.f70116e.setStyle(Paint.Style.FILL);
            super.a(canvas);
        }
    }

    public interface d {
        void a(boolean z10);
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View.OnClickListener f70131b;

        public e(View.OnClickListener onClickListener) {
            this.f70131b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PrivacyCheckBox privacyCheckBox = PrivacyCheckBox.this;
            privacyCheckBox.f70112a = !privacyCheckBox.f70112a;
            PrivacyCheckBox.this.invalidate();
            if (PrivacyCheckBox.this.f70125n != null) {
                PrivacyCheckBox.this.f70125n.a(PrivacyCheckBox.this.f70112a);
            }
            View.OnClickListener onClickListener = this.f70131b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public PrivacyCheckBox(Context context) {
        this(context, null);
    }

    public PrivacyCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PrivacyCheckBox(Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11;
        a cVar;
        super(context, attributeSet, i10);
        float f10 = (int) ((context.getResources().getDisplayMetrics().density * 1.5f) + 0.5f);
        byte b10 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PrivacyCheckBox, i10, 0);
            this.f70118g = typedArrayObtainStyledAttributes.getColor(R.styleable.PrivacyCheckBox_bigo_ad_hcb_check_circle_color, -16736769);
            this.f70119h = typedArrayObtainStyledAttributes.getColor(R.styleable.PrivacyCheckBox_bigo_ad_hcb_uncheck_circle_color, -1);
            this.f70120i = typedArrayObtainStyledAttributes.getColor(R.styleable.PrivacyCheckBox_bigo_ad_hcb_check_hook_color, ViewCompat.MEASURED_STATE_MASK);
            this.f70121j = typedArrayObtainStyledAttributes.getColor(R.styleable.PrivacyCheckBox_bigo_ad_hcb_uncheck_hook_color, -1);
            i11 = typedArrayObtainStyledAttributes.getInt(R.styleable.PrivacyCheckBox_bigo_ad_hcb_style, 1);
            this.f70112a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PrivacyCheckBox_bigo_ad_hcb_is_check, false);
            this.f70123l = typedArrayObtainStyledAttributes.getDimension(R.styleable.PrivacyCheckBox_bigo_ad_hcb_line_width, f10);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f70118g = -16736769;
            this.f70119h = -1;
            this.f70120i = ViewCompat.MEASURED_STATE_MASK;
            this.f70121j = -1;
            this.f70123l = f10;
            this.f70112a = false;
            i11 = 1;
        }
        if (i11 != 2) {
            cVar = i11 == 1 ? new c(this, b10) : cVar;
            Paint paint = new Paint();
            this.f70116e = paint;
            paint.setAntiAlias(true);
            this.f70116e.setStyle(Paint.Style.FILL);
            this.f70116e.setColor(this.f70119h);
            this.f70116e.setStrokeWidth(this.f70123l);
            this.f70116e.setStrokeJoin(Paint.Join.ROUND);
            this.f70116e.setStrokeCap(Paint.Cap.ROUND);
            setLayerType(1, null);
            this.f70122k = new PorterDuffXfermode(PorterDuff.Mode.XOR);
            setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.view.PrivacyCheckBox.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
        cVar = new b(this, b10);
        this.f70124m = cVar;
        Paint paint2 = new Paint();
        this.f70116e = paint2;
        paint2.setAntiAlias(true);
        this.f70116e.setStyle(Paint.Style.FILL);
        this.f70116e.setColor(this.f70119h);
        this.f70116e.setStrokeWidth(this.f70123l);
        this.f70116e.setStrokeJoin(Paint.Join.ROUND);
        this.f70116e.setStrokeCap(Paint.Cap.ROUND);
        setLayerType(1, null);
        this.f70122k = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.view.PrivacyCheckBox.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }

    private static int a(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        if (mode == Integer.MIN_VALUE) {
            return Math.min(80, size);
        }
        return 80;
    }

    public final PrivacyCheckBox a(boolean z10) {
        this.f70112a = z10;
        d dVar = this.f70125n;
        if (dVar != null) {
            dVar.a(z10);
        }
        invalidate();
        return this;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer((-this.f70113b) / 2.0f, (-this.f70114c) / 2.0f, getWidth(), getHeight(), null, 31);
        canvas.translate(this.f70113b / 2, this.f70114c / 2);
        this.f70124m.a(canvas);
        this.f70124m.b(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(a(i10), a(i11));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f70113b = i10;
        this.f70114c = i11;
        this.f70115d = (Math.min(i10, i11) / 2.0f) * 0.9f;
        this.f70117f = (Math.min(this.f70113b, this.f70114c) / 2.0f) * 0.8f;
    }

    public void setOnCheckChangeListener(d dVar) {
        this.f70125n = dVar;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(new e(onClickListener));
    }
}
