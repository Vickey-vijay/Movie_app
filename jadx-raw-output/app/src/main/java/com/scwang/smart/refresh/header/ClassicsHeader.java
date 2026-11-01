package com.scwang.smart.refresh.header;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import cc.d;
import cc.f;
import com.scwang.smart.refresh.classics.ClassicsAbstract;
import com.scwang.smart.refresh.header.classics.R$id;
import com.scwang.smart.refresh.header.classics.R$layout;
import com.scwang.smart.refresh.header.classics.R$string;
import com.scwang.smart.refresh.header.classics.R$styleable;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import gc.b;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class ClassicsHeader extends ClassicsAbstract<ClassicsHeader> implements d {
    public static final int I = R$id.srl_classics_update;
    public static String J = null;
    public static String K = null;
    public static String L = null;
    public static String M = null;
    public static String N = null;
    public static String O = null;
    public static String P = null;
    public static String Q = null;
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f45066u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Date f45067v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f45068w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SharedPreferences f45069x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public DateFormat f45070y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f45071z;

    public ClassicsHeader(Context context) {
        this(context, null);
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45072a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f45072a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45072a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45072a[RefreshState.Refreshing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45072a[RefreshState.RefreshReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45072a[RefreshState.ReleaseToRefresh.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45072a[RefreshState.ReleaseToTwoLevel.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45072a[RefreshState.Loading.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ClassicsHeader(Context context, AttributeSet attributeSet) {
        FragmentManager supportFragmentManager;
        super(context, attributeSet, 0);
        this.f45066u = "LAST_UPDATE_TIME";
        this.f45071z = true;
        View.inflate(context, R$layout.srl_classics_header, this);
        ImageView imageView = (ImageView) findViewById(R$id.srl_classics_arrow);
        this.f45038f = imageView;
        TextView textView = (TextView) findViewById(R$id.srl_classics_update);
        this.f45068w = textView;
        ImageView imageView2 = (ImageView) findViewById(R$id.srl_classics_progress);
        this.f45039g = imageView2;
        this.f45037e = (TextView) findViewById(R$id.srl_classics_title);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClassicsHeader);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        new LinearLayout.LayoutParams(-2, -2).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClassicsHeader_srlTextTimeMarginTop, b.c(0.0f));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClassicsHeader_srlDrawableMarginRight, b.c(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        int i10 = R$styleable.ClassicsHeader_srlDrawableArrowSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i10, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i10, layoutParams.height);
        int i11 = R$styleable.ClassicsHeader_srlDrawableProgressSize;
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i11, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i11, layoutParams2.height);
        int i12 = R$styleable.ClassicsHeader_srlDrawableSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams2.height);
        this.f45046n = typedArrayObtainStyledAttributes.getInt(R$styleable.ClassicsHeader_srlFinishDuration, this.f45046n);
        this.f45071z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ClassicsHeader_srlEnableLastTime, this.f45071z);
        this.f52940c = dc.b.f51934i[typedArrayObtainStyledAttributes.getInt(R$styleable.ClassicsHeader_srlClassicsSpinnerStyle, this.f52940c.f51935a)];
        int i13 = R$styleable.ClassicsHeader_srlDrawableArrow;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f45038f.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i13));
        } else if (this.f45038f.getDrawable() == null) {
            bc.a aVar = new bc.a();
            this.f45041i = aVar;
            aVar.a(-10066330);
            this.f45038f.setImageDrawable(this.f45041i);
        }
        int i14 = R$styleable.ClassicsHeader_srlDrawableProgress;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f45039g.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i14));
        } else if (this.f45039g.getDrawable() == null) {
            ac.b bVar = new ac.b();
            this.f45042j = bVar;
            bVar.a(-10066330);
            this.f45039g.setImageDrawable(this.f45042j);
        }
        int i15 = R$styleable.ClassicsHeader_srlTextSizeTitle;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f45037e.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i15, b.c(16.0f)));
        }
        int i16 = R$styleable.ClassicsHeader_srlTextSizeTime;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            this.f45068w.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i16, b.c(12.0f)));
        }
        int i17 = R$styleable.ClassicsHeader_srlPrimaryColor;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            super.t(typedArrayObtainStyledAttributes.getColor(i17, 0));
        }
        int i18 = R$styleable.ClassicsHeader_srlAccentColor;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            s(typedArrayObtainStyledAttributes.getColor(i18, 0));
        }
        int i19 = R$styleable.ClassicsHeader_srlTextPulling;
        if (typedArrayObtainStyledAttributes.hasValue(i19)) {
            this.A = typedArrayObtainStyledAttributes.getString(i19);
        } else {
            String str = J;
            if (str != null) {
                this.A = str;
            } else {
                this.A = context.getString(R$string.srl_header_pulling);
            }
        }
        int i20 = R$styleable.ClassicsHeader_srlTextLoading;
        if (typedArrayObtainStyledAttributes.hasValue(i20)) {
            this.C = typedArrayObtainStyledAttributes.getString(i20);
        } else {
            String str2 = L;
            if (str2 != null) {
                this.C = str2;
            } else {
                this.C = context.getString(R$string.srl_header_loading);
            }
        }
        int i21 = R$styleable.ClassicsHeader_srlTextRelease;
        if (typedArrayObtainStyledAttributes.hasValue(i21)) {
            this.D = typedArrayObtainStyledAttributes.getString(i21);
        } else {
            String str3 = M;
            if (str3 != null) {
                this.D = str3;
            } else {
                this.D = context.getString(R$string.srl_header_release);
            }
        }
        int i22 = R$styleable.ClassicsHeader_srlTextFinish;
        if (typedArrayObtainStyledAttributes.hasValue(i22)) {
            this.E = typedArrayObtainStyledAttributes.getString(i22);
        } else {
            String str4 = N;
            if (str4 != null) {
                this.E = str4;
            } else {
                this.E = context.getString(R$string.srl_header_finish);
            }
        }
        int i23 = R$styleable.ClassicsHeader_srlTextFailed;
        if (typedArrayObtainStyledAttributes.hasValue(i23)) {
            this.F = typedArrayObtainStyledAttributes.getString(i23);
        } else {
            String str5 = O;
            if (str5 != null) {
                this.F = str5;
            } else {
                this.F = context.getString(R$string.srl_header_failed);
            }
        }
        int i24 = R$styleable.ClassicsHeader_srlTextSecondary;
        if (typedArrayObtainStyledAttributes.hasValue(i24)) {
            this.H = typedArrayObtainStyledAttributes.getString(i24);
        } else {
            String str6 = Q;
            if (str6 != null) {
                this.H = str6;
            } else {
                this.H = context.getString(R$string.srl_header_secondary);
            }
        }
        int i25 = R$styleable.ClassicsHeader_srlTextRefreshing;
        if (typedArrayObtainStyledAttributes.hasValue(i25)) {
            this.B = typedArrayObtainStyledAttributes.getString(i25);
        } else {
            String str7 = K;
            if (str7 != null) {
                this.B = str7;
            } else {
                this.B = context.getString(R$string.srl_header_refreshing);
            }
        }
        int i26 = R$styleable.ClassicsHeader_srlTextUpdate;
        if (typedArrayObtainStyledAttributes.hasValue(i26)) {
            this.G = typedArrayObtainStyledAttributes.getString(i26);
        } else {
            String str8 = P;
            if (str8 != null) {
                this.G = str8;
            } else {
                this.G = context.getString(R$string.srl_header_update);
            }
        }
        this.f45070y = new SimpleDateFormat(this.G, Locale.getDefault());
        typedArrayObtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        textView.setVisibility(this.f45071z ? 0 : 8);
        this.f45037e.setText(isInEditMode() ? this.B : this.A);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
        try {
            if ((context instanceof FragmentActivity) && (supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager()) != null && supportFragmentManager.getFragments().size() > 0) {
                w(new Date());
                return;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        this.f45066u += context.getClass().getName();
        this.f45069x = context.getSharedPreferences("ClassicsHeader", 0);
        w(new Date(this.f45069x.getLong(this.f45066u, System.currentTimeMillis())));
    }

    @Override // fc.b, ec.h
    public void c(@NonNull f fVar, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        ImageView imageView = this.f45038f;
        TextView textView = this.f45068w;
        switch (a.f45072a[refreshState2.ordinal()]) {
            case 1:
                textView.setVisibility(this.f45071z ? 0 : 8);
                break;
            case 2:
                break;
            case 3:
            case 4:
                this.f45037e.setText(this.B);
                imageView.setVisibility(8);
                return;
            case 5:
                this.f45037e.setText(this.D);
                imageView.animate().rotation(180.0f);
                return;
            case 6:
                this.f45037e.setText(this.H);
                imageView.animate().rotation(0.0f);
                return;
            case 7:
                imageView.setVisibility(8);
                textView.setVisibility(this.f45071z ? 4 : 8);
                this.f45037e.setText(this.C);
                return;
            default:
                return;
        }
        this.f45037e.setText(this.A);
        imageView.setVisibility(0);
        imageView.animate().rotation(0.0f);
    }

    @Override // com.scwang.smart.refresh.classics.ClassicsAbstract, fc.b, cc.a
    public int k(@NonNull f fVar, boolean z10) {
        if (z10) {
            this.f45037e.setText(this.E);
            if (this.f45067v != null) {
                w(new Date());
            }
        } else {
            this.f45037e.setText(this.F);
        }
        return super.k(fVar, z10);
    }

    @Override // com.scwang.smart.refresh.classics.ClassicsAbstract
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public ClassicsHeader s(@ColorInt int i10) {
        this.f45068w.setTextColor((16777215 & i10) | (-872415232));
        return (ClassicsHeader) super.s(i10);
    }

    public ClassicsHeader w(Date date) {
        this.f45067v = date;
        this.f45068w.setText(this.f45070y.format(date));
        if (this.f45069x != null && !isInEditMode()) {
            this.f45069x.edit().putLong(this.f45066u, date.getTime()).apply();
        }
        return this;
    }
}
